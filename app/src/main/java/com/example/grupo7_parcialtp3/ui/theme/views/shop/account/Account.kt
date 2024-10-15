package com.example.grupo7_parcialtp3.ui.theme.views.shop.account


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R
import com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar.BottomNavbar


@Composable
fun AccountSettingsScreen(navController: NavController) {
    var isDarkMode by remember { mutableStateOf(false) }

    val backgroundColor = if (isDarkMode) Color.Black else Color.White
    val textColor = if (isDarkMode) Color.White else Color.Black
    val dividerColor = if (isDarkMode) Color.Gray else Color.LightGray

    var selectedRoute by remember { mutableStateOf("account") }


    Scaffold(
        bottomBar = {
            BottomNavbar(
                selectedRoute = "account",
                onItemSelected = { route ->
                    selectedRoute = route
                    navController.navigate(route) {
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            // Completar aca la vista
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

                    AccountTextSection("Orders", textColor, R.drawable.shop)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Delivery Address", textColor, R.drawable.ubicacion)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Payment Methods", textColor, R.drawable.credit)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Promo Card", textColor, R.drawable.ticket)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Notifications", textColor, R.drawable.campana)
                    Divider(color = dividerColor, thickness = 1.dp)

                    Spacer(modifier = Modifier.height(40.dp))


                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth() // Llenar el ancho para centrar
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

                    Spacer(modifier = Modifier.height(40.dp))


                    Button(
                        onClick = { /* Acción de cerrar sesión */ },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF2F3F2))
                    ) {
                        Text(text = "Log Out", fontSize = 20.sp, color = Color(0xFF53B175))
                    }
                }
            }
        }
    }
}

@Composable
fun AccountTextSection(text: String, textColor: Color, iconRes: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 16.dp)
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null, // Descripción accesible si es necesario
            modifier = Modifier
                .size(32.dp) // Tamaño del ícono aumentado
                .padding(end = 8.dp) // Espacio entre la imagen y el texto
        )
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = textColor
        )


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAccountSettingsScreen() {
    val navController = rememberNavController()
    AccountSettingsScreen(navController)
}