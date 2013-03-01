jetty-demo
==========

A demonstration webapp that can be started using mvn jetty:run

Prerequisites
-------------------
* install a jdk 1.6 or later
* install maven 3.0.4 or later on the path
* install git

```
sudo apt-get install git
```

Run it
-------------------------
Get the demo project

```
cd <YOUR-WORKSPACE>
git clone https://github.com/davidmoten/jetty-demo.git
```

and start it up

```
cd jetty-demo
mvn jetty:run
```

Go to [http://localhost:8080](http://localhost:8080) in a browser.

Two things are demonstrated by this webapp:

* a java servlet
* a jsp page

Modify it
-------------------------

To play with the webapp in Eclipse IDE download the latest *Eclipse IDE for Java Developers* from [http://www.eclipse.org/downloads/](here). 

Start eclipse and import your project:

*File - Import - Maven - Existing Maven Projects - Next - browse into the project directory and hit OK*

There it is, with luck, ready to muck around with as you please.

    
    

