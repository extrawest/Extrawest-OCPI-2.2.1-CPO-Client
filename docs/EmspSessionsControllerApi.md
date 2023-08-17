# EmspSessionsControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSession**](EmspSessionsControllerApi.md#getSession) | **GET** /emsp/api/2.2.1/sessions |  |
| [**patchSession**](EmspSessionsControllerApi.md#patchSession) | **PATCH** /emsp/api/2.2.1/sessions |  |
| [**putSession**](EmspSessionsControllerApi.md#putSession) | **PUT** /emsp/api/2.2.1/sessions |  |



## getSession

> SessionDTO getSession(countryCode, partyId, sessionId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspSessionsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspSessionsControllerApi apiInstance = new EmspSessionsControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            SessionDTO result = apiInstance.getSession(countryCode, partyId, sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspSessionsControllerApi#getSession");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**|  | |
| **partyId** | **String**|  | |
| **sessionId** | **String**|  | |

### Return type

[**SessionDTO**](SessionDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchSession

> patchSession(countryCode, partyId, sessionId, sessionDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspSessionsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspSessionsControllerApi apiInstance = new EmspSessionsControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        SessionDTO sessionDTO = new SessionDTO(); // SessionDTO | 
        try {
            apiInstance.patchSession(countryCode, partyId, sessionId, sessionDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspSessionsControllerApi#patchSession");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**|  | |
| **partyId** | **String**|  | |
| **sessionId** | **String**|  | |
| **sessionDTO** | [**SessionDTO**](SessionDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putSession

> putSession(countryCode, partyId, sessionId, sessionDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspSessionsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspSessionsControllerApi apiInstance = new EmspSessionsControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        SessionDTO sessionDTO = new SessionDTO(); // SessionDTO | 
        try {
            apiInstance.putSession(countryCode, partyId, sessionId, sessionDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspSessionsControllerApi#putSession");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**|  | |
| **partyId** | **String**|  | |
| **sessionId** | **String**|  | |
| **sessionDTO** | [**SessionDTO**](SessionDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

