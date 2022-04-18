// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.InitializingReplicationStepResponse;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.PostProcessingStepResponse;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.ReplicatingStepResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CycleStepResponse {
    /**
     * The time the cycle step has ended.
     * 
     */
    private final String endTime;
    /**
     * Initializing replication step.
     * 
     */
    private final InitializingReplicationStepResponse initializingReplication;
    /**
     * Post processing step.
     * 
     */
    private final PostProcessingStepResponse postProcessing;
    /**
     * Replicating step.
     * 
     */
    private final ReplicatingStepResponse replicating;
    /**
     * The time the cycle step has started.
     * 
     */
    private final String startTime;

    @CustomType.Constructor
    private CycleStepResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("initializingReplication") InitializingReplicationStepResponse initializingReplication,
        @CustomType.Parameter("postProcessing") PostProcessingStepResponse postProcessing,
        @CustomType.Parameter("replicating") ReplicatingStepResponse replicating,
        @CustomType.Parameter("startTime") String startTime) {
        this.endTime = endTime;
        this.initializingReplication = initializingReplication;
        this.postProcessing = postProcessing;
        this.replicating = replicating;
        this.startTime = startTime;
    }

    /**
     * The time the cycle step has ended.
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * Initializing replication step.
     * 
    */
    public InitializingReplicationStepResponse initializingReplication() {
        return this.initializingReplication;
    }
    /**
     * Post processing step.
     * 
    */
    public PostProcessingStepResponse postProcessing() {
        return this.postProcessing;
    }
    /**
     * Replicating step.
     * 
    */
    public ReplicatingStepResponse replicating() {
        return this.replicating;
    }
    /**
     * The time the cycle step has started.
     * 
    */
    public String startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CycleStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private InitializingReplicationStepResponse initializingReplication;
        private PostProcessingStepResponse postProcessing;
        private ReplicatingStepResponse replicating;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CycleStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.initializingReplication = defaults.initializingReplication;
    	      this.postProcessing = defaults.postProcessing;
    	      this.replicating = defaults.replicating;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder initializingReplication(InitializingReplicationStepResponse initializingReplication) {
            this.initializingReplication = Objects.requireNonNull(initializingReplication);
            return this;
        }
        public Builder postProcessing(PostProcessingStepResponse postProcessing) {
            this.postProcessing = Objects.requireNonNull(postProcessing);
            return this;
        }
        public Builder replicating(ReplicatingStepResponse replicating) {
            this.replicating = Objects.requireNonNull(replicating);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public CycleStepResponse build() {
            return new CycleStepResponse(endTime, initializingReplication, postProcessing, replicating, startTime);
        }
    }
}
