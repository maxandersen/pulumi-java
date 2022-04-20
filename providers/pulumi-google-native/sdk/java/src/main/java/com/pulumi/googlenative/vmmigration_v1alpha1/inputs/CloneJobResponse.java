// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vmmigration_v1alpha1.inputs.ComputeEngineTargetDetailsResponse;
import com.pulumi.googlenative.vmmigration_v1alpha1.inputs.StatusResponse;
import java.lang.String;
import java.util.Objects;


/**
 * CloneJob describes the process of creating a clone of a MigratingVM to the requested target based on the latest successful uploaded snapshots. While the migration cycles of a MigratingVm take place, it is possible to verify the uploaded VM can be started in the cloud, by creating a clone. The clone can be created without any downtime, and it is created using the latest snapshots which are already in the cloud. The cloneJob is only responsible for its work, not its products, which means once it is finished, it will never touch the instance it created. It will only delete it in case of the CloneJob being cancelled or upon failure to clone.
 * 
 */
public final class CloneJobResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloneJobResponse Empty = new CloneJobResponse();

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
     * The time the clone job was created (as an API call, not when it was actually created in the target).
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Provides details for the errors that led to the Clone Job&#39;s state.
     * 
     */
    @Import(name="error", required=true)
      private final StatusResponse error;

    public StatusResponse error() {
        return this.error;
    }

    /**
     * The name of the clone.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * State of the clone job.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
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

    public CloneJobResponse(
        ComputeEngineTargetDetailsResponse computeEngineTargetDetails,
        String createTime,
        StatusResponse error,
        String name,
        String state,
        String stateTime) {
        this.computeEngineTargetDetails = Objects.requireNonNull(computeEngineTargetDetails, "expected parameter 'computeEngineTargetDetails' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateTime = Objects.requireNonNull(stateTime, "expected parameter 'stateTime' to be non-null");
    }

    private CloneJobResponse() {
        this.computeEngineTargetDetails = null;
        this.createTime = null;
        this.error = null;
        this.name = null;
        this.state = null;
        this.stateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEngineTargetDetailsResponse computeEngineTargetDetails;
        private String createTime;
        private StatusResponse error;
        private String name;
        private String state;
        private String stateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CloneJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEngineTargetDetails = defaults.computeEngineTargetDetails;
    	      this.createTime = defaults.createTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
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
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateTime(String stateTime) {
            this.stateTime = Objects.requireNonNull(stateTime);
            return this;
        }        public CloneJobResponse build() {
            return new CloneJobResponse(computeEngineTargetDetails, createTime, error, name, state, stateTime);
        }
    }
}
