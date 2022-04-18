// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AssetHierarchy {
    /**
     * The ID of the child asset to be associated.
     * 
     */
    private final String childAssetId;
    /**
     * The LogicalID of a hierarchy in the parent asset's model.
     * 
     */
    private final String logicalId;

    @CustomType.Constructor
    private AssetHierarchy(
        @CustomType.Parameter("childAssetId") String childAssetId,
        @CustomType.Parameter("logicalId") String logicalId) {
        this.childAssetId = childAssetId;
        this.logicalId = logicalId;
    }

    /**
     * The ID of the child asset to be associated.
     * 
    */
    public String childAssetId() {
        return this.childAssetId;
    }
    /**
     * The LogicalID of a hierarchy in the parent asset's model.
     * 
    */
    public String logicalId() {
        return this.logicalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetHierarchy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String childAssetId;
        private String logicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetHierarchy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childAssetId = defaults.childAssetId;
    	      this.logicalId = defaults.logicalId;
        }

        public Builder childAssetId(String childAssetId) {
            this.childAssetId = Objects.requireNonNull(childAssetId);
            return this;
        }
        public Builder logicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }        public AssetHierarchy build() {
            return new AssetHierarchy(childAssetId, logicalId);
        }
    }
}
