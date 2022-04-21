// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetBackendServiceCdnPolicyNegativeCachingPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendServiceCdnPolicyNegativeCachingPolicy Empty = new GetBackendServiceCdnPolicyNegativeCachingPolicy();

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

    private GetBackendServiceCdnPolicyNegativeCachingPolicy() {}

    private GetBackendServiceCdnPolicyNegativeCachingPolicy(GetBackendServiceCdnPolicyNegativeCachingPolicy $) {
        this.code = $.code;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendServiceCdnPolicyNegativeCachingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendServiceCdnPolicyNegativeCachingPolicy $;

        public Builder() {
            $ = new GetBackendServiceCdnPolicyNegativeCachingPolicy();
        }

        public Builder(GetBackendServiceCdnPolicyNegativeCachingPolicy defaults) {
            $ = new GetBackendServiceCdnPolicyNegativeCachingPolicy(Objects.requireNonNull(defaults));
        }

        public Builder code(Integer code) {
            $.code = code;
            return this;
        }

        public Builder ttl(Integer ttl) {
            $.ttl = ttl;
            return this;
        }

        public GetBackendServiceCdnPolicyNegativeCachingPolicy build() {
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            return $;
        }
    }

}
