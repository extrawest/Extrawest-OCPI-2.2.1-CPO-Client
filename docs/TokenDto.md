

# TokenDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countryCode** | **String** |  |  |
|**partyId** | **String** |  |  |
|**uid** | **String** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**contractId** | **String** |  |  |
|**visualNumber** | **String** |  |  [optional] |
|**issuer** | **String** |  |  |
|**groupId** | **String** |  |  [optional] |
|**valid** | **Boolean** |  |  |
|**whitelist** | [**WhitelistEnum**](#WhitelistEnum) |  |  |
|**language** | **String** |  |  [optional] |
|**defaultProfileType** | [**DefaultProfileTypeEnum**](#DefaultProfileTypeEnum) |  |  [optional] |
|**energyContract** | [**EnergyContract**](EnergyContract.md) |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AD_HOC_USER | &quot;AD_HOC_USER&quot; |
| APP_USER | &quot;APP_USER&quot; |
| OTHER | &quot;OTHER&quot; |
| RFID | &quot;RFID&quot; |



## Enum: WhitelistEnum

| Name | Value |
|---- | -----|
| ALWAYS | &quot;ALWAYS&quot; |
| ALLOWED | &quot;ALLOWED&quot; |
| ALLOWED_OFFLINE | &quot;ALLOWED_OFFLINE&quot; |
| NEVER | &quot;NEVER&quot; |



## Enum: DefaultProfileTypeEnum

| Name | Value |
|---- | -----|
| CHEAP | &quot;CHEAP&quot; |
| FAST | &quot;FAST&quot; |
| GREEN | &quot;GREEN&quot; |
| REGULAR | &quot;REGULAR&quot; |



