package ContextMenu

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.singleWindowApplication

fun main() = singleWindowApplication(title = "Context menu") {
    val text = remember { mutableStateOf("Hello!") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it },
        label = { Text(text = "Input") }
    )
}

//Puedes copiar el texto
//import androidx.compose.foundation.text.selection.SelectionContainer
//import androidx.compose.material.Text
//import androidx.compose.ui.window.singleWindowApplication
//
//fun main() = singleWindowApplication(title = "Context menu") {
//    SelectionContainer {
//        Text("Hello World!")
//    }
//}