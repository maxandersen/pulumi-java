// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NFSMountConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NFSMountConfigurationArgs Empty = new NFSMountConfigurationArgs();

    /**
     * These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    @Import(name="mountOptions")
      private final @Nullable Output<String> mountOptions;

    public Output<String> mountOptions() {
        return this.mountOptions == null ? Codegen.empty() : this.mountOptions;
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
      private final Output<String> relativeMountPath;

    public Output<String> relativeMountPath() {
        return this.relativeMountPath;
    }

    @Import(name="source", required=true)
      private final Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    public NFSMountConfigurationArgs(
        @Nullable Output<String> mountOptions,
        Output<String> relativeMountPath,
        Output<String> source) {
        this.mountOptions = mountOptions;
        this.relativeMountPath = Objects.requireNonNull(relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private NFSMountConfigurationArgs() {
        this.mountOptions = Codegen.empty();
        this.relativeMountPath = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NFSMountConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mountOptions;
        private Output<String> relativeMountPath;
        private Output<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(NFSMountConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.relativeMountPath = defaults.relativeMountPath;
    	      this.source = defaults.source;
        }

        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public Builder mountOptions(@Nullable String mountOptions) {
            this.mountOptions = Codegen.ofNullable(mountOptions);
            return this;
        }
        public Builder relativeMountPath(Output<String> relativeMountPath) {
            this.relativeMountPath = Objects.requireNonNull(relativeMountPath);
            return this;
        }
        public Builder relativeMountPath(String relativeMountPath) {
            this.relativeMountPath = Output.of(Objects.requireNonNull(relativeMountPath));
            return this;
        }
        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }        public NFSMountConfigurationArgs build() {
            return new NFSMountConfigurationArgs(mountOptions, relativeMountPath, source);
        }
    }
}
