// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleSourceIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleSourceIpConfigArgs Empty = new ListenerRuleSourceIpConfigArgs();

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ListenerRuleSourceIpConfigArgs() {}

    private ListenerRuleSourceIpConfigArgs(ListenerRuleSourceIpConfigArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleSourceIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleSourceIpConfigArgs $;

        public Builder() {
            $ = new ListenerRuleSourceIpConfigArgs();
        }

        public Builder(ListenerRuleSourceIpConfigArgs defaults) {
            $ = new ListenerRuleSourceIpConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ListenerRuleSourceIpConfigArgs build() {
            return $;
        }
    }

}
