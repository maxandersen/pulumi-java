// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apps_v1.inputs.StatefulSetConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 * 
 */
public final class StatefulSetStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetStatusArgs Empty = new StatefulSetStatusArgs();

    /**
     * Total number of available pods (ready for at least minReadySeconds) targeted by this statefulset. This is a beta field and enabled/disabled by StatefulSetMinReadySeconds feature gate.
     * 
     */
    @Import(name="availableReplicas", required=true)
    private Output<Integer> availableReplicas;

    public Output<Integer> availableReplicas() {
        return this.availableReplicas;
    }

    /**
     * collisionCount is the count of hash collisions for the StatefulSet. The StatefulSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision.
     * 
     */
    @Import(name="collisionCount")
    private @Nullable Output<Integer> collisionCount;

    public Optional<Output<Integer>> collisionCount() {
        return Optional.ofNullable(this.collisionCount);
    }

    /**
     * Represents the latest available observations of a statefulset&#39;s current state.
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<StatefulSetConditionArgs>> conditions;

    public Optional<Output<List<StatefulSetConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * currentReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by currentRevision.
     * 
     */
    @Import(name="currentReplicas")
    private @Nullable Output<Integer> currentReplicas;

    public Optional<Output<Integer>> currentReplicas() {
        return Optional.ofNullable(this.currentReplicas);
    }

    /**
     * currentRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [0,currentReplicas).
     * 
     */
    @Import(name="currentRevision")
    private @Nullable Output<String> currentRevision;

    public Optional<Output<String>> currentRevision() {
        return Optional.ofNullable(this.currentRevision);
    }

    /**
     * observedGeneration is the most recent generation observed for this StatefulSet. It corresponds to the StatefulSet&#39;s generation, which is updated on mutation by the API Server.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    /**
     * readyReplicas is the number of pods created for this StatefulSet with a Ready Condition.
     * 
     */
    @Import(name="readyReplicas")
    private @Nullable Output<Integer> readyReplicas;

    public Optional<Output<Integer>> readyReplicas() {
        return Optional.ofNullable(this.readyReplicas);
    }

    /**
     * replicas is the number of Pods created by the StatefulSet controller.
     * 
     */
    @Import(name="replicas", required=true)
    private Output<Integer> replicas;

    public Output<Integer> replicas() {
        return this.replicas;
    }

    /**
     * updateRevision, if not empty, indicates the version of the StatefulSet used to generate Pods in the sequence [replicas-updatedReplicas,replicas)
     * 
     */
    @Import(name="updateRevision")
    private @Nullable Output<String> updateRevision;

    public Optional<Output<String>> updateRevision() {
        return Optional.ofNullable(this.updateRevision);
    }

    /**
     * updatedReplicas is the number of Pods created by the StatefulSet controller from the StatefulSet version indicated by updateRevision.
     * 
     */
    @Import(name="updatedReplicas")
    private @Nullable Output<Integer> updatedReplicas;

    public Optional<Output<Integer>> updatedReplicas() {
        return Optional.ofNullable(this.updatedReplicas);
    }

    private StatefulSetStatusArgs() {}

    private StatefulSetStatusArgs(StatefulSetStatusArgs $) {
        this.availableReplicas = $.availableReplicas;
        this.collisionCount = $.collisionCount;
        this.conditions = $.conditions;
        this.currentReplicas = $.currentReplicas;
        this.currentRevision = $.currentRevision;
        this.observedGeneration = $.observedGeneration;
        this.readyReplicas = $.readyReplicas;
        this.replicas = $.replicas;
        this.updateRevision = $.updateRevision;
        this.updatedReplicas = $.updatedReplicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulSetStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulSetStatusArgs $;

        public Builder() {
            $ = new StatefulSetStatusArgs();
        }

        public Builder(StatefulSetStatusArgs defaults) {
            $ = new StatefulSetStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder availableReplicas(Output<Integer> availableReplicas) {
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

        public Builder conditions(@Nullable Output<List<StatefulSetConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<StatefulSetConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(StatefulSetConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder currentReplicas(@Nullable Output<Integer> currentReplicas) {
            $.currentReplicas = currentReplicas;
            return this;
        }

        public Builder currentReplicas(Integer currentReplicas) {
            return currentReplicas(Output.of(currentReplicas));
        }

        public Builder currentRevision(@Nullable Output<String> currentRevision) {
            $.currentRevision = currentRevision;
            return this;
        }

        public Builder currentRevision(String currentRevision) {
            return currentRevision(Output.of(currentRevision));
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

        public Builder replicas(Output<Integer> replicas) {
            $.replicas = replicas;
            return this;
        }

        public Builder replicas(Integer replicas) {
            return replicas(Output.of(replicas));
        }

        public Builder updateRevision(@Nullable Output<String> updateRevision) {
            $.updateRevision = updateRevision;
            return this;
        }

        public Builder updateRevision(String updateRevision) {
            return updateRevision(Output.of(updateRevision));
        }

        public Builder updatedReplicas(@Nullable Output<Integer> updatedReplicas) {
            $.updatedReplicas = updatedReplicas;
            return this;
        }

        public Builder updatedReplicas(Integer updatedReplicas) {
            return updatedReplicas(Output.of(updatedReplicas));
        }

        public StatefulSetStatusArgs build() {
            $.availableReplicas = Objects.requireNonNull($.availableReplicas, "expected parameter 'availableReplicas' to be non-null");
            $.replicas = Objects.requireNonNull($.replicas, "expected parameter 'replicas' to be non-null");
            return $;
        }
    }

}
