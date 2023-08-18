package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.LocationDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T17:07:56.219565+03:00[Europe/Kiev]")
public class EmspLocationControllerApi {
    private ApiClient apiClient;

    public EmspLocationControllerApi() {
        this(new ApiClient());
    }

    public EmspLocationControllerApi(ApiClient apiClient) {
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
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getLocationEvseController(String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        return getLocationEvseControllerWithHttpInfo(countryCode, partyId, locationId, evseUid, connectorId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getLocationEvseControllerWithHttpInfo(String countryCode, String partyId, String locationId, String evseUid, String connectorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getLocationEvseController");
        }
        
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getLocationEvseController");
        }
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getLocationEvseController");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "location_id", locationId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "evse_uid", evseUid));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "connector_id", connectorId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param locationDTO  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchLocation(String countryCode, String partyId, String locationId, LocationDTO locationDTO, String evseUid, String connectorId) throws RestClientException {
        patchLocationWithHttpInfo(countryCode, partyId, locationId, locationDTO, evseUid, connectorId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param locationDTO  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchLocationWithHttpInfo(String countryCode, String partyId, String locationId, LocationDTO locationDTO, String evseUid, String connectorId) throws RestClientException {
        Object localVarPostBody = locationDTO;
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchLocation");
        }
        
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchLocation");
        }
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling patchLocation");
        }
        
        // verify the required parameter 'locationDTO' is set
        if (locationDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationDTO' when calling patchLocation");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "location_id", locationId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "evse_uid", evseUid));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "connector_id", connectorId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations", HttpMethod.PATCH, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param locationDTO  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pushLocation(String countryCode, String partyId, String locationId, LocationDTO locationDTO, String evseUid, String connectorId) throws RestClientException {
        pushLocationWithHttpInfo(countryCode, partyId, locationId, locationDTO, evseUid, connectorId);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param locationId  (required)
     * @param locationDTO  (required)
     * @param evseUid  (optional)
     * @param connectorId  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pushLocationWithHttpInfo(String countryCode, String partyId, String locationId, LocationDTO locationDTO, String evseUid, String connectorId) throws RestClientException {
        Object localVarPostBody = locationDTO;
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling pushLocation");
        }
        
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling pushLocation");
        }
        
        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling pushLocation");
        }
        
        // verify the required parameter 'locationDTO' is set
        if (locationDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationDTO' when calling pushLocation");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country_code", countryCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "party_id", partyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "location_id", locationId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "evse_uid", evseUid));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "connector_id", connectorId));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/locations", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
