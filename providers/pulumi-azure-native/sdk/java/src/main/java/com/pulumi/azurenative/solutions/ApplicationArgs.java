// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions;

import com.pulumi.azurenative.solutions.inputs.ApplicationJitAccessPolicyArgs;
import com.pulumi.azurenative.solutions.inputs.IdentityArgs;
import com.pulumi.azurenative.solutions.inputs.PlanArgs;
import com.pulumi.azurenative.solutions.inputs.SkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The fully qualified path of managed application definition Id.
     * 
     */
    @Import(name="applicationDefinitionId")
    private @Nullable Output<String> applicationDefinitionId;

    public Optional<Output<String>> applicationDefinitionId() {
        return Optional.ofNullable(this.applicationDefinitionId);
    }

    /**
     * The name of the managed application.
     * 
     */
    @Import(name="applicationName")
    private @Nullable Output<String> applicationName;

    public Optional<Output<String>> applicationName() {
        return Optional.ofNullable(this.applicationName);
    }

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
     * The managed application Jit access policy.
     * 
     */
    @Import(name="jitAccessPolicy")
    private @Nullable Output<ApplicationJitAccessPolicyArgs> jitAccessPolicy;

    public Optional<Output<ApplicationJitAccessPolicyArgs>> jitAccessPolicy() {
        return Optional.ofNullable(this.jitAccessPolicy);
    }

    /**
     * The kind of the managed application. Allowed values are MarketPlace and ServiceCatalog.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
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
     * The managed resource group Id.
     * 
     */
    @Import(name="managedResourceGroupId")
    private @Nullable Output<String> managedResourceGroupId;

    public Optional<Output<String>> managedResourceGroupId() {
        return Optional.ofNullable(this.managedResourceGroupId);
    }

    /**
     * Name and value pairs that define the managed application parameters. It can be a JObject or a well formed JSON string.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Object> parameters;

    public Optional<Output<Object>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The plan information.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<PlanArgs> plan;

    public Optional<Output<PlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.applicationDefinitionId = $.applicationDefinitionId;
        this.applicationName = $.applicationName;
        this.identity = $.identity;
        this.jitAccessPolicy = $.jitAccessPolicy;
        this.kind = $.kind;
        this.location = $.location;
        this.managedBy = $.managedBy;
        this.managedResourceGroupId = $.managedResourceGroupId;
        this.parameters = $.parameters;
        this.plan = $.plan;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationDefinitionId(@Nullable Output<String> applicationDefinitionId) {
            $.applicationDefinitionId = applicationDefinitionId;
            return this;
        }

        public Builder applicationDefinitionId(String applicationDefinitionId) {
            return applicationDefinitionId(Output.of(applicationDefinitionId));
        }

        public Builder applicationName(@Nullable Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(IdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder jitAccessPolicy(@Nullable Output<ApplicationJitAccessPolicyArgs> jitAccessPolicy) {
            $.jitAccessPolicy = jitAccessPolicy;
            return this;
        }

        public Builder jitAccessPolicy(ApplicationJitAccessPolicyArgs jitAccessPolicy) {
            return jitAccessPolicy(Output.of(jitAccessPolicy));
        }

        public Builder kind(Output<String> kind) {
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

        public Builder managedResourceGroupId(@Nullable Output<String> managedResourceGroupId) {
            $.managedResourceGroupId = managedResourceGroupId;
            return this;
        }

        public Builder managedResourceGroupId(String managedResourceGroupId) {
            return managedResourceGroupId(Output.of(managedResourceGroupId));
        }

        public Builder parameters(@Nullable Output<Object> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Object parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder plan(@Nullable Output<PlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        public Builder plan(PlanArgs plan) {
            return plan(Output.of(plan));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        public ApplicationArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
