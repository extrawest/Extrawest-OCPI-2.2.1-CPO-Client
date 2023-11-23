

# TariffRestrictions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reservation** | [**ReservationEnum**](#ReservationEnum) |  |  [optional] |
|**startTime** | **String** |  |  [optional] |
|**endTime** | **String** |  |  [optional] |
|**startDate** | **String** |  |  [optional] |
|**endDate** | **String** |  |  [optional] |
|**minKwh** | **Float** |  |  [optional] |
|**maxKwh** | **Float** |  |  [optional] |
|**minCurrent** | **Float** |  |  [optional] |
|**maxCurrent** | **Float** |  |  [optional] |
|**minPower** | **Float** |  |  [optional] |
|**maxPower** | **Float** |  |  [optional] |
|**minDuration** | **Integer** |  |  [optional] |
|**maxDuration** | **Integer** |  |  [optional] |
|**dayOfWeek** | [**List&lt;DayOfWeekEnum&gt;**](#List&lt;DayOfWeekEnum&gt;) |  |  [optional] |



## Enum: ReservationEnum

| Name | Value |
|---- | -----|
| RESERVATION | &quot;RESERVATION&quot; |
| RESERVATION_EXPIRES | &quot;RESERVATION_EXPIRES&quot; |



## Enum: List&lt;DayOfWeekEnum&gt;

| Name | Value |
|---- | -----|
| MONDAY | &quot;MONDAY&quot; |
| TUESDAY | &quot;TUESDAY&quot; |
| WEDNESDAY | &quot;WEDNESDAY&quot; |
| THURSDAY | &quot;THURSDAY&quot; |
| FRIDAY | &quot;FRIDAY&quot; |
| SATURDAY | &quot;SATURDAY&quot; |
| SUNDAY | &quot;SUNDAY&quot; |



