// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionUrlRewriteGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionUrlRewriteGetArgs Empty = new URLMapDefaultRouteActionUrlRewriteGetArgs();

    /**
     * Prior to forwarding the request to the selected service, the request&#39;s host header is replaced
     * with contents of hostRewrite.
     * The value must be between 1 and 255 characters.
     * 
     */
    @Import(name="hostRewrite")
      private final @Nullable Output<String> hostRewrite;

    public Output<String> hostRewrite() {
        return this.hostRewrite == null ? Codegen.empty() : this.hostRewrite;
    }

    /**
     * Prior to forwarding the request to the selected backend service, the matching portion of the
     * request&#39;s path is replaced by pathPrefixRewrite.
     * The value must be between 1 and 1024 characters.
     * 
     */
    @Import(name="pathPrefixRewrite")
      private final @Nullable Output<String> pathPrefixRewrite;

    public Output<String> pathPrefixRewrite() {
        return this.pathPrefixRewrite == null ? Codegen.empty() : this.pathPrefixRewrite;
    }

    public URLMapDefaultRouteActionUrlRewriteGetArgs(
        @Nullable Output<String> hostRewrite,
        @Nullable Output<String> pathPrefixRewrite) {
        this.hostRewrite = hostRewrite;
        this.pathPrefixRewrite = pathPrefixRewrite;
    }

    private URLMapDefaultRouteActionUrlRewriteGetArgs() {
        this.hostRewrite = Codegen.empty();
        this.pathPrefixRewrite = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionUrlRewriteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostRewrite;
        private @Nullable Output<String> pathPrefixRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionUrlRewriteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
        }

        public Builder hostRewrite(@Nullable Output<String> hostRewrite) {
            this.hostRewrite = hostRewrite;
            return this;
        }
        public Builder hostRewrite(@Nullable String hostRewrite) {
            this.hostRewrite = Codegen.ofNullable(hostRewrite);
            return this;
        }
        public Builder pathPrefixRewrite(@Nullable Output<String> pathPrefixRewrite) {
            this.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }
        public Builder pathPrefixRewrite(@Nullable String pathPrefixRewrite) {
            this.pathPrefixRewrite = Codegen.ofNullable(pathPrefixRewrite);
            return this;
        }        public URLMapDefaultRouteActionUrlRewriteGetArgs build() {
            return new URLMapDefaultRouteActionUrlRewriteGetArgs(hostRewrite, pathPrefixRewrite);
        }
    }
}
