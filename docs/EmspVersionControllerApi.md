# EmspVersionControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVersionDetails**](EmspVersionControllerApi.md#getVersionDetails) | **GET** /emsp/api/2.2.1/versions/details/{version} |  |



## getVersionDetails

> VersionDetailsResponseDTO getVersionDetails(version)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspVersionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspVersionControllerApi apiInstance = new EmspVersionControllerApi(defaultClient);
        String version = "2.0"; // String | 
        try {
            VersionDetailsResponseDTO result = apiInstance.getVersionDetails(version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspVersionControllerApi#getVersionDetails");
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
| **version** | **String**|  | [enum: 2.0, 2.1, 2.1.1, 2.2, 2.2.1] |

### Return type

[**VersionDetailsResponseDTO**](VersionDetailsResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

