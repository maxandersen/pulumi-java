// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EmptyDirVolumeSource {
    private final @Nullable String medium;
    private final @Nullable String sizeLimit;

    @OutputCustomType.Constructor({"medium","sizeLimit"})
    private EmptyDirVolumeSource(
        @Nullable String medium,
        @Nullable String sizeLimit) {
        this.medium = medium;
        this.sizeLimit = sizeLimit;
    }

    public Optional<String> getMedium() {
        return Optional.ofNullable(this.medium);
    }
    public Optional<String> getSizeLimit() {
        return Optional.ofNullable(this.sizeLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmptyDirVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String medium;
        private @Nullable String sizeLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(EmptyDirVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.medium = defaults.medium;
    	      this.sizeLimit = defaults.sizeLimit;
        }

        public Builder setMedium(@Nullable String medium) {
            this.medium = medium;
            return this;
        }

        public Builder setSizeLimit(@Nullable String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }

        public EmptyDirVolumeSource build() {
            return new EmptyDirVolumeSource(medium, sizeLimit);
        }
    }
}
