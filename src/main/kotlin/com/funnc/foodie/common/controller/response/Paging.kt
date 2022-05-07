package com.funnc.foodie.common.controller.response

open class Paging(
    var totalCount: Long? = 0,
    var CurrentPage: Int? = 0,
    var perPage: Int? = 0,
    var totlaPage: Int? = 0
)