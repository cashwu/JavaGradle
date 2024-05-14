plugins { 
    java 
    id ("org.flywaydb.flyway") version "10.0.0"
}


tasks.register("hello") {

    doFirst {
        println("hel")
    }

    doLast {
        println("lo, ")
    }
}

tasks.register("world") {

    dependsOn("hello")

    doFirst {
        println(" wo")
    }

    doLast {
        println("rld")
    }
}