package com.funnc.foodie.user.repository

import com.funnc.foodie.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
public interface UserRepository :JpaRepository<User,Long> {
}