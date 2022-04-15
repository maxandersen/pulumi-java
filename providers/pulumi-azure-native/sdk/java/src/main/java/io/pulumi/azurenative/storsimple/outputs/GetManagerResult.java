// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.ManagerIntrinsicSettingsResponse;
import io.pulumi.azurenative.storsimple.outputs.ManagerSkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagerResult {
    /**
     * Represents the type of StorSimple Manager.
     * 
     */
    private final @Nullable ManagerIntrinsicSettingsResponse cisIntrinsicSettings;
    /**
     * The etag of the manager.
     * 
     */
    private final @Nullable String etag;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The geo location of the resource.
     * 
     */
    private final String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * Specifies the state of the resource as it is getting provisioned. Value of "Succeeded" means the Manager was successfully created.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Specifies the Sku.
     * 
     */
    private final @Nullable ManagerSkuResponse sku;
    /**
     * The tags attached to the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetManagerResult(
        @CustomType.Parameter("cisIntrinsicSettings") @Nullable ManagerIntrinsicSettingsResponse cisIntrinsicSettings,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("sku") @Nullable ManagerSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.cisIntrinsicSettings = cisIntrinsicSettings;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Represents the type of StorSimple Manager.
     * 
    */
    public Optional<ManagerIntrinsicSettingsResponse> cisIntrinsicSettings() {
        return Optional.ofNullable(this.cisIntrinsicSettings);
    }
    /**
     * The etag of the manager.
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The geo location of the resource.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * The resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specifies the state of the resource as it is getting provisioned. Value of "Succeeded" means the Manager was successfully created.
     * 
    */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Specifies the Sku.
     * 
    */
    public Optional<ManagerSkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The tags attached to the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagerIntrinsicSettingsResponse cisIntrinsicSettings;
        private @Nullable String etag;
        private String id;
        private String location;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable ManagerSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cisIntrinsicSettings = defaults.cisIntrinsicSettings;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder cisIntrinsicSettings(@Nullable ManagerIntrinsicSettingsResponse cisIntrinsicSettings) {
            this.cisIntrinsicSettings = cisIntrinsicSettings;
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
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder sku(@Nullable ManagerSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetManagerResult build() {
            return new GetManagerResult(cisIntrinsicSettings, etag, id, location, name, provisioningState, sku, tags, type);
        }
    }
}
