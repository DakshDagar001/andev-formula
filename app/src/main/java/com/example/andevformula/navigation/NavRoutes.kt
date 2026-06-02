package com.example.andevformula.navigation

import kotlinx.serialization.Serializable


@Serializable
sealed class NavRoutes {

    @Serializable
    object NavHome : NavRoutes()
    @Serializable
    object NavDetails : NavRoutes()

}