// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.NodeConfigSource;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeConfigStatus {
    /**
     * Active reports the checkpointed config the node is actively using. Active will represent either the current version of the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config results in an error.
     * 
     */
    private final @Nullable NodeConfigSource active;
    /**
     * Assigned reports the checkpointed config the node will try to use. When Node.Spec.ConfigSource is updated, the node checkpoints the associated config payload to local disk, along with a record indicating intended config. The node refers to this record to choose its config checkpoint, and reports this record in Assigned. Assigned only updates in the status after the record has been checkpointed to disk. When the Kubelet is restarted, it tries to make the Assigned config the Active config by loading and validating the checkpointed payload identified by Assigned.
     * 
     */
    private final @Nullable NodeConfigSource assigned;
    /**
     * Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.
     * 
     */
    private final @Nullable String error;
    /**
     * LastKnownGood reports the checkpointed config the node will fall back to when it encounters an error attempting to use the Assigned config. The Assigned config becomes the LastKnownGood config when the node determines that the Assigned config is stable and correct. This is currently implemented as a 10-minute soak period starting when the local record of Assigned config is updated. If the Assigned config is Active at the end of this period, it becomes the LastKnownGood. Note that if Spec.ConfigSource is reset to nil (use local defaults), the LastKnownGood is also immediately reset to nil, because the local default config is always assumed good. You should not make assumptions about the node&#39;s method of determining config stability and correctness, as this may change or become configurable in the future.
     * 
     */
    private final @Nullable NodeConfigSource lastKnownGood;

    @CustomType.Constructor
    private NodeConfigStatus(
        @CustomType.Parameter("active") @Nullable NodeConfigSource active,
        @CustomType.Parameter("assigned") @Nullable NodeConfigSource assigned,
        @CustomType.Parameter("error") @Nullable String error,
        @CustomType.Parameter("lastKnownGood") @Nullable NodeConfigSource lastKnownGood) {
        this.active = active;
        this.assigned = assigned;
        this.error = error;
        this.lastKnownGood = lastKnownGood;
    }

    /**
     * Active reports the checkpointed config the node is actively using. Active will represent either the current version of the Assigned config, or the current LastKnownGood config, depending on whether attempting to use the Assigned config results in an error.
     * 
    */
    public Optional<NodeConfigSource> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * Assigned reports the checkpointed config the node will try to use. When Node.Spec.ConfigSource is updated, the node checkpoints the associated config payload to local disk, along with a record indicating intended config. The node refers to this record to choose its config checkpoint, and reports this record in Assigned. Assigned only updates in the status after the record has been checkpointed to disk. When the Kubelet is restarted, it tries to make the Assigned config the Active config by loading and validating the checkpointed payload identified by Assigned.
     * 
    */
    public Optional<NodeConfigSource> assigned() {
        return Optional.ofNullable(this.assigned);
    }
    /**
     * Error describes any problems reconciling the Spec.ConfigSource to the Active config. Errors may occur, for example, attempting to checkpoint Spec.ConfigSource to the local Assigned record, attempting to checkpoint the payload associated with Spec.ConfigSource, attempting to load or validate the Assigned config, etc. Errors may occur at different points while syncing config. Earlier errors (e.g. download or checkpointing errors) will not result in a rollback to LastKnownGood, and may resolve across Kubelet retries. Later errors (e.g. loading or validating a checkpointed config) will result in a rollback to LastKnownGood. In the latter case, it is usually possible to resolve the error by fixing the config assigned in Spec.ConfigSource. You can find additional information for debugging by searching the error message in the Kubelet log. Error is a human-readable description of the error state; machines can check whether or not Error is empty, but should not rely on the stability of the Error text across Kubelet versions.
     * 
    */
    public Optional<String> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * LastKnownGood reports the checkpointed config the node will fall back to when it encounters an error attempting to use the Assigned config. The Assigned config becomes the LastKnownGood config when the node determines that the Assigned config is stable and correct. This is currently implemented as a 10-minute soak period starting when the local record of Assigned config is updated. If the Assigned config is Active at the end of this period, it becomes the LastKnownGood. Note that if Spec.ConfigSource is reset to nil (use local defaults), the LastKnownGood is also immediately reset to nil, because the local default config is always assumed good. You should not make assumptions about the node&#39;s method of determining config stability and correctness, as this may change or become configurable in the future.
     * 
    */
    public Optional<NodeConfigSource> lastKnownGood() {
        return Optional.ofNullable(this.lastKnownGood);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NodeConfigSource active;
        private @Nullable NodeConfigSource assigned;
        private @Nullable String error;
        private @Nullable NodeConfigSource lastKnownGood;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.assigned = defaults.assigned;
    	      this.error = defaults.error;
    	      this.lastKnownGood = defaults.lastKnownGood;
        }

        public Builder active(@Nullable NodeConfigSource active) {
            this.active = active;
            return this;
        }
        public Builder assigned(@Nullable NodeConfigSource assigned) {
            this.assigned = assigned;
            return this;
        }
        public Builder error(@Nullable String error) {
            this.error = error;
            return this;
        }
        public Builder lastKnownGood(@Nullable NodeConfigSource lastKnownGood) {
            this.lastKnownGood = lastKnownGood;
            return this;
        }        public NodeConfigStatus build() {
            return new NodeConfigStatus(active, assigned, error, lastKnownGood);
        }
    }
}
