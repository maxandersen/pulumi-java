// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssetModelVariableValue {
    private final @Nullable String hierarchyLogicalId;
    private final String propertyLogicalId;

    @CustomType.Constructor
    private AssetModelVariableValue(
        @CustomType.Parameter("hierarchyLogicalId") @Nullable String hierarchyLogicalId,
        @CustomType.Parameter("propertyLogicalId") String propertyLogicalId) {
        this.hierarchyLogicalId = hierarchyLogicalId;
        this.propertyLogicalId = propertyLogicalId;
    }

    public Optional<String> hierarchyLogicalId() {
        return Optional.ofNullable(this.hierarchyLogicalId);
    }
    public String propertyLogicalId() {
        return this.propertyLogicalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelVariableValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hierarchyLogicalId;
        private String propertyLogicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelVariableValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hierarchyLogicalId = defaults.hierarchyLogicalId;
    	      this.propertyLogicalId = defaults.propertyLogicalId;
        }

        public Builder hierarchyLogicalId(@Nullable String hierarchyLogicalId) {
            this.hierarchyLogicalId = hierarchyLogicalId;
            return this;
        }
        public Builder propertyLogicalId(String propertyLogicalId) {
            this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId);
            return this;
        }        public AssetModelVariableValue build() {
            return new AssetModelVariableValue(hierarchyLogicalId, propertyLogicalId);
        }
    }
}
