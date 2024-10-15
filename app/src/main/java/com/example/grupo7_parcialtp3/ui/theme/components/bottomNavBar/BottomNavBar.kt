package com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.grupo7_parcialtp3.R

@Composable
fun BottomNavbar(
    selectedRoute: String,
    onItemSelected: (String) -> Unit
) {
    val elevation = 16.dp;

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(elevation, RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
    ) {
        NavigationBar(
            modifier = Modifier
                .height(66.dp)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)), // Mantener el clip aquí
            containerColor = Color.White

        ) {
            NavigationBarItem(
                icon = { Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_shop), contentDescription = "Shop") },
                label = { Text("Shop", color = if (selectedRoute == "shop") Color(0xFF53B175) else Color.Black) },
                selected = selectedRoute == "shop",
                onClick = { onItemSelected("shop") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF53B175),
                    unselectedIconColor = Color.Black,
                    selectedTextColor = Color(0xFF53B175),
                    unselectedTextColor = Color.Black,
                    indicatorColor = Color.Transparent
                )
            )
            NavigationBarItem(
                icon = { Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_search), contentDescription = "Explore") },
                label = { Text("Explore", color = if (selectedRoute == "explore") Color(0xFF53B175) else Color.Black) },
                selected = selectedRoute == "explore",
                onClick = { onItemSelected("explore") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF53B175),
                    unselectedIconColor = Color.Black,
                    selectedTextColor = Color(0xFF53B175),
                    unselectedTextColor = Color.Black,
                    indicatorColor = Color.Transparent
                )
            )
            NavigationBarItem(
                icon = { Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_cart), contentDescription = "Cart") },
                label = { Text("Cart", color = if (selectedRoute == "cart") Color(0xFF53B175) else Color.Black) },
                selected = selectedRoute == "cart",
                onClick = { onItemSelected("cart") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF53B175),
                    unselectedIconColor = Color.Black,
                    selectedTextColor = Color(0xFF53B175),
                    unselectedTextColor = Color.Black,
                    indicatorColor = Color.Transparent
                )
            )
            NavigationBarItem(
                icon = { Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_favourite), contentDescription = "Favourite") },
                label = { Text("Favourite", color = if (selectedRoute == "favourite") Color(0xFF53B175) else Color.Black) },
                selected = selectedRoute == "favourite",
                onClick = { onItemSelected("favourite") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF53B175),
                    unselectedIconColor = Color.Black,
                    selectedTextColor = Color(0xFF53B175),
                    unselectedTextColor = Color.Black,
                    indicatorColor = Color.Transparent
                )
            )
            NavigationBarItem(
                icon = { Icon(imageVector = ImageVector.vectorResource(id = R.drawable.ic_profile), contentDescription = "Account") },
                label = { Text("Account", color = if (selectedRoute == "account") Color(0xFF53B175) else Color.Black) },
                selected = selectedRoute == "account",
                onClick = { onItemSelected("account") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF53B175),
                    unselectedIconColor = Color.Black,
                    selectedTextColor = Color(0xFF53B175),
                    unselectedTextColor = Color.Black,
                    indicatorColor = Color.Transparent
                )
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BottomNavbarPreview() {
    var selectedRoute by remember { mutableStateOf("shop") } // Estado inicial seleccionado

    BottomNavbar(
        selectedRoute = selectedRoute,
        onItemSelected = { newRoute -> selectedRoute = newRoute } // Cambiar la ruta seleccionada
    )
}