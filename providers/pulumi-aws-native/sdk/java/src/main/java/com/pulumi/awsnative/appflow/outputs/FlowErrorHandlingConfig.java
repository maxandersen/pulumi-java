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
public final class FlowErrorHandlingConfig {
    private final @Nullable String bucketName;
    private final @Nullable String bucketPrefix;
    private final @Nullable Boolean failOnFirstError;

    @CustomType.Constructor
    private FlowErrorHandlingConfig(
        @CustomType.Parameter("bucketName") @Nullable String bucketName,
        @CustomType.Parameter("bucketPrefix") @Nullable String bucketPrefix,
        @CustomType.Parameter("failOnFirstError") @Nullable Boolean failOnFirstError) {
        this.bucketName = bucketName;
        this.bucketPrefix = bucketPrefix;
        this.failOnFirstError = failOnFirstError;
    }

    public Optional<String> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }
    public Optional<String> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }
    public Optional<Boolean> failOnFirstError() {
        return Optional.ofNullable(this.failOnFirstError);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowErrorHandlingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketName;
        private @Nullable String bucketPrefix;
        private @Nullable Boolean failOnFirstError;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowErrorHandlingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.failOnFirstError = defaults.failOnFirstError;
        }

        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public Builder failOnFirstError(@Nullable Boolean failOnFirstError) {
            this.failOnFirstError = failOnFirstError;
            return this;
        }        public FlowErrorHandlingConfig build() {
            return new FlowErrorHandlingConfig(bucketName, bucketPrefix, failOnFirstError);
        }
    }
}
