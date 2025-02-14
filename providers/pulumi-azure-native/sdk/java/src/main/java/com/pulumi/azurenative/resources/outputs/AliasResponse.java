// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources.outputs;

import com.pulumi.azurenative.resources.outputs.AliasPathMetadataResponse;
import com.pulumi.azurenative.resources.outputs.AliasPathResponse;
import com.pulumi.azurenative.resources.outputs.AliasPatternResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AliasResponse {
    /**
     * @return The default alias path metadata. Applies to the default path and to any alias path that doesn&#39;t have metadata
     * 
     */
    private final AliasPathMetadataResponse defaultMetadata;
    /**
     * @return The default path for an alias.
     * 
     */
    private final @Nullable String defaultPath;
    /**
     * @return The default pattern for an alias.
     * 
     */
    private final @Nullable AliasPatternResponse defaultPattern;
    /**
     * @return The alias name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The paths for an alias.
     * 
     */
    private final @Nullable List<AliasPathResponse> paths;
    /**
     * @return The type of the alias.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private AliasResponse(
        @CustomType.Parameter("defaultMetadata") AliasPathMetadataResponse defaultMetadata,
        @CustomType.Parameter("defaultPath") @Nullable String defaultPath,
        @CustomType.Parameter("defaultPattern") @Nullable AliasPatternResponse defaultPattern,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("paths") @Nullable List<AliasPathResponse> paths,
        @CustomType.Parameter("type") @Nullable String type) {
        this.defaultMetadata = defaultMetadata;
        this.defaultPath = defaultPath;
        this.defaultPattern = defaultPattern;
        this.name = name;
        this.paths = paths;
        this.type = type;
    }

    /**
     * @return The default alias path metadata. Applies to the default path and to any alias path that doesn&#39;t have metadata
     * 
     */
    public AliasPathMetadataResponse defaultMetadata() {
        return this.defaultMetadata;
    }
    /**
     * @return The default path for an alias.
     * 
     */
    public Optional<String> defaultPath() {
        return Optional.ofNullable(this.defaultPath);
    }
    /**
     * @return The default pattern for an alias.
     * 
     */
    public Optional<AliasPatternResponse> defaultPattern() {
        return Optional.ofNullable(this.defaultPattern);
    }
    /**
     * @return The alias name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The paths for an alias.
     * 
     */
    public List<AliasPathResponse> paths() {
        return this.paths == null ? List.of() : this.paths;
    }
    /**
     * @return The type of the alias.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasPathMetadataResponse defaultMetadata;
        private @Nullable String defaultPath;
        private @Nullable AliasPatternResponse defaultPattern;
        private @Nullable String name;
        private @Nullable List<AliasPathResponse> paths;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMetadata = defaults.defaultMetadata;
    	      this.defaultPath = defaults.defaultPath;
    	      this.defaultPattern = defaults.defaultPattern;
    	      this.name = defaults.name;
    	      this.paths = defaults.paths;
    	      this.type = defaults.type;
        }

        public Builder defaultMetadata(AliasPathMetadataResponse defaultMetadata) {
            this.defaultMetadata = Objects.requireNonNull(defaultMetadata);
            return this;
        }
        public Builder defaultPath(@Nullable String defaultPath) {
            this.defaultPath = defaultPath;
            return this;
        }
        public Builder defaultPattern(@Nullable AliasPatternResponse defaultPattern) {
            this.defaultPattern = defaultPattern;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder paths(@Nullable List<AliasPathResponse> paths) {
            this.paths = paths;
            return this;
        }
        public Builder paths(AliasPathResponse... paths) {
            return paths(List.of(paths));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public AliasResponse build() {
            return new AliasResponse(defaultMetadata, defaultPath, defaultPattern, name, paths, type);
        }
    }
}
