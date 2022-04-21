// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.SpotFleetRequestConfigDataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class SpotFleetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotFleetArgs Empty = new SpotFleetArgs();

    @Import(name="spotFleetRequestConfigData", required=true)
    private Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData;

    public Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData() {
        return this.spotFleetRequestConfigData;
    }

    private SpotFleetArgs() {}

    private SpotFleetArgs(SpotFleetArgs $) {
        this.spotFleetRequestConfigData = $.spotFleetRequestConfigData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotFleetArgs $;

        public Builder() {
            $ = new SpotFleetArgs();
        }

        public Builder(SpotFleetArgs defaults) {
            $ = new SpotFleetArgs(Objects.requireNonNull(defaults));
        }

        public Builder spotFleetRequestConfigData(Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData) {
            $.spotFleetRequestConfigData = spotFleetRequestConfigData;
            return this;
        }

        public Builder spotFleetRequestConfigData(SpotFleetRequestConfigDataArgs spotFleetRequestConfigData) {
            return spotFleetRequestConfigData(Output.of(spotFleetRequestConfigData));
        }

        public SpotFleetArgs build() {
            $.spotFleetRequestConfigData = Objects.requireNonNull($.spotFleetRequestConfigData, "expected parameter 'spotFleetRequestConfigData' to be non-null");
            return $;
        }
    }

}
