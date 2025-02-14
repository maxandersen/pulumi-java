// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.azurenative.migrate.outputs.JobStatusResponse;
import com.pulumi.azurenative.migrate.outputs.MoveResourceErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MoveResourcePropertiesResponseMoveStatus {
    /**
     * @return An error response from the azure resource mover service.
     * 
     */
    private final @Nullable MoveResourceErrorResponse errors;
    /**
     * @return Defines the job status.
     * 
     */
    private final @Nullable JobStatusResponse jobStatus;
    /**
     * @return Defines the MoveResource states.
     * 
     */
    private final String moveState;

    @CustomType.Constructor
    private MoveResourcePropertiesResponseMoveStatus(
        @CustomType.Parameter("errors") @Nullable MoveResourceErrorResponse errors,
        @CustomType.Parameter("jobStatus") @Nullable JobStatusResponse jobStatus,
        @CustomType.Parameter("moveState") String moveState) {
        this.errors = errors;
        this.jobStatus = jobStatus;
        this.moveState = moveState;
    }

    /**
     * @return An error response from the azure resource mover service.
     * 
     */
    public Optional<MoveResourceErrorResponse> errors() {
        return Optional.ofNullable(this.errors);
    }
    /**
     * @return Defines the job status.
     * 
     */
    public Optional<JobStatusResponse> jobStatus() {
        return Optional.ofNullable(this.jobStatus);
    }
    /**
     * @return Defines the MoveResource states.
     * 
     */
    public String moveState() {
        return this.moveState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourcePropertiesResponseMoveStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MoveResourceErrorResponse errors;
        private @Nullable JobStatusResponse jobStatus;
        private String moveState;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourcePropertiesResponseMoveStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.jobStatus = defaults.jobStatus;
    	      this.moveState = defaults.moveState;
        }

        public Builder errors(@Nullable MoveResourceErrorResponse errors) {
            this.errors = errors;
            return this;
        }
        public Builder jobStatus(@Nullable JobStatusResponse jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Builder moveState(String moveState) {
            this.moveState = Objects.requireNonNull(moveState);
            return this;
        }        public MoveResourcePropertiesResponseMoveStatus build() {
            return new MoveResourcePropertiesResponseMoveStatus(errors, jobStatus, moveState);
        }
    }
}
