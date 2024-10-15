package com.example.grupo7_parcialtp3.ui.theme.capas.popups

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.grupo7_parcialtp3.R

class Categories : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CategoriesContent()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriesContent() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = {
                Text("Beverages", modifier = Modifier.fillMaxWidth(), textAlign = androidx.compose.ui.text.style.TextAlign.Center)
            },
            navigationIcon = {
                Image(
                    painter = painterResource(id = R.drawable.ic_coke),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 16.dp)
                )
            },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFFCFCFC))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(16.dp)) {
            val items = listOf("Diet Coke", "Sprite", "Fanta", "Coca-Cola", "Pepsi", "7 Up")
            val prices = listOf("$1.99", "$1.89", "$1.79", "$1.99", "$1.79", "$1.89")

            for (i in items.indices) {
                if (i % 2 == 0) {
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        ItemBox(itemName = items[i], price = prices[i])
                        if (i + 1 < items.size) {
                            ItemBox(itemName = items[i + 1], price = prices[i + 1])
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ItemBox(itemName: String, price: String) {
    Box(
        modifier = Modifier
            .size(150.dp, 200.dp)
            .background(Color(0xFFF2F3F2), RoundedCornerShape(12.dp))
            .border(2.dp, Color(0xFFE1E1E1), RoundedCornerShape(12.dp))
            .padding(16.dp)
            .clickable { /* Lógica de navegación aquí */ },
        contentAlignment = Alignment.TopStart
    ) {
        Column(horizontalAlignment = Alignment.Start) {
            Image(
                painter = painterResource(id = R.drawable.ic_cocacan),
                contentDescription = null,
                modifier = Modifier.size(80.dp).align(Alignment.CenterHorizontally)
            )
            Text(text = itemName, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
            Text(text = "355ml, Price", modifier = Modifier.padding(top = 2.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = price)
                Image(
                    painter = painterResource(id = R.drawable.ic_pepsican),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { /* Lógica de navegación aquí */ }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCategories() {
    CategoriesContent()
}
