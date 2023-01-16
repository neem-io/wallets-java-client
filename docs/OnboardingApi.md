# OnboardingApi

All URIs are relative to *https://api.dev.neem.io/neem*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccount**](OnboardingApi.md#createAccount) | **POST** /api/v1/wallets/account | Create Account |
| [**createMpin**](OnboardingApi.md#createMpin) | **POST** /api/v1/wallets/create-mpin/{walletId} | Create Mpin |
| [**login**](OnboardingApi.md#login) | **POST** /api/v1/wallets/login | Login |



## createAccount

> Object createAccount(xNeemPartnerId, xNeemOTP, contentType, body)

Create Account

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OnboardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        OnboardingApi apiInstance = new OnboardingApi(defaultClient);
        String xNeemPartnerId = "1234"; // String | 
        String xNeemOTP = "sfsdf="; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.createAccount(xNeemPartnerId, xNeemOTP, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OnboardingApi#createAccount");
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
| **xNeemPartnerId** | **String**|  | [optional] |
| **xNeemOTP** | **String**|  | [optional] |
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


## createMpin

> Object createMpin(walletId, xNeemPartnerId, xNeemID, contentType, body)

Create Mpin

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OnboardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        OnboardingApi apiInstance = new OnboardingApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String xNeemPartnerId = "1234"; // String | 
        String xNeemID = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.createMpin(walletId, xNeemPartnerId, xNeemID, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OnboardingApi#createMpin");
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


## login

> Object login(contentType, body)

Login

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OnboardingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        OnboardingApi apiInstance = new OnboardingApi(defaultClient);
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.login(contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OnboardingApi#login");
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

