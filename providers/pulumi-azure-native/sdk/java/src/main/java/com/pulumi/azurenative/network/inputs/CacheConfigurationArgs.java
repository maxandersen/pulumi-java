// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.DynamicCompressionEnabled;
import com.pulumi.azurenative.network.enums.FrontDoorQuery;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Caching settings for a caching-type route. To disable caching, do not provide a cacheConfiguration object.
 * 
 */
public final class CacheConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheConfigurationArgs Empty = new CacheConfigurationArgs();

    /**
     * The duration for which the content needs to be cached. Allowed format is in ISO 8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations). HTTP requires the value to be no more than a year
     * 
     */
    @Import(name="cacheDuration")
    private @Nullable Output<String> cacheDuration;

    public Optional<Output<String>> cacheDuration() {
        return Optional.ofNullable(this.cacheDuration);
    }

    /**
     * Whether to use dynamic compression for cached content
     * 
     */
    @Import(name="dynamicCompression")
    private @Nullable Output<Either<String,DynamicCompressionEnabled>> dynamicCompression;

    public Optional<Output<Either<String,DynamicCompressionEnabled>>> dynamicCompression() {
        return Optional.ofNullable(this.dynamicCompression);
    }

    /**
     * Treatment of URL query terms when forming the cache key.
     * 
     */
    @Import(name="queryParameterStripDirective")
    private @Nullable Output<Either<String,FrontDoorQuery>> queryParameterStripDirective;

    public Optional<Output<Either<String,FrontDoorQuery>>> queryParameterStripDirective() {
        return Optional.ofNullable(this.queryParameterStripDirective);
    }

    /**
     * query parameters to include or exclude (comma separated).
     * 
     */
    @Import(name="queryParameters")
    private @Nullable Output<String> queryParameters;

    public Optional<Output<String>> queryParameters() {
        return Optional.ofNullable(this.queryParameters);
    }

    private CacheConfigurationArgs() {}

    private CacheConfigurationArgs(CacheConfigurationArgs $) {
        this.cacheDuration = $.cacheDuration;
        this.dynamicCompression = $.dynamicCompression;
        this.queryParameterStripDirective = $.queryParameterStripDirective;
        this.queryParameters = $.queryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheConfigurationArgs $;

        public Builder() {
            $ = new CacheConfigurationArgs();
        }

        public Builder(CacheConfigurationArgs defaults) {
            $ = new CacheConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder cacheDuration(@Nullable Output<String> cacheDuration) {
            $.cacheDuration = cacheDuration;
            return this;
        }

        public Builder cacheDuration(String cacheDuration) {
            return cacheDuration(Output.of(cacheDuration));
        }

        public Builder dynamicCompression(@Nullable Output<Either<String,DynamicCompressionEnabled>> dynamicCompression) {
            $.dynamicCompression = dynamicCompression;
            return this;
        }

        public Builder dynamicCompression(Either<String,DynamicCompressionEnabled> dynamicCompression) {
            return dynamicCompression(Output.of(dynamicCompression));
        }

        public Builder queryParameterStripDirective(@Nullable Output<Either<String,FrontDoorQuery>> queryParameterStripDirective) {
            $.queryParameterStripDirective = queryParameterStripDirective;
            return this;
        }

        public Builder queryParameterStripDirective(Either<String,FrontDoorQuery> queryParameterStripDirective) {
            return queryParameterStripDirective(Output.of(queryParameterStripDirective));
        }

        public Builder queryParameters(@Nullable Output<String> queryParameters) {
            $.queryParameters = queryParameters;
            return this;
        }

        public Builder queryParameters(String queryParameters) {
            return queryParameters(Output.of(queryParameters));
        }

        public CacheConfigurationArgs build() {
            return $;
        }
    }

}
