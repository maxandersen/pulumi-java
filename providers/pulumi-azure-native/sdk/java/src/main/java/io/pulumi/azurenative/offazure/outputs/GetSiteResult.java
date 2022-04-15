// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.outputs;

import io.pulumi.azurenative.offazure.outputs.SitePropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSiteResult {
    /**
     * eTag for concurrency control.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Azure location in which Sites is created.
     * 
     */
    private final @Nullable String location;
    /**
     * Name of the VMware site.
     * 
     */
    private final @Nullable String name;
    /**
     * Nested properties of VMWare site.
     * 
     */
    private final SitePropertiesResponse properties;
    private final @Nullable Map<String,String> tags;
    /**
     * Type of resource. Type = Microsoft.OffAzure/VMWareSites.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSiteResult(
        @CustomType.Parameter("eTag") @Nullable String eTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("properties") SitePropertiesResponse properties,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.eTag = eTag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.tags = tags;
        this.type = type;
    }

    /**
     * eTag for concurrency control.
     * 
    */
    public Optional<String> eTag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Resource Id.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Azure location in which Sites is created.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Name of the VMware site.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Nested properties of VMWare site.
     * 
    */
    public SitePropertiesResponse properties() {
        return this.properties;
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of resource. Type = Microsoft.OffAzure/VMWareSites.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private @Nullable String location;
        private @Nullable String name;
        private SitePropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = eTag;
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
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder properties(SitePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSiteResult build() {
            return new GetSiteResult(eTag, id, location, name, properties, tags, type);
        }
    }
}
