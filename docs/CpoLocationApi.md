# CpoLocationApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getConnector**](CpoLocationApi.md#getConnector) | **GET** /cpo/api/2.2.1/locations/{location_id}/{evse_uid}/{connector_id} |  |
| [**getEvse**](CpoLocationApi.md#getEvse) | **GET** /cpo/api/2.2.1/locations/{location_id}/{evse_uid} |  |
| [**getLocation**](CpoLocationApi.md#getLocation) | **GET** /cpo/api/2.2.1/locations/{location_id} |  |
| [**getLocations**](CpoLocationApi.md#getLocations) | **GET** /cpo/api/2.2.1/locations |  |



## getConnector

> ResponseFormatLocationData getConnector(locationId, evseUid, connectorId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoLocationApi apiInstance = new CpoLocationApi(defaultClient);
        String locationId = "locationId_example"; // String | 
        String evseUid = "evseUid_example"; // String | 
        String connectorId = "connectorId_example"; // String | 
        try {
            ResponseFormatLocationData result = apiInstance.getConnector(locationId, evseUid, connectorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoLocationApi#getConnector");
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
| **locationId** | **String**|  | |
| **evseUid** | **String**|  | |
| **connectorId** | **String**|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getEvse

> ResponseFormatLocationData getEvse(locationId, evseUid)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoLocationApi apiInstance = new CpoLocationApi(defaultClient);
        String locationId = "locationId_example"; // String | 
        String evseUid = "evseUid_example"; // String | 
        try {
            ResponseFormatLocationData result = apiInstance.getEvse(locationId, evseUid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoLocationApi#getEvse");
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
| **locationId** | **String**|  | |
| **evseUid** | **String**|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getLocation

> ResponseFormatLocationData getLocation(locationId)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoLocationApi apiInstance = new CpoLocationApi(defaultClient);
        String locationId = "locationId_example"; // String | 
        try {
            ResponseFormatLocationData result = apiInstance.getLocation(locationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoLocationApi#getLocation");
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
| **locationId** | **String**|  | |

### Return type

[**ResponseFormatLocationData**](ResponseFormatLocationData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getLocations

> ResponseFormatListLocation getLocations(dateFrom, dateTo, offset, limit)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoLocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoLocationApi apiInstance = new CpoLocationApi(defaultClient);
        OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | 
        Integer offset = 0; // Integer | 
        Integer limit = 56; // Integer | 
        try {
            ResponseFormatListLocation result = apiInstance.getLocations(dateFrom, dateTo, offset, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoLocationApi#getLocations");
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

[**ResponseFormatListLocation**](ResponseFormatListLocation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

