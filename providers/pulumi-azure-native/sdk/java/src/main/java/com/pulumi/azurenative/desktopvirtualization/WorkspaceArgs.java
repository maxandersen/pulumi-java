// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization;

import com.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetIdentityArgs;
import com.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetPlanArgs;
import com.pulumi.azurenative.desktopvirtualization.inputs.ResourceModelWithAllowedPropertySetSkuArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * List of applicationGroup resource Ids.
     * 
     */
    @Import(name="applicationGroupReferences")
    private @Nullable Output<List<String>> applicationGroupReferences;

    /**
     * @return List of applicationGroup resource Ids.
     * 
     */
    public Optional<Output<List<String>>> applicationGroupReferences() {
        return Optional.ofNullable(this.applicationGroupReferences);
    }

    /**
     * Description of Workspace.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of Workspace.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Friendly name of Workspace.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Friendly name of Workspace.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    @Import(name="identity")
    private @Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity;

    public Optional<Output<ResourceModelWithAllowedPropertySetIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    @Import(name="managedBy")
    private @Nullable Output<String> managedBy;

    /**
     * @return The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
     * 
     */
    public Optional<Output<String>> managedBy() {
        return Optional.ofNullable(this.managedBy);
    }

    @Import(name="plan")
    private @Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan;

    public Optional<Output<ResourceModelWithAllowedPropertySetPlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="sku")
    private @Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku;

    public Optional<Output<ResourceModelWithAllowedPropertySetSkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName")
    private @Nullable Output<String> workspaceName;

    /**
     * @return The name of the workspace
     * 
     */
    public Optional<Output<String>> workspaceName() {
        return Optional.ofNullable(this.workspaceName);
    }

    private WorkspaceArgs() {}

    private WorkspaceArgs(WorkspaceArgs $) {
        this.applicationGroupReferences = $.applicationGroupReferences;
        this.description = $.description;
        this.friendlyName = $.friendlyName;
        this.identity = $.identity;
        this.kind = $.kind;
        this.location = $.location;
        this.managedBy = $.managedBy;
        this.plan = $.plan;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceArgs $;

        public Builder() {
            $ = new WorkspaceArgs();
        }

        public Builder(WorkspaceArgs defaults) {
            $ = new WorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGroupReferences List of applicationGroup resource Ids.
         * 
         * @return builder
         * 
         */
        public Builder applicationGroupReferences(@Nullable Output<List<String>> applicationGroupReferences) {
            $.applicationGroupReferences = applicationGroupReferences;
            return this;
        }

        /**
         * @param applicationGroupReferences List of applicationGroup resource Ids.
         * 
         * @return builder
         * 
         */
        public Builder applicationGroupReferences(List<String> applicationGroupReferences) {
            return applicationGroupReferences(Output.of(applicationGroupReferences));
        }

        /**
         * @param applicationGroupReferences List of applicationGroup resource Ids.
         * 
         * @return builder
         * 
         */
        public Builder applicationGroupReferences(String... applicationGroupReferences) {
            return applicationGroupReferences(List.of(applicationGroupReferences));
        }

        /**
         * @param description Description of Workspace.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of Workspace.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param friendlyName Friendly name of Workspace.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Friendly name of Workspace.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        public Builder identity(@Nullable Output<ResourceModelWithAllowedPropertySetIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ResourceModelWithAllowedPropertySetIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managedBy The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
         * 
         * @return builder
         * 
         */
        public Builder managedBy(@Nullable Output<String> managedBy) {
            $.managedBy = managedBy;
            return this;
        }

        /**
         * @param managedBy The fully qualified resource ID of the resource that manages this resource. Indicates if this resource is managed by another Azure resource. If this is present, complete mode deployment will not delete the resource if it is removed from the template since it is managed by another resource.
         * 
         * @return builder
         * 
         */
        public Builder managedBy(String managedBy) {
            return managedBy(Output.of(managedBy));
        }

        public Builder plan(@Nullable Output<ResourceModelWithAllowedPropertySetPlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        public Builder plan(ResourceModelWithAllowedPropertySetPlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(@Nullable Output<ResourceModelWithAllowedPropertySetSkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(ResourceModelWithAllowedPropertySetSkuArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public WorkspaceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
