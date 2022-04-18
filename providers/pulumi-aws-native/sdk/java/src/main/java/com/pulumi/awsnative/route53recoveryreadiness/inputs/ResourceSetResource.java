// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.inputs;

import com.pulumi.awsnative.route53recoveryreadiness.inputs.ResourceSetDNSTargetResource;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource element of a ResourceSet
 * 
 */
public final class ResourceSetResource extends com.pulumi.resources.InvokeArgs {

    public static final ResourceSetResource Empty = new ResourceSetResource();

    /**
     * The component identifier of the resource, generated when DNS target resource is used.
     * 
     */
    @Import(name="componentId")
      private final @Nullable String componentId;

    public Optional<String> componentId() {
        return this.componentId == null ? Optional.empty() : Optional.ofNullable(this.componentId);
    }

    @Import(name="dnsTargetResource")
      private final @Nullable ResourceSetDNSTargetResource dnsTargetResource;

    public Optional<ResourceSetDNSTargetResource> dnsTargetResource() {
        return this.dnsTargetResource == null ? Optional.empty() : Optional.ofNullable(this.dnsTargetResource);
    }

    /**
     * A list of recovery group Amazon Resource Names (ARNs) and cell ARNs that this resource is contained within.
     * 
     */
    @Import(name="readinessScopes")
      private final @Nullable List<String> readinessScopes;

    public List<String> readinessScopes() {
        return this.readinessScopes == null ? List.of() : this.readinessScopes;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS resource.
     * 
     */
    @Import(name="resourceArn")
      private final @Nullable String resourceArn;

    public Optional<String> resourceArn() {
        return this.resourceArn == null ? Optional.empty() : Optional.ofNullable(this.resourceArn);
    }

    public ResourceSetResource(
        @Nullable String componentId,
        @Nullable ResourceSetDNSTargetResource dnsTargetResource,
        @Nullable List<String> readinessScopes,
        @Nullable String resourceArn) {
        this.componentId = componentId;
        this.dnsTargetResource = dnsTargetResource;
        this.readinessScopes = readinessScopes;
        this.resourceArn = resourceArn;
    }

    private ResourceSetResource() {
        this.componentId = null;
        this.dnsTargetResource = null;
        this.readinessScopes = List.of();
        this.resourceArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String componentId;
        private @Nullable ResourceSetDNSTargetResource dnsTargetResource;
        private @Nullable List<String> readinessScopes;
        private @Nullable String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.dnsTargetResource = defaults.dnsTargetResource;
    	      this.readinessScopes = defaults.readinessScopes;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder componentId(@Nullable String componentId) {
            this.componentId = componentId;
            return this;
        }
        public Builder dnsTargetResource(@Nullable ResourceSetDNSTargetResource dnsTargetResource) {
            this.dnsTargetResource = dnsTargetResource;
            return this;
        }
        public Builder readinessScopes(@Nullable List<String> readinessScopes) {
            this.readinessScopes = readinessScopes;
            return this;
        }
        public Builder readinessScopes(String... readinessScopes) {
            return readinessScopes(List.of(readinessScopes));
        }
        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }        public ResourceSetResource build() {
            return new ResourceSetResource(componentId, dnsTargetResource, readinessScopes, resourceArn);
        }
    }
}
