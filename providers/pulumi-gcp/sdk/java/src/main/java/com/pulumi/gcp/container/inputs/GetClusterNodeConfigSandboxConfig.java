// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterNodeConfigSandboxConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterNodeConfigSandboxConfig Empty = new GetClusterNodeConfigSandboxConfig();

    @Import(name="sandboxType", required=true)
    private String sandboxType;

    public String sandboxType() {
        return this.sandboxType;
    }

    private GetClusterNodeConfigSandboxConfig() {}

    private GetClusterNodeConfigSandboxConfig(GetClusterNodeConfigSandboxConfig $) {
        this.sandboxType = $.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterNodeConfigSandboxConfig $;

        public Builder() {
            $ = new GetClusterNodeConfigSandboxConfig();
        }

        public Builder(GetClusterNodeConfigSandboxConfig defaults) {
            $ = new GetClusterNodeConfigSandboxConfig(Objects.requireNonNull(defaults));
        }

        public Builder sandboxType(String sandboxType) {
            $.sandboxType = sandboxType;
            return this;
        }

        public GetClusterNodeConfigSandboxConfig build() {
            $.sandboxType = Objects.requireNonNull($.sandboxType, "expected parameter 'sandboxType' to be non-null");
            return $;
        }
    }

}
