# CpoSessionsControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSessions**](CpoSessionsControllerApi.md#getSessions) | **GET** /cpo/api/2.2.1/sessions |  |
| [**putChargingPreferences**](CpoSessionsControllerApi.md#putChargingPreferences) | **PUT** /cpo/api/2.2.1/sessions |  |



## getSessions

> List&lt;SessionDTO&gt; getSessions(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoSessionsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoSessionsControllerApi apiInstance = new CpoSessionsControllerApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 0; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            List<SessionDTO> result = apiInstance.getSessions(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoSessionsControllerApi#getSessions");
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
| **dateFrom** | **OffsetDateTime**|  | |
| **dateTo** | **OffsetDateTime**|  | [optional] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;SessionDTO&gt;**](SessionDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putChargingPreferences

> ChargingPreferencesDTO putChargingPreferences(sessionId, chargingPreferencesDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoSessionsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoSessionsControllerApi apiInstance = new CpoSessionsControllerApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        ChargingPreferencesDTO chargingPreferencesDTO = new ChargingPreferencesDTO(); // ChargingPreferencesDTO | 
        try {
            ChargingPreferencesDTO result = apiInstance.putChargingPreferences(sessionId, chargingPreferencesDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoSessionsControllerApi#putChargingPreferences");
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
| **chargingPreferencesDTO** | [**ChargingPreferencesDTO**](ChargingPreferencesDTO.md)|  | |

### Return type

[**ChargingPreferencesDTO**](ChargingPreferencesDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

