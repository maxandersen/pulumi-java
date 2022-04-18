// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataContainerResponse {
    /**
     * The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @CustomType.Constructor
    private DataContainerResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags) {
        this.description = description;
        this.properties = properties;
        this.tags = tags;
    }

    /**
     * The asset description text.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The asset property dictionary.
     * 
    */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DataContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public DataContainerResponse build() {
            return new DataContainerResponse(description, properties, tags);
        }
    }
}
