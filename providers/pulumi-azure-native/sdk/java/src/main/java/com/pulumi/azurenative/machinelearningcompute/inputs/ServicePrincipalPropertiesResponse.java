// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Azure service principal used by Kubernetes for configuring load balancers
 * 
 */
public final class ServicePrincipalPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServicePrincipalPropertiesResponse Empty = new ServicePrincipalPropertiesResponse();

    /**
     * The service principal client ID
     * 
     */
    @Import(name="clientId", required=true)
      private final String clientId;

    public String clientId() {
        return this.clientId;
    }

    /**
     * The service principal secret. This is not returned in response of GET/PUT on the resource. To see this please call listKeys.
     * 
     */
    @Import(name="secret", required=true)
      private final String secret;

    public String secret() {
        return this.secret;
    }

    public ServicePrincipalPropertiesResponse(
        String clientId,
        String secret) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private ServicePrincipalPropertiesResponse() {
        this.clientId = null;
        this.secret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }        public ServicePrincipalPropertiesResponse build() {
            return new ServicePrincipalPropertiesResponse(clientId, secret);
        }
    }
}
