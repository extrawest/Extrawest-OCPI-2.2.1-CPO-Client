package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.ChargingPreferencesDTO;
import com.extrawest.ocpi.cpo.client.model.SessionDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T18:01:53.215553+03:00[Europe/Kiev]")
public class CpoSessionsApi {
    private ApiClient apiClient;

    public CpoSessionsApi() {
        this(new ApiClient());
    }

    public CpoSessionsApi(ApiClient apiClient) {
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
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return List&lt;SessionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SessionDTO> getSessions(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getSessionsWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (required)
     * @param dateTo  (optional)
     * @param offset  (optional, default to 0)
     * @param limit  (optional)
     * @return ResponseEntity&lt;List&lt;SessionDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SessionDTO>> getSessionsWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateFrom' when calling getSessions");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_from", dateFrom));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date_to", dateTo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<SessionDTO>> localReturnType = new ParameterizedTypeReference<List<SessionDTO>>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/sessions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param chargingPreferencesDTO  (required)
     * @return ChargingPreferencesDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChargingPreferencesDTO putChargingPreferences(String sessionId, ChargingPreferencesDTO chargingPreferencesDTO) throws RestClientException {
        return putChargingPreferencesWithHttpInfo(sessionId, chargingPreferencesDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param sessionId  (required)
     * @param chargingPreferencesDTO  (required)
     * @return ResponseEntity&lt;ChargingPreferencesDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ChargingPreferencesDTO> putChargingPreferencesWithHttpInfo(String sessionId, ChargingPreferencesDTO chargingPreferencesDTO) throws RestClientException {
        Object localVarPostBody = chargingPreferencesDTO;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling putChargingPreferences");
        }
        
        // verify the required parameter 'chargingPreferencesDTO' is set
        if (chargingPreferencesDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chargingPreferencesDTO' when calling putChargingPreferences");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "session_id", sessionId));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ChargingPreferencesDTO> localReturnType = new ParameterizedTypeReference<ChargingPreferencesDTO>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/sessions", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
