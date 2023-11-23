# CpoChargingProfilesApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteChargingProfile**](CpoChargingProfilesApi.md#deleteChargingProfile) | **DELETE** /cpo/api/2.2.1/chargingProfiles/{session_id}/{response_url} |  |
| [**getChargingProfile**](CpoChargingProfilesApi.md#getChargingProfile) | **GET** /cpo/api/2.2.1/chargingProfiles/{session_id}/{duration}/{response_url} |  |
| [**putChargingProfile**](CpoChargingProfilesApi.md#putChargingProfile) | **PUT** /cpo/api/2.2.1/chargingProfiles/{session_id} |  |



## deleteChargingProfile

> ResponseFormatChargingProfileResponse deleteChargingProfile(sessionId, responseUrl)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoChargingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoChargingProfilesApi apiInstance = new CpoChargingProfilesApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        String responseUrl = "responseUrl_example"; // String | 
        try {
            ResponseFormatChargingProfileResponse result = apiInstance.deleteChargingProfile(sessionId, responseUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoChargingProfilesApi#deleteChargingProfile");
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

[**ResponseFormatChargingProfileResponse**](ResponseFormatChargingProfileResponse.md)

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

> ResponseFormatChargingProfileResponse getChargingProfile(sessionId, duration, responseUrl)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoChargingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoChargingProfilesApi apiInstance = new CpoChargingProfilesApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        Integer duration = 56; // Integer | 
        String responseUrl = "responseUrl_example"; // String | 
        try {
            ResponseFormatChargingProfileResponse result = apiInstance.getChargingProfile(sessionId, duration, responseUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoChargingProfilesApi#getChargingProfile");
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

[**ResponseFormatChargingProfileResponse**](ResponseFormatChargingProfileResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putChargingProfile

> ResponseFormatObject putChargingProfile(sessionId, setChargingProfile)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoChargingProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoChargingProfilesApi apiInstance = new CpoChargingProfilesApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        SetChargingProfile setChargingProfile = new SetChargingProfile(); // SetChargingProfile | 
        try {
            ResponseFormatObject result = apiInstance.putChargingProfile(sessionId, setChargingProfile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoChargingProfilesApi#putChargingProfile");
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
| **setChargingProfile** | [**SetChargingProfile**](SetChargingProfile.md)|  | |

### Return type

[**ResponseFormatObject**](ResponseFormatObject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

