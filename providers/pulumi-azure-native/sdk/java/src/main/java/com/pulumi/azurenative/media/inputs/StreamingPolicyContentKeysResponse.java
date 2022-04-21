// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.DefaultKeyResponse;
import com.pulumi.azurenative.media.inputs.StreamingPolicyContentKeyResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify properties of all content keys in Streaming Policy
 * 
 */
public final class StreamingPolicyContentKeysResponse extends com.pulumi.resources.InvokeArgs {

    public static final StreamingPolicyContentKeysResponse Empty = new StreamingPolicyContentKeysResponse();

    /**
     * Default content key for an encryption scheme
     * 
     */
    @Import(name="defaultKey")
    private @Nullable DefaultKeyResponse defaultKey;

    public Optional<DefaultKeyResponse> defaultKey() {
        return Optional.ofNullable(this.defaultKey);
    }

    /**
     * Representing tracks needs separate content key
     * 
     */
    @Import(name="keyToTrackMappings")
    private @Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings;

    public Optional<List<StreamingPolicyContentKeyResponse>> keyToTrackMappings() {
        return Optional.ofNullable(this.keyToTrackMappings);
    }

    private StreamingPolicyContentKeysResponse() {}

    private StreamingPolicyContentKeysResponse(StreamingPolicyContentKeysResponse $) {
        this.defaultKey = $.defaultKey;
        this.keyToTrackMappings = $.keyToTrackMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyContentKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyContentKeysResponse $;

        public Builder() {
            $ = new StreamingPolicyContentKeysResponse();
        }

        public Builder(StreamingPolicyContentKeysResponse defaults) {
            $ = new StreamingPolicyContentKeysResponse(Objects.requireNonNull(defaults));
        }

        public Builder defaultKey(@Nullable DefaultKeyResponse defaultKey) {
            $.defaultKey = defaultKey;
            return this;
        }

        public Builder keyToTrackMappings(@Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings) {
            $.keyToTrackMappings = keyToTrackMappings;
            return this;
        }

        public Builder keyToTrackMappings(StreamingPolicyContentKeyResponse... keyToTrackMappings) {
            return keyToTrackMappings(List.of(keyToTrackMappings));
        }

        public StreamingPolicyContentKeysResponse build() {
            return $;
        }
    }

}
