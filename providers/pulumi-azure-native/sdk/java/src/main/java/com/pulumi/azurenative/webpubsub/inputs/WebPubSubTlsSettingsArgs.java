// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.webpubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TLS settings for the resource
 * 
 */
public final class WebPubSubTlsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebPubSubTlsSettingsArgs Empty = new WebPubSubTlsSettingsArgs();

    /**
     * Request client certificate during TLS handshake if enabled
     * 
     */
    @Import(name="clientCertEnabled")
    private @Nullable Output<Boolean> clientCertEnabled;

    /**
     * @return Request client certificate during TLS handshake if enabled
     * 
     */
    public Optional<Output<Boolean>> clientCertEnabled() {
        return Optional.ofNullable(this.clientCertEnabled);
    }

    private WebPubSubTlsSettingsArgs() {}

    private WebPubSubTlsSettingsArgs(WebPubSubTlsSettingsArgs $) {
        this.clientCertEnabled = $.clientCertEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebPubSubTlsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebPubSubTlsSettingsArgs $;

        public Builder() {
            $ = new WebPubSubTlsSettingsArgs();
        }

        public Builder(WebPubSubTlsSettingsArgs defaults) {
            $ = new WebPubSubTlsSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientCertEnabled Request client certificate during TLS handshake if enabled
         * 
         * @return builder
         * 
         */
        public Builder clientCertEnabled(@Nullable Output<Boolean> clientCertEnabled) {
            $.clientCertEnabled = clientCertEnabled;
            return this;
        }

        /**
         * @param clientCertEnabled Request client certificate during TLS handshake if enabled
         * 
         * @return builder
         * 
         */
        public Builder clientCertEnabled(Boolean clientCertEnabled) {
            return clientCertEnabled(Output.of(clientCertEnabled));
        }

        public WebPubSubTlsSettingsArgs build() {
            $.clientCertEnabled = Codegen.booleanProp("clientCertEnabled").output().arg($.clientCertEnabled).def(true).getNullable();
            return $;
        }
    }

}
