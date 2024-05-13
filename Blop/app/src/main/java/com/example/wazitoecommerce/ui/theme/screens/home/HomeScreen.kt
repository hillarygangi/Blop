package com.example.wazitoecommerce.ui.theme.screens.home

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_PRODUCTS_URL
import com.example.wazitoecommerce.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
          
        ,


        horizontalAlignment = Alignment.CenterHorizontally
    )


    {
        
        Spacer(modifier = Modifier.height(50.dp))
        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
            },
            topBar = {
                     TopAppBar(
                         title = { Text(text = "find the best services") },
                         modifier = Modifier
                             .background(Color.Blue)

                     )
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = {
                        navController.navigate(ADD_PRODUCTS_URL)
                    }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .paint(
                            painterResource(id = R.drawable.b1),
                            contentScale = ContentScale.FillBounds
                        )
                    ,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "Welcom to our 24/7 hours service",
                        fontSize = 40.sp,
                        color = Color.White,

                        fontFamily = FontFamily.Cursive

                    )
                    Column (modifier = Modifier.padding(start = 20.dp)) {
                        Row {
                            Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                                Column {
                                    Box (modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center){
                                        Image(painter = painterResource(id =com.example.wazitoecommerce.R.drawable.style2),
                                            contentDescription ="amazon",
                                            modifier = Modifier.size(70.dp))

                                    }
                                    Text(text = "Upperwage", fontSize = 20.sp, color = Color.Blue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))

                            Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                                Column {
                                    Box (modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center){
                                        Image(painter = painterResource(id =com.example.wazitoecommerce.R.drawable.style3),
                                            contentDescription ="amazon",
                                            modifier = Modifier.size(70.dp))

                                    }
                                    Text(text = "Lowwerwage", fontSize = 20.sp, color = Color.Blue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(50.dp))
                    Column (modifier = Modifier.padding(start = 20.dp)) {
                        Row {
                            Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                                Column {
                                    Box (modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center){
                                        Image(painter = painterResource(id =com.example.wazitoecommerce.R.drawable.style4),
                                            contentDescription ="amazon",
                                            modifier = Modifier.size(70.dp))

                                    }
                                    Text(text = "Stiffwage", fontSize = 20.sp, color = Color.Blue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))

                            Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                                Column {
                                    Box (modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center){
                                        Image(painter = painterResource(id =com.example.wazitoecommerce.R.drawable.style5),
                                            contentDescription ="amazon",
                                            modifier = Modifier.size(70.dp))

                                    }
                                    Text(text = "Curvecut", fontSize = 20.sp, color = Color.Blue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(50.dp))
                    Column (modifier = Modifier.padding(start = 20.dp)) {
                        val mContext = LocalContext.current
                        Row {
                            Card(modifier = Modifier


                                .size(width = 150.dp, height = 100.dp)) {
                                Column {
                                    Box (modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center){
                                        Image(painter = painterResource(id =com.example.wazitoecommerce.R.drawable.style6 ),
                                            contentDescription ="amazon",
                                            modifier = Modifier.size(70.dp))

                                    }
                                    Text(text = "Adjustedcut", fontSize = 20.sp, color = Color.Blue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                                }
                            }
                            Spacer(modifier = Modifier.width(20.dp))

                            Card(modifier = Modifier.size(width = 150.dp, height =100.dp )) {
                                Column (
                                    modifier = Modifier

                                        .size(width = 150.dp, height = 40.dp,))   {
                                    Box (modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center){
                                        Image(painter = painterResource(id =com.example.wazitoecommerce.R.drawable.style1),
                                            contentDescription ="amazon",
                                            modifier = Modifier.size(70.dp))

                                    }
                                    Text(text = "Middlewage", fontSize = 20.sp, color = Color.Blue, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
                                }
                            }

                        }
                    }

                }

            }

        )

    }
}




val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "services",
        route="view_products",
        selectedIcon=Icons.Filled.Build,
        unselectedIcon=Icons.Outlined.Build,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Updates",
        route="home",
        selectedIcon=Icons.Filled.AddCircle,
        unselectedIcon=Icons.Outlined.AddCircle,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "calls",
        route="signup",
        selectedIcon= Icons.Filled.Call,
        unselectedIcon=Icons.Outlined.Call,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)






@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    WazitoECommerceTheme {
        HomeScreen(navController = rememberNavController())
    }
}