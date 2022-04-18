// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.DiscoveredResponse;
import java.util.Objects;

@CustomType
public final class GrafeasV1beta1DiscoveryDetailsResponse {
    /**
     * Analysis status for the discovered resource.
     * 
     */
    private final DiscoveredResponse discovered;

    @CustomType.Constructor
    private GrafeasV1beta1DiscoveryDetailsResponse(@CustomType.Parameter("discovered") DiscoveredResponse discovered) {
        this.discovered = discovered;
    }

    /**
     * Analysis status for the discovered resource.
     * 
    */
    public DiscoveredResponse discovered() {
        return this.discovered;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DiscoveryDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscoveredResponse discovered;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DiscoveryDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discovered = defaults.discovered;
        }

        public Builder discovered(DiscoveredResponse discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }        public GrafeasV1beta1DiscoveryDetailsResponse build() {
            return new GrafeasV1beta1DiscoveryDetailsResponse(discovered);
        }
    }
}
