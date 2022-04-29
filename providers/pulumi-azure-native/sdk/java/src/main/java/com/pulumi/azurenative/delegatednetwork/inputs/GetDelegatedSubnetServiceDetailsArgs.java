// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.delegatednetwork.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDelegatedSubnetServiceDetailsArgs extends InvokeArgs {

    public static final GetDelegatedSubnetServiceDetailsArgs Empty = new GetDelegatedSubnetServiceDetailsArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetDelegatedSubnetServiceDetailsArgs() {}

    private GetDelegatedSubnetServiceDetailsArgs(GetDelegatedSubnetServiceDetailsArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDelegatedSubnetServiceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDelegatedSubnetServiceDetailsArgs $;

        public Builder() {
            $ = new GetDelegatedSubnetServiceDetailsArgs();
        }

        public Builder(GetDelegatedSubnetServiceDetailsArgs defaults) {
            $ = new GetDelegatedSubnetServiceDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetDelegatedSubnetServiceDetailsArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
