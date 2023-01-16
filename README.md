# wallet-sdk

Wallet

- API version: 1.0.3

- Build date: 2023-01-16T04:28:16.008248200+05:30[Asia/Colombo]

Integrate Neem Wallet APIs into your ecosystem to provide your customer the ability to create wallets, set up a financial PIN, ability to manage their wallets and have on request visibility over their balances.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>neem.io</groupId>
  <artifactId>wallet-sdk</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'wallet-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'wallet-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "neem.io:wallet-sdk:0.0.1-SNAPSHOT"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/wallet-sdk-0.0.1-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.DepositWithdrawApi;

public class DepositWithdrawApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        DepositWithdrawApi apiInstance = new DepositWithdrawApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String xNeemPartnerId = "1234"; // String | 
        String xNeemID = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.cashIn(walletId, xNeemPartnerId, xNeemID, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositWithdrawApi#cashIn");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.dev.neem.io/neem*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DepositWithdrawApi* | [**cashIn**](docs/DepositWithdrawApi.md#cashIn) | **POST** /api/v1/wallets/cash-in/{walletId} | Cash In
*DepositWithdrawApi* | [**cashInInquiry**](docs/DepositWithdrawApi.md#cashInInquiry) | **GET** /api/v1/wallets/cash-in/inquiry/{walletId} | Cash In Inquiry
*DepositWithdrawApi* | [**cashOut**](docs/DepositWithdrawApi.md#cashOut) | **POST** /api/v1/wallets/cash-out/{walletId} | Cash Out
*DepositWithdrawApi* | [**cashOutInquiry**](docs/DepositWithdrawApi.md#cashOutInquiry) | **GET** /api/v1/wallets/cash-out/inquiry/{walletId} | Cash Out Inquiry
*OnboardingApi* | [**createAccount**](docs/OnboardingApi.md#createAccount) | **POST** /api/v1/wallets/account | Create Account
*OnboardingApi* | [**createMpin**](docs/OnboardingApi.md#createMpin) | **POST** /api/v1/wallets/create-mpin/{walletId} | Create Mpin
*OnboardingApi* | [**login**](docs/OnboardingApi.md#login) | **POST** /api/v1/wallets/login | Login
*WalletServicesApi* | [**accountLookup**](docs/WalletServicesApi.md#accountLookup) | **GET** /api/v1/wallets/account/{walletId} | Account Lookup
*WalletServicesApi* | [**accountUpgrade**](docs/WalletServicesApi.md#accountUpgrade) | **POST** /api/v1/wallets/upgrade/{walletId} | Account Upgrade
*WalletServicesApi* | [**apiV1WalletsValidateOtpPost**](docs/WalletServicesApi.md#apiV1WalletsValidateOtpPost) | **POST** /api/v1/wallets/validate-otp | Validate OTP
*WalletServicesApi* | [**balanceInquiry**](docs/WalletServicesApi.md#balanceInquiry) | **GET** /api/v1/wallets/balance/{walletId} | Balance Inquiry
*WalletServicesApi* | [**changeMpin**](docs/WalletServicesApi.md#changeMpin) | **POST** /api/v1/wallets/change-mpin/{walletId} | Change MPIN
*WalletServicesApi* | [**initiateOtp**](docs/WalletServicesApi.md#initiateOtp) | **POST** /api/v1/wallets/initiate-otp | Initiate OTP
*WalletServicesApi* | [**transactionHistory**](docs/WalletServicesApi.md#transactionHistory) | **GET** /api/v1/wallets/transaction-history/{walletId} | Transaction History


## Documentation for Models



## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - email: Email as scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



