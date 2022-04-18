// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.inputs;

import com.pulumi.azurenative.providerhub.inputs.ServiceTreeInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceProviderManifestPropertiesResponseManagement extends com.pulumi.resources.InvokeArgs {

    public static final ResourceProviderManifestPropertiesResponseManagement Empty = new ResourceProviderManifestPropertiesResponseManagement();

    @Import(name="incidentContactEmail")
      private final @Nullable String incidentContactEmail;

    public Optional<String> incidentContactEmail() {
        return this.incidentContactEmail == null ? Optional.empty() : Optional.ofNullable(this.incidentContactEmail);
    }

    @Import(name="incidentRoutingService")
      private final @Nullable String incidentRoutingService;

    public Optional<String> incidentRoutingService() {
        return this.incidentRoutingService == null ? Optional.empty() : Optional.ofNullable(this.incidentRoutingService);
    }

    @Import(name="incidentRoutingTeam")
      private final @Nullable String incidentRoutingTeam;

    public Optional<String> incidentRoutingTeam() {
        return this.incidentRoutingTeam == null ? Optional.empty() : Optional.ofNullable(this.incidentRoutingTeam);
    }

    @Import(name="manifestOwners")
      private final @Nullable List<String> manifestOwners;

    public List<String> manifestOwners() {
        return this.manifestOwners == null ? List.of() : this.manifestOwners;
    }

    @Import(name="resourceAccessPolicy")
      private final @Nullable String resourceAccessPolicy;

    public Optional<String> resourceAccessPolicy() {
        return this.resourceAccessPolicy == null ? Optional.empty() : Optional.ofNullable(this.resourceAccessPolicy);
    }

    @Import(name="resourceAccessRoles")
      private final @Nullable List<Object> resourceAccessRoles;

    public List<Object> resourceAccessRoles() {
        return this.resourceAccessRoles == null ? List.of() : this.resourceAccessRoles;
    }

    @Import(name="schemaOwners")
      private final @Nullable List<String> schemaOwners;

    public List<String> schemaOwners() {
        return this.schemaOwners == null ? List.of() : this.schemaOwners;
    }

    @Import(name="serviceTreeInfos")
      private final @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos;

    public List<ServiceTreeInfoResponse> serviceTreeInfos() {
        return this.serviceTreeInfos == null ? List.of() : this.serviceTreeInfos;
    }

    public ResourceProviderManifestPropertiesResponseManagement(
        @Nullable String incidentContactEmail,
        @Nullable String incidentRoutingService,
        @Nullable String incidentRoutingTeam,
        @Nullable List<String> manifestOwners,
        @Nullable String resourceAccessPolicy,
        @Nullable List<Object> resourceAccessRoles,
        @Nullable List<String> schemaOwners,
        @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos) {
        this.incidentContactEmail = incidentContactEmail;
        this.incidentRoutingService = incidentRoutingService;
        this.incidentRoutingTeam = incidentRoutingTeam;
        this.manifestOwners = manifestOwners;
        this.resourceAccessPolicy = resourceAccessPolicy;
        this.resourceAccessRoles = resourceAccessRoles;
        this.schemaOwners = schemaOwners;
        this.serviceTreeInfos = serviceTreeInfos;
    }

    private ResourceProviderManifestPropertiesResponseManagement() {
        this.incidentContactEmail = null;
        this.incidentRoutingService = null;
        this.incidentRoutingTeam = null;
        this.manifestOwners = List.of();
        this.resourceAccessPolicy = null;
        this.resourceAccessRoles = List.of();
        this.schemaOwners = List.of();
        this.serviceTreeInfos = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceProviderManifestPropertiesResponseManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String incidentContactEmail;
        private @Nullable String incidentRoutingService;
        private @Nullable String incidentRoutingTeam;
        private @Nullable List<String> manifestOwners;
        private @Nullable String resourceAccessPolicy;
        private @Nullable List<Object> resourceAccessRoles;
        private @Nullable List<String> schemaOwners;
        private @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceProviderManifestPropertiesResponseManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.incidentContactEmail = defaults.incidentContactEmail;
    	      this.incidentRoutingService = defaults.incidentRoutingService;
    	      this.incidentRoutingTeam = defaults.incidentRoutingTeam;
    	      this.manifestOwners = defaults.manifestOwners;
    	      this.resourceAccessPolicy = defaults.resourceAccessPolicy;
    	      this.resourceAccessRoles = defaults.resourceAccessRoles;
    	      this.schemaOwners = defaults.schemaOwners;
    	      this.serviceTreeInfos = defaults.serviceTreeInfos;
        }

        public Builder incidentContactEmail(@Nullable String incidentContactEmail) {
            this.incidentContactEmail = incidentContactEmail;
            return this;
        }
        public Builder incidentRoutingService(@Nullable String incidentRoutingService) {
            this.incidentRoutingService = incidentRoutingService;
            return this;
        }
        public Builder incidentRoutingTeam(@Nullable String incidentRoutingTeam) {
            this.incidentRoutingTeam = incidentRoutingTeam;
            return this;
        }
        public Builder manifestOwners(@Nullable List<String> manifestOwners) {
            this.manifestOwners = manifestOwners;
            return this;
        }
        public Builder manifestOwners(String... manifestOwners) {
            return manifestOwners(List.of(manifestOwners));
        }
        public Builder resourceAccessPolicy(@Nullable String resourceAccessPolicy) {
            this.resourceAccessPolicy = resourceAccessPolicy;
            return this;
        }
        public Builder resourceAccessRoles(@Nullable List<Object> resourceAccessRoles) {
            this.resourceAccessRoles = resourceAccessRoles;
            return this;
        }
        public Builder resourceAccessRoles(Object... resourceAccessRoles) {
            return resourceAccessRoles(List.of(resourceAccessRoles));
        }
        public Builder schemaOwners(@Nullable List<String> schemaOwners) {
            this.schemaOwners = schemaOwners;
            return this;
        }
        public Builder schemaOwners(String... schemaOwners) {
            return schemaOwners(List.of(schemaOwners));
        }
        public Builder serviceTreeInfos(@Nullable List<ServiceTreeInfoResponse> serviceTreeInfos) {
            this.serviceTreeInfos = serviceTreeInfos;
            return this;
        }
        public Builder serviceTreeInfos(ServiceTreeInfoResponse... serviceTreeInfos) {
            return serviceTreeInfos(List.of(serviceTreeInfos));
        }        public ResourceProviderManifestPropertiesResponseManagement build() {
            return new ResourceProviderManifestPropertiesResponseManagement(incidentContactEmail, incidentRoutingService, incidentRoutingTeam, manifestOwners, resourceAccessPolicy, resourceAccessRoles, schemaOwners, serviceTreeInfos);
        }
    }
}
