// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.ManagedRuleSetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the list of managed rule sets for the policy.
 * 
 */
public final class ManagedRuleSetListArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedRuleSetListArgs Empty = new ManagedRuleSetListArgs();

    /**
     * List of rule sets.
     * 
     */
    @Import(name="managedRuleSets")
      private final @Nullable Output<List<ManagedRuleSetArgs>> managedRuleSets;

    public Output<List<ManagedRuleSetArgs>> managedRuleSets() {
        return this.managedRuleSets == null ? Codegen.empty() : this.managedRuleSets;
    }

    public ManagedRuleSetListArgs(@Nullable Output<List<ManagedRuleSetArgs>> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
    }

    private ManagedRuleSetListArgs() {
        this.managedRuleSets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ManagedRuleSetArgs>> managedRuleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedRuleSets = defaults.managedRuleSets;
        }

        public Builder managedRuleSets(@Nullable Output<List<ManagedRuleSetArgs>> managedRuleSets) {
            this.managedRuleSets = managedRuleSets;
            return this;
        }
        public Builder managedRuleSets(@Nullable List<ManagedRuleSetArgs> managedRuleSets) {
            this.managedRuleSets = Codegen.ofNullable(managedRuleSets);
            return this;
        }
        public Builder managedRuleSets(ManagedRuleSetArgs... managedRuleSets) {
            return managedRuleSets(List.of(managedRuleSets));
        }        public ManagedRuleSetListArgs build() {
            return new ManagedRuleSetListArgs(managedRuleSets);
        }
    }
}
