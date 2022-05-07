package com.funnc.foodie.common.controller.response

open class ListResponse<T>(
    items: List<T>,
    meta: Meta,
    paging: Paging
) {
    var items: List<T>? = items
    var meta: Meta? = meta
    var paging: Paging? = paging

    class Ok<T> : ListResponse<T> {
        constructor(items: List<T>, paging: Paging) : super(items, Meta.Ok(), paging)
    }

}