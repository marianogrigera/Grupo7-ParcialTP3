import android.os.Bundle

mport android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.ui.theme.capas.inicio.SignIn
import com.example.grupo7_parcialtp3.ui.theme.capas.inicio.SplashScreen
import com.example.grupo7_parcialtp3.ui.theme.capas.signup.SignUp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "splash") {
                        composable("splash") { SplashScreen() }
                        composable("welcome") { WelcomeScreen(navController) }
                        composable("signin") { SignIn() }
                        composable("signup") { SignUp() }
                        composable("onboarding") { Onboarding() }
                    }
                }
            }
        }
    }
}