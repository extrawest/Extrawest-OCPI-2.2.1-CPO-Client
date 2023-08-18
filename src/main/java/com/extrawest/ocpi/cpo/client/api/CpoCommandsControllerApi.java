package com.extrawest.ocpi.cpo.client.api;

import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.model.AbstractCommand;
import com.extrawest.ocpi.cpo.client.model.CommandResponseDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T12:07:41.590741+03:00[Europe/Kiev]")
public class CpoCommandsControllerApi {
    private ApiClient apiClient;

    public CpoCommandsControllerApi() {
        this(new ApiClient());
    }

    public CpoCommandsControllerApi(ApiClient apiClient) {
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
     * @param command  (required)
     * @param abstractCommand  (required)
     * @return CommandResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommandResponseDTO postCommand(String command, AbstractCommand abstractCommand) throws RestClientException {
        return postCommandWithHttpInfo(command, abstractCommand).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param command  (required)
     * @param abstractCommand  (required)
     * @return ResponseEntity&lt;CommandResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommandResponseDTO> postCommandWithHttpInfo(String command, AbstractCommand abstractCommand) throws RestClientException {
        Object localVarPostBody = abstractCommand;
        
        // verify the required parameter 'command' is set
        if (command == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'command' when calling postCommand");
        }
        
        // verify the required parameter 'abstractCommand' is set
        if (abstractCommand == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'abstractCommand' when calling postCommand");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("command", command);

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

        ParameterizedTypeReference<CommandResponseDTO> localReturnType = new ParameterizedTypeReference<CommandResponseDTO>() {};
        return apiClient.invokeAPI("/cpo/api/2.2.1/commands/{command}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
