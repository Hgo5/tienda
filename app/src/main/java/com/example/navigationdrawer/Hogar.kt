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
fun Hogar(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HOGAR")

                },

                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.azul),
                    titleContentColor = Color.White,
                ),
            )
        },
        content = {innerPadding ->
            LazyColumn(modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.masClarito)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow) )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                    Text(
                        text = "SILLON ECLEPTICO:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(8.dp,8.dp)

                    )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.sillonecleptico
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Practico sillon moderno en rosa chillon perfecto para tu salon de milenial futurista.",
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
                        text = "SILLON MEDIEVAL:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(8.dp,8.dp)
                    )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.sillon
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Bonito sillon con estilo medieval perfecto para cualquier jugador de lol ,con este sillon te sentiras como en juego de tronos.",
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
                        text = "JUEGO DE MESA Y SILLAS:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(8.dp,8.dp)
                    )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.mesa
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Juego de mesa redonda con sillas hecho de contrachapado perfecta para jardin y permite facil desplazamiento de la misma.",
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
                        text = "CAMA DE MATRIMONIO:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(8.dp, 8.dp)
                    )
                    }
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.cama
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Cama de matrimonio en color crema ,sabanas incluidas para que no tengas ni que hacerla.",
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
                        text = "JUEGO MESA Y SILLAS:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(8.dp,8.dp)
                    )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.mesasguapas
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Juego de mesa y sillas en madera de noble tratada con glicerina para mejor mantenimieto de la misma, un chollo vaya.",
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