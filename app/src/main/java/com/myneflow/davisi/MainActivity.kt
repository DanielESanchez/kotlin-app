package com.myneflow.davisi

import android.app.Activity
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowInsetsController
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import com.myneflow.davisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration : AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.navigation_activity)

        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment? ?: return

        val navController = host.navController

        appBarConfiguration = AppBarConfiguration(navController.graph)
        transparentStatusBar(this)
    }
}

fun transparentStatusBar(activity: Activity) {
    val window: Window = activity.window
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

    window.statusBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
    window.setBackgroundDrawableResource(R.color.white)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

    window.statusBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
    window.setBackgroundDrawableResource(R.color.white)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        window.insetsController?.setSystemBarsAppearance(
            0,
            WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
        )
    } else {
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = 0
    }
}