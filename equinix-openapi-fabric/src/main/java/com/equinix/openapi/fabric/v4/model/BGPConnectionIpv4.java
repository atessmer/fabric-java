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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.equinix.openapi.fabric.JSON;

/**
 * BGPConnectionIpv4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BGPConnectionIpv4 {
  public static final String SERIALIZED_NAME_CUSTOMER_PEER_IP = "customerPeerIp";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PEER_IP)
  private String customerPeerIp;

  public static final String SERIALIZED_NAME_EQUINIX_PEER_IP = "equinixPeerIp";
  @SerializedName(SERIALIZED_NAME_EQUINIX_PEER_IP)
  private String equinixPeerIp;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public BGPConnectionIpv4() {
  }

  public BGPConnectionIpv4 customerPeerIp(String customerPeerIp) {
    
    this.customerPeerIp = customerPeerIp;
    return this;
  }

   /**
   * Customer side peering ip
   * @return customerPeerIp
  **/
  @javax.annotation.Nonnull

  public String getCustomerPeerIp() {
    return customerPeerIp;
  }


  public void setCustomerPeerIp(String customerPeerIp) {
    this.customerPeerIp = customerPeerIp;
  }


  public BGPConnectionIpv4 equinixPeerIp(String equinixPeerIp) {
    
    this.equinixPeerIp = equinixPeerIp;
    return this;
  }

   /**
   * Equinix side peering ip
   * @return equinixPeerIp
  **/
  @javax.annotation.Nullable

  public String getEquinixPeerIp() {
    return equinixPeerIp;
  }


  public void setEquinixPeerIp(String equinixPeerIp) {
    this.equinixPeerIp = equinixPeerIp;
  }


  public BGPConnectionIpv4 enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Admin status for the BGP session
   * @return enabled
  **/
  @javax.annotation.Nonnull

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the BGPConnectionIpv4 instance itself
   */
  public BGPConnectionIpv4 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BGPConnectionIpv4 bgPConnectionIpv4 = (BGPConnectionIpv4) o;
    return Objects.equals(this.customerPeerIp, bgPConnectionIpv4.customerPeerIp) &&
        Objects.equals(this.equinixPeerIp, bgPConnectionIpv4.equinixPeerIp) &&
        Objects.equals(this.enabled, bgPConnectionIpv4.enabled)&&
        Objects.equals(this.additionalProperties, bgPConnectionIpv4.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPeerIp, equinixPeerIp, enabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BGPConnectionIpv4 {\n");
    sb.append("    customerPeerIp: ").append(toIndentedString(customerPeerIp)).append("\n");
    sb.append("    equinixPeerIp: ").append(toIndentedString(equinixPeerIp)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("customerPeerIp");
    openapiFields.add("equinixPeerIp");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customerPeerIp");
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BGPConnectionIpv4
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BGPConnectionIpv4.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BGPConnectionIpv4 is not found in the empty JSON string", BGPConnectionIpv4.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BGPConnectionIpv4.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("customerPeerIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerPeerIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerPeerIp").toString()));
      }
      if ((jsonObj.get("equinixPeerIp") != null && !jsonObj.get("equinixPeerIp").isJsonNull()) && !jsonObj.get("equinixPeerIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `equinixPeerIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("equinixPeerIp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BGPConnectionIpv4.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BGPConnectionIpv4' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BGPConnectionIpv4> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BGPConnectionIpv4.class));

       return (TypeAdapter<T>) new TypeAdapter<BGPConnectionIpv4>() {
           @Override
           public void write(JsonWriter out, BGPConnectionIpv4 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public BGPConnectionIpv4 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BGPConnectionIpv4 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BGPConnectionIpv4 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BGPConnectionIpv4
  * @throws IOException if the JSON string is invalid with respect to BGPConnectionIpv4
  */
  public static BGPConnectionIpv4 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BGPConnectionIpv4.class);
  }

 /**
  * Convert an instance of BGPConnectionIpv4 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

