// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MetricIdentifier defines the name and optionally selector for a metric
 * 
 */
public final class MetricIdentifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetricIdentifierArgs Empty = new MetricIdentifierArgs();

    /**
     * name is the name of the given metric
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorArgs> selector;

    public Optional<Output<LabelSelectorArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    private MetricIdentifierArgs() {}

    private MetricIdentifierArgs(MetricIdentifierArgs $) {
        this.name = $.name;
        this.selector = $.selector;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetricIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricIdentifierArgs $;

        public Builder() {
            $ = new MetricIdentifierArgs();
        }

        public Builder(MetricIdentifierArgs defaults) {
            $ = new MetricIdentifierArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        public MetricIdentifierArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
