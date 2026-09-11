package com.example.moviecounter

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Componente reutilizado del catalogo de 33 componentes de Material 3
 * (Laboratorio 03 - ExploracionComponentes), traido a este repositorio
 * unicamente para practicar el flujo de commits de git pedido en la Parte 0.
 */
@Composable
fun ComponenteCardLab03() {
    Card(modifier = Modifier.fillMaxWidth()) {
        Text("Contenido dentro de una Card", modifier = Modifier.padding(12.dp))
    }
}
