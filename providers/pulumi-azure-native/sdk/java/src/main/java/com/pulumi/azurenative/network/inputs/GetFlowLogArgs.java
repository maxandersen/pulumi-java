// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetFlowLogArgs extends InvokeArgs {

    public static final GetFlowLogArgs Empty = new GetFlowLogArgs();

    /**
     * The name of the flow log resource.
     * 
     */
    @Import(name="flowLogName", required=true)
    private String flowLogName;

    /**
     * @return The name of the flow log resource.
     * 
     */
    public String flowLogName() {
        return this.flowLogName;
    }

    /**
     * The name of the network watcher.
     * 
     */
    @Import(name="networkWatcherName", required=true)
    private String networkWatcherName;

    /**
     * @return The name of the network watcher.
     * 
     */
    public String networkWatcherName() {
        return this.networkWatcherName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFlowLogArgs() {}

    private GetFlowLogArgs(GetFlowLogArgs $) {
        this.flowLogName = $.flowLogName;
        this.networkWatcherName = $.networkWatcherName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlowLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlowLogArgs $;

        public Builder() {
            $ = new GetFlowLogArgs();
        }

        public Builder(GetFlowLogArgs defaults) {
            $ = new GetFlowLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flowLogName The name of the flow log resource.
         * 
         * @return builder
         * 
         */
        public Builder flowLogName(String flowLogName) {
            $.flowLogName = flowLogName;
            return this;
        }

        /**
         * @param networkWatcherName The name of the network watcher.
         * 
         * @return builder
         * 
         */
        public Builder networkWatcherName(String networkWatcherName) {
            $.networkWatcherName = networkWatcherName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFlowLogArgs build() {
            $.flowLogName = Objects.requireNonNull($.flowLogName, "expected parameter 'flowLogName' to be non-null");
            $.networkWatcherName = Objects.requireNonNull($.networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
