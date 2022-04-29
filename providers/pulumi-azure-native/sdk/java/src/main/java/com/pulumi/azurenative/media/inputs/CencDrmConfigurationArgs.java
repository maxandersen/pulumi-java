// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.StreamingPolicyPlayReadyConfigurationArgs;
import com.pulumi.azurenative.media.inputs.StreamingPolicyWidevineConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify DRM configurations of CommonEncryptionCenc scheme in Streaming Policy
 * 
 */
public final class CencDrmConfigurationArgs extends ResourceArgs {

    public static final CencDrmConfigurationArgs Empty = new CencDrmConfigurationArgs();

    /**
     * PlayReady configurations
     * 
     */
    @Import(name="playReady")
    private @Nullable Output<StreamingPolicyPlayReadyConfigurationArgs> playReady;

    /**
     * @return PlayReady configurations
     * 
     */
    public Optional<Output<StreamingPolicyPlayReadyConfigurationArgs>> playReady() {
        return Optional.ofNullable(this.playReady);
    }

    /**
     * Widevine configurations
     * 
     */
    @Import(name="widevine")
    private @Nullable Output<StreamingPolicyWidevineConfigurationArgs> widevine;

    /**
     * @return Widevine configurations
     * 
     */
    public Optional<Output<StreamingPolicyWidevineConfigurationArgs>> widevine() {
        return Optional.ofNullable(this.widevine);
    }

    private CencDrmConfigurationArgs() {}

    private CencDrmConfigurationArgs(CencDrmConfigurationArgs $) {
        this.playReady = $.playReady;
        this.widevine = $.widevine;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CencDrmConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CencDrmConfigurationArgs $;

        public Builder() {
            $ = new CencDrmConfigurationArgs();
        }

        public Builder(CencDrmConfigurationArgs defaults) {
            $ = new CencDrmConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param playReady PlayReady configurations
         * 
         * @return builder
         * 
         */
        public Builder playReady(@Nullable Output<StreamingPolicyPlayReadyConfigurationArgs> playReady) {
            $.playReady = playReady;
            return this;
        }

        /**
         * @param playReady PlayReady configurations
         * 
         * @return builder
         * 
         */
        public Builder playReady(StreamingPolicyPlayReadyConfigurationArgs playReady) {
            return playReady(Output.of(playReady));
        }

        /**
         * @param widevine Widevine configurations
         * 
         * @return builder
         * 
         */
        public Builder widevine(@Nullable Output<StreamingPolicyWidevineConfigurationArgs> widevine) {
            $.widevine = widevine;
            return this;
        }

        /**
         * @param widevine Widevine configurations
         * 
         * @return builder
         * 
         */
        public Builder widevine(StreamingPolicyWidevineConfigurationArgs widevine) {
            return widevine(Output.of(widevine));
        }

        public CencDrmConfigurationArgs build() {
            return $;
        }
    }

}
