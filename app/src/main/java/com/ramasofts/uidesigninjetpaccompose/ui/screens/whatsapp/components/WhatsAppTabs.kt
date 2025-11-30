package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun WhatsAppTabs(selectedTab: Int, onTabSelected: (Int) -> Unit) {

    val tabs = listOf(
        Pair("Chats", Icons.Default.Email),
        Pair("Updates", Icons.Default.Star),
        Pair("Communities", Icons.Default.Person),
        Pair("Calls", Icons.Default.Call)
    )

    TabRow(
        selectedTabIndex = selectedTab,
        modifier = Modifier.fillMaxWidth(),
    ) {
        tabs.forEachIndexed { index, (title, icon) ->
            Tab(
                selected = selectedTab == index,
                onClick = { onTabSelected(index) },
                modifier = Modifier.padding(0.dp),
                text = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = title
                        )
                        Text(
                            text = title,
                            fontSize = 10.sp,
                            softWrap = true,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold
                        )
                    }
                },

            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowPreviewTabs() {
    WhatsAppTabs(
        selectedTab = 0,
        onTabSelected = {}
    )
}
