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

import com.fasterxml.jackson.annotation.*;

import java.util.Objects;

/**
 * Endpoint
 */
@JsonPropertyOrder({
        Endpoint.JSON_PROPERTY_IDENTIFIER,
        Endpoint.JSON_PROPERTY_ROLE,
        Endpoint.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class Endpoint {
    public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
    public static final String JSON_PROPERTY_ROLE = "role";
    public static final String JSON_PROPERTY_URL = "url";
    private IdentifierEnum identifier;
    private RoleEnum role;
    private String url;

    public Endpoint() {
    }

    public Endpoint identifier(IdentifierEnum identifier) {

        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     *
     * @return identifier
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public IdentifierEnum getIdentifier() {
        return identifier;
    }

    @JsonProperty(JSON_PROPERTY_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIdentifier(IdentifierEnum identifier) {
        this.identifier = identifier;
    }

    public Endpoint role(RoleEnum role) {

        this.role = role;
        return this;
    }

    /**
     * Get role
     *
     * @return role
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public RoleEnum getRole() {
        return role;
    }

    @JsonProperty(JSON_PROPERTY_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public Endpoint url(String url) {

        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoint endpoint = (Endpoint) o;
        return Objects.equals(this.identifier, endpoint.identifier) &&
                Objects.equals(this.role, endpoint.role) &&
                Objects.equals(this.url, endpoint.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, role, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    /**
     * Gets or Sets identifier
     */
    public enum IdentifierEnum {
        CDRS("cdrs"),

        CHARGINGPROFILES("chargingprofiles"),

        COMMANDS("commands"),

        CREDENTIALS("credentials"),

        HUBCLIENTINFO("hubclientinfo"),

        LOCATIONS("locations"),

        SESSIONS("sessions"),

        TARIFFS("tariffs"),

        TOKENS("tokens");

        private String value;

        IdentifierEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static IdentifierEnum fromValue(String value) {
            for (IdentifierEnum b : IdentifierEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    /**
     * Gets or Sets role
     */
    public enum RoleEnum {
        SENDER("SENDER"),

        RECEIVER("RECEIVER");

        private String value;

        RoleEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static RoleEnum fromValue(String value) {
            for (RoleEnum b : RoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

