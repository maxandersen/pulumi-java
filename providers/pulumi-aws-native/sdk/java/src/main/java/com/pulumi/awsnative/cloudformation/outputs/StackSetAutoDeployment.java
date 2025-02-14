// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StackSetAutoDeployment {
    /**
     * @return If set to true, StackSets automatically deploys additional stack instances to AWS Organizations accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack instances from the account in the specified Regions.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return If set to true, stack resources are retained when an account is removed from a target organization or OU. If set to false, stack resources are deleted. Specify only if Enabled is set to True.
     * 
     */
    private final @Nullable Boolean retainStacksOnAccountRemoval;

    @CustomType.Constructor
    private StackSetAutoDeployment(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("retainStacksOnAccountRemoval") @Nullable Boolean retainStacksOnAccountRemoval) {
        this.enabled = enabled;
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    /**
     * @return If set to true, StackSets automatically deploys additional stack instances to AWS Organizations accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack instances from the account in the specified Regions.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return If set to true, stack resources are retained when an account is removed from a target organization or OU. If set to false, stack resources are deleted. Specify only if Enabled is set to True.
     * 
     */
    public Optional<Boolean> retainStacksOnAccountRemoval() {
        return Optional.ofNullable(this.retainStacksOnAccountRemoval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetAutoDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean retainStacksOnAccountRemoval;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetAutoDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retainStacksOnAccountRemoval = defaults.retainStacksOnAccountRemoval;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder retainStacksOnAccountRemoval(@Nullable Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }        public StackSetAutoDeployment build() {
            return new StackSetAutoDeployment(enabled, retainStacksOnAccountRemoval);
        }
    }
}
