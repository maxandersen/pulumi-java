// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.EnabledProtocolsResponse;
import io.pulumi.azurenative.media.inputs.StreamingPolicyContentKeysResponse;
import io.pulumi.azurenative.media.inputs.TrackSelectionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class for EnvelopeEncryption encryption scheme
 * 
 */
public final class EnvelopeEncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvelopeEncryptionResponse Empty = new EnvelopeEncryptionResponse();

    /**
     * Representing which tracks should not be encrypted
     * 
     */
    @Import(name="clearTracks")
      private final @Nullable List<TrackSelectionResponse> clearTracks;

    public List<TrackSelectionResponse> clearTracks() {
        return this.clearTracks == null ? List.of() : this.clearTracks;
    }

    /**
     * Representing default content key for each encryption scheme and separate content keys for specific tracks
     * 
     */
    @Import(name="contentKeys")
      private final @Nullable StreamingPolicyContentKeysResponse contentKeys;

    public Optional<StreamingPolicyContentKeysResponse> contentKeys() {
        return this.contentKeys == null ? Optional.empty() : Optional.ofNullable(this.contentKeys);
    }

    /**
     * Template for the URL of the custom service delivering keys to end user players.  Not required when using Azure Media Services for issuing keys.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @Import(name="customKeyAcquisitionUrlTemplate")
      private final @Nullable String customKeyAcquisitionUrlTemplate;

    public Optional<String> customKeyAcquisitionUrlTemplate() {
        return this.customKeyAcquisitionUrlTemplate == null ? Optional.empty() : Optional.ofNullable(this.customKeyAcquisitionUrlTemplate);
    }

    /**
     * Representing supported protocols
     * 
     */
    @Import(name="enabledProtocols")
      private final @Nullable EnabledProtocolsResponse enabledProtocols;

    public Optional<EnabledProtocolsResponse> enabledProtocols() {
        return this.enabledProtocols == null ? Optional.empty() : Optional.ofNullable(this.enabledProtocols);
    }

    public EnvelopeEncryptionResponse(
        @Nullable List<TrackSelectionResponse> clearTracks,
        @Nullable StreamingPolicyContentKeysResponse contentKeys,
        @Nullable String customKeyAcquisitionUrlTemplate,
        @Nullable EnabledProtocolsResponse enabledProtocols) {
        this.clearTracks = clearTracks;
        this.contentKeys = contentKeys;
        this.customKeyAcquisitionUrlTemplate = customKeyAcquisitionUrlTemplate;
        this.enabledProtocols = enabledProtocols;
    }

    private EnvelopeEncryptionResponse() {
        this.clearTracks = List.of();
        this.contentKeys = null;
        this.customKeyAcquisitionUrlTemplate = null;
        this.enabledProtocols = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvelopeEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TrackSelectionResponse> clearTracks;
        private @Nullable StreamingPolicyContentKeysResponse contentKeys;
        private @Nullable String customKeyAcquisitionUrlTemplate;
        private @Nullable EnabledProtocolsResponse enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvelopeEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clearTracks = defaults.clearTracks;
    	      this.contentKeys = defaults.contentKeys;
    	      this.customKeyAcquisitionUrlTemplate = defaults.customKeyAcquisitionUrlTemplate;
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
        public Builder customKeyAcquisitionUrlTemplate(@Nullable String customKeyAcquisitionUrlTemplate) {
            this.customKeyAcquisitionUrlTemplate = customKeyAcquisitionUrlTemplate;
            return this;
        }
        public Builder enabledProtocols(@Nullable EnabledProtocolsResponse enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }        public EnvelopeEncryptionResponse build() {
            return new EnvelopeEncryptionResponse(clearTracks, contentKeys, customKeyAcquisitionUrlTemplate, enabledProtocols);
        }
    }
}
