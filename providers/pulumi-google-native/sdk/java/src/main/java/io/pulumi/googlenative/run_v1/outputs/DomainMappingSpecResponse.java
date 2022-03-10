// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DomainMappingSpecResponse {
    /**
     * The mode of the certificate.
     * 
     */
    private final String certificateMode;
    /**
     * If set, the mapping will override any mapping set before this spec was set. It is recommended that the user leaves this empty to receive an error warning about a potential conflict and only set it once the respective UI has given such a warning.
     * 
     */
    private final Boolean forceOverride;
    /**
     * The name of the Knative Route that this DomainMapping applies to. The route must exist.
     * 
     */
    private final String routeName;

    @OutputCustomType.Constructor
    private DomainMappingSpecResponse(
        @OutputCustomType.Parameter("certificateMode") String certificateMode,
        @OutputCustomType.Parameter("forceOverride") Boolean forceOverride,
        @OutputCustomType.Parameter("routeName") String routeName) {
        this.certificateMode = certificateMode;
        this.forceOverride = forceOverride;
        this.routeName = routeName;
    }

    /**
     * The mode of the certificate.
     * 
    */
    public String getCertificateMode() {
        return this.certificateMode;
    }
    /**
     * If set, the mapping will override any mapping set before this spec was set. It is recommended that the user leaves this empty to receive an error warning about a potential conflict and only set it once the respective UI has given such a warning.
     * 
    */
    public Boolean getForceOverride() {
        return this.forceOverride;
    }
    /**
     * The name of the Knative Route that this DomainMapping applies to. The route must exist.
     * 
    */
    public String getRouteName() {
        return this.routeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateMode;
        private Boolean forceOverride;
        private String routeName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMode = defaults.certificateMode;
    	      this.forceOverride = defaults.forceOverride;
    	      this.routeName = defaults.routeName;
        }

        public Builder setCertificateMode(String certificateMode) {
            this.certificateMode = Objects.requireNonNull(certificateMode);
            return this;
        }

        public Builder setForceOverride(Boolean forceOverride) {
            this.forceOverride = Objects.requireNonNull(forceOverride);
            return this;
        }

        public Builder setRouteName(String routeName) {
            this.routeName = Objects.requireNonNull(routeName);
            return this;
        }
        public DomainMappingSpecResponse build() {
            return new DomainMappingSpecResponse(certificateMode, forceOverride, routeName);
        }
    }
}
