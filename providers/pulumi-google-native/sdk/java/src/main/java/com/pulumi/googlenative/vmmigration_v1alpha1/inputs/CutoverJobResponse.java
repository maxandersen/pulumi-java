// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vmmigration_v1alpha1.inputs.ComputeEngineTargetDetailsResponse;
import com.pulumi.googlenative.vmmigration_v1alpha1.inputs.StatusResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * CutoverJob message describes a cutover of a migrating VM. The CutoverJob is the operation of shutting down the VM, creating a snapshot and clonning the VM using the replicated snapshot.
 * 
 */
public final class CutoverJobResponse extends com.pulumi.resources.InvokeArgs {

    public static final CutoverJobResponse Empty = new CutoverJobResponse();

    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @Import(name="computeEngineTargetDetails", required=true)
      private final ComputeEngineTargetDetailsResponse computeEngineTargetDetails;

    public ComputeEngineTargetDetailsResponse computeEngineTargetDetails() {
        return this.computeEngineTargetDetails;
    }

    /**
     * The time the cutover job was created (as an API call, not when it was actually created in the target).
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Provides details for the errors that led to the Cutover Job's state.
     * 
     */
    @Import(name="error", required=true)
      private final StatusResponse error;

    public StatusResponse error() {
        return this.error;
    }

    /**
     * The name of the cutover job.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    @Import(name="progress", required=true)
      private final Integer progress;

    public Integer progress() {
        return this.progress;
    }

    /**
     * The current progress in percentage of the cutover job.
     * 
     */
    @Import(name="progressPercent", required=true)
      private final Integer progressPercent;

    public Integer progressPercent() {
        return this.progressPercent;
    }

    /**
     * State of the cutover job.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * A message providing possible extra details about the current state.
     * 
     */
    @Import(name="stateMessage", required=true)
      private final String stateMessage;

    public String stateMessage() {
        return this.stateMessage;
    }

    /**
     * The time the state was last updated.
     * 
     */
    @Import(name="stateTime", required=true)
      private final String stateTime;

    public String stateTime() {
        return this.stateTime;
    }

    public CutoverJobResponse(
        ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        String createTime,
        StatusResponse error,
        String name,
        Integer progress,
        Integer progressPercent,
        String state,
        String stateMessage,
        String stateTime) {
        this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails, "expected parameter 'computeEngineTargetDetails' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.progress = Objects.requireNonNull(progress, "expected parameter 'progress' to be non-null");
        this.progressPercent = Objects.requireNonNull(progressPercent, "expected parameter 'progressPercent' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateMessage = Objects.requireNonNull(stateMessage, "expected parameter 'stateMessage' to be non-null");
        this.stateTime = Objects.requireNonNull(stateTime, "expected parameter 'stateTime' to be non-null");
    }

    private CutoverJobResponse() {
        this.computeEngineTargetDetails = null;
        this.createTime = null;
        this.error = null;
        this.name = null;
        this.progress = null;
        this.progressPercent = null;
        this.state = null;
        this.stateMessage = null;
        this.stateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CutoverJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private String createTime;
        private StatusResponse error;
        private String name;
        private Integer progress;
        private Integer progressPercent;
        private String state;
        private String stateMessage;
        private String stateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CutoverJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.createTime = defaults.createTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.progress = defaults.progress;
    	      this.progressPercent = defaults.progressPercent;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.stateTime = defaults.stateTime;
        }

        public Builder computeEngineTargetDetails(ComputeEngineTargetDetailsResponse computeEngineTargetDetails) {
            this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        public Builder progressPercent(Integer progressPercent) {
            this.progressPercent = Objects.requireNonNull(progressPercent);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }        public CutoverJobResponse build() {
            return new CutoverJobResponse(computeEngineTargetDetails, createTime, error, name, progress, progressPercent, state, stateMessage, stateTime);
        }
    }
}
