package com.example.grupo7_parcialtp3.ui.theme.views.shop.productDetail

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grupo7_parcialtp3.R

@Composable
fun ProductDetailScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        ProductDetailAppBar()
        ProductImageCarousel()
        HorizontalDivider(thickness = 1.dp, color = Color(0xFFE2E2E2))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(horizontal = 16.dp)
        )

        {
            HorizontalDivider(thickness = 1.dp, color = Color(0xFFE2E2E2))
            ProductTitleSection("Naturel Red Apple", "1kg, Price", "$4.99")
            QuantitySelector()

            ProductDetailSection(
                productDescription = "Apples are nutritious. Apples may be good for weight loss. " +
                        "Apples may be good for your heart. As part of a healthful and varied diet."
            )
        }
        HorizontalDivider(thickness = 1.dp, color = Color(0xFFE2E2E2))
        Spacer(modifier = Modifier.height(16.dp))

        AddToBasketButton()
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailAppBar() {
    TopAppBar(
        title = { Text(text = "Product Detail") },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
            }
        },
        actions = {
            IconButton(onClick = {  }) {
                Icon(imageVector = Icons.Default.Share, contentDescription = "Share")
            }
        }
    )
}

@Composable
fun ProductImageCarousel() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(Color(0xFFF2F3F2)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.manzana),
            contentDescription = "Product Image",
            modifier = Modifier.size(300.dp)
        )
    }
}

@Composable
fun ProductTitleSection(title: String, weight: String, price: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(text = title, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = weight, color = Color.Gray)
            }
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "Favorite")
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = price, fontSize = 22.sp, fontWeight = FontWeight.Bold)
    }
}


@Composable
fun QuantitySelector() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {  }) {
                Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Decrease Quantity")
            }
            Text(text = "1", fontSize = 18.sp)
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Increase Quantity", tint = Color.Green)
            }
        }
        Text(text = "$4.99", fontSize = 22.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun ProductDetailSection(productDescription: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Product Detail", fontWeight = FontWeight.Bold)
        Text(text = productDescription, color = Color.Gray, modifier = Modifier.padding(top = 8.dp))
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Nutritions", fontWeight = FontWeight.Bold)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "100gr", color = Color.Gray)
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Arrow Right",
                    tint = Color.Gray,
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Review", fontWeight = FontWeight.Bold)

            Row(verticalAlignment = Alignment.CenterVertically) {
                // Cinco estrellas
                repeat(5) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color(0xFFF3603F),
                        modifier = Modifier.size(20.dp)
                    )
                }
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Arrow Right",
                    tint = Color.Gray,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}


@Composable
fun AddToBasketButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175)),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 16.dp)
            .height(60.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Text(text = "Add All to Cart", fontSize = 18.sp, color = Color.White)
    }
}


@Preview(showBackground = true)
@Composable
fun ProductDetailScreenView() {
    val navController = rememberNavController()
    ProductDetailScreen(navController)
}