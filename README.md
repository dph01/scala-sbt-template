This is a simple lightweight template for starting a scala project with sbt.

It comes with:

* sbt-eclipse plugin
* scala-test and specs templates

To get started:

1. To download and launch sbt: 

        git clone https://github.com/dph01/scala-sbt-template
        cd scala-sbt-template
        ./sbt 

3. To load your project into Eclipse:

        sbt> eclipse
        
    Then from within Eclipse, select File->Import->General->Existing Projects Into Workspace, and select your project directory.
   
2. Write your code in src/main/scala. To run your program, specify the name of your main class in build.sbt, e.g.:

        mainClass := Some("com.damianhelme.App")

    In sbt:
   
        sbt> reload
        sbt> run        
        
    You'll probably also want to change the 'name' and 'organisation' sbt configuration settings in build.sbt.
   
    Note the reload only needs to be done once whenever you change the build.sbt file

3. Write your tests in src/test/scala (some examples have been included). To run all your tests:

        sbt> test
        
4. To run just one test:

        sbt> test-only com.damianhelme.AppTest
        
For comments, questions, etc. please see the accompanying [blogpost](http://tech.damianhelme.com/scala-sbt-template).


