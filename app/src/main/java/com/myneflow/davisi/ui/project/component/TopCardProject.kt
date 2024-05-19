package com.myneflow.davisi.ui.project.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
fun TopCardProject(fragment: Fragment, isDataVisible: MutableState<Boolean>) {
    val navController = findNavController(fragment)
    val backgroundImage = painterResource(id = R.drawable.top_shape)

    Box(
        modifier = Modifier
            .height(75.dp),
    ) {
        Image(
            painter = backgroundImage,
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(75.dp)
                .align(Alignment.TopStart)
                .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)),

        )
    }
}
