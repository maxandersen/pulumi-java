// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Association link for a graph global parameter to a node in the graph.
 * 
 */
public final class GraphParameterLinkArgs extends ResourceArgs {

    public static final GraphParameterLinkArgs Empty = new GraphParameterLinkArgs();

    /**
     * The graph node&#39;s identifier
     * 
     */
    @Import(name="nodeId", required=true)
    private Output<String> nodeId;

    /**
     * @return The graph node&#39;s identifier
     * 
     */
    public Output<String> nodeId() {
        return this.nodeId;
    }

    /**
     * The identifier of the node parameter that the global parameter maps to.
     * 
     */
    @Import(name="parameterKey", required=true)
    private Output<String> parameterKey;

    /**
     * @return The identifier of the node parameter that the global parameter maps to.
     * 
     */
    public Output<String> parameterKey() {
        return this.parameterKey;
    }

    private GraphParameterLinkArgs() {}

    private GraphParameterLinkArgs(GraphParameterLinkArgs $) {
        this.nodeId = $.nodeId;
        this.parameterKey = $.parameterKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphParameterLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphParameterLinkArgs $;

        public Builder() {
            $ = new GraphParameterLinkArgs();
        }

        public Builder(GraphParameterLinkArgs defaults) {
            $ = new GraphParameterLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeId The graph node&#39;s identifier
         * 
         * @return builder
         * 
         */
        public Builder nodeId(Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId The graph node&#39;s identifier
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        /**
         * @param parameterKey The identifier of the node parameter that the global parameter maps to.
         * 
         * @return builder
         * 
         */
        public Builder parameterKey(Output<String> parameterKey) {
            $.parameterKey = parameterKey;
            return this;
        }

        /**
         * @param parameterKey The identifier of the node parameter that the global parameter maps to.
         * 
         * @return builder
         * 
         */
        public Builder parameterKey(String parameterKey) {
            return parameterKey(Output.of(parameterKey));
        }

        public GraphParameterLinkArgs build() {
            $.nodeId = Objects.requireNonNull($.nodeId, "expected parameter 'nodeId' to be non-null");
            $.parameterKey = Objects.requireNonNull($.parameterKey, "expected parameter 'parameterKey' to be non-null");
            return $;
        }
    }

}
