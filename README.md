This is a simple lightweight template for getting started creating Scala projects. 
It provides a simple 'Hello World' program and some sample tests. 

It uses the [Simple Build Tool](https://github.com/harrah/xsbt/wiki) (SBT) to quickly and easily:

* download all the libraries on which the project depends, including Scala, if necessary
* run your programs and tests
* to generate the necessary configuration files for importing your project into an IDE such as Eclipse or Intellij IDEA

To get started:

1. Download the template:

        git clone git://github.com/dph01/scala-sbt-template.git
        
     Or, if you don't have git installed, download and unzip the files manually from [here](https://github.com/dph01/scala-sbt-template/downloads).
       
2. Launch sbt:

        cd scala-sbt-template
        ./sbt (or sbt.bat for Windows)
        
  This downloads all the dependencies for the project.

3. To run your program, in SBT:
   
        >run        
        
  This searches all objects for a 'main' method. If it finds more than one, it asks you to chose which you want to run.

3. To load your project into Eclipse, at the SBT prompt:

        > eclipse with-sources=true
        
   Then from within Eclipse, select File->Import->General->Existing Projects Into Workspace, and select your project directory.

4. To load your project into Intellij IDEA, at the SBT prompt:
   
        > gen-idea
        
   Then from within IDEA, select File -> Open Project, and select your project directory.

2. Put your Scala class files in src/main/scala. An example has been created to get you started: 
src/main/scala/com/myapp/App.scala. SBT uses the same folder structure as Maven. 
For more information see (here)[https://github.com/harrah/xsbt/wiki/Getting-Started-Directories].

3. Write your tests in src/test/scala (some examples have been included). To run all your tests:

        > test
        
4. To run just one test:

        > test-only com.myapp.AppTest
        
5. To launch the Scala interpreter, at the sbt prompt:

        > console
        
   This allows you to 'play around' with Scala commands, with full access to all the libraries defined in your project.
   
For comments, questions, etc. please see the accompanying [blogpost](http://tech.damianhelme.com/scala-sbt-template).


