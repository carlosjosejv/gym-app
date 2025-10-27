package com.sena.login

import android.app.Activity
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AuthViewModel : ViewModel() {

    private val auth = FirebaseAuth.getInstance()

    private var _currentUser =
        MutableStateFlow(auth.currentUser)

    val currentUser: StateFlow<FirebaseUser?> = _currentUser

    // Crear cuenta recibe como parametros
    // la actividad (activity)
    // el correo (email)
    // y la contraseña (password)
    fun createAccount(
        activity: Activity,
        email: String,
        password: String) {

        auth.createUserWithEmailAndPassword(
            email,
            password)
            .addOnCompleteListener(activity){ task ->
                // Verificamos si la tarea de
                // crear usuario fue exitosa o no
                if(task.isSuccessful){
                    _currentUser.value = auth.currentUser

                    Toast.makeText(activity,
                        "Inicio de Sesión Exitoso",
                        Toast.LENGTH_SHORT).show()

                }else{

                    val error = task.exception?.message

                    Toast.makeText(activity,
                        error,
                        Toast.LENGTH_SHORT).show()

                }
        }

    }

    // Funcion para iniciar sesion
    // usuarios ya existentes
    // recibe como parametros
    // la actividad, contraseña y correo
    fun signIn(activity: Activity,
               email: String,
               password: String){

        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(activity) { task ->
                if (task.isSuccessful) {
                    _currentUser.value = auth.currentUser

                    Toast.makeText(activity,
                        "Inicio de sesión exitoso",
                        Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(activity,
                        task.exception?.message,
                        Toast.LENGTH_SHORT).show()
                }
            }
    }

}