// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowVeevaSourceProperties {
    private final @Nullable String documentType;
    private final @Nullable Boolean includeAllVersions;
    private final @Nullable Boolean includeRenditions;
    private final @Nullable Boolean includeSourceFiles;
    private final String object;

    @CustomType.Constructor
    private FlowVeevaSourceProperties(
        @CustomType.Parameter("documentType") @Nullable String documentType,
        @CustomType.Parameter("includeAllVersions") @Nullable Boolean includeAllVersions,
        @CustomType.Parameter("includeRenditions") @Nullable Boolean includeRenditions,
        @CustomType.Parameter("includeSourceFiles") @Nullable Boolean includeSourceFiles,
        @CustomType.Parameter("object") String object) {
        this.documentType = documentType;
        this.includeAllVersions = includeAllVersions;
        this.includeRenditions = includeRenditions;
        this.includeSourceFiles = includeSourceFiles;
        this.object = object;
    }

    public Optional<String> documentType() {
        return Optional.ofNullable(this.documentType);
    }
    public Optional<Boolean> includeAllVersions() {
        return Optional.ofNullable(this.includeAllVersions);
    }
    public Optional<Boolean> includeRenditions() {
        return Optional.ofNullable(this.includeRenditions);
    }
    public Optional<Boolean> includeSourceFiles() {
        return Optional.ofNullable(this.includeSourceFiles);
    }
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowVeevaSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String documentType;
        private @Nullable Boolean includeAllVersions;
        private @Nullable Boolean includeRenditions;
        private @Nullable Boolean includeSourceFiles;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowVeevaSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentType = defaults.documentType;
    	      this.includeAllVersions = defaults.includeAllVersions;
    	      this.includeRenditions = defaults.includeRenditions;
    	      this.includeSourceFiles = defaults.includeSourceFiles;
    	      this.object = defaults.object;
        }

        public Builder documentType(@Nullable String documentType) {
            this.documentType = documentType;
            return this;
        }
        public Builder includeAllVersions(@Nullable Boolean includeAllVersions) {
            this.includeAllVersions = includeAllVersions;
            return this;
        }
        public Builder includeRenditions(@Nullable Boolean includeRenditions) {
            this.includeRenditions = includeRenditions;
            return this;
        }
        public Builder includeSourceFiles(@Nullable Boolean includeSourceFiles) {
            this.includeSourceFiles = includeSourceFiles;
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public FlowVeevaSourceProperties build() {
            return new FlowVeevaSourceProperties(documentType, includeAllVersions, includeRenditions, includeSourceFiles, object);
        }
    }
}
