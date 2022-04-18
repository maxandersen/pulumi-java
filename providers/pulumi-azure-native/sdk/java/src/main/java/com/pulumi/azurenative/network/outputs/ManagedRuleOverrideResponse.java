// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedRuleOverrideResponse {
    /**
     * Identifier for the managed rule.
     * 
     */
    private final String ruleId;
    /**
     * The state of the managed rule. Defaults to Disabled if not specified.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private ManagedRuleOverrideResponse(
        @CustomType.Parameter("ruleId") String ruleId,
        @CustomType.Parameter("state") @Nullable String state) {
        this.ruleId = ruleId;
        this.state = state;
    }

    /**
     * Identifier for the managed rule.
     * 
    */
    public String ruleId() {
        return this.ruleId;
    }
    /**
     * The state of the managed rule. Defaults to Disabled if not specified.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleId;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleId = defaults.ruleId;
    	      this.state = defaults.state;
        }

        public Builder ruleId(String ruleId) {
            this.ruleId = Objects.requireNonNull(ruleId);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public ManagedRuleOverrideResponse build() {
            return new ManagedRuleOverrideResponse(ruleId, state);
        }
    }
}
