// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedStorageAccountState extends com.pulumi.resources.ResourceArgs {

    public static final LinkedStorageAccountState Empty = new LinkedStorageAccountState();

    /**
     * The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are &#34;customlogs&#34;, &#34;azurewatson&#34;, &#34;query&#34;, &#34;ingestion&#34; and &#34;alerts&#34;. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    @Import(name="dataSourceType")
    private @Nullable Output<String> dataSourceType;

    /**
     * @return The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are &#34;customlogs&#34;, &#34;azurewatson&#34;, &#34;query&#34;, &#34;ingestion&#34; and &#34;alerts&#34;. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    public Optional<Output<String>> dataSourceType() {
        return Optional.ofNullable(this.dataSourceType);
    }

    /**
     * The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The storage account resource ids to be linked.
     * 
     */
    @Import(name="storageAccountIds")
    private @Nullable Output<List<String>> storageAccountIds;

    /**
     * @return The storage account resource ids to be linked.
     * 
     */
    public Optional<Output<List<String>>> storageAccountIds() {
        return Optional.ofNullable(this.storageAccountIds);
    }

    /**
     * The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    @Import(name="workspaceResourceId")
    private @Nullable Output<String> workspaceResourceId;

    /**
     * @return The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
     * 
     */
    public Optional<Output<String>> workspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    private LinkedStorageAccountState() {}

    private LinkedStorageAccountState(LinkedStorageAccountState $) {
        this.dataSourceType = $.dataSourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccountIds = $.storageAccountIds;
        this.workspaceResourceId = $.workspaceResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedStorageAccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedStorageAccountState $;

        public Builder() {
            $ = new LinkedStorageAccountState();
        }

        public Builder(LinkedStorageAccountState defaults) {
            $ = new LinkedStorageAccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataSourceType The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are &#34;customlogs&#34;, &#34;azurewatson&#34;, &#34;query&#34;, &#34;ingestion&#34; and &#34;alerts&#34;. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(@Nullable Output<String> dataSourceType) {
            $.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * @param dataSourceType The data source type which should be used for this Log Analytics Linked Storage Account. Possible values are &#34;customlogs&#34;, &#34;azurewatson&#34;, &#34;query&#34;, &#34;ingestion&#34; and &#34;alerts&#34;. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(String dataSourceType) {
            return dataSourceType(Output.of(dataSourceType));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Linked Storage Account should exist. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageAccountIds The storage account resource ids to be linked.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIds(@Nullable Output<List<String>> storageAccountIds) {
            $.storageAccountIds = storageAccountIds;
            return this;
        }

        /**
         * @param storageAccountIds The storage account resource ids to be linked.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIds(List<String> storageAccountIds) {
            return storageAccountIds(Output.of(storageAccountIds));
        }

        /**
         * @param storageAccountIds The storage account resource ids to be linked.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountIds(String... storageAccountIds) {
            return storageAccountIds(List.of(storageAccountIds));
        }

        /**
         * @param workspaceResourceId The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceResourceId(@Nullable Output<String> workspaceResourceId) {
            $.workspaceResourceId = workspaceResourceId;
            return this;
        }

        /**
         * @param workspaceResourceId The resource ID of the Log Analytics Workspace. Changing this forces a new Log Analytics Linked Storage Account to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceResourceId(String workspaceResourceId) {
            return workspaceResourceId(Output.of(workspaceResourceId));
        }

        public LinkedStorageAccountState build() {
            return $;
        }
    }

}
