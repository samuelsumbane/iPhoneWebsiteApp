package com.samuelsumbane.iphonewebsiteapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelsumbane.iphonewebsiteapp.ui.theme.divShapes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import com.samuelsumbane.iphonewebsiteapp.ui.theme.btnShapes
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun DivScreenLook(titleText:String, contentText:String, imageName:String, textColor: Color = Color.White){

    val context = LocalContext.current
    val imageResource = context.resources.getIdentifier(imageName, "drawable", context.packageName)

    Box(
        modifier = Modifier
            .width(250.dp)
            .height(550.dp)
            .background(Color.LightGray, divShapes.large)

    ) {
        val painter: Painter = painterResource(id = imageResource)

        Image(
            painter = painter,
            contentDescription = "divImage",
            modifier = Modifier
                .fillMaxSize()
                .clip(divShapes.large),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Set box image
            Column(modifier = Modifier.height(200.dp)){
                Text(
                    titleText,
                    color = textColor,
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    contentText,
                    color = textColor,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalAlignment = Alignment.End
            ){
                IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.background(Color.DarkGray, btnShapes.large)
                    ) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "add button", tint = Color.White)
                }
            }
        }
    }

}

//@Preview
//@Composable
//fun PreviewDivScreenLook() {
////        DivScreenLook( "ola", "fadafdasf fasdf",  imageName = "camera__cerpczobiwwi_small")
//        DivScreenLook( "ola", "fadafdasf fasdf")
//}
