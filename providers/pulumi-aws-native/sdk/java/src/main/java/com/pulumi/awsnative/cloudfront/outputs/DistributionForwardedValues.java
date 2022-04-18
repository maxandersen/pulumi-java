// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.outputs;

import com.pulumi.awsnative.cloudfront.outputs.DistributionCookies;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionForwardedValues {
    private final @Nullable DistributionCookies cookies;
    private final @Nullable List<String> headers;
    private final Boolean queryString;
    private final @Nullable List<String> queryStringCacheKeys;

    @CustomType.Constructor
    private DistributionForwardedValues(
        @CustomType.Parameter("cookies") @Nullable DistributionCookies cookies,
        @CustomType.Parameter("headers") @Nullable List<String> headers,
        @CustomType.Parameter("queryString") Boolean queryString,
        @CustomType.Parameter("queryStringCacheKeys") @Nullable List<String> queryStringCacheKeys) {
        this.cookies = cookies;
        this.headers = headers;
        this.queryString = queryString;
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    public Optional<DistributionCookies> cookies() {
        return Optional.ofNullable(this.cookies);
    }
    public List<String> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    public Boolean queryString() {
        return this.queryString;
    }
    public List<String> queryStringCacheKeys() {
        return this.queryStringCacheKeys == null ? List.of() : this.queryStringCacheKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionForwardedValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DistributionCookies cookies;
        private @Nullable List<String> headers;
        private Boolean queryString;
        private @Nullable List<String> queryStringCacheKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionForwardedValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.queryString = defaults.queryString;
    	      this.queryStringCacheKeys = defaults.queryStringCacheKeys;
        }

        public Builder cookies(@Nullable DistributionCookies cookies) {
            this.cookies = cookies;
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        public Builder queryString(Boolean queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }
        public Builder queryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }
        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }        public DistributionForwardedValues build() {
            return new DistributionForwardedValues(cookies, headers, queryString, queryStringCacheKeys);
        }
    }
}
