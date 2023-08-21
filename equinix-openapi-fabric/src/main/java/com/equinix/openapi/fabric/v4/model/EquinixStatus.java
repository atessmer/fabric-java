/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.9
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric.v4.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Connection status
 */
@JsonAdapter(EquinixStatus.Adapter.class)
public enum EquinixStatus {
  
  REJECTED_ACK("REJECTED_ACK"),
  
  REJECTED("REJECTED"),
  
  PENDING_DELETE("PENDING_DELETE"),
  
  PROVISIONED("PROVISIONED"),
  
  BEING_REPROVISIONED("BEING_REPROVISIONED"),
  
  BEING_DEPROVISIONED("BEING_DEPROVISIONED"),
  
  BEING_PROVISIONED("BEING_PROVISIONED"),
  
  CREATED("CREATED"),
  
  ERRORED("ERRORED"),
  
  PENDING_DEPROVISIONING("PENDING_DEPROVISIONING"),
  
  APPROVED("APPROVED"),
  
  ORDERING("ORDERING"),
  
  PENDING_APPROVAL("PENDING_APPROVAL"),
  
  NOT_PROVISIONED("NOT_PROVISIONED"),
  
  DEPROVISIONING("DEPROVISIONING"),
  
  NOT_DEPROVISIONED("NOT_DEPROVISIONED"),
  
  PENDING_AUTO_APPROVAL("PENDING_AUTO_APPROVAL"),
  
  PROVISIONING("PROVISIONING"),
  
  PENDING_BGP_PEERING("PENDING_BGP_PEERING"),
  
  PENDING_PROVIDER_VLAN("PENDING_PROVIDER_VLAN"),
  
  DEPROVISIONED("DEPROVISIONED"),
  
  DELETED("DELETED"),
  
  PENDING_BANDWIDTH_APPROVAL("PENDING_BANDWIDTH_APPROVAL"),
  
  AUTO_APPROVAL_FAILED("AUTO_APPROVAL_FAILED"),
  
  UPDATE_PENDING("UPDATE_PENDING"),
  
  DELETED_API("DELETED_API"),
  
  MODIFIED("MODIFIED"),
  
  PENDING_PROVIDER_VLAN_ERROR("PENDING_PROVIDER_VLAN_ERROR"),
  
  DRAFT("DRAFT"),
  
  CANCELLED("CANCELLED"),
  
  PENDING_INTERFACE_CONFIGURATION("PENDING_INTERFACE_CONFIGURATION");

  private String value;

  EquinixStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EquinixStatus fromValue(String value) {
    for (EquinixStatus b : EquinixStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EquinixStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final EquinixStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EquinixStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EquinixStatus.fromValue(value);
    }
  }
}

