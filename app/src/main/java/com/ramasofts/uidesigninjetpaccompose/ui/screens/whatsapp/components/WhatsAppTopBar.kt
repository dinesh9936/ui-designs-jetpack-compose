package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ramasofts.uidesigninjetpaccompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WhatsAppTopBar(
    title: String,
    showQR: Boolean = false,
    showCamera: Boolean = false,
    showMenu: Boolean = true,
    showSearch: Boolean = false,
    onShowSearchClicked:()-> Unit = {},
    onQRClick: () -> Unit = {},
    onCameraClick: () -> Unit = {},
    onMenuClick: () -> Unit = {}
) {
    TopAppBar(
        title = { Text(title) },
        actions = {

            if (showQR) {
                IconButton(onClick = onQRClick) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_qr_scanner),
                        contentDescription = "QR Scanner"
                    )
                }
            }

            if (showCamera) {
                IconButton(onClick = onCameraClick) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_camera),
                        contentDescription = "Camera"
                    )
                }
            }

            if (showSearch){
                IconButton(onClick = onShowSearchClicked) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Menu"
                    )
                }
            }
            if (showMenu) {
                IconButton(onClick = onMenuClick) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Menu"
                    )
                }
            }
        }
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowPreview(){
    WhatsAppTopBar(
        title = "Updates",
        showQR = false,
        showMenu = true,
        showSearch = true,
        showCamera = false
    )
}