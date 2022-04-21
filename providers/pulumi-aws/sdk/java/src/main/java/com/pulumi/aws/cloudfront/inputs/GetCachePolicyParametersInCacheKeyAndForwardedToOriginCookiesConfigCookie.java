// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie extends com.pulumi.resources.InvokeArgs {

    public static final GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie Empty = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie();

    /**
     * A list of item names (`cookies`, `headers`, or `query_strings`).
     * 
     */
    @Import(name="items", required=true)
    private List<String> items;

    public List<String> items() {
        return this.items;
    }

    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie() {}

    private GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie $) {
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie $;

        public Builder() {
            $ = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie();
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie defaults) {
            $ = new GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie(Objects.requireNonNull(defaults));
        }

        public Builder items(List<String> items) {
            $.items = items;
            return this;
        }

        public Builder items(String... items) {
            return items(List.of(items));
        }

        public GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookie build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
