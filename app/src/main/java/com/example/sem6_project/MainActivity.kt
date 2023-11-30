package com.example.sem6_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.sem6_project.ui.theme.Sem6_projectTheme
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sem6_projectTheme {
                Column {
                    Text(text = "Texting time", style = MaterialTheme.typography.displayLarge, fontWeight = FontWeight.Bold)
                    Text(text = "Texting time", style = MaterialTheme.typography.displayLarge, fontWeight = FontWeight.Normal)
                    Text(text = "Texting time", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Light)
                    Text(text = "Texting time", style = MaterialTheme.typography.displayLarge)
                }
            }
        }
    }
}


@Composable
fun Login()
{

}

@Preview
@Composable
fun loginpreview()
{
    Login()
}
