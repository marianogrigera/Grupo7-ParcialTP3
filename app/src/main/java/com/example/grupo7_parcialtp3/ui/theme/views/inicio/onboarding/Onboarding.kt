package com.example.grupo7_parcialtp3.ui.theme.views.inicio.onboarding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.* // Para manejar el espaciado
import androidx.compose.material3.* // Para el botón y el tema
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment // Para alinear elementos
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color // Para el color
import androidx.compose.ui.layout.ContentScale // Para ajustar la imagen
import androidx.compose.ui.res.painterResource // Para cargar la imagen
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController // Agregar esta línea
import com.example.grupo7_parcialtp3.R


@Composable
fun WelcomeScreen(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.appnuestra2),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize()
        )

        // Contenido centrado
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.nuestraapp3),
                contentDescription = "Logo Image"
            )
            Text(
                text = "Welcome",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "to our store",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Get your groceries in as fast as one hour",
                fontSize = 15.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(34.dp))

            Button(
                modifier = Modifier.padding(horizontal = 50.dp),
                onClick = { navController.navigate("signIn") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
            ) {
                Text(text = "Get Started", color = Color.White)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewWelcomeScreen() {
    val navController = rememberNavController() // Crear NavController para vista previa
    WelcomeScreen(navController)
}



