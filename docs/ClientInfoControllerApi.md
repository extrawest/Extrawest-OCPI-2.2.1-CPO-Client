# ClientInfoControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getHubClientInfo**](ClientInfoControllerApi.md#getHubClientInfo) | **GET** /api/2.2.1/hubClientInfo/{country_code}/{party_id} |  |
| [**putHubClientInfo**](ClientInfoControllerApi.md#putHubClientInfo) | **PUT** /api/2.2.1/hubClientInfo/{country_code}/{party_id} |  |



## getHubClientInfo

> ClientInfoDTO getHubClientInfo(countryCode, partyId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.ClientInfoControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ClientInfoControllerApi apiInstance = new ClientInfoControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        try {
            ClientInfoDTO result = apiInstance.getHubClientInfo(countryCode, partyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientInfoControllerApi#getHubClientInfo");
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

### Return type

[**ClientInfoDTO**](ClientInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putHubClientInfo

> putHubClientInfo(countryCode, partyId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.ClientInfoControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ClientInfoControllerApi apiInstance = new ClientInfoControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        try {
            apiInstance.putHubClientInfo(countryCode, partyId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientInfoControllerApi#putHubClientInfo");
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

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

