package com.funnc.foodie.common.controller.response

import java.util.*

enum class ErrorCode(val message: String) {

    USER_NOT_FOUND("사용자 정보가 존재하지 않습니다.");


    val key: String
        get() = name.replace("_", "-").lowercase(Locale.getDefault())
}
