package com.sample.bookreader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.SyncLock
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.sample.bookreader.model.NavigationModel
import com.sample.bookreader.ui.theme.BookreaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookreaderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    val items = mutableListOf<NavigationModel>().apply {
        add(NavigationModel(Icons.Outlined.SyncLock, R.string.reading_now))
        add(NavigationModel(Icons.Outlined.SyncLock, R.string.recent))
        add(NavigationModel(Icons.Outlined.SyncLock, R.string.favorite))
        add(NavigationModel(Icons.Outlined.SyncLock, R.string.setting))
    }
    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ) {
        val (navigationBar) = createRefs()
        NavigationBarApp(items = items)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BookreaderTheme {
        Content()
    }
}