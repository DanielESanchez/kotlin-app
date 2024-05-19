package com.myneflow.davisi.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.myneflow.davisi.R
import com.myneflow.davisi.ui.home.HomeFragment
import com.myneflow.davisi.ui.nav.BottomAppBarWithScaffoldM3

    @Composable
    fun TopCard(fragment: HomeFragment) {
        val navController = findNavController(fragment)
        val backgroundImage = painterResource(id = R.drawable.top_shape)
        val gradient = Brush.linearGradient(
            colors = listOf(
                Color(0xFF820A02),
                Color(0xFF950FFF),
            ),
            start = Offset(0f, 0f),
            end = Offset(1000f, 1000f)
        )
        Box(
            modifier = Modifier
                .height(300.dp),
        ) {
            Image(
                painter = backgroundImage,
                contentDescription = "Background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .align(Alignment.TopStart)
                    .clip(RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp))
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(top = 80.dp, start = 16.dp, end = 16.dp, bottom = 50.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.elevatedCardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(brush = gradient)
                ) {
                    Column {
                        Row {
                            Text(
                                text = "Gerardo_Siman15",
                                modifier = Modifier.padding(16.dp),
                                color = Color.White,
                                style = TextStyle(fontSize = 30.sp, fontFamily = FontFamily(Font(R.font.poetsen_one_regular)))
                            )
                        }

                        Row {
                            Text(
                                text = "Puntos ISI: 1000",
                                modifier = Modifier.padding(top = 16.dp, start = 16.dp),
                                color = Color.White,
                                style = TextStyle(fontSize = 20.sp, fontFamily = FontFamily(Font(R.font.poetsen_one_regular)))
                            )
                        }


                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "$599.72",
                                modifier = Modifier.padding(16.dp).weight(1f),
                                color = Color.White,
                                style = TextStyle(fontSize = 20.sp, fontFamily = FontFamily(Font(R.font.poetsen_one_regular)))
                            )

                            IconButton(onClick = { /*TODO*/ }, modifier = Modifier) {
                                Icon(Icons.Rounded.AddCircle, contentDescription = "Location", tint = Color.White)
                            }
                        }
                    }
                }
            }
            BottomAppBarWithScaffoldM3("Home", navController)
        }
    }
