// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServicePrincipalPropertiesResponse {
    /**
     * The service principal client ID
     * 
     */
    private final String clientId;
    /**
     * The service principal secret. This is not returned in response of GET/PUT on the resource. To see this please call listKeys.
     * 
     */
    private final String secret;

    @CustomType.Constructor
    private ServicePrincipalPropertiesResponse(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("secret") String secret) {
        this.clientId = clientId;
        this.secret = secret;
    }

    /**
     * The service principal client ID
     * 
    */
    public String clientId() {
        return this.clientId;
    }
    /**
     * The service principal secret. This is not returned in response of GET/PUT on the resource. To see this please call listKeys.
     * 
    */
    public String secret() {
        return this.secret;
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
