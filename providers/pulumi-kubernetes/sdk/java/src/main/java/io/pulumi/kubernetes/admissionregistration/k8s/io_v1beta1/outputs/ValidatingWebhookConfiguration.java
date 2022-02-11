// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.outputs.ValidatingWebhook;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ValidatingWebhookConfiguration {
    private final @Nullable String apiVersion;
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    private final @Nullable List<ValidatingWebhook> webhooks;

    @OutputCustomType.Constructor({"apiVersion","kind","metadata","webhooks"})
    private ValidatingWebhookConfiguration(
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable ObjectMeta metadata,
        @Nullable List<ValidatingWebhook> webhooks) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.webhooks = webhooks;
    }

    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public List<ValidatingWebhook> getWebhooks() {
        return this.webhooks == null ? List.of() : this.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidatingWebhookConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<ValidatingWebhook> webhooks;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidatingWebhookConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.webhooks = defaults.webhooks;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setWebhooks(@Nullable List<ValidatingWebhook> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public ValidatingWebhookConfiguration build() {
            return new ValidatingWebhookConfiguration(apiVersion, kind, metadata, webhooks);
        }
    }
}
