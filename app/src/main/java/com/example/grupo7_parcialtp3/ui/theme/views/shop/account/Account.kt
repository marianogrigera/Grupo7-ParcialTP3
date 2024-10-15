package com.example.grupo7_parcialtp3.ui.theme.views.shop.account


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R
import com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar.BottomNavbar
import com.example.grupo7_parcialtp3.ui.theme.views.shop.error.ShowErrorPopup


@Composable
fun AccountSettingsScreen(navController: NavController) {
    var isDarkMode by remember { mutableStateOf(false) }

    val backgroundColor = if (isDarkMode) Color.Black else Color.White
    val textColor = if (isDarkMode) Color.White else Color.Black
    val dividerColor = if (isDarkMode) Color.Gray else Color.LightGray

    var selectedRoute by remember { mutableStateOf("account") }


    var showPopup by remember { mutableStateOf(false) }



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
            ShowErrorPopup(showPopup = showPopup, onClose = { showPopup = false })
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
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFFCFCFC)),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_barsmenu),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                    )

                    Text(
                        text = "Account",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        modifier = Modifier
                            .padding(vertical = 16.dp)
                            .fillMaxWidth()
                    )
                }


                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_accountlogo),
                            contentDescription = "Afsar Hossen",
                            modifier = Modifier
                                .size(64.dp)
                        )

                        Spacer(modifier = Modifier.width(16.dp))


                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.Center
                        ) {

                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Afsar Hossen",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                                Spacer(modifier = Modifier.width(8.dp))


                                Image(
                                    painter = painterResource(id = R.drawable.ic_edit),
                                    contentDescription = "Edit Icon",
                                    modifier = Modifier
                                        .size(20.dp),
                                    colorFilter = ColorFilter.tint(Color(0xFF53B175))
                                )
                            }


                            Text(
                                text = "Imshuvo97@gmail.com",
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp,
                                color = Color.LightGray
                            )
                        }
                    }
                }



                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp)
                ) {

                    AccountTextSection("Orders", textColor, R.drawable.ic_order, R.drawable.ic_arrowright)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Delivery Address", textColor, R.drawable.ic_location, R.drawable.ic_arrowright)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Payment Methods", textColor, R.drawable.ic_credit, R.drawable.ic_arrowright)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Promo Card", textColor, R.drawable.ic_giftcard, R.drawable.ic_arrowright)
                    Divider(color = dividerColor, thickness = 1.dp)


                    AccountTextSection("Notifications", textColor, R.drawable.ic_notification, R.drawable.ic_arrowright)
                    Divider(color = dividerColor, thickness = 1.dp)

                    AccountTextSection("Help", textColor, R.drawable.ic_help, R.drawable.ic_arrowright)
                    Divider(color = dividerColor, thickness = 1.dp)

                    Spacer(modifier = Modifier.height(40.dp))


                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
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
                        onClick = { showPopup = true },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF2F3F2)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.ic_logout),
                                contentDescription = null,
                                modifier = Modifier
                                    .align(Alignment.CenterStart)
                                    .size(32.dp)
                                    .padding(start = 8.dp),
                                colorFilter = ColorFilter.tint(Color(0xFF53B175))
                            )

                            Text(
                                text = "Log Out",
                                fontSize = 20.sp,
                                color = Color(0xFF53B175),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun AccountTextSection(text: String, textColor: Color, iconRes: Int, iconEnd: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .padding(end = 8.dp)
        )
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = textColor
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(
            painter = painterResource(id = iconEnd),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .padding(end = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAccountSettingsScreen() {
    val navController = rememberNavController()
    AccountSettingsScreen(navController)
}
