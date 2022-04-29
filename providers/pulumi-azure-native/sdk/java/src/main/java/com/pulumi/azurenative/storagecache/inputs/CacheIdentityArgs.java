// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.azurenative.storagecache.enums.CacheIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cache identity properties.
 * 
 */
public final class CacheIdentityArgs extends ResourceArgs {

    public static final CacheIdentityArgs Empty = new CacheIdentityArgs();

    /**
     * The type of identity used for the cache
     * 
     */
    @Import(name="type")
    private @Nullable Output<CacheIdentityType> type;

    /**
     * @return The type of identity used for the cache
     * 
     */
    public Optional<Output<CacheIdentityType>> type() {
        return Optional.ofNullable(this.type);
    }

    private CacheIdentityArgs() {}

    private CacheIdentityArgs(CacheIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheIdentityArgs $;

        public Builder() {
            $ = new CacheIdentityArgs();
        }

        public Builder(CacheIdentityArgs defaults) {
            $ = new CacheIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of identity used for the cache
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<CacheIdentityType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of identity used for the cache
         * 
         * @return builder
         * 
         */
        public Builder type(CacheIdentityType type) {
            return type(Output.of(type));
        }

        public CacheIdentityArgs build() {
            return $;
        }
    }

}
