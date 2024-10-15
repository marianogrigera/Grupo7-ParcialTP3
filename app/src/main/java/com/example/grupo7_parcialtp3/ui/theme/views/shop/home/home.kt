package com.example.grupo7_parcialtp3.ui.theme.views.shop.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R
import com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar.BottomNavbar
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(navController: NavController) {
    var selectedRoute by remember { mutableStateOf("home") }

    Scaffold(
        topBar = { ShopTopAppBar() },
        bottomBar = {
            BottomNavbar(
                selectedRoute = "home",
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
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(paddingValues)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 1.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Dhaka, Banassre")
                Spacer(modifier = Modifier.width(1.dp))
            }
            PromotionBanner()
            Spacer(modifier = Modifier.height(1.dp))
            ExclusiveOfferSection()
            BestSellingSection()
        }
    }
}

@Composable
fun PromotionBanner() {
    val images = listOf(
        R.drawable.ofertas_desplegable,
    )

    var currentIndex by remember { mutableStateOf(0) }

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000)
            currentIndex = (currentIndex + 1) % images.size
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp) // Reduce el padding aquí
    ) {
        Image(
            painter = painterResource(id = images[currentIndex]),
            contentDescription = "Promotional Image",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f),
            contentScale = ContentScale.Fit
        )
    }
}


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ShopTopAppBar() {
        TopAppBar(
            title = {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("Shop")
                }
            },
            navigationIcon = {
                IconButton(onClick = { /* Acción al hacer clic en el ícono */ }) {
                    Icon(Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(Color.White),
            modifier = Modifier
        )
    }

    @Composable
    fun ExclusiveOfferSection() {
        SectionHeader(title = "Exclusive Offer")
        LazyRow(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item { ProductCard("Organic Bananas", "$4.99", R.drawable.banana) }
            item { ProductCard("Red Apple", "$4.99", R.drawable.manzana) }
            item { ProductCard("Organic Bananas", "$4.99", R.drawable.ic_logoacolor) }
            item { ProductCard("Red Apple", "$4.99", R.drawable.ic_logoacolor) }
        }
    }

    @Composable
    fun BestSellingSection() {
        SectionHeader(title = "Best Selling")
        LazyRow(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item { ProductCard("Bell Pepper Red", "$2.99", R.drawable.morrones) }
            item { ProductCard("Ginger", "$1.99", R.drawable.gengibre) }
            item { ProductCard("Bell Pepper Red", "$2.99", R.drawable.nuestraapp3) }
            item { ProductCard("Ginger", "$1.99", R.drawable.nuestraapp3) }
        }
    }


    @Composable
    fun SectionHeader(title: String) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
            TextButton(onClick = {  }) {
                Text("See all")
            }
        }
    }

    @Composable
    fun ProductCard(productName: String, price: String, imageResource: Int) {
        Card(
            modifier = Modifier
                .width(173.dp)
                .height(248.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White) //
        ) {
            Column(
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = productName,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(1.dp)
                )
                Text(
                    text = productName,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp)
                )
                Spacer(modifier = Modifier.height(50.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = price, color = Color.DarkGray, fontWeight = FontWeight.Medium)
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .background(Color(0xFF53B175), shape = RoundedCornerShape(8.dp))
                            .size(45.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add to cart",
                            tint = Color.White // Color del ícono
                        )
                    }
                }
            }
        }
    }




@Preview
@Composable
fun HomeviewPreview() {
    val navController = rememberNavController()
    HomeScreen(navController)
}