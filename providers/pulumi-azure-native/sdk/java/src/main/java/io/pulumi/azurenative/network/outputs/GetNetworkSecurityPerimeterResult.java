// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkSecurityPerimeterResult {
    /**
     * A description of the network security perimeter.
     * 
     */
    private final @Nullable String description;
    /**
     * A friendly name for the network security perimeter.
     * 
     */
    private final @Nullable String displayName;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state of the scope assignment resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNetworkSecurityPerimeterResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
    }

    /**
     * A description of the network security perimeter.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * A friendly name for the network security perimeter.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The provisioning state of the scope assignment resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkSecurityPerimeterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkSecurityPerimeterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
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
        public Builder location(@Nullable String location) {
            this.location = location;
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
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNetworkSecurityPerimeterResult build() {
            return new GetNetworkSecurityPerimeterResult(description, displayName, etag, id, location, name, provisioningState, tags, type);
        }
    }
}
