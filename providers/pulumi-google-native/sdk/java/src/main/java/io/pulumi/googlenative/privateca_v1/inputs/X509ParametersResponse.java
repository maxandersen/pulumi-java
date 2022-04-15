// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1.inputs.CaOptionsResponse;
import io.pulumi.googlenative.privateca_v1.inputs.KeyUsageResponse;
import io.pulumi.googlenative.privateca_v1.inputs.ObjectIdResponse;
import io.pulumi.googlenative.privateca_v1.inputs.X509ExtensionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An X509Parameters is used to describe certain fields of an X.509 certificate, such as the key usage fields, fields specific to CA certificates, certificate policy extensions and custom extensions.
 * 
 */
public final class X509ParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final X509ParametersResponse Empty = new X509ParametersResponse();

    /**
     * Optional. Describes custom X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions", required=true)
      private final List<X509ExtensionResponse> additionalExtensions;

    public List<X509ExtensionResponse> additionalExtensions() {
        return this.additionalExtensions;
    }

    /**
     * Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers", required=true)
      private final List<String> aiaOcspServers;

    public List<String> aiaOcspServers() {
        return this.aiaOcspServers;
    }

    /**
     * Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * 
     */
    @Import(name="caOptions", required=true)
      private final CaOptionsResponse caOptions;

    public CaOptionsResponse caOptions() {
        return this.caOptions;
    }

    /**
     * Optional. Indicates the intended use for keys that correspond to a certificate.
     * 
     */
    @Import(name="keyUsage", required=true)
      private final KeyUsageResponse keyUsage;

    public KeyUsageResponse keyUsage() {
        return this.keyUsage;
    }

    /**
     * Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * 
     */
    @Import(name="policyIds", required=true)
      private final List<ObjectIdResponse> policyIds;

    public List<ObjectIdResponse> policyIds() {
        return this.policyIds;
    }

    public X509ParametersResponse(
        List<X509ExtensionResponse> additionalExtensions,
        List<String> aiaOcspServers,
        CaOptionsResponse caOptions,
        KeyUsageResponse keyUsage,
        List<ObjectIdResponse> policyIds) {
        this.additionalExtensions = Objects.requireNonNull(additionalExtensions, "expected parameter 'additionalExtensions' to be non-null");
        this.aiaOcspServers = Objects.requireNonNull(aiaOcspServers, "expected parameter 'aiaOcspServers' to be non-null");
        this.caOptions = Objects.requireNonNull(caOptions, "expected parameter 'caOptions' to be non-null");
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = Objects.requireNonNull(policyIds, "expected parameter 'policyIds' to be non-null");
    }

    private X509ParametersResponse() {
        this.additionalExtensions = List.of();
        this.aiaOcspServers = List.of();
        this.caOptions = null;
        this.keyUsage = null;
        this.policyIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509ParametersResponse defaults) {
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

        public Builder(X509ParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(List<X509ExtensionResponse> additionalExtensions) {
            this.additionalExtensions = Objects.requireNonNull(additionalExtensions);
            return this;
        }
        public Builder additionalExtensions(X509ExtensionResponse... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            this.aiaOcspServers = Objects.requireNonNull(aiaOcspServers);
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(CaOptionsResponse caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }
        public Builder keyUsage(KeyUsageResponse keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }
        public Builder policyIds(List<ObjectIdResponse> policyIds) {
            this.policyIds = Objects.requireNonNull(policyIds);
            return this;
        }
        public Builder policyIds(ObjectIdResponse... policyIds) {
            return policyIds(List.of(policyIds));
        }        public X509ParametersResponse build() {
            return new X509ParametersResponse(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
