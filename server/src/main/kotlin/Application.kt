package com.puregold.vendorlane

import io.ktor.server.application.Application

fun Application.rootModule() {
    configureStatusPages()
    configureOpenTelemetry()
    configureKoin()
    configureExposed()
    configurePostgres()
    configureRateLimiting()
    configureNetwork()
    configureNetworkTls()
    configureHttp()
    configureMonitoring()
    configureSerialization()
    configureSecurity()
    configureRouting()
}
