# Java_SE_21_Developer_Professional
Preparatory for Exam Number: 1Z0-830

Additional Resources:  https://docs.oracle.com/javase/tutorial/java/index.html (Based on Java 8).

Latest Version:        https://dev.java/ (Based on Java 25).


Save the folder to your C:\ directory

Opem windows command prompt - cmd

Change to the Java Tutorial directory

cd "Java Tutorial"

To compile the codes

javac fileName.java

run dir from the command prompt and check for a .class file (the compile bytecode)

To execute the codes

java fileName

Though javadoc is not required for the exams, i have added some Java Doc Tags/comments for demostration.
Run the javadoc command below. It create a doc folder and dump all the documentations there.
The doc folder name can be any name but I used the doc name for the folder. You don't have to create the folder yourself.

javadoc -d docs -keywords -author -version *.java

the * is wildcard for all the java classes in the folder. The wildcard can be used with javac and java also.
