// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListSecretValueArgs extends InvokeArgs {

    public static final ListSecretValueArgs Empty = new ListSecretValueArgs();

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

    /**
     * The name of the secret resource value which is typically the version identifier for the value.
     * 
     */
    @Import(name="secretValueResourceName", required=true)
    private String secretValueResourceName;

    /**
     * @return The name of the secret resource value which is typically the version identifier for the value.
     * 
     */
    public String secretValueResourceName() {
        return this.secretValueResourceName;
    }

    private ListSecretValueArgs() {}

    private ListSecretValueArgs(ListSecretValueArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.secretResourceName = $.secretResourceName;
        this.secretValueResourceName = $.secretValueResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListSecretValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListSecretValueArgs $;

        public Builder() {
            $ = new ListSecretValueArgs();
        }

        public Builder(ListSecretValueArgs defaults) {
            $ = new ListSecretValueArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param secretValueResourceName The name of the secret resource value which is typically the version identifier for the value.
         * 
         * @return builder
         * 
         */
        public Builder secretValueResourceName(String secretValueResourceName) {
            $.secretValueResourceName = secretValueResourceName;
            return this;
        }

        public ListSecretValueArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.secretResourceName = Objects.requireNonNull($.secretResourceName, "expected parameter 'secretResourceName' to be non-null");
            $.secretValueResourceName = Objects.requireNonNull($.secretValueResourceName, "expected parameter 'secretValueResourceName' to be non-null");
            return $;
        }
    }

}
