package com.example.foodstore

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.foodstore.ui.theme.Purple80
import com.example.foodstore.ui.theme.darkpurple
import com.example.foodstore.ui.theme.lightpink
import com.example.foodstore.ui.theme.surface
import kotlin.math.round

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun hl1(navController: NavHostController) {
    Surface(color = surface) {
        LazyColumn {
            //header of the hotel list
            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .background(darkpurple), contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Indian Thali",
                        textAlign = TextAlign.Center,
                        fontSize = 34.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.White
                    )
                }
            }
            //items list
            item {
                //food item 1
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
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
                                painter = painterResource(id = R.drawable.masalachanna),
                                contentDescription = "hotel image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(2.dp)
                                    .border(BorderStroke(3.dp, Color.Black),
                                        RectangleShape)
                                    .align(Alignment.CenterVertically)
                            )
                            Column(
                                modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .background(lightpink)
                                    .padding(10.dp)
                                    .align(Alignment.CenterVertically)
                            )
                            {
                                Text(
                                    text = "Masala Channa",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(
                                    text = "This bowlful of mouth watering masala channa is topped with tadka aloo.",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                                Row(modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .background(lightpink)
                                    .padding(5.dp)
                                    ){
                                    Image(
                                        painter = painterResource(id = R.drawable.cartlogo),
                                        contentDescription = "cart image",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .size(35.dp)
                                            .padding(5.dp)
                                    )
                                    Text(text = "120/-", modifier = Modifier.fillMaxWidth().align(Alignment.CenterVertically) )
                                }
                            }
                        }
                    }
                )

                //food item 2
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
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
                                painter = painterResource(id = R.drawable.paneerbiryani),
                                contentDescription = "hotel image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(2.dp)
                                    .border(BorderStroke(3.dp, Color.Black),
                                        RectangleShape)
                                    .align(Alignment.CenterVertically)
                            )
                            Column(
                                modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .background(lightpink)
                                    .padding(10.dp)
                                    .align(Alignment.CenterVertically)
                            )
                            {
                                Text(
                                    text = "Paneer Makhani Biryani",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(
                                    text = "This is biryani in its vegetarian avatar that tastes just as good.",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                                Row(modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .background(lightpink)
                                    .padding(5.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.cartlogo),
                                        contentDescription = "cart image",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .size(35.dp)
                                            .padding(5.dp)
                                    )
                                    Text(text = "225/-", modifier = Modifier.fillMaxWidth().align(Alignment.CenterVertically) )
                                }
                            }
                        }
                    }
                )

                //food item 3
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
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
                                painter = painterResource(id = R.drawable.mushroomkofta),
                                contentDescription = "hotel image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(2.dp)
                                    .border(BorderStroke(3.dp, Color.Black),
                                        RectangleShape)
                                    .align(Alignment.CenterVertically)
                            )
                            Column(
                                modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .background(lightpink)
                                    .padding(10.dp)
                                    .align(Alignment.CenterVertically)
                            )
                            {
                                Text(
                                    text = "Mushroom Kofta",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.SemiBold,
                                    color = Color.Black
                                )
                                Text(
                                    text = "This mushroom recipe is an absolute crowd pleaser ",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    color = Color.Black
                                )
                                Row(modifier = Modifier
                                    .wrapContentHeight()
                                    .fillMaxWidth()
                                    .background(lightpink)
                                    .padding(5.dp)
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.cartlogo),
                                        contentDescription = "cart image",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .size(35.dp)
                                            .padding(5.dp)
                                    )
                                    Text(text = "160/-", modifier = Modifier.fillMaxWidth().align(Alignment.CenterVertically) )
                                }
                            }
                        }
                    }
                )

            }
        }
    }
}