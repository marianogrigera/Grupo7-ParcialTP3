package com.example.grupo7_parcialtp3.ui.theme.capas.explorescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.grupo7_parcialtp3.R

class ExploreScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExploreScreenContent()
        }
    }
}

@Composable
fun ExploreScreenContent() {
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
                .background(Color(0xFFF2F3F2))
                .padding(vertical = 8.dp)
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
                Text(
                    text = "Search Store",
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_logobuscador),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Primera fila
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .padding(end = 4.dp) // Menos espacio entre las cajas
                    .size(150.dp, 150.dp)
                    .background(Color(0x1A53B175), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFF53B175), RoundedCornerShape(12.dp))
                    .padding(16.dp)
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
                    Text(text = "Frash Fruits\n" +
                            "& Vegetable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 4.dp) // Menos espacio entre las cajas
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AF8A44C), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFF8A44C), RoundedCornerShape(12.dp))
                    .padding(16.dp)
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
                    Text(text = "Cooking Oil\n" +
                            "& Ghee", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Segunda fila
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .padding(end = 4.dp) // Menos espacio entre las cajas
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AF7A593), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFD67A7F), RoundedCornerShape(12.dp))
                    .padding(16.dp)
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
                    Text(text = "Meat & Fish", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 4.dp) // Menos espacio entre las cajas
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AD3B0E0), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFC69CC1), RoundedCornerShape(12.dp))
                    .padding(16.dp)
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
                    Text(text = "Bakery & Snacks", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Tercera fila
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .padding(end = 4.dp) // Menos espacio entre las cajas
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AFDE598), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFFE1C200), RoundedCornerShape(12.dp))
                    .padding(16.dp)
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
                    Text(text = "Dairy & Eggs", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                }
            }

            Box(
                modifier = Modifier
                    .padding(start = 4.dp) // Menos espacio entre las cajas
                    .size(150.dp, 150.dp)
                    .background(Color(0x1AB7DFF5), RoundedCornerShape(12.dp))
                    .border(2.dp, Color(0xFF9BCFE3), RoundedCornerShape(12.dp))
                    .padding(16.dp)
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
                    Text(text = "Beverages", fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExploreScreen() {
    ExploreScreenContent()
}
