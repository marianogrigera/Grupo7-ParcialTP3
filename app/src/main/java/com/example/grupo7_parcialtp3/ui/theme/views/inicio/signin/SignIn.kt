package com.example.grupo7_parcialtp3.ui.theme.views.inicio.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R
import com.example.grupo7_parcialtp3.ui.theme.views.signin.SignInViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    navController: NavController,
    authViewModel: SignInViewModel = viewModel()
    ) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val loginResponse by authViewModel.loginResponse.observeAsState()
    val loginError by authViewModel.loginError.observeAsState()


    val signUpText = buildAnnotatedString {
        append("Don't have an account? ")

        withStyle(style = SpanStyle(Color(0xFF53B175), fontWeight = FontWeight.Bold)) {
            append("Sign Up")
        }
    }

    loginResponse?.let {
        navController.navigate("home")
    }

    loginError?.let {
        Text(
            text = it,
            color = Color.Red,
            modifier = Modifier.padding(8.dp)
        )
    }


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
                            colors = listOf(Color(0xFFF3603F).copy(alpha = 0.2f), Color.Transparent),
                            startY = 0f,
                            endY = 500f
                        )
                    )
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_logoacolor),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(width = 48.dp, height = 56.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Sign in",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Enter your email and password",
                modifier = Modifier.padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.height(50.dp))

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(30.dp))


            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Contraseña") },
                singleLine = true,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                visualTransformation = VisualTransformation.None, // Contraseña siempre visible
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            Box(
                modifier = Modifier.align(Alignment.End),
            ) {

                Text(
                    text = "Forgot Password?",
                    fontSize = 12.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(18.dp)
                        .clickable {
                            navController.navigate("signUp")
                        }
                )
            }

            Spacer(modifier = Modifier.height(60.dp))


            Button(
                onClick = { navController.navigate("home")/* Lógica de inicio de sesión aquí */ },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
            ) {
                Text(text = "Log In", fontSize = 18.sp)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = signUpText,
                    fontSize = 12.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable {
                            navController.navigate("signUp")
                        }
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun SignInScreen() {
    val navController = rememberNavController() // Crear NavController para vista previa
    SignInScreen(navController)
}