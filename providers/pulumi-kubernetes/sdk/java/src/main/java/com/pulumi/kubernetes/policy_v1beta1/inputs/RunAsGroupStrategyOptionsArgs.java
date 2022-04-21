// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.policy_v1beta1.inputs.IDRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
 * 
 */
public final class RunAsGroupStrategyOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RunAsGroupStrategyOptionsArgs Empty = new RunAsGroupStrategyOptionsArgs();

    /**
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    @Import(name="ranges")
    private @Nullable Output<List<IDRangeArgs>> ranges;

    public Optional<Output<List<IDRangeArgs>>> ranges() {
        return Optional.ofNullable(this.ranges);
    }

    /**
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * 
     */
    @Import(name="rule", required=true)
    private Output<String> rule;

    public Output<String> rule() {
        return this.rule;
    }

    private RunAsGroupStrategyOptionsArgs() {}

    private RunAsGroupStrategyOptionsArgs(RunAsGroupStrategyOptionsArgs $) {
        this.ranges = $.ranges;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunAsGroupStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunAsGroupStrategyOptionsArgs $;

        public Builder() {
            $ = new RunAsGroupStrategyOptionsArgs();
        }

        public Builder(RunAsGroupStrategyOptionsArgs defaults) {
            $ = new RunAsGroupStrategyOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder ranges(@Nullable Output<List<IDRangeArgs>> ranges) {
            $.ranges = ranges;
            return this;
        }

        public Builder ranges(List<IDRangeArgs> ranges) {
            return ranges(Output.of(ranges));
        }

        public Builder ranges(IDRangeArgs... ranges) {
            return ranges(List.of(ranges));
        }

        public Builder rule(Output<String> rule) {
            $.rule = rule;
            return this;
        }

        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        public RunAsGroupStrategyOptionsArgs build() {
            $.rule = Objects.requireNonNull($.rule, "expected parameter 'rule' to be non-null");
            return $;
        }
    }

}
