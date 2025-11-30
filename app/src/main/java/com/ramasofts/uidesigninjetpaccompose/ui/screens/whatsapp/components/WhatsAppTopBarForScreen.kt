package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components

import androidx.compose.runtime.Composable

@Composable
fun WhatsAppTopBarForScreen(selectedTab: Int) {

    when (selectedTab) {

        0 -> WhatsAppTopBar(
            title = "WhatsApp",
            showQR = true,
            showCamera = true,
            showMenu = true
        )

        1 -> WhatsAppTopBar(
            title = "Updates",
            showQR = false,
            showCamera = false,
            showMenu = true,
            showSearch = true
        )

        2 -> WhatsAppTopBar(
            title = "Communities",
            showQR = false,
            showCamera = false,
            showMenu = true
        )

        3 -> WhatsAppTopBar(
            title = "Calls",
            showQR = false,
            showCamera = false,
            showMenu = true,
            showSearch = true
        )
    }
}
