package vipu.srihar.loginpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUpScreenGoogle(){
    var email: String by remember{ mutableStateOf("") };
    var password: String by remember{ mutableStateOf("") };

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Create Account Using Google Account", style = TextStyle(fontSize = 15.sp))

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField( value = email, onValueChange = {email = it}, label = {
            Text(text="e-mail")
        })

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField( value = password, onValueChange = {password = it}, label = {
            Text(text="password")
        })

        Spacer(modifier = Modifier.height(10.dp))

        Button(colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)), onClick = {}) {
            Text(text ="SignUp", color = Color(0xFFFFFFFF))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSignup(){
    SignUpScreenGoogle()
}