// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.outputs;

import com.pulumi.azurenative.cognitiveservices.outputs.CognitiveServicesAccountPropertiesResponse;
import com.pulumi.azurenative.cognitiveservices.outputs.IdentityResponse;
import com.pulumi.azurenative.cognitiveservices.outputs.SkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountResult {
    /**
     * @return Entity Tag
     * 
     */
    private final String etag;
    /**
     * @return The id of the created account
     * 
     */
    private final String id;
    /**
     * @return The identity of Cognitive Services account.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * @return The Kind of the resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return The location of the resource
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the created account
     * 
     */
    private final String name;
    /**
     * @return Properties of Cognitive Services account.
     * 
     */
    private final CognitiveServicesAccountPropertiesResponse properties;
    /**
     * @return The SKU of Cognitive Services account.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * @return Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") CognitiveServicesAccountPropertiesResponse properties,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Entity Tag
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The id of the created account
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity of Cognitive Services account.
     * 
     */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The Kind of the resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return The location of the resource
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the created account
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Properties of Cognitive Services account.
     * 
     */
    public CognitiveServicesAccountPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return The SKU of Cognitive Services account.
     * 
     */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Gets or sets a list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key no greater than 128 characters and value no greater than 256 characters.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private CognitiveServicesAccountPropertiesResponse properties;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
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
        public Builder properties(CognitiveServicesAccountPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
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
        }        public GetAccountResult build() {
            return new GetAccountResult(etag, id, identity, kind, location, name, properties, sku, tags, type);
        }
    }
}
