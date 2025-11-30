package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components.StatusScreenHeader

@Composable
fun StatusScreen() {
    Column {
        StatusScreenHeader()
        LazyColumn {
            items(10) {
                ListItem(
                    headlineContent = { Text("Contact $it") },
                    supportingContent = { Text("Today, 9:0$it AM") },
                    leadingContent = {
                        Box(
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)
                                .background(Color.Gray)
                        )
                    }
                )
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowPreviewCStatusScreen(){
   StatusScreen()
}
