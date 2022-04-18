// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppliedLicenseResponse {
    /**
     * The OS license returned from the adaptation module's report.
     * 
     */
    private final String osLicense;
    /**
     * The license type that was used in OS adaptation.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AppliedLicenseResponse(
        @CustomType.Parameter("osLicense") String osLicense,
        @CustomType.Parameter("type") String type) {
        this.osLicense = osLicense;
        this.type = type;
    }

    /**
     * The OS license returned from the adaptation module's report.
     * 
    */
    public String osLicense() {
        return this.osLicense;
    }
    /**
     * The license type that was used in OS adaptation.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppliedLicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String osLicense;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AppliedLicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osLicense = defaults.osLicense;
    	      this.type = defaults.type;
        }

        public Builder osLicense(String osLicense) {
            this.osLicense = Objects.requireNonNull(osLicense);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AppliedLicenseResponse build() {
            return new AppliedLicenseResponse(osLicense, type);
        }
    }
}
