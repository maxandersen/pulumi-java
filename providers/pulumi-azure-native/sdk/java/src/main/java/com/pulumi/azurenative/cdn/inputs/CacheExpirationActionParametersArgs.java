// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.CacheBehavior;
import com.pulumi.azurenative.cdn.enums.CacheType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the cache expiration action.
 * 
 */
public final class CacheExpirationActionParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheExpirationActionParametersArgs Empty = new CacheExpirationActionParametersArgs();

    /**
     * Caching behavior for the requests
     * 
     */
    @Import(name="cacheBehavior", required=true)
    private Output<Either<String,CacheBehavior>> cacheBehavior;

    public Output<Either<String,CacheBehavior>> cacheBehavior() {
        return this.cacheBehavior;
    }

    /**
     * The duration for which the content needs to be cached. Allowed format is [d.]hh:mm:ss
     * 
     */
    @Import(name="cacheDuration")
    private @Nullable Output<String> cacheDuration;

    public Optional<Output<String>> cacheDuration() {
        return Optional.ofNullable(this.cacheDuration);
    }

    /**
     * The level at which the content needs to be cached.
     * 
     */
    @Import(name="cacheType", required=true)
    private Output<Either<String,CacheType>> cacheType;

    public Output<Either<String,CacheType>> cacheType() {
        return this.cacheType;
    }

    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    private CacheExpirationActionParametersArgs() {}

    private CacheExpirationActionParametersArgs(CacheExpirationActionParametersArgs $) {
        this.cacheBehavior = $.cacheBehavior;
        this.cacheDuration = $.cacheDuration;
        this.cacheType = $.cacheType;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheExpirationActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheExpirationActionParametersArgs $;

        public Builder() {
            $ = new CacheExpirationActionParametersArgs();
        }

        public Builder(CacheExpirationActionParametersArgs defaults) {
            $ = new CacheExpirationActionParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder cacheBehavior(Output<Either<String,CacheBehavior>> cacheBehavior) {
            $.cacheBehavior = cacheBehavior;
            return this;
        }

        public Builder cacheBehavior(Either<String,CacheBehavior> cacheBehavior) {
            return cacheBehavior(Output.of(cacheBehavior));
        }

        public Builder cacheDuration(@Nullable Output<String> cacheDuration) {
            $.cacheDuration = cacheDuration;
            return this;
        }

        public Builder cacheDuration(String cacheDuration) {
            return cacheDuration(Output.of(cacheDuration));
        }

        public Builder cacheType(Output<Either<String,CacheType>> cacheType) {
            $.cacheType = cacheType;
            return this;
        }

        public Builder cacheType(Either<String,CacheType> cacheType) {
            return cacheType(Output.of(cacheType));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public CacheExpirationActionParametersArgs build() {
            $.cacheBehavior = Objects.requireNonNull($.cacheBehavior, "expected parameter 'cacheBehavior' to be non-null");
            $.cacheType = Objects.requireNonNull($.cacheType, "expected parameter 'cacheType' to be non-null");
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            return $;
        }
    }

}
