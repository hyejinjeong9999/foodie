package com.funnc.foodie.menu.entity

import com.funnc.foodie.common.BaseJpaEntity
import com.funnc.foodie.restaurant.entity.Restaurant
import com.funnc.foodie.review.entity.Review
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
class Menu(
    var menuNeme: String,

    @OneToMany
    var reviews: MutableList<Review> = mutableListOf(),

    @ManyToOne
    var restaurant: Restaurant

) : BaseJpaEntity() {
}