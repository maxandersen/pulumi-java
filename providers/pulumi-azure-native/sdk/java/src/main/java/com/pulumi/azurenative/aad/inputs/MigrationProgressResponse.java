// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Migration Progress
 * 
 */
public final class MigrationProgressResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrationProgressResponse Empty = new MigrationProgressResponse();

    /**
     * Completion Percentage
     * 
     */
    @Import(name="completionPercentage")
      private final @Nullable Double completionPercentage;

    public Optional<Double> completionPercentage() {
        return this.completionPercentage == null ? Optional.empty() : Optional.ofNullable(this.completionPercentage);
    }

    /**
     * Progress Message
     * 
     */
    @Import(name="progressMessage")
      private final @Nullable String progressMessage;

    public Optional<String> progressMessage() {
        return this.progressMessage == null ? Optional.empty() : Optional.ofNullable(this.progressMessage);
    }

    public MigrationProgressResponse(
        @Nullable Double completionPercentage,
        @Nullable String progressMessage) {
        this.completionPercentage = completionPercentage;
        this.progressMessage = progressMessage;
    }

    private MigrationProgressResponse() {
        this.completionPercentage = null;
        this.progressMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double completionPercentage;
        private @Nullable String progressMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionPercentage = defaults.completionPercentage;
    	      this.progressMessage = defaults.progressMessage;
        }

        public Builder completionPercentage(@Nullable Double completionPercentage) {
            this.completionPercentage = completionPercentage;
            return this;
        }
        public Builder progressMessage(@Nullable String progressMessage) {
            this.progressMessage = progressMessage;
            return this;
        }        public MigrationProgressResponse build() {
            return new MigrationProgressResponse(completionPercentage, progressMessage);
        }
    }
}
