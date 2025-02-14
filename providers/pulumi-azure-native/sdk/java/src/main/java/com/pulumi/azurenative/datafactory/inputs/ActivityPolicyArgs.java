// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
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
public final class ActivityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActivityPolicyArgs Empty = new ActivityPolicyArgs();

    /**
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="retry")
    private @Nullable Output<Object> retry;

    /**
     * @return Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Output<Object>> retry() {
        return Optional.ofNullable(this.retry);
    }

    /**
     * Interval between each retry attempt (in seconds). The default is 30 sec.
     * 
     */
    @Import(name="retryIntervalInSeconds")
    private @Nullable Output<Integer> retryIntervalInSeconds;

    /**
     * @return Interval between each retry attempt (in seconds). The default is 30 sec.
     * 
     */
    public Optional<Output<Integer>> retryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }

    /**
     * When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    @Import(name="secureInput")
    private @Nullable Output<Boolean> secureInput;

    /**
     * @return When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    public Optional<Output<Boolean>> secureInput() {
        return Optional.ofNullable(this.secureInput);
    }

    /**
     * When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    @Import(name="secureOutput")
    private @Nullable Output<Boolean> secureOutput;

    /**
     * @return When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    public Optional<Output<Boolean>> secureOutput() {
        return Optional.ofNullable(this.secureOutput);
    }

    /**
     * Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Object> timeout;

    /**
     * @return Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ActivityPolicyArgs() {}

    private ActivityPolicyArgs(ActivityPolicyArgs $) {
        this.retry = $.retry;
        this.retryIntervalInSeconds = $.retryIntervalInSeconds;
        this.secureInput = $.secureInput;
        this.secureOutput = $.secureOutput;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivityPolicyArgs $;

        public Builder() {
            $ = new ActivityPolicyArgs();
        }

        public Builder(ActivityPolicyArgs defaults) {
            $ = new ActivityPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retry Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder retry(@Nullable Output<Object> retry) {
            $.retry = retry;
            return this;
        }

        /**
         * @param retry Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder retry(Object retry) {
            return retry(Output.of(retry));
        }

        /**
         * @param retryIntervalInSeconds Interval between each retry attempt (in seconds). The default is 30 sec.
         * 
         * @return builder
         * 
         */
        public Builder retryIntervalInSeconds(@Nullable Output<Integer> retryIntervalInSeconds) {
            $.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }

        /**
         * @param retryIntervalInSeconds Interval between each retry attempt (in seconds). The default is 30 sec.
         * 
         * @return builder
         * 
         */
        public Builder retryIntervalInSeconds(Integer retryIntervalInSeconds) {
            return retryIntervalInSeconds(Output.of(retryIntervalInSeconds));
        }

        /**
         * @param secureInput When set to true, Input from activity is considered as secure and will not be logged to monitoring.
         * 
         * @return builder
         * 
         */
        public Builder secureInput(@Nullable Output<Boolean> secureInput) {
            $.secureInput = secureInput;
            return this;
        }

        /**
         * @param secureInput When set to true, Input from activity is considered as secure and will not be logged to monitoring.
         * 
         * @return builder
         * 
         */
        public Builder secureInput(Boolean secureInput) {
            return secureInput(Output.of(secureInput));
        }

        /**
         * @param secureOutput When set to true, Output from activity is considered as secure and will not be logged to monitoring.
         * 
         * @return builder
         * 
         */
        public Builder secureOutput(@Nullable Output<Boolean> secureOutput) {
            $.secureOutput = secureOutput;
            return this;
        }

        /**
         * @param secureOutput When set to true, Output from activity is considered as secure and will not be logged to monitoring.
         * 
         * @return builder
         * 
         */
        public Builder secureOutput(Boolean secureOutput) {
            return secureOutput(Output.of(secureOutput));
        }

        /**
         * @param timeout Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Object> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder timeout(Object timeout) {
            return timeout(Output.of(timeout));
        }

        public ActivityPolicyArgs build() {
            return $;
        }
    }

}
