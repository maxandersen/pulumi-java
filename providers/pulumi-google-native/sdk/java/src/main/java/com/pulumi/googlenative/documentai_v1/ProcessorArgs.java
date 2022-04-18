// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.documentai_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProcessorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProcessorArgs Empty = new ProcessorArgs();

    /**
     * The time the processor was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * The default processor version.
     * 
     */
    @Import(name="defaultProcessorVersion")
      private final @Nullable Output<String> defaultProcessorVersion;

    public Output<String> defaultProcessorVersion() {
        return this.defaultProcessorVersion == null ? Codegen.empty() : this.defaultProcessorVersion;
    }

    /**
     * The display name of the processor.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> kmsKeyName() {
        return this.kmsKeyName == null ? Codegen.empty() : this.kmsKeyName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ProcessorArgs(
        @Nullable Output<String> createTime,
        @Nullable Output<String> defaultProcessorVersion,
        @Nullable Output<String> displayName,
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> type) {
        this.createTime = createTime;
        this.defaultProcessorVersion = defaultProcessorVersion;
        this.displayName = displayName;
        this.kmsKeyName = kmsKeyName;
        this.location = location;
        this.project = project;
        this.type = type;
    }

    private ProcessorArgs() {
        this.createTime = Codegen.empty();
        this.defaultProcessorVersion = Codegen.empty();
        this.displayName = Codegen.empty();
        this.kmsKeyName = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> defaultProcessorVersion;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.defaultProcessorVersion = defaults.defaultProcessorVersion;
    	      this.displayName = defaults.displayName;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder defaultProcessorVersion(@Nullable Output<String> defaultProcessorVersion) {
            this.defaultProcessorVersion = defaultProcessorVersion;
            return this;
        }
        public Builder defaultProcessorVersion(@Nullable String defaultProcessorVersion) {
            this.defaultProcessorVersion = Codegen.ofNullable(defaultProcessorVersion);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Codegen.ofNullable(kmsKeyName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ProcessorArgs build() {
            return new ProcessorArgs(createTime, defaultProcessorVersion, displayName, kmsKeyName, location, project, type);
        }
    }
}
