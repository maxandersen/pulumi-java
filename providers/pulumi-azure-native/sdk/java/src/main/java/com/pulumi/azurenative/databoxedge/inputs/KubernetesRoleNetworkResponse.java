// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.azurenative.databoxedge.inputs.CniConfigResponse;
import com.pulumi.azurenative.databoxedge.inputs.LoadBalancerConfigResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Kubernetes role network resource
 * 
 */
public final class KubernetesRoleNetworkResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubernetesRoleNetworkResponse Empty = new KubernetesRoleNetworkResponse();

    /**
     * Cni configuration
     * 
     */
    @Import(name="cniConfig", required=true)
    private CniConfigResponse cniConfig;

    public CniConfigResponse cniConfig() {
        return this.cniConfig;
    }

    /**
     * Load balancer configuration
     * 
     */
    @Import(name="loadBalancerConfig", required=true)
    private LoadBalancerConfigResponse loadBalancerConfig;

    public LoadBalancerConfigResponse loadBalancerConfig() {
        return this.loadBalancerConfig;
    }

    private KubernetesRoleNetworkResponse() {}

    private KubernetesRoleNetworkResponse(KubernetesRoleNetworkResponse $) {
        this.cniConfig = $.cniConfig;
        this.loadBalancerConfig = $.loadBalancerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesRoleNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesRoleNetworkResponse $;

        public Builder() {
            $ = new KubernetesRoleNetworkResponse();
        }

        public Builder(KubernetesRoleNetworkResponse defaults) {
            $ = new KubernetesRoleNetworkResponse(Objects.requireNonNull(defaults));
        }

        public Builder cniConfig(CniConfigResponse cniConfig) {
            $.cniConfig = cniConfig;
            return this;
        }

        public Builder loadBalancerConfig(LoadBalancerConfigResponse loadBalancerConfig) {
            $.loadBalancerConfig = loadBalancerConfig;
            return this;
        }

        public KubernetesRoleNetworkResponse build() {
            $.cniConfig = Objects.requireNonNull($.cniConfig, "expected parameter 'cniConfig' to be non-null");
            $.loadBalancerConfig = Objects.requireNonNull($.loadBalancerConfig, "expected parameter 'loadBalancerConfig' to be non-null");
            return $;
        }
    }

}
