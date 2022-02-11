// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1.outputs.ServiceReference;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebhookClientConfig {
    private final @Nullable String caBundle;
    private final @Nullable ServiceReference service;
    private final @Nullable String url;

    @OutputCustomType.Constructor({"caBundle","service","url"})
    private WebhookClientConfig(
        @Nullable String caBundle,
        @Nullable ServiceReference service,
        @Nullable String url) {
        this.caBundle = caBundle;
        this.service = service;
        this.url = url;
    }

    public Optional<String> getCaBundle() {
        return Optional.ofNullable(this.caBundle);
    }
    public Optional<ServiceReference> getService() {
        return Optional.ofNullable(this.service);
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookClientConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caBundle;
        private @Nullable ServiceReference service;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookClientConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundle = defaults.caBundle;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        public Builder setCaBundle(@Nullable String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        public Builder setService(@Nullable ServiceReference service) {
            this.service = service;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public WebhookClientConfig build() {
            return new WebhookClientConfig(caBundle, service, url);
        }
    }
}
