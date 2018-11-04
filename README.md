Benchmarks Vertx / node single process, node cluster / et autres
====================

Benchmarks de "dynamic web servers"
cf TODO


Benchmark
-----------
    ab -n 10000 -c 100 http://localhost:8080/
    wrk -d 30 -t 2k -c 20k http://localhost:8080

vertx-java https://vertx.io/ - port 8080
-----------

    ```java
    Vertx vertx = Vertx.vertx();
    //DeploymentOptions options = new DeploymentOptions().setInstances(6);
    //vertx.deployVerticle(HelloWorldVerticle.class.getName(), options);
    vertx.deployVerticle(HelloWorldVerticle.class.getName());
    ```
    jconsole uniquement pour vérifier le nombre d'event loop threads, pas pendant le test de perf
    cd vertx-java
    mvn clean package
    java -jar target/my-first-app-1.0-SNAPSHOT-fat.jar

Node - port 8081
-----------

    brew install node
    node node/server.js
    
    ou en mode cluster : node node/server_cluster.js

Python - port 5000
-----------

    pip install Flask
    FLASK_APP=server.py flask run

Go
-----------

    TODO cf https://github.com/carbonfive/hellod


C / libev
-----------

    TODO cf https://github.com/carbonfive/hellod



or 8081 or 8082...
