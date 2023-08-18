package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.ClientInfoDTO;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T12:07:41.590741+03:00[Europe/Kiev]")
public class HubClientInfoControllerApi {
    private ApiClient apiClient;

    public HubClientInfoControllerApi() {
        this(new ApiClient());
    }

    public HubClientInfoControllerApi(ApiClient apiClient) {
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
     * @return List&lt;ClientInfoDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ClientInfoDTO> getClientInfoList(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getClientInfoListWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param dateFrom  (required)
     * @param dateTo  (required)
     * @param offset  (required)
     * @param limit  (required)
     * @return ResponseEntity&lt;List&lt;ClientInfoDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<ClientInfoDTO>> getClientInfoListWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'dateFrom' is set
        if (dateFrom == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateFrom' when calling getClientInfoList");
        }
        
        // verify the required parameter 'dateTo' is set
        if (dateTo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTo' when calling getClientInfoList");
        }
        
        // verify the required parameter 'offset' is set
        if (offset == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'offset' when calling getClientInfoList");
        }
        
        // verify the required parameter 'limit' is set
        if (limit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'limit' when calling getClientInfoList");
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

        ParameterizedTypeReference<List<ClientInfoDTO>> localReturnType = new ParameterizedTypeReference<List<ClientInfoDTO>>() {};
        return apiClient.invokeAPI("/hub/api/2.2.1/hubClientInfo/{date_from}/{date_to}/{offset}/{limit}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
