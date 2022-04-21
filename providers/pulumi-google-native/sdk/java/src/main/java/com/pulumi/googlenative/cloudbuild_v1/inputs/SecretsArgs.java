// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.InlineSecretArgs;
import com.pulumi.googlenative.cloudbuild_v1.inputs.SecretManagerSecretArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Secrets and secret environment variables.
 * 
 */
public final class SecretsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretsArgs Empty = new SecretsArgs();

    /**
     * Secrets encrypted with KMS key and the associated secret environment variable.
     * 
     */
    @Import(name="inline")
    private @Nullable Output<List<InlineSecretArgs>> inline;

    public Optional<Output<List<InlineSecretArgs>>> inline() {
        return Optional.ofNullable(this.inline);
    }

    /**
     * Secrets in Secret Manager and associated secret environment variable.
     * 
     */
    @Import(name="secretManager")
    private @Nullable Output<List<SecretManagerSecretArgs>> secretManager;

    public Optional<Output<List<SecretManagerSecretArgs>>> secretManager() {
        return Optional.ofNullable(this.secretManager);
    }

    private SecretsArgs() {}

    private SecretsArgs(SecretsArgs $) {
        this.inline = $.inline;
        this.secretManager = $.secretManager;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretsArgs $;

        public Builder() {
            $ = new SecretsArgs();
        }

        public Builder(SecretsArgs defaults) {
            $ = new SecretsArgs(Objects.requireNonNull(defaults));
        }

        public Builder inline(@Nullable Output<List<InlineSecretArgs>> inline) {
            $.inline = inline;
            return this;
        }

        public Builder inline(List<InlineSecretArgs> inline) {
            return inline(Output.of(inline));
        }

        public Builder inline(InlineSecretArgs... inline) {
            return inline(List.of(inline));
        }

        public Builder secretManager(@Nullable Output<List<SecretManagerSecretArgs>> secretManager) {
            $.secretManager = secretManager;
            return this;
        }

        public Builder secretManager(List<SecretManagerSecretArgs> secretManager) {
            return secretManager(Output.of(secretManager));
        }

        public Builder secretManager(SecretManagerSecretArgs... secretManager) {
            return secretManager(List.of(secretManager));
        }

        public SecretsArgs build() {
            return $;
        }
    }

}
