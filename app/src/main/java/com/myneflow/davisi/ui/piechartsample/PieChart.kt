package com.myneflow.davisi.ui.home

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.myneflow.davisi.R
import com.myneflow.davisi.ui.nav.BottomAppBarWithScaffoldM3

class PieChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Home()
            }
        }
    }

    @Composable
    fun Home() {
        val navController = findNavController()
        val pieChart = remember { createPieChart() }
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            PieChartView(pieChart)
            BottomAppBarWithScaffoldM3("Home", navController)
        }
    }

    private fun createPieChart(): PieChart {
        val pieChart = PieChart(ContextThemeWrapper(context, R.style.Theme_Davisi))
        val entries = ArrayList<PieEntry>().apply {
            add(PieEntry(18f, "Green"))
            add(PieEntry(22f, "Yellow"))
            add(PieEntry(30f, "Red"))
        }

        val dataSet = PieDataSet(entries, "Colors").apply {
            colors = listOf(
                ContextCompat.getColor(requireContext(), R.color.gradient_end),
                ContextCompat.getColor(requireContext(), R.color.yellow),
                ContextCompat.getColor(requireContext(), R.color.red)
            )
        }

        val data = PieData(dataSet)
        pieChart.data = data

        // Additional configurations
        pieChart.isDrawHoleEnabled = true
        pieChart.setUsePercentValues(true)
        pieChart.setEntryLabelTextSize(12f)
        pieChart.setEntryLabelColor(R.color.black)
        pieChart.centerText = "Colors"
        pieChart.setCenterTextSize(24f)
        pieChart.description.isEnabled = false

        pieChart.invalidate() // refresh
        return pieChart
    }

    @Composable
    fun PieChartView(pieChart: PieChart) {
        AndroidView(
            { pieChart },
            Modifier
                .height(200.dp)
                .width(200.dp)
        ) { view ->
            view.invalidate()
        }
    }
}