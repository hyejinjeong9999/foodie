package com.funnc.foodie.user.entity

import com.funnc.foodie.common.BaseJpaEntity
import com.funnc.foodie.review.entity.Review
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class User(
    var userId: String,
    var userName: String,
    var userPassword: String,
    @OneToMany
    var reviews:MutableList<Review>
) : BaseJpaEntity()