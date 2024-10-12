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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.grupo7_parcialtp3.R

class SelectLocation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelectLocationScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectLocationScreen() {
    var expandedZone by remember { mutableStateOf(false) }
    var selectedZone by remember { mutableStateOf("") }
    var selectedArea by remember { mutableStateOf("Select your area") }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_selectlocation),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(Color(0xFFF3603F).copy(alpha = 0.2f), Color.Transparent)
                        )
                    )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Select Your Location",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Switch on your location to stay in tune with what’s happening in your area.",
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(text = "Your zone", fontWeight = FontWeight.Bold)
            /* ExposedDropdownMenuBox(expanded = expandedZone, onExpandedChange = { expandedZone = it }) {
                TextField(
                    readOnly = true,
                    value = selectedZone,
                    onValueChange = { },
                    label = { Text("Select your zone") },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ExposedDropdownMenuDefaults.textFieldColors()
                )
                ExposedDropdownMenu(
                    expanded = expandedZone,
                    onDismissRequest = { expandedZone = false }
                ) {
                    listOf("Zone 1", "Zone 2", "Zone 3").forEach { zone ->
                        DropdownMenuItem(onClick = {
                            selectedZone = zone
                            expandedZone = false
                        }) {
                            Text(text = zone) // Asegúrate de que 'zone' sea un String
                        }
                    }
                }
            } */

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Your area", fontWeight = FontWeight.Bold)
            TextField(
                readOnly = true,
                value = selectedArea,
                onValueChange = { },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                enabled = false,
                label = { Text("Select your area") }
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* Lógica para enviar la selección */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF53B175))
            ) {
                Text(text = "Submit", fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSelectLocationScreen() {
    SelectLocationScreen()
}

