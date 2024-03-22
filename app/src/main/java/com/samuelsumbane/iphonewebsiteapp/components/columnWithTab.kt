package com.samuelsumbane.iphonewebsiteapp.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
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
fun ColumnWithTab(){

    val minSize = 70
    val maxSize = 200
    var columnState1 = "open" // Define column state, if is closed or open.
    var columnState2 = "open" // Define column state, if is closed or open.


    var size1 = 1 // first row inicial size
    var size2 = 1 // second row inicial size
    var size3 = 1 // third row inicial size

    if(columnState1 == "open"){
        size1 = maxSize
        size2 = minSize
        size3 = minSize
    }else if(columnState2 == "open"){
        size1 = minSize
        size2 = maxSize
        size3 = minSize
    }else{
        size1 = minSize
        size2 = minSize
        size3 = maxSize
    }


    Column(
        modifier = Modifier
            .width(250.dp)
//            .height(300.dp)
            .background(Lightgray, divShapes.medium)
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(size1.dp)
            .background(Color.Blue, divShapes.medium)
        ) {
            Column(
                Modifier.fillMaxWidth(0.85f)
                    .fillMaxHeight().background(Color.Red, divShapes.medium)
            ){

            }
            //
            IconButton(onClick = {
                    println("clicked 1 one")
                },
                Modifier.align(Alignment.CenterVertically)
            ){
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
            }
        }

        Divider(
            color = Color.DarkGray, thickness = 1.5.dp,
            modifier = Modifier.fillMaxWidth(0.8f).align(Alignment.CenterHorizontally).padding(vertical = 7.dp)
        )


        Row(modifier = Modifier
            .fillMaxWidth()
            .height(size2.dp)
            .background(Color.Transparent, divShapes.medium)
        ){
            Column(
                Modifier.fillMaxWidth(0.85f)
                    .fillMaxHeight().background(Color.Red, divShapes.medium)
            ){

            }
            //
            IconButton(onClick = {
                println("clicked 1 one")
            },
                Modifier.align(Alignment.CenterVertically)
            ){
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
            }
        }

        Divider(
            color = Color.DarkGray, thickness = 1.5.dp,
            modifier = Modifier.fillMaxWidth(0.8f).align(Alignment.CenterHorizontally).padding(vertical = 7.dp)
        )


        Row(modifier = Modifier
            .fillMaxWidth()
            .height(size3.dp)
            .background(Color.Transparent, divShapes.medium)
        ){
            Column(
                Modifier.fillMaxWidth(0.85f)
                    .fillMaxHeight().background(Color.Red, divShapes.medium)
            ){

            }
            //
            IconButton(onClick = {
                println("clicked 1 one")
            },
                Modifier.align(Alignment.CenterVertically)
            ){
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
            }
        }

    }
}

//
@Preview
@Composable
fun P(){
    ColumnWithTab()
}