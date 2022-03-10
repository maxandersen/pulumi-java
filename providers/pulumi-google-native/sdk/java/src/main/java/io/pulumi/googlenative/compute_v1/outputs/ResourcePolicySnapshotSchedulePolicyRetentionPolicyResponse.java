// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse {
    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
     */
    private final Integer maxRetentionDays;
    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
     */
    private final String onSourceDiskDelete;

    @OutputCustomType.Constructor
    private ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse(
        @OutputCustomType.Parameter("maxRetentionDays") Integer maxRetentionDays,
        @OutputCustomType.Parameter("onSourceDiskDelete") String onSourceDiskDelete) {
        this.maxRetentionDays = maxRetentionDays;
        this.onSourceDiskDelete = onSourceDiskDelete;
    }

    /**
     * Maximum age of the snapshot that is allowed to be kept.
     * 
    */
    public Integer getMaxRetentionDays() {
        return this.maxRetentionDays;
    }
    /**
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * 
    */
    public String getOnSourceDiskDelete() {
        return this.onSourceDiskDelete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRetentionDays;
        private String onSourceDiskDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.onSourceDiskDelete = defaults.onSourceDiskDelete;
        }

        public Builder setMaxRetentionDays(Integer maxRetentionDays) {
            this.maxRetentionDays = Objects.requireNonNull(maxRetentionDays);
            return this;
        }

        public Builder setOnSourceDiskDelete(String onSourceDiskDelete) {
            this.onSourceDiskDelete = Objects.requireNonNull(onSourceDiskDelete);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse(maxRetentionDays, onSourceDiskDelete);
        }
    }
}
