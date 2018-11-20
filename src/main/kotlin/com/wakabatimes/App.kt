package com.wakabatimes;

import org.jooby.Kooby
import org.jooby.run

/**
 * Kotlin stater project.
 */
class App : Kooby({

    get {
        val name = param("name").value("Jooby")
        "Hello $name!"
    }

    get("/aaa") {
        val hoge = "aaaaa";
        hoge
    }

})

/**
 * Run application:
 */
fun main(args: Array<String>) {
    run(::App, *args)
}
