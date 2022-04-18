// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString {
    /**
     * A list of item names (`cookies`, `headers`, or `query_strings`).
     * 
     */
    private final List<String> items;

    @CustomType.Constructor
    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString(@CustomType.Parameter("items") List<String> items) {
        this.items = items;
    }

    /**
     * A list of item names (`cookies`, `headers`, or `query_strings`).
     * 
    */
    public List<String> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<String> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfigQueryString(items);
        }
    }
}
