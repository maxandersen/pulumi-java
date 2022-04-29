// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetMongoDBResourceMongoDBCollectionArgs extends InvokeArgs {

    public static final GetMongoDBResourceMongoDBCollectionArgs Empty = new GetMongoDBResourceMongoDBCollectionArgs();

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
     * Cosmos DB collection name.
     * 
     */
    @Import(name="collectionName", required=true)
    private String collectionName;

    /**
     * @return Cosmos DB collection name.
     * 
     */
    public String collectionName() {
        return this.collectionName;
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

    private GetMongoDBResourceMongoDBCollectionArgs() {}

    private GetMongoDBResourceMongoDBCollectionArgs(GetMongoDBResourceMongoDBCollectionArgs $) {
        this.accountName = $.accountName;
        this.collectionName = $.collectionName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMongoDBResourceMongoDBCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMongoDBResourceMongoDBCollectionArgs $;

        public Builder() {
            $ = new GetMongoDBResourceMongoDBCollectionArgs();
        }

        public Builder(GetMongoDBResourceMongoDBCollectionArgs defaults) {
            $ = new GetMongoDBResourceMongoDBCollectionArgs(Objects.requireNonNull(defaults));
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
         * @param collectionName Cosmos DB collection name.
         * 
         * @return builder
         * 
         */
        public Builder collectionName(String collectionName) {
            $.collectionName = collectionName;
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

        public GetMongoDBResourceMongoDBCollectionArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.collectionName = Objects.requireNonNull($.collectionName, "expected parameter 'collectionName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
