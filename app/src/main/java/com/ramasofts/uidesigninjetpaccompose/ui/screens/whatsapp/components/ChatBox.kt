package com.ramasofts.uidesigninjetpaccompose.ui.screens.whatsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramasofts.uidesigninjetpaccompose.R
import com.ramasofts.uidesigninjetpaccompose.ui.theme.Purple80

@Composable
fun ChatBox(
    modifier: Modifier = Modifier
) {
    var message by remember { mutableStateOf("") }
    var isWriting by remember { mutableStateOf(false) }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.Bottom
    ) {

        // Left Rounded Box (TextField + Emoji + Attach + Camera)
        Row(
            modifier = Modifier
                .weight(1f)
                .shadow(
                    elevation = 2.dp,
                    shape = RoundedCornerShape(24.dp),
                    clip = false
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(24.dp)
                )
                .padding(horizontal = 2.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            // Emoji icon
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_emoji),
                    contentDescription = "Emoji",
                )
            }
            

            // TextField
            BasicTextField(
                value = message,
                onValueChange = { message = it },
                modifier = Modifier.weight(1f),
                decorationBox = { innerTextField ->
                    if (message.isEmpty()) {
                        Text(
                            text = "Message",
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    innerTextField()
                }
            )

            // Attach icon
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_add_file),
                    contentDescription = "Add files",
                )
            }

            if (!isWriting){
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_rupee),
                        contentDescription = "Add files",
                    )
                }
            }
            // Camera icon

            if (!isWriting){
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_camera),
                        contentDescription = "Add files",
                    )
                }
            }
            // Camera icon


        }

        Spacer(modifier = Modifier.width(5.dp))

        // Right Mic or Send button
        if (message.isEmpty()) {
            // Mic button
            FloatingActionButton(
                onClick = { },
                modifier = Modifier.size(45.dp),   // 👈 reduce size here
                containerColor = Purple80,
                contentColor = Color.White,
                shape = CircleShape,
                elevation = FloatingActionButtonDefaults.elevation(2.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_mic),
                    contentDescription = "Mic",
                    modifier = Modifier.size(20.dp)   // 👈 shrink icon
                )
            }
            isWriting = false

        } else {
            isWriting = true
            // Send button
            FloatingActionButton(
                onClick = { message = "" },
                modifier = Modifier.size(45.dp),   // 👈 reduce size here
                containerColor = Purple80,
                contentColor = Color.White,
                shape = CircleShape,
                elevation = FloatingActionButtonDefaults.elevation(2.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = "Send",
                    modifier = Modifier.size(20.dp)   // 👈 shrink icon
                )
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ShowChatBoxPreview() {
    ChatBox()
}