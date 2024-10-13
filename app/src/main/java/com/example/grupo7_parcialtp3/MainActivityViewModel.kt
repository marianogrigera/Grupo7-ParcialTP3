package com.example.grupo7_parcialtp3

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

data class UiState (
    val userName: String
)

class MainActivityViewModel : ViewModel() {
    var titleBar: String = ""
        set(value) {
            field = value
            // Otras acciones si es necesario
        }
}