// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specify CDN TTLs for response error codes.
 * 
 */
public final class BackendServiceCdnPolicyNegativeCachingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceCdnPolicyNegativeCachingPolicyArgs Empty = new BackendServiceCdnPolicyNegativeCachingPolicyArgs();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Integer> code;

    public Optional<Output<Integer>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private BackendServiceCdnPolicyNegativeCachingPolicyArgs() {}

    private BackendServiceCdnPolicyNegativeCachingPolicyArgs(BackendServiceCdnPolicyNegativeCachingPolicyArgs $) {
        this.code = $.code;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceCdnPolicyNegativeCachingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceCdnPolicyNegativeCachingPolicyArgs $;

        public Builder() {
            $ = new BackendServiceCdnPolicyNegativeCachingPolicyArgs();
        }

        public Builder(BackendServiceCdnPolicyNegativeCachingPolicyArgs defaults) {
            $ = new BackendServiceCdnPolicyNegativeCachingPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder code(@Nullable Output<Integer> code) {
            $.code = code;
            return this;
        }

        public Builder code(Integer code) {
            return code(Output.of(code));
        }

        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        public BackendServiceCdnPolicyNegativeCachingPolicyArgs build() {
            return $;
        }
    }

}
