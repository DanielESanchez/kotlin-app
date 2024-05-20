package com.myneflow.davisi.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.fragment.findNavController
import com.myneflow.davisi.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalEntreTodos(showBottomSheet: MutableState<Boolean>, sheetState: SheetState, scope: CoroutineScope,) {
    var amount by remember { mutableStateOf("$222.2") }
    var newContact by remember { mutableStateOf("") }
    ModalBottomSheet(
        onDismissRequest = {
            showBottomSheet.value = false
        },
        sheetState = sheetState
    ) {
        // Sheet content
        Text("Entre todos", modifier = Modifier
            .padding(16.dp)
            .padding(start = 16.dp), style = TextStyle(fontSize = 22.sp, fontWeight = FontWeight.Bold))
        Row (modifier = Modifier.fillMaxWidth().height(100.dp).padding(start = 16.dp, end = 16.dp)) {
            Column (modifier = Modifier.fillMaxWidth(0.5f).padding(end = 16.dp)) {
                Text("Monto total:", modifier = Modifier.padding(top = 8.dp, start = 30.dp, bottom = 2.dp))
                OutlinedTextField(
                    value = amount,
                    onValueChange = { amount = it },
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(40.dp))
                        .padding(bottom = 4.dp, start = 8.dp, end = 8.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent
                    ),
                    textStyle = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
            }
            Box(modifier = Modifier.width(1.dp)) {
                VerticalDivider(color = Color(0xFF9B0E62), thickness = 1.dp, modifier = Modifier.height(100.dp))
            }
            Column(modifier = Modifier.fillMaxWidth().padding(start = 16.dp)) {
                Text("Entre 2:", modifier = Modifier.padding(top = 8.dp, start = 30.dp, bottom = 2.dp))
                OutlinedTextField(
                    value = amount,
                    onValueChange = { amount = it },
                    shape = RoundedCornerShape(40.dp),
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(40.dp))
                        .padding(bottom = 4.dp, start = 8.dp, end = 8.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                        disabledBorderColor = Color.Transparent
                    ),
                    textStyle = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
            }
        }
        Text("Dividir con:", modifier = Modifier.padding(top = 8.dp, start = 30.dp, bottom = 2.dp))
        OutlinedTextField(
            value = "felipe222",
            onValueChange = { newContact = it },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth(5.5f / 7f)
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(bottom = 4.dp, start = 22.dp, end = 22.dp)
                .align(Alignment.CenterHorizontally),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                disabledBorderColor = Color.Transparent
            ),
            textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
            readOnly = true
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = newContact,
            onValueChange = { newContact = it },
            label = { Text("Nombre de usuario") },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth(5.5f / 7f)
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(bottom = 4.dp, start = 22.dp, end = 22.dp)
                .align(Alignment.CenterHorizontally),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                disabledBorderColor = Color.Transparent
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.icon_add_user),
                    contentDescription = "Universidad",
                    modifier = Modifier.padding(start = 32.dp),
                    tint = Color(android.graphics.Color.parseColor("#9B0E62"))
                )
            },
            textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Text("Fecuentes:", modifier = Modifier.padding(top = 8.dp, start = 30.dp, bottom = 2.dp))
        OutlinedTextField(
            value = "Manzanita_triste",
            onValueChange = {  },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth(5.5f / 7f)
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(bottom = 4.dp, start = 22.dp, end = 22.dp)
                .align(Alignment.CenterHorizontally),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                disabledBorderColor = Color.Transparent
            ),
            textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = "win_win11",
            onValueChange = {  },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth(5.5f / 7f)
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(bottom = 4.dp, start = 22.dp, end = 22.dp)
                .align(Alignment.CenterHorizontally),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                disabledBorderColor = Color.Transparent
            ),
            textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = "fernandaaragon_",
            onValueChange = {  },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth(5.5f / 7f)
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(bottom = 4.dp, start = 22.dp, end = 22.dp)
                .align(Alignment.CenterHorizontally),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                disabledBorderColor = Color.Transparent
            ),
            textStyle = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { scope.launch { sheetState.hide() }},
            shape = RoundedCornerShape(40.dp),
            modifier = Modifier
                .fillMaxWidth(4f / 5f)
                .height(60.dp)
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(containerColor = Color(android.graphics.Color.parseColor("#9B0E62")))
        ) {
            Text("Solicitar", modifier = Modifier.padding(end = 8.dp))
            Icon( painter = painterResource(id = R.drawable.icon_split_the_bill), contentDescription = "Enter", tint = Color.White)
        }
    }
}
