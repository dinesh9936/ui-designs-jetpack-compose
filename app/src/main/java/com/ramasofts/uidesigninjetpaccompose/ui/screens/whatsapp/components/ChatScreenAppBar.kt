package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramasofts.uidesigninjetpaccompose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreenAppBar(
    onMenuClicked:()-> Unit,
    onAudioCallClicked:()-> Unit,
    onVideoCallClicked:()-> Unit,
    onBackClicked:()-> Unit,
    onTitleClicked:()-> Unit
) {
    TopAppBar(
        title = {
            Row (
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable(
                    enabled = true,
                    onClick = {
                        onTitleClicked.invoke()
                    }
                )
            ){
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                ){

                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Friend Name",
                    fontSize = 20.sp
                )
            }
        },
        modifier = Modifier.fillMaxWidth()
            .background(Color.White),
        navigationIcon = {
            IconButton(
                onClick = {
                    onBackClicked.invoke()
                }
            ) {
                Icon(Icons.Default.ArrowBack, contentDescription = "")
            }

        },
        actions = {
            IconButton(
                onClick = { onVideoCallClicked.invoke() }
            ) {
                Icon(
                    painterResource(id = R.drawable.ic_video_call),
                    contentDescription = "Menu"
                )
            }

            IconButton(
                onClick = { onAudioCallClicked.invoke() }
            ) {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Menu"
                )
            }

            IconButton(
                onClick = { onMenuClicked.invoke() }
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "Menu"
                )
            }
        },
        colors = TopAppBarColors(
            containerColor = Color.White,
            scrolledContainerColor = Color.Black,
            navigationIconContentColor = Color.Black,
            titleContentColor = Color.Black,
            actionIconContentColor = Color.Black
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowChatScreenAppBarPreview(){
    ChatScreenAppBar(
        onBackClicked = {},
        onAudioCallClicked = {},
        onMenuClicked = {},
        onVideoCallClicked = {},
        onTitleClicked = {}
    )
}