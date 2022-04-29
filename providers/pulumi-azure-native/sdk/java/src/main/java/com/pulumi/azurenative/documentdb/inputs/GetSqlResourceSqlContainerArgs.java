// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSqlResourceSqlContainerArgs extends InvokeArgs {

    public static final GetSqlResourceSqlContainerArgs Empty = new GetSqlResourceSqlContainerArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Cosmos DB database account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB container name.
     * 
     */
    @Import(name="containerName", required=true)
    private String containerName;

    /**
     * @return Cosmos DB container name.
     * 
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Cosmos DB database name.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return Cosmos DB database name.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

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

    private GetSqlResourceSqlContainerArgs() {}

    private GetSqlResourceSqlContainerArgs(GetSqlResourceSqlContainerArgs $) {
        this.accountName = $.accountName;
        this.containerName = $.containerName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlResourceSqlContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlResourceSqlContainerArgs $;

        public Builder() {
            $ = new GetSqlResourceSqlContainerArgs();
        }

        public Builder(GetSqlResourceSqlContainerArgs defaults) {
            $ = new GetSqlResourceSqlContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Cosmos DB database account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param containerName Cosmos DB container name.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param databaseName Cosmos DB database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
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

        public GetSqlResourceSqlContainerArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
