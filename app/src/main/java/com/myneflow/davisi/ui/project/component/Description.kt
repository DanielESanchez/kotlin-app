package com.myneflow.davisi.ui.project.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Description() {
    Text(
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus nec nisl luctus tincidunt vitae ac nulla. Nulla facilisi. Nulla nec purus nec nisl luctus tincidunt vitae ac nulla. Nulla facilisi.",
        style = TextStyle(
            color = Color.Black,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        ),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp)
    )
    Text(
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla nec purus nec nisl luctus tincidunt vitae ac nulla. Nulla facilisi. Nulla nec purus nec nisl luctus tincidunt vitae ac nulla. Nulla facilisi.",
        style = TextStyle(
            color = Color.Black,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        ),
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 4.dp)
    )

    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)) {
            Text(
                text = "Pedro Martinez - 5to año",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                ),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 12.dp)
            )
            Text(
                text = "Ingenieria Ambiental",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                ),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)
            )
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Maria Martinez - 5to año",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                ),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 12.dp)
            )
            Text(
                text = "Ingenieria Ambiental",
                style = TextStyle(
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                ),
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 4.dp)
            )
        }
    }

    Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
        Column(modifier = Modifier.fillMaxWidth(0.5f)) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .fillMaxWidth(4f / 5f)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                border = BorderStroke(1.dp, Color(0xFF9B0E62))
            ) {
                Text("Invitar", color = Color(0xFF9B0E62))
            }
        }
        Column(modifier = Modifier.fillMaxWidth()) {
            Button(
                onClick = { },
                shape = RoundedCornerShape(40.dp),
                modifier = Modifier
                    .fillMaxWidth(4f / 5f)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF9B0E62))
            ) {
                Text("Colaborar")
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp).padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Postular mi proyecto",
            style = TextStyle(
                color = Color(0xFF9B0E62),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        )
        HorizontalDivider(
            modifier = Modifier.width(160.dp),
            thickness = 1.dp,
            color = Color(0xFF9B0E62),
        )
    }
}
