package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.ChatBox
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.ChatScreenAppBar

@Composable
fun ChatScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            ChatScreenAppBar(
                onTitleClicked = {},
                onBackClicked = {},
                onAudioCallClicked = {},
                onVideoCallClicked = {},
                onMenuClicked = {},
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {

            // Chat Messages List (Later you will add a LazyColumn here)
            Spacer(modifier = Modifier.weight(1f))

            // ChatBox at bottom
            ChatBox()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowChatScreenPreview(){
    ChatScreen()
}