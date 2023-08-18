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
import com.equinix.openapi.fabric.v4.model.EquinixStatus;
import com.equinix.openapi.fabric.v4.model.Error;
import com.equinix.openapi.fabric.v4.model.ProviderStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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
 * Connection type-specific operational data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectionOperation {
  public static final String SERIALIZED_NAME_PROVIDER_STATUS = "providerStatus";
  @SerializedName(SERIALIZED_NAME_PROVIDER_STATUS)
  private ProviderStatus providerStatus;

  public static final String SERIALIZED_NAME_EQUINIX_STATUS = "equinixStatus";
  @SerializedName(SERIALIZED_NAME_EQUINIX_STATUS)
  private EquinixStatus equinixStatus;

  /**
   * Connection operational status
   */
  @JsonAdapter(OperationalStatusEnum.Adapter.class)
  public enum OperationalStatusEnum {
    UP("UP"),
    
    DOWN("DOWN");

    private String value;

    OperationalStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperationalStatusEnum fromValue(String value) {
      for (OperationalStatusEnum b : OperationalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperationalStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperationalStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperationalStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperationalStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATIONAL_STATUS = "operationalStatus";
  @SerializedName(SERIALIZED_NAME_OPERATIONAL_STATUS)
  private OperationalStatusEnum operationalStatus;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = new ArrayList<>();

  public static final String SERIALIZED_NAME_OP_STATUS_CHANGED_AT = "opStatusChangedAt";
  @SerializedName(SERIALIZED_NAME_OP_STATUS_CHANGED_AT)
  private OffsetDateTime opStatusChangedAt;

  public ConnectionOperation() {
  }

  public ConnectionOperation providerStatus(ProviderStatus providerStatus) {
    
    this.providerStatus = providerStatus;
    return this;
  }

   /**
   * Get providerStatus
   * @return providerStatus
  **/
  @javax.annotation.Nullable

  public ProviderStatus getProviderStatus() {
    return providerStatus;
  }


  public void setProviderStatus(ProviderStatus providerStatus) {
    this.providerStatus = providerStatus;
  }


  public ConnectionOperation equinixStatus(EquinixStatus equinixStatus) {
    
    this.equinixStatus = equinixStatus;
    return this;
  }

   /**
   * Get equinixStatus
   * @return equinixStatus
  **/
  @javax.annotation.Nullable

  public EquinixStatus getEquinixStatus() {
    return equinixStatus;
  }


  public void setEquinixStatus(EquinixStatus equinixStatus) {
    this.equinixStatus = equinixStatus;
  }


  public ConnectionOperation operationalStatus(OperationalStatusEnum operationalStatus) {
    
    this.operationalStatus = operationalStatus;
    return this;
  }

   /**
   * Connection operational status
   * @return operationalStatus
  **/
  @javax.annotation.Nullable

  public OperationalStatusEnum getOperationalStatus() {
    return operationalStatus;
  }


  public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
    this.operationalStatus = operationalStatus;
  }


  public ConnectionOperation errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public ConnectionOperation addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public ConnectionOperation opStatusChangedAt(OffsetDateTime opStatusChangedAt) {
    
    this.opStatusChangedAt = opStatusChangedAt;
    return this;
  }

   /**
   * When connection transitioned into current operational status
   * @return opStatusChangedAt
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getOpStatusChangedAt() {
    return opStatusChangedAt;
  }


  public void setOpStatusChangedAt(OffsetDateTime opStatusChangedAt) {
    this.opStatusChangedAt = opStatusChangedAt;
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
   * @return the ConnectionOperation instance itself
   */
  public ConnectionOperation putAdditionalProperty(String key, Object value) {
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
    ConnectionOperation connectionOperation = (ConnectionOperation) o;
    return Objects.equals(this.providerStatus, connectionOperation.providerStatus) &&
        Objects.equals(this.equinixStatus, connectionOperation.equinixStatus) &&
        Objects.equals(this.operationalStatus, connectionOperation.operationalStatus) &&
        Objects.equals(this.errors, connectionOperation.errors) &&
        Objects.equals(this.opStatusChangedAt, connectionOperation.opStatusChangedAt)&&
        Objects.equals(this.additionalProperties, connectionOperation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerStatus, equinixStatus, operationalStatus, errors, opStatusChangedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionOperation {\n");
    sb.append("    providerStatus: ").append(toIndentedString(providerStatus)).append("\n");
    sb.append("    equinixStatus: ").append(toIndentedString(equinixStatus)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    opStatusChangedAt: ").append(toIndentedString(opStatusChangedAt)).append("\n");
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
    openapiFields.add("providerStatus");
    openapiFields.add("equinixStatus");
    openapiFields.add("operationalStatus");
    openapiFields.add("errors");
    openapiFields.add("opStatusChangedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectionOperation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectionOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectionOperation is not found in the empty JSON string", ConnectionOperation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("operationalStatus") != null && !jsonObj.get("operationalStatus").isJsonNull()) && !jsonObj.get("operationalStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operationalStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operationalStatus").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            Error.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectionOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectionOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectionOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectionOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectionOperation>() {
           @Override
           public void write(JsonWriter out, ConnectionOperation value) throws IOException {
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
           public ConnectionOperation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectionOperation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectionOperation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectionOperation
  * @throws IOException if the JSON string is invalid with respect to ConnectionOperation
  */
  public static ConnectionOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectionOperation.class);
  }

 /**
  * Convert an instance of ConnectionOperation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

