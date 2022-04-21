// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation;

import com.pulumi.aws.cloudformation.inputs.StackSetInstanceDeploymentTargetsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StackSetInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final StackSetInstanceArgs Empty = new StackSetInstanceArgs();

    /**
     * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The AWS Organizations accounts to which StackSets deploys. StackSets doesn&#39;t deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deployment_targets below.
     * 
     */
    @Import(name="deploymentTargets")
    private @Nullable Output<StackSetInstanceDeploymentTargetsArgs> deploymentTargets;

    public Optional<Output<StackSetInstanceDeploymentTargetsArgs>> deploymentTargets() {
        return Optional.ofNullable(this.deploymentTargets);
    }

    /**
     * Key-value map of input parameters to override from the StackSet for this Instance.
     * 
     */
    @Import(name="parameterOverrides")
    private @Nullable Output<Map<String,String>> parameterOverrides;

    public Optional<Output<Map<String,String>>> parameterOverrides() {
        return Optional.ofNullable(this.parameterOverrides);
    }

    /**
     * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
     * 
     */
    @Import(name="retainStack")
    private @Nullable Output<Boolean> retainStack;

    public Optional<Output<Boolean>> retainStack() {
        return Optional.ofNullable(this.retainStack);
    }

    /**
     * Name of the StackSet.
     * 
     */
    @Import(name="stackSetName", required=true)
    private Output<String> stackSetName;

    public Output<String> stackSetName() {
        return this.stackSetName;
    }

    private StackSetInstanceArgs() {}

    private StackSetInstanceArgs(StackSetInstanceArgs $) {
        this.accountId = $.accountId;
        this.deploymentTargets = $.deploymentTargets;
        this.parameterOverrides = $.parameterOverrides;
        this.region = $.region;
        this.retainStack = $.retainStack;
        this.stackSetName = $.stackSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StackSetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StackSetInstanceArgs $;

        public Builder() {
            $ = new StackSetInstanceArgs();
        }

        public Builder(StackSetInstanceArgs defaults) {
            $ = new StackSetInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder deploymentTargets(@Nullable Output<StackSetInstanceDeploymentTargetsArgs> deploymentTargets) {
            $.deploymentTargets = deploymentTargets;
            return this;
        }

        public Builder deploymentTargets(StackSetInstanceDeploymentTargetsArgs deploymentTargets) {
            return deploymentTargets(Output.of(deploymentTargets));
        }

        public Builder parameterOverrides(@Nullable Output<Map<String,String>> parameterOverrides) {
            $.parameterOverrides = parameterOverrides;
            return this;
        }

        public Builder parameterOverrides(Map<String,String> parameterOverrides) {
            return parameterOverrides(Output.of(parameterOverrides));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder retainStack(@Nullable Output<Boolean> retainStack) {
            $.retainStack = retainStack;
            return this;
        }

        public Builder retainStack(Boolean retainStack) {
            return retainStack(Output.of(retainStack));
        }

        public Builder stackSetName(Output<String> stackSetName) {
            $.stackSetName = stackSetName;
            return this;
        }

        public Builder stackSetName(String stackSetName) {
            return stackSetName(Output.of(stackSetName));
        }

        public StackSetInstanceArgs build() {
            $.stackSetName = Objects.requireNonNull($.stackSetName, "expected parameter 'stackSetName' to be non-null");
            return $;
        }
    }

}
