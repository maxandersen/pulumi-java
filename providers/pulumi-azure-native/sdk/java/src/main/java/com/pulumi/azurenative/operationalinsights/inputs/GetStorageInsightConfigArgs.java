// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetStorageInsightConfigArgs extends InvokeArgs {

    public static final GetStorageInsightConfigArgs Empty = new GetStorageInsightConfigArgs();

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

    /**
     * Name of the storageInsightsConfigs resource
     * 
     */
    @Import(name="storageInsightName", required=true)
    private String storageInsightName;

    /**
     * @return Name of the storageInsightsConfigs resource
     * 
     */
    public String storageInsightName() {
        return this.storageInsightName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetStorageInsightConfigArgs() {}

    private GetStorageInsightConfigArgs(GetStorageInsightConfigArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.storageInsightName = $.storageInsightName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageInsightConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageInsightConfigArgs $;

        public Builder() {
            $ = new GetStorageInsightConfigArgs();
        }

        public Builder(GetStorageInsightConfigArgs defaults) {
            $ = new GetStorageInsightConfigArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param storageInsightName Name of the storageInsightsConfigs resource
         * 
         * @return builder
         * 
         */
        public Builder storageInsightName(String storageInsightName) {
            $.storageInsightName = storageInsightName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetStorageInsightConfigArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageInsightName = Objects.requireNonNull($.storageInsightName, "expected parameter 'storageInsightName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
