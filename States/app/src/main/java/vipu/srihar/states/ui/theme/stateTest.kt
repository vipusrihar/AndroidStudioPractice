package vipu.srihar.states.ui.theme
import androidx.compose.runtime.livedata.observeAsState

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import vipu.srihar.states.stateTestViewModel

@Composable
fun StateTest(viewModel: stateTestViewModel){
    val name by viewModel.name.observeAsState(initial = "")

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        FixedWord(name)
        AddedWord(name, onNameChange = {viewModel.onNameUpdate(it)})
    }
}

@Composable
fun FixedWord(name: String){
    Text(text="Hello, $name", style = TextStyle(fontSize = 20.sp))
}

@Composable
fun AddedWord(name:String, onNameChange:(String)-> Unit){
    OutlinedTextField(value = name,
        onValueChange = {onNameChange(it)},
        label={Text(text = "Your Name")})
}