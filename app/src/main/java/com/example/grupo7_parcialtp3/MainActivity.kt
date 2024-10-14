package com.example.grupo7_parcialtp3;

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.MainActivityViewModel
import com.example.grupo7_parcialtp3.MainRouteNavGraph
//import com.example.grupo7_parcialtp3.ui.theme.MyAppTheme


class MainActivity : ComponentActivity() {
    private val viewModel: MainActivityViewModel by viewModels<MainActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent(viewModel)
        }
    }
}


@Composable
fun MainContent(viewModel: MainActivityViewModel) {
    MaterialTheme {
        Surface {
            val navController = rememberNavController()
            MainRouteNavGraph(navController, viewModel)
        }
    }
}