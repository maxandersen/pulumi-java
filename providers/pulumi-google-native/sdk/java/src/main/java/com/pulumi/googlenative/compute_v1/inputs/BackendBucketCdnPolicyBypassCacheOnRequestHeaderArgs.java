// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<String> headerName;

    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    private BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs() {}

    private BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs(BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs $) {
        this.headerName = $.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs $;

        public Builder() {
            $ = new BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs();
        }

        public Builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs defaults) {
            $ = new BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs build() {
            return $;
        }
    }

}
