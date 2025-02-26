# Flagright Java Library

[![Maven Central](https://img.shields.io/maven-central/v/com.flagright.api/flagright-java)](https://central.sonatype.com/artifact/com.flagright.api/flagright-java)
[![fern shield](https://img.shields.io/badge/%F0%9F%8C%BF-SDK%20generated%20by%20Fern-brightgreen)](https://github.com/fern-api/fern)

The Merge Java SDK provides convenient access to the Merge API from Java or Kotlin.

## Documentation

API documentation is available at [here](https://central.sonatype.com/artifact/com.flagright.api/flagright-java).

## Installation

### Gradle

Add the dependency in your `build.gradle`:

```groovy
dependencies {
    implementation 'com.flagright.api:flagright-java:0.x.x'
}
```

### Maven

Add the dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>com.flagright.api</groupId>
    <artifactId>flagright-java</artifactId>
    <version>x.x.x</version>
</dependency
```

## Usage

```java
import com.flagright.api.FlagrightApiClient;
import com.flagright.api.types.TransactionType;
import com.flagright.api.types.Transaction;
import com.flagright.api.types.TransactionsVerifyResponse;
import com.flagright.api.resources.transactions.requests.TransactionsVerifyRequest;

FlagrightApiClient flagright = FlagrightApiClient.builder()
  .environment("https://sandbox.flagright.com")
  .apiKey("YOUR_API_KEY")
  .build();

TransactionsVerifyResponse resposne = flagright.transactions.verify(TransactionsVerifyRequest.builder()
  .body(Transaction.builder()
      .transactionId("my-transaction-id")
      .type(TransactionType.DEPOSIT)
      .timestamp(1692624734000.0)
      .build()
  .build());
```

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically. Additions made directly to this library would have to be moved over to our generation code, otherwise they would be overwritten upon the next generated release. Feel free to open a PR as a proof of concept, but know that we will not be able to merge it as-is. We suggest opening an issue first to discuss with us!

On the other hand, contributions to the README are always very welcome!
