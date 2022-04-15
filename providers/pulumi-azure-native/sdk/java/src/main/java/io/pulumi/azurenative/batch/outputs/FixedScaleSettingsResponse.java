// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FixedScaleSettingsResponse {
    /**
     * If omitted, the default value is Requeue.
     * 
     */
    private final @Nullable String nodeDeallocationOption;
    /**
     * The default value is 15 minutes. Timeout values use ISO 8601 format. For example, use PT10M for 10 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service rejects the request with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     * 
     */
    private final @Nullable String resizeTimeout;
    /**
     * At least one of targetDedicatedNodes, targetLowPriorityNodes must be set.
     * 
     */
    private final @Nullable Integer targetDedicatedNodes;
    /**
     * At least one of targetDedicatedNodes, targetLowPriorityNodes must be set.
     * 
     */
    private final @Nullable Integer targetLowPriorityNodes;

    @CustomType.Constructor
    private FixedScaleSettingsResponse(
        @CustomType.Parameter("nodeDeallocationOption") @Nullable String nodeDeallocationOption,
        @CustomType.Parameter("resizeTimeout") @Nullable String resizeTimeout,
        @CustomType.Parameter("targetDedicatedNodes") @Nullable Integer targetDedicatedNodes,
        @CustomType.Parameter("targetLowPriorityNodes") @Nullable Integer targetLowPriorityNodes) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        this.resizeTimeout = resizeTimeout;
        this.targetDedicatedNodes = targetDedicatedNodes;
        this.targetLowPriorityNodes = targetLowPriorityNodes;
    }

    /**
     * If omitted, the default value is Requeue.
     * 
    */
    public Optional<String> nodeDeallocationOption() {
        return Optional.ofNullable(this.nodeDeallocationOption);
    }
    /**
     * The default value is 15 minutes. Timeout values use ISO 8601 format. For example, use PT10M for 10 minutes. The minimum value is 5 minutes. If you specify a value less than 5 minutes, the Batch service rejects the request with an error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request).
     * 
    */
    public Optional<String> resizeTimeout() {
        return Optional.ofNullable(this.resizeTimeout);
    }
    /**
     * At least one of targetDedicatedNodes, targetLowPriorityNodes must be set.
     * 
    */
    public Optional<Integer> targetDedicatedNodes() {
        return Optional.ofNullable(this.targetDedicatedNodes);
    }
    /**
     * At least one of targetDedicatedNodes, targetLowPriorityNodes must be set.
     * 
    */
    public Optional<Integer> targetLowPriorityNodes() {
        return Optional.ofNullable(this.targetLowPriorityNodes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nodeDeallocationOption;
        private @Nullable String resizeTimeout;
        private @Nullable Integer targetDedicatedNodes;
        private @Nullable Integer targetLowPriorityNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeDeallocationOption = defaults.nodeDeallocationOption;
    	      this.resizeTimeout = defaults.resizeTimeout;
    	      this.targetDedicatedNodes = defaults.targetDedicatedNodes;
    	      this.targetLowPriorityNodes = defaults.targetLowPriorityNodes;
        }

        public Builder nodeDeallocationOption(@Nullable String nodeDeallocationOption) {
            this.nodeDeallocationOption = nodeDeallocationOption;
            return this;
        }
        public Builder resizeTimeout(@Nullable String resizeTimeout) {
            this.resizeTimeout = resizeTimeout;
            return this;
        }
        public Builder targetDedicatedNodes(@Nullable Integer targetDedicatedNodes) {
            this.targetDedicatedNodes = targetDedicatedNodes;
            return this;
        }
        public Builder targetLowPriorityNodes(@Nullable Integer targetLowPriorityNodes) {
            this.targetLowPriorityNodes = targetLowPriorityNodes;
            return this;
        }        public FixedScaleSettingsResponse build() {
            return new FixedScaleSettingsResponse(nodeDeallocationOption, resizeTimeout, targetDedicatedNodes, targetLowPriorityNodes);
        }
    }
}
