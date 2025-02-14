// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleDestinationHttpUrlDestinationSummary {
    private final @Nullable String confirmationUrl;

    @CustomType.Constructor
    private TopicRuleDestinationHttpUrlDestinationSummary(@CustomType.Parameter("confirmationUrl") @Nullable String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    public Optional<String> confirmationUrl() {
        return Optional.ofNullable(this.confirmationUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDestinationHttpUrlDestinationSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String confirmationUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDestinationHttpUrlDestinationSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confirmationUrl = defaults.confirmationUrl;
        }

        public Builder confirmationUrl(@Nullable String confirmationUrl) {
            this.confirmationUrl = confirmationUrl;
            return this;
        }        public TopicRuleDestinationHttpUrlDestinationSummary build() {
            return new TopicRuleDestinationHttpUrlDestinationSummary(confirmationUrl);
        }
    }
}
