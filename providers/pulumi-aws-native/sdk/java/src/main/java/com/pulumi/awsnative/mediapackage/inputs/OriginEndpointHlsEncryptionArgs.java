// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsEncryptionEncryptionMethod;
import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProviderArgs;
import com.pulumi.core.Output;
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
public final class OriginEndpointHlsEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OriginEndpointHlsEncryptionArgs Empty = new OriginEndpointHlsEncryptionArgs();

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be periodically rotated.
     * 
     */
    @Import(name="constantInitializationVector")
    private @Nullable Output<String> constantInitializationVector;

    public Optional<Output<String>> constantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }

    /**
     * The encryption method to use.
     * 
     */
    @Import(name="encryptionMethod")
    private @Nullable Output<OriginEndpointHlsEncryptionEncryptionMethod> encryptionMethod;

    public Optional<Output<OriginEndpointHlsEncryptionEncryptionMethod>> encryptionMethod() {
        return Optional.ofNullable(this.encryptionMethod);
    }

    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     */
    @Import(name="keyRotationIntervalSeconds")
    private @Nullable Output<Integer> keyRotationIntervalSeconds;

    public Optional<Output<Integer>> keyRotationIntervalSeconds() {
        return Optional.ofNullable(this.keyRotationIntervalSeconds);
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    @Import(name="repeatExtXKey")
    private @Nullable Output<Boolean> repeatExtXKey;

    public Optional<Output<Boolean>> repeatExtXKey() {
        return Optional.ofNullable(this.repeatExtXKey);
    }

    @Import(name="spekeKeyProvider", required=true)
    private Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider;

    public Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    private OriginEndpointHlsEncryptionArgs() {}

    private OriginEndpointHlsEncryptionArgs(OriginEndpointHlsEncryptionArgs $) {
        this.constantInitializationVector = $.constantInitializationVector;
        this.encryptionMethod = $.encryptionMethod;
        this.keyRotationIntervalSeconds = $.keyRotationIntervalSeconds;
        this.repeatExtXKey = $.repeatExtXKey;
        this.spekeKeyProvider = $.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginEndpointHlsEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginEndpointHlsEncryptionArgs $;

        public Builder() {
            $ = new OriginEndpointHlsEncryptionArgs();
        }

        public Builder(OriginEndpointHlsEncryptionArgs defaults) {
            $ = new OriginEndpointHlsEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder constantInitializationVector(@Nullable Output<String> constantInitializationVector) {
            $.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder constantInitializationVector(String constantInitializationVector) {
            return constantInitializationVector(Output.of(constantInitializationVector));
        }

        public Builder encryptionMethod(@Nullable Output<OriginEndpointHlsEncryptionEncryptionMethod> encryptionMethod) {
            $.encryptionMethod = encryptionMethod;
            return this;
        }

        public Builder encryptionMethod(OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod) {
            return encryptionMethod(Output.of(encryptionMethod));
        }

        public Builder keyRotationIntervalSeconds(@Nullable Output<Integer> keyRotationIntervalSeconds) {
            $.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder keyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
            return keyRotationIntervalSeconds(Output.of(keyRotationIntervalSeconds));
        }

        public Builder repeatExtXKey(@Nullable Output<Boolean> repeatExtXKey) {
            $.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder repeatExtXKey(Boolean repeatExtXKey) {
            return repeatExtXKey(Output.of(repeatExtXKey));
        }

        public Builder spekeKeyProvider(Output<OriginEndpointSpekeKeyProviderArgs> spekeKeyProvider) {
            $.spekeKeyProvider = spekeKeyProvider;
            return this;
        }

        public Builder spekeKeyProvider(OriginEndpointSpekeKeyProviderArgs spekeKeyProvider) {
            return spekeKeyProvider(Output.of(spekeKeyProvider));
        }

        public OriginEndpointHlsEncryptionArgs build() {
            $.spekeKeyProvider = Objects.requireNonNull($.spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
            return $;
        }
    }

}
