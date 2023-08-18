# CpoCredentialsControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCredentials1**](CpoCredentialsControllerApi.md#deleteCredentials1) | **DELETE** /cpo/api/2.2.1/credentials |  |
| [**getCredentials1**](CpoCredentialsControllerApi.md#getCredentials1) | **GET** /cpo/api/2.2.1/credentials |  |
| [**postCredentials1**](CpoCredentialsControllerApi.md#postCredentials1) | **POST** /cpo/api/2.2.1/credentials |  |
| [**putCredentials1**](CpoCredentialsControllerApi.md#putCredentials1) | **PUT** /cpo/api/2.2.1/credentials |  |



## deleteCredentials1

> deleteCredentials1(credentialsDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi(defaultClient);
        CredentialsDTO credentialsDTO = new CredentialsDTO(); // CredentialsDTO | 
        try {
            apiInstance.deleteCredentials1(credentialsDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoCredentialsControllerApi#deleteCredentials1");
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


## getCredentials1

> CredentialsDTO getCredentials1()



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi(defaultClient);
        try {
            CredentialsDTO result = apiInstance.getCredentials1();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoCredentialsControllerApi#getCredentials1");
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


## postCredentials1

> postCredentials1(credentialsDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi(defaultClient);
        CredentialsDTO credentialsDTO = new CredentialsDTO(); // CredentialsDTO | 
        try {
            apiInstance.postCredentials1(credentialsDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoCredentialsControllerApi#postCredentials1");
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


## putCredentials1

> putCredentials1(credentialsDTO)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoCredentialsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoCredentialsControllerApi apiInstance = new CpoCredentialsControllerApi(defaultClient);
        CredentialsDTO credentialsDTO = new CredentialsDTO(); // CredentialsDTO | 
        try {
            apiInstance.putCredentials1(credentialsDTO);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoCredentialsControllerApi#putCredentials1");
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

