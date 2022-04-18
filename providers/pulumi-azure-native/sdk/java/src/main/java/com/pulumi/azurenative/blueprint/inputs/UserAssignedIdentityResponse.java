// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User-assigned managed identity.
 * 
 */
public final class UserAssignedIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAssignedIdentityResponse Empty = new UserAssignedIdentityResponse();

    /**
     * Client App Id associated with this identity.
     * 
     */
    @Import(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> clientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * Azure Active Directory principal ID associated with this Identity.
     * 
     */
    @Import(name="principalId")
      private final @Nullable String principalId;

    public Optional<String> principalId() {
        return this.principalId == null ? Optional.empty() : Optional.ofNullable(this.principalId);
    }

    public UserAssignedIdentityResponse(
        @Nullable String clientId,
        @Nullable String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    private UserAssignedIdentityResponse() {
        this.clientId = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }        public UserAssignedIdentityResponse build() {
            return new UserAssignedIdentityResponse(clientId, principalId);
        }
    }
}
