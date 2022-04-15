// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Settings specific to keys that can be used by websites.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse Empty = new GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse();

    /**
     * If set to true, it means allowed_domains will not be enforced.
     * 
     */
    @Import(name="allowAllDomains", required=true)
      private final Boolean allowAllDomains;

    public Boolean allowAllDomains() {
        return this.allowAllDomains;
    }

    /**
     * If set to true, the key can be used on AMP (Accelerated Mobile Pages) websites. This is supported only for the SCORE integration type.
     * 
     */
    @Import(name="allowAmpTraffic", required=true)
      private final Boolean allowAmpTraffic;

    public Boolean allowAmpTraffic() {
        return this.allowAmpTraffic;
    }

    /**
     * Domains or subdomains of websites allowed to use the key. All subdomains of an allowed domain are automatically allowed. A valid domain requires a host and must not include any path, port, query or fragment. Examples: 'example.com' or 'subdomain.example.com'
     * 
     */
    @Import(name="allowedDomains", required=true)
      private final List<String> allowedDomains;

    public List<String> allowedDomains() {
        return this.allowedDomains;
    }

    /**
     * Settings for the frequency and difficulty at which this key triggers captcha challenges. This should only be specified for IntegrationTypes CHECKBOX and INVISIBLE.
     * 
     */
    @Import(name="challengeSecurityPreference", required=true)
      private final String challengeSecurityPreference;

    public String challengeSecurityPreference() {
        return this.challengeSecurityPreference;
    }

    /**
     * Describes how this key is integrated with the website.
     * 
     */
    @Import(name="integrationType", required=true)
      private final String integrationType;

    public String integrationType() {
        return this.integrationType;
    }

    public GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse(
        Boolean allowAllDomains,
        Boolean allowAmpTraffic,
        List<String> allowedDomains,
        String challengeSecurityPreference,
        String integrationType) {
        this.allowAllDomains = Objects.requireNonNull(allowAllDomains, "expected parameter 'allowAllDomains' to be non-null");
        this.allowAmpTraffic = Objects.requireNonNull(allowAmpTraffic, "expected parameter 'allowAmpTraffic' to be non-null");
        this.allowedDomains = Objects.requireNonNull(allowedDomains, "expected parameter 'allowedDomains' to be non-null");
        this.challengeSecurityPreference = Objects.requireNonNull(challengeSecurityPreference, "expected parameter 'challengeSecurityPreference' to be non-null");
        this.integrationType = Objects.requireNonNull(integrationType, "expected parameter 'integrationType' to be non-null");
    }

    private GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse() {
        this.allowAllDomains = null;
        this.allowAmpTraffic = null;
        this.allowedDomains = List.of();
        this.challengeSecurityPreference = null;
        this.integrationType = null;
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

        public Builder allowAllDomains(Boolean allowAllDomains) {
            this.allowAllDomains = Objects.requireNonNull(allowAllDomains);
            return this;
        }
        public Builder allowAmpTraffic(Boolean allowAmpTraffic) {
            this.allowAmpTraffic = Objects.requireNonNull(allowAmpTraffic);
            return this;
        }
        public Builder allowedDomains(List<String> allowedDomains) {
            this.allowedDomains = Objects.requireNonNull(allowedDomains);
            return this;
        }
        public Builder allowedDomains(String... allowedDomains) {
            return allowedDomains(List.of(allowedDomains));
        }
        public Builder challengeSecurityPreference(String challengeSecurityPreference) {
            this.challengeSecurityPreference = Objects.requireNonNull(challengeSecurityPreference);
            return this;
        }
        public Builder integrationType(String integrationType) {
            this.integrationType = Objects.requireNonNull(integrationType);
            return this;
        }        public GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse build() {
            return new GoogleCloudRecaptchaenterpriseV1WebKeySettingsResponse(allowAllDomains, allowAmpTraffic, allowedDomains, challengeSecurityPreference, integrationType);
        }
    }
}
