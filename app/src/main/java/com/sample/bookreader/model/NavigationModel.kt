package com.sample.bookreader.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class NavigationModel(
    @DrawableRes val iconRes: Int,
    @StringRes val stringRes: Int
)
