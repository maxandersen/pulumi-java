// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.StreamingPolicyPlayReadyConfigurationResponse;
import com.pulumi.azurenative.media.inputs.StreamingPolicyWidevineConfigurationResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify DRM configurations of CommonEncryptionCenc scheme in Streaming Policy
 * 
 */
public final class CencDrmConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final CencDrmConfigurationResponse Empty = new CencDrmConfigurationResponse();

    /**
     * PlayReady configurations
     * 
     */
    @Import(name="playReady")
    private @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;

    public Optional<StreamingPolicyPlayReadyConfigurationResponse> playReady() {
        return Optional.ofNullable(this.playReady);
    }

    /**
     * Widevine configurations
     * 
     */
    @Import(name="widevine")
    private @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

    public Optional<StreamingPolicyWidevineConfigurationResponse> widevine() {
        return Optional.ofNullable(this.widevine);
    }

    private CencDrmConfigurationResponse() {}

    private CencDrmConfigurationResponse(CencDrmConfigurationResponse $) {
        this.playReady = $.playReady;
        this.widevine = $.widevine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CencDrmConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CencDrmConfigurationResponse $;

        public Builder() {
            $ = new CencDrmConfigurationResponse();
        }

        public Builder(CencDrmConfigurationResponse defaults) {
            $ = new CencDrmConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder playReady(@Nullable StreamingPolicyPlayReadyConfigurationResponse playReady) {
            $.playReady = playReady;
            return this;
        }

        public Builder widevine(@Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
            $.widevine = widevine;
            return this;
        }

        public CencDrmConfigurationResponse build() {
            return $;
        }
    }

}
