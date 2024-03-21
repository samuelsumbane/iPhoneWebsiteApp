package com.samuelsumbane.iphonewebsiteapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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

@Composable
fun TextColumn(titleText:String, contentText:String, linkText:String, imageName:String){
    val context = LocalContext.current
    val imageResource = context.resources.getIdentifier(imageName, "drawable", context.packageName)

    Column(
       modifier = Modifier
           .width(250.dp)
           .height(600.dp)
           .background(Lightgray, divShapes.medium)
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f),
//            .background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(30.dp))
            Text(titleText, fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(20.dp))
            Text(contentText, fontSize = 11.sp, textAlign = TextAlign.Center)
            Spacer(Modifier.height(25.dp))
            Text(linkText, fontSize = 12.sp, color = Dodgerblue)
            Spacer(Modifier.height(30.dp))
        }


        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f)
            .background(Color.Transparent, divShapes.medium),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            val painter: Painter = painterResource(id = imageResource)
            Spacer(Modifier.fillMaxHeight(0.1f))
            Image(
                painter = painter,
                contentDescription = "divImage",
                modifier = Modifier
                    .width(190.dp)
                    .height(280.dp),
                contentScale = ContentScale.Crop
            )
        }

    }
}

//
//@Preview
//@Composable
//fun Pre(){
//    TextColumn("olalj lljjklj kljj", "mundo", linkText = "Shop MagSafe accessories",  "compare_iphone_15_small")
//}