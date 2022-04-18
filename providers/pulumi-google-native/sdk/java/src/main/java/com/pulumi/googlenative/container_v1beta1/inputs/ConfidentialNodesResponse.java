// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * ConfidentialNodes is configuration for the confidential nodes feature, which makes nodes run on confidential VMs.
 * 
 */
public final class ConfidentialNodesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfidentialNodesResponse Empty = new ConfidentialNodesResponse();

    /**
     * Whether Confidential Nodes feature is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    public ConfidentialNodesResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private ConfidentialNodesResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfidentialNodesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfidentialNodesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public ConfidentialNodesResponse build() {
            return new ConfidentialNodesResponse(enabled);
        }
    }
}
