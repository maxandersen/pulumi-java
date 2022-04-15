// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is userAssignedIdentity
 * 
 */
public final class UserAssignedIdentityAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityAuthInfoArgs Empty = new UserAssignedIdentityAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is 'userAssignedIdentity'.
     * 
     */
    @Import(name="authType", required=true)
      private final Output<String> authType;

    public Output<String> authType() {
        return this.authType;
    }

    /**
     * Client Id for userAssignedIdentity.
     * 
     */
    @Import(name="clientId", required=true)
      private final Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Subscription id for userAssignedIdentity.
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    public UserAssignedIdentityAuthInfoArgs(
        Output<String> authType,
        Output<String> clientId,
        Output<String> subscriptionId) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private UserAssignedIdentityAuthInfoArgs() {
        this.authType = Codegen.empty();
        this.clientId = Codegen.empty();
        this.subscriptionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authType;
        private Output<String> clientId;
        private Output<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder authType(Output<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder authType(String authType) {
            this.authType = Output.of(Objects.requireNonNull(authType));
            return this;
        }
        public Builder clientId(Output<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Output.of(Objects.requireNonNull(clientId));
            return this;
        }
        public Builder subscriptionId(Output<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Output.of(Objects.requireNonNull(subscriptionId));
            return this;
        }        public UserAssignedIdentityAuthInfoArgs build() {
            return new UserAssignedIdentityAuthInfoArgs(authType, clientId, subscriptionId);
        }
    }
}
