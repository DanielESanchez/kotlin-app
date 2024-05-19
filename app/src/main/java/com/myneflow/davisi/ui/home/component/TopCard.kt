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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.myneflow.davisi.R
import com.myneflow.davisi.ui.home.HomeFragment
import com.myneflow.davisi.ui.nav.AppBarConf
import com.myneflow.davisi.ui.nav.TopBar

@Composable
    fun TopCard(fragment: HomeFragment, isDataVisible: MutableState<Boolean>) {
        val navController = findNavController(fragment)
        val backgroundImage = painterResource(id = R.drawable.top_shape)

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
                    .padding(top = 100.dp, start = 40.dp, end = 40.dp, bottom = 25.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.elevatedCardElevation(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.card_1),
                        contentDescription = "Background",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.fillMaxSize()
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.BottomEnd)
                    ) {
                        Row {
                            Text(
                                text = "Gerardo_Siman15",
                                modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 5.dp),
                                color = Color(0xFF7B38AF),
                                style = TextStyle(fontSize = 25.sp, fontWeight = FontWeight.Bold)
                            )
                        }

                        Row {
                            Text(
                                text = "Puntos ISI",
                                modifier = Modifier.padding(start = 16.dp, bottom = 5.dp),
                                color = Color(0xFF7B38AF),
                                style = TextStyle(fontSize = 15.sp)
                            )
                        }

                        Row {
                            Text(
                                text = if (isDataVisible.value) "500" else "***",
                                modifier = Modifier.padding(start = 16.dp),
                                color = Color(0xFF7B38AF),
                                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
                            )
                        }

                        Row(
                            modifier = Modifier.fillMaxSize(),
                            verticalAlignment = Alignment.Bottom,
                            horizontalArrangement = Arrangement.Absolute.Right,
                        ) {
                            Column(modifier = Modifier.padding(bottom = 16.dp, end = 4.dp)) {
                                Text(
                                    text = "Saldo actual",
                                    modifier = Modifier
                                        .padding(end = 16.dp),
                                    color = Color(0xFF7B38AF),
                                    style = TextStyle(fontSize = 15.sp)
                                )
                                Text(
                                    text = if (isDataVisible.value) "$599.72" else "***",
                                    modifier = Modifier
                                        .padding(end = 16.dp),
                                    color = Color(0xFF7B38AF),
                                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
                                )
                            }
                        }
                    }
                }
            }
            AppBarConf("Home", navController, onIconClick = {
                Log.e("TopCard", "IconButton clicked in TopCard")
                Log.e("TopBar", "onIconClick")
                isDataVisible.value = !isDataVisible.value
            })
        }
    }
