package vipu.srihar.navigationlearn

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
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination =Routes.ScreenA){
                composable(Routes.ScreenA){
                    ScreenA(navController)
                }
                composable(Routes.ScreenB+"/{name}"){
                    var name = it.arguments?.getString("name")
                    ScreenB(name?:"No name")
                }
            }

        }
    }

}

