// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecretArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    /**
     * Azure resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Azure resource group name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the secret resource.
     * 
     */
    @Import(name="secretResourceName", required=true)
    private String secretResourceName;

    /**
     * @return The name of the secret resource.
     * 
     */
    public String secretResourceName() {
        return this.secretResourceName;
    }

    private GetSecretArgs() {}

    private GetSecretArgs(GetSecretArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.secretResourceName = $.secretResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretArgs $;

        public Builder() {
            $ = new GetSecretArgs();
        }

        public Builder(GetSecretArgs defaults) {
            $ = new GetSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName Azure resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param secretResourceName The name of the secret resource.
         * 
         * @return builder
         * 
         */
        public Builder secretResourceName(String secretResourceName) {
            $.secretResourceName = secretResourceName;
            return this;
        }

        public GetSecretArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.secretResourceName = Objects.requireNonNull($.secretResourceName, "expected parameter 'secretResourceName' to be non-null");
            return $;
        }
    }

}
