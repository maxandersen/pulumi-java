// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListAccountKeysArgs extends InvokeArgs {

    public static final ListAccountKeysArgs Empty = new ListAccountKeysArgs();

    /**
     * The name of the Maps Account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the Maps Account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the Azure Resource Group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure Resource Group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListAccountKeysArgs() {}

    private ListAccountKeysArgs(ListAccountKeysArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListAccountKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListAccountKeysArgs $;

        public Builder() {
            $ = new ListAccountKeysArgs();
        }

        public Builder(ListAccountKeysArgs defaults) {
            $ = new ListAccountKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Maps Account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure Resource Group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListAccountKeysArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
