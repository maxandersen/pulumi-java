// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetManagedHsmArgs extends InvokeArgs {

    public static final GetManagedHsmArgs Empty = new GetManagedHsmArgs();

    /**
     * The name of the managed HSM Pool.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the managed HSM Pool.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group that contains the managed HSM pool.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group that contains the managed HSM pool.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedHsmArgs() {}

    private GetManagedHsmArgs(GetManagedHsmArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedHsmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedHsmArgs $;

        public Builder() {
            $ = new GetManagedHsmArgs();
        }

        public Builder(GetManagedHsmArgs defaults) {
            $ = new GetManagedHsmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the managed HSM Pool.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group that contains the managed HSM pool.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagedHsmArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
