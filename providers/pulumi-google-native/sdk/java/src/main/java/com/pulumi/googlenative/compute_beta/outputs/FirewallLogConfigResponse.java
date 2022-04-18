// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallLogConfigResponse {
    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
     */
    private final Boolean enable;
    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
     */
    private final String metadata;

    @CustomType.Constructor
    private FirewallLogConfigResponse(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("metadata") String metadata) {
        this.enable = enable;
        this.metadata = metadata;
    }

    /**
     * This field denotes whether to enable logging for a particular firewall rule.
     * 
    */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
    */
    public String metadata() {
        return this.metadata;
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
