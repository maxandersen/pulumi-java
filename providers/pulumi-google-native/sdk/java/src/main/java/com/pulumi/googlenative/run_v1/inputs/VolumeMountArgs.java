// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeMount describes a mounting of a Volume within a container.
 * 
 */
public final class VolumeMountArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeMountArgs Empty = new VolumeMountArgs();

    /**
     * Path within the container at which the volume should be mounted. Must not contain &#39;:&#39;.
     * 
     */
    @Import(name="mountPath")
      private final @Nullable Output<String> mountPath;

    public Output<String> mountPath() {
        return this.mountPath == null ? Codegen.empty() : this.mountPath;
    }

    /**
     * The name of the volume. There must be a corresponding Volume with the same name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * (Optional) Only true is accepted. Defaults to true.
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> readOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    /**
     * (Optional) Path within the volume from which the container&#39;s volume should be mounted. Defaults to &#34;&#34; (volume&#39;s root).
     * 
     */
    @Import(name="subPath")
      private final @Nullable Output<String> subPath;

    public Output<String> subPath() {
        return this.subPath == null ? Codegen.empty() : this.subPath;
    }

    public VolumeMountArgs(
        @Nullable Output<String> mountPath,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<String> subPath) {
        this.mountPath = mountPath;
        this.name = name;
        this.readOnly = readOnly;
        this.subPath = subPath;
    }

    private VolumeMountArgs() {
        this.mountPath = Codegen.empty();
        this.name = Codegen.empty();
        this.readOnly = Codegen.empty();
        this.subPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mountPath;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<String> subPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeMountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.subPath = defaults.subPath;
        }

        public Builder mountPath(@Nullable Output<String> mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public Builder mountPath(@Nullable String mountPath) {
            this.mountPath = Codegen.ofNullable(mountPath);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Codegen.ofNullable(readOnly);
            return this;
        }
        public Builder subPath(@Nullable Output<String> subPath) {
            this.subPath = subPath;
            return this;
        }
        public Builder subPath(@Nullable String subPath) {
            this.subPath = Codegen.ofNullable(subPath);
            return this;
        }        public VolumeMountArgs build() {
            return new VolumeMountArgs(mountPath, name, readOnly, subPath);
        }
    }
}
