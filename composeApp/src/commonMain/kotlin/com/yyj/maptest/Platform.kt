package com.yyj.maptest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform