jetty-demo
==========

A demonstration webapp *simple* that can be started using mvn jetty:run. Complete instructions are given for setting up java, maven and git on ubuntu 12.04 or later.

In addition to the *simple* demo the following projects are placed under the *jetty-demo* project for the more advanced/curious audience:

* *jsf* (Java Server Faces on jetty)
* *jersey* (Jersey REST services on jetty)
* *wicket* (Wicket framework on jetty)
* *click* (Apache Click framework on jetty)

##Audience
This project was setup to demonstrate to someone unfamiliar with java that wants to write a web application how it can be done (pretty minimally).

##Prerequisites
Instructions are here for setting up java, maven and git on ubuntu 12.04 or later.

###Install java jdk
jdk 1.6 or later is preferred. This installs jdk 7:

```
sudo apt-get install python-software-properties
sudo apt-add-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java7-installer
```

###Install maven
maven 3 is required:

```
sudo add-apt-repository ppa:natecarlson/maven3
sudo apt-get update
sudo apt-get install Maven3
sudo ln -s /usr/share/maven3/bin/mvn /usr/bin/mvn
```
###Install git
required to get the source from github:

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
cd jetty-demo/simple
mvn jetty:run
```

Go to [http://localhost:8080](http://localhost:8080) in a browser.

Two things are demonstrated by this webapp:

* a java servlet (3.0)
* a jsp page

Modify it
-------------------------

To play with the webapp in Eclipse IDE download the latest *Eclipse IDE for Java Developers* from [http://www.eclipse.org/downloads/](here). 

Start eclipse and import your project:

*File - Import - Maven - Existing Maven Projects - Next - browse into the jetty-demo/simple directory and hit OK*

There it is, with luck, ready to muck around with as you please.

If *maven jetty:run* is running you will notice that changes saved to the code are autodeployed every 3 seconds (configured in pom.xml).

The other examples
-------------------
To try for example the *jersey* example do the same as above except in the *jetty-demo/jersey* directory.
    
    

