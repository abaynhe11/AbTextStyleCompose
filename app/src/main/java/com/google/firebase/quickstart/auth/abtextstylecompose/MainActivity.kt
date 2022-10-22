package com.google.firebase.quickstart.auth.abtextstylecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.GenericFontFamily
import androidx.compose.ui.text.font.SystemFontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.google.firebase.quickstart.auth.abtextstylecompose.ui.theme.AbTextStyleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              AbTextStyle()
        }
    }
}


@Composable
fun AbTextColor()
{
    Text(
        text = "Text with Color",
        style = TextStyle(color = Color.Red)
    )
}

@Composable
fun  AbBackgroundColor()
{
    Text(
        text = "Text with Background Color",
        style = TextStyle(background = Color.Yellow)
    )
}
@Composable
fun AbShadow()
{
    Text(
        text = "Text with Shadow",
        style = TextStyle(
            shadow = Shadow(
                color = Color.Black,
                offset = Offset(5f, 5f),
                blurRadius = 5f
            )
        )
    )
}

@Composable
fun AbFontFamily()
{
      Text(
        text = "Text with custom font",
        style = TextStyle(fontSize = 20.sp, fontFamily = androidx.compose.ui.text.font.FontFamily.Cursive)
    )
}

@Composable
fun AbFontSize()
{
    Text(
        text = "Text with big font size",
        style = TextStyle(fontSize = 30.sp)
    )
}

@Composable
fun AbFontStyle()
{
    Text(
        text = "Text with Italic text",
        style = TextStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic)
    )
}

@Composable
fun AbTextDecoration()
{
    Column {
        Text(
            text = "Text with Underline",
            style = TextStyle(
                color =  Color.Black, fontSize = 24.sp,
                textDecoration = TextDecoration.Underline
            )
        )
        Text(
            text = "Text with Strike",
            style = TextStyle(
                color =  Color.Blue, fontSize = 24.sp,
                textDecoration = TextDecoration.LineThrough
            )
        )
    }
}

@Composable
fun AbTextHeadingStyle() {
    Column(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Text(
            text = "Heading 3",
            style = MaterialTheme.typography.h3
        )
        Text(
            text = "Heading 4",
            style = MaterialTheme.typography.h4
        )
        Text(
            text = "Heading 5",
            style = MaterialTheme.typography.h5
        )
    }
}
@Composable
fun AbTextStyle()
{
    Column {
        AbTextColor()
        AbBackgroundColor()
        AbShadow()
        AbFontFamily()
        AbFontSize()
        AbFontStyle()
        AbTextDecoration()
        AbTextHeadingStyle()
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun defaultPreview()
{
    AbTextStyle()
}