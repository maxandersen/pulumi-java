// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.resources.inputs.IdentityArgs;
import com.pulumi.azurenative.resources.inputs.PlanArgs;
import com.pulumi.azurenative.resources.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    /**
     * The identity of the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityArgs> identity;

    public Optional<Output<IdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The kind of the resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * ID of the resource that manages this resource.
     * 
     */
    @Import(name="managedBy")
    private @Nullable Output<String> managedBy;

    public Optional<Output<String>> managedBy() {
        return Optional.ofNullable(this.managedBy);
    }

    /**
     * The parent resource identity.
     * 
     */
    @Import(name="parentResourcePath", required=true)
    private Output<String> parentResourcePath;

    public Output<String> parentResourcePath() {
        return this.parentResourcePath;
    }

    /**
     * The plan of the resource.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<PlanArgs> plan;

    public Optional<Output<PlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The resource properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Object> properties;

    public Optional<Output<Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group for the resource. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource to create.
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * The namespace of the resource provider.
     * 
     */
    @Import(name="resourceProviderNamespace", required=true)
    private Output<String> resourceProviderNamespace;

    public Output<String> resourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * The resource type of the resource to create.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * The SKU of the resource.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ResourceArgs() {}

    private ResourceArgs(ResourceArgs $) {
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.managedBy = $.managedBy;
        this.parentResourcePath = $.parentResourcePath;
        this.plan = $.plan;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.resourceProviderNamespace = $.resourceProviderNamespace;
        this.resourceType = $.resourceType;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceArgs $;

        public Builder() {
            $ = new ResourceArgs();
        }

        public Builder(ResourceArgs defaults) {
            $ = new ResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(IdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder managedBy(@Nullable Output<String> managedBy) {
            $.managedBy = managedBy;
            return this;
        }

        public Builder managedBy(String managedBy) {
            return managedBy(Output.of(managedBy));
        }

        public Builder parentResourcePath(Output<String> parentResourcePath) {
            $.parentResourcePath = parentResourcePath;
            return this;
        }

        public Builder parentResourcePath(String parentResourcePath) {
            return parentResourcePath(Output.of(parentResourcePath));
        }

        public Builder plan(@Nullable Output<PlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        public Builder plan(PlanArgs plan) {
            return plan(Output.of(plan));
        }

        public Builder properties(@Nullable Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Object properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public Builder resourceProviderNamespace(Output<String> resourceProviderNamespace) {
            $.resourceProviderNamespace = resourceProviderNamespace;
            return this;
        }

        public Builder resourceProviderNamespace(String resourceProviderNamespace) {
            return resourceProviderNamespace(Output.of(resourceProviderNamespace));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ResourceArgs build() {
            $.parentResourcePath = Objects.requireNonNull($.parentResourcePath, "expected parameter 'parentResourcePath' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceProviderNamespace = Objects.requireNonNull($.resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
