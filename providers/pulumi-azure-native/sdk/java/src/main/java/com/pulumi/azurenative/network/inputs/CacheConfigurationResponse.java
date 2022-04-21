// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Caching settings for a caching-type route. To disable caching, do not provide a cacheConfiguration object.
 * 
 */
public final class CacheConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final CacheConfigurationResponse Empty = new CacheConfigurationResponse();

    /**
     * The duration for which the content needs to be cached. Allowed format is in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year
     * 
     */
    @Import(name="cacheDuration")
    private @Nullable String cacheDuration;

    public Optional<String> cacheDuration() {
        return Optional.ofNullable(this.cacheDuration);
    }

    /**
     * Whether to use dynamic compression for cached content
     * 
     */
    @Import(name="dynamicCompression")
    private @Nullable String dynamicCompression;

    public Optional<String> dynamicCompression() {
        return Optional.ofNullable(this.dynamicCompression);
    }

    /**
     * Treatment of URL query terms when forming the cache key.
     * 
     */
    @Import(name="queryParameterStripDirective")
    private @Nullable String queryParameterStripDirective;

    public Optional<String> queryParameterStripDirective() {
        return Optional.ofNullable(this.queryParameterStripDirective);
    }

    /**
     * query parameters to include or exclude (comma separated).
     * 
     */
    @Import(name="queryParameters")
    private @Nullable String queryParameters;

    public Optional<String> queryParameters() {
        return Optional.ofNullable(this.queryParameters);
    }

    private CacheConfigurationResponse() {}

    private CacheConfigurationResponse(CacheConfigurationResponse $) {
        this.cacheDuration = $.cacheDuration;
        this.dynamicCompression = $.dynamicCompression;
        this.queryParameterStripDirective = $.queryParameterStripDirective;
        this.queryParameters = $.queryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheConfigurationResponse $;

        public Builder() {
            $ = new CacheConfigurationResponse();
        }

        public Builder(CacheConfigurationResponse defaults) {
            $ = new CacheConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder cacheDuration(@Nullable String cacheDuration) {
            $.cacheDuration = cacheDuration;
            return this;
        }

        public Builder dynamicCompression(@Nullable String dynamicCompression) {
            $.dynamicCompression = dynamicCompression;
            return this;
        }

        public Builder queryParameterStripDirective(@Nullable String queryParameterStripDirective) {
            $.queryParameterStripDirective = queryParameterStripDirective;
            return this;
        }

        public Builder queryParameters(@Nullable String queryParameters) {
            $.queryParameters = queryParameters;
            return this;
        }

        public CacheConfigurationResponse build() {
            return $;
        }
    }

}
