// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Fields for tracking resource move
 * 
 */
public final class ResourceMoveDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceMoveDetailsResponse Empty = new ResourceMoveDetailsResponse();

    /**
     * Denotes whether move operation is in progress
     * 
     */
    @Import(name="operationInProgress")
      private final @Nullable String operationInProgress;

    public Optional<String> operationInProgress() {
        return this.operationInProgress == null ? Optional.empty() : Optional.ofNullable(this.operationInProgress);
    }

    /**
     * Denotes the timeout of the operation to finish
     * 
     */
    @Import(name="operationInProgressLockTimeoutInUTC")
      private final @Nullable String operationInProgressLockTimeoutInUTC;

    public Optional<String> operationInProgressLockTimeoutInUTC() {
        return this.operationInProgressLockTimeoutInUTC == null ? Optional.empty() : Optional.ofNullable(this.operationInProgressLockTimeoutInUTC);
    }

    public ResourceMoveDetailsResponse(
        @Nullable String operationInProgress,
        @Nullable String operationInProgressLockTimeoutInUTC) {
        this.operationInProgress = operationInProgress;
        this.operationInProgressLockTimeoutInUTC = operationInProgressLockTimeoutInUTC;
    }

    private ResourceMoveDetailsResponse() {
        this.operationInProgress = null;
        this.operationInProgressLockTimeoutInUTC = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMoveDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operationInProgress;
        private @Nullable String operationInProgressLockTimeoutInUTC;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMoveDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationInProgress = defaults.operationInProgress;
    	      this.operationInProgressLockTimeoutInUTC = defaults.operationInProgressLockTimeoutInUTC;
        }

        public Builder operationInProgress(@Nullable String operationInProgress) {
            this.operationInProgress = operationInProgress;
            return this;
        }
        public Builder operationInProgressLockTimeoutInUTC(@Nullable String operationInProgressLockTimeoutInUTC) {
            this.operationInProgressLockTimeoutInUTC = operationInProgressLockTimeoutInUTC;
            return this;
        }        public ResourceMoveDetailsResponse build() {
            return new ResourceMoveDetailsResponse(operationInProgress, operationInProgressLockTimeoutInUTC);
        }
    }
}
