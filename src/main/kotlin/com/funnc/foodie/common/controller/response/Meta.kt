package com.funnc.foodie.common.controller.response


open class Meta(
    private val result: String,
    private val errorCode: String? = null,
    private val errorMessage: String? = null

) {

    class Ok : Meta("ok", null, null)

    class Fail(errorCode: String?, errorMessage: String?) :
        Meta("fail", errorCode, errorMessage)
}
