package com.myneflow.davisi.ui.home.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.myneflow.davisi.R
import com.myneflow.davisi.ui.home.HomeFragment
import com.myneflow.davisi.ui.nav.AppBarConf

@Composable
fun MainButtons(fragment: Fragment, showBottomSheet: MutableState<Boolean>, ) {
    val navController = findNavController(fragment)
    val backgroundImage = painterResource(id = R.drawable.top_shape)
    Box {
        Row(
            modifier = Modifier
                .height(550.dp)
                .align(Alignment.BottomCenter)
        ) {
            Button(
                onClick = { showBottomSheet.value = true
                          Log.e("MainButtons", "Button 1 clicked") },
                elevation = ButtonDefaults.elevatedButtonElevation(32.dp),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.height(80.dp).width(100.dp).padding(end = 8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Column(Modifier.fillMaxWidth()) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_send),
                        contentDescription = "",
                        tint = Color(0xFF9B0E62),
                        modifier = Modifier.width(50.dp).align(Alignment.CenterHorizontally)
                    )
                    Text(
                        "ISI Transfer",
                        style = TextStyle(fontSize = 8.sp),
                        color = Color(0xFF9B0E62),
                        modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 4.dp)
                    )
                }
            }

            Button(
                onClick = { },
                elevation = ButtonDefaults.elevatedButtonElevation(16.dp),
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.height(80.dp).width(100.dp).padding(end = 8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.White)
            ) {
                Column(Modifier.fillMaxWidth()) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_entre_todos),
                        contentDescription = "",
                        tint = Color(0xFF9B0E62),
                        modifier = Modifier.width(50.dp).align(Alignment.CenterHorizontally)
                    )
                    Text(
                        "Entre todos",
                        style = TextStyle(fontSize = 8.sp),
                        color = Color(0xFF9B0E62),
                        modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 4.dp)
                    )
                }
            }

            Button(
                onClick = { },
                elevation = ButtonDefaults.elevatedButtonElevation(16.dp),
                modifier = Modifier.height(80.dp).width(100.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF0B8C9))
            ) {
                Icon(Icons.Default.Add, contentDescription = "", tint = Color(0xFF9B0E62))
            }
        }
    }
}
