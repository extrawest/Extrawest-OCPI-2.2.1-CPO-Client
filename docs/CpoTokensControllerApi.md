# CpoTokensControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken1**](CpoTokensControllerApi.md#getToken1) | **GET** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |  |
| [**patchToken**](CpoTokensControllerApi.md#patchToken) | **PATCH** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |  |
| [**putToken**](CpoTokensControllerApi.md#putToken) | **PUT** /cpo/api/2.2.1/tokens/{country_code}/{party_id}/{token_uid}/{type} |  |



## getToken1

> TokenDTO getToken1(countryCode, partyId, tokenUid, type)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoTokensControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTokensControllerApi apiInstance = new CpoTokensControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tokenUid = "tokenUid_example"; // String | 
        String type = "AD_HOC_USER"; // String | 
        try {
            TokenDTO result = apiInstance.getToken1(countryCode, partyId, tokenUid, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTokensControllerApi#getToken1");
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

[**TokenDTO**](TokenDTO.md)

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

> patchToken(countryCode, partyId, tokenUid, type, tokenDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoTokensControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTokensControllerApi apiInstance = new CpoTokensControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tokenUid = "tokenUid_example"; // String | 
        String type = "AD_HOC_USER"; // String | 
        TokenDTO tokenDTO = new TokenDTO(); // TokenDTO | 
        try {
            apiInstance.patchToken(countryCode, partyId, tokenUid, type, tokenDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTokensControllerApi#patchToken");
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
| **tokenDTO** | [**TokenDTO**](TokenDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putToken

> putToken(countryCode, partyId, tokenUid, type, tokenDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoTokensControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoTokensControllerApi apiInstance = new CpoTokensControllerApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        String partyId = "partyId_example"; // String | 
        String tokenUid = "tokenUid_example"; // String | 
        String type = "AD_HOC_USER"; // String | 
        TokenDTO tokenDTO = new TokenDTO(); // TokenDTO | 
        try {
            apiInstance.putToken(countryCode, partyId, tokenUid, type, tokenDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoTokensControllerApi#putToken");
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
| **tokenDTO** | [**TokenDTO**](TokenDTO.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

