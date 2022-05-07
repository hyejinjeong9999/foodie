package com.funnc.foodie.restaurant.entity

import com.funnc.foodie.common.BaseJpaEntity
import com.funnc.foodie.menu.entity.Menu
import com.funnc.foodie.restaurant.value.Category
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.OneToMany

@Entity
class Restaurant(
    var name: String,

    @Enumerated(EnumType.STRING)
    var category: Category,

    @OneToMany
    var menus: MutableList<Menu> = mutableListOf()

) : BaseJpaEntity() {
}