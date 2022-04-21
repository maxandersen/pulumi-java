// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountThrottleSettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountThrottleSettingsGetArgs Empty = new AccountThrottleSettingsGetArgs();

    /**
     * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    @Import(name="burstLimit")
    private @Nullable Output<Integer> burstLimit;

    public Optional<Output<Integer>> burstLimit() {
        return Optional.ofNullable(this.burstLimit);
    }

    /**
     * The number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    @Import(name="rateLimit")
    private @Nullable Output<Double> rateLimit;

    public Optional<Output<Double>> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }

    private AccountThrottleSettingsGetArgs() {}

    private AccountThrottleSettingsGetArgs(AccountThrottleSettingsGetArgs $) {
        this.burstLimit = $.burstLimit;
        this.rateLimit = $.rateLimit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountThrottleSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountThrottleSettingsGetArgs $;

        public Builder() {
            $ = new AccountThrottleSettingsGetArgs();
        }

        public Builder(AccountThrottleSettingsGetArgs defaults) {
            $ = new AccountThrottleSettingsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder burstLimit(@Nullable Output<Integer> burstLimit) {
            $.burstLimit = burstLimit;
            return this;
        }

        public Builder burstLimit(Integer burstLimit) {
            return burstLimit(Output.of(burstLimit));
        }

        public Builder rateLimit(@Nullable Output<Double> rateLimit) {
            $.rateLimit = rateLimit;
            return this;
        }

        public Builder rateLimit(Double rateLimit) {
            return rateLimit(Output.of(rateLimit));
        }

        public AccountThrottleSettingsGetArgs build() {
            return $;
        }
    }

}
