package com.samuelsumbane.iphonewebsiteapp.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
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
import com.samuelsumbane.iphonewebsiteapp.components.ColumnWithTab
import com.samuelsumbane.iphonewebsiteapp.components.DivScreenLook
import com.samuelsumbane.iphonewebsiteapp.components.MinDivScreenLook
import com.samuelsumbane.iphonewebsiteapp.components.MinTextColumn
import com.samuelsumbane.iphonewebsiteapp.components.SubTitleText
import com.samuelsumbane.iphonewebsiteapp.components.TextColumn
import com.samuelsumbane.iphonewebsiteapp.ui.theme.Dodgerblue
import com.samuelsumbane.iphonewebsiteapp.ui.theme.Lightgray
import com.samuelsumbane.iphonewebsiteapp.ui.theme.divShapes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController){

    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { /*TODO*/ },
                actions = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "test")
//                    Icon(imageVector = Icons.Default., contentDescription = "test")
                    Spacer(Modifier.width(12.dp))
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                },
                navigationIcon = {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "iPhoneIcon")
                }
            )
        }
    ) {paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
        ) {
//            Text(text = "text")

            Column(
                Modifier.fillMaxWidth()
                    .height(110.dp)
                    .padding(0.dp, 20.dp)
                .background(Lightgray),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Get $180-$630 in credit toward iPhone 15 or\n" +
                        "iPhone 15 Pro when you trade in iPhone 11\n" +
                        "or higher", textAlign = TextAlign.Center)
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(15.dp)
            ){
                Text(text="iPhone", color = Color.Black, fontWeight = FontWeight.Bold, fontSize = 36.sp)
                Text(text="Designed to be loved", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(20.dp))

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
                DivScreenLook( "Environment", "Reuse. Repeat.", "environment_small_2x", Color.Black)
            }

            Spacer(Modifier.height(70.dp))

            // very lightgray column
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1800.dp)
                    .background(Lightgray)
                    .padding(0.dp, 20.dp, 0.dp, 0.dp)
            ){
                SubTitleText(text = "Explore the lineup.")

                TextButton(
                    onClick = { /*TODO*/ },
                    Modifier.padding(5.dp)
                ) {
                    Text("Compare all models >", fontSize = 16.sp,
                        color = Dodgerblue)
                }

                Row(modifier = Modifier
                    .padding(15.dp)
                    .horizontalScroll(rememberScrollState())
                ){
                    MinDivScreenLook( phonePicName = "compare_iphone_15_pro_small", colorPicName = "swatch_iphone_se_small",
                        iphoneVersion = "iPhone 15 Pro", subTitle = "The ultimate iPhone", price = "From $999 or $41.62/mo.\nfor 24 mo."
                    )

                    MinDivScreenLook( phonePicName = "compare_iphone_15_small", colorPicName = "swatch_iphone_se_small",
                        iphoneVersion = "iPhone 15", subTitle = "A total powerhouse.", price = "From $799 or $33.29/mo.\nfor 24 mo."
                    )

                    MinDivScreenLook( phonePicName = "compare_iphone_14_medium_2x", colorPicName = "swatch_iphone_se_small",
                        iphoneVersion = "iPhone 14", subTitle = "As amazing as ever.", price = "From $699 or $29.12/mo.\nfor 24 mo."
                    )

                    MinDivScreenLook( phonePicName = "iphone_13_small_2x", colorPicName = "swatch_iphone_se_small",
                        iphoneVersion = "iPhone 14", subTitle = "As amazing as ever.", price = "From $699 or $29.12/mo.\nfor 24 mo."
                    )

                    MinDivScreenLook( phonePicName = "compare_iphone_se_medium_2x", colorPicName = "swatch_iphone_se_small",
                        iphoneVersion = "iPhone SE", subTitle = "Serious power. Serious value.", price = "From $429 or $17.87/mo."
                    )

                }

                /// i'll jump something
                SubTitleText(text = "Take a closer look at\nour latest models.")

                Spacer(modifier = Modifier.height(15.dp))

                Column(
                    Modifier.fillMaxWidth()
                ){

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(670.dp)
                            .padding(15.dp)
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.guided_tour_large),
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
                                colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color.Black )
                            ){
                                Text("Watch the film")
                            }
                        }
                    }

                    SubTitleText("Why Apple is the best\nplace to buy iPhone")
                    Row(Modifier.padding(15.dp)){
                        Text("Shop iPhone >", fontSize = 12.sp, color = Dodgerblue)
                    }
                    Row(
                        Modifier
//                            .fillMaxWidth()
//                            .height(500.dp)
                            .padding(15.dp)
                            .horizontalScroll(rememberScrollState()),
//                            .background(Color.Red)
                    ){
                        // I don't know how, but I can't get this elements padding
                        // I will make manually.

                        MinTextColumn("Get flexible delivery\n and easy pickup.", "Choose two-hour delivery from an Apple Store")
                        Spacer(Modifier.width(15.dp))
                        MinTextColumn("Shop live with a\nSpecialist.", "Let us guide you live video\nand answer all of your questions.")
                        Spacer(Modifier.width(15.dp))
                        MinTextColumn("Get to know your\nnew iPhone.", "Learn how to get the most out of\nyour new iPhone with a free\none-on-Personal Session.")
                        Spacer(Modifier.width(15.dp))
                        MinTextColumn("Explore a shopping\n experience designed\naround you.", "When you shop in the\nApple Store app.")
                    }
                }
            }

            // last white Column
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1900.dp)
                    .background(Color.White)
            ) {
                SubTitleText("iPhone essentials")
                Row(Modifier.padding(15.dp)){
                    Text("Shop iPhone >", fontSize = 12.sp, color = Dodgerblue)
                }

                Row(
                    modifier = Modifier
                        .padding(15.dp)
                        .horizontalScroll(scrollState)
                ){
                    TextColumn(
                        "MagSafe",
                        "Snap on a magnetic case, wallet\n or both. And get fast, efficient \nwireless charging",
                        "Shop MagSafe accessories",
                        "magsafe_small_2x"
                    )
                    Spacer(Modifier.width(15.dp))
                    // I had to put width to them.
                    TextColumn(
                        "AirTag",
                        "Attach one to your keys. Put\nanother in your backpack. if\nthey're misplaced, just use the\n Find My app.",
                         "Buy",
                        "airtag_small_2x"
                    )
                }

                SubTitleText("Significant others.")

                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
                    ColumnWithTab()
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
