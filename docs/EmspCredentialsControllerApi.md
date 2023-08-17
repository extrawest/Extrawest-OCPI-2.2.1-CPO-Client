# EmspCredentialsControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCredentials**](EmspCredentialsControllerApi.md#deleteCredentials) | **DELETE** /emsp/api/2.2.1/credentials |  |
| [**getCredentials**](EmspCredentialsControllerApi.md#getCredentials) | **GET** /emsp/api/2.2.1/credentials |  |
| [**postCredentials**](EmspCredentialsControllerApi.md#postCredentials) | **POST** /emsp/api/2.2.1/credentials |  |
| [**putCredentials**](EmspCredentialsControllerApi.md#putCredentials) | **PUT** /emsp/api/2.2.1/credentials |  |



## deleteCredentials

> deleteCredentials(credentialsDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi(defaultClient);
        CredentialsDTO credentialsDTO = new CredentialsDTO(); // CredentialsDTO | 
        try {
            apiInstance.deleteCredentials(credentialsDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCredentialsControllerApi#deleteCredentials");
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
| **credentialsDTO** | [**CredentialsDTO**](CredentialsDTO.md)|  | |

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


## getCredentials

> CredentialsDTO getCredentials()



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi(defaultClient);
        try {
            CredentialsDTO result = apiInstance.getCredentials();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCredentialsControllerApi#getCredentials");
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

[**CredentialsDTO**](CredentialsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postCredentials

> postCredentials(credentialsDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi(defaultClient);
        CredentialsDTO credentialsDTO = new CredentialsDTO(); // CredentialsDTO | 
        try {
            apiInstance.postCredentials(credentialsDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCredentialsControllerApi#postCredentials");
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
| **credentialsDTO** | [**CredentialsDTO**](CredentialsDTO.md)|  | |

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


## putCredentials

> putCredentials(credentialsDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.EmspCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EmspCredentialsControllerApi apiInstance = new EmspCredentialsControllerApi(defaultClient);
        CredentialsDTO credentialsDTO = new CredentialsDTO(); // CredentialsDTO | 
        try {
            apiInstance.putCredentials(credentialsDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmspCredentialsControllerApi#putCredentials");
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
| **credentialsDTO** | [**CredentialsDTO**](CredentialsDTO.md)|  | |

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

