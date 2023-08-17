package com.extrawest.ocpi.client.api;

import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.model.AbstractProfileResult;
import com.extrawest.ocpi.client.model.ActiveChargingProfileRequestDTO;
import com.extrawest.ocpi.client.model.ResponseFormat;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T16:38:37.347887+03:00[Europe/Kiev]")
public class EmspChargingProfilesControllerApi {
    private ApiClient apiClient;

    public EmspChargingProfilesControllerApi() {
        this(new ApiClient());
    }

    public EmspChargingProfilesControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param abstractProfileResult  (required)
     * @return ResponseFormat
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormat postChargingProfile(AbstractProfileResult abstractProfileResult) throws RestClientException {
        return postChargingProfileWithHttpInfo(abstractProfileResult).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param abstractProfileResult  (required)
     * @return ResponseEntity&lt;ResponseFormat&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormat> postChargingProfileWithHttpInfo(AbstractProfileResult abstractProfileResult) throws RestClientException {
        Object localVarPostBody = abstractProfileResult;
        
        // verify the required parameter 'abstractProfileResult' is set
        if (abstractProfileResult == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'abstractProfileResult' when calling postChargingProfile");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ResponseFormat> localReturnType = new ParameterizedTypeReference<ResponseFormat>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/chargingProfiles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param activeChargingProfileRequestDTO  (required)
     * @return ResponseFormat
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormat putChargingProfile(String sessionId, ActiveChargingProfileRequestDTO activeChargingProfileRequestDTO) throws RestClientException {
        return putChargingProfileWithHttpInfo(sessionId, activeChargingProfileRequestDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param activeChargingProfileRequestDTO  (required)
     * @return ResponseEntity&lt;ResponseFormat&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormat> putChargingProfileWithHttpInfo(String sessionId, ActiveChargingProfileRequestDTO activeChargingProfileRequestDTO) throws RestClientException {
        Object localVarPostBody = activeChargingProfileRequestDTO;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putChargingProfile");
        }
        
        // verify the required parameter 'activeChargingProfileRequestDTO' is set
        if (activeChargingProfileRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activeChargingProfileRequestDTO' when calling putChargingProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ResponseFormat> localReturnType = new ParameterizedTypeReference<ResponseFormat>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/chargingProfiles/{session_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
