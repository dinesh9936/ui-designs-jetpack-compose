package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.ramasofts.uidesigninjetpaccompose.R
import com.ramasofts.uidesigninjetpaccompose.ui.theme.Purple80
import com.ramasofts.uidesigninjetpaccompose.ui.theme.PurpleGrey80

data class BottomNavItem(
    val title: String,
    val iconRes: Int
)


@Composable
fun WhatsAppBottomBar(selectedTab: Int, onTabSelected: (Int) -> Unit) {

    val items = listOf(
        BottomNavItem("Chats", R.drawable.ic_chats),
        BottomNavItem("Updates", R.drawable.ic_updates),
        BottomNavItem("Communities", R.drawable.ic_communities),
        BottomNavItem("Calls", R.drawable.outline_call_24)
    )

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedTab == index,
                onClick = { onTabSelected(index) },
                icon = {
                    Icon(
                        painter = painterResource(id = item.iconRes),
                        contentDescription = item.title,
                    )
                },
                label = { Text(
                    text = item.title,
                    fontWeight = FontWeight.Bold
                ) },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Purple80,
                    unselectedIconColor = Color.Black,
                    selectedTextColor = Purple80,
                    unselectedTextColor = Color.Black,
                    indicatorColor = PurpleGrey80
                )
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewWhatsAppBottomBar(){
    WhatsAppBottomBar(
        selectedTab = 0,
        onTabSelected = {

        }
    )
}