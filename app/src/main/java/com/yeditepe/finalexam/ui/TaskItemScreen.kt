package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItemScreen() {

    // TODO 1: Create a mutable state to hold completion status (Boolean)
    // Initial value should be false
    val status : Boolean = false
    val status = mutableStateOf(remember(false))

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )

        // TODO 2: Show text "Completed" or "Not Completed"
        // depending on completion state

        Text(
            text = "Completed",
            style = MaterialTheme.typography.titleMedium,
            ),
        Text(
            text = "Not Completed",
            style = MaterialTheme.typography.titleMedium
            )
            

        Button(
            onClick = {
                // TODO 3: Toggle completion state
                onClickStatus = 
            }
        ) {
            Text("Change Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {
    // TODO: Call TaskItemScreen
    
    fun TaskItemScreen(){

        
    }
}
