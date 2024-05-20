package com.myneflow.davisi.ui.nav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.myneflow.davisi.R
import com.myneflow.davisi.ui.home.component.ModalEntreTodos
import com.myneflow.davisi.ui.home.component.ModalTransfer
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarConf(actualRoute:String = "Home",
               navController: NavController,
               onIconClick: () -> Unit,
               isDataVisible: MutableState<Boolean>,
               sheetState:SheetState,
               scope: CoroutineScope,
               showBottomSheet: MutableState<Boolean>,
               title: String = "¡Hola, Gerardo!",
               hideEye:Boolean = false,
               sheetStateEntreTodos:SheetState = rememberModalBottomSheetState(),
               scopeEntreTodos:CoroutineScope = rememberCoroutineScope(),
               showBottomSheetEntreTodos:MutableState<Boolean> = remember { mutableStateOf(false)},
               content: @Composable (PaddingValues) -> Unit,
){
    Scaffold (
        containerColor = Color.Transparent,
        topBar = {
            TopBar(onIconClick, isDataVisible, title, hideEye)
        },
        bottomBar = {
            BottomAppBar(actualRoute, navController)
        },
        content = { padding ->
            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .padding(padding)) {
                item { content(padding) }
            }
            if (showBottomSheet.value) {
                ModalTransfer(showBottomSheet = showBottomSheet, sheetState = sheetState, scope = scope)
            }
            if(showBottomSheetEntreTodos.value){
                ModalEntreTodos(showBottomSheet = showBottomSheetEntreTodos, sheetState = sheetStateEntreTodos, scope = scopeEntreTodos)
            }
        }
    )
}

@Composable
fun BottomAppBar(actualRoute:String, navController: NavController) {
    BottomAppBar (
        actions = {
            IconButton(onClick = { navController.navigate(R.id.homeFragment) }, modifier = Modifier.weight(1f)) {
                val isHome = (actualRoute == "Home")
                val color = "#9B0E62"
                if(isHome)
                    Icon(painter = painterResource(id = R.drawable.icon_home), contentDescription = "Home", tint = Color(android.graphics.Color.parseColor(color)))
                else
                    Icon(painter = painterResource(id = R.drawable.icon_home), contentDescription = "Home")
            }
            IconButton( onClick = { /*navController.navigate(R.id.projectFragment)*/
                navController.navigate(R.id.payUniversityFragment) },
                modifier = Modifier.weight(1f)) {
                val isSend = (actualRoute == "Send")
                val color = "#9B0E62"
                if(isSend)
                    Icon(painter = painterResource(id = R.drawable.nav_entre_todos), contentDescription = "Send", tint = Color(android.graphics.Color.parseColor(color)))
                else
                    Icon(painter = painterResource(id = R.drawable.nav_entre_todos), contentDescription = "Send")
            }
            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                val isCart = (actualRoute == "Cart")
                val color = "#9B0E62"
                if(isCart)
                    Icon(painter = painterResource(id = R.drawable.nav_comercios), contentDescription = "Cart", tint = Color(android.graphics.Color.parseColor(color)))
                else
                    Icon(painter = painterResource(id = R.drawable.nav_comercios), contentDescription = "Cart")
            }
            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.weight(1f)) {
                val isNotification = (actualRoute == "Notification")
                val color = "#9B0E62"
                if(isNotification)
                    Icon(painter = painterResource(id = R.drawable.nav_recargar), contentDescription = "Notification", tint = Color(android.graphics.Color.parseColor(color)))
                else
                    Icon(painter = painterResource(id = R.drawable.nav_recargar), contentDescription = "Notification")
            }
        }
    )
}