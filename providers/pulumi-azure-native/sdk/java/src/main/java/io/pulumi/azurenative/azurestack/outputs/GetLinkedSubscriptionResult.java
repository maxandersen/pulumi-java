// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.azurenative.azurestack.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLinkedSubscriptionResult {
    /**
     * The status of the remote management connection of the Azure Stack device.
     * 
     */
    private final String deviceConnectionStatus;
    /**
     * The identifier of the Azure Stack device for remote management.
     * 
     */
    private final String deviceId;
    /**
     * The connection state of the Azure Stack device.
     * 
     */
    private final String deviceLinkState;
    /**
     * The object identifier associated with the Azure Stack device connecting to Azure.
     * 
     */
    private final String deviceObjectId;
    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * ID of the resource.
     * 
     */
    private final String id;
    /**
     * The kind of the resource.
     * 
     */
    private final String kind;
    /**
     * The last remote management connection time for the Azure Stack device connected to the linked subscription resource.
     * 
     */
    private final String lastConnectedTime;
    /**
     * The identifier associated with the device subscription.
     * 
     */
    private final @Nullable String linkedSubscriptionId;
    /**
     * Location of the resource.
     * 
     */
    private final String location;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * The identifier associated with the device registration.
     * 
     */
    private final @Nullable String registrationResourceId;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Custom tags for the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of Resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLinkedSubscriptionResult(
        @CustomType.Parameter("deviceConnectionStatus") String deviceConnectionStatus,
        @CustomType.Parameter("deviceId") String deviceId,
        @CustomType.Parameter("deviceLinkState") String deviceLinkState,
        @CustomType.Parameter("deviceObjectId") String deviceObjectId,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("lastConnectedTime") String lastConnectedTime,
        @CustomType.Parameter("linkedSubscriptionId") @Nullable String linkedSubscriptionId,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("registrationResourceId") @Nullable String registrationResourceId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.deviceConnectionStatus = deviceConnectionStatus;
        this.deviceId = deviceId;
        this.deviceLinkState = deviceLinkState;
        this.deviceObjectId = deviceObjectId;
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.lastConnectedTime = lastConnectedTime;
        this.linkedSubscriptionId = linkedSubscriptionId;
        this.location = location;
        this.name = name;
        this.registrationResourceId = registrationResourceId;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The status of the remote management connection of the Azure Stack device.
     * 
    */
    public String deviceConnectionStatus() {
        return this.deviceConnectionStatus;
    }
    /**
     * The identifier of the Azure Stack device for remote management.
     * 
    */
    public String deviceId() {
        return this.deviceId;
    }
    /**
     * The connection state of the Azure Stack device.
     * 
    */
    public String deviceLinkState() {
        return this.deviceLinkState;
    }
    /**
     * The object identifier associated with the Azure Stack device connecting to Azure.
     * 
    */
    public String deviceObjectId() {
        return this.deviceObjectId;
    }
    /**
     * The entity tag used for optimistic concurrency when modifying the resource.
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * ID of the resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The kind of the resource.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The last remote management connection time for the Azure Stack device connected to the linked subscription resource.
     * 
    */
    public String lastConnectedTime() {
        return this.lastConnectedTime;
    }
    /**
     * The identifier associated with the device subscription.
     * 
    */
    public Optional<String> linkedSubscriptionId() {
        return Optional.ofNullable(this.linkedSubscriptionId);
    }
    /**
     * Location of the resource.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The identifier associated with the device registration.
     * 
    */
    public Optional<String> registrationResourceId() {
        return Optional.ofNullable(this.registrationResourceId);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Custom tags for the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of Resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceConnectionStatus;
        private String deviceId;
        private String deviceLinkState;
        private String deviceObjectId;
        private @Nullable String etag;
        private String id;
        private String kind;
        private String lastConnectedTime;
        private @Nullable String linkedSubscriptionId;
        private String location;
        private String name;
        private @Nullable String registrationResourceId;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceConnectionStatus = defaults.deviceConnectionStatus;
    	      this.deviceId = defaults.deviceId;
    	      this.deviceLinkState = defaults.deviceLinkState;
    	      this.deviceObjectId = defaults.deviceObjectId;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastConnectedTime = defaults.lastConnectedTime;
    	      this.linkedSubscriptionId = defaults.linkedSubscriptionId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.registrationResourceId = defaults.registrationResourceId;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder deviceConnectionStatus(String deviceConnectionStatus) {
            this.deviceConnectionStatus = Objects.requireNonNull(deviceConnectionStatus);
            return this;
        }
        public Builder deviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        public Builder deviceLinkState(String deviceLinkState) {
            this.deviceLinkState = Objects.requireNonNull(deviceLinkState);
            return this;
        }
        public Builder deviceObjectId(String deviceObjectId) {
            this.deviceObjectId = Objects.requireNonNull(deviceObjectId);
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lastConnectedTime(String lastConnectedTime) {
            this.lastConnectedTime = Objects.requireNonNull(lastConnectedTime);
            return this;
        }
        public Builder linkedSubscriptionId(@Nullable String linkedSubscriptionId) {
            this.linkedSubscriptionId = linkedSubscriptionId;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder registrationResourceId(@Nullable String registrationResourceId) {
            this.registrationResourceId = registrationResourceId;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLinkedSubscriptionResult build() {
            return new GetLinkedSubscriptionResult(deviceConnectionStatus, deviceId, deviceLinkState, deviceObjectId, etag, id, kind, lastConnectedTime, linkedSubscriptionId, location, name, registrationResourceId, systemData, tags, type);
        }
    }
}
