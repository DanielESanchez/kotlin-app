package com.myneflow.davisi.ui.project

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
import com.myneflow.davisi.ui.project.component.Description
import com.myneflow.davisi.ui.project.component.TitleCard
import com.myneflow.davisi.ui.project.component.TopCardProject


class ProjectFragment : Fragment() {

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

                TopCardProject(this@ProjectFragment, isDataVisible)
                AppBarConf("Send", navController, onIconClick = {
                    isDataVisible.value = !isDataVisible.value
                }, isDataVisible,
                    sheetState=sheetState,
                    scope = scope,
                    showBottomSheet = showBottomSheet,
                    title = "Proyectos sociales") { padding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp)
                            .background(Color.Transparent)
                    ) {
                        TitleCard()
                        Description()
                    }
                }
            }
        }


    }
}