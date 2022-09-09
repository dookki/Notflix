package com.vickikbt.cache.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\'J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/vickikbt/cache/daos/CastDao;", "", "deleteAllMovieCast", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieCast", "Lkotlinx/coroutines/flow/Flow;", "Lcom/vickikbt/cache/models/CastEntity;", "movieId", "", "isMovieCastAvailable", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovieCast", "castEntity", "(Lcom/vickikbt/cache/models/CastEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cache_debug"})
public abstract interface CastDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object saveMovieCast(@org.jetbrains.annotations.NotNull()
    com.vickikbt.cache.models.CastEntity castEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM `Casts Table` WHERE id=:movieId")
    public abstract kotlinx.coroutines.flow.Flow<com.vickikbt.cache.models.CastEntity> getMovieCast(int movieId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM `Casts Table`")
    public abstract java.lang.Object deleteAllMovieCast(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT COUNT(*) FROM `Casts Table` WHERE id=:movieId")
    public abstract java.lang.Object isMovieCastAvailable(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
}