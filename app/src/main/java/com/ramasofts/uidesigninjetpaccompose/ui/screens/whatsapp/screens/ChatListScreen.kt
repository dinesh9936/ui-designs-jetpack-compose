package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.ChatItem
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.ChatScreenSearchView

@Composable
fun ChatListScreen(
    onChatClicked: (String) -> Unit
) {
    Column {
        ChatScreenSearchView()

        LazyColumn {
            items(15) { index ->
                ChatItem(
                    name = "Friend $index",
                    message = "Hello!",
                    time = "10:2$index AM",
                    onChatClicked = {
                        onChatClicked(index.toString())
                    }
                )
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowPreviewChatList(){
    ChatListScreen(
        onChatClicked = {}
    )
}