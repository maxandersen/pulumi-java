// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.InMageDiskSignatureExclusionOptionsArgs;
import com.pulumi.azurenative.recoveryservices.inputs.InMageVolumeExclusionOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DiskExclusionInput when doing enable protection of virtual machine in InMage provider.
 * 
 */
public final class InMageDiskExclusionInputArgs extends ResourceArgs {

    public static final InMageDiskExclusionInputArgs Empty = new InMageDiskExclusionInputArgs();

    /**
     * The guest disk signature based option for disk exclusion.
     * 
     */
    @Import(name="diskSignatureOptions")
    private @Nullable Output<List<InMageDiskSignatureExclusionOptionsArgs>> diskSignatureOptions;

    /**
     * @return The guest disk signature based option for disk exclusion.
     * 
     */
    public Optional<Output<List<InMageDiskSignatureExclusionOptionsArgs>>> diskSignatureOptions() {
        return Optional.ofNullable(this.diskSignatureOptions);
    }

    /**
     * The volume label based option for disk exclusion.
     * 
     */
    @Import(name="volumeOptions")
    private @Nullable Output<List<InMageVolumeExclusionOptionsArgs>> volumeOptions;

    /**
     * @return The volume label based option for disk exclusion.
     * 
     */
    public Optional<Output<List<InMageVolumeExclusionOptionsArgs>>> volumeOptions() {
        return Optional.ofNullable(this.volumeOptions);
    }

    private InMageDiskExclusionInputArgs() {}

    private InMageDiskExclusionInputArgs(InMageDiskExclusionInputArgs $) {
        this.diskSignatureOptions = $.diskSignatureOptions;
        this.volumeOptions = $.volumeOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageDiskExclusionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageDiskExclusionInputArgs $;

        public Builder() {
            $ = new InMageDiskExclusionInputArgs();
        }

        public Builder(InMageDiskExclusionInputArgs defaults) {
            $ = new InMageDiskExclusionInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskSignatureOptions The guest disk signature based option for disk exclusion.
         * 
         * @return builder
         * 
         */
        public Builder diskSignatureOptions(@Nullable Output<List<InMageDiskSignatureExclusionOptionsArgs>> diskSignatureOptions) {
            $.diskSignatureOptions = diskSignatureOptions;
            return this;
        }

        /**
         * @param diskSignatureOptions The guest disk signature based option for disk exclusion.
         * 
         * @return builder
         * 
         */
        public Builder diskSignatureOptions(List<InMageDiskSignatureExclusionOptionsArgs> diskSignatureOptions) {
            return diskSignatureOptions(Output.of(diskSignatureOptions));
        }

        /**
         * @param diskSignatureOptions The guest disk signature based option for disk exclusion.
         * 
         * @return builder
         * 
         */
        public Builder diskSignatureOptions(InMageDiskSignatureExclusionOptionsArgs... diskSignatureOptions) {
            return diskSignatureOptions(List.of(diskSignatureOptions));
        }

        /**
         * @param volumeOptions The volume label based option for disk exclusion.
         * 
         * @return builder
         * 
         */
        public Builder volumeOptions(@Nullable Output<List<InMageVolumeExclusionOptionsArgs>> volumeOptions) {
            $.volumeOptions = volumeOptions;
            return this;
        }

        /**
         * @param volumeOptions The volume label based option for disk exclusion.
         * 
         * @return builder
         * 
         */
        public Builder volumeOptions(List<InMageVolumeExclusionOptionsArgs> volumeOptions) {
            return volumeOptions(Output.of(volumeOptions));
        }

        /**
         * @param volumeOptions The volume label based option for disk exclusion.
         * 
         * @return builder
         * 
         */
        public Builder volumeOptions(InMageVolumeExclusionOptionsArgs... volumeOptions) {
            return volumeOptions(List.of(volumeOptions));
        }

        public InMageDiskExclusionInputArgs build() {
            return $;
        }
    }

}
