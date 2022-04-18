// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SparkMavenPackageResponse {
    private final @Nullable String artifact;
    private final @Nullable String group;
    private final @Nullable String version;

    @CustomType.Constructor
    private SparkMavenPackageResponse(
        @CustomType.Parameter("artifact") @Nullable String artifact,
        @CustomType.Parameter("group") @Nullable String group,
        @CustomType.Parameter("version") @Nullable String version) {
        this.artifact = artifact;
        this.group = group;
        this.version = version;
    }

    public Optional<String> artifact() {
        return Optional.ofNullable(this.artifact);
    }
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkMavenPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String artifact;
        private @Nullable String group;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkMavenPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifact = defaults.artifact;
    	      this.group = defaults.group;
    	      this.version = defaults.version;
        }

        public Builder artifact(@Nullable String artifact) {
            this.artifact = artifact;
            return this;
        }
        public Builder group(@Nullable String group) {
            this.group = group;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public SparkMavenPackageResponse build() {
            return new SparkMavenPackageResponse(artifact, group, version);
        }
    }
}
