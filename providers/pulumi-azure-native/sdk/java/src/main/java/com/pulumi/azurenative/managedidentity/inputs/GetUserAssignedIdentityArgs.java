// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managedidentity.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetUserAssignedIdentityArgs extends InvokeArgs {

    public static final GetUserAssignedIdentityArgs Empty = new GetUserAssignedIdentityArgs();

    /**
     * The name of the Resource Group to which the identity belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group to which the identity belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the identity resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the identity resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetUserAssignedIdentityArgs() {}

    private GetUserAssignedIdentityArgs(GetUserAssignedIdentityArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserAssignedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserAssignedIdentityArgs $;

        public Builder() {
            $ = new GetUserAssignedIdentityArgs();
        }

        public Builder(GetUserAssignedIdentityArgs defaults) {
            $ = new GetUserAssignedIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Resource Group to which the identity belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the identity resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetUserAssignedIdentityArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
