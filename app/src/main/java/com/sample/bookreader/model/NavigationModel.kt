package com.sample.bookreader.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationModel(
    val icon: ImageVector,
    @StringRes val nameRes: Int
)
