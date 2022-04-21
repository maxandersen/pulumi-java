// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsEncryptionEncryptionMethod;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProvider;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) encryption configuration.
 * 
 */
public final class OriginEndpointHlsEncryption extends com.pulumi.resources.InvokeArgs {

    public static final OriginEndpointHlsEncryption Empty = new OriginEndpointHlsEncryption();

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be periodically rotated.
     * 
     */
    @Import(name="constantInitializationVector")
    private @Nullable String constantInitializationVector;

    public Optional<String> constantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }

    /**
     * The encryption method to use.
     * 
     */
    @Import(name="encryptionMethod")
    private @Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod;

    public Optional<OriginEndpointHlsEncryptionEncryptionMethod> encryptionMethod() {
        return Optional.ofNullable(this.encryptionMethod);
    }

    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     */
    @Import(name="keyRotationIntervalSeconds")
    private @Nullable Integer keyRotationIntervalSeconds;

    public Optional<Integer> keyRotationIntervalSeconds() {
        return Optional.ofNullable(this.keyRotationIntervalSeconds);
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    @Import(name="repeatExtXKey")
    private @Nullable Boolean repeatExtXKey;

    public Optional<Boolean> repeatExtXKey() {
        return Optional.ofNullable(this.repeatExtXKey);
    }

    @Import(name="spekeKeyProvider", required=true)
    private OriginEndpointSpekeKeyProvider spekeKeyProvider;

    public OriginEndpointSpekeKeyProvider spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    private OriginEndpointHlsEncryption() {}

    private OriginEndpointHlsEncryption(OriginEndpointHlsEncryption $) {
        this.constantInitializationVector = $.constantInitializationVector;
        this.encryptionMethod = $.encryptionMethod;
        this.keyRotationIntervalSeconds = $.keyRotationIntervalSeconds;
        this.repeatExtXKey = $.repeatExtXKey;
        this.spekeKeyProvider = $.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginEndpointHlsEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointHlsEncryption $;

        public Builder() {
            $ = new OriginEndpointHlsEncryption();
        }

        public Builder(OriginEndpointHlsEncryption defaults) {
            $ = new OriginEndpointHlsEncryption(Objects.requireNonNull(defaults));
        }

        public Builder constantInitializationVector(@Nullable String constantInitializationVector) {
            $.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder encryptionMethod(@Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod) {
            $.encryptionMethod = encryptionMethod;
            return this;
        }

        public Builder keyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            $.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder repeatExtXKey(@Nullable Boolean repeatExtXKey) {
            $.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder spekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            $.spekeKeyProvider = spekeKeyProvider;
            return this;
        }

        public OriginEndpointHlsEncryption build() {
            $.spekeKeyProvider = Objects.requireNonNull($.spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
            return $;
        }
    }

}
