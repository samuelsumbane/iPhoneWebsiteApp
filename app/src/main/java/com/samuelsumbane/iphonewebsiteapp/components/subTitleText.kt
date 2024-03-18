package com.samuelsumbane.iphonewebsiteapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubTitleText(text: String){
    Text(
        text, fontWeight = FontWeight.Bold,
        fontSize = 26.sp, modifier = Modifier.padding(20.dp)
    )
}

