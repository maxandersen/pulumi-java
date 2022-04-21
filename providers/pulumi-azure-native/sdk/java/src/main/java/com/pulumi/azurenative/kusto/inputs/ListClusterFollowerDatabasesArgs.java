// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListClusterFollowerDatabasesArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListClusterFollowerDatabasesArgs Empty = new ListClusterFollowerDatabasesArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListClusterFollowerDatabasesArgs() {}

    private ListClusterFollowerDatabasesArgs(ListClusterFollowerDatabasesArgs $) {
        this.clusterName = $.clusterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListClusterFollowerDatabasesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListClusterFollowerDatabasesArgs $;

        public Builder() {
            $ = new ListClusterFollowerDatabasesArgs();
        }

        public Builder(ListClusterFollowerDatabasesArgs defaults) {
            $ = new ListClusterFollowerDatabasesArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListClusterFollowerDatabasesArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
