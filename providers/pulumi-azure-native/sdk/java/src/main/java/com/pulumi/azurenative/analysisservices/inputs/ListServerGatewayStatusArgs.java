// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListServerGatewayStatusArgs extends InvokeArgs {

    public static final ListServerGatewayStatusArgs Empty = new ListServerGatewayStatusArgs();

    /**
     * The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Analysis Services server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The name of the Analysis Services server.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    private ListServerGatewayStatusArgs() {}

    private ListServerGatewayStatusArgs(ListServerGatewayStatusArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListServerGatewayStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListServerGatewayStatusArgs $;

        public Builder() {
            $ = new ListServerGatewayStatusArgs();
        }

        public Builder(ListServerGatewayStatusArgs defaults) {
            $ = new ListServerGatewayStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given Analysis Services server is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serverName The name of the Analysis Services server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public ListServerGatewayStatusArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
