package com.sopa.projectecafeteriadiaz.login

class LoginProvider {
    companion object{
        fun checkUser(usuari: String,contrasenya: String): Boolean {

            val value = LoginModel (
                user = usuari,
                password = contrasenya
            )
            return logins.contains(value)

        }
        private val logins = listOf(
            LoginModel(
                user = "Enaitz",
                password = "1111"
            ),LoginModel(
                user = "dani",
                password = "1111"
            ),LoginModel(
                user = "a",
                password = "1111"
            ),
        )
    }
}