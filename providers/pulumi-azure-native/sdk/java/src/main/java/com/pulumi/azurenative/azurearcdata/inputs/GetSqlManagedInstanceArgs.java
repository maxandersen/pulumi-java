// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSqlManagedInstanceArgs extends InvokeArgs {

    public static final GetSqlManagedInstanceArgs Empty = new GetSqlManagedInstanceArgs();

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure resource group
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of SQL Managed Instance
     * 
     */
    @Import(name="sqlManagedInstanceName", required=true)
    private String sqlManagedInstanceName;

    /**
     * @return Name of SQL Managed Instance
     * 
     */
    public String sqlManagedInstanceName() {
        return this.sqlManagedInstanceName;
    }

    private GetSqlManagedInstanceArgs() {}

    private GetSqlManagedInstanceArgs(GetSqlManagedInstanceArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.sqlManagedInstanceName = $.sqlManagedInstanceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlManagedInstanceArgs $;

        public Builder() {
            $ = new GetSqlManagedInstanceArgs();
        }

        public Builder(GetSqlManagedInstanceArgs defaults) {
            $ = new GetSqlManagedInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sqlManagedInstanceName Name of SQL Managed Instance
         * 
         * @return builder
         * 
         */
        public Builder sqlManagedInstanceName(String sqlManagedInstanceName) {
            $.sqlManagedInstanceName = sqlManagedInstanceName;
            return this;
        }

        public GetSqlManagedInstanceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sqlManagedInstanceName = Objects.requireNonNull($.sqlManagedInstanceName, "expected parameter 'sqlManagedInstanceName' to be non-null");
            return $;
        }
    }

}
