package com.diegoromoli.testasync.service;

import com.diegoromoli.testasync.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

public class TestAsyncServiceImpl implements TestAsyncService {

    private static final Logger LOG = LoggerFactory.getLogger(TestAsyncServiceImpl.class);

    @Override
    @Async
    public CompletableFuture<User> asyncUserById(Integer id) throws InterruptedException {
        User user = getUserById(id);
        Thread.sleep(5000);
        return CompletableFuture.completedFuture(user);
    }

    @Override
    public void doProcessing() {
        try {
            LOG.info("Inside doProcessing");
            Thread.sleep(5000);
            LOG.info("Finished doProcessing");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private User getUserById(Integer id) {
        switch (id) {
            case 1:
                return new User(1, "user-one", "User ONE");
            case 2:
                return new User(2, "user-two", "User TWO");
            case 3:
                return new User(3, "user-three", "User THREE");
            default:
                return new User(4, "user-default", "User DEFAULT");
        }
    }
}
