// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.inputs.FlowS3InputFormatConfig;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowS3SourceProperties extends com.pulumi.resources.InvokeArgs {

    public static final FlowS3SourceProperties Empty = new FlowS3SourceProperties();

    @Import(name="bucketName", required=true)
      private final String bucketName;

    public String bucketName() {
        return this.bucketName;
    }

    @Import(name="bucketPrefix", required=true)
      private final String bucketPrefix;

    public String bucketPrefix() {
        return this.bucketPrefix;
    }

    @Import(name="s3InputFormatConfig")
      private final @Nullable FlowS3InputFormatConfig s3InputFormatConfig;

    public Optional<FlowS3InputFormatConfig> s3InputFormatConfig() {
        return this.s3InputFormatConfig == null ? Optional.empty() : Optional.ofNullable(this.s3InputFormatConfig);
    }

    public FlowS3SourceProperties(
        String bucketName,
        String bucketPrefix,
        @Nullable FlowS3InputFormatConfig s3InputFormatConfig) {
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.bucketPrefix = Objects.requireNonNull(bucketPrefix, "expected parameter 'bucketPrefix' to be non-null");
        this.s3InputFormatConfig = s3InputFormatConfig;
    }

    private FlowS3SourceProperties() {
        this.bucketName = null;
        this.bucketPrefix = null;
        this.s3InputFormatConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3SourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketName;
        private String bucketPrefix;
        private @Nullable FlowS3InputFormatConfig s3InputFormatConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3SourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.s3InputFormatConfig = defaults.s3InputFormatConfig;
        }

        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder bucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }
        public Builder s3InputFormatConfig(@Nullable FlowS3InputFormatConfig s3InputFormatConfig) {
            this.s3InputFormatConfig = s3InputFormatConfig;
            return this;
        }        public FlowS3SourceProperties build() {
            return new FlowS3SourceProperties(bucketName, bucketPrefix, s3InputFormatConfig);
        }
    }
}
