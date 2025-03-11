package vipu.srihar.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var navController = rememberNavController()
            NavHost(navController = navController, startDestination="LoginPage"){
                composable("LoginPage"){
                    LoginScreen(navController)
                }

                composable("SignUpGoogle"){
                    SignUpScreenGoogle()
                }
            }
        }
    }
}