

# EVSE


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uid** | **String** |  |  [optional] |
|**evseId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**statusSchedule** | [**List&lt;StatusSchedule&gt;**](StatusSchedule.md) |  |  [optional] |
|**capabilities** | [**List&lt;CapabilitiesEnum&gt;**](#List&lt;CapabilitiesEnum&gt;) |  |  [optional] |
|**connectors** | [**List&lt;Connector&gt;**](Connector.md) |  |  [optional] |
|**floorLevel** | **String** |  |  [optional] |
|**coordinates** | [**GeoLocation**](GeoLocation.md) |  |  [optional] |
|**physicalReference** | **String** |  |  [optional] |
|**directions** | [**List&lt;DisplayText&gt;**](DisplayText.md) |  |  [optional] |
|**parkingRestrictions** | [**List&lt;ParkingRestrictionsEnum&gt;**](#List&lt;ParkingRestrictionsEnum&gt;) |  |  [optional] |
|**images** | [**List&lt;Image&gt;**](Image.md) |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| CHARGING | &quot;CHARGING&quot; |
| INOPERATIVE | &quot;INOPERATIVE&quot; |
| OUTOFORDER | &quot;OUTOFORDER&quot; |
| PLANNED | &quot;PLANNED&quot; |
| REMOVED | &quot;REMOVED&quot; |
| RESERVED | &quot;RESERVED&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



## Enum: List&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| CHARGING_PROFILE_CAPABLE | &quot;CHARGING_PROFILE_CAPABLE&quot; |
| CHARGING_PREFERENCES_CAPABLE | &quot;CHARGING_PREFERENCES_CAPABLE&quot; |
| CHIP_CARD_SUPPORT | &quot;CHIP_CARD_SUPPORT&quot; |
| CONTACTLESS_CARD_SUPPORT | &quot;CONTACTLESS_CARD_SUPPORT&quot; |
| CREDIT_CARD_PAYABLE | &quot;CREDIT_CARD_PAYABLE&quot; |
| DEBIT_CARD_PAYABLE | &quot;DEBIT_CARD_PAYABLE&quot; |
| PED_TERMINAL | &quot;PED_TERMINAL&quot; |
| REMOTE_START_STOP_CAPABLE | &quot;REMOTE_START_STOP_CAPABLE&quot; |
| RESERVABLE | &quot;RESERVABLE&quot; |
| RFID_READER | &quot;RFID_READER&quot; |
| START_SESSION_CONNECTOR_REQUIRED | &quot;START_SESSION_CONNECTOR_REQUIRED&quot; |
| TOKEN_GROUP_CAPABLE | &quot;TOKEN_GROUP_CAPABLE&quot; |
| UNLOCK_CAPABLE | &quot;UNLOCK_CAPABLE&quot; |



## Enum: List&lt;ParkingRestrictionsEnum&gt;

| Name | Value |
|---- | -----|
| EV_ONLY | &quot;EV_ONLY&quot; |
| PLUGGED | &quot;PLUGGED&quot; |
| DISABLED | &quot;DISABLED&quot; |
| CUSTOMERS | &quot;CUSTOMERS&quot; |
| MOTORCYCLES | &quot;MOTORCYCLES&quot; |



