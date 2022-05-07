package com.funnc.foodie.common.controller.response

open class ErrorResponse() {

    private var meta: Meta? = null

    constructor(errorCode: String, errorMessage: String) : this() {
        this.meta = Meta.Fail(errorCode, errorMessage)
    }

    constructor(e: ErrorCode) : this(e.key, e.message)


}
