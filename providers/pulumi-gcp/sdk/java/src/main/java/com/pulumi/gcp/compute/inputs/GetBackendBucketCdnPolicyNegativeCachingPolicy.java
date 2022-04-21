// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetBackendBucketCdnPolicyNegativeCachingPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendBucketCdnPolicyNegativeCachingPolicy Empty = new GetBackendBucketCdnPolicyNegativeCachingPolicy();

    @Import(name="code", required=true)
    private Integer code;

    public Integer code() {
        return this.code;
    }

    @Import(name="ttl", required=true)
    private Integer ttl;

    public Integer ttl() {
        return this.ttl;
    }

    private GetBackendBucketCdnPolicyNegativeCachingPolicy() {}

    private GetBackendBucketCdnPolicyNegativeCachingPolicy(GetBackendBucketCdnPolicyNegativeCachingPolicy $) {
        this.code = $.code;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendBucketCdnPolicyNegativeCachingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendBucketCdnPolicyNegativeCachingPolicy $;

        public Builder() {
            $ = new GetBackendBucketCdnPolicyNegativeCachingPolicy();
        }

        public Builder(GetBackendBucketCdnPolicyNegativeCachingPolicy defaults) {
            $ = new GetBackendBucketCdnPolicyNegativeCachingPolicy(Objects.requireNonNull(defaults));
        }

        public Builder code(Integer code) {
            $.code = code;
            return this;
        }

        public Builder ttl(Integer ttl) {
            $.ttl = ttl;
            return this;
        }

        public GetBackendBucketCdnPolicyNegativeCachingPolicy build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            return $;
        }
    }

}
