// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub GcmCredential.
 * 
 */
public final class GcmCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final GcmCredentialResponse Empty = new GcmCredentialResponse();

    /**
     * The FCM legacy endpoint. Default value is &#39;https://fcm.googleapis.com/fcm/send&#39;
     * 
     */
    @Import(name="gcmEndpoint")
    private @Nullable String gcmEndpoint;

    public Optional<String> gcmEndpoint() {
        return Optional.ofNullable(this.gcmEndpoint);
    }

    /**
     * The Google API key.
     * 
     */
    @Import(name="googleApiKey")
    private @Nullable String googleApiKey;

    public Optional<String> googleApiKey() {
        return Optional.ofNullable(this.googleApiKey);
    }

    private GcmCredentialResponse() {}

    private GcmCredentialResponse(GcmCredentialResponse $) {
        this.gcmEndpoint = $.gcmEndpoint;
        this.googleApiKey = $.googleApiKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcmCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcmCredentialResponse $;

        public Builder() {
            $ = new GcmCredentialResponse();
        }

        public Builder(GcmCredentialResponse defaults) {
            $ = new GcmCredentialResponse(Objects.requireNonNull(defaults));
        }

        public Builder gcmEndpoint(@Nullable String gcmEndpoint) {
            $.gcmEndpoint = gcmEndpoint;
            return this;
        }

        public Builder googleApiKey(@Nullable String googleApiKey) {
            $.googleApiKey = googleApiKey;
            return this;
        }

        public GcmCredentialResponse build() {
            return $;
        }
    }

}
