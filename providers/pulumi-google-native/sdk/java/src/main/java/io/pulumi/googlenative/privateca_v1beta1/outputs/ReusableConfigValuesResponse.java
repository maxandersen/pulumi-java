// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.privateca_v1beta1.outputs.CaOptionsResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.KeyUsageResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.ObjectIdResponse;
import io.pulumi.googlenative.privateca_v1beta1.outputs.X509ExtensionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ReusableConfigValuesResponse {
    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    private final List<X509ExtensionResponse> additionalExtensions;
    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    private final List<String> aiaOcspServers;
    /**
     * Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
     */
    private final CaOptionsResponse caOptions;
    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    private final KeyUsageResponse keyUsage;
    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    private final List<ObjectIdResponse> policyIds;

    @OutputCustomType.Constructor
    private ReusableConfigValuesResponse(
        @OutputCustomType.Parameter("additionalExtensions") List<X509ExtensionResponse> additionalExtensions,
        @OutputCustomType.Parameter("aiaOcspServers") List<String> aiaOcspServers,
        @OutputCustomType.Parameter("caOptions") CaOptionsResponse caOptions,
        @OutputCustomType.Parameter("keyUsage") KeyUsageResponse keyUsage,
        @OutputCustomType.Parameter("policyIds") List<ObjectIdResponse> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = caOptions;
        this.keyUsage = keyUsage;
        this.policyIds = policyIds;
    }

    /**
     * Optional. Describes custom X.509 extensions.
     * 
    */
    public List<X509ExtensionResponse> getAdditionalExtensions() {
        return this.additionalExtensions;
    }
    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
    */
    public List<String> getAiaOcspServers() {
        return this.aiaOcspServers;
    }
    /**
     * Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate.
     * 
    */
    public CaOptionsResponse getCaOptions() {
        return this.caOptions;
    }
    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
    */
    public KeyUsageResponse getKeyUsage() {
        return this.keyUsage;
    }
    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
    */
    public List<ObjectIdResponse> getPolicyIds() {
        return this.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReusableConfigValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<X509ExtensionResponse> additionalExtensions;
        private List<String> aiaOcspServers;
        private CaOptionsResponse caOptions;
        private KeyUsageResponse keyUsage;
        private List<ObjectIdResponse> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ReusableConfigValuesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder setAdditionalExtensions(List<X509ExtensionResponse> additionalExtensions) {
            this.additionalExtensions = Objects.requireNonNull(additionalExtensions);
            return this;
        }

        public Builder setAiaOcspServers(List<String> aiaOcspServers) {
            this.aiaOcspServers = Objects.requireNonNull(aiaOcspServers);
            return this;
        }

        public Builder setCaOptions(CaOptionsResponse caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }

        public Builder setKeyUsage(KeyUsageResponse keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }

        public Builder setPolicyIds(List<ObjectIdResponse> policyIds) {
            this.policyIds = Objects.requireNonNull(policyIds);
            return this;
        }
        public ReusableConfigValuesResponse build() {
            return new ReusableConfigValuesResponse(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
