package com.funnc.foodie.common.controller.response

open class SingleResponse<T>(content: T, meta: Meta) {
    var content: T? = content
    var meta: Meta? = meta

    class Ok<T> : SingleResponse<T> {
        constructor(content: T) : super(content,Meta.Ok())
    }

}