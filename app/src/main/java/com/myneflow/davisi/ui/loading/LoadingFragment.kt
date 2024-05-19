package com.myneflow.davisi.ui.loading

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.myneflow.davisi.R


class LoadingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Loading()
            }
        }
    }

    @Composable
    fun Loading() {
        Box(
            modifier = Modifier.fillMaxSize().background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        colorResource(R.color.gradient_end),
                        colorResource(R.color.gradient_start),
                    )
                )
            ),
            contentAlignment = Alignment.Center
        ) {
            // display drawable ic_launcher_foreground
            val image = painterResource(id = R.drawable.ic_launcher_foreground)
            Image(painter = image, contentDescription = "App Logo", modifier = Modifier.fillMaxSize())
        }
    }
}