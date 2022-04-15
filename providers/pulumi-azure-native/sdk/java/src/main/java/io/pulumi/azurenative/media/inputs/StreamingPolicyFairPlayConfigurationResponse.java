// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify configurations of FairPlay in Streaming Policy
 * 
 */
public final class StreamingPolicyFairPlayConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamingPolicyFairPlayConfigurationResponse Empty = new StreamingPolicyFairPlayConfigurationResponse();

    /**
     * All license to be persistent or not
     * 
     */
    @Import(name="allowPersistentLicense", required=true)
      private final Boolean allowPersistentLicense;

    public Boolean allowPersistentLicense() {
        return this.allowPersistentLicense;
    }

    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @Import(name="customLicenseAcquisitionUrlTemplate")
      private final @Nullable String customLicenseAcquisitionUrlTemplate;

    public Optional<String> customLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate == null ? Optional.empty() : Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }

    public StreamingPolicyFairPlayConfigurationResponse(
        Boolean allowPersistentLicense,
        @Nullable String customLicenseAcquisitionUrlTemplate) {
        this.allowPersistentLicense = Objects.requireNonNull(allowPersistentLicense, "expected parameter 'allowPersistentLicense' to be non-null");
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
    }

    private StreamingPolicyFairPlayConfigurationResponse() {
        this.allowPersistentLicense = null;
        this.customLicenseAcquisitionUrlTemplate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyFairPlayConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowPersistentLicense;
        private @Nullable String customLicenseAcquisitionUrlTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyFairPlayConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPersistentLicense = defaults.allowPersistentLicense;
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
        }

        public Builder allowPersistentLicense(Boolean allowPersistentLicense) {
            this.allowPersistentLicense = Objects.requireNonNull(allowPersistentLicense);
            return this;
        }
        public Builder customLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }        public StreamingPolicyFairPlayConfigurationResponse build() {
            return new StreamingPolicyFairPlayConfigurationResponse(allowPersistentLicense, customLicenseAcquisitionUrlTemplate);
        }
    }
}
