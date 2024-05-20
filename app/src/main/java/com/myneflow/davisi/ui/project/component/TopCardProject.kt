package com.myneflow.davisi.ui.project.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.myneflow.davisi.R

@Composable
fun TopCardProject(fragment: Fragment, isDataVisible: MutableState<Boolean>) {
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
