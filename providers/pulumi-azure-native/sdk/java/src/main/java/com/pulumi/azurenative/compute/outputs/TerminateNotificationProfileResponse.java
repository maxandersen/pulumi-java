// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TerminateNotificationProfileResponse {
    /**
     * Specifies whether the Terminate Scheduled event is enabled or disabled.
     * 
     */
    private final @Nullable Boolean enable;
    /**
     * Configurable length of time a Virtual Machine being deleted will have to potentially approve the Terminate Scheduled Event before the event is auto approved (timed out). The configuration must be specified in ISO 8601 format, the default value is 5 minutes (PT5M)
     * 
     */
    private final @Nullable String notBeforeTimeout;

    @CustomType.Constructor
    private TerminateNotificationProfileResponse(
        @CustomType.Parameter("enable") @Nullable Boolean enable,
        @CustomType.Parameter("notBeforeTimeout") @Nullable String notBeforeTimeout) {
        this.enable = enable;
        this.notBeforeTimeout = notBeforeTimeout;
    }

    /**
     * Specifies whether the Terminate Scheduled event is enabled or disabled.
     * 
    */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * Configurable length of time a Virtual Machine being deleted will have to potentially approve the Terminate Scheduled Event before the event is auto approved (timed out). The configuration must be specified in ISO 8601 format, the default value is 5 minutes (PT5M)
     * 
    */
    public Optional<String> notBeforeTimeout() {
        return Optional.ofNullable(this.notBeforeTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TerminateNotificationProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enable;
        private @Nullable String notBeforeTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TerminateNotificationProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.notBeforeTimeout = defaults.notBeforeTimeout;
        }

        public Builder enable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Builder notBeforeTimeout(@Nullable String notBeforeTimeout) {
            this.notBeforeTimeout = notBeforeTimeout;
            return this;
        }        public TerminateNotificationProfileResponse build() {
            return new TerminateNotificationProfileResponse(enable, notBeforeTimeout);
        }
    }
}
