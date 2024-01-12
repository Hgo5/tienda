package com.example.navigationdrawer


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Decoracion() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "DECORACION")
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.naranjaosc),
                    titleContentColor = Color.White,
                ),
            )
        },
        content = {innerPadding ->
            LazyColumn(modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.naranjaclaro)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow) )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "GLOBO TERRAQUEO:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.globo
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Globo terraqueo decorativo para hacerte el inteligente e interesante cuando haya visitas.",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 40.dp)
                        )
                    }
                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow)  )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "BUDA:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.buda
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Buda para la entrada de la casa que siempre queda bien.",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 40.dp)
                        )
                    }
                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow)  )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "CUBO:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.cubo
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Cubo dentro de cubo juega con las perspectivas y tu cabeza.",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 40.dp)
                        )
                    }
                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow)   )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "GORILA:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp, 8.dp)
                        )
                    }
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.gorila
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Pieza de coleccion con forma de gorila con muchos colores pastel.",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 40.dp)
                        )
                    }
                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow)  )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "SUJETA BOTELLAS:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.pulpo
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Pulpo agarra botellas y no las suelta , no vas a volver a verla , elemento decorativo.",
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp, 40.dp)
                        )
                    }



                }
            }
        }

    )
}