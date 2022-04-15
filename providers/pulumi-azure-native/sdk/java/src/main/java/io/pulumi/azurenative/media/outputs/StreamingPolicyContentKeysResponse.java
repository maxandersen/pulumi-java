// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.DefaultKeyResponse;
import io.pulumi.azurenative.media.outputs.StreamingPolicyContentKeyResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingPolicyContentKeysResponse {
    /**
     * Default content key for an encryption scheme
     * 
     */
    private final @Nullable DefaultKeyResponse defaultKey;
    /**
     * Representing tracks needs separate content key
     * 
     */
    private final @Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings;

    @CustomType.Constructor
    private StreamingPolicyContentKeysResponse(
        @CustomType.Parameter("defaultKey") @Nullable DefaultKeyResponse defaultKey,
        @CustomType.Parameter("keyToTrackMappings") @Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings) {
        this.defaultKey = defaultKey;
        this.keyToTrackMappings = keyToTrackMappings;
    }

    /**
     * Default content key for an encryption scheme
     * 
    */
    public Optional<DefaultKeyResponse> defaultKey() {
        return Optional.ofNullable(this.defaultKey);
    }
    /**
     * Representing tracks needs separate content key
     * 
    */
    public List<StreamingPolicyContentKeyResponse> keyToTrackMappings() {
        return this.keyToTrackMappings == null ? List.of() : this.keyToTrackMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyContentKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DefaultKeyResponse defaultKey;
        private @Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyContentKeysResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKey = defaults.defaultKey;
    	      this.keyToTrackMappings = defaults.keyToTrackMappings;
        }

        public Builder defaultKey(@Nullable DefaultKeyResponse defaultKey) {
            this.defaultKey = defaultKey;
            return this;
        }
        public Builder keyToTrackMappings(@Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings) {
            this.keyToTrackMappings = keyToTrackMappings;
            return this;
        }
        public Builder keyToTrackMappings(StreamingPolicyContentKeyResponse... keyToTrackMappings) {
            return keyToTrackMappings(List.of(keyToTrackMappings));
        }        public StreamingPolicyContentKeysResponse build() {
            return new StreamingPolicyContentKeysResponse(defaultKey, keyToTrackMappings);
        }
    }
}
