

# SessionDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **String** |  |  |
|**partyId** | **String** |  |  |
|**id** | **String** |  |  |
|**startDateTime** | **OffsetDateTime** |  |  |
|**endDateTime** | **OffsetDateTime** |  |  [optional] |
|**kwh** | **Float** |  |  |
|**cdrToken** | [**CdrToken**](CdrToken.md) |  |  |
|**authMethod** | [**AuthMethodEnum**](#AuthMethodEnum) |  |  |
|**authorizationReference** | **String** |  |  [optional] |
|**locationId** | **String** |  |  |
|**evseUid** | **String** |  |  |
|**connectorId** | **String** |  |  |
|**meterId** | **String** |  |  [optional] |
|**currency** | **String** |  |  |
|**chargingPeriods** | [**List&lt;ChargingPeriod&gt;**](ChargingPeriod.md) |  |  [optional] |
|**totalCost** | [**Price**](Price.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**lastUpdated** | **OffsetDateTime** |  |  |



## Enum: AuthMethodEnum

| Name | Value |
|---- | -----|
| AUTH_REQUEST | &quot;AUTH_REQUEST&quot; |
| COMMAND | &quot;COMMAND&quot; |
| WHITELIST | &quot;WHITELIST&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| INVALID | &quot;INVALID&quot; |
| PENDING | &quot;PENDING&quot; |
| RESERVATION | &quot;RESERVATION&quot; |



