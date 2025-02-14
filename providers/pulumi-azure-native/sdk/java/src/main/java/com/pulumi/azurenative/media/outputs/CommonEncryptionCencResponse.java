// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.CencDrmConfigurationResponse;
import com.pulumi.azurenative.media.outputs.EnabledProtocolsResponse;
import com.pulumi.azurenative.media.outputs.StreamingPolicyContentKeysResponse;
import com.pulumi.azurenative.media.outputs.TrackSelectionResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CommonEncryptionCencResponse {
    /**
     * @return Representing which tracks should not be encrypted
     * 
     */
    private final @Nullable List<TrackSelectionResponse> clearTracks;
    /**
     * @return Representing default content key for each encryption scheme and separate content keys for specific tracks
     * 
     */
    private final @Nullable StreamingPolicyContentKeysResponse contentKeys;
    /**
     * @return Configuration of DRMs for CommonEncryptionCenc encryption scheme
     * 
     */
    private final @Nullable CencDrmConfigurationResponse drm;
    /**
     * @return Representing supported protocols
     * 
     */
    private final @Nullable EnabledProtocolsResponse enabledProtocols;

    @CustomType.Constructor
    private CommonEncryptionCencResponse(
        @CustomType.Parameter("clearTracks") @Nullable List<TrackSelectionResponse> clearTracks,
        @CustomType.Parameter("contentKeys") @Nullable StreamingPolicyContentKeysResponse contentKeys,
        @CustomType.Parameter("drm") @Nullable CencDrmConfigurationResponse drm,
        @CustomType.Parameter("enabledProtocols") @Nullable EnabledProtocolsResponse enabledProtocols) {
        this.clearTracks = clearTracks;
        this.contentKeys = contentKeys;
        this.drm = drm;
        this.enabledProtocols = enabledProtocols;
    }

    /**
     * @return Representing which tracks should not be encrypted
     * 
     */
    public List<TrackSelectionResponse> clearTracks() {
        return this.clearTracks == null ? List.of() : this.clearTracks;
    }
    /**
     * @return Representing default content key for each encryption scheme and separate content keys for specific tracks
     * 
     */
    public Optional<StreamingPolicyContentKeysResponse> contentKeys() {
        return Optional.ofNullable(this.contentKeys);
    }
    /**
     * @return Configuration of DRMs for CommonEncryptionCenc encryption scheme
     * 
     */
    public Optional<CencDrmConfigurationResponse> drm() {
        return Optional.ofNullable(this.drm);
    }
    /**
     * @return Representing supported protocols
     * 
     */
    public Optional<EnabledProtocolsResponse> enabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonEncryptionCencResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TrackSelectionResponse> clearTracks;
        private @Nullable StreamingPolicyContentKeysResponse contentKeys;
        private @Nullable CencDrmConfigurationResponse drm;
        private @Nullable EnabledProtocolsResponse enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonEncryptionCencResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clearTracks = defaults.clearTracks;
    	      this.contentKeys = defaults.contentKeys;
    	      this.drm = defaults.drm;
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        public Builder clearTracks(@Nullable List<TrackSelectionResponse> clearTracks) {
            this.clearTracks = clearTracks;
            return this;
        }
        public Builder clearTracks(TrackSelectionResponse... clearTracks) {
            return clearTracks(List.of(clearTracks));
        }
        public Builder contentKeys(@Nullable StreamingPolicyContentKeysResponse contentKeys) {
            this.contentKeys = contentKeys;
            return this;
        }
        public Builder drm(@Nullable CencDrmConfigurationResponse drm) {
            this.drm = drm;
            return this;
        }
        public Builder enabledProtocols(@Nullable EnabledProtocolsResponse enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }        public CommonEncryptionCencResponse build() {
            return new CommonEncryptionCencResponse(clearTracks, contentKeys, drm, enabledProtocols);
        }
    }
}
