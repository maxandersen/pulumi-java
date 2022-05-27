// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs Empty = new StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs();

    /**
     * Custom attributes for PlayReady. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="customAttributes")
    private @Nullable Output<String> customAttributes;

    /**
     * @return Custom attributes for PlayReady. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> customAttributes() {
        return Optional.ofNullable(this.customAttributes);
    }

    /**
     * Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
     * 
     */
    @Import(name="customLicenseAcquisitionUrlTemplate")
    private @Nullable Output<String> customLicenseAcquisitionUrlTemplate;

    /**
     * @return Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<Output<String>> customLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    private StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs() {}

    private StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs(StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs $) {
        this.customAttributes = $.customAttributes;
        this.customLicenseAcquisitionUrlTemplate = $.customLicenseAcquisitionUrlTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs $;

        public Builder() {
            $ = new StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs();
        }

        public Builder(StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs defaults) {
            $ = new StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customAttributes Custom attributes for PlayReady. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder customAttributes(@Nullable Output<String> customAttributes) {
            $.customAttributes = customAttributes;
            return this;
        }

        /**
         * @param customAttributes Custom attributes for PlayReady. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder customAttributes(String customAttributes) {
            return customAttributes(Output.of(customAttributes));
        }

        /**
         * @param customLicenseAcquisitionUrlTemplate Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder customLicenseAcquisitionUrlTemplate(@Nullable Output<String> customLicenseAcquisitionUrlTemplate) {
            $.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }

        /**
         * @param customLicenseAcquisitionUrlTemplate Template for the URL of the custom service delivering licenses to end user players. Not required when using Azure Media Services for issuing licenses. The template supports replaceable tokens that the service will update at runtime with the value specific to the request. The currently supported token values are `{AlternativeMediaId}`, which is replaced with the value of `StreamingLocatorId.AlternativeMediaId`, and `{ContentKeyId}`, which is replaced with the value of identifier of the key being requested. Changing this forces a new Streaming Policy to be created.
         * 
         * @return builder
         * 
         */
        public Builder customLicenseAcquisitionUrlTemplate(String customLicenseAcquisitionUrlTemplate) {
            return customLicenseAcquisitionUrlTemplate(Output.of(customLicenseAcquisitionUrlTemplate));
        }

        public StreamingPolicyCommonEncryptionCencDrmPlayreadyArgs build() {
            return $;
        }
    }

}
