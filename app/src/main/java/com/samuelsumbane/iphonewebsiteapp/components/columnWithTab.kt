package com.samuelsumbane.iphonewebsiteapp.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelsumbane.iphonewebsiteapp.ui.theme.Dodgerblue
import com.samuelsumbane.iphonewebsiteapp.ui.theme.Lightgray
import com.samuelsumbane.iphonewebsiteapp.ui.theme.divShapes

import com.samuelsumbane.iphonewebsiteapp.R



@Composable
fun titleAndTextColumn(title:String, text:String, imageName:String, imageResolution:String = "medium"){

    // imageResolution can be small or medium

    val context = LocalContext.current
    val imageResource = context.resources.getIdentifier(imageName, "drawable", context.packageName)

    val painter: Painter = painterResource(id = imageResource)

    Column(
        Modifier
            .fillMaxWidth(0.9f)
            .fillMaxHeight()
            .background(Lightgray, divShapes.medium)
            .padding(start = 10.dp, top = 12.dp),

        ){
        Text(title, fontSize = 16.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)
        Spacer(Modifier.height(15.dp))
        Text(text, fontSize = 11.2.sp)

        Spacer(Modifier.fillMaxHeight(0.06f))
        if(imageResolution == "small"){
            Image(
                painter = painter,
                contentDescription = "divImage",
                modifier = Modifier
                    .width(190.dp)
                    .height(110.dp)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Crop
            )
        }else{
            Image(
                painter = painter,
                contentDescription = "divImage",
                modifier = Modifier
                    .width(210.dp)
                    .height(280.dp)
                    .background(Lightgray)
                    .align(Alignment.CenterHorizontally),
                contentScale = ContentScale.Crop
            )
        }
    }
}

//@Composable
//fun SpandButton(){ // to open or close a tab
//    IconButton(
//        onClick = {
//            println("clicked 1 one")
//        },
//    ){
//        Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
//    }
//}

@Composable
fun Cdivider(){ // to divide the column
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        Divider(
            color = Color.DarkGray, thickness = 1.5.dp,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(vertical = 7.dp),
        )
    }

}

@Composable
fun ColumnWithTab(){

    val minSize = 55
    val maxSize = 400
    val secondColumnMaxsize = 510
    val thirdColumnMaxsize = 450
    var columnState1 = "open" // Define column state, if is closed or open.
    var columnState2 = "closed" // Define column state, if is closed or open.
//    var columnState1 by remember { mutableStateOf("open") }
//    var columnState2 by remember { mutableStateOf("closed") }


    var size1 = 1 // first row inicial size
    var size2 = 1 // second row inicial size
    var size3 = 1 // third row inicial size

    if(columnState1 == "open"){
        size1 = maxSize
        size2 = minSize
        size3 = minSize
    }else if(columnState2 == "open"){
        size1 = minSize
        size2 = secondColumnMaxsize
        size3 = minSize
    }else{
        size1 = minSize
        size2 = minSize
        size3 = thirdColumnMaxsize
    }

    @Composable
    fun SpandButton(){ // to open or close a tab
        IconButton(
            onClick = {
                println("clicked") // not working now.
            },
        ){
            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
        }
    }

    Column(
        modifier = Modifier
            .width(300.dp)
//            .height(300.dp)
            .background(Lightgray, divShapes.medium)
    ){
        // first row (iPhone and Mac)
        Row(modifier = Modifier.fillMaxWidth()
            .height(size1.dp).padding(8.dp, 8.dp, 2.dp, 2.dp)
            .background(Color.Transparent, divShapes.medium)
        ) {
            titleAndTextColumn("iPhone and Mac", "You can answer calls or messages form\n" +
                    "your iPhone directly on your Mac. Copy images, video, or text from you iPhone,\n" +
                    "then past into another app on your nearby Mac. and with iCloud, you can\n" +
                    "access your favorite files from either your iPhone or Mac.", "mac_small_2x",
                "small"
            )
            SpandButton()
        }

        Cdivider()

//      second row (iPhone and Apple Watch)
        Row(modifier = Modifier.fillMaxWidth()
            .height(size2.dp).padding(8.dp, 0.dp, 2.dp, 0.dp)
            .background(Color.Transparent, divShapes.medium)
        ){
            titleAndTextColumn("iPhone and \nApple Watch", "Misplaced your iPhone? The latest\n" +
                    "Apple Watch models can show you its\n" +
                    "approximate distance and direction. To\n" +
                    "set up a group photo on your iPhone, join the group and use Apple Watch as a \n" +
                    "viewfinder to snap the shot. And, when\n" +
                    "you take a call on your Apple Watch, just\n" +
                    "tap your iPhone to continue the\n" +
                    "conversation there.", "watch_small_2x"
            )
            SpandButton()
        }

        Cdivider()

//      third row
        Row(modifier = Modifier.fillMaxWidth()
            .height(size3.dp).padding(8.dp, 0.dp, 2.dp, 0.dp)
            .background(Color.Transparent, divShapes.medium)
        ) {
            titleAndTextColumn(
                "iPhone and AirPods", "Set up AirPods on iPhone with just a tap.\n" +
                        "You'll love Adaptive Audio, which automatically tailors the noise control to\n" +
                        "provide the best listening experience\n" +
                        "accross different environments and interactions throughout the day.",
                "airpods_small_2x"
            )
            SpandButton()
        }
    }
}

//@Preview
//@Composable
//fun P(){
//    ColumnWithTab()
//}