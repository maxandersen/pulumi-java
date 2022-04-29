// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execution policy for an activity.
 * 
 */
public final class RetryPolicyArgs extends ResourceArgs {

    public static final RetryPolicyArgs Empty = new RetryPolicyArgs();

    /**
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Object> count;

    /**
     * @return Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Output<Object>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Interval between retries in seconds. Default is 30.
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Output<Integer> intervalInSeconds;

    /**
     * @return Interval between retries in seconds. Default is 30.
     * 
     */
    public Optional<Output<Integer>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    private RetryPolicyArgs() {}

    private RetryPolicyArgs(RetryPolicyArgs $) {
        this.count = $.count;
        this.intervalInSeconds = $.intervalInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetryPolicyArgs $;

        public Builder() {
            $ = new RetryPolicyArgs();
        }

        public Builder(RetryPolicyArgs defaults) {
            $ = new RetryPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Object> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder count(Object count) {
            return count(Output.of(count));
        }

        /**
         * @param intervalInSeconds Interval between retries in seconds. Default is 30.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        /**
         * @param intervalInSeconds Interval between retries in seconds. Default is 30.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        public RetryPolicyArgs build() {
            return $;
        }
    }

}
