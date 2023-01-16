# DepositWithdrawApi

All URIs are relative to *https://api.dev.neem.io/neem*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cashIn**](DepositWithdrawApi.md#cashIn) | **POST** /api/v1/wallets/cash-in/{walletId} | Cash In |
| [**cashInInquiry**](DepositWithdrawApi.md#cashInInquiry) | **GET** /api/v1/wallets/cash-in/inquiry/{walletId} | Cash In Inquiry |
| [**cashOut**](DepositWithdrawApi.md#cashOut) | **POST** /api/v1/wallets/cash-out/{walletId} | Cash Out |
| [**cashOutInquiry**](DepositWithdrawApi.md#cashOutInquiry) | **GET** /api/v1/wallets/cash-out/inquiry/{walletId} | Cash Out Inquiry |



## cashIn

> Object cashIn(walletId, xNeemPartnerId, xNeemID, contentType, body)

Cash In

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepositWithdrawApi;

public class Example {
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

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**|  | |
| **xNeemPartnerId** | **String**|  | [optional] |
| **xNeemID** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## cashInInquiry

> Object cashInInquiry(walletId, endToEndIdentification, amount, currency, extendedProperties)

Cash In Inquiry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepositWithdrawApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        DepositWithdrawApi apiInstance = new DepositWithdrawApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String endToEndIdentification = "endToEndIdentification_example"; // String | 
        String amount = "amount_example"; // String | 
        String currency = "currency_example"; // String | 
        List<Object> extendedProperties = null; // List<Object> | 
        try {
            Object result = apiInstance.cashInInquiry(walletId, endToEndIdentification, amount, currency, extendedProperties);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositWithdrawApi#cashInInquiry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**|  | |
| **endToEndIdentification** | **String**|  | |
| **amount** | **String**|  | |
| **currency** | **String**|  | [optional] |
| **extendedProperties** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## cashOut

> Object cashOut(walletId, xNeemPartnerId, xNeemNonce, xNeemOTPCode, contentType, body)

Cash Out

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepositWithdrawApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        DepositWithdrawApi apiInstance = new DepositWithdrawApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String xNeemPartnerId = "1234"; // String | 
        String xNeemNonce = "1234"; // String | 
        String xNeemOTPCode = "erfdcd345="; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.cashOut(walletId, xNeemPartnerId, xNeemNonce, xNeemOTPCode, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositWithdrawApi#cashOut");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**|  | |
| **xNeemPartnerId** | **String**|  | [optional] |
| **xNeemNonce** | **String**|  | [optional] |
| **xNeemOTPCode** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## cashOutInquiry

> Object cashOutInquiry(walletId, endToEndIdentification, amount, currency, extendedProperties)

Cash Out Inquiry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DepositWithdrawApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        DepositWithdrawApi apiInstance = new DepositWithdrawApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String endToEndIdentification = "endToEndIdentification_example"; // String | 
        String amount = "amount_example"; // String | 
        String currency = "currency_example"; // String | 
        List<Object> extendedProperties = null; // List<Object> | 
        try {
            Object result = apiInstance.cashOutInquiry(walletId, endToEndIdentification, amount, currency, extendedProperties);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositWithdrawApi#cashOutInquiry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **walletId** | **String**|  | |
| **endToEndIdentification** | **String**|  | |
| **amount** | **String**|  | |
| **currency** | **String**|  | [optional] |
| **extendedProperties** | [**List&lt;Object&gt;**](Object.md)|  | [optional] |

### Return type

**Object**

### Authorization

[oAuth](../README.md#oAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

