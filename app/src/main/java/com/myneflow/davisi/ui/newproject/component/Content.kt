package com.myneflow.davisi.ui.newproject.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myneflow.davisi.R

@Composable
fun ContentNewProject() {
    var projectName by remember { mutableStateOf("") }
    var projectGoal by remember { mutableStateOf("") }
    var team by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    Text(
        text = "Postular mi proyecto",
        style = TextStyle(
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp)
    )
    Text(
        text = "Recuerda postular proyectos universitarios que generen un impacto positivo a la sociedad",
        style = TextStyle(
            color = Color.Black,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        ),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 4.dp)
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = RoundedCornerShape(40.dp),
            color = Color.White,
            shadowElevation = 4.dp,
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .padding(bottom = 4.dp, top = 8.dp)
        ) {
            OutlinedTextField(
                value = projectName,
                onValueChange = { projectName = it },
                label = { Text("Nombre del proyecto", modifier = Modifier.padding(start = 16.dp)) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                shape = RoundedCornerShape(40.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_lightbulb),
                        contentDescription = "Nombre del proyecto",
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
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = RoundedCornerShape(40.dp),
            color = Color.White,
            shadowElevation = 4.dp,
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .padding(bottom = 4.dp, top = 8.dp)
        ) {
            OutlinedTextField(
                value = projectGoal,
                onValueChange = { projectGoal = it },
                label = { Text("Meta $", modifier = Modifier.padding(start = 16.dp)) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                shape = RoundedCornerShape(40.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_set_goal),
                        contentDescription = "Meta",
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
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = RoundedCornerShape(40.dp),
            color = Color.White,
            shadowElevation = 4.dp,
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .padding(bottom = 4.dp, top = 8.dp)
        ) {
            OutlinedTextField(
                value = team,
                onValueChange = { team = it },
                label = { Text("Participantes", modifier = Modifier.padding(start = 16.dp)) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                shape = RoundedCornerShape(40.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_people),
                        contentDescription = "Meta",
                        modifier = Modifier
                            .padding(start = 32.dp)
                            .height(30.dp)
                            .width(31.dp),
                        tint = Color(android.graphics.Color.parseColor("#9B0E62"))
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent
                )
            )
        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = RoundedCornerShape(40.dp),
            color = Color.White,
            shadowElevation = 4.dp,
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .padding(bottom = 4.dp, top = 8.dp)
        ) {
            OutlinedTextField(
                value = description,
                onValueChange = { description = it },
                label = { Text("Descripcion", modifier = Modifier.padding(start = 16.dp)) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                shape = RoundedCornerShape(40.dp),
                leadingIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_doc),
                        contentDescription = "Meta",
                        modifier = Modifier
                            .padding(start = 32.dp)
                            .height(30.dp)
                            .width(31.dp),
                        tint = Color(android.graphics.Color.parseColor("#9B0E62"))
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent,
                    disabledBorderColor = Color.Transparent
                )
            )
        }
    }

    Spacer(modifier = Modifier.height(24.dp))
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = { },
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B0E62))
        ) {
            Text("Postular")
            Icon(Icons.AutoMirrored.Outlined.KeyboardArrowRight, contentDescription = "Enter")
        }
    }

}
