// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the retry policy for an event subscription.
 * 
 */
public final class RetryPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final RetryPolicyResponse Empty = new RetryPolicyResponse();

    /**
     * Time To Live (in minutes) for events.
     * 
     */
    @Import(name="eventTimeToLiveInMinutes")
    private @Nullable Integer eventTimeToLiveInMinutes;

    public Optional<Integer> eventTimeToLiveInMinutes() {
        return Optional.ofNullable(this.eventTimeToLiveInMinutes);
    }

    /**
     * Maximum number of delivery retry attempts for events.
     * 
     */
    @Import(name="maxDeliveryAttempts")
    private @Nullable Integer maxDeliveryAttempts;

    public Optional<Integer> maxDeliveryAttempts() {
        return Optional.ofNullable(this.maxDeliveryAttempts);
    }

    private RetryPolicyResponse() {}

    private RetryPolicyResponse(RetryPolicyResponse $) {
        this.eventTimeToLiveInMinutes = $.eventTimeToLiveInMinutes;
        this.maxDeliveryAttempts = $.maxDeliveryAttempts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetryPolicyResponse $;

        public Builder() {
            $ = new RetryPolicyResponse();
        }

        public Builder(RetryPolicyResponse defaults) {
            $ = new RetryPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder eventTimeToLiveInMinutes(@Nullable Integer eventTimeToLiveInMinutes) {
            $.eventTimeToLiveInMinutes = eventTimeToLiveInMinutes;
            return this;
        }

        public Builder maxDeliveryAttempts(@Nullable Integer maxDeliveryAttempts) {
            $.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }

        public RetryPolicyResponse build() {
            return $;
        }
    }

}
