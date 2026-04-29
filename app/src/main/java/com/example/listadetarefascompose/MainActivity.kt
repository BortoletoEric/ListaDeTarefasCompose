package com.example.listadetarefascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.listadetarefascompose.ui.theme.ListaDeTarefasComposeTheme
import com.example.listadetarefascompose.view.ListTask
import com.example.listadetarefascompose.view.SaveTask

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaDeTarefasComposeTheme {

                val navControler = rememberNavController()

                NavHost(navController = navControler, startDestination = "taskList") {
                    composable(route = "taskList") {
                        ListTask(navControler)
                    }
                    composable(route = "saveTask") {
                        SaveTask(navControler)
                    }
                }
            }
        }
    }
}