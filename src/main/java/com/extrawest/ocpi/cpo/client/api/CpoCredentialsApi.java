package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.CredentialsDto;
import com.extrawest.ocpi.cpo.client.model.ResponseFormatCredentialsDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class CpoCredentialsApi {
    private ApiClient apiClient;

    public CpoCredentialsApi() {
        this(new ApiClient());
    }

    public CpoCredentialsApi(ApiClient apiClient) {
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
     * @param credentialsDto (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCredentials(CredentialsDto credentialsDto) throws RestClientException {
        deleteCredentialsWithHttpInfo(credentialsDto);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param credentialsDto (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCredentialsWithHttpInfo(CredentialsDto credentialsDto) throws RestClientException {
        Object localVarPostBody = credentialsDto;

        // verify the required parameter 'credentialsDto' is set
        if (credentialsDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'credentialsDto' when calling deleteCredentials");
        }


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {};
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/credentials", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @return ResponseFormatCredentialsDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatCredentialsDto getCredentials() throws RestClientException {
        return getCredentialsWithHttpInfo().getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @return ResponseEntity&lt;ResponseFormatCredentialsDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatCredentialsDto> getCredentialsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;


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

        ParameterizedTypeReference<ResponseFormatCredentialsDto> localReturnType = new ParameterizedTypeReference<ResponseFormatCredentialsDto>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/credentials", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param credentialsDto (required)
     * @return ResponseFormatCredentialsDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseFormatCredentialsDto postCredentials(CredentialsDto credentialsDto) throws RestClientException {
        return postCredentialsWithHttpInfo(credentialsDto).getBody();
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param credentialsDto (required)
     * @return ResponseEntity&lt;ResponseFormatCredentialsDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseFormatCredentialsDto> postCredentialsWithHttpInfo(CredentialsDto credentialsDto) throws RestClientException {
        Object localVarPostBody = credentialsDto;

        // verify the required parameter 'credentialsDto' is set
        if (credentialsDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'credentialsDto' when calling postCredentials");
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

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<ResponseFormatCredentialsDto> localReturnType = new ParameterizedTypeReference<ResponseFormatCredentialsDto>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/credentials", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param credentialsDto (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putCredentials(CredentialsDto credentialsDto) throws RestClientException {
        putCredentialsWithHttpInfo(credentialsDto);
    }

    /**
     * <p><b>200</b> - OK
     *
     * @param credentialsDto (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putCredentialsWithHttpInfo(CredentialsDto credentialsDto) throws RestClientException {
        Object localVarPostBody = credentialsDto;

        // verify the required parameter 'credentialsDto' is set
        if (credentialsDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'credentialsDto' when calling putCredentials");
        }


        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {};
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {
                "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {
        };
        return apiClient.invokeAPI("/cpo/api/2.2.1/credentials", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
