package com.example.grupo7_parcialtp3.ui.theme.views.shop.checkout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CheckoutScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .background(Color.White, shape = RoundedCornerShape(16.dp))
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Checkout",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(Icons.Default.Close, contentDescription = "Close")
                }
            }

            Divider(color = Color.LightGray)

            CheckoutOptionItem(title = "Delivery", description = "Select Method", onClick = { /* Navegar a métodos de entrega */ })

            // Sección de Payment Method
            CheckoutOptionItem(title = "Payment", description = "Select Method", onClick = { /* Navegar a métodos de pago */ })

            CheckoutOptionItem(title = "Promo Code", description = "Pick discount", onClick = { /* Navegar a selección de código */ })

            CheckoutTotalCostItem(totalCost = "$13.97")

            Divider(color = Color.LightGray)

            Text(
                text = "By placing an order you agree to our Terms And Conditions",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )

            Button(
                onClick = { navController.navigate("orderaccepted") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
            ) {
                Text(text = "Place Order", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun CheckoutOptionItem(title: String, description: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(text = title, fontWeight = FontWeight.Bold)
            Text(text = description, color = Color.Gray)
        }
        IconButton(onClick = onClick) {
            Icon(Icons.Default.ArrowForward, contentDescription = null)
        }
    }
}

@Composable
fun CheckoutTotalCostItem(totalCost: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Total Cost", fontWeight = FontWeight.Bold)
        Text(text = totalCost, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenView() {
    val navController = rememberNavController()
    CheckoutScreen(navController)
}
