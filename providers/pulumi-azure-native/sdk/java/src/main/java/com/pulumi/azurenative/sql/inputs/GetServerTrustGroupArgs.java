// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetServerTrustGroupArgs extends InvokeArgs {

    public static final GetServerTrustGroupArgs Empty = new GetServerTrustGroupArgs();

    /**
     * The name of the region where the resource is located.
     * 
     */
    @Import(name="locationName", required=true)
    private String locationName;

    /**
     * @return The name of the region where the resource is located.
     * 
     */
    public String locationName() {
        return this.locationName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server trust group.
     * 
     */
    @Import(name="serverTrustGroupName", required=true)
    private String serverTrustGroupName;

    /**
     * @return The name of the server trust group.
     * 
     */
    public String serverTrustGroupName() {
        return this.serverTrustGroupName;
    }

    private GetServerTrustGroupArgs() {}

    private GetServerTrustGroupArgs(GetServerTrustGroupArgs $) {
        this.locationName = $.locationName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverTrustGroupName = $.serverTrustGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerTrustGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerTrustGroupArgs $;

        public Builder() {
            $ = new GetServerTrustGroupArgs();
        }

        public Builder(GetServerTrustGroupArgs defaults) {
            $ = new GetServerTrustGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationName The name of the region where the resource is located.
         * 
         * @return builder
         * 
         */
        public Builder locationName(String locationName) {
            $.locationName = locationName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serverTrustGroupName The name of the server trust group.
         * 
         * @return builder
         * 
         */
        public Builder serverTrustGroupName(String serverTrustGroupName) {
            $.serverTrustGroupName = serverTrustGroupName;
            return this;
        }

        public GetServerTrustGroupArgs build() {
            $.locationName = Objects.requireNonNull($.locationName, "expected parameter 'locationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverTrustGroupName = Objects.requireNonNull($.serverTrustGroupName, "expected parameter 'serverTrustGroupName' to be non-null");
            return $;
        }
    }

}
