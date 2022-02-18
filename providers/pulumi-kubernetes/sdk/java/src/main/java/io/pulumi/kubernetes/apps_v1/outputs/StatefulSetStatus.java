// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.apps_v1.outputs.StatefulSetCondition;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StatefulSetStatus {
    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset. This is a beta field and enabled/disabled by StatefulSetMinReadySeconds feature gate.
     * 
     */
    private final Integer availableReplicas;
    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    private final @Nullable Integer collisionCount;
    /**
     * Represents the latest available observations of a statefulset's current state.
     * 
     */
    private final @Nullable List<StatefulSetCondition> conditions;
    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    private final @Nullable Integer currentReplicas;
    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    private final @Nullable String currentRevision;
    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
     * 
     */
    private final @Nullable Integer observedGeneration;
    /**
     * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
     * 
     */
    private final @Nullable Integer readyReplicas;
    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    private final Integer replicas;
    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    private final @Nullable String updateRevision;
    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    private final @Nullable Integer updatedReplicas;

    @OutputCustomType.Constructor({"availableReplicas","collisionCount","conditions","currentReplicas","currentRevision","observedGeneration","readyReplicas","replicas","updateRevision","updatedReplicas"})
    private StatefulSetStatus(
        Integer availableReplicas,
        @Nullable Integer collisionCount,
        @Nullable List<StatefulSetCondition> conditions,
        @Nullable Integer currentReplicas,
        @Nullable String currentRevision,
        @Nullable Integer observedGeneration,
        @Nullable Integer readyReplicas,
        Integer replicas,
        @Nullable String updateRevision,
        @Nullable Integer updatedReplicas) {
        this.availableReplicas = Objects.requireNonNull(availableReplicas);
        this.collisionCount = collisionCount;
        this.conditions = conditions;
        this.currentReplicas = currentReplicas;
        this.currentRevision = currentRevision;
        this.observedGeneration = observedGeneration;
        this.readyReplicas = readyReplicas;
        this.replicas = Objects.requireNonNull(replicas);
        this.updateRevision = updateRevision;
        this.updatedReplicas = updatedReplicas;
    }

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset. This is a beta field and enabled/disabled by StatefulSetMinReadySeconds feature gate.
     * 
     */
    public Integer getAvailableReplicas() {
        return this.availableReplicas;
    }
    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    public Optional<Integer> getCollisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }
    /**
     * Represents the latest available observations of a statefulset's current state.
     * 
     */
    public List<StatefulSetCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    public Optional<Integer> getCurrentReplicas() {
        return Optional.ofNullable(this.currentReplicas);
    }
    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    public Optional<String> getCurrentRevision() {
        return Optional.ofNullable(this.currentRevision);
    }
    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet's generation, which is updated on mutation by the API Server.
     * 
     */
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    /**
     * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
     * 
     */
    public Optional<Integer> getReadyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }
    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    public Integer getReplicas() {
        return this.replicas;
    }
    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    public Optional<String> getUpdateRevision() {
        return Optional.ofNullable(this.updateRevision);
    }
    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    public Optional<Integer> getUpdatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availableReplicas;
        private @Nullable Integer collisionCount;
        private @Nullable List<StatefulSetCondition> conditions;
        private @Nullable Integer currentReplicas;
        private @Nullable String currentRevision;
        private @Nullable Integer observedGeneration;
        private @Nullable Integer readyReplicas;
        private Integer replicas;
        private @Nullable String updateRevision;
        private @Nullable Integer updatedReplicas;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availableReplicas = defaults.availableReplicas;
    	      this.collisionCount = defaults.collisionCount;
    	      this.conditions = defaults.conditions;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.currentRevision = defaults.currentRevision;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.readyReplicas = defaults.readyReplicas;
    	      this.replicas = defaults.replicas;
    	      this.updateRevision = defaults.updateRevision;
    	      this.updatedReplicas = defaults.updatedReplicas;
        }

        public Builder setAvailableReplicas(Integer availableReplicas) {
            this.availableReplicas = Objects.requireNonNull(availableReplicas);
            return this;
        }

        public Builder setCollisionCount(@Nullable Integer collisionCount) {
            this.collisionCount = collisionCount;
            return this;
        }

        public Builder setConditions(@Nullable List<StatefulSetCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setCurrentReplicas(@Nullable Integer currentReplicas) {
            this.currentReplicas = currentReplicas;
            return this;
        }

        public Builder setCurrentRevision(@Nullable String currentRevision) {
            this.currentRevision = currentRevision;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setReadyReplicas(@Nullable Integer readyReplicas) {
            this.readyReplicas = readyReplicas;
            return this;
        }

        public Builder setReplicas(Integer replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public Builder setUpdateRevision(@Nullable String updateRevision) {
            this.updateRevision = updateRevision;
            return this;
        }

        public Builder setUpdatedReplicas(@Nullable Integer updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }

        public StatefulSetStatus build() {
            return new StatefulSetStatus(availableReplicas, collisionCount, conditions, currentReplicas, currentRevision, observedGeneration, readyReplicas, replicas, updateRevision, updatedReplicas);
        }
    }
}
