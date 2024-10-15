package com.example.grupo7_parcialtp3.ui.theme.views.shop.explore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen(navController: NavController) {
    var searchQuery by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFCFCFC))
                .padding(top = 20.dp)
        ) {
            Text(
                text = "Find products",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(vertical = 16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_logomenu),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(start = 20.dp, top = 23.dp)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF2F3F2), RoundedCornerShape(12.dp))
                .padding(vertical = 6.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_logolupa),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(24.dp)
                )
                TextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    placeholder = { Text("Search Store") },
                    modifier = Modifier
                        .width(290.dp)
                        .padding(end = 8.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent
                    )
                )
                IconButton(onClick = { /* Lógica de búsqueda aquí */ }) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_logobuscador),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(150.dp, 150.dp)
                    .background(Color(0x1A53B175), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFF53B175), RoundedCornerShape(12.dp))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_fruits),
                        contentDescription = null,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(text = "Fresh Fruits\n& Vegetable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AF8A44C), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFF8A44C), RoundedCornerShape(12.dp))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_oil),
                        contentDescription = null,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(text = "Cooking Oil\n& Ghee", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AF7A593), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFD67A7F), RoundedCornerShape(12.dp))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_meat),
                        contentDescription = null,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(text = "Meat & Fish", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AD3B0E0), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFC69CC1), RoundedCornerShape(12.dp))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_bakery),
                        contentDescription = null,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(text = "Bakery & Snacks", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AFDE598), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFE1C200), RoundedCornerShape(12.dp))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_eggs),
                        contentDescription = null,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(text = "Dairy & Eggs", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AB7DFF5), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFF9BCFE3), RoundedCornerShape(12.dp))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_beverages),
                        contentDescription = null,
                        modifier = Modifier.size(80.dp)
                    )
                    Text(text = "Beverages", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 5.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExploreScreenView() {
    val navController = rememberNavController()
    ExploreScreen(navController)
}