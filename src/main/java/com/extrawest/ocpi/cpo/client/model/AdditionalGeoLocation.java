/*
 * OCPI 2.2.1
 * This API exposes endpoints to manage OCPI entities.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: ocpi@extrawest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.extrawest.ocpi.cpo.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * AdditionalGeoLocation
 */
@JsonPropertyOrder({
        AdditionalGeoLocation.JSON_PROPERTY_LATITUDE,
        AdditionalGeoLocation.JSON_PROPERTY_LONGITUDE,
        AdditionalGeoLocation.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class AdditionalGeoLocation {
    public static final String JSON_PROPERTY_LATITUDE = "latitude";
    public static final String JSON_PROPERTY_LONGITUDE = "longitude";
    public static final String JSON_PROPERTY_NAME = "name";
    private String latitude;
    private String longitude;
    private DisplayText name;

    public AdditionalGeoLocation() {
    }

    public AdditionalGeoLocation latitude(String latitude) {

        this.latitude = latitude;
        return this;
    }

    /**
     * Get latitude
     *
     * @return latitude
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LATITUDE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getLatitude() {
        return latitude;
    }


    @JsonProperty(JSON_PROPERTY_LATITUDE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }


    public AdditionalGeoLocation longitude(String longitude) {

        this.longitude = longitude;
        return this;
    }

    /**
     * Get longitude
     *
     * @return longitude
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LONGITUDE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getLongitude() {
        return longitude;
    }


    @JsonProperty(JSON_PROPERTY_LONGITUDE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    public AdditionalGeoLocation name(DisplayText name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public DisplayText getName() {
        return name;
    }


    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(DisplayText name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdditionalGeoLocation additionalGeoLocation = (AdditionalGeoLocation) o;
        return Objects.equals(this.latitude, additionalGeoLocation.latitude) &&
                Objects.equals(this.longitude, additionalGeoLocation.longitude) &&
                Objects.equals(this.name, additionalGeoLocation.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalGeoLocation {\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

