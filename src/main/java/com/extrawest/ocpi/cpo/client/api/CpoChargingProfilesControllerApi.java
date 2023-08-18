package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.ChargingProfileResponseDTO;
import com.extrawest.ocpi.cpo.client.model.SetChargingProfileRequestDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-17T17:07:56.219565+03:00[Europe/Kiev]")
public class CpoChargingProfilesControllerApi {
    private ApiClient apiClient;

    public CpoChargingProfilesControllerApi() {
        this(new ApiClient());
    }

    public CpoChargingProfilesControllerApi(ApiClient apiClient) {
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
     * @param sessionId  (required)
     * @param responseUrl  (required)
     * @return ChargingProfileResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingProfileResponseDTO deleteChargingProfile(String sessionId, String responseUrl) throws RestClientException {
        return deleteChargingProfileWithHttpInfo(sessionId, responseUrl).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param responseUrl  (required)
     * @return ResponseEntity&lt;ChargingProfileResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingProfileResponseDTO> deleteChargingProfileWithHttpInfo(String sessionId, String responseUrl) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling deleteChargingProfile");
        }
        
        // verify the required parameter 'responseUrl' is set
        if (responseUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseUrl' when calling deleteChargingProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);
        uriVariables.put("response_url", responseUrl);

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

        ParameterizedTypeReference<ChargingProfileResponseDTO> localReturnType = new ParameterizedTypeReference<ChargingProfileResponseDTO>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/chargingProfiles/{session_id}/{response_url}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param duration  (required)
     * @param responseUrl  (required)
     * @return ChargingProfileResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingProfileResponseDTO getChargingProfile(String sessionId, Integer duration, String responseUrl) throws RestClientException {
        return getChargingProfileWithHttpInfo(sessionId, duration, responseUrl).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param duration  (required)
     * @param responseUrl  (required)
     * @return ResponseEntity&lt;ChargingProfileResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingProfileResponseDTO> getChargingProfileWithHttpInfo(String sessionId, Integer duration, String responseUrl) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling getChargingProfile");
        }
        
        // verify the required parameter 'duration' is set
        if (duration == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'duration' when calling getChargingProfile");
        }
        
        // verify the required parameter 'responseUrl' is set
        if (responseUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'responseUrl' when calling getChargingProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("session_id", sessionId);
        uriVariables.put("duration", duration);
        uriVariables.put("response_url", responseUrl);

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

        ParameterizedTypeReference<ChargingProfileResponseDTO> localReturnType = new ParameterizedTypeReference<ChargingProfileResponseDTO>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/chargingProfiles/{session_id}/{duration}/{response_url}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param setChargingProfileRequestDTO  (required)
     * @return ChargingProfileResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingProfileResponseDTO putChargingProfile1(String sessionId, SetChargingProfileRequestDTO setChargingProfileRequestDTO) throws RestClientException {
        return putChargingProfile1WithHttpInfo(sessionId, setChargingProfileRequestDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param setChargingProfileRequestDTO  (required)
     * @return ResponseEntity&lt;ChargingProfileResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingProfileResponseDTO> putChargingProfile1WithHttpInfo(String sessionId, SetChargingProfileRequestDTO setChargingProfileRequestDTO) throws RestClientException {
        Object localVarPostBody = setChargingProfileRequestDTO;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putChargingProfile1");
        }
        
        // verify the required parameter 'setChargingProfileRequestDTO' is set
        if (setChargingProfileRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setChargingProfileRequestDTO' when calling putChargingProfile1");
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

        ParameterizedTypeReference<ChargingProfileResponseDTO> localReturnType = new ParameterizedTypeReference<ChargingProfileResponseDTO>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/chargingProfiles/{session_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
