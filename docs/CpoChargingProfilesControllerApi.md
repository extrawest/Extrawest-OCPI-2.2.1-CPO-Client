# CpoChargingProfilesControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteChargingProfile**](CpoChargingProfilesControllerApi.md#deleteChargingProfile) | **DELETE** /cpo/api/2.2.1/chargingProfiles/{session_id}/{response_url} |  |
| [**getChargingProfile**](CpoChargingProfilesControllerApi.md#getChargingProfile) | **GET** /cpo/api/2.2.1/chargingProfiles/{session_id}/{duration}/{response_url} |  |
| [**putChargingProfile1**](CpoChargingProfilesControllerApi.md#putChargingProfile1) | **PUT** /cpo/api/2.2.1/chargingProfiles/{session_id} |  |



## deleteChargingProfile

> ChargingProfileResponseDTO deleteChargingProfile(sessionId, responseUrl)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoChargingProfilesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoChargingProfilesControllerApi apiInstance = new CpoChargingProfilesControllerApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        String responseUrl = "responseUrl_example"; // String | 
        try {
            ChargingProfileResponseDTO result = apiInstance.deleteChargingProfile(sessionId, responseUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoChargingProfilesControllerApi#deleteChargingProfile");
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
| **sessionId** | **String**|  | |
| **responseUrl** | **String**|  | |

### Return type

[**ChargingProfileResponseDTO**](ChargingProfileResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getChargingProfile

> ChargingProfileResponseDTO getChargingProfile(sessionId, duration, responseUrl)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoChargingProfilesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoChargingProfilesControllerApi apiInstance = new CpoChargingProfilesControllerApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        Integer duration = 56; // Integer | 
        String responseUrl = "responseUrl_example"; // String | 
        try {
            ChargingProfileResponseDTO result = apiInstance.getChargingProfile(sessionId, duration, responseUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoChargingProfilesControllerApi#getChargingProfile");
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
| **sessionId** | **String**|  | |
| **duration** | **Integer**|  | |
| **responseUrl** | **String**|  | |

### Return type

[**ChargingProfileResponseDTO**](ChargingProfileResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putChargingProfile1

> ChargingProfileResponseDTO putChargingProfile1(sessionId, setChargingProfileRequestDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoChargingProfilesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoChargingProfilesControllerApi apiInstance = new CpoChargingProfilesControllerApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        SetChargingProfileRequestDTO setChargingProfileRequestDTO = new SetChargingProfileRequestDTO(); // SetChargingProfileRequestDTO | 
        try {
            ChargingProfileResponseDTO result = apiInstance.putChargingProfile1(sessionId, setChargingProfileRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoChargingProfilesControllerApi#putChargingProfile1");
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
| **sessionId** | **String**|  | |
| **setChargingProfileRequestDTO** | [**SetChargingProfileRequestDTO**](SetChargingProfileRequestDTO.md)|  | |

### Return type

[**ChargingProfileResponseDTO**](ChargingProfileResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

