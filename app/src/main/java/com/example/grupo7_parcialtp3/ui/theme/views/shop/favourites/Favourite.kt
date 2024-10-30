package com.example.grupo7_parcialtp3.ui.theme.views.shop.favourites

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

data class Product(val name: String, val price: String, val imageRes: Int, val volume: String)

@Composable
fun FavouriteScreen(navController: NavController) {
    val products = listOf(
        Product("Sprite Can", "$1.50", R.drawable.sprite, "325ml"),
        Product("Diet Coke", "$1.99", R.drawable.coca, "355ml"),
        Product("Apple & Grape Juice", "$15.50", R.drawable.treetop, "2L"),
        Product("Coca Cola Can", "$4.99", R.drawable.cocaroja, "325ml"),
        Product("Pepsi Can", "$4.99", R.drawable.pepsi, "330ml")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Favorites",
            fontSize = 24.sp,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            textAlign = androidx.compose.ui.text.style.TextAlign.Center
        )

        Divider(
            color = Color(0xFFE2E2E2),
            thickness = 1.dp,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items(products.size) { index ->
                ProductItem(product = products[index])

                Divider(
                    color = Color(0xFFE2E2E2),
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }

        Button(
            onClick = { /* Lógica para añadir todos al carrito */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .height(60.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Add All to Cart", fontSize = 18.sp, color = Color.White)
        }
    }
}

@Composable
fun ProductItem(product: Product) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 30.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = product.imageRes),
            contentDescription = product.name,
            modifier = Modifier
                .size(60.dp)
                .padding(end = 16.dp),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = product.name, fontSize = 20.sp, color = Color.Black)
            Text(text = product.volume, fontSize = 12.sp, color = Color.Gray)
        }

        Text(
            text = product.price,
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier.padding(end = 8.dp)
        )

        Icon(
            painter = painterResource(id = R.drawable.arrowpointtoright),
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FavouriteScreenView() {
    val navController = rememberNavController()
    FavouriteScreen(navController)
}
