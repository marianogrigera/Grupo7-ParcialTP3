package com.example.grupo7_parcialtp3.ui.theme.capas.selectlocation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectLocationScreen(navController: NavController) {
    var selectedZone by remember { mutableStateOf("") }
    val options = listOf("America", "Europa", "Oceanía")
    var expanded by remember { mutableStateOf(value = false) }
    var selectedOptionText by remember { mutableStateOf(options[0]) }
    val options2 = listOf("Norte", "Sur", "Centro")
    var expanded2 by remember { mutableStateOf(value = false) }


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

                Image(
                    painter = painterResource(id = R.drawable.ic_selectlocation),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(x = 0.dp, y = 70.dp)
                        .align(Alignment.Center)
                        .size(width = 224.5.dp, height = 170.5.dp)
                )
            }

            Spacer(modifier = Modifier.height(110.dp))

            Text(
                text = "Select Your Location",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)

            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Switch on your location to stay in tune with",
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "what's happening in your area",
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(50.dp))

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded }
            ) {
                TextField(
                    readOnly = true,
                    value = selectedZone,
                    onValueChange = {},
                    label = { Text("Your Zone") },
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                    trailingIcon = { ExposedDropdownMenuDefaults.outlinedTextFieldColors() },
                    colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors()
                )
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    options.forEach { selectedOption ->
                        DropdownMenuItem(
                            text = { Text(selectedOption) },
                            onClick = {
                                selectedOptionText = selectedOption
                                expanded = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }

            }

            Spacer(modifier = Modifier.height(50.dp))

            ExposedDropdownMenuBox(
                expanded = expanded2,
                onExpandedChange = { expanded2 = !expanded2 }
            ) {
                TextField(
                    readOnly = true,
                    value = selectedZone,
                    onValueChange = {},
                    label = { Text("Your Area") },
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                    trailingIcon = { ExposedDropdownMenuDefaults.outlinedTextFieldColors() },
                    colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors()
                )
                ExposedDropdownMenu(
                    expanded = expanded2,
                    onDismissRequest = { expanded2 = false }
                ) {
                    options2.forEach { selectedOptionText2 ->
                        DropdownMenuItem(
                            text = { Text(selectedOptionText2) },
                            onClick = {
                                selectedOptionText = selectedOptionText2
                                expanded2 = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }

                Button(
                    onClick = { /* Lógica de inicio de sesión aquí */ },
                    modifier = Modifier
                        .offset(x = 0.dp, y = 200.dp)
                        .fillMaxWidth().padding(horizontal = 16.dp),

                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
                ) {
                    Text(text = "Submit", fontSize = 18.sp)
                }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewSelectLocationScreen() {
    val navController = rememberNavController()
    SelectLocationScreen(navController)
}

