// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityLocationResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackageIssueResponse {
    /**
     * @return The location of the vulnerability.
     * 
     */
    private final VulnerabilityLocationResponse affectedLocation;
    /**
     * @return The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when distro or language system has not yet assigned a severity for this vulnerability.
     * 
     */
    private final String effectiveSeverity;
    /**
     * @return The location of the available fix for vulnerability.
     * 
     */
    private final VulnerabilityLocationResponse fixedLocation;
    /**
     * @return The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    private final String packageType;
    private final String severityName;

    @CustomType.Constructor
    private PackageIssueResponse(
        @CustomType.Parameter("affectedLocation") VulnerabilityLocationResponse affectedLocation,
        @CustomType.Parameter("effectiveSeverity") String effectiveSeverity,
        @CustomType.Parameter("fixedLocation") VulnerabilityLocationResponse fixedLocation,
        @CustomType.Parameter("packageType") String packageType,
        @CustomType.Parameter("severityName") String severityName) {
        this.affectedLocation = affectedLocation;
        this.effectiveSeverity = effectiveSeverity;
        this.fixedLocation = fixedLocation;
        this.packageType = packageType;
        this.severityName = severityName;
    }

    /**
     * @return The location of the vulnerability.
     * 
     */
    public VulnerabilityLocationResponse affectedLocation() {
        return this.affectedLocation;
    }
    /**
     * @return The distro or language system assigned severity for this vulnerability when that is available and note provider assigned severity when distro or language system has not yet assigned a severity for this vulnerability.
     * 
     */
    public String effectiveSeverity() {
        return this.effectiveSeverity;
    }
    /**
     * @return The location of the available fix for vulnerability.
     * 
     */
    public VulnerabilityLocationResponse fixedLocation() {
        return this.fixedLocation;
    }
    /**
     * @return The type of package (e.g. OS, MAVEN, GO).
     * 
     */
    public String packageType() {
        return this.packageType;
    }
    public String severityName() {
        return this.severityName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageIssueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VulnerabilityLocationResponse affectedLocation;
        private String effectiveSeverity;
        private VulnerabilityLocationResponse fixedLocation;
        private String packageType;
        private String severityName;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageIssueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affectedLocation = defaults.affectedLocation;
    	      this.effectiveSeverity = defaults.effectiveSeverity;
    	      this.fixedLocation = defaults.fixedLocation;
    	      this.packageType = defaults.packageType;
    	      this.severityName = defaults.severityName;
        }

        public Builder affectedLocation(VulnerabilityLocationResponse affectedLocation) {
            this.affectedLocation = Objects.requireNonNull(affectedLocation);
            return this;
        }
        public Builder effectiveSeverity(String effectiveSeverity) {
            this.effectiveSeverity = Objects.requireNonNull(effectiveSeverity);
            return this;
        }
        public Builder fixedLocation(VulnerabilityLocationResponse fixedLocation) {
            this.fixedLocation = Objects.requireNonNull(fixedLocation);
            return this;
        }
        public Builder packageType(String packageType) {
            this.packageType = Objects.requireNonNull(packageType);
            return this;
        }
        public Builder severityName(String severityName) {
            this.severityName = Objects.requireNonNull(severityName);
            return this;
        }        public PackageIssueResponse build() {
            return new PackageIssueResponse(affectedLocation, effectiveSeverity, fixedLocation, packageType, severityName);
        }
    }
}
