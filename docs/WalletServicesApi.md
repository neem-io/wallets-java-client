# WalletServicesApi

All URIs are relative to *https://api.dev.neem.io/neem*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountLookup**](WalletServicesApi.md#accountLookup) | **GET** /api/v1/wallets/account/{walletId} | Account Lookup |
| [**accountUpgrade**](WalletServicesApi.md#accountUpgrade) | **POST** /api/v1/wallets/upgrade/{walletId} | Account Upgrade |
| [**apiV1WalletsValidateOtpPost**](WalletServicesApi.md#apiV1WalletsValidateOtpPost) | **POST** /api/v1/wallets/validate-otp | Validate OTP |
| [**balanceInquiry**](WalletServicesApi.md#balanceInquiry) | **GET** /api/v1/wallets/balance/{walletId} | Balance Inquiry |
| [**changeMpin**](WalletServicesApi.md#changeMpin) | **POST** /api/v1/wallets/change-mpin/{walletId} | Change MPIN |
| [**initiateOtp**](WalletServicesApi.md#initiateOtp) | **POST** /api/v1/wallets/initiate-otp | Initiate OTP |
| [**transactionHistory**](WalletServicesApi.md#transactionHistory) | **GET** /api/v1/wallets/transaction-history/{walletId} | Transaction History |



## accountLookup

> Object accountLookup(walletId, endToEndIdentification, schemeName, xNeemCNIC, xNeemPartnerId, contentType)

Account Lookup

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        WalletServicesApi apiInstance = new WalletServicesApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String endToEndIdentification = "endToEndIdentification_example"; // String | 
        String schemeName = "schemeName_example"; // String | 
        String xNeemCNIC = "xNeemCNIC_example"; // String | 
        String xNeemPartnerId = "1234"; // String | 
        String contentType = "application/json"; // String | 
        try {
            Object result = apiInstance.accountLookup(walletId, endToEndIdentification, schemeName, xNeemCNIC, xNeemPartnerId, contentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletServicesApi#accountLookup");
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
| **schemeName** | **String**|  | |
| **xNeemCNIC** | **String**|  | |
| **xNeemPartnerId** | **String**|  | [optional] |
| **contentType** | **String**|  | [optional] |

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


## accountUpgrade

> Object accountUpgrade(walletId, xNeemPartnerId, xNeemID, contentType, body)

Account Upgrade

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        WalletServicesApi apiInstance = new WalletServicesApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String xNeemPartnerId = "1234"; // String | 
        String xNeemID = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.accountUpgrade(walletId, xNeemPartnerId, xNeemID, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletServicesApi#accountUpgrade");
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


## apiV1WalletsValidateOtpPost

> Object apiV1WalletsValidateOtpPost(xNeemPartnerId, contentType, body)

Validate OTP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        WalletServicesApi apiInstance = new WalletServicesApi(defaultClient);
        String xNeemPartnerId = "1234"; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.apiV1WalletsValidateOtpPost(xNeemPartnerId, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletServicesApi#apiV1WalletsValidateOtpPost");
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


## balanceInquiry

> Object balanceInquiry(walletId, xNeemPartnerId, xNeemID, endToEndIdentification, schemeName, extendedProperties)

Balance Inquiry

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        WalletServicesApi apiInstance = new WalletServicesApi(defaultClient);
        Integer walletId = 56; // Integer | 
        String xNeemPartnerId = "1234"; // String | 
        String xNeemID = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"; // String | 
        Integer endToEndIdentification = 56; // Integer | 
        String schemeName = "schemeName_example"; // String | 
        List<Object> extendedProperties = null; // List<Object> | 
        try {
            Object result = apiInstance.balanceInquiry(walletId, xNeemPartnerId, xNeemID, endToEndIdentification, schemeName, extendedProperties);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletServicesApi#balanceInquiry");
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
| **walletId** | **Integer**|  | |
| **xNeemPartnerId** | **String**|  | [optional] |
| **xNeemID** | **String**|  | [optional] |
| **endToEndIdentification** | **Integer**|  | [optional] |
| **schemeName** | **String**|  | [optional] |
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
| **200** | OK |  * Content-Type -  <br>  |


## changeMpin

> Object changeMpin(walletId, xNeemPartnerId, xNeemID, xNeemOTP, contentType, body)

Change MPIN

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        WalletServicesApi apiInstance = new WalletServicesApi(defaultClient);
        String walletId = "walletId_example"; // String | 
        String xNeemPartnerId = "1234"; // String | 
        String xNeemID = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"; // String | 
        String xNeemOTP = "erfdcd345="; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.changeMpin(walletId, xNeemPartnerId, xNeemID, xNeemOTP, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletServicesApi#changeMpin");
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


## initiateOtp

> Object initiateOtp(xNeemPartnerId, contentType, body)

Initiate OTP

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        WalletServicesApi apiInstance = new WalletServicesApi(defaultClient);
        String xNeemPartnerId = "1234"; // String | 
        String contentType = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.initiateOtp(xNeemPartnerId, contentType, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletServicesApi#initiateOtp");
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


## transactionHistory

> Object transactionHistory(walletId, xNeemPartnerId, xNeemID, endToEndIdentification, schemeName, fromDate, toDate, extendedProperties)

Transaction History

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletServicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.neem.io/neem");
        
        // Configure OAuth2 access token for authorization: oAuth
        OAuth oAuth = (OAuth) defaultClient.getAuthentication("oAuth");
        oAuth.setAccessToken("YOUR ACCESS TOKEN");

        WalletServicesApi apiInstance = new WalletServicesApi(defaultClient);
        Integer walletId = 56; // Integer | 
        String xNeemPartnerId = "1234"; // String | 
        String xNeemID = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"; // String | 
        Integer endToEndIdentification = 56; // Integer | 
        Integer schemeName = 56; // Integer | 
        String fromDate = "fromDate_example"; // String | 
        String toDate = "toDate_example"; // String | 
        List<Object> extendedProperties = null; // List<Object> | 
        try {
            Object result = apiInstance.transactionHistory(walletId, xNeemPartnerId, xNeemID, endToEndIdentification, schemeName, fromDate, toDate, extendedProperties);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WalletServicesApi#transactionHistory");
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
| **walletId** | **Integer**|  | |
| **xNeemPartnerId** | **String**|  | [optional] |
| **xNeemID** | **String**|  | [optional] |
| **endToEndIdentification** | **Integer**|  | [optional] |
| **schemeName** | **Integer**|  | [optional] |
| **fromDate** | **String**|  | [optional] |
| **toDate** | **String**|  | [optional] |
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
| **200** | OK |  * Content-Type -  <br>  |

