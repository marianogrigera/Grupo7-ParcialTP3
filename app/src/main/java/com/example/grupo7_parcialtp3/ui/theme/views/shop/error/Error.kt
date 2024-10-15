package com.example.grupo7_parcialtp3.ui.theme.views.shop.error

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R

@Composable
fun ShowErrorPopup(showPopup: Boolean, onClose: () -> Unit) {
    if (showPopup) {
        Dialog(onDismissRequest = { onClose() }) {
            // Tu popup se dibuja aquí
            Box(
                modifier = Modifier
                    .size(width = 364.dp, height = 602.dp)
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White, shape = RoundedCornerShape(16.dp))
                ) {
                    // Contenido del popup
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                    ) {
                        // Cruz para cerrar
                        Image(
                            painter = painterResource(id = R.drawable.ic_close),
                            contentDescription = "Cerrar",
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 20.dp, y = 20.dp)
                                .size(15.dp)
                                .clickable { onClose() } // Acción de cerrar popup
                        )

                        Image(
                            painter = painterResource(id = R.drawable.ic_errorimg),
                            contentDescription = null,
                            modifier = Modifier
                                .size(width = 269.dp, height = 240.dp)
                                .padding(top = 20.dp)
                                .align(Alignment.Center) // Imagen centrada
                        )
                    }

                    Spacer(modifier = Modifier.height(130.dp))

                    Text(
                        text = "Oops! Order Failed",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Something went terribly wrong",
                        fontSize = 16.sp,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.height(70.dp))

                    Button(
                        onClick = { /* Acción de intento de nuevo aquí */ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
                    ) {
                        Text(text = "Please Try Again", fontSize = 18.sp)
                    }

                    Spacer(modifier = Modifier.height(15.dp))

                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Back to home",
                            fontSize = 18.sp,
                            color = Color.Black,
                            modifier = Modifier
                                .padding(8.dp)
                                .clickable {
                                    onClose() // Cerrar popup
                                }
                        )
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun ErrorScreenView() {
//    val navController = rememberNavController()
//    ErrorScreen(navController, onClose = {})
//}