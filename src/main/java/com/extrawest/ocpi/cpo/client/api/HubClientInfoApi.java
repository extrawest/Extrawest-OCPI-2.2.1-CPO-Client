package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.ResponseFormatListClientInfoDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class HubClientInfoApi {
    private ApiClient apiClient;

    public HubClientInfoApi() {
        this(new ApiClient());
    }

    public HubClientInfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param dateFrom (optional)
     * @param dateTo   (optional)
     * @param offset   (optional, default to 0)
     * @param limit    (optional)
     * @return ResponseFormatListClientInfoDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatListClientInfoDto getClientInfoList(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getClientInfoListWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param dateFrom (optional)
     * @param dateTo   (optional)
     * @param offset   (optional, default to 0)
     * @param limit    (optional)
     * @return ResponseEntity&lt;ResponseFormatListClientInfoDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatListClientInfoDto> getClientInfoListWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;


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
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatListClientInfoDto> localReturnType = new ParameterizedTypeReference<ResponseFormatListClientInfoDto>() {
        };
        return apiClient.invokeAPI("/hub/api/2.2.1/hubClientInfo", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
