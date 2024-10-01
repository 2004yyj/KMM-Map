package com.yyj.maptest

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitView
import cocoapods.NMapsMap.NMFAuthManager
import cocoapods.NMapsMap.NMFMapView
import kotlinx.cinterop.ExperimentalForeignApi

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun MapComponent() {
    UIKitView(
        factory = {
            NMFMapView()
        },
        modifier = Modifier.fillMaxSize()
    )
}