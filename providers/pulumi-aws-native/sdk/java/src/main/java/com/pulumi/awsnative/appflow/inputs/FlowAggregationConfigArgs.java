// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.enums.FlowAggregationType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowAggregationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowAggregationConfigArgs Empty = new FlowAggregationConfigArgs();

    @Import(name="aggregationType")
    private @Nullable Output<FlowAggregationType> aggregationType;

    public Optional<Output<FlowAggregationType>> aggregationType() {
        return Optional.ofNullable(this.aggregationType);
    }

    private FlowAggregationConfigArgs() {}

    private FlowAggregationConfigArgs(FlowAggregationConfigArgs $) {
        this.aggregationType = $.aggregationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowAggregationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowAggregationConfigArgs $;

        public Builder() {
            $ = new FlowAggregationConfigArgs();
        }

        public Builder(FlowAggregationConfigArgs defaults) {
            $ = new FlowAggregationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder aggregationType(@Nullable Output<FlowAggregationType> aggregationType) {
            $.aggregationType = aggregationType;
            return this;
        }

        public Builder aggregationType(FlowAggregationType aggregationType) {
            return aggregationType(Output.of(aggregationType));
        }

        public FlowAggregationConfigArgs build() {
            return $;
        }
    }

}
