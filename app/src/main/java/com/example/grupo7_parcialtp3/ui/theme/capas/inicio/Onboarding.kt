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

class Onboarding : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController() // Crear NavController
            WelcomeScreen(navController)
        }
    }
}

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize() // Ocupa toda la pantalla
    ) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.appnuestra2), // Reemplaza con tu imagen
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // Ajusta la imagen para llenar la pantalla
        )

        // Contenido centrado
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // Centrar horizontalmente
            verticalArrangement = Arrangement.Bottom, // Alinear elementos en la parte inferior
            modifier = Modifier
                .fillMaxSize() // Ocupa toda la pantalla para centrar el contenido
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.nuestraapp3), // Reemplaza con tu imagen
                contentDescription = "Logo Image",
                contentScale = ContentScale.Crop // Ajusta la imagen para llenar la pantalla
            )
            // Texto centrado
            Text(
                text = "Welcome",
                fontSize = 35.sp, // Tamaño más grande del texto
                fontWeight = FontWeight.Bold, // Texto en negrita
                color = Color.White // Texto de color blanco
            )
            Text(
                text = "to our store",
                fontSize = 35.sp, // Tamaño más grande del texto
                fontWeight = FontWeight.Bold, // Texto en negrita
                color = Color.White // Texto de color blanco
            )
            Text(
                text = "Get your groceries in as fast as one hour",
                fontSize = 15.sp, // Tamaño más pequeño del texto
                color = Color.White // Texto de color blanco
            )

            Spacer(modifier = Modifier.height(34.dp)) // Espacio entre el texto y el botón

            // Botón centrado
            Button(
                modifier = Modifier.padding(horizontal = 50.dp),
                onClick = { navController.navigate("signIn") }, // Navega a la pantalla de inicio de sesión
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175)) // Color del botón
            ) {
                Text(text = "Get Started", color = Color.White) // Texto blanco en el botón
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



