package vipu.srihar.states

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import vipu.srihar.states.ui.theme.StateTest

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var viewModel = ViewModelProvider(this)[stateTestViewModel::class.java]
        setContent {
            StateTest(viewModel)
        }
    }
}

