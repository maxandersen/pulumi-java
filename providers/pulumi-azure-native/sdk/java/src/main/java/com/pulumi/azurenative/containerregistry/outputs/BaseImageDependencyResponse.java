// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BaseImageDependencyResponse {
    /**
     * @return The sha256-based digest of the image manifest.
     * 
     */
    private final @Nullable String digest;
    /**
     * @return The registry login server.
     * 
     */
    private final @Nullable String registry;
    /**
     * @return The repository name.
     * 
     */
    private final @Nullable String repository;
    /**
     * @return The tag name.
     * 
     */
    private final @Nullable String tag;
    /**
     * @return The type of the base image dependency.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private BaseImageDependencyResponse(
        @CustomType.Parameter("digest") @Nullable String digest,
        @CustomType.Parameter("registry") @Nullable String registry,
        @CustomType.Parameter("repository") @Nullable String repository,
        @CustomType.Parameter("tag") @Nullable String tag,
        @CustomType.Parameter("type") @Nullable String type) {
        this.digest = digest;
        this.registry = registry;
        this.repository = repository;
        this.tag = tag;
        this.type = type;
    }

    /**
     * @return The sha256-based digest of the image manifest.
     * 
     */
    public Optional<String> digest() {
        return Optional.ofNullable(this.digest);
    }
    /**
     * @return The registry login server.
     * 
     */
    public Optional<String> registry() {
        return Optional.ofNullable(this.registry);
    }
    /**
     * @return The repository name.
     * 
     */
    public Optional<String> repository() {
        return Optional.ofNullable(this.repository);
    }
    /**
     * @return The tag name.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * @return The type of the base image dependency.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaseImageDependencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String digest;
        private @Nullable String registry;
        private @Nullable String repository;
        private @Nullable String tag;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BaseImageDependencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.registry = defaults.registry;
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        public Builder digest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }
        public Builder registry(@Nullable String registry) {
            this.registry = registry;
            return this;
        }
        public Builder repository(@Nullable String repository) {
            this.repository = repository;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public BaseImageDependencyResponse build() {
            return new BaseImageDependencyResponse(digest, registry, repository, tag, type);
        }
    }
}
