// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ssis environment reference.
 * 
 */
public final class SsisEnvironmentReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SsisEnvironmentReferenceResponse Empty = new SsisEnvironmentReferenceResponse();

    /**
     * Environment folder name.
     * 
     */
    @Import(name="environmentFolderName")
      private final @Nullable String environmentFolderName;

    public Optional<String> environmentFolderName() {
        return this.environmentFolderName == null ? Optional.empty() : Optional.ofNullable(this.environmentFolderName);
    }

    /**
     * Environment name.
     * 
     */
    @Import(name="environmentName")
      private final @Nullable String environmentName;

    public Optional<String> environmentName() {
        return this.environmentName == null ? Optional.empty() : Optional.ofNullable(this.environmentName);
    }

    /**
     * Environment reference id.
     * 
     */
    @Import(name="id")
      private final @Nullable Double id;

    public Optional<Double> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Reference type
     * 
     */
    @Import(name="referenceType")
      private final @Nullable String referenceType;

    public Optional<String> referenceType() {
        return this.referenceType == null ? Optional.empty() : Optional.ofNullable(this.referenceType);
    }

    public SsisEnvironmentReferenceResponse(
        @Nullable String environmentFolderName,
        @Nullable String environmentName,
        @Nullable Double id,
        @Nullable String referenceType) {
        this.environmentFolderName = environmentFolderName;
        this.environmentName = environmentName;
        this.id = id;
        this.referenceType = referenceType;
    }

    private SsisEnvironmentReferenceResponse() {
        this.environmentFolderName = null;
        this.environmentName = null;
        this.id = null;
        this.referenceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SsisEnvironmentReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String environmentFolderName;
        private @Nullable String environmentName;
        private @Nullable Double id;
        private @Nullable String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(SsisEnvironmentReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentFolderName = defaults.environmentFolderName;
    	      this.environmentName = defaults.environmentName;
    	      this.id = defaults.id;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder environmentFolderName(@Nullable String environmentFolderName) {
            this.environmentFolderName = environmentFolderName;
            return this;
        }
        public Builder environmentName(@Nullable String environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public Builder id(@Nullable Double id) {
            this.id = id;
            return this;
        }
        public Builder referenceType(@Nullable String referenceType) {
            this.referenceType = referenceType;
            return this;
        }        public SsisEnvironmentReferenceResponse build() {
            return new SsisEnvironmentReferenceResponse(environmentFolderName, environmentName, id, referenceType);
        }
    }
}
