// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.ConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget. Status may trail the actual state of a system.
 * 
 */
public final class PodDisruptionBudgetStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final PodDisruptionBudgetStatusArgs Empty = new PodDisruptionBudgetStatusArgs();

    /**
     * Conditions contain conditions for PDB. The disruption controller sets the DisruptionAllowed condition. The following are known values for the reason field (additional reasons could be added in the future): - SyncFailed: The controller encountered an error and wasn&#39;t able to compute
     *               the number of allowed disruptions. Therefore no disruptions are
     *               allowed and the status of the condition will be False.
     * - InsufficientPods: The number of pods are either at or below the number
     *                     required by the PodDisruptionBudget. No disruptions are
     *                     allowed and the status of the condition will be False.
     * - SufficientPods: There are more pods than required by the PodDisruptionBudget.
     *                   The condition will be True, and the number of allowed
     *                   disruptions are provided by the disruptionsAllowed property.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<ConditionArgs>> conditions;

    public Output<List<ConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * current number of healthy pods
     * 
     */
    @Import(name="currentHealthy", required=true)
      private final Output<Integer> currentHealthy;

    public Output<Integer> currentHealthy() {
        return this.currentHealthy;
    }

    /**
     * minimum desired number of healthy pods
     * 
     */
    @Import(name="desiredHealthy", required=true)
      private final Output<Integer> desiredHealthy;

    public Output<Integer> desiredHealthy() {
        return this.desiredHealthy;
    }

    /**
     * DisruptedPods contains information about pods whose eviction was processed by the API server eviction subresource handler but has not yet been observed by the PodDisruptionBudget controller. A pod will be in this map from the time when the API server processed the eviction request to the time when the pod is seen by PDB controller as having been marked for deletion (or after a timeout). The key in the map is the name of the pod and the value is the time when the API server processed the eviction request. If the deletion didn&#39;t occur and a pod is still there it will be removed from the list automatically by PodDisruptionBudget controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod deletions.
     * 
     */
    @Import(name="disruptedPods")
      private final @Nullable Output<Map<String,String>> disruptedPods;

    public Output<Map<String,String>> disruptedPods() {
        return this.disruptedPods == null ? Codegen.empty() : this.disruptedPods;
    }

    /**
     * Number of pod disruptions that are currently allowed.
     * 
     */
    @Import(name="disruptionsAllowed", required=true)
      private final Output<Integer> disruptionsAllowed;

    public Output<Integer> disruptionsAllowed() {
        return this.disruptionsAllowed;
    }

    /**
     * total number of pods counted by this disruption budget
     * 
     */
    @Import(name="expectedPods", required=true)
      private final Output<Integer> expectedPods;

    public Output<Integer> expectedPods() {
        return this.expectedPods;
    }

    /**
     * Most recent generation observed when updating this PDB status. DisruptionsAllowed and other status information is valid only if observedGeneration equals to PDB&#39;s object generation.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> observedGeneration() {
        return this.observedGeneration == null ? Codegen.empty() : this.observedGeneration;
    }

    public PodDisruptionBudgetStatusArgs(
        @Nullable Output<List<ConditionArgs>> conditions,
        Output<Integer> currentHealthy,
        Output<Integer> desiredHealthy,
        @Nullable Output<Map<String,String>> disruptedPods,
        Output<Integer> disruptionsAllowed,
        Output<Integer> expectedPods,
        @Nullable Output<Integer> observedGeneration) {
        this.conditions = conditions;
        this.currentHealthy = Objects.requireNonNull(currentHealthy, "expected parameter 'currentHealthy' to be non-null");
        this.desiredHealthy = Objects.requireNonNull(desiredHealthy, "expected parameter 'desiredHealthy' to be non-null");
        this.disruptedPods = disruptedPods;
        this.disruptionsAllowed = Objects.requireNonNull(disruptionsAllowed, "expected parameter 'disruptionsAllowed' to be non-null");
        this.expectedPods = Objects.requireNonNull(expectedPods, "expected parameter 'expectedPods' to be non-null");
        this.observedGeneration = observedGeneration;
    }

    private PodDisruptionBudgetStatusArgs() {
        this.conditions = Codegen.empty();
        this.currentHealthy = Codegen.empty();
        this.desiredHealthy = Codegen.empty();
        this.disruptedPods = Codegen.empty();
        this.disruptionsAllowed = Codegen.empty();
        this.expectedPods = Codegen.empty();
        this.observedGeneration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDisruptionBudgetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ConditionArgs>> conditions;
        private Output<Integer> currentHealthy;
        private Output<Integer> desiredHealthy;
        private @Nullable Output<Map<String,String>> disruptedPods;
        private Output<Integer> disruptionsAllowed;
        private Output<Integer> expectedPods;
        private @Nullable Output<Integer> observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDisruptionBudgetStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentHealthy = defaults.currentHealthy;
    	      this.desiredHealthy = defaults.desiredHealthy;
    	      this.disruptedPods = defaults.disruptedPods;
    	      this.disruptionsAllowed = defaults.disruptionsAllowed;
    	      this.expectedPods = defaults.expectedPods;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder conditions(@Nullable Output<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(ConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder currentHealthy(Output<Integer> currentHealthy) {
            this.currentHealthy = Objects.requireNonNull(currentHealthy);
            return this;
        }
        public Builder currentHealthy(Integer currentHealthy) {
            this.currentHealthy = Output.of(Objects.requireNonNull(currentHealthy));
            return this;
        }
        public Builder desiredHealthy(Output<Integer> desiredHealthy) {
            this.desiredHealthy = Objects.requireNonNull(desiredHealthy);
            return this;
        }
        public Builder desiredHealthy(Integer desiredHealthy) {
            this.desiredHealthy = Output.of(Objects.requireNonNull(desiredHealthy));
            return this;
        }
        public Builder disruptedPods(@Nullable Output<Map<String,String>> disruptedPods) {
            this.disruptedPods = disruptedPods;
            return this;
        }
        public Builder disruptedPods(@Nullable Map<String,String> disruptedPods) {
            this.disruptedPods = Codegen.ofNullable(disruptedPods);
            return this;
        }
        public Builder disruptionsAllowed(Output<Integer> disruptionsAllowed) {
            this.disruptionsAllowed = Objects.requireNonNull(disruptionsAllowed);
            return this;
        }
        public Builder disruptionsAllowed(Integer disruptionsAllowed) {
            this.disruptionsAllowed = Output.of(Objects.requireNonNull(disruptionsAllowed));
            return this;
        }
        public Builder expectedPods(Output<Integer> expectedPods) {
            this.expectedPods = Objects.requireNonNull(expectedPods);
            return this;
        }
        public Builder expectedPods(Integer expectedPods) {
            this.expectedPods = Output.of(Objects.requireNonNull(expectedPods));
            return this;
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Codegen.ofNullable(observedGeneration);
            return this;
        }        public PodDisruptionBudgetStatusArgs build() {
            return new PodDisruptionBudgetStatusArgs(conditions, currentHealthy, desiredHealthy, disruptedPods, disruptionsAllowed, expectedPods, observedGeneration);
        }
    }
}
