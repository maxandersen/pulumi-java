// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Bypass the cache when the specified request headers are present, e.g. Pragma or Authorization headers. Values are case insensitive. The presence of such a header overrides the cache_mode setting.
 * 
 */
public final class BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs Empty = new BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs();

    /**
     * The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
     */
    @Import(name="headerName")
      private final @Nullable Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName == null ? Codegen.empty() : this.headerName;
    }

    public BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs(@Nullable Output<String> headerName) {
        this.headerName = headerName;
    }

    private BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs() {
        this.headerName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            this.headerName = headerName;
            return this;
        }
        public Builder headerName(@Nullable String headerName) {
            this.headerName = Codegen.ofNullable(headerName);
            return this;
        }        public BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs build() {
            return new BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs(headerName);
        }
    }
}
