// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.enums.FlowAggregationType;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowAggregationConfig extends com.pulumi.resources.InvokeArgs {

    public static final FlowAggregationConfig Empty = new FlowAggregationConfig();

    @Import(name="aggregationType")
    private @Nullable FlowAggregationType aggregationType;

    public Optional<FlowAggregationType> aggregationType() {
        return Optional.ofNullable(this.aggregationType);
    }

    private FlowAggregationConfig() {}

    private FlowAggregationConfig(FlowAggregationConfig $) {
        this.aggregationType = $.aggregationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowAggregationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowAggregationConfig $;

        public Builder() {
            $ = new FlowAggregationConfig();
        }

        public Builder(FlowAggregationConfig defaults) {
            $ = new FlowAggregationConfig(Objects.requireNonNull(defaults));
        }

        public Builder aggregationType(@Nullable FlowAggregationType aggregationType) {
            $.aggregationType = aggregationType;
            return this;
        }

        public FlowAggregationConfig build() {
            return $;
        }
    }

}
