##### springboot-micrometer-demo
This project shows how to use micrometer in springboot

#### Micrometer 

> Micrometer provides a simple facade over the instrumentation clients for the most popular monitoring systems, allowing you to instrument your JVM-based application code without vendor lock-in. Think SLF4J, but for metrics.

> Starting with Spring Boot 2.0, Micrometer is the instrumentation library powering the delivery of application metrics from Spring. Support is ported back to Boot 1.x through an additional library dependency.
**(Refer https://micrometer.io/)**

#### Prometheus

> Prometheus is an open-source systems monitoring and alerting toolkit originally built at SoundCloud.

**Features are**
* a multi-dimensional data model with time series data identified by metric name and key/value pairs
* a flexible query language to leverage this dimensionality
* no reliance on distributed storage; single server nodes are autonomous
* time series collection happens via a pull model over HTTP
* pushing time series is supported via an intermediary gateway
* targets are discovered via service discovery or static configuration
* multiple modes of graphing and dashboarding support

**(Refer https://prometheus.io/)**

**Docker Command:**
```
docker pull prom/prometheus

```

#### Grafana

> Grafana is an open platform for beautiful analytics and monitoring. The leading open source software for time series analytics. o matter where your data is, or what kind of database it lives in, you can bring it together with Grafana. Beautifully.

**(Refer https://grafana.com/)**

**Docker Command:**
```
docker pull grafana/grafana

```

#### Application Demo

Its a simple rest application. I have used **prometheus** and **grafana** for this **springboot micrometer** application.

Also I have used **swagger**, **lombok** and **mapstruct** dependencies.

Let me explain some key points while using this.

All you know, **Swagger** takes the manual work out of API documentation, with a range of solutions for generating, visualizing, and maintaining API docs.

**Maven Dependencies**  

```aidl

```


