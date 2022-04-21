// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * AppliedLicense holds the license data returned by adaptation module report.
 * 
 */
public final class AppliedLicenseResponse extends com.pulumi.resources.InvokeArgs {

    public static final AppliedLicenseResponse Empty = new AppliedLicenseResponse();

    /**
     * The OS license returned from the adaptation module&#39;s report.
     * 
     */
    @Import(name="osLicense", required=true)
    private String osLicense;

    public String osLicense() {
        return this.osLicense;
    }

    /**
     * The license type that was used in OS adaptation.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private AppliedLicenseResponse() {}

    private AppliedLicenseResponse(AppliedLicenseResponse $) {
        this.osLicense = $.osLicense;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppliedLicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppliedLicenseResponse $;

        public Builder() {
            $ = new AppliedLicenseResponse();
        }

        public Builder(AppliedLicenseResponse defaults) {
            $ = new AppliedLicenseResponse(Objects.requireNonNull(defaults));
        }

        public Builder osLicense(String osLicense) {
            $.osLicense = osLicense;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AppliedLicenseResponse build() {
            $.osLicense = Objects.requireNonNull($.osLicense, "expected parameter 'osLicense' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
