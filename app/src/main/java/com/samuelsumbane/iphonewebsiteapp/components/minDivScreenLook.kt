package com.samuelsumbane.iphonewebsiteapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelsumbane.iphonewebsiteapp.ui.theme.btnShapes
import com.samuelsumbane.iphonewebsiteapp.R
import com.samuelsumbane.iphonewebsiteapp.ui.theme.Dodgerblue

@Composable
fun MinDivScreenLook(phonePicName:String, colorPicName:String,
    iphoneVersion: String, subTitle:String, price:String
){
    val context = LocalContext.current
    val imageResource = context.resources.getIdentifier(phonePicName, "drawable", context.packageName)
    val imageResource2 = context.resources.getIdentifier(colorPicName, "drawable", context.packageName)

    Column(
        modifier = Modifier
            .width(250.dp)
            .height(400.dp)
//            .background(Color.LightGray)
    ) {
        val painter: Painter = painterResource(id = imageResource)
        val painter2: Painter = painterResource(id = imageResource2)
        Image(
            painter = painter,
            contentDescription = "divImage",
            modifier = Modifier
                .height(200.dp)
                .size(130.dp)
                .padding(10.dp, 0.dp, 0.dp, 0.dp)
        )

        Image(
            painter = painter2,
            contentDescription = "divImage",
            modifier = Modifier
                .height(34.dp)
                .padding(10.dp),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
//            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Text(iphoneVersion, fontWeight = FontWeight.Bold, fontSize = 17.sp,)

            Spacer(Modifier.height(16.dp))

            Text(subTitle, fontSize = 15.sp)

            Spacer(Modifier.height(10.dp))

            Text(price,fontWeight = FontWeight.SemiBold, fontSize = 12.sp)

            Spacer(Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(containerColor = Dodgerblue, contentColor = Color.White),
                    modifier = Modifier.width(83.dp).padding(0.dp).height(29.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Learn more", fontSize = 12.sp)
                }

                TextButton(
                    onClick = {}
                ){
                    Text("Buy >", fontSize = 12.sp, color = Dodgerblue)
                }

            }
        }
    }
}



//@Preview
//@Composable
//fun P(){
//    MinDivScreenLook( phonePicName = "iphone_15_small_2x", colorPicName = "swatch_iphone_se_small",
//        iphoneVersion = "iPhone 15", subTitle = "a total", price = "From $34"
//    )
//}