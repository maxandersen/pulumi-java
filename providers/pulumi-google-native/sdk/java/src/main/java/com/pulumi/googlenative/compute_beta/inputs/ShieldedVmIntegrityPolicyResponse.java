// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The policy describes the baseline against which VM instance boot integrity is measured.
 * 
 */
public final class ShieldedVmIntegrityPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ShieldedVmIntegrityPolicyResponse Empty = new ShieldedVmIntegrityPolicyResponse();

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance&#39;s most recent boot.
     * 
     */
    @Import(name="updateAutoLearnPolicy", required=true)
    private Boolean updateAutoLearnPolicy;

    public Boolean updateAutoLearnPolicy() {
        return this.updateAutoLearnPolicy;
    }

    private ShieldedVmIntegrityPolicyResponse() {}

    private ShieldedVmIntegrityPolicyResponse(ShieldedVmIntegrityPolicyResponse $) {
        this.updateAutoLearnPolicy = $.updateAutoLearnPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedVmIntegrityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedVmIntegrityPolicyResponse $;

        public Builder() {
            $ = new ShieldedVmIntegrityPolicyResponse();
        }

        public Builder(ShieldedVmIntegrityPolicyResponse defaults) {
            $ = new ShieldedVmIntegrityPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder updateAutoLearnPolicy(Boolean updateAutoLearnPolicy) {
            $.updateAutoLearnPolicy = updateAutoLearnPolicy;
            return this;
        }

        public ShieldedVmIntegrityPolicyResponse build() {
            $.updateAutoLearnPolicy = Objects.requireNonNull($.updateAutoLearnPolicy, "expected parameter 'updateAutoLearnPolicy' to be non-null");
            return $;
        }
    }

}
