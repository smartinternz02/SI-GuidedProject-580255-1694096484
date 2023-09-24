package com.example.foodstore.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.foodstore.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun hotellist(navController: NavHostController) {
    Surface(color = surface) {
        LazyColumn{
            //header of the hotel list
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(darkpurple)
                , contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "RESTAURANTS",
                        textAlign = TextAlign.Center,
                        fontSize = 34.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                }
            }
            //hotels list
            item{
                //hotel 1
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                    navController.navigate("hl1")
                    },
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                    ),
                    border = BorderStroke(2.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,
                    ),
                    shape = RoundedCornerShape(16.dp),
                    content = {
                        Row(
                            //verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.punjabithali),
                                contentDescription = "hotel image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(5.dp)
                            )
                            Column ( modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp))
                            {
                                Text(
                                    text = "Indian Thali",
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(text ="All Indian specials available here " ,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black)
                            }
                        }
                    }
                )

                //hotel 2
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                        navController.navigate("hl2")
                    },
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                    ),
                    border = BorderStroke(2.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,
                    ),
                    shape = RoundedCornerShape(16.dp),
                    content = {
                        Row(
                            //verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.tastyveggie),
                                contentDescription = "hotel image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(5.dp)
                            )
                            Column ( modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp))
                            {
                                Text(
                                    text = "Tasty Veggie",
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(text ="Especially for Vegetarians, here is tasty veggie" ,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black)
                            }
                        }
                    }
                )

                //hotel 3
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                        navController.navigate("hl3")
                    },
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                    ),
                    border = BorderStroke(2.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,
                    ),
                    shape = RoundedCornerShape(16.dp),
                    content = {
                        Row(
                            //verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.urbankitchen),
                                contentDescription = "hotel image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(5.dp)
                            )
                            Column ( modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp))
                            {
                                Text(
                                    text = "Urban Kitchen",
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(text ="Urban Kitchen offers you multiple cusines for your tastebuds" ,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black)
                            }
                        }
                    }
                )

                //hotel 4
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    ,
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer
                    ),
                    border = BorderStroke(2.dp, Color.Black),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp,
                    ),
                    shape = RoundedCornerShape(16.dp),
                    content = {
                        Row(
                            //verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.grandlogo),
                                contentDescription = "hotel image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(5.dp)
                            )
                            Column ( modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(lightpink)
                                .padding(10.dp))
                            {
                                Text(
                                    text = "Grand ABC",
                                    fontSize = 30.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(text ="A to Z all items available for the perfect feast" ,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black)
                            }
                        }
                    }
                )

            }
        }
    }
}