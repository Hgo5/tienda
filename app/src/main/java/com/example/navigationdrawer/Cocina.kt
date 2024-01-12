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
fun Cocina() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "COCINA")

                },

                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.turquesaosc),
                    titleContentColor = Color.White,
                ),
            )
        },
        content = {innerPadding ->
            LazyColumn(modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.turquesaclar)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {

                    Row  (modifier = Modifier
                        .fillMaxWidth()
                        .background(color = colorResource(id= R.color.shadow) )
                        , horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text(
                            text = "BARILLA:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)

                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.barilla
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Barilla para batir todo tipo de alimentos batibles.",
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
                            text = "PLATO:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.plato
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)
                        )
                        Text(
                            text = "Plato de ceramica en blanco perfecto para comida, la hamburguesa del burguer tambien.",
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
                            text = "CUCHILLO:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.cuchillo
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Cuchillo afilado para cortar todo tipo de alimentos, tener cuidado puede cortar mas de lo que esperas.",
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
                            text = "SARTEN:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp, 8.dp)
                        )
                    }
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.sarten
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Sarten temoresistente de teflón en color aluminio y negro.",
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
                            text = "CACEROLA:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .padding(8.dp,8.dp)
                        )}
                    Row {
                        Image(painter = painterResource(
                            id = R.drawable.cacerola
                        ),
                            contentDescription = "favorito",
                            modifier = Modifier
                                .padding(12.dp, 1.dp)
                                .size(150.dp)

                        )
                        Text(
                            text = "Cacerola de metal ,perfecta para cocer todo lo que quieras hasta al hijo te puedes cocer de lo grande que es.",
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