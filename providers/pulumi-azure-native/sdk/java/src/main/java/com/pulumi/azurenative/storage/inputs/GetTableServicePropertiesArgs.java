// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetTableServicePropertiesArgs extends InvokeArgs {

    public static final GetTableServicePropertiesArgs Empty = new GetTableServicePropertiesArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Table Service within the specified storage account. Table Service Name must be &#39;default&#39;
     * 
     */
    @Import(name="tableServiceName", required=true)
    private String tableServiceName;

    /**
     * @return The name of the Table Service within the specified storage account. Table Service Name must be &#39;default&#39;
     * 
     */
    public String tableServiceName() {
        return this.tableServiceName;
    }

    private GetTableServicePropertiesArgs() {}

    private GetTableServicePropertiesArgs(GetTableServicePropertiesArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.tableServiceName = $.tableServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableServicePropertiesArgs $;

        public Builder() {
            $ = new GetTableServicePropertiesArgs();
        }

        public Builder(GetTableServicePropertiesArgs defaults) {
            $ = new GetTableServicePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param tableServiceName The name of the Table Service within the specified storage account. Table Service Name must be &#39;default&#39;
         * 
         * @return builder
         * 
         */
        public Builder tableServiceName(String tableServiceName) {
            $.tableServiceName = tableServiceName;
            return this;
        }

        public GetTableServicePropertiesArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.tableServiceName = Objects.requireNonNull($.tableServiceName, "expected parameter 'tableServiceName' to be non-null");
            return $;
        }
    }

}
