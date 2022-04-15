// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicySnapshotSchedulePolicyScheduleResponse;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse;
import java.util.Objects;


/**
 * A snapshot schedule policy specifies when and how frequently snapshots are to be created for the target disk. Also specifies how many and how long these scheduled snapshots should be retained.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicySnapshotSchedulePolicyResponse Empty = new ResourcePolicySnapshotSchedulePolicyResponse();

    /**
     * Retention policy applied to snapshots created by this resource policy.
     * 
     */
    @Import(name="retentionPolicy", required=true)
      private final ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy;

    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
     * 
     */
    @Import(name="schedule", required=true)
      private final ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule;

    public ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule() {
        return this.schedule;
    }

    /**
     * Properties with which snapshots are created such as labels, encryption keys.
     * 
     */
    @Import(name="snapshotProperties", required=true)
      private final ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties;

    public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties() {
        return this.snapshotProperties;
    }

    public ResourcePolicySnapshotSchedulePolicyResponse(
        ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy,
        ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule,
        ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties) {
        this.retentionPolicy = Objects.requireNonNull(retentionPolicy, "expected parameter 'retentionPolicy' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.snapshotProperties = Objects.requireNonNull(snapshotProperties, "expected parameter 'snapshotProperties' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicyResponse() {
        this.retentionPolicy = null;
        this.schedule = null;
        this.snapshotProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy;
        private ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule;
        private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedule = defaults.schedule;
    	      this.snapshotProperties = defaults.snapshotProperties;
        }

        public Builder retentionPolicy(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = Objects.requireNonNull(retentionPolicy);
            return this;
        }
        public Builder schedule(ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder snapshotProperties(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties) {
            this.snapshotProperties = Objects.requireNonNull(snapshotProperties);
            return this;
        }        public ResourcePolicySnapshotSchedulePolicyResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyResponse(retentionPolicy, schedule, snapshotProperties);
        }
    }
}
