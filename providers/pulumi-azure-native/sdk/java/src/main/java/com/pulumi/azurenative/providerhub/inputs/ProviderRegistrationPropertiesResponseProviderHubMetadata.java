// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.ProviderHubMetadataResponseProviderAuthentication;
import com.pulumi.azurenative.providerhub.inputs.ProviderHubMetadataResponseThirdPartyProviderAuthorization;
import com.pulumi.azurenative.providerhub.inputs.ResourceProviderAuthorizationResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderRegistrationPropertiesResponseProviderHubMetadata extends com.pulumi.resources.InvokeArgs {

    public static final ProviderRegistrationPropertiesResponseProviderHubMetadata Empty = new ProviderRegistrationPropertiesResponseProviderHubMetadata();

    @Import(name="providerAuthentication")
      private final @Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication;

    public Optional<ProviderHubMetadataResponseProviderAuthentication> providerAuthentication() {
        return this.providerAuthentication == null ? Optional.empty() : Optional.ofNullable(this.providerAuthentication);
    }

    @Import(name="providerAuthorizations")
      private final @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;

    public List<ResourceProviderAuthorizationResponse> providerAuthorizations() {
        return this.providerAuthorizations == null ? List.of() : this.providerAuthorizations;
    }

    @Import(name="thirdPartyProviderAuthorization")
      private final @Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization;

    public Optional<ProviderHubMetadataResponseThirdPartyProviderAuthorization> thirdPartyProviderAuthorization() {
        return this.thirdPartyProviderAuthorization == null ? Optional.empty() : Optional.ofNullable(this.thirdPartyProviderAuthorization);
    }

    public ProviderRegistrationPropertiesResponseProviderHubMetadata(
        @Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication,
        @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations,
        @Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
        this.providerAuthentication = providerAuthentication;
        this.providerAuthorizations = providerAuthorizations;
        this.thirdPartyProviderAuthorization = thirdPartyProviderAuthorization;
    }

    private ProviderRegistrationPropertiesResponseProviderHubMetadata() {
        this.providerAuthentication = null;
        this.providerAuthorizations = List.of();
        this.thirdPartyProviderAuthorization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistrationPropertiesResponseProviderHubMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication;
        private @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;
        private @Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistrationPropertiesResponseProviderHubMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerAuthentication = defaults.providerAuthentication;
    	      this.providerAuthorizations = defaults.providerAuthorizations;
    	      this.thirdPartyProviderAuthorization = defaults.thirdPartyProviderAuthorization;
        }

        public Builder providerAuthentication(@Nullable ProviderHubMetadataResponseProviderAuthentication providerAuthentication) {
            this.providerAuthentication = providerAuthentication;
            return this;
        }
        public Builder providerAuthorizations(@Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations) {
            this.providerAuthorizations = providerAuthorizations;
            return this;
        }
        public Builder providerAuthorizations(ResourceProviderAuthorizationResponse... providerAuthorizations) {
            return providerAuthorizations(List.of(providerAuthorizations));
        }
        public Builder thirdPartyProviderAuthorization(@Nullable ProviderHubMetadataResponseThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
            this.thirdPartyProviderAuthorization = thirdPartyProviderAuthorization;
            return this;
        }        public ProviderRegistrationPropertiesResponseProviderHubMetadata build() {
            return new ProviderRegistrationPropertiesResponseProviderHubMetadata(providerAuthentication, providerAuthorizations, thirdPartyProviderAuthorization);
        }
    }
}
