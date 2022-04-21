// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AdmChannelState extends com.pulumi.resources.ResourceArgs {

    public static final AdmChannelState Empty = new AdmChannelState();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Client ID (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Client Secret (part of OAuth Credentials) obtained via Amazon Developer Account.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private AdmChannelState() {}

    private AdmChannelState(AdmChannelState $) {
        this.applicationId = $.applicationId;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdmChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdmChannelState $;

        public Builder() {
            $ = new AdmChannelState();
        }

        public Builder(AdmChannelState defaults) {
            $ = new AdmChannelState(Objects.requireNonNull(defaults));
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public AdmChannelState build() {
            return $;
        }
    }

}
