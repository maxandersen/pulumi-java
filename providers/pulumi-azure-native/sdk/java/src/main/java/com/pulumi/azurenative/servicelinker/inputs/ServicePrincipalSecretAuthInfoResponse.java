// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is servicePrincipal secret
 * 
 */
public final class ServicePrincipalSecretAuthInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ServicePrincipalSecretAuthInfoResponse Empty = new ServicePrincipalSecretAuthInfoResponse();

    /**
     * The authentication type.
     * Expected value is &#39;servicePrincipalSecret&#39;.
     * 
     */
    @Import(name="authType", required=true)
      private final String authType;

    public String authType() {
        return this.authType;
    }

    /**
     * ServicePrincipal application clientId for servicePrincipal auth.
     * 
     */
    @Import(name="clientId", required=true)
      private final String clientId;

    public String clientId() {
        return this.clientId;
    }

    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * Secret for servicePrincipal auth.
     * 
     */
    @Import(name="secret", required=true)
      private final String secret;

    public String secret() {
        return this.secret;
    }

    public ServicePrincipalSecretAuthInfoResponse(
        String authType,
        String clientId,
        String principalId,
        String secret) {
        this.authType = Codegen.stringProp("authType").arg(authType).require();
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private ServicePrincipalSecretAuthInfoResponse() {
        this.authType = null;
        this.clientId = null;
        this.principalId = null;
        this.secret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalSecretAuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authType;
        private String clientId;
        private String principalId;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalSecretAuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
    	      this.secret = defaults.secret;
        }

        public Builder authType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }        public ServicePrincipalSecretAuthInfoResponse build() {
            return new ServicePrincipalSecretAuthInfoResponse(authType, clientId, principalId, secret);
        }
    }
}
