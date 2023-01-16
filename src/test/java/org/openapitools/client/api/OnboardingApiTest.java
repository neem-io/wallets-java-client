/*
 * Wallet
 * Integrate Neem Wallet APIs into your ecosystem to provide your customer the ability to create wallets, set up a financial PIN, ability to manage their wallets and have on request visibility over their balances.
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OnboardingApi
 */
@Ignore
public class OnboardingApiTest {

    private final OnboardingApi api = new OnboardingApi();

    
    /**
     * Create Account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTest() {
        String xNeemPartnerId = null;
        String xNeemOTP = null;
        String contentType = null;
        Object body = null;
        Object response = api.createAccount(xNeemPartnerId, xNeemOTP, contentType, body);

        // TODO: test validations
    }
    
    /**
     * Create Mpin
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMpinTest() {
        String walletId = null;
        String xNeemPartnerId = null;
        String xNeemID = null;
        String contentType = null;
        Object body = null;
        Object response = api.createMpin(walletId, xNeemPartnerId, xNeemID, contentType, body);

        // TODO: test validations
    }
    
    /**
     * Login
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() {
        String contentType = null;
        Object body = null;
        Object response = api.login(contentType, body);

        // TODO: test validations
    }
    
}