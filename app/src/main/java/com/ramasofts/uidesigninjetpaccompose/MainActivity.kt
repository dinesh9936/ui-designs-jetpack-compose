package com.ramasofts.uidesigninjetpaccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowInsetsControllerCompat
import com.ramasofts.uidesigninjetpaccompose.ui.screens.ScreenOne
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.AppNavGraph
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens.WhatsAppUI
import com.ramasofts.uidesigninjetpaccompose.ui.theme.UIDesignInJetpacComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightNavigationBars = true

        setContent {
            AppNavGraph()
        }
    }
}
