package com.example.foodstore.ui.theme


import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.Typography
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.foodstore.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("")}
        var showError by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp)
                .background(color = lightpink),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.fooddelivery),
                contentDescription = "Login Image",
                modifier = Modifier
                    .size(120.dp)
                    .padding(16.dp)
            )
            Text(
                text = "SATVIC FOOD",
                fontWeight = FontWeight.SemiBold,
                fontSize = 32.sp
            )
            Spacer(modifier = Modifier.height(35.dp))
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
            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick ={
                    if(username.isNotBlank() && password.isNotBlank()){
                        navController.navigate("hotellist")
                    }
                    else{
                        showError =true
                    }
                         },
                modifier = Modifier.padding(10.dp),
                shape= RoundedCornerShape(20.dp),
                colors= ButtonDefaults.buttonColors(containerColor = Color.Black,contentColor = lightpink))
            {
                Text(text = "Login", fontSize = 20.sp, textAlign = TextAlign.Center)
            }
            if(showError){
                Text(
                    text = "Please enter both username and password",
                    color = Color.Red,
                    modifier = Modifier.padding(20.dp)
                )
            }
        }
    }
}