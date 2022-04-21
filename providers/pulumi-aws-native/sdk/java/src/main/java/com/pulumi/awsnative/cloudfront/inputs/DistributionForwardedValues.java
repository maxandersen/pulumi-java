// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionCookies;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionForwardedValues extends com.pulumi.resources.InvokeArgs {

    public static final DistributionForwardedValues Empty = new DistributionForwardedValues();

    @Import(name="cookies")
    private @Nullable DistributionCookies cookies;

    public Optional<DistributionCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    @Import(name="headers")
    private @Nullable List<String> headers;

    public Optional<List<String>> headers() {
        return Optional.ofNullable(this.headers);
    }

    @Import(name="queryString", required=true)
    private Boolean queryString;

    public Boolean queryString() {
        return this.queryString;
    }

    @Import(name="queryStringCacheKeys")
    private @Nullable List<String> queryStringCacheKeys;

    public Optional<List<String>> queryStringCacheKeys() {
        return Optional.ofNullable(this.queryStringCacheKeys);
    }

    private DistributionForwardedValues() {}

    private DistributionForwardedValues(DistributionForwardedValues $) {
        this.cookies = $.cookies;
        this.headers = $.headers;
        this.queryString = $.queryString;
        this.queryStringCacheKeys = $.queryStringCacheKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionForwardedValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionForwardedValues $;

        public Builder() {
            $ = new DistributionForwardedValues();
        }

        public Builder(DistributionForwardedValues defaults) {
            $ = new DistributionForwardedValues(Objects.requireNonNull(defaults));
        }

        public Builder cookies(@Nullable DistributionCookies cookies) {
            $.cookies = cookies;
            return this;
        }

        public Builder headers(@Nullable List<String> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public Builder queryString(Boolean queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            $.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }

        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }

        public DistributionForwardedValues build() {
            $.queryString = Objects.requireNonNull($.queryString, "expected parameter 'queryString' to be non-null");
            return $;
        }
    }

}
