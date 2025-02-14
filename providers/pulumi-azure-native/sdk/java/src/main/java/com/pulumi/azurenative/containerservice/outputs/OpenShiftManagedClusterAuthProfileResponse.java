// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterIdentityProviderResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OpenShiftManagedClusterAuthProfileResponse {
    /**
     * @return Type of authentication profile to use.
     * 
     */
    private final @Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders;

    @CustomType.Constructor
    private OpenShiftManagedClusterAuthProfileResponse(@CustomType.Parameter("identityProviders") @Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders) {
        this.identityProviders = identityProviders;
    }

    /**
     * @return Type of authentication profile to use.
     * 
     */
    public List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders() {
        return this.identityProviders == null ? List.of() : this.identityProviders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAuthProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAuthProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProviders = defaults.identityProviders;
        }

        public Builder identityProviders(@Nullable List<OpenShiftManagedClusterIdentityProviderResponse> identityProviders) {
            this.identityProviders = identityProviders;
            return this;
        }
        public Builder identityProviders(OpenShiftManagedClusterIdentityProviderResponse... identityProviders) {
            return identityProviders(List.of(identityProviders));
        }        public OpenShiftManagedClusterAuthProfileResponse build() {
            return new OpenShiftManagedClusterAuthProfileResponse(identityProviders);
        }
    }
}
