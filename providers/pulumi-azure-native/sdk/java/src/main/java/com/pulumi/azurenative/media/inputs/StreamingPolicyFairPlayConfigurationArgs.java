// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify configurations of FairPlay in Streaming Policy
 * 
 */
public final class StreamingPolicyFairPlayConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyFairPlayConfigurationArgs Empty = new StreamingPolicyFairPlayConfigurationArgs();

    /**
     * All license to be persistent or not
     * 
     */
    @Import(name="allowPersistentLicense", required=true)
    private Output<Boolean> allowPersistentLicense;

    public Output<Boolean> allowPersistentLicense() {
        return this.allowPersistentLicense;
    }

    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @Import(name="customLicenseAcquisitionUrlTemplate")
    private @Nullable Output<String> customLicenseAcquisitionUrlTemplate;

    public Optional<Output<String>> customLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    private StreamingPolicyFairPlayConfigurationArgs() {}

    private StreamingPolicyFairPlayConfigurationArgs(StreamingPolicyFairPlayConfigurationArgs $) {
        this.allowPersistentLicense = $.allowPersistentLicense;
        this.customLicenseAcquisitionUrlTemplate = $.customLicenseAcquisitionUrlTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingPolicyFairPlayConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingPolicyFairPlayConfigurationArgs $;

        public Builder() {
            $ = new StreamingPolicyFairPlayConfigurationArgs();
        }

        public Builder(StreamingPolicyFairPlayConfigurationArgs defaults) {
            $ = new StreamingPolicyFairPlayConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowPersistentLicense(Output<Boolean> allowPersistentLicense) {
            $.allowPersistentLicense = allowPersistentLicense;
            return this;
        }

        public Builder allowPersistentLicense(Boolean allowPersistentLicense) {
            return allowPersistentLicense(Output.of(allowPersistentLicense));
        }

        public Builder customLicenseAcquisitionUrlTemplate(@Nullable Output<String> customLicenseAcquisitionUrlTemplate) {
            $.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }

        public Builder customLicenseAcquisitionUrlTemplate(String customLicenseAcquisitionUrlTemplate) {
            return customLicenseAcquisitionUrlTemplate(Output.of(customLicenseAcquisitionUrlTemplate));
        }

        public StreamingPolicyFairPlayConfigurationArgs build() {
            $.allowPersistentLicense = Objects.requireNonNull($.allowPersistentLicense, "expected parameter 'allowPersistentLicense' to be non-null");
            return $;
        }
    }

}
