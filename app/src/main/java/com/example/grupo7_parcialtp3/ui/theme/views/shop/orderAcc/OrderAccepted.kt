package com.example.grupo7_parcialtp3.ui.theme.views.shop.orderAcc

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R

@Composable
fun OrderAcceptedScreen(navController: NavController) {
    //COMPLETAR VISTA
    Box(
        modifier = Modifier.fillMaxSize(),

        ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFF3603F).copy(alpha = 0.2f),
                                Color.Transparent
                            ),
                            startY = 0f,
                            endY = 500f
                        )
                    )
            ) {

                Spacer(modifier = Modifier.height(300.dp))

                Image(
                    painter = painterResource(id = R.drawable.ic_tilde),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 269.dp, height = 240.dp)
                        .offset(x = 45.dp, y = 120.dp)
                )
            }

            Spacer(modifier = Modifier.height(230.dp))

            Text(
                text = "Your Order has been",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)


            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "accepted",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Your items has been placed and is on",
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "it's way to being processed",
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(130.dp))


            Button(
                onClick = { /* Lógica de inicio de sesión aquí */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
            ) {
                Text(text = "Track Order", fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(20.dp))

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
                            navController.navigate("home screen")
                        }
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun OrderAcceptedScreenView() {
    val navController = rememberNavController()
    OrderAcceptedScreen(navController)
}