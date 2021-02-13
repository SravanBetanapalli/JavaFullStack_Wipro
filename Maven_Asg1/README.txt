1) first checked maven with 
mvn --version

2) Then executed this command in cmd to generate maven project
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

during it's execution , i have given groupId and Artifact as com.wipro.topgear & basicMaven respectively.


3) then build the project with 
mvn package

4) to run the java program from the generated jar

java -cp target/basicMaven-1.0.jar defaultPackage.App