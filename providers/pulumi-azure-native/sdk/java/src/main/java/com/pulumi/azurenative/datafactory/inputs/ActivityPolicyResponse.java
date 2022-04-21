// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execution policy for an activity.
 * 
 */
public final class ActivityPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ActivityPolicyResponse Empty = new ActivityPolicyResponse();

    /**
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="retry")
    private @Nullable Object retry;

    public Optional<Object> retry() {
        return Optional.ofNullable(this.retry);
    }

    /**
     * Interval between each retry attempt (in seconds). The default is 30 sec.
     * 
     */
    @Import(name="retryIntervalInSeconds")
    private @Nullable Integer retryIntervalInSeconds;

    public Optional<Integer> retryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }

    /**
     * When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    @Import(name="secureInput")
    private @Nullable Boolean secureInput;

    public Optional<Boolean> secureInput() {
        return Optional.ofNullable(this.secureInput);
    }

    /**
     * When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    @Import(name="secureOutput")
    private @Nullable Boolean secureOutput;

    public Optional<Boolean> secureOutput() {
        return Optional.ofNullable(this.secureOutput);
    }

    /**
     * Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="timeout")
    private @Nullable Object timeout;

    public Optional<Object> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ActivityPolicyResponse() {}

    private ActivityPolicyResponse(ActivityPolicyResponse $) {
        this.retry = $.retry;
        this.retryIntervalInSeconds = $.retryIntervalInSeconds;
        this.secureInput = $.secureInput;
        this.secureOutput = $.secureOutput;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivityPolicyResponse $;

        public Builder() {
            $ = new ActivityPolicyResponse();
        }

        public Builder(ActivityPolicyResponse defaults) {
            $ = new ActivityPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder retry(@Nullable Object retry) {
            $.retry = retry;
            return this;
        }

        public Builder retryIntervalInSeconds(@Nullable Integer retryIntervalInSeconds) {
            $.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        public Builder secureInput(@Nullable Boolean secureInput) {
            $.secureInput = secureInput;
            return this;
        }

        public Builder secureOutput(@Nullable Boolean secureOutput) {
            $.secureOutput = secureOutput;
            return this;
        }

        public Builder timeout(@Nullable Object timeout) {
            $.timeout = timeout;
            return this;
        }

        public ActivityPolicyResponse build() {
            return $;
        }
    }

}
