
## CH 2

```shell
gradle -i build
java -cp build/classes/java/main com.cashwu.Hello 
```

```shell
gradle wrapper

./gradlew build
```

## CH 3

```shell
gradle build
gradle clean

gradle clean build
```

## CH 4

```shell
gradle run
```


```shell
gradle javadoc
```

## CH 5

```shell
gradle -q dependencies 
gradle -q dependencies --configuration compileClasspath 
```


## CH 7

```shell
gradle clean build --console plain 


gradle clean singleTest 
```


## CH 8

```shell
gradle wrapper

gradle wrapper --gradle-version 8.0 --distribution-type all

gradle wrapper --warning-mode all   
```