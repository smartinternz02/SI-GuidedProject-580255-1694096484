package com.example.logintowebsite

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val radioOptions = listOf(
        "Google",
        "Youtube",
        "Amazon",
        "Swiggy")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[2]) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color(0xFFf5f5dc)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Login Image",
            modifier = Modifier
                .size(120.dp)
                .padding(16.dp)
        )
        Text(
            text = "Login to Website",
            style = MaterialTheme.typography.headlineMedium.copy(
                color = Color(0xFF250510)
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = username, onValueChange = { username = it },
            label = { Text(text = "Username") },
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = password, onValueChange = { password = it },
            label = { Text(text = "Password") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )
        Spacer(modifier = Modifier.height(64.dp))
        radioOptions.forEach {text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = { onOptionSelected(text) }
                    )
                    .padding(horizontal = 16.dp)
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    modifier = Modifier.padding(all = Dp(value = 8F)),
                    onClick = {
                        onOptionSelected(text)
                        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
                    }
                )
                Text(
                    text = text,
                    modifier = Modifier.padding(start = 16.dp),
                    fontSize = 20.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        val url1 ="https://www.google.com/"
        val url2 ="https://www.youtube.com/"
        val url3 ="https://www.amazon.com/"
        val url4 ="https://www.swiggy.com"
        val openWebsite =
            rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { }
        Button(onClick = {
            if (selectedOption == "Google") {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url1))
                openWebsite.launch(intent)
            } else if (selectedOption == "Youtube") {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url2))
                openWebsite.launch(intent)
            } else if (selectedOption == "Amazon") {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url3))
                openWebsite.launch(intent)
            } else if (selectedOption == "Swiggy") {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url4))
                openWebsite.launch(intent)
            }
        },colors= ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = Color.White)){
            Text(text = "Login",textAlign = TextAlign.Center)
        }
    }
}



//            Button(onClick = {
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse(selectedOption)
//            try {
//                context.startActivity(intent)
//            } catch (e: ActivityNotFoundException) {
//                Toast.makeText(context, "No web browser available", Toast.LENGTH_LONG).show()
//            }}, modifier = Modifier.fillMaxSize()) {
//            Text(text = "Login")
//        }