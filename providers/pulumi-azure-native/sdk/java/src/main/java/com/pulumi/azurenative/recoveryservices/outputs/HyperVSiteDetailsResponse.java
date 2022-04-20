// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HyperVSiteDetailsResponse {
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;HyperVSite&#39;.
     * 
     */
    private final String instanceType;

    @CustomType.Constructor
    private HyperVSiteDetailsResponse(@CustomType.Parameter("instanceType") String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;HyperVSite&#39;.
     * 
    */
    public String instanceType() {
        return this.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVSiteDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVSiteDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }        public HyperVSiteDetailsResponse build() {
            return new HyperVSiteDetailsResponse(instanceType);
        }
    }
}
