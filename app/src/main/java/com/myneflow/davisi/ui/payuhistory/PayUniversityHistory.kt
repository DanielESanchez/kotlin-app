package com.myneflow.davisi.ui.payuniversity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.myneflow.davisi.ui.nav.AppBarConf
import com.myneflow.davisi.ui.payuhistory.component.ContentPayUniversityHistory
import com.myneflow.davisi.ui.payuniversity.component.ContentPayUniversity
import com.myneflow.davisi.ui.project.component.TopCardProject

class PayUniversityHistoryFragment : Fragment() {

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

                TopCardProject(this@PayUniversityHistoryFragment, isDataVisible)
                AppBarConf("Send", navController, onIconClick = {
                    isDataVisible.value = !isDataVisible.value
                }, isDataVisible,
                    sheetState=sheetState,
                    scope = scope,
                    showBottomSheet = showBottomSheet,
                    title = "Pagar la U",
                    hideEye = true) { padding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp)
                            .background(Color.Transparent)
                    ) {
                        ContentPayUniversityHistory(navController)
                    }
                }
            }
        }
    }
}