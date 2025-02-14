// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.DataCollectionEndpointResourceResponseSystemData;
import com.pulumi.azurenative.insights.outputs.DataCollectionEndpointResponseConfigurationAccess;
import com.pulumi.azurenative.insights.outputs.DataCollectionEndpointResponseLogsIngestion;
import com.pulumi.azurenative.insights.outputs.DataCollectionEndpointResponseNetworkAcls;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataCollectionEndpointResult {
    /**
     * @return The endpoint used by clients to access their configuration.
     * 
     */
    private final @Nullable DataCollectionEndpointResponseConfigurationAccess configurationAccess;
    /**
     * @return Description of the data collection endpoint.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Resource entity tag (ETag).
     * 
     */
    private final String etag;
    /**
     * @return Fully qualified ID of the resource.
     * 
     */
    private final String id;
    /**
     * @return The immutable ID of this data collection endpoint resource. This property is READ-ONLY.
     * 
     */
    private final @Nullable String immutableId;
    /**
     * @return The kind of the resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return The geo-location where the resource lives.
     * 
     */
    private final String location;
    /**
     * @return The endpoint used by clients to ingest logs.
     * 
     */
    private final @Nullable DataCollectionEndpointResponseLogsIngestion logsIngestion;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return Network access control rules for the endpoints.
     * 
     */
    private final @Nullable DataCollectionEndpointResponseNetworkAcls networkAcls;
    /**
     * @return The resource provisioning state. This property is READ-ONLY.
     * 
     */
    private final String provisioningState;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final DataCollectionEndpointResourceResponseSystemData systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDataCollectionEndpointResult(
        @CustomType.Parameter("configurationAccess") @Nullable DataCollectionEndpointResponseConfigurationAccess configurationAccess,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("immutableId") @Nullable String immutableId,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("logsIngestion") @Nullable DataCollectionEndpointResponseLogsIngestion logsIngestion,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkAcls") @Nullable DataCollectionEndpointResponseNetworkAcls networkAcls,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") DataCollectionEndpointResourceResponseSystemData systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.configurationAccess = configurationAccess;
        this.description = description;
        this.etag = etag;
        this.id = id;
        this.immutableId = immutableId;
        this.kind = kind;
        this.location = location;
        this.logsIngestion = logsIngestion;
        this.name = name;
        this.networkAcls = networkAcls;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The endpoint used by clients to access their configuration.
     * 
     */
    public Optional<DataCollectionEndpointResponseConfigurationAccess> configurationAccess() {
        return Optional.ofNullable(this.configurationAccess);
    }
    /**
     * @return Description of the data collection endpoint.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Resource entity tag (ETag).
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Fully qualified ID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The immutable ID of this data collection endpoint resource. This property is READ-ONLY.
     * 
     */
    public Optional<String> immutableId() {
        return Optional.ofNullable(this.immutableId);
    }
    /**
     * @return The kind of the resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return The geo-location where the resource lives.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The endpoint used by clients to ingest logs.
     * 
     */
    public Optional<DataCollectionEndpointResponseLogsIngestion> logsIngestion() {
        return Optional.ofNullable(this.logsIngestion);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Network access control rules for the endpoints.
     * 
     */
    public Optional<DataCollectionEndpointResponseNetworkAcls> networkAcls() {
        return Optional.ofNullable(this.networkAcls);
    }
    /**
     * @return The resource provisioning state. This property is READ-ONLY.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public DataCollectionEndpointResourceResponseSystemData systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataCollectionEndpointResponseConfigurationAccess configurationAccess;
        private @Nullable String description;
        private String etag;
        private String id;
        private @Nullable String immutableId;
        private @Nullable String kind;
        private String location;
        private @Nullable DataCollectionEndpointResponseLogsIngestion logsIngestion;
        private String name;
        private @Nullable DataCollectionEndpointResponseNetworkAcls networkAcls;
        private String provisioningState;
        private DataCollectionEndpointResourceResponseSystemData systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectionEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationAccess = defaults.configurationAccess;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.immutableId = defaults.immutableId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.logsIngestion = defaults.logsIngestion;
    	      this.name = defaults.name;
    	      this.networkAcls = defaults.networkAcls;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder configurationAccess(@Nullable DataCollectionEndpointResponseConfigurationAccess configurationAccess) {
            this.configurationAccess = configurationAccess;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder immutableId(@Nullable String immutableId) {
            this.immutableId = immutableId;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder logsIngestion(@Nullable DataCollectionEndpointResponseLogsIngestion logsIngestion) {
            this.logsIngestion = logsIngestion;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkAcls(@Nullable DataCollectionEndpointResponseNetworkAcls networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(DataCollectionEndpointResourceResponseSystemData systemData) {
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
        }        public GetDataCollectionEndpointResult build() {
            return new GetDataCollectionEndpointResult(configurationAccess, description, etag, id, immutableId, kind, location, logsIngestion, name, networkAcls, provisioningState, systemData, tags, type);
        }
    }
}
