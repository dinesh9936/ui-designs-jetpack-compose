package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.WhatsAppBottomBar
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.WhatsAppTopBarForScreen

@Composable
fun WhatsAppUI() {
    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = { WhatsAppTopBarForScreen(
            selectedTab = selectedTab
        ) },
        bottomBar = {
            WhatsAppBottomBar(
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it }
            )
        }
    ) { paddingValues ->

        Column(modifier = Modifier.padding(paddingValues)) {
            when (selectedTab) {
                0 -> ChatListScreen()
                1 -> StatusScreen()
                3 -> CallsScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewWhatsAppUI() {
    WhatsAppUI()
}
