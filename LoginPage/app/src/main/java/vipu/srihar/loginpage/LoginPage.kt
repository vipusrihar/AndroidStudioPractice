package vipu.srihar.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun LoginScreen(navController: NavController){

    var username: String by remember { mutableStateOf("")}

    var password: String by remember { mutableStateOf("")}

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter =  painterResource(id = R.drawable.login),
            contentDescription = "Image of Login",
            modifier = Modifier.size(100.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "E-Library")

        Spacer(modifier = Modifier.height(40.dp))


        OutlinedTextField(
            value = username,
            onValueChange = { username = it} ,
            label = {
            Text(text = "UserName")
        })

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            visualTransformation = PasswordVisualTransformation(),
            label = {
            Text(text = "Password")
        })

        Spacer(modifier = Modifier.height(10.dp))

        Button(colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000)), onClick = { }){
            Text(text = "Login",color = Color(0xFFFFFFFF))
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Forgot Password", modifier = Modifier.clickable{})

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "SignUp With")

        Spacer(modifier = Modifier.height(10.dp))


        Image(painter = painterResource(id = R.drawable.google), contentDescription = "google", modifier = Modifier
                .size(50.dp)
                .clickable {
                    navController.navigate("SignUpGoogle")
                }
        )


    }

}