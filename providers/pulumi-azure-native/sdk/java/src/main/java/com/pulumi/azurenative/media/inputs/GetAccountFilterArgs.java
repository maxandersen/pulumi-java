// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetAccountFilterArgs extends InvokeArgs {

    public static final GetAccountFilterArgs Empty = new GetAccountFilterArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The Account Filter name
     * 
     */
    @Import(name="filterName", required=true)
    private String filterName;

    /**
     * @return The Account Filter name
     * 
     */
    public String filterName() {
        return this.filterName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAccountFilterArgs() {}

    private GetAccountFilterArgs(GetAccountFilterArgs $) {
        this.accountName = $.accountName;
        this.filterName = $.filterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountFilterArgs $;

        public Builder() {
            $ = new GetAccountFilterArgs();
        }

        public Builder(GetAccountFilterArgs defaults) {
            $ = new GetAccountFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param filterName The Account Filter name
         * 
         * @return builder
         * 
         */
        public Builder filterName(String filterName) {
            $.filterName = filterName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAccountFilterArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.filterName = Objects.requireNonNull($.filterName, "expected parameter 'filterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
