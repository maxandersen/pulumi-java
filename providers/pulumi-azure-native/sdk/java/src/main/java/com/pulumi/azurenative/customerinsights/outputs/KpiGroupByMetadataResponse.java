// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KpiGroupByMetadataResponse {
    /**
     * The display name.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * The name of the field.
     * 
     */
    private final @Nullable String fieldName;
    /**
     * The type of the field.
     * 
     */
    private final @Nullable String fieldType;

    @CustomType.Constructor
    private KpiGroupByMetadataResponse(
        @CustomType.Parameter("displayName") @Nullable Map<String,String> displayName,
        @CustomType.Parameter("fieldName") @Nullable String fieldName,
        @CustomType.Parameter("fieldType") @Nullable String fieldType) {
        this.displayName = displayName;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    /**
     * The display name.
     * 
    */
    public Map<String,String> displayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * The name of the field.
     * 
    */
    public Optional<String> fieldName() {
        return Optional.ofNullable(this.fieldName);
    }
    /**
     * The type of the field.
     * 
    */
    public Optional<String> fieldType() {
        return Optional.ofNullable(this.fieldType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiGroupByMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> displayName;
        private @Nullable String fieldName;
        private @Nullable String fieldType;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiGroupByMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fieldName = defaults.fieldName;
    	      this.fieldType = defaults.fieldType;
        }

        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder fieldName(@Nullable String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public Builder fieldType(@Nullable String fieldType) {
            this.fieldType = fieldType;
            return this;
        }        public KpiGroupByMetadataResponse build() {
            return new KpiGroupByMetadataResponse(displayName, fieldName, fieldType);
        }
    }
}
