// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.WebhookConversion;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomResourceConversion {
    private final String strategy;
    private final @Nullable WebhookConversion webhook;

    @OutputCustomType.Constructor({"strategy","webhook"})
    private CustomResourceConversion(
        String strategy,
        @Nullable WebhookConversion webhook) {
        this.strategy = Objects.requireNonNull(strategy);
        this.webhook = webhook;
    }

    public String getStrategy() {
        return this.strategy;
    }
    public Optional<WebhookConversion> getWebhook() {
        return Optional.ofNullable(this.webhook);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceConversion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String strategy;
        private @Nullable WebhookConversion webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceConversion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strategy = defaults.strategy;
    	      this.webhook = defaults.webhook;
        }

        public Builder setStrategy(String strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }

        public Builder setWebhook(@Nullable WebhookConversion webhook) {
            this.webhook = webhook;
            return this;
        }

        public CustomResourceConversion build() {
            return new CustomResourceConversion(strategy, webhook);
        }
    }
}
