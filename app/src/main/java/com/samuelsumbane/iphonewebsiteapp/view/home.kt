package com.samuelsumbane.iphonewebsiteapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.room.util.TableInfo
import com.samuelsumbane.iphonewebsiteapp.R
import com.samuelsumbane.iphonewebsiteapp.components.DivScreenLook
import com.samuelsumbane.iphonewebsiteapp.components.MinDivScreenLook
import com.samuelsumbane.iphonewebsiteapp.components.SubTitleText
import com.samuelsumbane.iphonewebsiteapp.ui.theme.Lightgray
import com.samuelsumbane.iphonewebsiteapp.ui.theme.divShapes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController){

    Scaffold(
        topBar = {
            TopAppBar(
                title = { /*TODO*/ },
                actions = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "test")
                }
            )
        }
    ) {paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
        ) {
//            Text(text = "text")
            // black column
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
            ){
                Text(text="iPhone", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 36.sp)
                Text(text="Designed to be loved", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(20.dp))

//            Image(painter = painterResource(id = R.drawable.), contentDescription = "hero_iphone_15_pro")

            SubTitleText(text = "Get to know iPhone")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
//                    .background(Color.Blue)
                    .horizontalScroll(rememberScrollState())
                    .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){

                DivScreenLook( "Advaced Cameras", "Selfie-takers.\nMovie-makers.\nBoundary-breakers.", "camera_small_2x")
                Spacer(Modifier.width(20.dp))
                DivScreenLook( "Apple-Designed Chips", "The kind of fast you\ncan feel", "chip_small_2x")
                Spacer(Modifier.width(20.dp))
                DivScreenLook( "Battery", "The power of great\nbattery life.", "battery_small_2x")
                Spacer(Modifier.width(20.dp))
                DivScreenLook( "Innovation", "Beautiful and durable,\nby design", "innovation_small_2x")
                Spacer(Modifier.width(20.dp))
                DivScreenLook( "Personalize your iPhone", "Make it you.\nThrough and through", "personalize_small_2x")
                Spacer(Modifier.width(20.dp))
                DivScreenLook( "Help of Mind", "Helpful safety\n features. Just in case.", "safety_small_2x")
                Spacer(Modifier.width(20.dp))
                DivScreenLook( "Privacy", "Your data. Just where\nyou want it.", "privacy_small_2x")
                Spacer(Modifier.width(20.dp))
                DivScreenLook( "Environment", "Reuse. Repeat.", "environment_small_2x")
            }

            Spacer(Modifier.height(40.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
                    .background(Lightgray)
            ){
                SubTitleText(text = "Explore the lineup.")

                Row(modifier = Modifier
                    .padding(15.dp)
                    .horizontalScroll(rememberScrollState())
                ){
                    MinDivScreenLook( phonePicName = "iphone_15_small_2x", colorPicName = "swatch_iphone_se_small",
                        iphoneVersion = "iPhone 15", subTitle = "a total", price = "From $34"
                    )
                    MinDivScreenLook( phonePicName = "iphone_15_small_2x", colorPicName = "swatch_iphone_se_small",
                    iphoneVersion = "iPhone 15", subTitle = "a total", price = "From $34"
                    )
                    MinDivScreenLook( phonePicName = "iphone_15_small_2x", colorPicName = "swatch_iphone_se_small",
                        iphoneVersion = "iPhone 15", subTitle = "a total", price = "From $34"
                    )
                }
            }

            /// i'll jump something
            SubTitleText(text = "Take a closer look at\nour latest models.")

            Spacer(modifier = Modifier.height(15.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(670.dp)
                    .padding(15.dp)
//                    .background(Color.Red)
            ){
                Image(
                    painter = painterResource(id = R.drawable.guided_tour__c40f88on9o8y_xlarge),
                    contentDescription = "latest models",
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(15.dp)
                        .clip(divShapes.large),
                    contentScale = ContentScale.FillHeight
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally

                ){
                    Text("A Guided Tour of\niPhone 15 & iPhone 15 Pro",
                        textAlign = TextAlign.Center, color = Color.White,
                        fontWeight = FontWeight.Bold, fontSize = 19.sp,
                        modifier = Modifier.padding(0.dp, 45.dp, 0.dp, 30.dp)
                    )

                    Button(
                        onClick = {},
//                        colors = ButtonColors(Color.LightGray, Color.Red, Color.DarkGray, Color.White)
                            colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color.Black )
                        ){
                        Text("Watch the film")
                    }
                }
            }


        }
    }

}

@Preview
@Composable
fun P(){
    val navController = rememberNavController()
    Home(navController)
}
