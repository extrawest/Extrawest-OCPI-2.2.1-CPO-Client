package com.extrawest.ocpi.client.api;

import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.model.AuthorizationInfoResponseDTO;
import com.extrawest.ocpi.client.model.LocationReferencesRequestDTO;
import com.extrawest.ocpi.client.model.TokenDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T16:38:37.347887+03:00[Europe/Kiev]")
public class EmspTokenControllerApi {
    private ApiClient apiClient;

    public EmspTokenControllerApi() {
        this(new ApiClient());
    }

    public EmspTokenControllerApi(ApiClient apiClient) {
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
     * @param dateFrom  (required)
     * @param dateTo  (required)
     * @param offset  (required)
     * @param limit  (required)
     * @return List&lt;TokenDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TokenDTO> getToken(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getTokenWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (required)
     * @param dateTo  (required)
     * @param offset  (required)
     * @param limit  (required)
     * @return ResponseEntity&lt;List&lt;TokenDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TokenDTO>> getTokenWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateFrom' when calling getToken");
        }
        
        // verify the required parameter 'dateTo' is set
        if (dateTo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTo' when calling getToken");
        }
        
        // verify the required parameter 'offset' is set
        if (offset == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offset' when calling getToken");
        }
        
        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limit' when calling getToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("date_from", dateFrom);
        uriVariables.put("date_to", dateTo);
        uriVariables.put("offset", offset);
        uriVariables.put("limit", limit);

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

        ParameterizedTypeReference<List<TokenDTO>> localReturnType = new ParameterizedTypeReference<List<TokenDTO>>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/tokens/{date_from}/{date_to}/{offset}/{limit}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tokenUid  (required)
     * @param type  (required)
     * @param locationReferencesRequestDTO  (required)
     * @return AuthorizationInfoResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthorizationInfoResponseDTO postToken(String tokenUid, String type, LocationReferencesRequestDTO locationReferencesRequestDTO) throws RestClientException {
        return postTokenWithHttpInfo(tokenUid, type, locationReferencesRequestDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param tokenUid  (required)
     * @param type  (required)
     * @param locationReferencesRequestDTO  (required)
     * @return ResponseEntity&lt;AuthorizationInfoResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthorizationInfoResponseDTO> postTokenWithHttpInfo(String tokenUid, String type, LocationReferencesRequestDTO locationReferencesRequestDTO) throws RestClientException {
        Object localVarPostBody = locationReferencesRequestDTO;
        
        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling postToken");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling postToken");
        }
        
        // verify the required parameter 'locationReferencesRequestDTO' is set
        if (locationReferencesRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationReferencesRequestDTO' when calling postToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AuthorizationInfoResponseDTO> localReturnType = new ParameterizedTypeReference<AuthorizationInfoResponseDTO>() {};
        return apiClient.invokeAPI("/emsp/api/2.2.1/tokens/{token_uid}/{type}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
