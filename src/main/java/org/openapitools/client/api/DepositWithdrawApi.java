package org.openapitools.client.api;

import org.openapitools.client.ApiClient;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T04:28:16.008248200+05:30[Asia/Colombo]")
@Component("org.openapitools.client.api.DepositWithdrawApi")
public class DepositWithdrawApi {
    private ApiClient apiClient;

    public DepositWithdrawApi() {
        this(new ApiClient());
    }

    @Autowired
    public DepositWithdrawApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cash In
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemPartnerId  (optional)
     * @param xNeemID  (optional)
     * @param contentType  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashIn(String walletId, String xNeemPartnerId, String xNeemID, String contentType, Object body) throws RestClientException {
        return cashInWithHttpInfo(walletId, xNeemPartnerId, xNeemID, contentType, body).getBody();
    }

    /**
     * Cash In
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemPartnerId  (optional)
     * @param xNeemID  (optional)
     * @param contentType  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> cashInWithHttpInfo(String walletId, String xNeemPartnerId, String xNeemID, String contentType, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling cashIn");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xNeemPartnerId != null)
        localVarHeaderParams.add("X-Neem-Partner-Id", apiClient.parameterToString(xNeemPartnerId));
        if (xNeemID != null)
        localVarHeaderParams.add("X-Neem-ID", apiClient.parameterToString(xNeemID));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/cash-in/{walletId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cash In Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param endToEndIdentification  (required)
     * @param amount  (required)
     * @param currency  (optional)
     * @param extendedProperties  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashInInquiry(String walletId, String endToEndIdentification, String amount, String currency, List<Object> extendedProperties) throws RestClientException {
        return cashInInquiryWithHttpInfo(walletId, endToEndIdentification, amount, currency, extendedProperties).getBody();
    }

    /**
     * Cash In Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param endToEndIdentification  (required)
     * @param amount  (required)
     * @param currency  (optional)
     * @param extendedProperties  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> cashInInquiryWithHttpInfo(String walletId, String endToEndIdentification, String amount, String currency, List<Object> extendedProperties) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling cashInInquiry");
        }
        
        // verify the required parameter 'endToEndIdentification' is set
        if (endToEndIdentification == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endToEndIdentification' when calling cashInInquiry");
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'amount' when calling cashInInquiry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "EndToEndIdentification", endToEndIdentification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Amount", amount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Currency", currency));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ExtendedProperties", extendedProperties));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/cash-in/inquiry/{walletId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cash Out
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemPartnerId  (optional)
     * @param xNeemNonce  (optional)
     * @param xNeemOTPCode  (optional)
     * @param contentType  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashOut(String walletId, String xNeemPartnerId, String xNeemNonce, String xNeemOTPCode, String contentType, Object body) throws RestClientException {
        return cashOutWithHttpInfo(walletId, xNeemPartnerId, xNeemNonce, xNeemOTPCode, contentType, body).getBody();
    }

    /**
     * Cash Out
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param xNeemPartnerId  (optional)
     * @param xNeemNonce  (optional)
     * @param xNeemOTPCode  (optional)
     * @param contentType  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> cashOutWithHttpInfo(String walletId, String xNeemPartnerId, String xNeemNonce, String xNeemOTPCode, String contentType, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling cashOut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xNeemPartnerId != null)
        localVarHeaderParams.add("X-Neem-Partner-Id", apiClient.parameterToString(xNeemPartnerId));
        if (xNeemNonce != null)
        localVarHeaderParams.add("X-Neem-Nonce", apiClient.parameterToString(xNeemNonce));
        if (xNeemOTPCode != null)
        localVarHeaderParams.add("X-Neem-OTP-Code", apiClient.parameterToString(xNeemOTPCode));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/cash-out/{walletId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cash Out Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param endToEndIdentification  (required)
     * @param amount  (required)
     * @param currency  (optional)
     * @param extendedProperties  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object cashOutInquiry(String walletId, String endToEndIdentification, String amount, String currency, List<Object> extendedProperties) throws RestClientException {
        return cashOutInquiryWithHttpInfo(walletId, endToEndIdentification, amount, currency, extendedProperties).getBody();
    }

    /**
     * Cash Out Inquiry
     * 
     * <p><b>200</b> - OK
     * @param walletId  (required)
     * @param endToEndIdentification  (required)
     * @param amount  (required)
     * @param currency  (optional)
     * @param extendedProperties  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> cashOutInquiryWithHttpInfo(String walletId, String endToEndIdentification, String amount, String currency, List<Object> extendedProperties) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling cashOutInquiry");
        }
        
        // verify the required parameter 'endToEndIdentification' is set
        if (endToEndIdentification == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endToEndIdentification' when calling cashOutInquiry");
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'amount' when calling cashOutInquiry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "EndToEndIdentification", endToEndIdentification));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Amount", amount));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "Currency", currency));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "ExtendedProperties", extendedProperties));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/api/v1/wallets/cash-out/inquiry/{walletId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
