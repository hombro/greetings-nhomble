[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-f059dc9a6f8d3a56e377f745f24479a46679e63a5d9fe6f495e02850cd0d8118.svg)](https://classroom.github.com/online_ide?assignment_repo_id=6628128&assignment_repo_type=AssignmentRepo)
# assignment-greetings

The `Hello World` assignment, is a classic first program many write in a new language. You get a feel for writing some
basic code in a language and how to 'run' it. In the case of Java, running it means:
- compiling
- running in JVM

For this class, you will also become familiar with:
- tools: IDE / gradle
- testing
- reading from console

## To Do
You need to modify [Greeting](src/main/java/edu/fcc/cmis106/greetings/Greeting.java) such that it takes a line of text
from the command line and then returns "Hello (the inputted string)"

Notice in these examples, that "World" was passed as input to the program so that "Hello World" was printed out.

### Windows
```shell
> .\gradlew clean
> .\gradlew jar
> java -jar build\libs\greeting-0.1.0.jar
World
Hello World
```

### Linux / MacOS
```shell
$ ./gradlew clean
$ ./gradlew jar
$ java -jar build/libs/greetings-0.1.0.jar
World
Hello World
```

## Testing / Grading
You will notice that a test file is provided for you [here](src/test/java/edu/fcc/cmis106/greetings/GreetingTest.java).
You don't need to worry about this, **but do not modify this**. If you change it, then at least 50% of the points for
the project will be deducted.

You can run the tests via

### Windows
```shell
> .\gradlew test
```

### Linux / MacOS
```shell
$ ./gradlew test
```

### Note about grading
Your grade in the assignment is dependent on passing the tests provided.

## Notes
Some project specific notes to help you out!

### Java11
In this course, you'll learn that there are multiple versions of Java, and the lectures
will help you install a specific version. In order to use [gradle](https://gradle.org/), we need to rely
on **java11**. 

You can figure out your java version via

#### Powershell
```shell
> $Env:JAVA_HOME
```

#### Linux / MacOS
```shell
$ echo $JAVA_HOME
```

### Getting User Input / `Scanner`
The `Scanner` object is a useful utility class in java's standard library
to parse text from an input stream. 

In this assignment, we do the boilerplate for you, but you can imagine ways of creating
your own tools with this!