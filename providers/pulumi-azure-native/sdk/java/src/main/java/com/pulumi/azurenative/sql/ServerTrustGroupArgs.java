// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.inputs.ServerInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerTrustGroupArgs extends ResourceArgs {

    public static final ServerTrustGroupArgs Empty = new ServerTrustGroupArgs();

    /**
     * Group members information for the server trust group.
     * 
     */
    @Import(name="groupMembers", required=true)
    private Output<List<ServerInfoArgs>> groupMembers;

    /**
     * @return Group members information for the server trust group.
     * 
     */
    public Output<List<ServerInfoArgs>> groupMembers() {
        return this.groupMembers;
    }

    /**
     * The name of the region where the resource is located.
     * 
     */
    @Import(name="locationName", required=true)
    private Output<String> locationName;

    /**
     * @return The name of the region where the resource is located.
     * 
     */
    public Output<String> locationName() {
        return this.locationName;
    }

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
     * The name of the server trust group.
     * 
     */
    @Import(name="serverTrustGroupName")
    private @Nullable Output<String> serverTrustGroupName;

    /**
     * @return The name of the server trust group.
     * 
     */
    public Optional<Output<String>> serverTrustGroupName() {
        return Optional.ofNullable(this.serverTrustGroupName);
    }

    /**
     * Trust scope of the server trust group.
     * 
     */
    @Import(name="trustScopes", required=true)
    private Output<List<String>> trustScopes;

    /**
     * @return Trust scope of the server trust group.
     * 
     */
    public Output<List<String>> trustScopes() {
        return this.trustScopes;
    }

    private ServerTrustGroupArgs() {}

    private ServerTrustGroupArgs(ServerTrustGroupArgs $) {
        this.groupMembers = $.groupMembers;
        this.locationName = $.locationName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverTrustGroupName = $.serverTrustGroupName;
        this.trustScopes = $.trustScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerTrustGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerTrustGroupArgs $;

        public Builder() {
            $ = new ServerTrustGroupArgs();
        }

        public Builder(ServerTrustGroupArgs defaults) {
            $ = new ServerTrustGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupMembers Group members information for the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder groupMembers(Output<List<ServerInfoArgs>> groupMembers) {
            $.groupMembers = groupMembers;
            return this;
        }

        /**
         * @param groupMembers Group members information for the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder groupMembers(List<ServerInfoArgs> groupMembers) {
            return groupMembers(Output.of(groupMembers));
        }

        /**
         * @param groupMembers Group members information for the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder groupMembers(ServerInfoArgs... groupMembers) {
            return groupMembers(List.of(groupMembers));
        }

        /**
         * @param locationName The name of the region where the resource is located.
         * 
         * @return builder
         * 
         */
        public Builder locationName(Output<String> locationName) {
            $.locationName = locationName;
            return this;
        }

        /**
         * @param locationName The name of the region where the resource is located.
         * 
         * @return builder
         * 
         */
        public Builder locationName(String locationName) {
            return locationName(Output.of(locationName));
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
         * @param serverTrustGroupName The name of the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder serverTrustGroupName(@Nullable Output<String> serverTrustGroupName) {
            $.serverTrustGroupName = serverTrustGroupName;
            return this;
        }

        /**
         * @param serverTrustGroupName The name of the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder serverTrustGroupName(String serverTrustGroupName) {
            return serverTrustGroupName(Output.of(serverTrustGroupName));
        }

        /**
         * @param trustScopes Trust scope of the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder trustScopes(Output<List<String>> trustScopes) {
            $.trustScopes = trustScopes;
            return this;
        }

        /**
         * @param trustScopes Trust scope of the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder trustScopes(List<String> trustScopes) {
            return trustScopes(Output.of(trustScopes));
        }

        /**
         * @param trustScopes Trust scope of the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder trustScopes(String... trustScopes) {
            return trustScopes(List.of(trustScopes));
        }

        public ServerTrustGroupArgs build() {
            $.groupMembers = Objects.requireNonNull($.groupMembers, "expected parameter 'groupMembers' to be non-null");
            $.locationName = Objects.requireNonNull($.locationName, "expected parameter 'locationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.trustScopes = Objects.requireNonNull($.trustScopes, "expected parameter 'trustScopes' to be non-null");
            return $;
        }
    }

}
