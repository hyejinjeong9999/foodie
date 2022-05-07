package com.funnc.foodie.common

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.*

/**
 * MappedSuperclass
 * JPA Entity 클래스들이 해당 추상 클래스를 상속할 경우
 * createDate, modifiedDate를 컬럼으로 인식
 *
 * AuditingEntityListener
 * 해당 클래스에 Auditing 기능을 포함
 * Auditing :  Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주는 기능
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long = 0L

    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createAt: LocalDateTime = LocalDateTime.now()

    @LastModifiedDate
    @Column(nullable = false)
    var updateAt: LocalDateTime = LocalDateTime.now()

    var deletedAt : LocalDateTime = LocalDateTime.now()

}