// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for the NetworkPolicy feature. https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
 * 
 */
public final class NetworkPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkPolicyResponse Empty = new NetworkPolicyResponse();

    /**
     * Whether network policy is enabled on the cluster.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * The selected network policy provider.
     * 
     */
    @Import(name="provider", required=true)
      private final String provider;

    public String provider() {
        return this.provider;
    }

    public NetworkPolicyResponse(
        Boolean enabled,
        String provider) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
    }

    private NetworkPolicyResponse() {
        this.enabled = null;
        this.provider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.provider = defaults.provider;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }        public NetworkPolicyResponse build() {
            return new NetworkPolicyResponse(enabled, provider);
        }
    }
}
