package com.sample.bookreader

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import com.sample.bookreader.model.NavigationModel

@Composable
fun NavigationBarApp(items: MutableList<NavigationModel>) {
    val context = LocalContext.current
    var selectedItem by remember { mutableIntStateOf(0) }

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = "") },
                label = { Text(context.getString(item.nameRes)) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}