# CpoCommandsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postCommand**](CpoCommandsApi.md#postCommand) | **POST** /cpo/api/2.2.1/commands/{command} |  |



## postCommand

> CommandResponseDTO postCommand(command, abstractCommand)



### Example

```java
// Import classes:
import com.extrawest.ocpi.cpo.client.invoker.ApiClient;
import com.extrawest.ocpi.cpo.client.invoker.ApiException;
import com.extrawest.ocpi.cpo.client.invoker.Configuration;
import com.extrawest.ocpi.cpo.client.invoker.models.*;
import com.extrawest.ocpi.cpo.client.api.CpoCommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoCommandsApi apiInstance = new CpoCommandsApi(defaultClient);
        String command = "CANCEL_RESERVATION"; // String | 
        AbstractCommand abstractCommand = new AbstractCommand(); // AbstractCommand | 
        try {
            CommandResponseDTO result = apiInstance.postCommand(command, abstractCommand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoCommandsApi#postCommand");
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
| **command** | **String**|  | [enum: CANCEL_RESERVATION, RESERVE_NOW, START_SESSION, STOP_SESSION, UNLOCK_CONNECTOR] |
| **abstractCommand** | [**AbstractCommand**](AbstractCommand.md)|  | |

### Return type

[**CommandResponseDTO**](CommandResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

