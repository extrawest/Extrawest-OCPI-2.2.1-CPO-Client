# CpoTokensApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](CpoTokensApi.md#getToken) | **GET** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |  |
| [**patchToken**](CpoTokensApi.md#patchToken) | **PATCH** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |  |
| [**putToken**](CpoTokensApi.md#putToken) | **PUT** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |  |



## getToken

> ResponseFormatTokenDto getToken(countryCode, partyId, tokenUid, type)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTokensApi apiInstance = new CpoTokensApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tokenUid = "tokenUid_example"; // String | 
        String type = "AD_HOC_USER"; // String | 
        try {
            ResponseFormatTokenDto result = apiInstance.getToken(countryCode, partyId, tokenUid, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTokensApi#getToken");
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
| **tokenUid** | **String**|  | |
| **type** | **String**|  | [enum: AD_HOC_USER, APP_USER, OTHER, RFID] |

### Return type

[**ResponseFormatTokenDto**](ResponseFormatTokenDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## patchToken

> ResponseFormatTokenDto patchToken(countryCode, partyId, tokenUid, type, tokenDto)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTokensApi apiInstance = new CpoTokensApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tokenUid = "tokenUid_example"; // String | 
        String type = "AD_HOC_USER"; // String | 
        TokenDto tokenDto = new TokenDto(); // TokenDto | 
        try {
            ResponseFormatTokenDto result = apiInstance.patchToken(countryCode, partyId, tokenUid, type, tokenDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTokensApi#patchToken");
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
| **tokenUid** | **String**|  | |
| **type** | **String**|  | [enum: AD_HOC_USER, APP_USER, OTHER, RFID] |
| **tokenDto** | [**TokenDto**](TokenDto.md)|  | |

### Return type

[**ResponseFormatTokenDto**](ResponseFormatTokenDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putToken

> ResponseFormatTokenDto putToken(countryCode, partyId, tokenUid, type, tokenDto)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoTokensApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTokensApi apiInstance = new CpoTokensApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tokenUid = "tokenUid_example"; // String | 
        String type = "AD_HOC_USER"; // String | 
        TokenDto tokenDto = new TokenDto(); // TokenDto | 
        try {
            ResponseFormatTokenDto result = apiInstance.putToken(countryCode, partyId, tokenUid, type, tokenDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTokensApi#putToken");
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
| **tokenUid** | **String**|  | |
| **type** | **String**|  | [enum: AD_HOC_USER, APP_USER, OTHER, RFID] |
| **tokenDto** | [**TokenDto**](TokenDto.md)|  | |

### Return type

[**ResponseFormatTokenDto**](ResponseFormatTokenDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

