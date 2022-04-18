// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ShieldedVmIntegrityPolicyResponse {
    /**
     * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
     * 
     */
    private final Boolean updateAutoLearnPolicy;

    @CustomType.Constructor
    private ShieldedVmIntegrityPolicyResponse(@CustomType.Parameter("updateAutoLearnPolicy") Boolean updateAutoLearnPolicy) {
        this.updateAutoLearnPolicy = updateAutoLearnPolicy;
    }

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
     * 
    */
    public Boolean updateAutoLearnPolicy() {
        return this.updateAutoLearnPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedVmIntegrityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean updateAutoLearnPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedVmIntegrityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateAutoLearnPolicy = defaults.updateAutoLearnPolicy;
        }

        public Builder updateAutoLearnPolicy(Boolean updateAutoLearnPolicy) {
            this.updateAutoLearnPolicy = Objects.requireNonNull(updateAutoLearnPolicy);
            return this;
        }        public ShieldedVmIntegrityPolicyResponse build() {
            return new ShieldedVmIntegrityPolicyResponse(updateAutoLearnPolicy);
        }
    }
}
