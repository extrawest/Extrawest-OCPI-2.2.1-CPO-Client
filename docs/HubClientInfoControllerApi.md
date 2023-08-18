# HubClientInfoControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClientInfoList**](HubClientInfoControllerApi.md#getClientInfoList) | **GET** /hub/api/2.2.1/hubClientInfo/{date_from}/{date_to}/{offset}/{limit} |  |



## getClientInfoList

> List&lt;ClientInfoDTO&gt; getClientInfoList(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.HubClientInfoControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        HubClientInfoControllerApi apiInstance = new HubClientInfoControllerApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 56; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            List<ClientInfoDTO> result = apiInstance.getClientInfoList(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HubClientInfoControllerApi#getClientInfoList");
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
| **dateTo** | **OffsetDateTime**|  | |
| **offset** | **Integer**|  | |
| **limit** | **Integer**|  | |

### Return type

[**List&lt;ClientInfoDTO&gt;**](ClientInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

