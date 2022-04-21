// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs();

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`.
     * 
     */
    @Import(name="headerBehavior")
    private @Nullable Output<String> headerBehavior;

    public Optional<Output<String>> headerBehavior() {
        return Optional.ofNullable(this.headerBehavior);
    }

    /**
     * Object that contains a list of header names. See Items for more information.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs> headers;

    public Optional<Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs>> headers() {
        return Optional.ofNullable(this.headers);
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs() {}

    private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs $) {
        this.headerBehavior = $.headerBehavior;
        this.headers = $.headers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs $;

        public Builder() {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs();
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs defaults) {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerBehavior(@Nullable Output<String> headerBehavior) {
            $.headerBehavior = headerBehavior;
            return this;
        }

        public Builder headerBehavior(String headerBehavior) {
            return headerBehavior(Output.of(headerBehavior));
        }

        public Builder headers(@Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigHeadersGetArgs headers) {
            return headers(Output.of(headers));
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfigGetArgs build() {
            return $;
        }
    }

}
