// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListDatabaseKeysArgs extends InvokeArgs {

    public static final ListDatabaseKeysArgs Empty = new ListDatabaseKeysArgs();

    /**
     * The name of the RedisEnterprise cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the RedisEnterprise cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The name of the database.
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

    private ListDatabaseKeysArgs() {}

    private ListDatabaseKeysArgs(ListDatabaseKeysArgs $) {
        this.clusterName = $.clusterName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListDatabaseKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListDatabaseKeysArgs $;

        public Builder() {
            $ = new ListDatabaseKeysArgs();
        }

        public Builder(ListDatabaseKeysArgs defaults) {
            $ = new ListDatabaseKeysArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the RedisEnterprise cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param databaseName The name of the database.
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

        public ListDatabaseKeysArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
