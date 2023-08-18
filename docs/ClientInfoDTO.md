

# ClientInfoDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partyId** | **String** |  |  |
|**countryCode** | **String** |  |  |
|**role** | [**RoleEnum**](#RoleEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**lastUpdated** | **OffsetDateTime** |  |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| CPO | &quot;CPO&quot; |
| EMSP | &quot;EMSP&quot; |
| HUB | &quot;HUB&quot; |
| NAP | &quot;NAP&quot; |
| NSP | &quot;NSP&quot; |
| OTHER | &quot;OTHER&quot; |
| SCSP | &quot;SCSP&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;CONNECTED&quot; |
| OFFLINE | &quot;OFFLINE&quot; |
| PLANNED | &quot;PLANNED&quot; |
| SUSPENDED | &quot;SUSPENDED&quot; |



