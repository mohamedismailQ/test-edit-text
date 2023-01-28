package com.example.jetbackcomposcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetbackcomposcourse.ui.theme.JetbackComposCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.hh, FontWeight.ExtraLight)
        )
        setContent{
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF101010))
                    .padding(top = 350.dp, start = 16.dp, end = 16.dp)){
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Yellow,
                                    fontSize = 40.sp,

                                    )
                            ){
                                append("I")
                            }
                            append("ts The ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Yellow,
                                    fontSize = 40.sp,

                                    )
                            ){
                                append("W")
                            }
                            append("ay You See Thing")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Yellow,
                                    fontSize = 40.sp,

                                    )
                            ){
                                append("s")
                            }
                        },
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = fontFamily,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline)
            }
        }


        }
    }

