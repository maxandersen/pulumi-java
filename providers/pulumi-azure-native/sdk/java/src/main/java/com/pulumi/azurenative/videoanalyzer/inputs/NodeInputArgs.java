// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Describes an input signal to be used on a pipeline node.
 * 
 */
public final class NodeInputArgs extends ResourceArgs {

    public static final NodeInputArgs Empty = new NodeInputArgs();

    /**
     * The name of the upstream node in the pipeline which output is used as input of the current node.
     * 
     */
    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    /**
     * @return The name of the upstream node in the pipeline which output is used as input of the current node.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }

    private NodeInputArgs() {}

    private NodeInputArgs(NodeInputArgs $) {
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeInputArgs $;

        public Builder() {
            $ = new NodeInputArgs();
        }

        public Builder(NodeInputArgs defaults) {
            $ = new NodeInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeName The name of the upstream node in the pipeline which output is used as input of the current node.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The name of the upstream node in the pipeline which output is used as input of the current node.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public NodeInputArgs build() {
            $.nodeName = Objects.requireNonNull($.nodeName, "expected parameter 'nodeName' to be non-null");
            return $;
        }
    }

}
