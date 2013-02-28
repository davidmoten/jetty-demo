jetty-demo
==========

A demonstration webapp that can be started using mvn jetty:run

Instructions
---------------------------

Prerequisites
* install a jdk
* install maven on the path
* install git
```
sudo apt-get install git
```

Then
```
#get the demo project
cd <YOUR-WORKSPACE>
git clone https://github.com/davidmoten/jetty-demo.git

#start it up
cd jetty-demo
mvn clean jetty:run
```

Go to [http://localhost:8080](http://localhost:8080) in a browser.

Two things are demonstrated by this webapp:

* a java servlet
* a jsp page


    
    

