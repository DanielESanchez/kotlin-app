package com.myneflow.davisi.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.myneflow.davisi.R
import com.myneflow.davisi.ui.home.component.Carousel
import com.myneflow.davisi.ui.home.component.MainButtons
import com.myneflow.davisi.ui.home.component.TopCard
import com.myneflow.davisi.ui.nav.AppBarConf


class HomeFragment : Fragment() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val navController = findNavController(this)
        return ComposeView(requireContext()).apply {
            setContent {
                val isDataVisible = remember { mutableStateOf(true) }
                val sheetState = rememberModalBottomSheetState()
                val scope = rememberCoroutineScope()
                val showBottomSheet = remember { mutableStateOf(false) }

                TopCard(this@HomeFragment, isDataVisible)
                val cardImages = listOf(
                    R.drawable.bg_signup,
                    R.drawable.card_1,
                    R.drawable.shape,
                )
                AppBarConf("Home", navController, onIconClick = {
                    isDataVisible.value = !isDataVisible.value
                }, isDataVisible, sheetState=sheetState, scope = scope, showBottomSheet = showBottomSheet) { padding ->
                    Column(
                        modifier = Modifier.fillMaxSize().padding(padding)
                            .background(Color.Transparent)
                    ) {

                        Spacer(modifier = Modifier.height(16.dp))
                        Carousel(cardImages)
                    }
                }
                MainButtons(fragment = this@HomeFragment, showBottomSheet = showBottomSheet)
            }
        }


    }
}