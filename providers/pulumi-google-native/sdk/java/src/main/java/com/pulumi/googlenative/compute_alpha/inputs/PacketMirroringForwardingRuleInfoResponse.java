// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringForwardingRuleInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PacketMirroringForwardingRuleInfoResponse Empty = new PacketMirroringForwardingRuleInfoResponse();

    /**
     * Unique identifier for the forwarding rule; defined by the server.
     * 
     */
    @Import(name="canonicalUrl", required=true)
    private String canonicalUrl;

    public String canonicalUrl() {
        return this.canonicalUrl;
    }

    /**
     * Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private PacketMirroringForwardingRuleInfoResponse() {}

    private PacketMirroringForwardingRuleInfoResponse(PacketMirroringForwardingRuleInfoResponse $) {
        this.canonicalUrl = $.canonicalUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringForwardingRuleInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringForwardingRuleInfoResponse $;

        public Builder() {
            $ = new PacketMirroringForwardingRuleInfoResponse();
        }

        public Builder(PacketMirroringForwardingRuleInfoResponse defaults) {
            $ = new PacketMirroringForwardingRuleInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder canonicalUrl(String canonicalUrl) {
            $.canonicalUrl = canonicalUrl;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public PacketMirroringForwardingRuleInfoResponse build() {
            $.canonicalUrl = Objects.requireNonNull($.canonicalUrl, "expected parameter 'canonicalUrl' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
