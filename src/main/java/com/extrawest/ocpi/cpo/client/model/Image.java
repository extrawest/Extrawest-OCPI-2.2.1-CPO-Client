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
 * Image
 */
@JsonPropertyOrder({
        Image.JSON_PROPERTY_URL,
        Image.JSON_PROPERTY_THUMBNAIL,
        Image.JSON_PROPERTY_CATEGORY,
        Image.JSON_PROPERTY_TYPE,
        Image.JSON_PROPERTY_WIDTH,
        Image.JSON_PROPERTY_HEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class Image {
    public static final String JSON_PROPERTY_URL = "url";
    public static final String JSON_PROPERTY_THUMBNAIL = "thumbnail";
    public static final String JSON_PROPERTY_CATEGORY = "category";
    public static final String JSON_PROPERTY_TYPE = "type";
    public static final String JSON_PROPERTY_WIDTH = "width";
    public static final String JSON_PROPERTY_HEIGHT = "height";
    private String url;
    private String thumbnail;
    private CategoryEnum category;
    private String type;
    private String width;
    private String height;
    public Image() {
    }

    public Image url(String url) {

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

    public Image thumbnail(String thumbnail) {

        this.thumbnail = thumbnail;
        return this;
    }

    /**
     * Get thumbnail
     *
     * @return thumbnail
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_THUMBNAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty(JSON_PROPERTY_THUMBNAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Image category(CategoryEnum category) {

        this.category = category;
        return this;
    }

    /**
     * Get category
     *
     * @return category
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public CategoryEnum getCategory() {
        return category;
    }

    @JsonProperty(JSON_PROPERTY_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public Image type(String type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(String type) {
        this.type = type;
    }

    public Image width(String width) {

        this.width = width;
        return this;
    }

    /**
     * Get width
     *
     * @return width
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_WIDTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getWidth() {
        return width;
    }

    @JsonProperty(JSON_PROPERTY_WIDTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWidth(String width) {
        this.width = width;
    }

    public Image height(String height) {

        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_HEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getHeight() {
        return height;
    }

    @JsonProperty(JSON_PROPERTY_HEIGHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return Objects.equals(this.url, image.url) &&
                Objects.equals(this.thumbnail, image.thumbnail) &&
                Objects.equals(this.category, image.category) &&
                Objects.equals(this.type, image.type) &&
                Objects.equals(this.width, image.width) &&
                Objects.equals(this.height, image.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, thumbnail, category, type, width, height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
     * Gets or Sets category
     */
    public enum CategoryEnum {
        CHARGER("CHARGER"),

        ENTRANCE("ENTRANCE"),

        LOCATION("LOCATION"),

        NETWORK("NETWORK"),

        OPERATOR("OPERATOR"),

        OTHER("OTHER"),

        OWNER("OWNER");

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            for (CategoryEnum b : CategoryEnum.values()) {
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

