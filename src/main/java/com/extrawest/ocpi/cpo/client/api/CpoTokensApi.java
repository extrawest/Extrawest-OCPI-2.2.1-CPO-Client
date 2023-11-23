package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.ResponseFormatTokenDto;
import com.extrawest.ocpi.cpo.client.model.TokenDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class CpoTokensApi {
    private ApiClient apiClient;

    public CpoTokensApi() {
        this(new ApiClient());
    }

    public CpoTokensApi(ApiClient apiClient) {
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
     * @param countryCode (required)
     * @param partyId     (required)
     * @param tokenUid    (required)
     * @param type        (required)
     * @return ResponseFormatTokenDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatTokenDto getToken(String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        return getTokenWithHttpInfo(countryCode, partyId, tokenUid, type).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param tokenUid    (required)
     * @param type        (required)
     * @return ResponseEntity&lt;ResponseFormatTokenDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatTokenDto> getTokenWithHttpInfo(String countryCode, String partyId, String tokenUid, String type) throws RestClientException {
        Object localVarPostBody = null;

        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryCode' when calling getToken");
        }

        // verify the required parameter 'partyId' is set
        if (partyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'partyId' when calling getToken");
        }

        // verify the required parameter 'tokenUid' is set
        if (tokenUid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenUid' when calling getToken");
        }

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling getToken");
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
        final String[] localVarContentTypes = {};
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatTokenDto> localReturnType = new ParameterizedTypeReference<ResponseFormatTokenDto>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param tokenUid    (required)
     * @param type        (required)
     * @param tokenDto    (required)
     * @return ResponseFormatTokenDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatTokenDto patchToken(String countryCode, String partyId, String tokenUid, String type, TokenDto tokenDto) throws RestClientException {
        return patchTokenWithHttpInfo(countryCode, partyId, tokenUid, type, tokenDto).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param tokenUid    (required)
     * @param type        (required)
     * @param tokenDto    (required)
     * @return ResponseEntity&lt;ResponseFormatTokenDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatTokenDto> patchTokenWithHttpInfo(String countryCode, String partyId, String tokenUid, String type, TokenDto tokenDto) throws RestClientException {
        Object localVarPostBody = tokenDto;

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

        // verify the required parameter 'tokenDto' is set
        if (tokenDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenDto' when calling patchToken");
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
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatTokenDto> localReturnType = new ParameterizedTypeReference<ResponseFormatTokenDto>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param tokenUid    (required)
     * @param type        (required)
     * @param tokenDto    (required)
     * @return ResponseFormatTokenDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatTokenDto putToken(String countryCode, String partyId, String tokenUid, String type, TokenDto tokenDto) throws RestClientException {
        return putTokenWithHttpInfo(countryCode, partyId, tokenUid, type, tokenDto).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param countryCode (required)
     * @param partyId     (required)
     * @param tokenUid    (required)
     * @param type        (required)
     * @param tokenDto    (required)
     * @return ResponseEntity&lt;ResponseFormatTokenDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatTokenDto> putTokenWithHttpInfo(String countryCode, String partyId, String tokenUid, String type, TokenDto tokenDto) throws RestClientException {
        Object localVarPostBody = tokenDto;

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

        // verify the required parameter 'tokenDto' is set
        if (tokenDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenDto' when calling putToken");
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
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatTokenDto> localReturnType = new ParameterizedTypeReference<ResponseFormatTokenDto>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
