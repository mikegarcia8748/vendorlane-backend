# vendorlane

This project was created using the [Ktor Project Generator](https://start.ktor.io).

Here are some useful links to get you started:

* [Ktor Documentation](https://ktor.io/docs/home.html)
* [Ktor GitHub page](https://github.com/ktorio/ktor)
* [Ktor Slack chat](https://app.slack.com/client/T09229ZC6/C0A974TJ9). [Request an invite](https://surveys.jetbrains.com/s3/kotlin-slack-sign-up).

## Features

Here's a list of features included in this project:

| Name                                                                                            | Description                                                                                             |
|-------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------|
| [AsyncAPI](https://start.ktor.io/p/com.asyncapi/server-asyncapi)                                | Generates and serves AsyncAPI documentation                                                             |
| [CORS](https://start.ktor.io/p/io.ktor/server-cors)                                             | Enables Cross-Origin Resource Sharing (CORS)                                                            |
| [Compression](https://start.ktor.io/p/io.ktor/server-compression)                               | Compresses responses using encoding algorithms like GZIP                                                |
| [OpenAPI](https://start.ktor.io/p/io.ktor/server-openapi)                                       | Serves OpenAPI documentation                                                                            |
| [Swagger](https://start.ktor.io/p/io.ktor/server-swagger)                                       | Serves Swagger UI for your project                                                                      |
| [Authentication](https://start.ktor.io/p/io.ktor/server-auth)                                   | Provides extension point for handling the Authorization header                                          |
| [Authentication JWT](https://start.ktor.io/p/io.ktor/server-auth-jwt)                           | Handles JSON Web Token (JWT) bearer authentication scheme                                               |
| [Content Negotiation](https://start.ktor.io/p/io.ktor/server-content-negotiation)               | Provides automatic content conversion according to Content-Type and Accept headers                      |
| [kotlinx.serialization](https://start.ktor.io/p/io.ktor/server-kotlinx-serialization)           | Handles JSON serialization using kotlinx.serialization library                                          |
| [Sessions](https://start.ktor.io/p/io.ktor/server-sessions)                                     | Adds support for persistent sessions through cookies or headers                                         |
| [Status Pages](https://start.ktor.io/p/io.ktor/server-status-pages)                             | Provides exception handling for routes                                                                  |
| [Static Content](https://start.ktor.io/p/io.ktor/server-static-content)                         | Serves static files from defined locations                                                              |
| [Call Logging](https://start.ktor.io/p/io.ktor/server-call-logging)                             | Logs client requests                                                                                    |
| [Cohort](https://start.ktor.io/p/com.sksamuel.cohort/server-cohort)                             | Spring Actuator style implementation for Ktor                                                           |
| [Metrics](https://start.ktor.io/p/io.ktor/server-metrics)                                       | Adds supports for monitoring several metrics                                                            |
| [Micrometer Metrics](https://start.ktor.io/p/io.ktor/server-metrics-micrometer)                 | Enables Micrometer metrics in your Ktor server application.                                             |
| [OpenTelemetry](https://start.ktor.io/p/io.opentelemetry.instrumentation/server-open-telemetry) | Instruments applications with distributed tracing, metrics, and logging for comprehensive observability |
| [Koin](https://start.ktor.io/p/io.insert-koin/server-koin)                                      | Provides dependency injection                                                                           |
| [Exposed](https://start.ktor.io/p/org.jetbrains/server-exposed)                                 | Adds Exposed database to your application                                                               |
| [PostgreSQL](https://start.ktor.io/p/org.jetbrains/server-postgres)                             | Adds Postgres database support                                                                          |
| [Rate Limiting](https://start.ktor.io/p/io.github.flaxoos/server-rate-limiting)                 | Manage request rate limiting as you see fit                                                             |
| [Raw Sockets](https://start.ktor.io/p/io.ktor/server-network)                                   | Adds raw socket support for TCP and UDP                                                                 |
| [Raw Secure SSL/TLS Sockets](https://start.ktor.io/p/io.ktor/server-network-tls)                | Adds secure socket support for TCP and UDP                                                              |

## Structure

This project includes the following modules:

| Path   | Description |
|--------|-------------|
|        | null        |
| client | null        |
| core   | null        |
| server | null        |

## Building & Running

To build or run the project, use one of the following tasks:

| Task                      | Description       |
|---------------------------|-------------------|
| `./gradlew :server:test`  | Run the tests     |
| `./gradlew :server:build` | Build the project |
| `./gradlew :server:run`   | Run the server    |

If the server starts successfully, you'll see the following output:

```
2024-12-04 14:32:45.584 [main] INFO  Application - Application started in 0.303 seconds.
2024-12-04 14:32:45.682 [main] INFO  Application - Responding at http://0.0.0.0:8080
```
