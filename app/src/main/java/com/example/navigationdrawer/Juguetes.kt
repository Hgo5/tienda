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
fun Juguetes() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "JUGUETES")

                },

                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.verdeosc),
                    titleContentColor = Color.White,
                ),
            )
        },
        content = {innerPadding ->
            LazyColumn(modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.verdeclar)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {

                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow) )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "COCHE DE NIÑOS:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)

                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.coche
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Coche para niños con bateria de 50000 mhp perfecto para recorrer las calles hechando humo.",
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
                            text = "LEGO 'LOS MECANICOS':",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.legos
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Juego de lego con tematica de mecanicos.",
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
                            text = "LEGO MECHANICS 'BUGATTI':",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.bugati
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Bugatti hecho de legos , tu hij@ se divertira montandolo y jugando con el.",
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
                            text = "VEHICULO RADIOCONTROL:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp, 8.dp)
                        )
                    }
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.radiocontrol
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Vehiculo radiocontrol offroad con 2 baterias y mando incluido.",
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
                            text = "MANOLO 'EL TUBERIAS':",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.mario
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Manolo el tuberias , salta y salta encima de plantas carnivoras para poder rescatar a banana de las garras del malvado browser",
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