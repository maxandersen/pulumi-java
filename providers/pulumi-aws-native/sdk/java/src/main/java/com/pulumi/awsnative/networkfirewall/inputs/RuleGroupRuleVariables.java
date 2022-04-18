// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleVariables extends com.pulumi.resources.InvokeArgs {

    public static final RuleGroupRuleVariables Empty = new RuleGroupRuleVariables();

    @Import(name="iPSets")
      private final @Nullable Object iPSets;

    public Optional<Object> iPSets() {
        return this.iPSets == null ? Optional.empty() : Optional.ofNullable(this.iPSets);
    }

    @Import(name="portSets")
      private final @Nullable Object portSets;

    public Optional<Object> portSets() {
        return this.portSets == null ? Optional.empty() : Optional.ofNullable(this.portSets);
    }

    public RuleGroupRuleVariables(
        @Nullable Object iPSets,
        @Nullable Object portSets) {
        this.iPSets = iPSets;
        this.portSets = portSets;
    }

    private RuleGroupRuleVariables() {
        this.iPSets = null;
        this.portSets = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleVariables defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object iPSets;
        private @Nullable Object portSets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleVariables defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iPSets = defaults.iPSets;
    	      this.portSets = defaults.portSets;
        }

        public Builder iPSets(@Nullable Object iPSets) {
            this.iPSets = iPSets;
            return this;
        }
        public Builder portSets(@Nullable Object portSets) {
            this.portSets = portSets;
            return this;
        }        public RuleGroupRuleVariables build() {
            return new RuleGroupRuleVariables(iPSets, portSets);
        }
    }
}
