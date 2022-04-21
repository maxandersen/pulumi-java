// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TriggerWebhookConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerWebhookConfigGetArgs Empty = new TriggerWebhookConfigGetArgs();

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    @Import(name="secret", required=true)
    private Output<String> secret;

    public Output<String> secret() {
        return this.secret;
    }

    /**
     * - 
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private TriggerWebhookConfigGetArgs() {}

    private TriggerWebhookConfigGetArgs(TriggerWebhookConfigGetArgs $) {
        this.secret = $.secret;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerWebhookConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerWebhookConfigGetArgs $;

        public Builder() {
            $ = new TriggerWebhookConfigGetArgs();
        }

        public Builder(TriggerWebhookConfigGetArgs defaults) {
            $ = new TriggerWebhookConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder secret(Output<String> secret) {
            $.secret = secret;
            return this;
        }

        public Builder secret(String secret) {
            return secret(Output.of(secret));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public TriggerWebhookConfigGetArgs build() {
            $.secret = Objects.requireNonNull($.secret, "expected parameter 'secret' to be non-null");
            return $;
        }
    }

}
