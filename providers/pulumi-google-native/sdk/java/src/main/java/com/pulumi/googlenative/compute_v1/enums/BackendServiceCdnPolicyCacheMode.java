// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the cache setting for all responses from this backend. The possible values are: USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server. FORCE_CACHE_ALL Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content. CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
     * 
     */
    @EnumType
    public enum BackendServiceCdnPolicyCacheMode {
        /**
         * Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
         * 
         */
        CacheAllStatic("CACHE_ALL_STATIC"),
        /**
         * Cache all content, ignoring any "private", "no-store" or "no-cache" directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content.
         * 
         */
        ForceCacheAll("FORCE_CACHE_ALL"),
        InvalidCacheMode("INVALID_CACHE_MODE"),
        /**
         * Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google's edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server.
         * 
         */
        UseOriginHeaders("USE_ORIGIN_HEADERS");

        private final String value;

        BackendServiceCdnPolicyCacheMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendServiceCdnPolicyCacheMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
