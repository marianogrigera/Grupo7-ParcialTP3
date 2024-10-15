package com.example.grupo7_parcialtp3.ui.theme.views.shop.mycart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R
import com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar.BottomNavbar

@Composable
fun MyCartScreen(navController: NavController) {
    var selectedRoute by remember { mutableStateOf("mycart") }

    Scaffold(
        bottomBar = {
            BottomNavbar(
                selectedRoute = "mycart",
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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
            ) {
                Text(
                    text = "My Cart",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(vertical = 16.dp)
                )
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    item { CartItem("Bell Pepper Red", "1kg", "$4.99", R.drawable.banana) }
                    item { CartItem("Egg Chicken Red", "4pcs", "$1.99", R.drawable.manzana) }
                    item { CartItem("Organic Bananas", "12kg", "$3.00", R.drawable.banana) }
                    item { CartItem("Ginger", "250gm", "$2.99", R.drawable.manzana) }
                }
                Spacer(modifier = Modifier.height(16.dp))
                CheckoutButton(navController= navController, totalPrice = "$12.96")
            }
        }
    }
}

@Composable
fun CartItem(name: String, quantity: String, price: String, imageResource: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = MaterialTheme.shapes.small,
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(imageResource),
                contentDescription = name,
                modifier = Modifier.size(64.dp),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.weight(1f).padding(start = 16.dp)
            ) {
                Text(text = name, fontWeight = MaterialTheme.typography.bodyLarge.fontWeight)
                Text(text = quantity, fontSize = 12.sp, color = Color.Gray)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /* Quitar cantidad */ }) {
                    Icon(Icons.Default.Close, contentDescription = "Remove", tint = Color.Gray)
                }
                Text(text = "1", fontSize = 18.sp)
                IconButton(onClick = { /* Agregar cantidad */ }) {
                    Icon(Icons.Default.AddCircle, contentDescription = "Add", tint = Color.Gray)
                }
            }

            Text(text = price, fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))

            IconButton(onClick = { /* Eliminar producto */ }) {
                Icon(Icons.Default.Close, contentDescription = "Remove from cart", tint = Color.Gray)
            }
        }
    }
}

@Composable
fun CheckoutButton(totalPrice: String, navController: NavController) {
    Button(
        onClick = { navController.navigate("checkout")},
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Go to Checkout", fontSize = 18.sp)
            Text(text = totalPrice, fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyCartScreenView() {
    val navController = rememberNavController()
    MyCartScreen(navController)
}
