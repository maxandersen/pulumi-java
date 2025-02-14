// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.AllowedConfigListArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.AllowedSubjectAltNamesArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.IssuanceModesArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.ReusableConfigWrapperArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.SubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The issuing policy for a CertificateAuthority. Certificates will not be successfully issued from this CertificateAuthority if they violate the policy.
 * 
 */
public final class CertificateAuthorityPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityPolicyArgs Empty = new CertificateAuthorityPolicyArgs();

    /**
     * Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
     */
    @Import(name="allowedCommonNames")
    private @Nullable Output<List<String>> allowedCommonNames;

    /**
     * @return Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
     * 
     */
    public Optional<Output<List<String>>> allowedCommonNames() {
        return Optional.ofNullable(this.allowedCommonNames);
    }

    /**
     * Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
     */
    @Import(name="allowedConfigList")
    private @Nullable Output<AllowedConfigListArgs> allowedConfigList;

    /**
     * @return Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
     * 
     */
    public Optional<Output<AllowedConfigListArgs>> allowedConfigList() {
        return Optional.ofNullable(this.allowedConfigList);
    }

    /**
     * Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    @Import(name="allowedIssuanceModes")
    private @Nullable Output<IssuanceModesArgs> allowedIssuanceModes;

    /**
     * @return Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
     * 
     */
    public Optional<Output<IssuanceModesArgs>> allowedIssuanceModes() {
        return Optional.ofNullable(this.allowedIssuanceModes);
    }

    /**
     * Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
     */
    @Import(name="allowedLocationsAndOrganizations")
    private @Nullable Output<List<SubjectArgs>> allowedLocationsAndOrganizations;

    /**
     * @return Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
     * 
     */
    public Optional<Output<List<SubjectArgs>>> allowedLocationsAndOrganizations() {
        return Optional.ofNullable(this.allowedLocationsAndOrganizations);
    }

    /**
     * Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
     */
    @Import(name="allowedSans")
    private @Nullable Output<AllowedSubjectAltNamesArgs> allowedSans;

    /**
     * @return Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
     * 
     */
    public Optional<Output<AllowedSubjectAltNamesArgs>> allowedSans() {
        return Optional.ofNullable(this.allowedSans);
    }

    /**
     * Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate&#39;s requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
     */
    @Import(name="maximumLifetime")
    private @Nullable Output<String> maximumLifetime;

    /**
     * @return Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate&#39;s requested maximum_lifetime, the effective lifetime will be explicitly truncated.
     * 
     */
    public Optional<Output<String>> maximumLifetime() {
        return Optional.ofNullable(this.maximumLifetime);
    }

    /**
     * Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
     */
    @Import(name="overwriteConfigValues")
    private @Nullable Output<ReusableConfigWrapperArgs> overwriteConfigValues;

    /**
     * @return Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
     * 
     */
    public Optional<Output<ReusableConfigWrapperArgs>> overwriteConfigValues() {
        return Optional.ofNullable(this.overwriteConfigValues);
    }

    private CertificateAuthorityPolicyArgs() {}

    private CertificateAuthorityPolicyArgs(CertificateAuthorityPolicyArgs $) {
        this.allowedCommonNames = $.allowedCommonNames;
        this.allowedConfigList = $.allowedConfigList;
        this.allowedIssuanceModes = $.allowedIssuanceModes;
        this.allowedLocationsAndOrganizations = $.allowedLocationsAndOrganizations;
        this.allowedSans = $.allowedSans;
        this.maximumLifetime = $.maximumLifetime;
        this.overwriteConfigValues = $.overwriteConfigValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityPolicyArgs $;

        public Builder() {
            $ = new CertificateAuthorityPolicyArgs();
        }

        public Builder(CertificateAuthorityPolicyArgs defaults) {
            $ = new CertificateAuthorityPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedCommonNames Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
         * 
         * @return builder
         * 
         */
        public Builder allowedCommonNames(@Nullable Output<List<String>> allowedCommonNames) {
            $.allowedCommonNames = allowedCommonNames;
            return this;
        }

        /**
         * @param allowedCommonNames Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
         * 
         * @return builder
         * 
         */
        public Builder allowedCommonNames(List<String> allowedCommonNames) {
            return allowedCommonNames(Output.of(allowedCommonNames));
        }

        /**
         * @param allowedCommonNames Optional. If any value is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed value. If no value is specified, all values will be allowed for this fied. Glob patterns are also supported.
         * 
         * @return builder
         * 
         */
        public Builder allowedCommonNames(String... allowedCommonNames) {
            return allowedCommonNames(List.of(allowedCommonNames));
        }

        /**
         * @param allowedConfigList Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
         * 
         * @return builder
         * 
         */
        public Builder allowedConfigList(@Nullable Output<AllowedConfigListArgs> allowedConfigList) {
            $.allowedConfigList = allowedConfigList;
            return this;
        }

        /**
         * @param allowedConfigList Optional. All Certificates issued by the CertificateAuthority must match at least one listed ReusableConfigWrapper in the list.
         * 
         * @return builder
         * 
         */
        public Builder allowedConfigList(AllowedConfigListArgs allowedConfigList) {
            return allowedConfigList(Output.of(allowedConfigList));
        }

        /**
         * @param allowedIssuanceModes Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
         * 
         * @return builder
         * 
         */
        public Builder allowedIssuanceModes(@Nullable Output<IssuanceModesArgs> allowedIssuanceModes) {
            $.allowedIssuanceModes = allowedIssuanceModes;
            return this;
        }

        /**
         * @param allowedIssuanceModes Optional. If specified, then only methods allowed in the IssuanceModes may be used to issue Certificates.
         * 
         * @return builder
         * 
         */
        public Builder allowedIssuanceModes(IssuanceModesArgs allowedIssuanceModes) {
            return allowedIssuanceModes(Output.of(allowedIssuanceModes));
        }

        /**
         * @param allowedLocationsAndOrganizations Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
         * 
         * @return builder
         * 
         */
        public Builder allowedLocationsAndOrganizations(@Nullable Output<List<SubjectArgs>> allowedLocationsAndOrganizations) {
            $.allowedLocationsAndOrganizations = allowedLocationsAndOrganizations;
            return this;
        }

        /**
         * @param allowedLocationsAndOrganizations Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
         * 
         * @return builder
         * 
         */
        public Builder allowedLocationsAndOrganizations(List<SubjectArgs> allowedLocationsAndOrganizations) {
            return allowedLocationsAndOrganizations(Output.of(allowedLocationsAndOrganizations));
        }

        /**
         * @param allowedLocationsAndOrganizations Optional. If any Subject is specified here, then all Certificates issued by the CertificateAuthority must match at least one listed Subject. If a Subject has an empty field, any value will be allowed for that field.
         * 
         * @return builder
         * 
         */
        public Builder allowedLocationsAndOrganizations(SubjectArgs... allowedLocationsAndOrganizations) {
            return allowedLocationsAndOrganizations(List.of(allowedLocationsAndOrganizations));
        }

        /**
         * @param allowedSans Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
         * 
         * @return builder
         * 
         */
        public Builder allowedSans(@Nullable Output<AllowedSubjectAltNamesArgs> allowedSans) {
            $.allowedSans = allowedSans;
            return this;
        }

        /**
         * @param allowedSans Optional. If a AllowedSubjectAltNames is specified here, then all Certificates issued by the CertificateAuthority must match AllowedSubjectAltNames. If no value or an empty value is specified, any value will be allowed for the SubjectAltNames field.
         * 
         * @return builder
         * 
         */
        public Builder allowedSans(AllowedSubjectAltNamesArgs allowedSans) {
            return allowedSans(Output.of(allowedSans));
        }

        /**
         * @param maximumLifetime Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate&#39;s requested maximum_lifetime, the effective lifetime will be explicitly truncated.
         * 
         * @return builder
         * 
         */
        public Builder maximumLifetime(@Nullable Output<String> maximumLifetime) {
            $.maximumLifetime = maximumLifetime;
            return this;
        }

        /**
         * @param maximumLifetime Optional. The maximum lifetime allowed by the CertificateAuthority. Note that if the any part if the issuing chain expires before a Certificate&#39;s requested maximum_lifetime, the effective lifetime will be explicitly truncated.
         * 
         * @return builder
         * 
         */
        public Builder maximumLifetime(String maximumLifetime) {
            return maximumLifetime(Output.of(maximumLifetime));
        }

        /**
         * @param overwriteConfigValues Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
         * 
         * @return builder
         * 
         */
        public Builder overwriteConfigValues(@Nullable Output<ReusableConfigWrapperArgs> overwriteConfigValues) {
            $.overwriteConfigValues = overwriteConfigValues;
            return this;
        }

        /**
         * @param overwriteConfigValues Optional. All Certificates issued by the CertificateAuthority will use the provided configuration values, overwriting any requested configuration values.
         * 
         * @return builder
         * 
         */
        public Builder overwriteConfigValues(ReusableConfigWrapperArgs overwriteConfigValues) {
            return overwriteConfigValues(Output.of(overwriteConfigValues));
        }

        public CertificateAuthorityPolicyArgs build() {
            return $;
        }
    }

}
