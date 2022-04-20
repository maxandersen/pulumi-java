// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesCaOptionsArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyBaselineValuesArgs extends com.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyBaselineValuesArgs Empty = new CaPoolIssuancePolicyBaselineValuesArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @Import(name="additionalExtensions")
      private final @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>> additionalExtensions;

    public Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>> additionalExtensions() {
        return this.additionalExtensions == null ? Codegen.empty() : this.additionalExtensions;
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
      private final @Nullable Output<List<String>> aiaOcspServers;

    public Output<List<String>> aiaOcspServers() {
        return this.aiaOcspServers == null ? Codegen.empty() : this.aiaOcspServers;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="caOptions", required=true)
      private final Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions;

    public Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions() {
        return this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="keyUsage", required=true)
      private final Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage;

    public Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @Import(name="policyIds")
      private final @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>> policyIds;

    public Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>> policyIds() {
        return this.policyIds == null ? Codegen.empty() : this.policyIds;
    }

    public CaPoolIssuancePolicyBaselineValuesArgs(
        @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>> additionalExtensions,
        @Nullable Output<List<String>> aiaOcspServers,
        Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions,
        Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage,
        @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>> policyIds) {
        this.additionalExtensions = additionalExtensions;
        this.aiaOcspServers = aiaOcspServers;
        this.caOptions = Objects.requireNonNull(caOptions, "expected parameter 'caOptions' to be non-null");
        this.keyUsage = Objects.requireNonNull(keyUsage, "expected parameter 'keyUsage' to be non-null");
        this.policyIds = policyIds;
    }

    private CaPoolIssuancePolicyBaselineValuesArgs() {
        this.additionalExtensions = Codegen.empty();
        this.aiaOcspServers = Codegen.empty();
        this.caOptions = Codegen.empty();
        this.keyUsage = Codegen.empty();
        this.policyIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>> additionalExtensions;
        private @Nullable Output<List<String>> aiaOcspServers;
        private Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions;
        private Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage;
        private @Nullable Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>> policyIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExtensions = defaults.additionalExtensions;
    	      this.aiaOcspServers = defaults.aiaOcspServers;
    	      this.caOptions = defaults.caOptions;
    	      this.keyUsage = defaults.keyUsage;
    	      this.policyIds = defaults.policyIds;
        }

        public Builder additionalExtensions(@Nullable Output<List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs>> additionalExtensions) {
            this.additionalExtensions = additionalExtensions;
            return this;
        }
        public Builder additionalExtensions(@Nullable List<CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs> additionalExtensions) {
            this.additionalExtensions = Codegen.ofNullable(additionalExtensions);
            return this;
        }
        public Builder additionalExtensions(CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }
        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            this.aiaOcspServers = aiaOcspServers;
            return this;
        }
        public Builder aiaOcspServers(@Nullable List<String> aiaOcspServers) {
            this.aiaOcspServers = Codegen.ofNullable(aiaOcspServers);
            return this;
        }
        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }
        public Builder caOptions(Output<CaPoolIssuancePolicyBaselineValuesCaOptionsArgs> caOptions) {
            this.caOptions = Objects.requireNonNull(caOptions);
            return this;
        }
        public Builder caOptions(CaPoolIssuancePolicyBaselineValuesCaOptionsArgs caOptions) {
            this.caOptions = Output.of(Objects.requireNonNull(caOptions));
            return this;
        }
        public Builder keyUsage(Output<CaPoolIssuancePolicyBaselineValuesKeyUsageArgs> keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }
        public Builder keyUsage(CaPoolIssuancePolicyBaselineValuesKeyUsageArgs keyUsage) {
            this.keyUsage = Output.of(Objects.requireNonNull(keyUsage));
            return this;
        }
        public Builder policyIds(@Nullable Output<List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs>> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public Builder policyIds(@Nullable List<CaPoolIssuancePolicyBaselineValuesPolicyIdArgs> policyIds) {
            this.policyIds = Codegen.ofNullable(policyIds);
            return this;
        }
        public Builder policyIds(CaPoolIssuancePolicyBaselineValuesPolicyIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }        public CaPoolIssuancePolicyBaselineValuesArgs build() {
            return new CaPoolIssuancePolicyBaselineValuesArgs(additionalExtensions, aiaOcspServers, caOptions, keyUsage, policyIds);
        }
    }
}
