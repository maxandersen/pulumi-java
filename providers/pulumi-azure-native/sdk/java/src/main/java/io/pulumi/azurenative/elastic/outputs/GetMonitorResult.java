// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.azurenative.elastic.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.elastic.outputs.MonitorPropertiesResponse;
import io.pulumi.azurenative.elastic.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.elastic.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMonitorResult {
    /**
     * ARM id of the monitor resource.
     * 
     */
    private final String id;
    /**
     * Identity properties of the monitor resource.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * The location of the monitor resource
     * 
     */
    private final String location;
    /**
     * Name of the monitor resource.
     * 
     */
    private final String name;
    /**
     * Properties of the monitor resource.
     * 
     */
    private final MonitorPropertiesResponse properties;
    /**
     * SKU of the monitor resource.
     * 
     */
    private final @Nullable ResourceSkuResponse sku;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tags of the monitor resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the monitor resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetMonitorResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityPropertiesResponse identity,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") MonitorPropertiesResponse properties,
        @CustomType.Parameter("sku") @Nullable ResourceSkuResponse sku,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * ARM id of the monitor resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Identity properties of the monitor resource.
     * 
    */
    public Optional<IdentityPropertiesResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The location of the monitor resource
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Name of the monitor resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Properties of the monitor resource.
     * 
    */
    public MonitorPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * SKU of the monitor resource.
     * 
    */
    public Optional<ResourceSkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The system metadata relating to this resource
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The tags of the monitor resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the monitor resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private String location;
        private String name;
        private MonitorPropertiesResponse properties;
        private @Nullable ResourceSkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMonitorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
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
        public Builder properties(MonitorPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder sku(@Nullable ResourceSkuResponse sku) {
            this.sku = sku;
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
        }        public GetMonitorResult build() {
            return new GetMonitorResult(id, identity, location, name, properties, sku, systemData, tags, type);
        }
    }
}
