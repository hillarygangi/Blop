package com.example.wazitoecommerce.ui.theme.screens.activity1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun Activity1Screen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.white),
                contentScale = ContentScale.FillBounds
            )
        ,


        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = " Eshop",
            fontSize = 80.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )
        Text(
            text = " We help you add your products and view also available products",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(30.dp))
        Image(painter = painterResource(id = R.drawable.untitled), contentDescription = "Shop here" )


    }
}

@Composable
@Preview(showBackground = true)
fun Activity1ScreenPreview() {
    WazitoECommerceTheme {
        Activity1Screen(navController = rememberNavController())
    }
}