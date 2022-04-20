// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Reference to an asset via its ARM resource ID.
 * 
 */
public final class IdAssetReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final IdAssetReferenceResponse Empty = new IdAssetReferenceResponse();

    /**
     * ARM resource ID of the asset.
     * 
     */
    @Import(name="assetId", required=true)
      private final String assetId;

    public String assetId() {
        return this.assetId;
    }

    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is &#39;Id&#39;.
     * 
     */
    @Import(name="referenceType", required=true)
      private final String referenceType;

    public String referenceType() {
        return this.referenceType;
    }

    public IdAssetReferenceResponse(
        String assetId,
        String referenceType) {
        this.assetId = Objects.requireNonNull(assetId, "expected parameter 'assetId' to be non-null");
        this.referenceType = Codegen.stringProp("referenceType").arg(referenceType).require();
    }

    private IdAssetReferenceResponse() {
        this.assetId = null;
        this.referenceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdAssetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(IdAssetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder assetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }
        public Builder referenceType(String referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }        public IdAssetReferenceResponse build() {
            return new IdAssetReferenceResponse(assetId, referenceType);
        }
    }
}
