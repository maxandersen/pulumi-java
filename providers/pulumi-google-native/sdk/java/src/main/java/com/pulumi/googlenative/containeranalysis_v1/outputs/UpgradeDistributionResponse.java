// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UpgradeDistributionResponse {
    /**
     * @return The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed. For Windows the classification is one of the category_ids listed at https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * 
     */
    private final String classification;
    /**
     * @return Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
     */
    private final String cpeUri;
    /**
     * @return The cve tied to this Upgrade.
     * 
     */
    private final List<String> cve;
    /**
     * @return The severity as specified by the upstream operating system.
     * 
     */
    private final String severity;

    @CustomType.Constructor
    private UpgradeDistributionResponse(
        @CustomType.Parameter("classification") String classification,
        @CustomType.Parameter("cpeUri") String cpeUri,
        @CustomType.Parameter("cve") List<String> cve,
        @CustomType.Parameter("severity") String severity) {
        this.classification = classification;
        this.cpeUri = cpeUri;
        this.cve = cve;
        this.severity = severity;
    }

    /**
     * @return The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed. For Windows the classification is one of the category_ids listed at https://docs.microsoft.com/en-us/previous-versions/windows/desktop/ff357803(v=vs.85)
     * 
     */
    public String classification() {
        return this.classification;
    }
    /**
     * @return Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
     */
    public String cpeUri() {
        return this.cpeUri;
    }
    /**
     * @return The cve tied to this Upgrade.
     * 
     */
    public List<String> cve() {
        return this.cve;
    }
    /**
     * @return The severity as specified by the upstream operating system.
     * 
     */
    public String severity() {
        return this.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeDistributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String classification;
        private String cpeUri;
        private List<String> cve;
        private String severity;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeDistributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.cpeUri = defaults.cpeUri;
    	      this.cve = defaults.cve;
    	      this.severity = defaults.severity;
        }

        public Builder classification(String classification) {
            this.classification = Objects.requireNonNull(classification);
            return this;
        }
        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder cve(List<String> cve) {
            this.cve = Objects.requireNonNull(cve);
            return this;
        }
        public Builder cve(String... cve) {
            return cve(List.of(cve));
        }
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }        public UpgradeDistributionResponse build() {
            return new UpgradeDistributionResponse(classification, cpeUri, cve, severity);
        }
    }
}
