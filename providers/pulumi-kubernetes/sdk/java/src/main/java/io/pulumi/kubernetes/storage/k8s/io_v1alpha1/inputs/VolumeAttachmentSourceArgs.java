// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PersistentVolumeSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeAttachmentSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentSourceArgs Empty = new VolumeAttachmentSourceArgs();

    @InputImport(name="inlineVolumeSpec")
    private final @Nullable Input<PersistentVolumeSpecArgs> inlineVolumeSpec;

    public Input<PersistentVolumeSpecArgs> getInlineVolumeSpec() {
        return this.inlineVolumeSpec == null ? Input.empty() : this.inlineVolumeSpec;
    }

    @InputImport(name="persistentVolumeName")
    private final @Nullable Input<String> persistentVolumeName;

    public Input<String> getPersistentVolumeName() {
        return this.persistentVolumeName == null ? Input.empty() : this.persistentVolumeName;
    }

    public VolumeAttachmentSourceArgs(
        @Nullable Input<PersistentVolumeSpecArgs> inlineVolumeSpec,
        @Nullable Input<String> persistentVolumeName) {
        this.inlineVolumeSpec = inlineVolumeSpec;
        this.persistentVolumeName = persistentVolumeName;
    }

    private VolumeAttachmentSourceArgs() {
        this.inlineVolumeSpec = Input.empty();
        this.persistentVolumeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PersistentVolumeSpecArgs> inlineVolumeSpec;
        private @Nullable Input<String> persistentVolumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineVolumeSpec = defaults.inlineVolumeSpec;
    	      this.persistentVolumeName = defaults.persistentVolumeName;
        }

        public Builder setInlineVolumeSpec(@Nullable Input<PersistentVolumeSpecArgs> inlineVolumeSpec) {
            this.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }

        public Builder setInlineVolumeSpec(@Nullable PersistentVolumeSpecArgs inlineVolumeSpec) {
            this.inlineVolumeSpec = Input.ofNullable(inlineVolumeSpec);
            return this;
        }

        public Builder setPersistentVolumeName(@Nullable Input<String> persistentVolumeName) {
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }

        public Builder setPersistentVolumeName(@Nullable String persistentVolumeName) {
            this.persistentVolumeName = Input.ofNullable(persistentVolumeName);
            return this;
        }

        public VolumeAttachmentSourceArgs build() {
            return new VolumeAttachmentSourceArgs(inlineVolumeSpec, persistentVolumeName);
        }
    }
}
