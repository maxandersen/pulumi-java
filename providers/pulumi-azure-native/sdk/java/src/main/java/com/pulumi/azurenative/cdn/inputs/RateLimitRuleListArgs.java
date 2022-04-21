// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.RateLimitRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines contents of rate limit rules
 * 
 */
public final class RateLimitRuleListArgs extends com.pulumi.resources.ResourceArgs {

    public static final RateLimitRuleListArgs Empty = new RateLimitRuleListArgs();

    /**
     * List of rules
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RateLimitRuleArgs>> rules;

    public Optional<Output<List<RateLimitRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private RateLimitRuleListArgs() {}

    private RateLimitRuleListArgs(RateLimitRuleListArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RateLimitRuleListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RateLimitRuleListArgs $;

        public Builder() {
            $ = new RateLimitRuleListArgs();
        }

        public Builder(RateLimitRuleListArgs defaults) {
            $ = new RateLimitRuleListArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(@Nullable Output<List<RateLimitRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<RateLimitRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(RateLimitRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public RateLimitRuleListArgs build() {
            return $;
        }
    }

}
