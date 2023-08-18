# EmspChargingProfilesControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postChargingProfile**](EmspChargingProfilesControllerApi.md#postChargingProfile) | **POST** /emsp/api/2.2.1/chargingProfiles |  |
| [**putChargingProfile**](EmspChargingProfilesControllerApi.md#putChargingProfile) | **PUT** /emsp/api/2.2.1/chargingProfiles/{session_id} |  |



## postChargingProfile

> ResponseFormat postChargingProfile(abstractProfileResult)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.EmspChargingProfilesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspChargingProfilesControllerApi apiInstance = new EmspChargingProfilesControllerApi(defaultClient);
        AbstractProfileResult abstractProfileResult = new AbstractProfileResult(); // AbstractProfileResult | 
        try {
            ResponseFormat result = apiInstance.postChargingProfile(abstractProfileResult);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspChargingProfilesControllerApi#postChargingProfile");
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
| **abstractProfileResult** | [**AbstractProfileResult**](AbstractProfileResult.md)|  | |

### Return type

[**ResponseFormat**](ResponseFormat.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putChargingProfile

> ResponseFormat putChargingProfile(sessionId, activeChargingProfileRequestDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.EmspChargingProfilesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspChargingProfilesControllerApi apiInstance = new EmspChargingProfilesControllerApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        ActiveChargingProfileRequestDTO activeChargingProfileRequestDTO = new ActiveChargingProfileRequestDTO(); // ActiveChargingProfileRequestDTO | 
        try {
            ResponseFormat result = apiInstance.putChargingProfile(sessionId, activeChargingProfileRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspChargingProfilesControllerApi#putChargingProfile");
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
| **activeChargingProfileRequestDTO** | [**ActiveChargingProfileRequestDTO**](ActiveChargingProfileRequestDTO.md)|  | |

### Return type

[**ResponseFormat**](ResponseFormat.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

