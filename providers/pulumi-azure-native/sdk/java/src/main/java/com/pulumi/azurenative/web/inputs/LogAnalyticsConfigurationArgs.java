// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogAnalyticsConfigurationArgs extends ResourceArgs {

    public static final LogAnalyticsConfigurationArgs Empty = new LogAnalyticsConfigurationArgs();

    @Import(name="customerId")
    private @Nullable Output<String> customerId;

    public Optional<Output<String>> customerId() {
        return Optional.ofNullable(this.customerId);
    }

    @Import(name="sharedKey")
    private @Nullable Output<String> sharedKey;

    public Optional<Output<String>> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }

    private LogAnalyticsConfigurationArgs() {}

    private LogAnalyticsConfigurationArgs(LogAnalyticsConfigurationArgs $) {
        this.customerId = $.customerId;
        this.sharedKey = $.sharedKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAnalyticsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAnalyticsConfigurationArgs $;

        public Builder() {
            $ = new LogAnalyticsConfigurationArgs();
        }

        public Builder(LogAnalyticsConfigurationArgs defaults) {
            $ = new LogAnalyticsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder customerId(@Nullable Output<String> customerId) {
            $.customerId = customerId;
            return this;
        }

        public Builder customerId(String customerId) {
            return customerId(Output.of(customerId));
        }

        public Builder sharedKey(@Nullable Output<String> sharedKey) {
            $.sharedKey = sharedKey;
            return this;
        }

        public Builder sharedKey(String sharedKey) {
            return sharedKey(Output.of(sharedKey));
        }

        public LogAnalyticsConfigurationArgs build() {
            return $;
        }
    }

}
