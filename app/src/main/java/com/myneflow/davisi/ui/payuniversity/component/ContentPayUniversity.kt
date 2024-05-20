package com.myneflow.davisi.ui.payuniversity.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.navigation.NavController
import com.myneflow.davisi.R

@Composable
fun ContentPayUniversity(navController: NavController) {
    var projectName by remember { mutableStateOf("") }

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
                .align(Alignment.CenterHorizontally)
                .background(Color.White)
        ) {
            TextField(
                value = projectName,
                onValueChange = { projectName = it },
//                label = { Text("Nombre del proyecto", modifier = Modifier.padding(start = 16.dp)) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier.background(Color.White),
                leadingIcon = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .background(Color.White),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_upload),
                            contentDescription = "Nombre del proyecto",
//                            modifier = Modifier.padding(start = 32.dp),
                        )
                        Text("Agregar tu talonario", style = TextStyle(fontSize = 12.sp))
                        Text("en PDF", style = TextStyle(fontSize = 12.sp))
                        Text("UCA", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                    }
                },
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.White
                ),
                readOnly = true
            )
        }
    }

    Spacer(modifier = Modifier.height(16.dp))
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = { navController.navigate(R.id.payUniversityHistoryFragment) },
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .fillMaxWidth(3f / 5f)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B0E62))
        ) {
            Text("Agregar")
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
    Column {
        Card(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            elevation = CardDefaults.elevatedCardElevation(4.dp)) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                IconButton(onClick = {  }) {
                    Icon(Icons.Default.KeyboardArrowDown, contentDescription = "")
                }
            }
        }
    }

}
