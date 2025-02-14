// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssetModelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssetModelArgs Empty = new GetAssetModelArgs();

    /**
     * The ID of the asset model.
     * 
     */
    @Import(name="assetModelId", required=true)
    private String assetModelId;

    /**
     * @return The ID of the asset model.
     * 
     */
    public String assetModelId() {
        return this.assetModelId;
    }

    private GetAssetModelArgs() {}

    private GetAssetModelArgs(GetAssetModelArgs $) {
        this.assetModelId = $.assetModelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAssetModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAssetModelArgs $;

        public Builder() {
            $ = new GetAssetModelArgs();
        }

        public Builder(GetAssetModelArgs defaults) {
            $ = new GetAssetModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetModelId The ID of the asset model.
         * 
         * @return builder
         * 
         */
        public Builder assetModelId(String assetModelId) {
            $.assetModelId = assetModelId;
            return this;
        }

        public GetAssetModelArgs build() {
            $.assetModelId = Objects.requireNonNull($.assetModelId, "expected parameter 'assetModelId' to be non-null");
            return $;
        }
    }

}
