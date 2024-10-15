package com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class NavbarViewModel : ViewModel() {
    var selectedTab by mutableStateOf("shop")
        private set

    fun onTabSelected(route: String) {
        selectedTab = route
    }
}