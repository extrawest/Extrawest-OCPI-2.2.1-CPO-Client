

# TariffDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**currency** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**elements** | [**List&lt;TariffElement&gt;**](TariffElement.md) |  |  |
|**countryCode** | **String** |  |  |
|**partyId** | **String** |  |  |
|**tariffAltText** | [**List&lt;DisplayText&gt;**](DisplayText.md) |  |  [optional] |
|**tariffAltUrl** | **String** |  |  [optional] |
|**minPrice** | [**Price**](Price.md) |  |  [optional] |
|**maxPrice** | [**Price**](Price.md) |  |  [optional] |
|**startDateTime** | **OffsetDateTime** |  |  [optional] |
|**endDateTime** | **OffsetDateTime** |  |  [optional] |
|**energyMix** | [**EnergyMix**](EnergyMix.md) |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AD_HOC_PAYMENT | &quot;AD_HOC_PAYMENT&quot; |
| PROFILE_CHEAP | &quot;PROFILE_CHEAP&quot; |
| PROFILE_FAST | &quot;PROFILE_FAST&quot; |
| REGULAR | &quot;REGULAR&quot; |
| PROFILE_GREEN | &quot;PROFILE_GREEN&quot; |



