package com.nstudiosappdev.core.data.db.entity

interface DbEntityMapper<R : DbEntity, T> {
    fun map(entity: R): T
    fun map(domainObject: T): R
}
