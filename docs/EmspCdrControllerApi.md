# EmspCdrControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCdr**](EmspCdrControllerApi.md#getCdr) | **GET** /emsp/api/2.2.1/cdr/{id} |  |
| [**postCdr**](EmspCdrControllerApi.md#postCdr) | **POST** /emsp/api/2.2.1/cdr |  |



## getCdr

> CdrDTO getCdr(id)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.EmspCdrControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCdrControllerApi apiInstance = new EmspCdrControllerApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            CdrDTO result = apiInstance.getCdr(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCdrControllerApi#getCdr");
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
| **id** | **String**|  | |

### Return type

[**CdrDTO**](CdrDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postCdr

> String postCdr(cdrDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.EmspCdrControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCdrControllerApi apiInstance = new EmspCdrControllerApi(defaultClient);
        CdrDTO cdrDTO = new CdrDTO(); // CdrDTO | 
        try {
            String result = apiInstance.postCdr(cdrDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCdrControllerApi#postCdr");
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
| **cdrDTO** | [**CdrDTO**](CdrDTO.md)|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

