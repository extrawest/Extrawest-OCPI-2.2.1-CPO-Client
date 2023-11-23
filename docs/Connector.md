

# Connector


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**standard** | [**StandardEnum**](#StandardEnum) |  |  |
|**format** | [**FormatEnum**](#FormatEnum) |  |  |
|**powerType** | [**PowerTypeEnum**](#PowerTypeEnum) |  |  |
|**maxVoltage** | **Integer** |  |  |
|**maxAmperage** | **Integer** |  |  |
|**maxElectricPower** | **Integer** |  |  [optional] |
|**tariffIds** | **List&lt;String&gt;** |  |  [optional] |
|**termsAndConditions** | **String** |  |  [optional] |
|**lastUpdated** | **OffsetDateTime** |  |  |



## Enum: StandardEnum

| Name | Value |
|---- | -----|
| CHADEMO | &quot;CHADEMO&quot; |
| CHAOJI | &quot;CHAOJI&quot; |
| DOMESTIC_A | &quot;DOMESTIC_A&quot; |
| DOMESTIC_B | &quot;DOMESTIC_B&quot; |
| DOMESTIC_C | &quot;DOMESTIC_C&quot; |
| DOMESTIC_D | &quot;DOMESTIC_D&quot; |
| DOMESTIC_E | &quot;DOMESTIC_E&quot; |
| DOMESTIC_F | &quot;DOMESTIC_F&quot; |
| DOMESTIC_G | &quot;DOMESTIC_G&quot; |
| DOMESTIC_H | &quot;DOMESTIC_H&quot; |
| DOMESTIC_I | &quot;DOMESTIC_I&quot; |
| DOMESTIC_J | &quot;DOMESTIC_J&quot; |
| DOMESTIC_K | &quot;DOMESTIC_K&quot; |
| DOMESTIC_L | &quot;DOMESTIC_L&quot; |
| DOMESTIC_M | &quot;DOMESTIC_M&quot; |
| DOMESTIC_N | &quot;DOMESTIC_N&quot; |
| DOMESTIC_O | &quot;DOMESTIC_O&quot; |
| GBT_AC | &quot;GBT_AC&quot; |
| GBT_DC | &quot;GBT_DC&quot; |
| IEC_60309_2_SINGLE_16 | &quot;IEC_60309_2_single_16&quot; |
| IEC_60309_2_THREE_16 | &quot;IEC_60309_2_three_16&quot; |
| IEC_60309_2_THREE_32 | &quot;IEC_60309_2_three_32&quot; |
| IEC_60309_2_THREE_64 | &quot;IEC_60309_2_three_64&quot; |
| IEC_62196_T1 | &quot;IEC_62196_T1&quot; |
| IEC_62196_T1_COMBO | &quot;IEC_62196_T1_COMBO&quot; |
| IEC_62196_T2 | &quot;IEC_62196_T2&quot; |
| IEC_62196_T2_COMBO | &quot;IEC_62196_T2_COMBO&quot; |
| IEC_62196_T3A | &quot;IEC_62196_T3A&quot; |
| IEC_62196_T3C | &quot;IEC_62196_T3C&quot; |
| NEMA_5_20 | &quot;NEMA_5_20&quot; |
| NEMA_6_30 | &quot;NEMA_6_30&quot; |
| NEMA_6_50 | &quot;NEMA_6_50&quot; |
| NEMA_10_30 | &quot;NEMA_10_30&quot; |
| NEMA_10_50 | &quot;NEMA_10_50&quot; |
| NEMA_14_30 | &quot;NEMA_14_30&quot; |
| NEMA_14_50 | &quot;NEMA_14_50&quot; |
| PANTOGRAPH_BOTTOM_UP | &quot;PANTOGRAPH_BOTTOM_UP&quot; |
| PANTOGRAPH_TOP_DOWN | &quot;PANTOGRAPH_TOP_DOWN&quot; |
| TESLA_R | &quot;TESLA_R&quot; |
| TESLA_S | &quot;TESLA_S&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| SOCKET | &quot;SOCKET&quot; |
| CABLE | &quot;CABLE&quot; |



## Enum: PowerTypeEnum

| Name | Value |
|---- | -----|
| AC_1_PHASE | &quot;AC_1_PHASE&quot; |
| AC_2_PHASE | &quot;AC_2_PHASE&quot; |
| AC_2_PHASE_SPLIT | &quot;AC_2_PHASE_SPLIT&quot; |
| AC_3_PHASE | &quot;AC_3_PHASE&quot; |
| DC | &quot;DC&quot; |



