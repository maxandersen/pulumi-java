// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyncAgentArgs extends ResourceArgs {

    public static final SyncAgentArgs Empty = new SyncAgentArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server on which the sync agent is hosted.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server on which the sync agent is hosted.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The name of the sync agent.
     * 
     */
    @Import(name="syncAgentName")
    private @Nullable Output<String> syncAgentName;

    /**
     * @return The name of the sync agent.
     * 
     */
    public Optional<Output<String>> syncAgentName() {
        return Optional.ofNullable(this.syncAgentName);
    }

    /**
     * ARM resource id of the sync database in the sync agent.
     * 
     */
    @Import(name="syncDatabaseId")
    private @Nullable Output<String> syncDatabaseId;

    /**
     * @return ARM resource id of the sync database in the sync agent.
     * 
     */
    public Optional<Output<String>> syncDatabaseId() {
        return Optional.ofNullable(this.syncDatabaseId);
    }

    private SyncAgentArgs() {}

    private SyncAgentArgs(SyncAgentArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.syncAgentName = $.syncAgentName;
        this.syncDatabaseId = $.syncDatabaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyncAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyncAgentArgs $;

        public Builder() {
            $ = new SyncAgentArgs();
        }

        public Builder(SyncAgentArgs defaults) {
            $ = new SyncAgentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverName The name of the server on which the sync agent is hosted.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server on which the sync agent is hosted.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param syncAgentName The name of the sync agent.
         * 
         * @return builder
         * 
         */
        public Builder syncAgentName(@Nullable Output<String> syncAgentName) {
            $.syncAgentName = syncAgentName;
            return this;
        }

        /**
         * @param syncAgentName The name of the sync agent.
         * 
         * @return builder
         * 
         */
        public Builder syncAgentName(String syncAgentName) {
            return syncAgentName(Output.of(syncAgentName));
        }

        /**
         * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
         * 
         * @return builder
         * 
         */
        public Builder syncDatabaseId(@Nullable Output<String> syncDatabaseId) {
            $.syncDatabaseId = syncDatabaseId;
            return this;
        }

        /**
         * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
         * 
         * @return builder
         * 
         */
        public Builder syncDatabaseId(String syncDatabaseId) {
            return syncDatabaseId(Output.of(syncDatabaseId));
        }

        public SyncAgentArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
