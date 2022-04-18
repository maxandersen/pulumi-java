// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apps_v1.outputs.ReplicaSetCondition;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicaSetStatus {
    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
     */
    private final @Nullable Integer availableReplicas;
    /**
     * Represents the latest available observations of a replica set's current state.
     * 
     */
    private final @Nullable List<ReplicaSetCondition> conditions;
    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
     */
    private final @Nullable Integer fullyLabeledReplicas;
    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
     */
    private final @Nullable Integer observedGeneration;
    /**
     * readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition.
     * 
     */
    private final @Nullable Integer readyReplicas;
    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    private final Integer replicas;

    @CustomType.Constructor
    private ReplicaSetStatus(
        @CustomType.Parameter("availableReplicas") @Nullable Integer availableReplicas,
        @CustomType.Parameter("conditions") @Nullable List<ReplicaSetCondition> conditions,
        @CustomType.Parameter("fullyLabeledReplicas") @Nullable Integer fullyLabeledReplicas,
        @CustomType.Parameter("observedGeneration") @Nullable Integer observedGeneration,
        @CustomType.Parameter("readyReplicas") @Nullable Integer readyReplicas,
        @CustomType.Parameter("replicas") Integer replicas) {
        this.availableReplicas = availableReplicas;
        this.conditions = conditions;
        this.fullyLabeledReplicas = fullyLabeledReplicas;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = replicas;
    }

    /**
     * The number of available replicas (ready for at least minReadySeconds) for this replica set.
     * 
    */
    public Optional<Integer> availableReplicas() {
        return Optional.ofNullable(this.availableReplicas);
    }
    /**
     * Represents the latest available observations of a replica set's current state.
     * 
    */
    public List<ReplicaSetCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * The number of pods that have labels matching the labels of the pod template of the replicaset.
     * 
    */
    public Optional<Integer> fullyLabeledReplicas() {
        return Optional.ofNullable(this.fullyLabeledReplicas);
    }
    /**
     * ObservedGeneration reflects the generation of the most recently observed ReplicaSet.
     * 
    */
    public Optional<Integer> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * readyReplicas is the number of pods targeted by this ReplicaSet with a Ready Condition.
     * 
    */
    public Optional<Integer> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    /**
     * Replicas is the most recently oberved number of replicas. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
    */
    public Integer replicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availableReplicas;
        private @Nullable List<ReplicaSetCondition> conditions;
        private @Nullable Integer fullyLabeledReplicas;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private Integer replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.conditions = defaults.conditions;
    	      this.fullyLabeledReplicas = defaults.fullyLabeledReplicas;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
        }

        public Builder availableReplicas(@Nullable Integer availableReplicas) {
            this.availableReplicas = availableReplicas;
            return this;
        }
        public Builder conditions(@Nullable List<ReplicaSetCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(ReplicaSetCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder fullyLabeledReplicas(@Nullable Integer fullyLabeledReplicas) {
            this.fullyLabeledReplicas = fullyLabeledReplicas;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder readyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }
        public Builder replicas(Integer replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }        public ReplicaSetStatus build() {
            return new ReplicaSetStatus(availableReplicas, conditions, fullyLabeledReplicas, observedGeneration, readyReplicas, replicas);
        }
    }
}
