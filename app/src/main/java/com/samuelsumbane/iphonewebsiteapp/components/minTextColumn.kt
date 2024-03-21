package com.samuelsumbane.iphonewebsiteapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samuelsumbane.iphonewebsiteapp.ui.theme.btnShapes
import com.samuelsumbane.iphonewebsiteapp.ui.theme.divShapes

@Composable
fun MinTextColumn(titleText:String, contentText:String){
    Column(
        modifier = Modifier
            .width(220.dp)
            .height(220.dp)
            .background(Color.White, divShapes.medium),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(Modifier.height(20.dp))
        Text(titleText, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(10.dp))
        Text(contentText, fontSize = 14.sp)
        Spacer(Modifier.height(65.dp))

        Row(Modifier.fillMaxWidth(0.8f).height(30.dp),
            horizontalArrangement = Arrangement.End){
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.background(Color.DarkGray, btnShapes.large).width(30.dp)
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "add button", tint = Color.White)
            }
        }
    }
}



//@Preview
//@Composable
//fun P(){
//    MinTextColumn("Get flexible delivery\n and easy pickup", "dfasf sdfka fa")
//}