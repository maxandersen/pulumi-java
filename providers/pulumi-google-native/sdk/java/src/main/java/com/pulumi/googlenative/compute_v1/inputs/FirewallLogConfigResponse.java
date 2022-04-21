// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

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
    private Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    /**
     * This field can only be specified for a particular firewall rule if logging is enabled for that rule. This field denotes whether to include or exclude metadata for firewall logs.
     * 
     */
    @Import(name="metadata", required=true)
    private String metadata;

    public String metadata() {
        return this.metadata;
    }

    private FirewallLogConfigResponse() {}

    private FirewallLogConfigResponse(FirewallLogConfigResponse $) {
        this.enable = $.enable;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallLogConfigResponse $;

        public Builder() {
            $ = new FirewallLogConfigResponse();
        }

        public Builder(FirewallLogConfigResponse defaults) {
            $ = new FirewallLogConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder enable(Boolean enable) {
            $.enable = enable;
            return this;
        }

        public Builder metadata(String metadata) {
            $.metadata = metadata;
            return this;
        }

        public FirewallLogConfigResponse build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            $.metadata = Objects.requireNonNull($.metadata, "expected parameter 'metadata' to be non-null");
            return $;
        }
    }

}
