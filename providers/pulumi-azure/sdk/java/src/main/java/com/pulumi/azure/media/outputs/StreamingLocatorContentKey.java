// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingLocatorContentKey {
    /**
     * @return ID of Content Key. Changing this forces a new Streaming Locator to be created.
     * 
     */
    private final @Nullable String contentKeyId;
    /**
     * @return Label of Content Key as specified in the Streaming Policy. Changing this forces a new Streaming Locator to be created.
     * 
     */
    private final @Nullable String labelReferenceInStreamingPolicy;
    /**
     * @return Content Key Policy used by Content Key. Changing this forces a new Streaming Locator to be created.
     * 
     */
    private final @Nullable String policyName;
    /**
     * @return Encryption type of Content Key. Supported values are `CommonEncryptionCbcs`, `CommonEncryptionCenc` or `EnvelopeEncryption`. Changing this forces a new Streaming Locator to be created.
     * 
     */
    private final @Nullable String type;
    /**
     * @return Value of Content Key. Changing this forces a new Streaming Locator to be created.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private StreamingLocatorContentKey(
        @CustomType.Parameter("contentKeyId") @Nullable String contentKeyId,
        @CustomType.Parameter("labelReferenceInStreamingPolicy") @Nullable String labelReferenceInStreamingPolicy,
        @CustomType.Parameter("policyName") @Nullable String policyName,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("value") @Nullable String value) {
        this.contentKeyId = contentKeyId;
        this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
        this.policyName = policyName;
        this.type = type;
        this.value = value;
    }

    /**
     * @return ID of Content Key. Changing this forces a new Streaming Locator to be created.
     * 
     */
    public Optional<String> contentKeyId() {
        return Optional.ofNullable(this.contentKeyId);
    }
    /**
     * @return Label of Content Key as specified in the Streaming Policy. Changing this forces a new Streaming Locator to be created.
     * 
     */
    public Optional<String> labelReferenceInStreamingPolicy() {
        return Optional.ofNullable(this.labelReferenceInStreamingPolicy);
    }
    /**
     * @return Content Key Policy used by Content Key. Changing this forces a new Streaming Locator to be created.
     * 
     */
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }
    /**
     * @return Encryption type of Content Key. Supported values are `CommonEncryptionCbcs`, `CommonEncryptionCenc` or `EnvelopeEncryption`. Changing this forces a new Streaming Locator to be created.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Value of Content Key. Changing this forces a new Streaming Locator to be created.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingLocatorContentKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contentKeyId;
        private @Nullable String labelReferenceInStreamingPolicy;
        private @Nullable String policyName;
        private @Nullable String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingLocatorContentKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentKeyId = defaults.contentKeyId;
    	      this.labelReferenceInStreamingPolicy = defaults.labelReferenceInStreamingPolicy;
    	      this.policyName = defaults.policyName;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder contentKeyId(@Nullable String contentKeyId) {
            this.contentKeyId = contentKeyId;
            return this;
        }
        public Builder labelReferenceInStreamingPolicy(@Nullable String labelReferenceInStreamingPolicy) {
            this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
            return this;
        }
        public Builder policyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public StreamingLocatorContentKey build() {
            return new StreamingLocatorContentKey(contentKeyId, labelReferenceInStreamingPolicy, policyName, type, value);
        }
    }
}
