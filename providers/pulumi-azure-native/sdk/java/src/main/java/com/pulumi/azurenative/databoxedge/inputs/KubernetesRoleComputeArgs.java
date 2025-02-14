// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Kubernetes role compute resource
 * 
 */
public final class KubernetesRoleComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesRoleComputeArgs Empty = new KubernetesRoleComputeArgs();

    /**
     * VM profile
     * 
     */
    @Import(name="vmProfile", required=true)
    private Output<String> vmProfile;

    /**
     * @return VM profile
     * 
     */
    public Output<String> vmProfile() {
        return this.vmProfile;
    }

    private KubernetesRoleComputeArgs() {}

    private KubernetesRoleComputeArgs(KubernetesRoleComputeArgs $) {
        this.vmProfile = $.vmProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesRoleComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesRoleComputeArgs $;

        public Builder() {
            $ = new KubernetesRoleComputeArgs();
        }

        public Builder(KubernetesRoleComputeArgs defaults) {
            $ = new KubernetesRoleComputeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vmProfile VM profile
         * 
         * @return builder
         * 
         */
        public Builder vmProfile(Output<String> vmProfile) {
            $.vmProfile = vmProfile;
            return this;
        }

        /**
         * @param vmProfile VM profile
         * 
         * @return builder
         * 
         */
        public Builder vmProfile(String vmProfile) {
            return vmProfile(Output.of(vmProfile));
        }

        public KubernetesRoleComputeArgs build() {
            $.vmProfile = Objects.requireNonNull($.vmProfile, "expected parameter 'vmProfile' to be non-null");
            return $;
        }
    }

}
