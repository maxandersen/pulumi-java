// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Settings specific to keys that can be used for WAF (Web Application Firewall).
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1WafSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecaptchaenterpriseV1WafSettingsResponse Empty = new GoogleCloudRecaptchaenterpriseV1WafSettingsResponse();

    /**
     * The WAF feature for which this key is enabled.
     * 
     */
    @Import(name="wafFeature", required=true)
    private String wafFeature;

    public String wafFeature() {
        return this.wafFeature;
    }

    /**
     * The WAF service that uses this key.
     * 
     */
    @Import(name="wafService", required=true)
    private String wafService;

    public String wafService() {
        return this.wafService;
    }

    private GoogleCloudRecaptchaenterpriseV1WafSettingsResponse() {}

    private GoogleCloudRecaptchaenterpriseV1WafSettingsResponse(GoogleCloudRecaptchaenterpriseV1WafSettingsResponse $) {
        this.wafFeature = $.wafFeature;
        this.wafService = $.wafService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRecaptchaenterpriseV1WafSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRecaptchaenterpriseV1WafSettingsResponse $;

        public Builder() {
            $ = new GoogleCloudRecaptchaenterpriseV1WafSettingsResponse();
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1WafSettingsResponse defaults) {
            $ = new GoogleCloudRecaptchaenterpriseV1WafSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder wafFeature(String wafFeature) {
            $.wafFeature = wafFeature;
            return this;
        }

        public Builder wafService(String wafService) {
            $.wafService = wafService;
            return this;
        }

        public GoogleCloudRecaptchaenterpriseV1WafSettingsResponse build() {
            $.wafFeature = Objects.requireNonNull($.wafFeature, "expected parameter 'wafFeature' to be non-null");
            $.wafService = Objects.requireNonNull($.wafService, "expected parameter 'wafService' to be non-null");
            return $;
        }
    }

}
