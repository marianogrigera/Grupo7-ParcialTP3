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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R
import com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar.BottomNavbar

@Composable
fun ExploreScreen(navController: NavController) {
    //COMPLETAR VISTA
    var selectedRoute by remember { mutableStateOf("explore") }

    Scaffold(
        bottomBar = {
            BottomNavbar(
                selectedRoute = "explore",
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
        Box(modifier = Modifier.padding(paddingValues)) {
            // Completar aca la vista

            Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFFFCFCFC)),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_barsmenu),
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                    )

                    Text(
                        text = "Explore",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        modifier = Modifier
                            .padding(vertical = 16.dp)
                            .fillMaxWidth()
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color(0xFFF2F3F2))
                        .padding(vertical = 8.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 8.dp), // Padding horizontal para que el contenido no esté pegado a los bordes
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween // Esto ayuda a alinear el contenido
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_search2),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                        Text(
                            text = "Search Store",
                            color = Color.Black,
                            textAlign = TextAlign.Center, // Asegura que el texto esté centrado
                            modifier = Modifier.weight(1f) // Permite que el texto ocupe el espacio restante
                                .padding(start = 8.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_filter),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Primera fila
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // Espacio uniforme entre las cajas
                ) {
                    // Primera caja
                    Box(
                        modifier = Modifier
                            .padding(end = 4.dp) // Menos espacio entre las cajas
                            .size(150.dp, 150.dp)
                            .background(Color(0x1A53B175), RoundedCornerShape(12.dp))
                            .border(1.dp, Color(0xFF53B175), RoundedCornerShape(12.dp))
                            .padding(16.dp) // Padding interno
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
                            horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente
                            verticalArrangement = Arrangement.Center // Centrar verticalmente
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_fruits),
                                contentDescription = null,
                                modifier = Modifier.size(80.dp) // Tamaño de la imagen
                            )
                            Text(
                                text = "Fresh Fruits\n& Vegetable",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center, // Asegura que el texto esté centrado
                                modifier = Modifier.padding(top = 8.dp) // Espaciado entre la imagen y el texto
                            )
                        }
                    }

                    // Segunda caja
                    Box(
                        modifier = Modifier
                            .padding(end = 4.dp) // Menos espacio entre las cajas
                            .size(150.dp, 150.dp)
                            .background(Color(0x1AF8A44C), RoundedCornerShape(12.dp))
                            .border(1.dp, Color(0xFFF8A44C), RoundedCornerShape(12.dp))
                            .padding(16.dp) // Padding interno
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
                            horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente
                            verticalArrangement = Arrangement.Center // Centrar verticalmente
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_oil),
                                contentDescription = null,
                                modifier = Modifier.size(80.dp) // Tamaño de la imagen
                            )
                            Text(
                                text = "Cooking Oil\n& Ghee",
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center, // Asegura que el texto esté centrado
                                modifier = Modifier.padding(top = 8.dp) // Espaciado entre la imagen y el texto
                            )
                        }
                    }
                }


                Spacer(modifier = Modifier.height(16.dp))

                // Segunda fila
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // Espacio uniforme entre las cajas
                ) {
                    // Primera caja
                    Box(
                        modifier = Modifier
                            .padding(end = 4.dp) // Menos espacio entre las cajas
                            .size(150.dp, 150.dp)
                            .background(Color(0x1AF7A593), RoundedCornerShape(12.dp))
                            .border(1.dp, Color(0xFFD67A7F), RoundedCornerShape(12.dp))
                            .padding(16.dp) // Padding interno
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
                            horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente
                            verticalArrangement = Arrangement.Center // Centrar verticalmente
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_meat),
                                contentDescription = null,
                                modifier = Modifier.size(80.dp) // Tamaño de la imagen
                            )
                            Text(
                                text = "Meat & Fish",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp), // Espaciado entre la imagen y el texto
                                textAlign = TextAlign.Center // Asegura que el texto esté centrado
                            )
                        }
                    }

                    // Segunda caja
                    Box(
                        modifier = Modifier
                            .padding(start = 4.dp) // Menos espacio entre las cajas
                            .size(150.dp, 150.dp)
                            .background(Color(0x1AD3B0E0), RoundedCornerShape(12.dp))
                            .border(1.dp, Color(0xFFC69CC1), RoundedCornerShape(12.dp))
                            .padding(16.dp) // Padding interno
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
                            horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente
                            verticalArrangement = Arrangement.Center // Centrar verticalmente
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_bakery),
                                contentDescription = null,
                                modifier = Modifier.size(80.dp) // Tamaño de la imagen
                            )
                            Text(
                                text = "Bakery & Snacks",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp), // Espaciado entre la imagen y el texto
                                textAlign = TextAlign.Center // Asegura que el texto esté centrado
                            )
                        }
                    }
                }


                Spacer(modifier = Modifier.height(16.dp))

                // Tercera fila
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly // Espacio uniforme entre las cajas
                ) {
                    // Primera caja
                    Box(
                        modifier = Modifier
                            .padding(end = 4.dp) // Menos espacio entre las cajas
                            .size(150.dp, 150.dp)
                            .background(Color(0x1AFDE598), RoundedCornerShape(12.dp))
                            .border(1.dp, Color(0xFFE1C200), RoundedCornerShape(12.dp))
                            .padding(16.dp) // Padding interno
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
                            horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente
                            verticalArrangement = Arrangement.Center // Centrar verticalmente
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_eggs),
                                contentDescription = null,
                                modifier = Modifier.size(80.dp) // Tamaño de la imagen
                            )
                            Text(
                                text = "Dairy & Eggs",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp), // Espaciado entre la imagen y el texto
                                textAlign = TextAlign.Center // Asegura que el texto esté centrado
                            )
                        }
                    }

                    // Segunda caja
                    Box(
                        modifier = Modifier
                            .padding(start = 4.dp) // Menos espacio entre las cajas
                            .size(150.dp, 150.dp)
                            .background(Color(0x1AB7DFF5), RoundedCornerShape(12.dp))
                            .border(1.dp, Color(0xFF9BCFE3), RoundedCornerShape(12.dp))
                            .padding(16.dp) // Padding interno
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(), // Asegúrate de que la columna llene el espacio disponible
                            horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente
                            verticalArrangement = Arrangement.Center // Centrar verticalmente
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_beverages),
                                contentDescription = null,
                                modifier = Modifier.size(80.dp) // Tamaño de la imagen
                            )
                            Text(
                                text = "Beverages",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(top = 8.dp), // Espaciado entre la imagen y el texto
                                textAlign = TextAlign.Center // Asegura que el texto esté centrado
                            )
                        }
                    }
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