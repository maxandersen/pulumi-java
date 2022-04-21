// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NodePoolNodeConfigSandboxConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigSandboxConfigGetArgs Empty = new NodePoolNodeConfigSandboxConfigGetArgs();

    @Import(name="sandboxType", required=true)
    private Output<String> sandboxType;

    public Output<String> sandboxType() {
        return this.sandboxType;
    }

    private NodePoolNodeConfigSandboxConfigGetArgs() {}

    private NodePoolNodeConfigSandboxConfigGetArgs(NodePoolNodeConfigSandboxConfigGetArgs $) {
        this.sandboxType = $.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigSandboxConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigSandboxConfigGetArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigSandboxConfigGetArgs();
        }

        public Builder(NodePoolNodeConfigSandboxConfigGetArgs defaults) {
            $ = new NodePoolNodeConfigSandboxConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder sandboxType(Output<String> sandboxType) {
            $.sandboxType = sandboxType;
            return this;
        }

        public Builder sandboxType(String sandboxType) {
            return sandboxType(Output.of(sandboxType));
        }

        public NodePoolNodeConfigSandboxConfigGetArgs build() {
            $.sandboxType = Objects.requireNonNull($.sandboxType, "expected parameter 'sandboxType' to be non-null");
            return $;
        }
    }

}
