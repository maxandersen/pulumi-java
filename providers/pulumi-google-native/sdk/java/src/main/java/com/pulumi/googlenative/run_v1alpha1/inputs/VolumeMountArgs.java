// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<String> mountPath;

    public Optional<Output<String>> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }

    /**
     * The name of the volume. There must be a corresponding Volume with the same name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Optional) Only true is accepted. Defaults to true.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * (Optional) Path within the volume from which the container&#39;s volume should be mounted. Defaults to &#34;&#34; (volume&#39;s root).
     * 
     */
    @Import(name="subPath")
    private @Nullable Output<String> subPath;

    public Optional<Output<String>> subPath() {
        return Optional.ofNullable(this.subPath);
    }

    private VolumeMountArgs() {}

    private VolumeMountArgs(VolumeMountArgs $) {
        this.mountPath = $.mountPath;
        this.name = $.name;
        this.readOnly = $.readOnly;
        this.subPath = $.subPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeMountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeMountArgs $;

        public Builder() {
            $ = new VolumeMountArgs();
        }

        public Builder(VolumeMountArgs defaults) {
            $ = new VolumeMountArgs(Objects.requireNonNull(defaults));
        }

        public Builder mountPath(@Nullable Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder subPath(@Nullable Output<String> subPath) {
            $.subPath = subPath;
            return this;
        }

        public Builder subPath(String subPath) {
            return subPath(Output.of(subPath));
        }

        public VolumeMountArgs build() {
            return $;
        }
    }

}
