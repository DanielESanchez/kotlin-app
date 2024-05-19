package com.myneflow.davisi.ui.nav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.myneflow.davisi.R

@Composable
fun TopAppBarWithScaffoldM3() {
    Scaffold (
        containerColor = Color.Transparent,
        topBar = {
            TopBar()
        },
        content = { padding ->
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(padding).background(Color.Transparent),
                contentPadding = PaddingValues(16.dp)
            ){

            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){
    TransparentTopAppBar(
        title = { Text("¡Hola Gerardo!", color = Color.White, style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)) },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Menu, contentDescription = "menu", tint = Color.White)
            }
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(painter = painterResource(R.drawable.icon_eye), contentDescription = "Hide data", tint = Color.White)
            }
        }
    )
}

@Composable
fun TransparentTopAppBar(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .height(56.dp)
            .padding(top = 35.dp), // Default TopAppBar height
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            navigationIcon?.invoke()

            Box(modifier= Modifier.padding(start = 8.dp)) {
                title()
            }
        }

        Row(
            modifier = Modifier.fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            actions()
        }
    }
}