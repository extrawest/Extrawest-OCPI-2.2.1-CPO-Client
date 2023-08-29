# CpoTariffApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTariffs**](CpoTariffApi.md#getTariffs) | **GET** /cpo/api/2.2.1/tariffs |  |



## getTariffs

> List&lt;TariffDTO&gt; getTariffs(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoTariffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTariffApi apiInstance = new CpoTariffApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 0; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            List<TariffDTO> result = apiInstance.getTariffs(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTariffApi#getTariffs");
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
| **dateFrom** | **OffsetDateTime**|  | [optional] |
| **dateTo** | **OffsetDateTime**|  | [optional] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;TariffDTO&gt;**](TariffDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

