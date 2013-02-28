jetty-demo
==========

A demonstration webapp that can be started using mvn jetty:run

Instructions
---------------------------

Prerequisites
* install a jdk 1.6 or later
* install maven 3.0.4 or later on the path
* install git

```
sudo apt-get install git
```

Get the demo project

```
cd <YOUR-WORKSPACE>
git clone https://github.com/davidmoten/jetty-demo.git
```

and start it up

```
cd jetty-demo
mvn clean jetty:run
```

Go to [http://localhost:8080](http://localhost:8080) in a browser.

Two things are demonstrated by this webapp:

* a java servlet
* a jsp page


    
    

