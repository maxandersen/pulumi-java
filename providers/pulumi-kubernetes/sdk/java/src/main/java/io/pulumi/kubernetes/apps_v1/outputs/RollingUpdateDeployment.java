// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.outputs;

import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RollingUpdateDeployment {
    private final @Nullable Either<Integer,String> maxSurge;
    private final @Nullable Either<Integer,String> maxUnavailable;

    @OutputCustomType.Constructor({"maxSurge","maxUnavailable"})
    private RollingUpdateDeployment(
        @Nullable Either<Integer,String> maxSurge,
        @Nullable Either<Integer,String> maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    public Optional<Either<Integer,String>> getMaxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    public Optional<Either<Integer,String>> getMaxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<Integer,String> maxSurge;
        private @Nullable Either<Integer,String> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder setMaxSurge(@Nullable Either<Integer,String> maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }

        public Builder setMaxUnavailable(@Nullable Either<Integer,String> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }

        public RollingUpdateDeployment build() {
            return new RollingUpdateDeployment(maxSurge, maxUnavailable);
        }
    }
}
