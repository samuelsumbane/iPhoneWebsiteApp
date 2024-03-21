package com.samuelsumbane.iphonewebsiteapp.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

import com.samuelsumbane.iphonewebsiteapp.R


@Composable
fun ColumnWithTab(){

    Column(
        modifier = Modifier
            .width(250.dp)
            .height(500.dp)
            .background(Lightgray, divShapes.medium)
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.4f),
//            .background(Color.Blue),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(30.dp))
            Text("dsafd", fontWeight = FontWeight.Bold)
            Spacer(Modifier.height(20.dp))
        }
        Divider(
            color = Color.DarkGray,
            thickness = 1.5.dp,
            modifier = Modifier.fillMaxWidth(0.8f).align(Alignment.CenterHorizontally).padding(vertical = 7.dp)
        )
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f)
            .background(Color.Transparent, divShapes.medium),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.airpods__eb24cvhoe26a_small),
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
@Preview
@Composable
fun P(){
    ColumnWithTab()
}