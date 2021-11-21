# Junit 5 & AspectJ example

The project demonstrates how to log method parameters and return values by using AOP(AspectJ) and JUnit
Jupiter

### this code is based on examples from:
- https://github.com/junit-team/junit5-samples
- https://plugins.gradle.org/plugin/io.freefair.aspectj.post-compile-weaving
- https://www.yegor256.com/2014/06/01/aop-aspectj-java-method-logging.html

### to run unit tests and see the message from @Loggable annotation execute:

`.\gradlew.bat clean build -i`

you should see something like this in logs:
```
CalculatorTests > 1 + 1 = 2 STANDARD_OUT
    @Loggable: method: add([1, 1]), result: 2, executed in 0ms
```

you could also run com.example.project.Calculator.main() through IDE