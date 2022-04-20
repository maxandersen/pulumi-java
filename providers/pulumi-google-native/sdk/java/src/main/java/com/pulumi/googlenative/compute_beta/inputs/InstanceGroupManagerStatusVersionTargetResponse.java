// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceGroupManagerStatusVersionTargetResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerStatusVersionTargetResponse Empty = new InstanceGroupManagerStatusVersionTargetResponse();

    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances&#39; target version are specified by version field on Instance Group Manager.
     * 
     */
    @Import(name="isReached", required=true)
      private final Boolean isReached;

    public Boolean isReached() {
        return this.isReached;
    }

    public InstanceGroupManagerStatusVersionTargetResponse(Boolean isReached) {
        this.isReached = Objects.requireNonNull(isReached, "expected parameter 'isReached' to be non-null");
    }

    private InstanceGroupManagerStatusVersionTargetResponse() {
        this.isReached = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusVersionTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isReached;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusVersionTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isReached = defaults.isReached;
        }

        public Builder isReached(Boolean isReached) {
            this.isReached = Objects.requireNonNull(isReached);
            return this;
        }        public InstanceGroupManagerStatusVersionTargetResponse build() {
            return new InstanceGroupManagerStatusVersionTargetResponse(isReached);
        }
    }
}
