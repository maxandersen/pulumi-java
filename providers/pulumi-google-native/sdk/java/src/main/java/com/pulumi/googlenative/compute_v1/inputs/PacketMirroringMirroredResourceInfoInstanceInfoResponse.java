// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

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
      private final String canonicalUrl;

    public String canonicalUrl() {
        return this.canonicalUrl;
    }

    /**
     * Resource URL to the virtual machine instance which is being mirrored.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    public PacketMirroringMirroredResourceInfoInstanceInfoResponse(
        String canonicalUrl,
        String url) {
        this.canonicalUrl = Objects.requireNonNull(canonicalUrl, "expected parameter 'canonicalUrl' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private PacketMirroringMirroredResourceInfoInstanceInfoResponse() {
        this.canonicalUrl = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoInstanceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourceInfoInstanceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.url = defaults.url;
        }

        public Builder canonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public PacketMirroringMirroredResourceInfoInstanceInfoResponse build() {
            return new PacketMirroringMirroredResourceInfoInstanceInfoResponse(canonicalUrl, url);
        }
    }
}
