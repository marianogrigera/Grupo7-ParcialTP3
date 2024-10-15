package com.example.grupo7_parcialtp3.ui.theme.views.shop.filter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.res.painterResource
import com.example.grupo7_parcialtp3.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilterScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = {
                Text(
                    text = "Filters",
                    fontSize = 24.sp,
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
                )
            },
            navigationIcon = {
                IconButton(onClick = { /* Lógica para cerrar o navegar atrás */ }) {
                    Image(
                        painter = painterResource(id = R.drawable.cruz),
                        contentDescription = "Close",
                        modifier = Modifier.size(18.dp)
                    )
                }
            },
            modifier = Modifier.background(Color.White),
            colors = TopAppBarDefaults.largeTopAppBarColors(containerColor = Color.White),
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Categories",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                val categories = listOf("Eggs", "Noodles & Pasta", "Chips & Crisps", "Fast Food")
                for (category in categories) {
                    FilterItem(category)
                }

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "Brands",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                val brands = listOf("Individual Collection", "Cocola", "Ifad", "Kazi Farmas")
                for (brand in brands) {
                    FilterItem(brand)
                }

                Spacer(modifier = Modifier.weight(1f))

                Button(
                    onClick = { /* Lógica para aplicar filtros */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175)),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Apply Filters",
                        color = Color(0xFFF9F9FF),
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}

@Composable
fun FilterItem(item: String) {
    var isSelected by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { isSelected = !isSelected },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .background(if (isSelected) Color(0xFF53B175) else Color.White, shape = RoundedCornerShape(8.dp))
                .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                .padding(end = 8.dp)
        )

        Text(
            text = item,
            fontSize = 16.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FilterScreenView() {
    val navController = rememberNavController()
    FilterScreen(navController)
}

