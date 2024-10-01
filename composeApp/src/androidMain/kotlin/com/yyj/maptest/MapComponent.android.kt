package com.yyj.maptest

import androidx.compose.runtime.Composable
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.naver.maps.map.compose.NaverMap

@OptIn(ExperimentalNaverMapApi::class)
@Composable
actual fun MapComponent() {
    NaverMap()
}