

# CdrDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**currency** | **String** |  |  [optional] |
|**tariffs** | [**List&lt;Tariff&gt;**](Tariff.md) |  |  [optional] |
|**remark** | **String** |  |  [optional] |
|**credit** | **Boolean** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |
|**partyId** | **String** |  |  [optional] |
|**startDateTime** | **OffsetDateTime** |  |  |
|**endDateTime** | **OffsetDateTime** |  |  |
|**sessionId** | **String** |  |  [optional] |
|**cdrToken** | [**CdrToken**](CdrToken.md) |  |  |
|**authMethod** | [**AuthMethodEnum**](#AuthMethodEnum) |  |  |
|**authorizationReference** | **String** |  |  [optional] |
|**cdrLocation** | [**CdrLocation**](CdrLocation.md) |  |  |
|**meterId** | **String** |  |  [optional] |
|**chargingPeriods** | [**List&lt;ChargingPeriod&gt;**](ChargingPeriod.md) |  |  |
|**signedData** | [**SignedData**](SignedData.md) |  |  [optional] |
|**totalCost** | [**Price**](Price.md) |  |  |
|**totalFixedCost** | [**Price**](Price.md) |  |  [optional] |
|**totalEnergy** | **Float** |  |  |
|**totalEnergyCost** | [**Price**](Price.md) |  |  [optional] |
|**totalTime** | **Float** |  |  |
|**totalTimeCost** | [**Price**](Price.md) |  |  [optional] |
|**totalParkingTime** | **Float** |  |  [optional] |
|**totalParkingCost** | [**Price**](Price.md) |  |  [optional] |
|**totalReservationCost** | [**Price**](Price.md) |  |  [optional] |
|**invoiceReferenceId** | **String** |  |  [optional] |
|**creditReferenceId** | **String** |  |  [optional] |
|**homeChargingCompensation** | **Boolean** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  |



## Enum: AuthMethodEnum

| Name | Value |
|---- | -----|
| AUTH_REQUEST | &quot;AUTH_REQUEST&quot; |
| COMMAND | &quot;COMMAND&quot; |
| WHITELIST | &quot;WHITELIST&quot; |



