// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NFSMountConfigurationArgs extends ResourceArgs {

    public static final NFSMountConfigurationArgs Empty = new NFSMountConfigurationArgs();

    /**
     * These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    @Import(name="mountOptions")
    private @Nullable Output<String> mountOptions;

    /**
     * @return These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
     * 
     */
    public Optional<Output<String>> mountOptions() {
        return Optional.ofNullable(this.mountOptions);
    }

    /**
     * All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    @Import(name="relativeMountPath", required=true)
    private Output<String> relativeMountPath;

    /**
     * @return All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     * 
     */
    public Output<String> relativeMountPath() {
        return this.relativeMountPath;
    }

    @Import(name="source", required=true)
    private Output<String> source;

    public Output<String> source() {
        return this.source;
    }

    private NFSMountConfigurationArgs() {}

    private NFSMountConfigurationArgs(NFSMountConfigurationArgs $) {
        this.mountOptions = $.mountOptions;
        this.relativeMountPath = $.relativeMountPath;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NFSMountConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NFSMountConfigurationArgs $;

        public Builder() {
            $ = new NFSMountConfigurationArgs();
        }

        public Builder(NFSMountConfigurationArgs defaults) {
            $ = new NFSMountConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mountOptions These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(@Nullable Output<String> mountOptions) {
            $.mountOptions = mountOptions;
            return this;
        }

        /**
         * @param mountOptions These are &#39;net use&#39; options in Windows and &#39;mount&#39; options in Linux.
         * 
         * @return builder
         * 
         */
        public Builder mountOptions(String mountOptions) {
            return mountOptions(Output.of(mountOptions));
        }

        /**
         * @param relativeMountPath All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(Output<String> relativeMountPath) {
            $.relativeMountPath = relativeMountPath;
            return this;
        }

        /**
         * @param relativeMountPath All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
         * 
         * @return builder
         * 
         */
        public Builder relativeMountPath(String relativeMountPath) {
            return relativeMountPath(Output.of(relativeMountPath));
        }

        public Builder source(Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public NFSMountConfigurationArgs build() {
            $.relativeMountPath = Objects.requireNonNull($.relativeMountPath, "expected parameter 'relativeMountPath' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
