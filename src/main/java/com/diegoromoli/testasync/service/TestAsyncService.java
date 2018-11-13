package com.diegoromoli.testasync.service;

import com.diegoromoli.testasync.entity.User;

import java.util.concurrent.CompletableFuture;

public interface TestAsyncService {

    CompletableFuture<User> asyncUserById(Integer id) throws InterruptedException;

    void doProcessing();
}
