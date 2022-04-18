// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The available logging options for a firewall rule.
 * 
 */
public final class FirewallLogConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallLogConfigResponse Empty = new FirewallLogConfigResponse();

    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
     */
    @Import(name="enable", required=true)
      private final Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
     */
    @Import(name="metadata", required=true)
      private final String metadata;

    public String metadata() {
        return this.metadata;
    }

    public FirewallLogConfigResponse(
        Boolean enable,
        String metadata) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
    }

    private FirewallLogConfigResponse() {
        this.enable = null;
        this.metadata = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.metadata = defaults.metadata;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder metadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }        public FirewallLogConfigResponse build() {
            return new FirewallLogConfigResponse(enable, metadata);
        }
    }
}
