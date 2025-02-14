// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess {
    /**
     * @return The action to take on instances in the original environment after a successful blue/green deployment.
     * * `TERMINATE`: Instances are terminated after a specified wait time.
     * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
     * 
     */
    private final @Nullable String action;
    /**
     * @return The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
     * 
     */
    private final @Nullable Integer terminationWaitTimeInMinutes;

    @CustomType.Constructor
    private DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("terminationWaitTimeInMinutes") @Nullable Integer terminationWaitTimeInMinutes) {
        this.action = action;
        this.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
    }

    /**
     * @return The action to take on instances in the original environment after a successful blue/green deployment.
     * * `TERMINATE`: Instances are terminated after a specified wait time.
     * * `KEEP_ALIVE`: Instances are left running after they are deregistered from the load balancer and removed from the deployment group.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The number of minutes to wait after a successful blue/green deployment before terminating instances from the original environment.
     * 
     */
    public Optional<Integer> terminationWaitTimeInMinutes() {
        return Optional.ofNullable(this.terminationWaitTimeInMinutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable Integer terminationWaitTimeInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.terminationWaitTimeInMinutes = defaults.terminationWaitTimeInMinutes;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder terminationWaitTimeInMinutes(@Nullable Integer terminationWaitTimeInMinutes) {
            this.terminationWaitTimeInMinutes = terminationWaitTimeInMinutes;
            return this;
        }        public DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess build() {
            return new DeploymentGroupBlueGreenDeploymentConfigTerminateBlueInstancesOnDeploymentSuccess(action, terminationWaitTimeInMinutes);
        }
    }
}
