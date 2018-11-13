package com.diegoromoli.testasync.controller;

import com.diegoromoli.testasync.entity.User;
import com.diegoromoli.testasync.service.TestAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class TestAsyncController {

    @Autowired
    private TestAsyncService testAsyncService;

    @PostMapping("/rest/test/async-with-return")
    public DeferredResult<ResponseEntity<User>> asyncWithReturn() {
        return
    }

}
