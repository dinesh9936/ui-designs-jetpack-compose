package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import androidx.navigation.navArgument
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens.ChatListScreen
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens.ChatScreen
import com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.screens.WhatsAppUI

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        // WhatsApp Main Screen
        composable("home") {
            WhatsAppUI(
                onChatClicked = { chatId ->
                    navController.navigate("chat/$chatId")
                }
            )
        }

        // Chat Screen
        composable(
            route = "chat/{chatId}",
            arguments = listOf(
                navArgument("chatId") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val chatId = backStackEntry.arguments?.getString("chatId") ?: ""

            ChatScreen(
                chatId = chatId,
                onBackClicked = { navController.popBackStack() }
            )
        }
    }
}