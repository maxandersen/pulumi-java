// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.databricks.inputs.SkuArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceCustomParametersArgs;
import io.pulumi.azurenative.databricks.inputs.WorkspaceProviderAuthorizationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The workspace provider authorizations.
     * 
     */
    @Import(name="authorizations")
      private final @Nullable Output<List<WorkspaceProviderAuthorizationArgs>> authorizations;

    public Output<List<WorkspaceProviderAuthorizationArgs>> authorizations() {
        return this.authorizations == null ? Codegen.empty() : this.authorizations;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The managed resource group Id.
     * 
     */
    @Import(name="managedResourceGroupId", required=true)
      private final Output<String> managedResourceGroupId;

    public Output<String> managedResourceGroupId() {
        return this.managedResourceGroupId;
    }

    /**
     * The workspace's custom parameters.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<WorkspaceCustomParametersArgs> parameters;

    public Output<WorkspaceCustomParametersArgs> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the resource.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> sku() {
        return this.sku == null ? Codegen.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The blob URI where the UI definition file is located.
     * 
     */
    @Import(name="uiDefinitionUri")
      private final @Nullable Output<String> uiDefinitionUri;

    public Output<String> uiDefinitionUri() {
        return this.uiDefinitionUri == null ? Codegen.empty() : this.uiDefinitionUri;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName")
      private final @Nullable Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName == null ? Codegen.empty() : this.workspaceName;
    }

    public WorkspaceArgs(
        @Nullable Output<List<WorkspaceProviderAuthorizationArgs>> authorizations,
        @Nullable Output<String> location,
        Output<String> managedResourceGroupId,
        @Nullable Output<WorkspaceCustomParametersArgs> parameters,
        Output<String> resourceGroupName,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> uiDefinitionUri,
        @Nullable Output<String> workspaceName) {
        this.authorizations = authorizations;
        this.location = location;
        this.managedResourceGroupId = Objects.requireNonNull(managedResourceGroupId, "expected parameter 'managedResourceGroupId' to be non-null");
        this.parameters = parameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.uiDefinitionUri = uiDefinitionUri;
        this.workspaceName = workspaceName;
    }

    private WorkspaceArgs() {
        this.authorizations = Codegen.empty();
        this.location = Codegen.empty();
        this.managedResourceGroupId = Codegen.empty();
        this.parameters = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
        this.uiDefinitionUri = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<WorkspaceProviderAuthorizationArgs>> authorizations;
        private @Nullable Output<String> location;
        private Output<String> managedResourceGroupId;
        private @Nullable Output<WorkspaceCustomParametersArgs> parameters;
        private Output<String> resourceGroupName;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> uiDefinitionUri;
        private @Nullable Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.location = defaults.location;
    	      this.managedResourceGroupId = defaults.managedResourceGroupId;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.uiDefinitionUri = defaults.uiDefinitionUri;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder authorizations(@Nullable Output<List<WorkspaceProviderAuthorizationArgs>> authorizations) {
            this.authorizations = authorizations;
            return this;
        }
        public Builder authorizations(@Nullable List<WorkspaceProviderAuthorizationArgs> authorizations) {
            this.authorizations = Codegen.ofNullable(authorizations);
            return this;
        }
        public Builder authorizations(WorkspaceProviderAuthorizationArgs... authorizations) {
            return authorizations(List.of(authorizations));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managedResourceGroupId(Output<String> managedResourceGroupId) {
            this.managedResourceGroupId = Objects.requireNonNull(managedResourceGroupId);
            return this;
        }
        public Builder managedResourceGroupId(String managedResourceGroupId) {
            this.managedResourceGroupId = Output.of(Objects.requireNonNull(managedResourceGroupId));
            return this;
        }
        public Builder parameters(@Nullable Output<WorkspaceCustomParametersArgs> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable WorkspaceCustomParametersArgs parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }
        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Codegen.ofNullable(sku);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder uiDefinitionUri(@Nullable Output<String> uiDefinitionUri) {
            this.uiDefinitionUri = uiDefinitionUri;
            return this;
        }
        public Builder uiDefinitionUri(@Nullable String uiDefinitionUri) {
            this.uiDefinitionUri = Codegen.ofNullable(uiDefinitionUri);
            return this;
        }
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public Builder workspaceName(@Nullable String workspaceName) {
            this.workspaceName = Codegen.ofNullable(workspaceName);
            return this;
        }        public WorkspaceArgs build() {
            return new WorkspaceArgs(authorizations, location, managedResourceGroupId, parameters, resourceGroupName, sku, tags, uiDefinitionUri, workspaceName);
        }
    }
}
