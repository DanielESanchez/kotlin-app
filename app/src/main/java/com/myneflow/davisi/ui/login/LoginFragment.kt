package com.myneflow.davisi.ui.login


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.fragment.findNavController
import com.myneflow.davisi.R

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.e("LoginFragment", "onCreateView")
        return ComposeView(requireContext()).apply {
            setContent {
                Login()
            }
        }
    }

    @Composable
    fun Login() {
        Column(
            modifier = Modifier
                .fillMaxSize().background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(android.graphics.Color.parseColor("#e1b6cf")),
                            Color(android.graphics.Color.parseColor("#f0828b")),
                        )
                    )
                ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var username by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            var carnet by remember { mutableStateOf("") }
            var email by remember { mutableStateOf("") }

            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("Nombre de usuario", modifier = Modifier.padding(start = 16.dp)) },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .fillMaxWidth(4f / 5f)
                    .background(Color.White, shape = RoundedCornerShape(40.dp))
                    .padding(bottom = 4.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = "Username",
                        modifier = Modifier.padding(start = 32.dp),
                        tint = Color(android.graphics.Color.parseColor("#9B0E62"))
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = carnet,
                onValueChange = { carnet = it },
                label = { Text("Carnet de universidad", modifier = Modifier.padding(start = 16.dp)) },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .fillMaxWidth(4f / 5f)
                    .background(Color.White, shape = RoundedCornerShape(40.dp))
                    .padding(bottom = 4.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = "Username",
                        modifier = Modifier.padding(start = 32.dp),
                        tint = Color(android.graphics.Color.parseColor("#9B0E62"))
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Correo de universidad", modifier = Modifier.padding(start = 16.dp)) },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .fillMaxWidth(4f / 5f)
                    .background(Color.White, shape = RoundedCornerShape(40.dp))
                    .padding(bottom = 4.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = "Username",
                        modifier = Modifier.padding(start = 32.dp),
                        tint = Color(android.graphics.Color.parseColor("#9B0E62"))
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Contraseña", modifier = Modifier.padding(start = 16.dp)) },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .fillMaxWidth(4f / 5f)
                    .background(Color.White, shape = RoundedCornerShape(40.dp))
                    .padding(bottom = 4.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = "Password",
                        modifier = Modifier.padding(start = 32.dp),
                        tint = Color(android.graphics.Color.parseColor("#9B0E62"))
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {
                    findNavController().navigate(R.id.homeFragment) },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .fillMaxWidth(4f / 5f)
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(android.graphics.Color.parseColor("#9B0E62")))
            ) {
                Text("Iniciar sesión")
                Icon(Icons.Outlined.KeyboardArrowRight, contentDescription = "Enter")
            }

        }
    }
}