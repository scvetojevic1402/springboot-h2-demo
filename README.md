# Twitter parsing system

build: mvn clean install

double click on jar file in target folder to run

jps to find the process id

TASKKILL /PID %PID% /F

The application has (among others) an api endpoint:
localhost:8080/twitter-parsing-system/tweets
which accepts post requests and parses tweets into 3 tables in a H2 database:
 - tweet,
 - user,
 - place
 
The H2 database is in-build into the application and will be in a testdb file which is located in the user root folder.