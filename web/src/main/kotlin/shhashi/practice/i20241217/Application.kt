package shhashi.practice.i20241217

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.thymeleaf.*
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val templateResolver = ClassLoaderTemplateResolver().apply {
        prefix = "/static/"
        suffix = ".html"
        characterEncoding = "UTF-8"
    }

    install(Thymeleaf) {
        setTemplateResolver(templateResolver)
    }

    routing {
        staticResources("/static", "static")

        get("/") {
            call.respond(ThymeleafContent("template/inputs", emptyMap()))
        }
    }
}
