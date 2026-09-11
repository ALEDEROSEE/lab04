package com.example.moviecounter

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
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

@Composable
fun ComponenteCheckboxLab03() {
    var checked by remember { mutableStateOf(true) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = checked, onCheckedChange = { checked = it })
        Text("Opcion seleccionable")
    }
}

@Composable
fun ComponenteSwitchLab03() {
    var on by remember { mutableStateOf(true) }
    Switch(checked = on, onCheckedChange = { on = it })
}
