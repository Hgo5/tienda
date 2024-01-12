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
fun Ropa() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "ROPA")

                },

                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.grisoscu),
                    titleContentColor = Color.White,
                ),
            )
        },
        content = {innerPadding ->
            LazyColumn(modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.griscla)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {

                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow) )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "ZAPATOS:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)

                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.zapatos
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Zapatos color marron oscuro hecho en fantastica piel ,muy comodos.",
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
                            text = "PANTALONES:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.pantalon
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Pantalon estilo baggy vaquero perfecto para empezar a vestir mejor.",
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
                            text = "SUDADERA:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.sudame
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Sudadera color gris GHD con estilo oversize.",
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
                            text = "CAMISETA:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp, 8.dp)
                        )
                    }
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.camiroja
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Camiseta simple de algodon de color rojo.",
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
                            text = "GORRA:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.gorra
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Gorra roja y negra de obey, con la que podras ser el mas chuleta del barrio.",
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