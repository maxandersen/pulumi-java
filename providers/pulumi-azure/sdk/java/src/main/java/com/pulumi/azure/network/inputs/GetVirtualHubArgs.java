// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualHubArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualHubArgs Empty = new GetVirtualHubArgs();

    /**
     * The name of the Virtual Hub.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Virtual Hub.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the Virtual Hub exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where the Virtual Hub exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVirtualHubArgs() {}

    private GetVirtualHubArgs(GetVirtualHubArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualHubArgs $;

        public Builder() {
            $ = new GetVirtualHubArgs();
        }

        public Builder(GetVirtualHubArgs defaults) {
            $ = new GetVirtualHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Virtual Hub.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the Virtual Hub exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetVirtualHubArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
