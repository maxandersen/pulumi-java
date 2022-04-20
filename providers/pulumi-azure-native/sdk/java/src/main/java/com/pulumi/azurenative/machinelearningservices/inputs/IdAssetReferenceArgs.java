// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Reference to an asset via its ARM resource ID.
 * 
 */
public final class IdAssetReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdAssetReferenceArgs Empty = new IdAssetReferenceArgs();

    /**
     * ARM resource ID of the asset.
     * 
     */
    @Import(name="assetId", required=true)
      private final Output<String> assetId;

    public Output<String> assetId() {
        return this.assetId;
    }

    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is &#39;Id&#39;.
     * 
     */
    @Import(name="referenceType", required=true)
      private final Output<String> referenceType;

    public Output<String> referenceType() {
        return this.referenceType;
    }

    public IdAssetReferenceArgs(
        Output<String> assetId,
        Output<String> referenceType) {
        this.assetId = Objects.requireNonNull(assetId, "expected parameter 'assetId' to be non-null");
        this.referenceType = Codegen.stringProp("referenceType").output().arg(referenceType).require();
    }

    private IdAssetReferenceArgs() {
        this.assetId = Codegen.empty();
        this.referenceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdAssetReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> assetId;
        private Output<String> referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(IdAssetReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder assetId(Output<String> assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }
        public Builder assetId(String assetId) {
            this.assetId = Output.of(Objects.requireNonNull(assetId));
            return this;
        }
        public Builder referenceType(Output<String> referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }
        public Builder referenceType(String referenceType) {
            this.referenceType = Output.of(Objects.requireNonNull(referenceType));
            return this;
        }        public IdAssetReferenceArgs build() {
            return new IdAssetReferenceArgs(assetId, referenceType);
        }
    }
}
