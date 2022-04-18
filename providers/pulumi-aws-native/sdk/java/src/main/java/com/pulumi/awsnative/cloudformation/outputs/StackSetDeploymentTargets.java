// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StackSetDeploymentTargets {
    /**
     * AWS accounts that you want to create stack instances in the specified Region(s) for.
     * 
     */
    private final @Nullable List<String> accounts;
    /**
     * The organization root ID or organizational unit (OU) IDs to which StackSets deploys.
     * 
     */
    private final @Nullable List<String> organizationalUnitIds;

    @CustomType.Constructor
    private StackSetDeploymentTargets(
        @CustomType.Parameter("accounts") @Nullable List<String> accounts,
        @CustomType.Parameter("organizationalUnitIds") @Nullable List<String> organizationalUnitIds) {
        this.accounts = accounts;
        this.organizationalUnitIds = organizationalUnitIds;
    }

    /**
     * AWS accounts that you want to create stack instances in the specified Region(s) for.
     * 
    */
    public List<String> accounts() {
        return this.accounts == null ? List.of() : this.accounts;
    }
    /**
     * The organization root ID or organizational unit (OU) IDs to which StackSets deploys.
     * 
    */
    public List<String> organizationalUnitIds() {
        return this.organizationalUnitIds == null ? List.of() : this.organizationalUnitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetDeploymentTargets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> accounts;
        private @Nullable List<String> organizationalUnitIds;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetDeploymentTargets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.organizationalUnitIds = defaults.organizationalUnitIds;
        }

        public Builder accounts(@Nullable List<String> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(String... accounts) {
            return accounts(List.of(accounts));
        }
        public Builder organizationalUnitIds(@Nullable List<String> organizationalUnitIds) {
            this.organizationalUnitIds = organizationalUnitIds;
            return this;
        }
        public Builder organizationalUnitIds(String... organizationalUnitIds) {
            return organizationalUnitIds(List.of(organizationalUnitIds));
        }        public StackSetDeploymentTargets build() {
            return new StackSetDeploymentTargets(accounts, organizationalUnitIds);
        }
    }
}
