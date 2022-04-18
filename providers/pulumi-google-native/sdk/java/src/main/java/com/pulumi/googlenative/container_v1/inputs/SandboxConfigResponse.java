// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SandboxConfig contains configurations of the sandbox to use for the node.
 * 
 */
public final class SandboxConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SandboxConfigResponse Empty = new SandboxConfigResponse();

    /**
     * Type of the sandbox to use for the node.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SandboxConfigResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SandboxConfigResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SandboxConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SandboxConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SandboxConfigResponse build() {
            return new SandboxConfigResponse(type);
        }
    }
}
