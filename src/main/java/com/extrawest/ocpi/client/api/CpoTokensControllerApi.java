package com.extrawest.ocpi.client.api;

import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.model.TokenDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T16:38:37.347887+03:00[Europe/Kiev]")
public class CpoTokensControllerApi {
    private ApiClient apiClient;

    public CpoTokensControllerApi() {
        this(new ApiClient());
    }

    public CpoTokensControllerApi(ApiClient apiClient) {
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
     * @param tokenUid  (required)
     * @param type  (required)
     * @return TokenDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TokenDTO getToken1(String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        return getToken1WithHttpInfo(countryCode, partyId, tokenUid, type).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @return ResponseEntity&lt;TokenDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TokenDTO> getToken1WithHttpInfo(String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getToken1");
        }
        
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getToken1");
        }
        
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling getToken1");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getToken1");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("token_uid", tokenUid);
        uriVariables.put("type", type);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TokenDTO> localReturnType = new ParameterizedTypeReference<TokenDTO>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @param tokenDTO  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchToken(String countryCode, String partyId, String tokenUid, String type, TokenDTO tokenDTO) throws RestClientException {
        patchTokenWithHttpInfo(countryCode, partyId, tokenUid, type, tokenDTO);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @param tokenDTO  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchTokenWithHttpInfo(String countryCode, String partyId, String tokenUid, String type, TokenDTO tokenDTO) throws RestClientException {
        Object localVarPostBody = tokenDTO;
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling patchToken");
        }
        
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling patchToken");
        }
        
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling patchToken");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling patchToken");
        }
        
        // verify the required parameter 'tokenDTO' is set
        if (tokenDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenDTO' when calling patchToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("token_uid", tokenUid);
        uriVariables.put("type", type);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @param tokenDTO  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putToken(String countryCode, String partyId, String tokenUid, String type, TokenDTO tokenDTO) throws RestClientException {
        putTokenWithHttpInfo(countryCode, partyId, tokenUid, type, tokenDTO);
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param countryCode  (required)
     * @param partyId  (required)
     * @param tokenUid  (required)
     * @param type  (required)
     * @param tokenDTO  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putTokenWithHttpInfo(String countryCode, String partyId, String tokenUid, String type, TokenDTO tokenDTO) throws RestClientException {
        Object localVarPostBody = tokenDTO;
        
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling putToken");
        }
        
        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling putToken");
        }
        
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling putToken");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling putToken");
        }
        
        // verify the required parameter 'tokenDTO' is set
        if (tokenDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenDTO' when calling putToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_code", countryCode);
        uriVariables.put("party_id", partyId);
        uriVariables.put("token_uid", tokenUid);
        uriVariables.put("type", type);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
