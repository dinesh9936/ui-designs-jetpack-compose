package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.ChatItem
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.ChatScreenSearchView

@Composable
fun ChatListScreen() {
    Column {
        ChatScreenSearchView()
        LazyColumn {
            items(15) {
                ChatItem(
                    name = "Friend $it",
                    message = "Hello! How are you?",
                    time = "10:2$it AM",
                    onChatClicked = {

                    }
                )
            }
        }
    }

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowPreviewChatList(){
    ChatListScreen()
}