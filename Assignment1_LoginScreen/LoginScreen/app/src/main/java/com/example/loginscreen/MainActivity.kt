package com.example.loginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                SimpleText()
                SimpleTextField1()
                
                SimpleTextField2()
                SimpleButton()
            }
        }
    }
}

@Composable
fun SimpleText(){
        Text(text = "Login Screen",modifier = Modifier.padding(60.dp),
            fontSize= 25.sp, textAlign= TextAlign.Center,
            style = TextStyle.Default, maxLines = 4)
}

@Composable
@Preview
fun SimpleTextPreview(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        SimpleText()
        Column(modifier=Modifier.fillMaxSize(1f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            SimpleTextField1()
            SimpleTextField2()
            SimpleButton()
        }
    }
}

@Composable
fun SimpleButton(){
    Button(modifier= Modifier
        .padding(16.dp), onClick = {}) {
        Text(text = "SUBMIT")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTextField1(){
    var text by remember{mutableStateOf("")}
    TextField(value = text, onValueChange = {it -> text = it},label={
        Text(text="Username")
    },modifier = Modifier.padding(20.dp))
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTextField2(){
    var text by remember{mutableStateOf("")}
    TextField(value = text, onValueChange = {it -> text = it},label={
        Text(text="Password")
    },modifier = Modifier.padding(20.dp))
}