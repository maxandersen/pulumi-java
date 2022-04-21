// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupPortRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupPortRangeArgs Empty = new RuleGroupPortRangeArgs();

    @Import(name="fromPort", required=true)
    private Output<Integer> fromPort;

    public Output<Integer> fromPort() {
        return this.fromPort;
    }

    @Import(name="toPort", required=true)
    private Output<Integer> toPort;

    public Output<Integer> toPort() {
        return this.toPort;
    }

    private RuleGroupPortRangeArgs() {}

    private RuleGroupPortRangeArgs(RuleGroupPortRangeArgs $) {
        this.fromPort = $.fromPort;
        this.toPort = $.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupPortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupPortRangeArgs $;

        public Builder() {
            $ = new RuleGroupPortRangeArgs();
        }

        public Builder(RuleGroupPortRangeArgs defaults) {
            $ = new RuleGroupPortRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder fromPort(Output<Integer> fromPort) {
            $.fromPort = fromPort;
            return this;
        }

        public Builder fromPort(Integer fromPort) {
            return fromPort(Output.of(fromPort));
        }

        public Builder toPort(Output<Integer> toPort) {
            $.toPort = toPort;
            return this;
        }

        public Builder toPort(Integer toPort) {
            return toPort(Output.of(toPort));
        }

        public RuleGroupPortRangeArgs build() {
            $.fromPort = Objects.requireNonNull($.fromPort, "expected parameter 'fromPort' to be non-null");
            $.toPort = Objects.requireNonNull($.toPort, "expected parameter 'toPort' to be non-null");
            return $;
        }
    }

}
