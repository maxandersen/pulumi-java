// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheExpirationActionParametersResponse {
    /**
     * Caching behavior for the requests
     * 
     */
    private final String cacheBehavior;
    /**
     * The duration for which the content needs to be cached. Allowed format is [d.]hh:mm:ss
     * 
     */
    private final @Nullable String cacheDuration;
    /**
     * The level at which the content needs to be cached.
     * 
     */
    private final String cacheType;
    private final String odataType;

    @CustomType.Constructor
    private CacheExpirationActionParametersResponse(
        @CustomType.Parameter("cacheBehavior") String cacheBehavior,
        @CustomType.Parameter("cacheDuration") @Nullable String cacheDuration,
        @CustomType.Parameter("cacheType") String cacheType,
        @CustomType.Parameter("odataType") String odataType) {
        this.cacheBehavior = cacheBehavior;
        this.cacheDuration = cacheDuration;
        this.cacheType = cacheType;
        this.odataType = odataType;
    }

    /**
     * Caching behavior for the requests
     * 
    */
    public String cacheBehavior() {
        return this.cacheBehavior;
    }
    /**
     * The duration for which the content needs to be cached. Allowed format is [d.]hh:mm:ss
     * 
    */
    public Optional<String> cacheDuration() {
        return Optional.ofNullable(this.cacheDuration);
    }
    /**
     * The level at which the content needs to be cached.
     * 
    */
    public String cacheType() {
        return this.cacheType;
    }
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheExpirationActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cacheBehavior;
        private @Nullable String cacheDuration;
        private String cacheType;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheExpirationActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheBehavior = defaults.cacheBehavior;
    	      this.cacheDuration = defaults.cacheDuration;
    	      this.cacheType = defaults.cacheType;
    	      this.odataType = defaults.odataType;
        }

        public Builder cacheBehavior(String cacheBehavior) {
            this.cacheBehavior = Objects.requireNonNull(cacheBehavior);
            return this;
        }
        public Builder cacheDuration(@Nullable String cacheDuration) {
            this.cacheDuration = cacheDuration;
            return this;
        }
        public Builder cacheType(String cacheType) {
            this.cacheType = Objects.requireNonNull(cacheType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public CacheExpirationActionParametersResponse build() {
            return new CacheExpirationActionParametersResponse(cacheBehavior, cacheDuration, cacheType, odataType);
        }
    }
}
