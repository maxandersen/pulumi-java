// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.quantum;

import com.pulumi.azurenative.quantum.inputs.ProviderArgs;
import com.pulumi.azurenative.quantum.inputs.QuantumWorkspaceIdentityArgs;
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
     * Managed Identity information.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<QuantumWorkspaceIdentityArgs> identity;

    /**
     * @return Managed Identity information.
     * 
     */
    public Optional<Output<QuantumWorkspaceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
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
     * List of Providers selected for this Workspace
     * 
     */
    @Import(name="providers")
    private @Nullable Output<List<ProviderArgs>> providers;

    /**
     * @return List of Providers selected for this Workspace
     * 
     */
    public Optional<Output<List<ProviderArgs>>> providers() {
        return Optional.ofNullable(this.providers);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * ARM Resource Id of the storage account associated with this workspace.
     * 
     */
    @Import(name="storageAccount")
    private @Nullable Output<String> storageAccount;

    /**
     * @return ARM Resource Id of the storage account associated with this workspace.
     * 
     */
    public Optional<Output<String>> storageAccount() {
        return Optional.ofNullable(this.storageAccount);
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
     * The name of the quantum workspace resource.
     * 
     */
    @Import(name="workspaceName")
    private @Nullable Output<String> workspaceName;

    /**
     * @return The name of the quantum workspace resource.
     * 
     */
    public Optional<Output<String>> workspaceName() {
        return Optional.ofNullable(this.workspaceName);
    }

    private WorkspaceArgs() {}

    private WorkspaceArgs(WorkspaceArgs $) {
        this.identity = $.identity;
        this.location = $.location;
        this.providers = $.providers;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccount = $.storageAccount;
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
         * @param identity Managed Identity information.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<QuantumWorkspaceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity Managed Identity information.
         * 
         * @return builder
         * 
         */
        public Builder identity(QuantumWorkspaceIdentityArgs identity) {
            return identity(Output.of(identity));
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
         * @param providers List of Providers selected for this Workspace
         * 
         * @return builder
         * 
         */
        public Builder providers(@Nullable Output<List<ProviderArgs>> providers) {
            $.providers = providers;
            return this;
        }

        /**
         * @param providers List of Providers selected for this Workspace
         * 
         * @return builder
         * 
         */
        public Builder providers(List<ProviderArgs> providers) {
            return providers(Output.of(providers));
        }

        /**
         * @param providers List of Providers selected for this Workspace
         * 
         * @return builder
         * 
         */
        public Builder providers(ProviderArgs... providers) {
            return providers(List.of(providers));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageAccount ARM Resource Id of the storage account associated with this workspace.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(@Nullable Output<String> storageAccount) {
            $.storageAccount = storageAccount;
            return this;
        }

        /**
         * @param storageAccount ARM Resource Id of the storage account associated with this workspace.
         * 
         * @return builder
         * 
         */
        public Builder storageAccount(String storageAccount) {
            return storageAccount(Output.of(storageAccount));
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
         * @param workspaceName The name of the quantum workspace resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(@Nullable Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the quantum workspace resource.
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
