// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The error/warning message due to which the device is ineligible as a failover target device.
 * 
 */
public final class TargetEligibilityErrorMessageResponse extends com.pulumi.resources.InvokeArgs {

    public static final TargetEligibilityErrorMessageResponse Empty = new TargetEligibilityErrorMessageResponse();

    /**
     * The localized error message stating the reason why the device is not eligible as a target device.
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> message() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * The localized resolution message for the error.
     * 
     */
    @Import(name="resolution")
      private final @Nullable String resolution;

    public Optional<String> resolution() {
        return this.resolution == null ? Optional.empty() : Optional.ofNullable(this.resolution);
    }

    /**
     * The result code for the error, due to which the device does not qualify as a failover target device.
     * 
     */
    @Import(name="resultCode")
      private final @Nullable String resultCode;

    public Optional<String> resultCode() {
        return this.resultCode == null ? Optional.empty() : Optional.ofNullable(this.resultCode);
    }

    public TargetEligibilityErrorMessageResponse(
        @Nullable String message,
        @Nullable String resolution,
        @Nullable String resultCode) {
        this.message = message;
        this.resolution = resolution;
        this.resultCode = resultCode;
    }

    private TargetEligibilityErrorMessageResponse() {
        this.message = null;
        this.resolution = null;
        this.resultCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetEligibilityErrorMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String resolution;
        private @Nullable String resultCode;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetEligibilityErrorMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.resolution = defaults.resolution;
    	      this.resultCode = defaults.resultCode;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder resolution(@Nullable String resolution) {
            this.resolution = resolution;
            return this;
        }
        public Builder resultCode(@Nullable String resultCode) {
            this.resultCode = resultCode;
            return this;
        }        public TargetEligibilityErrorMessageResponse build() {
            return new TargetEligibilityErrorMessageResponse(message, resolution, resultCode);
        }
    }
}
