// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.PersistentVolumeSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 * 
 */
public final class VolumeAttachmentSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentSourceArgs Empty = new VolumeAttachmentSourceArgs();

    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod&#39;s inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod&#39;s inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the CSIMigration feature.
     * 
     */
    @Import(name="inlineVolumeSpec")
    private @Nullable Output<PersistentVolumeSpecArgs> inlineVolumeSpec;

    public Optional<Output<PersistentVolumeSpecArgs>> inlineVolumeSpec() {
        return Optional.ofNullable(this.inlineVolumeSpec);
    }

    /**
     * Name of the persistent volume to attach.
     * 
     */
    @Import(name="persistentVolumeName")
    private @Nullable Output<String> persistentVolumeName;

    public Optional<Output<String>> persistentVolumeName() {
        return Optional.ofNullable(this.persistentVolumeName);
    }

    private VolumeAttachmentSourceArgs() {}

    private VolumeAttachmentSourceArgs(VolumeAttachmentSourceArgs $) {
        this.inlineVolumeSpec = $.inlineVolumeSpec;
        this.persistentVolumeName = $.persistentVolumeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeAttachmentSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeAttachmentSourceArgs $;

        public Builder() {
            $ = new VolumeAttachmentSourceArgs();
        }

        public Builder(VolumeAttachmentSourceArgs defaults) {
            $ = new VolumeAttachmentSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder inlineVolumeSpec(@Nullable Output<PersistentVolumeSpecArgs> inlineVolumeSpec) {
            $.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }

        public Builder inlineVolumeSpec(PersistentVolumeSpecArgs inlineVolumeSpec) {
            return inlineVolumeSpec(Output.of(inlineVolumeSpec));
        }

        public Builder persistentVolumeName(@Nullable Output<String> persistentVolumeName) {
            $.persistentVolumeName = persistentVolumeName;
            return this;
        }

        public Builder persistentVolumeName(String persistentVolumeName) {
            return persistentVolumeName(Output.of(persistentVolumeName));
        }

        public VolumeAttachmentSourceArgs build() {
            return $;
        }
    }

}
