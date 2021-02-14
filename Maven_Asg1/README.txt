1) first checked maven with 
mvn --version

2) Then executed this command in cmd to generate maven project
mvn archetype:generate -DgroupId=com.wipro.topgear -DartifactId=basicMaven -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4



3) then build the project with 
mvn package

4) to run the java program from the generated jar

java -cp target/basicMaven-1.0.jar defaultPackage.App