// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.sql.enums.AutoExecuteStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerAdvisorArgs extends ResourceArgs {

    public static final ServerAdvisorArgs Empty = new ServerAdvisorArgs();

    /**
     * The name of the Server Advisor.
     * 
     */
    @Import(name="advisorName")
    private @Nullable Output<String> advisorName;

    /**
     * @return The name of the Server Advisor.
     * 
     */
    public Optional<Output<String>> advisorName() {
        return Optional.ofNullable(this.advisorName);
    }

    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
     * 
     */
    @Import(name="autoExecuteStatus", required=true)
    private Output<AutoExecuteStatus> autoExecuteStatus;

    /**
     * @return Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
     * 
     */
    public Output<AutoExecuteStatus> autoExecuteStatus() {
        return this.autoExecuteStatus;
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
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    private ServerAdvisorArgs() {}

    private ServerAdvisorArgs(ServerAdvisorArgs $) {
        this.advisorName = $.advisorName;
        this.autoExecuteStatus = $.autoExecuteStatus;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerAdvisorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerAdvisorArgs $;

        public Builder() {
            $ = new ServerAdvisorArgs();
        }

        public Builder(ServerAdvisorArgs defaults) {
            $ = new ServerAdvisorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advisorName The name of the Server Advisor.
         * 
         * @return builder
         * 
         */
        public Builder advisorName(@Nullable Output<String> advisorName) {
            $.advisorName = advisorName;
            return this;
        }

        /**
         * @param advisorName The name of the Server Advisor.
         * 
         * @return builder
         * 
         */
        public Builder advisorName(String advisorName) {
            return advisorName(Output.of(advisorName));
        }

        /**
         * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder autoExecuteStatus(Output<AutoExecuteStatus> autoExecuteStatus) {
            $.autoExecuteStatus = autoExecuteStatus;
            return this;
        }

        /**
         * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder autoExecuteStatus(AutoExecuteStatus autoExecuteStatus) {
            return autoExecuteStatus(Output.of(autoExecuteStatus));
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
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public ServerAdvisorArgs build() {
            $.autoExecuteStatus = Objects.requireNonNull($.autoExecuteStatus, "expected parameter 'autoExecuteStatus' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
