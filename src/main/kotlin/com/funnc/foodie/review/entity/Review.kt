package com.funnc.foodie.review.entity

import com.funnc.foodie.common.BaseJpaEntity
import com.funnc.foodie.menu.entity.Menu
import com.funnc.foodie.user.entity.User
import com.funnc.foodie.weather.value.Weather
import javax.persistence.*

@Entity
class Review(
    @ManyToOne
    var user: User,

    @ManyToOne
    var menu: Menu,

    @Column(precision=2, scale=1)
    var point:Double,

    @Enumerated(EnumType.STRING)
    var waether: Weather

) : BaseJpaEntity()