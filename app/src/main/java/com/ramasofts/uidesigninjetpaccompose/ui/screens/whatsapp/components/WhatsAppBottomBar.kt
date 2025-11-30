package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components

import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val title: String,
    val icon: ImageVector
)

@Composable
fun WhatsAppBottomBar(selectedTab: Int, onTabSelected: (Int) -> Unit) {

    val items = listOf(
        BottomNavItem("Chats", Icons.Default.Email),
        BottomNavItem("Updates", Icons.Default.Star),
        BottomNavItem("Communities", Icons.Default.Person),
        BottomNavItem("Calls", Icons.Default.Call)
    )

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedTab == index,
                onClick = { onTabSelected(index) },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )
                },
                label = { Text(item.title) }
            )
        }
    }
}
