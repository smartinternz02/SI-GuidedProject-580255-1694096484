package com.example.foodstore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.foodstore.ui.theme.hotellist
import com.example.foodstore.ui.theme.loginScreen

@Composable
fun MyApp(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "loginScreen"
    ){
        composable("loginScreen"){loginScreen(navController) }
        composable("hotellist"){hotellist(navController)}
        composable("hl1"){hl1(navController)}
        composable("hl2"){hl2(navController)}
        composable("hl3"){hl3(navController)}
    }
}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationTheme {

    }
}

@Composable
fun NavigationTheme(function: () -> Unit) {

}
