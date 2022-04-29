// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetStaticSitePrivateEndpointConnectionArgs extends InvokeArgs {

    public static final GetStaticSitePrivateEndpointConnectionArgs Empty = new GetStaticSitePrivateEndpointConnectionArgs();

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the static site.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the private endpoint connection.
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    /**
     * @return Name of the private endpoint connection.
     * 
     */
    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetStaticSitePrivateEndpointConnectionArgs() {}

    private GetStaticSitePrivateEndpointConnectionArgs(GetStaticSitePrivateEndpointConnectionArgs $) {
        this.name = $.name;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStaticSitePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStaticSitePrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new GetStaticSitePrivateEndpointConnectionArgs();
        }

        public Builder(GetStaticSitePrivateEndpointConnectionArgs defaults) {
            $ = new GetStaticSitePrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the static site.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param privateEndpointConnectionName Name of the private endpoint connection.
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetStaticSitePrivateEndpointConnectionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
