// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse Empty = new InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse();

    /**
     * The number of seconds to wait for a readiness signal during initialization before timing out.
     * 
     */
    @Import(name="timeoutSec", required=true)
      private final Integer timeoutSec;

    public Integer timeoutSec() {
        return this.timeoutSec;
    }

    public InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse(Integer timeoutSec) {
        this.timeoutSec = Objects.requireNonNull(timeoutSec, "expected parameter 'timeoutSec' to be non-null");
    }

    private InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse() {
        this.timeoutSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder timeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }        public InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse build() {
            return new InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalResponse(timeoutSec);
        }
    }
}
