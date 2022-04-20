// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventHubDataConnectionResult {
    /**
     * The event hub messages compression type
     * 
     */
    private final @Nullable String compression;
    /**
     * The event hub consumer group.
     * 
     */
    private final String consumerGroup;
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    private final @Nullable String dataFormat;
    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
     */
    private final String eventHubResourceId;
    /**
     * System properties of the event hub
     * 
     */
    private final @Nullable List<String> eventSystemProperties;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Kind of the endpoint for the data connection
     * Expected value is &#39;EventHub&#39;.
     * 
     */
    private final String kind;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The resource ID of a managed identity (system or user assigned) to be used to authenticate with event hub.
     * 
     */
    private final @Nullable String managedIdentityResourceId;
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    private final @Nullable String mappingRuleName;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioned state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    private final @Nullable String tableName;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetEventHubDataConnectionResult(
        @CustomType.Parameter("compression") @Nullable String compression,
        @CustomType.Parameter("consumerGroup") String consumerGroup,
        @CustomType.Parameter("dataFormat") @Nullable String dataFormat,
        @CustomType.Parameter("eventHubResourceId") String eventHubResourceId,
        @CustomType.Parameter("eventSystemProperties") @Nullable List<String> eventSystemProperties,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedIdentityResourceId") @Nullable String managedIdentityResourceId,
        @CustomType.Parameter("mappingRuleName") @Nullable String mappingRuleName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tableName") @Nullable String tableName,
        @CustomType.Parameter("type") String type) {
        this.compression = compression;
        this.consumerGroup = consumerGroup;
        this.dataFormat = dataFormat;
        this.eventHubResourceId = eventHubResourceId;
        this.eventSystemProperties = eventSystemProperties;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.managedIdentityResourceId = managedIdentityResourceId;
        this.mappingRuleName = mappingRuleName;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tableName = tableName;
        this.type = type;
    }

    /**
     * The event hub messages compression type
     * 
    */
    public Optional<String> compression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * The event hub consumer group.
     * 
    */
    public String consumerGroup() {
        return this.consumerGroup;
    }
    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
    */
    public Optional<String> dataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }
    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
    */
    public String eventHubResourceId() {
        return this.eventHubResourceId;
    }
    /**
     * System properties of the event hub
     * 
    */
    public List<String> eventSystemProperties() {
        return this.eventSystemProperties == null ? List.of() : this.eventSystemProperties;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Kind of the endpoint for the data connection
     * Expected value is &#39;EventHub&#39;.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The resource ID of a managed identity (system or user assigned) to be used to authenticate with event hub.
     * 
    */
    public Optional<String> managedIdentityResourceId() {
        return Optional.ofNullable(this.managedIdentityResourceId);
    }
    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
    */
    public Optional<String> mappingRuleName() {
        return Optional.ofNullable(this.mappingRuleName);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioned state of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
    */
    public Optional<String> tableName() {
        return Optional.ofNullable(this.tableName);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubDataConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compression;
        private String consumerGroup;
        private @Nullable String dataFormat;
        private String eventHubResourceId;
        private @Nullable List<String> eventSystemProperties;
        private String id;
        private String kind;
        private @Nullable String location;
        private @Nullable String managedIdentityResourceId;
        private @Nullable String mappingRuleName;
        private String name;
        private String provisioningState;
        private @Nullable String tableName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubDataConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataFormat = defaults.dataFormat;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.eventSystemProperties = defaults.eventSystemProperties;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedIdentityResourceId = defaults.managedIdentityResourceId;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tableName = defaults.tableName;
    	      this.type = defaults.type;
        }

        public Builder compression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }
        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }
        public Builder dataFormat(@Nullable String dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Builder eventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }
        public Builder eventSystemProperties(@Nullable List<String> eventSystemProperties) {
            this.eventSystemProperties = eventSystemProperties;
            return this;
        }
        public Builder eventSystemProperties(String... eventSystemProperties) {
            return eventSystemProperties(List.of(eventSystemProperties));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managedIdentityResourceId(@Nullable String managedIdentityResourceId) {
            this.managedIdentityResourceId = managedIdentityResourceId;
            return this;
        }
        public Builder mappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetEventHubDataConnectionResult build() {
            return new GetEventHubDataConnectionResult(compression, consumerGroup, dataFormat, eventHubResourceId, eventSystemProperties, id, kind, location, managedIdentityResourceId, mappingRuleName, name, provisioningState, tableName, type);
        }
    }
}
