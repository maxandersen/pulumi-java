// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service Endpoint policy definitions.
 * 
 */
public final class ServiceEndpointPolicyDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceEndpointPolicyDefinitionResponse Empty = new ServiceEndpointPolicyDefinitionResponse();

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the service endpoint policy definition resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Service endpoint name.
     * 
     */
    @Import(name="service")
      private final @Nullable String service;

    public Optional<String> service() {
        return this.service == null ? Optional.empty() : Optional.ofNullable(this.service);
    }

    /**
     * A list of service resources.
     * 
     */
    @Import(name="serviceResources")
      private final @Nullable List<String> serviceResources;

    public List<String> serviceResources() {
        return this.serviceResources == null ? List.of() : this.serviceResources;
    }

    public ServiceEndpointPolicyDefinitionResponse(
        @Nullable String description,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable String service,
        @Nullable List<String> serviceResources) {
        this.description = description;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.service = service;
        this.serviceResources = serviceResources;
    }

    private ServiceEndpointPolicyDefinitionResponse() {
        this.description = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.service = null;
        this.serviceResources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPolicyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable String service;
        private @Nullable List<String> serviceResources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPolicyDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.service = defaults.service;
    	      this.serviceResources = defaults.serviceResources;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        public Builder serviceResources(@Nullable List<String> serviceResources) {
            this.serviceResources = serviceResources;
            return this;
        }
        public Builder serviceResources(String... serviceResources) {
            return serviceResources(List.of(serviceResources));
        }        public ServiceEndpointPolicyDefinitionResponse build() {
            return new ServiceEndpointPolicyDefinitionResponse(description, etag, id, name, provisioningState, service, serviceResources);
        }
    }
}
