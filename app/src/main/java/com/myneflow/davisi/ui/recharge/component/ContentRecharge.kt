package com.myneflow.davisi.ui.recharge.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.myneflow.davisi.R

@Composable
fun ContentRecharge() {
    Text(text = "Medios Digitales",
        modifier = Modifier.padding(start = 16.dp, top = 16.dp),
        style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold), color = Color(0xFF9B0E62)
    )
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(end = 32.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ) {
                Icon(painter = painterResource(id = R.drawable.icon_ask_transfer),
                    contentDescription = "Solicitar transferencia icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Solicitar", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                    Text("transferencia", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(start = 16.dp, end = 16.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ){
                Icon(painter = painterResource(id = R.drawable.icon_paypal),
                    contentDescription = "Solicitar paypal icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Paypal", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
    }


    // Second buttons
    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(end = 32.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ) {
                Icon(painter = painterResource(id = R.drawable.icon_credit_card),
                    contentDescription = "Tarjeta de credito o debito icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Tarjeta de débito o crédito", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(start = 16.dp, end = 16.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ){
                Icon(painter = painterResource(id = R.drawable.icon_qr),
                    contentDescription = "Solicitar por QR icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Recibe", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                    Text("con QR", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
    }

    // Medios Fisicos
    Text(text = "Medios Fisicos",
        modifier = Modifier.padding(start = 16.dp, top = 16.dp),
        style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold), color = Color(0xFF9B0E62)
    )

    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(end = 32.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ) {
                Icon(painter = painterResource(id = R.drawable.icon_store),
                    contentDescription = "Comercios icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Ver Comercios", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ){
                Icon(painter = painterResource(id = R.drawable.icon_location_double),
                    contentDescription = "Recarga cerca de la U icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Recarga cerca", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                    Text("de tu U", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
    }

    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(end = 32.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ) {
                Icon(painter = painterResource(id = R.drawable.icon_receive),
                    contentDescription = "Recibe depositos icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Recibe depósitos", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 4.dp),
//                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ){
                Icon(painter = painterResource(id = R.drawable.icon_receive_qr),
                    contentDescription = "Solicitar por QR icono",
                    tint = Color(0xFF9B0E62),
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Recibe", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                    Text("con QR", color = Color(0xFF9B0E62), style = TextStyle(fontSize = 8.sp))
                }
            }
        }
    }
}