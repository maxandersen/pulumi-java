// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse {
    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
     */
    private final Boolean allowAllDomains;
    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    private final Boolean allowAmpTraffic;
    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
     * 
     */
    private final List<String> allowedDomains;
    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
     * 
     */
    private final String challengeSecurityPreference;
    /**
     * Describes how this key is integrated with the website.
     * 
     */
    private final String integrationType;

    @OutputCustomType.Constructor
    private GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse(
        @OutputCustomType.Parameter("allowAllDomains") Boolean allowAllDomains,
        @OutputCustomType.Parameter("allowAmpTraffic") Boolean allowAmpTraffic,
        @OutputCustomType.Parameter("allowedDomains") List<String> allowedDomains,
        @OutputCustomType.Parameter("challengeSecurityPreference") String challengeSecurityPreference,
        @OutputCustomType.Parameter("integrationType") String integrationType) {
        this.allowAllDomains = allowAllDomains;
        this.allowAmpTraffic = allowAmpTraffic;
        this.allowedDomains = allowedDomains;
        this.challengeSecurityPreference = challengeSecurityPreference;
        this.integrationType = integrationType;
    }

    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
    */
    public Boolean getAllowAllDomains() {
        return this.allowAllDomains;
    }
    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
    */
    public Boolean getAllowAmpTraffic() {
        return this.allowAmpTraffic;
    }
    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
     * 
    */
    public List<String> getAllowedDomains() {
        return this.allowedDomains;
    }
    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
     * 
    */
    public String getChallengeSecurityPreference() {
        return this.challengeSecurityPreference;
    }
    /**
     * Describes how this key is integrated with the website.
     * 
    */
    public String getIntegrationType() {
        return this.integrationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowAllDomains;
        private Boolean allowAmpTraffic;
        private List<String> allowedDomains;
        private String challengeSecurityPreference;
        private String integrationType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllDomains = defaults.allowAllDomains;
    	      this.allowAmpTraffic = defaults.allowAmpTraffic;
    	      this.allowedDomains = defaults.allowedDomains;
    	      this.challengeSecurityPreference = defaults.challengeSecurityPreference;
    	      this.integrationType = defaults.integrationType;
        }

        public Builder setAllowAllDomains(Boolean allowAllDomains) {
            this.allowAllDomains = Objects.requireNonNull(allowAllDomains);
            return this;
        }

        public Builder setAllowAmpTraffic(Boolean allowAmpTraffic) {
            this.allowAmpTraffic = Objects.requireNonNull(allowAmpTraffic);
            return this;
        }

        public Builder setAllowedDomains(List<String> allowedDomains) {
            this.allowedDomains = Objects.requireNonNull(allowedDomains);
            return this;
        }

        public Builder setChallengeSecurityPreference(String challengeSecurityPreference) {
            this.challengeSecurityPreference = Objects.requireNonNull(challengeSecurityPreference);
            return this;
        }

        public Builder setIntegrationType(String integrationType) {
            this.integrationType = Objects.requireNonNull(integrationType);
            return this;
        }
        public GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse build() {
            return new GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse(allowAllDomains, allowAmpTraffic, allowedDomains, challengeSecurityPreference, integrationType);
        }
    }
}
