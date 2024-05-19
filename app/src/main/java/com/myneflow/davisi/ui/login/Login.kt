package com.myneflow.davisi.ui.login

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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Login(navController: NavController) {
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
                    imageVector = Icons.Outlined.AccountCircle,
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
            onClick = { navController.navigate("home") },
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(android.graphics.Color.parseColor("#9B0E62")))
        ) {
            Text("Iniciar sesión")
            Icon(Icons.Outlined.KeyboardArrowRight, contentDescription = "Enter")
        }

        Spacer(modifier = Modifier.height(32.dp))

        // divider with text in center
        Row(verticalAlignment = Alignment.CenterVertically) {
            Divider(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp),
                color = Color.White
            )
            Text(
                text = "O",
                color = Color.White,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Divider(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp),
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { /* Handle login */ },
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(android.graphics.Color.parseColor("#f5c6ce")))
        ) {
            Text("Crear cuenta Davisi")
            Icon(Icons.Outlined.KeyboardArrowRight, contentDescription = "Enter")
        }
    }
}