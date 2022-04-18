// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicelinker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is userAssignedIdentity
 * 
 */
public final class UserAssignedIdentityAuthInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAssignedIdentityAuthInfoResponse Empty = new UserAssignedIdentityAuthInfoResponse();

    /**
     * The authentication type.
     * Expected value is 'userAssignedIdentity'.
     * 
     */
    @Import(name="authType", required=true)
      private final String authType;

    public String authType() {
        return this.authType;
    }

    /**
     * Client Id for userAssignedIdentity.
     * 
     */
    @Import(name="clientId", required=true)
      private final String clientId;

    public String clientId() {
        return this.clientId;
    }

    /**
     * Subscription id for userAssignedIdentity.
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final String subscriptionId;

    public String subscriptionId() {
        return this.subscriptionId;
    }

    public UserAssignedIdentityAuthInfoResponse(
        String authType,
        String clientId,
        String subscriptionId) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private UserAssignedIdentityAuthInfoResponse() {
        this.authType = null;
        this.clientId = null;
        this.subscriptionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityAuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authType;
        private String clientId;
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityAuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder authType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }        public UserAssignedIdentityAuthInfoResponse build() {
            return new UserAssignedIdentityAuthInfoResponse(authType, clientId, subscriptionId);
        }
    }
}
