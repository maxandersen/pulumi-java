// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.LightHouseAuthorizationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderHubMetadataThirdPartyProviderAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderHubMetadataThirdPartyProviderAuthorizationArgs Empty = new ProviderHubMetadataThirdPartyProviderAuthorizationArgs();

    @Import(name="authorizations")
    private @Nullable Output<List<LightHouseAuthorizationArgs>> authorizations;

    public Optional<Output<List<LightHouseAuthorizationArgs>>> authorizations() {
        return Optional.ofNullable(this.authorizations);
    }

    @Import(name="managedByTenantId")
    private @Nullable Output<String> managedByTenantId;

    public Optional<Output<String>> managedByTenantId() {
        return Optional.ofNullable(this.managedByTenantId);
    }

    private ProviderHubMetadataThirdPartyProviderAuthorizationArgs() {}

    private ProviderHubMetadataThirdPartyProviderAuthorizationArgs(ProviderHubMetadataThirdPartyProviderAuthorizationArgs $) {
        this.authorizations = $.authorizations;
        this.managedByTenantId = $.managedByTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderHubMetadataThirdPartyProviderAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderHubMetadataThirdPartyProviderAuthorizationArgs $;

        public Builder() {
            $ = new ProviderHubMetadataThirdPartyProviderAuthorizationArgs();
        }

        public Builder(ProviderHubMetadataThirdPartyProviderAuthorizationArgs defaults) {
            $ = new ProviderHubMetadataThirdPartyProviderAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizations(@Nullable Output<List<LightHouseAuthorizationArgs>> authorizations) {
            $.authorizations = authorizations;
            return this;
        }

        public Builder authorizations(List<LightHouseAuthorizationArgs> authorizations) {
            return authorizations(Output.of(authorizations));
        }

        public Builder authorizations(LightHouseAuthorizationArgs... authorizations) {
            return authorizations(List.of(authorizations));
        }

        public Builder managedByTenantId(@Nullable Output<String> managedByTenantId) {
            $.managedByTenantId = managedByTenantId;
            return this;
        }

        public Builder managedByTenantId(String managedByTenantId) {
            return managedByTenantId(Output.of(managedByTenantId));
        }

        public ProviderHubMetadataThirdPartyProviderAuthorizationArgs build() {
            return $;
        }
    }

}
