package com.example.grupo7_parcialtp3.ui.theme.capas.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.grupo7_parcialtp3.R
import androidx.compose.material3.TopAppBar as TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.colorspace.WhitePoint
import kotlinx.coroutines.delay


class HomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            this.HomeScreenUI()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HomeScreenUI() {
        Scaffold(
            topBar = { ShopTopAppBar() },
            bottomBar = { BottomBar() }
        ) { paddingValues ->
            // Ajustar el contenido al padding del Scaffold
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(paddingValues) // Respetar el padding generado por el Scaffold
            ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Dhaka, Banassre")
                Spacer(modifier = Modifier.width(0.dp))
            }
            PromotionBanner()
            Spacer(modifier = Modifier. height(0.dp))
            ExclusiveOfferSection()
            BestSellingSection()
            BottomBar()
        }
    }
    }

    // Modularización del TopAppBar
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

//    // Modularización del carrusel de banners de promoción
//    @Composable
//    fun PromotionBanner() {
//        LazyRow(
//            contentPadding = PaddingValues(horizontal = 16.dp),
//            horizontalArrangement = Arrangement.spacedBy(16.dp)
//        ) {
//            items(listOf(R.drawable.ofertas_desplegable, R.drawable.appnuestra2, R.drawable.appnuestra2)) { imageRes ->
//                Box(
//                    modifier = Modifier
//                        .width(300.dp)
//                        .height(120.dp)
//                        .background(Color(0xFFE0F7FA), shape = RoundedCornerShape(8.dp))
//                ) {
//                    Image(
//                        painter = painterResource(id = imageRes),
//                        contentDescription = "Fresh Vegetables",
//                        modifier = Modifier.fillMaxSize(),
//                        contentScale = ContentScale.Crop
//                    )
//                    Text(
//                        text = "Fresh Vegetables\nGet Up To 40% OFF",
//                        color = Color.White,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .align(Alignment.CenterStart)
//                            .padding(16.dp)
//                    )
//                }
//            }
//        }
//    }

    @Composable
    fun PromotionBanner() {
        // Lista de imágenes
        val images = listOf(
            R.drawable.ofertas_desplegable,
            R.drawable.appnuestra2,
            R.drawable.nuestraapp3
        )

        // Índice actual de la imagen
        var currentIndex by remember { mutableStateOf(0) }

        // Cambiar la imagen automáticamente cada 3 segundos
        LaunchedEffect(Unit) {
            while (true) {
                delay(3000) // Espera 3 segundos
                currentIndex = (currentIndex + 1) % images.size
            }
        }

        // Mostrar la imagen actual con AspectRatio para mantener la proporción
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = images[currentIndex]),
                contentDescription = "Promotional Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(16f / 9f), // Ajustar la proporción de la imagen
                contentScale = ContentScale.Fit
            )
        }
    }


    // Modularización de la sección de ofertas exclusivas
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

    // Modularización de la sección de Best Selling
    @Composable
    fun BestSellingSection() {
        SectionHeader(title = "Best Selling")
        LazyRow(
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item { ProductCard("Bell Pepper Red", "$2.99", R.drawable.banana) }
            item { ProductCard("Ginger", "$1.99", R.drawable.manzana) }
            item { ProductCard("Bell Pepper Red", "$2.99", R.drawable.nuestraapp3) }
            item { ProductCard("Ginger", "$1.99", R.drawable.nuestraapp3) }
        }
    }

    @Composable
    fun BottomBar() {
        BottomAppBar(
            modifier = Modifier.fillMaxWidth(),
            contentColor = Color.Black,
            containerColor = Color.White
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                IconButton(onClick = { /* Acción de ir a la pantalla de inicio */ }) {
                    Icon(Icons.Default.Home, contentDescription = "Shop")
                }
                IconButton(onClick = { /* Acción de ir a la pantalla de inicio */ }) {
                    Icon(Icons.Default.Search, contentDescription = "Explore")
                }
                IconButton(onClick = { /* Acción de ir a la pantalla de inicio */ }) {
                    Icon(Icons.Default.ShoppingCart, contentDescription = "Cart")
                }
                IconButton(onClick = { /* Acción de ir a la pantalla de inicio */ }) {
                    Icon(Icons.Default.FavoriteBorder, contentDescription = "Favourite")
                }
                IconButton(onClick = { /* Acción de ir a la pantalla de inicio */ }) {
                    Icon(Icons.Default.AccountCircle, contentDescription = "Account")
                }
            }
        }
    }

    // Función para el encabezado de las secciones
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
            TextButton(onClick = { /* Acción de ver todos */ }) {
                Text("See all")
            }
        }
    }

    // Función para mostrar los productos en tarjetas
    @Composable
    fun ProductCard(productName: String, price: String, imageResource: Int) {
        Card(
            modifier = Modifier
                .width(150.dp)
                .height(200.dp),
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
                        .size(80.dp)
                        .padding(8.dp)
                )
                Text(
                    text = productName,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(0.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = price, color = Color.DarkGray)
                    IconButton(onClick = { /* Acción de agregar al carrito */ }) {
                        Icon(Icons.Default.AddCircle, contentDescription = "Add to cart", tint = Color.Green)
                    }
                }
            }
        }
    }

    // Función de previsualización para ver el diseño
    @Preview(showBackground = true)
    @Composable
    fun PreviewShopScreenUI() {
        HomeScreenUI()
    }
}








