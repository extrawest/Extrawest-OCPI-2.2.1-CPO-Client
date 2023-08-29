# CpoVersionApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getVersion**](CpoVersionApi.md#getVersion) | **GET** /cpo/api/2.2.1/versions |  |
| [**getVersionDetails**](CpoVersionApi.md#getVersionDetails) | **GET** /cpo/api/2.2.1/versions/details/{version} |  |



## getVersion

> List&lt;VersionResponseDTO&gt; getVersion()



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoVersionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoVersionApi apiInstance = new CpoVersionApi(defaultClient);
        try {
            List<VersionResponseDTO> result = apiInstance.getVersion();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoVersionApi#getVersion");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;VersionResponseDTO&gt;**](VersionResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getVersionDetails

> VersionDetailsResponseDTO getVersionDetails(version)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoVersionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoVersionApi apiInstance = new CpoVersionApi(defaultClient);
        String version = "2.0"; // String | 
        try {
            VersionDetailsResponseDTO result = apiInstance.getVersionDetails(version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoVersionApi#getVersionDetails");
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

