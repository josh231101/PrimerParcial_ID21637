package com.example.ajedrez

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ajedrez.ui.theme.AjedrezTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AjedrezTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Ajedrez()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun Ajedrez() {
    val context = LocalContext.current
    var whiteWins: Boolean by remember {
        mutableStateOf(false)
    }
    var blackWins: Boolean by remember {
        mutableStateOf(false)
    }
    var showErrorMessage: Boolean by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(Color(0xFFFFFFFF)),
        horizontalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier.padding(30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .width(250.dp)
                    .height(300.dp),
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    ) {
                        if (!blackWins) {
                            Image(
                                modifier = Modifier.clickable {
                                    Toast
                                        .makeText(context, "Soy un torre blanca", Toast.LENGTH_LONG)
                                        .show()
                                },
                                painter = painterResource(id = R.drawable.black_rook),
                                contentDescription = "Torre negra"
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    ) {
                        if (blackWins) {
                            Image(
                                painter = painterResource(id = R.drawable.black_rook),
                                contentDescription = "Torre negra",
                                modifier = Modifier.clickable {
                                    Toast
                                        .makeText(context, "Soy una torre blanca", Toast.LENGTH_LONG)
                                        .show()
                                }
                            )
                        }
                    }
                }
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    ) {
                        if (whiteWins) {
                            Image(
                                painter = painterResource(id = R.drawable.white_queen),
                                contentDescription = "Dama Blanca",
                                modifier = Modifier.clickable {
                                    Toast
                                        .makeText(context, "Soy una dama negra", Toast.LENGTH_LONG)
                                        .show()
                                }
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    ) {
                        if (!whiteWins) {
                            Image(
                                painter = painterResource(id = R.drawable.white_queen),
                                contentDescription = "Dama Blanca",
                                modifier = Modifier.clickable {
                                    Toast
                                        .makeText(context, "Soy una dama blanca", Toast.LENGTH_LONG)
                                        .show()
                                }
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )

                }
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.black_pawn),
                            contentDescription = "Peon Negro",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un peón negro", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )

                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.white_pawn),
                            contentDescription = "Peon blanco",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un peón blanco", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )

                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                }
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.black_pawn),
                            contentDescription = "Peon Negro",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un peón negro", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )

                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.white_pawn),
                            contentDescription = "Peon blanco",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un peón blanco", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )
                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                }
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.black_king),
                            contentDescription = "Rey Negro",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un rey negro", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )
                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.black_pawn),
                            contentDescription = "Peon Negro",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un peón negro", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )
                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    )
                    Box(
                        modifier = Modifier
                            .background(Color(0xFF69B00B))
                            .size(50.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.white_pawn),
                            contentDescription = "Peon Blanco",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un peón blanco", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )

                    }
                    Box(
                        modifier = Modifier
                            .background(Color(0xFFFFE4C4))
                            .size(50.dp)
                    ) {
                        Image(painter = painterResource(id = R.drawable.whie_king),
                            contentDescription = "Rey Blanco",
                            modifier = Modifier.clickable {
                                Toast
                                    .makeText(context, "Soy un rey blanco", Toast.LENGTH_LONG)
                                    .show()
                            }
                        )

                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Anatholy Karpov vs Gary Kasparov")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Rusia 1993", fontStyle = FontStyle.Italic)
            Spacer(modifier = Modifier.height(20.dp))
            if (showErrorMessage) {
                Text(text = "Ya hay un ganador. Favor de dar clic en Reiniciar", color = Color.Red)
            }
            if (whiteWins) {
                Text(text = "Ganan las blancas", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            if (blackWins) {
                Text(text = "Ganan las negras", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(horizontalArrangement = Arrangement.Center) {
                Button(onClick = {
                    if (whiteWins || blackWins) {
                        showErrorMessage = true
                    }
                    if (!showErrorMessage) whiteWins = !whiteWins
                }) {
                    Text(text = "Juegan Blancas")
                }
                Spacer(modifier = Modifier.width(20.dp))
                OutlinedButton(onClick = {
                    if (whiteWins || blackWins) {
                        showErrorMessage = true
                    }
                    if (!showErrorMessage){
                        blackWins = !blackWins
                        Toast
                            .makeText(
                                context,
                                "Las blancas se rinden, ¡Kasparov es campeón!",
                                Toast.LENGTH_LONG
                            )
                            .show()
                    }

                }) {
                    Text(text = "Juegan Negras")
                }

            }
            Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.Bottom)
            {
                Button(onClick = {
                    showErrorMessage = false
                    whiteWins = false
                    blackWins = false
                }, modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Reiniciar")
                }
            }
        }
    }
}