// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OriginRequestPolicyHeadersConfig {
    private final String headerBehavior;
    private final @Nullable List<String> headers;

    @CustomType.Constructor
    private OriginRequestPolicyHeadersConfig(
        @CustomType.Parameter("headerBehavior") String headerBehavior,
        @CustomType.Parameter("headers") @Nullable List<String> headers) {
        this.headerBehavior = headerBehavior;
        this.headers = headers;
    }

    public String headerBehavior() {
        return this.headerBehavior;
    }
    public List<String> headers() {
        return this.headers == null ? List.of() : this.headers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerBehavior;
        private @Nullable List<String> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder headerBehavior(String headerBehavior) {
            this.headerBehavior = Objects.requireNonNull(headerBehavior);
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }        public OriginRequestPolicyHeadersConfig build() {
            return new OriginRequestPolicyHeadersConfig(headerBehavior, headers);
        }
    }
}
