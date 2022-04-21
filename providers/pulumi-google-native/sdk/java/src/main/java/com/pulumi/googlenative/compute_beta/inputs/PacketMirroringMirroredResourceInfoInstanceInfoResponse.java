// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringMirroredResourceInfoInstanceInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PacketMirroringMirroredResourceInfoInstanceInfoResponse Empty = new PacketMirroringMirroredResourceInfoInstanceInfoResponse();

    /**
     * Unique identifier for the instance; defined by the server.
     * 
     */
    @Import(name="canonicalUrl", required=true)
    private String canonicalUrl;

    public String canonicalUrl() {
        return this.canonicalUrl;
    }

    /**
     * Resource URL to the virtual machine instance which is being mirrored.
     * 
     */
    @Import(name="url", required=true)
    private String url;

    public String url() {
        return this.url;
    }

    private PacketMirroringMirroredResourceInfoInstanceInfoResponse() {}

    private PacketMirroringMirroredResourceInfoInstanceInfoResponse(PacketMirroringMirroredResourceInfoInstanceInfoResponse $) {
        this.canonicalUrl = $.canonicalUrl;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringMirroredResourceInfoInstanceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringMirroredResourceInfoInstanceInfoResponse $;

        public Builder() {
            $ = new PacketMirroringMirroredResourceInfoInstanceInfoResponse();
        }

        public Builder(PacketMirroringMirroredResourceInfoInstanceInfoResponse defaults) {
            $ = new PacketMirroringMirroredResourceInfoInstanceInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder canonicalUrl(String canonicalUrl) {
            $.canonicalUrl = canonicalUrl;
            return this;
        }

        public Builder url(String url) {
            $.url = url;
            return this;
        }

        public PacketMirroringMirroredResourceInfoInstanceInfoResponse build() {
            $.canonicalUrl = Objects.requireNonNull($.canonicalUrl, "expected parameter 'canonicalUrl' to be non-null");
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
