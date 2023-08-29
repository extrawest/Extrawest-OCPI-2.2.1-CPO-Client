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
 * EnergyContract
 */
@JsonPropertyOrder({
        EnergyContract.JSON_PROPERTY_SUPPLIER_NAME,
        EnergyContract.JSON_PROPERTY_CONTRACT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-29T18:01:53.215553+03:00[Europe/Kiev]")
public class EnergyContract {
  public static final String JSON_PROPERTY_SUPPLIER_NAME = "supplier_name";
  private String supplierName;

  public static final String JSON_PROPERTY_CONTRACT_ID = "contract_id";
  private String contractId;

  public EnergyContract() {
  }

  public EnergyContract supplierName(String supplierName) {
    
    this.supplierName = supplierName;
    return this;
  }

   /**
   * Get supplierName
   * @return supplierName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPLIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSupplierName() {
    return supplierName;
  }


  @JsonProperty(JSON_PROPERTY_SUPPLIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }


  public EnergyContract contractId(String contractId) {
    
    this.contractId = contractId;
    return this;
  }

   /**
   * Get contractId
   * @return contractId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContractId() {
    return contractId;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyContract energyContract = (EnergyContract) o;
    return Objects.equals(this.supplierName, energyContract.supplierName) &&
        Objects.equals(this.contractId, energyContract.contractId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierName, contractId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyContract {\n");
    sb.append("    supplierName: ").append(toIndentedString(supplierName)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
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
