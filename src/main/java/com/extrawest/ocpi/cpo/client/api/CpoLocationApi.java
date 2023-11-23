package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.ResponseFormatListLocation;
import com.extrawest.ocpi.cpo.client.model.ResponseFormatLocationData;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class CpoLocationApi {
    private ApiClient apiClient;

    public CpoLocationApi() {
        this(new ApiClient());
    }

    public CpoLocationApi(ApiClient apiClient) {
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
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param connectorId (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData getConnector(String locationId, String evseUid, String connectorId) throws RestClientException {
        return getConnectorWithHttpInfo(locationId, evseUid, connectorId).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param locationId  (required)
     * @param evseUid     (required)
     * @param connectorId (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> getConnectorWithHttpInfo(String locationId, String evseUid, String connectorId) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getConnector");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling getConnector");
        }

        // verify the required parameter 'connectorId' is set
        if (connectorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectorId' when calling getConnector");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);
        uriVariables.put("connector_id", connectorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/locations/{location_id}/{evse_uid}/{connector_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param locationId (required)
     * @param evseUid    (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData getEvse(String locationId, String evseUid) throws RestClientException {
        return getEvseWithHttpInfo(locationId, evseUid).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param locationId (required)
     * @param evseUid    (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> getEvseWithHttpInfo(String locationId, String evseUid) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getEvse");
        }

        // verify the required parameter 'evseUid' is set
        if (evseUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evseUid' when calling getEvse");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("location_id", locationId);
        uriVariables.put("evse_uid", evseUid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/locations/{location_id}/{evse_uid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param locationId (required)
     * @return ResponseFormatLocationData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatLocationData getLocation(String locationId) throws RestClientException {
        return getLocationWithHttpInfo(locationId).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param locationId (required)
     * @return ResponseEntity&lt;ResponseFormatLocationData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatLocationData> getLocationWithHttpInfo(String locationId) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'locationId' is set
        if (locationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'locationId' when calling getLocation");
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("location_id", locationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {
                "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatLocationData> localReturnType = new ParameterizedTypeReference<ResponseFormatLocationData>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/locations/{location_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param dateFrom (optional)
     * @param dateTo   (optional)
     * @param offset   (optional, default to 0)
     * @param limit    (optional)
     * @return ResponseFormatListLocation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatListLocation getLocations(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
        return getLocationsWithHttpInfo(dateFrom, dateTo, offset, limit).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param dateFrom (optional)
     * @param dateTo   (optional)
     * @param offset   (optional, default to 0)
     * @param limit    (optional)
     * @return ResponseEntity&lt;ResponseFormatListLocation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatListLocation> getLocationsWithHttpInfo(OffsetDateTime dateFrom, OffsetDateTime dateTo, Integer offset, Integer limit) throws RestClientException {
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

        ParameterizedTypeReference<ResponseFormatListLocation> localReturnType = new ParameterizedTypeReference<ResponseFormatListLocation>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/locations", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
