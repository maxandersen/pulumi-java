// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Guest disk signature based disk exclusion option when doing enable protection of virtual machine in InMage provider.
 * 
 */
public final class InMageVolumeExclusionOptionsArgs extends ResourceArgs {

    public static final InMageVolumeExclusionOptionsArgs Empty = new InMageVolumeExclusionOptionsArgs();

    /**
     * The value indicating whether to exclude multi volume disk or not. If a disk has multiple volumes and one of the volume has label matching with VolumeLabel this disk will be excluded from replication if OnlyExcludeIfSingleVolume is false.
     * 
     */
    @Import(name="onlyExcludeIfSingleVolume")
    private @Nullable Output<String> onlyExcludeIfSingleVolume;

    /**
     * @return The value indicating whether to exclude multi volume disk or not. If a disk has multiple volumes and one of the volume has label matching with VolumeLabel this disk will be excluded from replication if OnlyExcludeIfSingleVolume is false.
     * 
     */
    public Optional<Output<String>> onlyExcludeIfSingleVolume() {
        return Optional.ofNullable(this.onlyExcludeIfSingleVolume);
    }

    /**
     * The volume label. The disk having any volume with this label will be excluded from replication.
     * 
     */
    @Import(name="volumeLabel")
    private @Nullable Output<String> volumeLabel;

    /**
     * @return The volume label. The disk having any volume with this label will be excluded from replication.
     * 
     */
    public Optional<Output<String>> volumeLabel() {
        return Optional.ofNullable(this.volumeLabel);
    }

    private InMageVolumeExclusionOptionsArgs() {}

    private InMageVolumeExclusionOptionsArgs(InMageVolumeExclusionOptionsArgs $) {
        this.onlyExcludeIfSingleVolume = $.onlyExcludeIfSingleVolume;
        this.volumeLabel = $.volumeLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageVolumeExclusionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageVolumeExclusionOptionsArgs $;

        public Builder() {
            $ = new InMageVolumeExclusionOptionsArgs();
        }

        public Builder(InMageVolumeExclusionOptionsArgs defaults) {
            $ = new InMageVolumeExclusionOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onlyExcludeIfSingleVolume The value indicating whether to exclude multi volume disk or not. If a disk has multiple volumes and one of the volume has label matching with VolumeLabel this disk will be excluded from replication if OnlyExcludeIfSingleVolume is false.
         * 
         * @return builder
         * 
         */
        public Builder onlyExcludeIfSingleVolume(@Nullable Output<String> onlyExcludeIfSingleVolume) {
            $.onlyExcludeIfSingleVolume = onlyExcludeIfSingleVolume;
            return this;
        }

        /**
         * @param onlyExcludeIfSingleVolume The value indicating whether to exclude multi volume disk or not. If a disk has multiple volumes and one of the volume has label matching with VolumeLabel this disk will be excluded from replication if OnlyExcludeIfSingleVolume is false.
         * 
         * @return builder
         * 
         */
        public Builder onlyExcludeIfSingleVolume(String onlyExcludeIfSingleVolume) {
            return onlyExcludeIfSingleVolume(Output.of(onlyExcludeIfSingleVolume));
        }

        /**
         * @param volumeLabel The volume label. The disk having any volume with this label will be excluded from replication.
         * 
         * @return builder
         * 
         */
        public Builder volumeLabel(@Nullable Output<String> volumeLabel) {
            $.volumeLabel = volumeLabel;
            return this;
        }

        /**
         * @param volumeLabel The volume label. The disk having any volume with this label will be excluded from replication.
         * 
         * @return builder
         * 
         */
        public Builder volumeLabel(String volumeLabel) {
            return volumeLabel(Output.of(volumeLabel));
        }

        public InMageVolumeExclusionOptionsArgs build() {
            return $;
        }
    }

}
