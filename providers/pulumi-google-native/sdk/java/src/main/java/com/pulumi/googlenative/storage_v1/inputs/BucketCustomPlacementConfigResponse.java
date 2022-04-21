// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The bucket&#39;s custom placement configuration for Custom Dual Regions.
 * 
 */
public final class BucketCustomPlacementConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final BucketCustomPlacementConfigResponse Empty = new BucketCustomPlacementConfigResponse();

    /**
     * The list of regional locations in which data is placed.
     * 
     */
    @Import(name="dataLocations", required=true)
    private List<String> dataLocations;

    public List<String> dataLocations() {
        return this.dataLocations;
    }

    private BucketCustomPlacementConfigResponse() {}

    private BucketCustomPlacementConfigResponse(BucketCustomPlacementConfigResponse $) {
        this.dataLocations = $.dataLocations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketCustomPlacementConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketCustomPlacementConfigResponse $;

        public Builder() {
            $ = new BucketCustomPlacementConfigResponse();
        }

        public Builder(BucketCustomPlacementConfigResponse defaults) {
            $ = new BucketCustomPlacementConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder dataLocations(List<String> dataLocations) {
            $.dataLocations = dataLocations;
            return this;
        }

        public Builder dataLocations(String... dataLocations) {
            return dataLocations(List.of(dataLocations));
        }

        public BucketCustomPlacementConfigResponse build() {
            $.dataLocations = Objects.requireNonNull($.dataLocations, "expected parameter 'dataLocations' to be non-null");
            return $;
        }
    }

}
