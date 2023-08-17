# CpoCommandsControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postCommand**](CpoCommandsControllerApi.md#postCommand) | **POST** /cpo/api/2.2.1/commands/{command} |  |



## postCommand

> CommandResponseDTO postCommand(command, abstractCommand)



### Example

```java
// Import classes:
import com.extrawest.ocpi.client.invoker.ApiClient;
import com.extrawest.ocpi.client.invoker.ApiException;
import com.extrawest.ocpi.client.invoker.Configuration;
import com.extrawest.ocpi.client.invoker.models.*;
import com.extrawest.ocpi.client.api.CpoCommandsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        CpoCommandsControllerApi apiInstance = new CpoCommandsControllerApi(defaultClient);
        String command = "CANCEL_RESERVATION"; // String | 
        AbstractCommand abstractCommand = new AbstractCommand(); // AbstractCommand | 
        try {
            CommandResponseDTO result = apiInstance.postCommand(command, abstractCommand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CpoCommandsControllerApi#postCommand");
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

