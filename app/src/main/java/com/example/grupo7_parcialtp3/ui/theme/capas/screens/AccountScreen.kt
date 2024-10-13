package com.example.grupo7_parcialtp3.ui.theme.capas.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

class AccountScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountSettingsScreen()
        }
    }
}

@Composable
fun AccountSettingsScreen() {
    var isDarkMode by remember { mutableStateOf(false) }

    val backgroundColor = if (isDarkMode) Color.Black else Color.White
    val textColor = if (isDarkMode) Color.White else Color.Black
    val dividerColor = if (isDarkMode) Color.Gray else Color.LightGray

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Account",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 24.dp),
            color = textColor
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp)
        ) {
            AccountTextSection("Orders", textColor)
            Divider(color = dividerColor, thickness = 1.dp)

            AccountTextSection("Delivery Address", textColor)
            Divider(color = dividerColor, thickness = 1.dp)

            AccountTextSection("Payment Methods", textColor)
            Divider(color = dividerColor, thickness = 1.dp)

            AccountTextSection("Promo Card", textColor)
            Divider(color = dividerColor, thickness = 1.dp)

            AccountTextSection("Notifications", textColor)
            Divider(color = dividerColor, thickness = 1.dp)

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = { /* Acción de cerrar sesión */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
            ) {
                Text(text = "Log Out", fontSize = 20.sp, color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Dark Mode",
                fontSize = 16.sp,
                color = textColor,
                modifier = Modifier.padding(end = 8.dp)
            )
            Switch(
                checked = isDarkMode,
                onCheckedChange = { isDarkMode = it },
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color(0xFF53B175),
                    uncheckedThumbColor = Color.Gray
                )
            )
        }
    }
}

@Composable
fun AccountTextSection(text: String, textColor: Color) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium,
        modifier = Modifier.padding(vertical = 16.dp),
        color = textColor
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewAccountSettingsScreen() {
    AccountSettingsScreen()
}