package io.vertx.blog.first;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class Main extends AbstractVerticle {

    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        //DeploymentOptions options = new DeploymentOptions().setInstances(6);
        //vertx.deployVerticle(HelloWorldVerticle.class.getName(), options);
        vertx.deployVerticle(HelloWorldVerticle.class.getName());
    }
}