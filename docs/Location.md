

# Location


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**publish** | **Boolean** |  |  |
|**name** | **String** |  |  [optional] |
|**address** | **String** |  |  |
|**city** | **String** |  |  |
|**state** | **String** |  |  [optional] |
|**country** | **String** |  |  |
|**coordinates** | [**GeoLocation**](GeoLocation.md) |  |  |
|**evses** | [**List&lt;EVSE&gt;**](EVSE.md) |  |  [optional] |
|**directions** | [**List&lt;DisplayText&gt;**](DisplayText.md) |  |  [optional] |
|**operator** | [**BusinessDetails**](BusinessDetails.md) |  |  [optional] |
|**owner** | [**BusinessDetails**](BusinessDetails.md) |  |  [optional] |
|**facilities** | [**List&lt;FacilitiesEnum&gt;**](#List&lt;FacilitiesEnum&gt;) |  |  [optional] |
|**images** | [**List&lt;Image&gt;**](Image.md) |  |  [optional] |
|**countryCode** | **String** |  |  |
|**partyId** | **String** |  |  |
|**lastUpdated** | **OffsetDateTime** |  |  |
|**publishAllowedTo** | [**List&lt;PublishTokenType&gt;**](PublishTokenType.md) |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**relatedLocations** | [**List&lt;AdditionalGeoLocation&gt;**](AdditionalGeoLocation.md) |  |  [optional] |
|**parkingType** | [**ParkingTypeEnum**](#ParkingTypeEnum) |  |  [optional] |
|**suboperator** | [**BusinessDetails**](BusinessDetails.md) |  |  [optional] |
|**timeZone** | **String** |  |  |
|**openingTimes** | [**Hours**](Hours.md) |  |  [optional] |
|**chargingWhenClosed** | **Boolean** |  |  [optional] |
|**energyMix** | [**EnergyMix**](EnergyMix.md) |  |  [optional] |



## Enum: List&lt;FacilitiesEnum&gt;

| Name | Value |
|---- | -----|
| HOTEL | &quot;HOTEL&quot; |
| RESTAURANT | &quot;RESTAURANT&quot; |
| CAFE | &quot;CAFE&quot; |
| MALL | &quot;MALL&quot; |
| SUPERMARKET | &quot;SUPERMARKET&quot; |
| SPORT | &quot;SPORT&quot; |
| RECREATION_AREA | &quot;RECREATION_AREA&quot; |
| NATURE | &quot;NATURE&quot; |
| MUSEUM | &quot;MUSEUM&quot; |
| BIKE_SHARING | &quot;BIKE_SHARING&quot; |
| BUS_STOP | &quot;BUS_STOP&quot; |
| TAXI_STAND | &quot;TAXI_STAND&quot; |
| TRAM_STOP | &quot;TRAM_STOP&quot; |
| METRO_STATION | &quot;METRO_STATION&quot; |
| TRAIN_STATION | &quot;TRAIN_STATION&quot; |
| AIRPORT | &quot;AIRPORT&quot; |
| PARKING_LOT | &quot;PARKING_LOT&quot; |
| CARPOOL_PARKING | &quot;CARPOOL_PARKING&quot; |
| FUEL_STATION | &quot;FUEL_STATION&quot; |
| WIFI | &quot;WIFI&quot; |



## Enum: ParkingTypeEnum

| Name | Value |
|---- | -----|
| ALONG_MOTORWAY | &quot;ALONG_MOTORWAY&quot; |
| PARKING_GARAGE | &quot;PARKING_GARAGE&quot; |
| PARKING_LOT | &quot;PARKING_LOT&quot; |
| ON_DRIVEWAY | &quot;ON_DRIVEWAY&quot; |
| ON_STREET | &quot;ON_STREET&quot; |
| UNDERGROUND_GARAGE | &quot;UNDERGROUND_GARAGE&quot; |



