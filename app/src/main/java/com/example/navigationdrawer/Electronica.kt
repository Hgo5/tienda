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
fun Electronica() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "ELECTRONICA")

                },

                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.morau),
                    titleContentColor = Color.White,
                ),
            )
        },
        content = {innerPadding ->
            LazyColumn(modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.rosita)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {

                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow) )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "SONY PLAYSTATION 5 SLIM:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)

                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.ps5
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Consola de ultima generacion perfecta para jugar a tus juegos favoritos con los controles sensitivos.",
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
                            text = "CASCOS BLUETOOTH:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.cascos
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Cascos ergonomicos con cancelacion de ruido y almohadilla adaptativa.",
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
                            text = "NINTENDO SWITCH:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.nintendo
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Fantastica consola portatil que tambien se conecta a la pantalla grande y que te permite jugar con mas gente al mismo tiempo a juegos miticos. ",
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
                            text = "ALTAVOZ:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp, 8.dp)
                        )
                    }
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.altavoz
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Altavoz Ey perfecto para escapadas ,sonido envolvente y bajos espectaculares.",
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
                            text = "TECLADO RETRO:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.tecladoretro
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Teclado retro ,para los amantes de los 2000 la epoca dorada de los ordenadores, no pases de esta oportunidad y guarda este estilo tan retro",
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