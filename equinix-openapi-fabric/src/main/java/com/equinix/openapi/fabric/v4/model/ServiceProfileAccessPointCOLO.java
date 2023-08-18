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
import com.equinix.openapi.fabric.v4.model.SimplifiedLocation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.UUID;

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
 * Colo Access Point
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ServiceProfileAccessPointCOLO {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    XF_PORT("XF_PORT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SimplifiedLocation location;

  public static final String SERIALIZED_NAME_SELLER_REGION = "sellerRegion";
  @SerializedName(SERIALIZED_NAME_SELLER_REGION)
  private String sellerRegion;

  public static final String SERIALIZED_NAME_SELLER_REGION_DESCRIPTION = "sellerRegionDescription";
  @SerializedName(SERIALIZED_NAME_SELLER_REGION_DESCRIPTION)
  private String sellerRegionDescription;

  public static final String SERIALIZED_NAME_CROSS_CONNECT_ID = "crossConnectId";
  @SerializedName(SERIALIZED_NAME_CROSS_CONNECT_ID)
  private String crossConnectId;

  public ServiceProfileAccessPointCOLO() {
  }

  public ServiceProfileAccessPointCOLO type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ServiceProfileAccessPointCOLO uuid(UUID uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nonnull

  public UUID getUuid() {
    return uuid;
  }


  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  public ServiceProfileAccessPointCOLO location(SimplifiedLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable

  public SimplifiedLocation getLocation() {
    return location;
  }


  public void setLocation(SimplifiedLocation location) {
    this.location = location;
  }


  public ServiceProfileAccessPointCOLO sellerRegion(String sellerRegion) {
    
    this.sellerRegion = sellerRegion;
    return this;
  }

   /**
   * Get sellerRegion
   * @return sellerRegion
  **/
  @javax.annotation.Nullable

  public String getSellerRegion() {
    return sellerRegion;
  }


  public void setSellerRegion(String sellerRegion) {
    this.sellerRegion = sellerRegion;
  }


  public ServiceProfileAccessPointCOLO sellerRegionDescription(String sellerRegionDescription) {
    
    this.sellerRegionDescription = sellerRegionDescription;
    return this;
  }

   /**
   * Get sellerRegionDescription
   * @return sellerRegionDescription
  **/
  @javax.annotation.Nullable

  public String getSellerRegionDescription() {
    return sellerRegionDescription;
  }


  public void setSellerRegionDescription(String sellerRegionDescription) {
    this.sellerRegionDescription = sellerRegionDescription;
  }


  public ServiceProfileAccessPointCOLO crossConnectId(String crossConnectId) {
    
    this.crossConnectId = crossConnectId;
    return this;
  }

   /**
   * Get crossConnectId
   * @return crossConnectId
  **/
  @javax.annotation.Nullable

  public String getCrossConnectId() {
    return crossConnectId;
  }


  public void setCrossConnectId(String crossConnectId) {
    this.crossConnectId = crossConnectId;
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
   * @return the ServiceProfileAccessPointCOLO instance itself
   */
  public ServiceProfileAccessPointCOLO putAdditionalProperty(String key, Object value) {
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
    ServiceProfileAccessPointCOLO serviceProfileAccessPointCOLO = (ServiceProfileAccessPointCOLO) o;
    return Objects.equals(this.type, serviceProfileAccessPointCOLO.type) &&
        Objects.equals(this.uuid, serviceProfileAccessPointCOLO.uuid) &&
        Objects.equals(this.location, serviceProfileAccessPointCOLO.location) &&
        Objects.equals(this.sellerRegion, serviceProfileAccessPointCOLO.sellerRegion) &&
        Objects.equals(this.sellerRegionDescription, serviceProfileAccessPointCOLO.sellerRegionDescription) &&
        Objects.equals(this.crossConnectId, serviceProfileAccessPointCOLO.crossConnectId)&&
        Objects.equals(this.additionalProperties, serviceProfileAccessPointCOLO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uuid, location, sellerRegion, sellerRegionDescription, crossConnectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileAccessPointCOLO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    sellerRegion: ").append(toIndentedString(sellerRegion)).append("\n");
    sb.append("    sellerRegionDescription: ").append(toIndentedString(sellerRegionDescription)).append("\n");
    sb.append("    crossConnectId: ").append(toIndentedString(crossConnectId)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("uuid");
    openapiFields.add("location");
    openapiFields.add("sellerRegion");
    openapiFields.add("sellerRegionDescription");
    openapiFields.add("crossConnectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("uuid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceProfileAccessPointCOLO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceProfileAccessPointCOLO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceProfileAccessPointCOLO is not found in the empty JSON string", ServiceProfileAccessPointCOLO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceProfileAccessPointCOLO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        SimplifiedLocation.validateJsonObject(jsonObj.getAsJsonObject("location"));
      }
      if ((jsonObj.get("sellerRegion") != null && !jsonObj.get("sellerRegion").isJsonNull()) && !jsonObj.get("sellerRegion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerRegion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerRegion").toString()));
      }
      if ((jsonObj.get("sellerRegionDescription") != null && !jsonObj.get("sellerRegionDescription").isJsonNull()) && !jsonObj.get("sellerRegionDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sellerRegionDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sellerRegionDescription").toString()));
      }
      if ((jsonObj.get("crossConnectId") != null && !jsonObj.get("crossConnectId").isJsonNull()) && !jsonObj.get("crossConnectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crossConnectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crossConnectId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceProfileAccessPointCOLO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceProfileAccessPointCOLO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceProfileAccessPointCOLO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceProfileAccessPointCOLO.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceProfileAccessPointCOLO>() {
           @Override
           public void write(JsonWriter out, ServiceProfileAccessPointCOLO value) throws IOException {
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
           public ServiceProfileAccessPointCOLO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceProfileAccessPointCOLO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceProfileAccessPointCOLO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceProfileAccessPointCOLO
  * @throws IOException if the JSON string is invalid with respect to ServiceProfileAccessPointCOLO
  */
  public static ServiceProfileAccessPointCOLO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceProfileAccessPointCOLO.class);
  }

 /**
  * Convert an instance of ServiceProfileAccessPointCOLO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

