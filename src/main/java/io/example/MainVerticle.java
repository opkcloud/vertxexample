package io.example;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    public void start() {
        vertx.deployVerticle(MyFirstVerticle.class.getName());
    }
}
