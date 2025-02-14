// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FilterNumberFilter {
    private final @Nullable Double lowerInclusive;
    private final @Nullable Double upperInclusive;

    @CustomType.Constructor
    private FilterNumberFilter(
        @CustomType.Parameter("lowerInclusive") @Nullable Double lowerInclusive,
        @CustomType.Parameter("upperInclusive") @Nullable Double upperInclusive) {
        this.lowerInclusive = lowerInclusive;
        this.upperInclusive = upperInclusive;
    }

    public Optional<Double> lowerInclusive() {
        return Optional.ofNullable(this.lowerInclusive);
    }
    public Optional<Double> upperInclusive() {
        return Optional.ofNullable(this.upperInclusive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterNumberFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double lowerInclusive;
        private @Nullable Double upperInclusive;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterNumberFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lowerInclusive = defaults.lowerInclusive;
    	      this.upperInclusive = defaults.upperInclusive;
        }

        public Builder lowerInclusive(@Nullable Double lowerInclusive) {
            this.lowerInclusive = lowerInclusive;
            return this;
        }
        public Builder upperInclusive(@Nullable Double upperInclusive) {
            this.upperInclusive = upperInclusive;
            return this;
        }        public FilterNumberFilter build() {
            return new FilterNumberFilter(lowerInclusive, upperInclusive);
        }
    }
}
