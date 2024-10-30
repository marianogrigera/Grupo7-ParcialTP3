package com.example.grupo7_parcialtp3.ui.theme.views.shop.categories

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriesView(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = {
                Text("Beverages", modifier = Modifier.fillMaxWidth(), textAlign = androidx.compose.ui.text.style.TextAlign.Center)
            },
            navigationIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 16.dp)
                )
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFFCFCFC))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(16.dp)) {
            val items = listOf(
                "Diet Coke",
                "Sprite Can",
                "Apple & Grape\nJuice",
                "Orange Juice",
                "Coca Cola Can",
                "Pepsi Can"
            )
            val prices = listOf("$1.99", "$1.50", "$15.99", "$15.99", "$4.99", "$4.99")
            val images = listOf(
                R.drawable.ic_coke,
                R.drawable.ic_sprite,
                R.drawable.ic_applejuice,
                R.drawable.ic_orangejuice,
                R.drawable.ic_cocacan,
                R.drawable.ic_pepsican
            )
            val descriptions = listOf(
                "355ml, Price",
                "325ml, Price",
                "2L, Price",
                "2L, Price",
                "325ml, Price",
                "325ml, Price"
            )

            for (i in items.indices) {
                if (i % 2 == 0) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        ItemBox(itemName = items[i], price = prices[i], imageRes = images[i], description = descriptions[i], navController = navController)
                        if (i + 1 < items.size) {
                            Spacer(modifier = Modifier.width(10.dp))
                            ItemBox(itemName = items[i + 1], price = prices[i + 1], imageRes = images[i + 1], description = descriptions[i + 1], navController = navController)
                        }
                    }
                    Spacer(modifier = Modifier.height(13.dp))
                }
            }
        }
    }
}

@Composable
fun ItemBox(itemName: String, price: String, imageRes: Int, description: String, navController: NavController) {
    Box(
        modifier = Modifier
            .size(150.dp, 200.dp)
            .background(Color.White, RoundedCornerShape(12.dp))
            .border(2.dp, Color(0xFFE1E1E1), RoundedCornerShape(12.dp))
            .padding(16.dp)
            .clickable {
                navController.navigate("explore")
            },
        contentAlignment = Alignment.TopStart
    ) {
        Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.SpaceBetween) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = Modifier.size(80.dp).align(Alignment.CenterHorizontally)
            )
            Text(text = itemName, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
            Text(text = description, modifier = Modifier.padding(top = 8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = price, modifier = Modifier.weight(1f).padding(top = 8.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {  }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CategoriesViewScreen() {
    val navController = rememberNavController()
    CategoriesView(navController)
}
