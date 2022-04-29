// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListClusterLanguageExtensionsArgs extends InvokeArgs {

    public static final ListClusterLanguageExtensionsArgs Empty = new ListClusterLanguageExtensionsArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListClusterLanguageExtensionsArgs() {}

    private ListClusterLanguageExtensionsArgs(ListClusterLanguageExtensionsArgs $) {
        this.clusterName = $.clusterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListClusterLanguageExtensionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListClusterLanguageExtensionsArgs $;

        public Builder() {
            $ = new ListClusterLanguageExtensionsArgs();
        }

        public Builder(ListClusterLanguageExtensionsArgs defaults) {
            $ = new ListClusterLanguageExtensionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListClusterLanguageExtensionsArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
