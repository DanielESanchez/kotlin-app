package com.myneflow.davisi.ui.payuhistory.component

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
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.myneflow.davisi.R

@Composable
fun ContentPayUniversityHistory(navController: NavController) {
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
                            .background(Color.White)
                            .padding(6.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("$125.00", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.SemiBold))
                        Text("Pago de mensualidad", style = TextStyle(fontSize = 16.sp))
                        Text("Abril", style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.SemiBold))
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
            onClick = { navController.navigate(R.id.payUniversityFragment) },
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .fillMaxWidth(3f / 5f)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B0E62))
        ) {
            Text("Agregar PDF")
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
                Button(onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(40.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF0B8C9))
                ) {
                    Card {
                        Row (modifier = Modifier.background(Color(0xFFF0B8C9))) {
                            Text("CICLO 1 - 2024",
                                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold),
                                color = Color(0xFF9B0E62)
                            )
//                            Spacer(modifier = Modifier.weight(1f))
                            Icon(Icons.Default.KeyboardArrowDown, contentDescription = "")
                        }
                    }
                }
            }

            Column(modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 16.dp)) {
                Row(modifier = Modifier.fillMaxWidth().padding(start = 16.dp, top = 4.dp)) {
                    Column (modifier = Modifier.weight(1f)) {
                        Text(text = "ENERO", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        Text(text = "2024", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal))
                    }
                    Column (modifier = Modifier.weight(1f)) {
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(40.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)) {
                            Text(text = "PAGADO", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        }
                    }
                }
            }

            Column(modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 16.dp)) {
                Row(modifier = Modifier.fillMaxWidth().padding(start = 16.dp, top = 4.dp)) {
                    Column (modifier = Modifier.weight(1f)) {
                        Text(text = "FEBRERO", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        Text(text = "2024", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal))
                    }
                    Column (modifier = Modifier.weight(1f)) {
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(40.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)) {
                            Text(text = "PAGADO", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        }
                    }
                }
            }

            Column(modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 16.dp)) {
                Row(modifier = Modifier.fillMaxWidth().padding(start = 16.dp, top = 4.dp)) {
                    Column (modifier = Modifier.weight(1f)) {
                        Text(text = "MARZO", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        Text(text = "2024", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal))
                    }
                    Column (modifier = Modifier.weight(1f)) {
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(40.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)) {
                            Text(text = "PAGADO", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        }
                    }
                }
            }

            Column(modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 16.dp)) {
                Row(modifier = Modifier.fillMaxWidth().padding(start = 16.dp, top = 4.dp)) {
                    Column (modifier = Modifier.weight(1f)) {
                        Text(text = "ABRIL", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        Text(text = "2024", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal))
                    }
                    Column (modifier = Modifier.weight(1f)) {
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(40.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B0E62))) {
                            Text(text = "PAGAR", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        }
                    }
                }
            }

            Column(modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 16.dp)) {
                Row(modifier = Modifier.fillMaxWidth().padding(start = 16.dp, top = 4.dp)) {
                    Column (modifier = Modifier.weight(1f)) {
                        Text(text = "MAYO", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        Text(text = "2024", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Normal))
                    }
                    Column (modifier = Modifier.weight(1f)) {
                        Button(onClick = { /*TODO*/ },
                            shape = RoundedCornerShape(40.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B0E62))) {
                            Text(text = "PAGAR", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.SemiBold))
                        }
                    }
                }
            }
        }
    }

}
