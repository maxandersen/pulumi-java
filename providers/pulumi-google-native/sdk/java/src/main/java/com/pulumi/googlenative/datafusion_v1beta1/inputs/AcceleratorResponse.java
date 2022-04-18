// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Identifies Data Fusion accelerators for an instance.
 * 
 */
public final class AcceleratorResponse extends com.pulumi.resources.InvokeArgs {

    public static final AcceleratorResponse Empty = new AcceleratorResponse();

    /**
     * The type of an accelator for a CDF instance.
     * 
     */
    @Import(name="acceleratorType", required=true)
      private final String acceleratorType;

    public String acceleratorType() {
        return this.acceleratorType;
    }

    public AcceleratorResponse(String acceleratorType) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
    }

    private AcceleratorResponse() {
        this.acceleratorType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }        public AcceleratorResponse build() {
            return new AcceleratorResponse(acceleratorType);
        }
    }
}
