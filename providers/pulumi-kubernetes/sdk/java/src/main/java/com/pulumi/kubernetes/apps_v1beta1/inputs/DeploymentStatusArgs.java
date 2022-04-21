// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps_v1beta1.inputs.DeploymentConditionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DeploymentStatus is the most recently observed status of the Deployment.
 * 
 */
public final class DeploymentStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentStatusArgs Empty = new DeploymentStatusArgs();

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
     * 
     */
    @Import(name="availableReplicas")
    private @Nullable Output<Integer> availableReplicas;

    public Optional<Output<Integer>> availableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }

    /**
     * Count of hash collisions for the Deployment. The Deployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ReplicaSet.
     * 
     */
    @Import(name="collisionCount")
    private @Nullable Output<Integer> collisionCount;

    public Optional<Output<Integer>> collisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }

    /**
     * Represents the latest available observations of a deployment&#39;s current state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<DeploymentConditionArgs>> conditions;

    public Optional<Output<List<DeploymentConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * The generation observed by the deployment controller.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    /**
     * Total number of ready pods targeted by this deployment.
     * 
     */
    @Import(name="readyReplicas")
    private @Nullable Output<Integer> readyReplicas;

    public Optional<Output<Integer>> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }

    /**
     * Total number of non-terminated pods targeted by this deployment (their labels match the selector).
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<Integer> replicas;

    public Optional<Output<Integer>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * Total number of unavailable pods targeted by this deployment. This is the total number of pods that are still required for the deployment to have 100% available capacity. They may either be pods that are running but not yet available or pods that still have not been created.
     * 
     */
    @Import(name="unavailableReplicas")
    private @Nullable Output<Integer> unavailableReplicas;

    public Optional<Output<Integer>> unavailableReplicas() {
        return Optional.ofNullable(this.unavailableReplicas);
    }

    /**
     * Total number of non-terminated pods targeted by this deployment that have the desired template spec.
     * 
     */
    @Import(name="updatedReplicas")
    private @Nullable Output<Integer> updatedReplicas;

    public Optional<Output<Integer>> updatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    private DeploymentStatusArgs() {}

    private DeploymentStatusArgs(DeploymentStatusArgs $) {
        this.availableReplicas = $.availableReplicas;
        this.collisionCount = $.collisionCount;
        this.conditions = $.conditions;
        this.observedGeneration = $.observedGeneration;
        this.readyReplicas = $.readyReplicas;
        this.replicas = $.replicas;
        this.unavailableReplicas = $.unavailableReplicas;
        this.updatedReplicas = $.updatedReplicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentStatusArgs $;

        public Builder() {
            $ = new DeploymentStatusArgs();
        }

        public Builder(DeploymentStatusArgs defaults) {
            $ = new DeploymentStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder availableReplicas(@Nullable Output<Integer> availableReplicas) {
            $.availableReplicas = availableReplicas;
            return this;
        }

        public Builder availableReplicas(Integer availableReplicas) {
            return availableReplicas(Output.of(availableReplicas));
        }

        public Builder collisionCount(@Nullable Output<Integer> collisionCount) {
            $.collisionCount = collisionCount;
            return this;
        }

        public Builder collisionCount(Integer collisionCount) {
            return collisionCount(Output.of(collisionCount));
        }

        public Builder conditions(@Nullable Output<List<DeploymentConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<DeploymentConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(DeploymentConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public Builder readyReplicas(@Nullable Output<Integer> readyReplicas) {
            $.readyReplicas = readyReplicas;
            return this;
        }

        public Builder readyReplicas(Integer readyReplicas) {
            return readyReplicas(Output.of(readyReplicas));
        }

        public Builder replicas(@Nullable Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        public Builder unavailableReplicas(@Nullable Output<Integer> unavailableReplicas) {
            $.unavailableReplicas = unavailableReplicas;
            return this;
        }

        public Builder unavailableReplicas(Integer unavailableReplicas) {
            return unavailableReplicas(Output.of(unavailableReplicas));
        }

        public Builder updatedReplicas(@Nullable Output<Integer> updatedReplicas) {
            $.updatedReplicas = updatedReplicas;
            return this;
        }

        public Builder updatedReplicas(Integer updatedReplicas) {
            return updatedReplicas(Output.of(updatedReplicas));
        }

        public DeploymentStatusArgs build() {
            return $;
        }
    }

}
