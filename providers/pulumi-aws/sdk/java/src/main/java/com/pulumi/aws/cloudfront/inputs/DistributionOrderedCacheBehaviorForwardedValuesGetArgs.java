// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionOrderedCacheBehaviorForwardedValuesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorForwardedValuesGetArgs Empty = new DistributionOrderedCacheBehaviorForwardedValuesGetArgs();

    /**
     * The forwarded values cookies
     * that specifies how CloudFront handles cookies (maximum one).
     * 
     */
    @Import(name="cookies", required=true)
    private Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies;

    public Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies() {
        return this.cookies;
    }

    /**
     * Specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior. Specify `*` to include all
     * headers.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Indicates whether you want CloudFront to forward
     * query strings to the origin that is associated with this cache behavior.
     * 
     */
    @Import(name="queryString", required=true)
    private Output<Boolean> queryString;

    public Output<Boolean> queryString() {
        return this.queryString;
    }

    /**
     * When specified, along with a value of
     * `true` for `query_string`, all query strings are forwarded, however only the
     * query string keys listed in this argument are cached. When omitted with a
     * value of `true` for `query_string`, all query string keys are cached.
     * 
     */
    @Import(name="queryStringCacheKeys")
    private @Nullable Output<List<String>> queryStringCacheKeys;

    public Optional<Output<List<String>>> queryStringCacheKeys() {
        return Optional.ofNullable(this.queryStringCacheKeys);
    }

    private DistributionOrderedCacheBehaviorForwardedValuesGetArgs() {}

    private DistributionOrderedCacheBehaviorForwardedValuesGetArgs(DistributionOrderedCacheBehaviorForwardedValuesGetArgs $) {
        this.cookies = $.cookies;
        this.headers = $.headers;
        this.queryString = $.queryString;
        this.queryStringCacheKeys = $.queryStringCacheKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionOrderedCacheBehaviorForwardedValuesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionOrderedCacheBehaviorForwardedValuesGetArgs $;

        public Builder() {
            $ = new DistributionOrderedCacheBehaviorForwardedValuesGetArgs();
        }

        public Builder(DistributionOrderedCacheBehaviorForwardedValuesGetArgs defaults) {
            $ = new DistributionOrderedCacheBehaviorForwardedValuesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cookies(Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies) {
            $.cookies = cookies;
            return this;
        }

        public Builder cookies(DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs cookies) {
            return cookies(Output.of(cookies));
        }

        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public Builder queryString(Output<Boolean> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(Boolean queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder queryStringCacheKeys(@Nullable Output<List<String>> queryStringCacheKeys) {
            $.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }

        public Builder queryStringCacheKeys(List<String> queryStringCacheKeys) {
            return queryStringCacheKeys(Output.of(queryStringCacheKeys));
        }

        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }

        public DistributionOrderedCacheBehaviorForwardedValuesGetArgs build() {
            $.cookies = Objects.requireNonNull($.cookies, "expected parameter 'cookies' to be non-null");
            $.queryString = Objects.requireNonNull($.queryString, "expected parameter 'queryString' to be non-null");
            return $;
        }
    }

}
