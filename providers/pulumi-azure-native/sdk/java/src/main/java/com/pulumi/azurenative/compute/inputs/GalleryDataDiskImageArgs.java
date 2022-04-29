// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.HostCaching;
import com.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is the data disk image.
 * 
 */
public final class GalleryDataDiskImageArgs extends ResourceArgs {

    public static final GalleryDataDiskImageArgs Empty = new GalleryDataDiskImageArgs();

    /**
     * The host caching of the disk. Valid values are &#39;None&#39;, &#39;ReadOnly&#39;, and &#39;ReadWrite&#39;
     * 
     */
    @Import(name="hostCaching")
    private @Nullable Output<HostCaching> hostCaching;

    /**
     * @return The host caching of the disk. Valid values are &#39;None&#39;, &#39;ReadOnly&#39;, and &#39;ReadWrite&#39;
     * 
     */
    public Optional<Output<HostCaching>> hostCaching() {
        return Optional.ofNullable(this.hostCaching);
    }

    /**
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    @Import(name="lun", required=true)
    private Output<Integer> lun;

    /**
     * @return This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    public Output<Integer> lun() {
        return this.lun;
    }

    /**
     * The gallery artifact version source.
     * 
     */
    @Import(name="source")
    private @Nullable Output<GalleryArtifactVersionSourceArgs> source;

    /**
     * @return The gallery artifact version source.
     * 
     */
    public Optional<Output<GalleryArtifactVersionSourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private GalleryDataDiskImageArgs() {}

    private GalleryDataDiskImageArgs(GalleryDataDiskImageArgs $) {
        this.hostCaching = $.hostCaching;
        this.lun = $.lun;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryDataDiskImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryDataDiskImageArgs $;

        public Builder() {
            $ = new GalleryDataDiskImageArgs();
        }

        public Builder(GalleryDataDiskImageArgs defaults) {
            $ = new GalleryDataDiskImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostCaching The host caching of the disk. Valid values are &#39;None&#39;, &#39;ReadOnly&#39;, and &#39;ReadWrite&#39;
         * 
         * @return builder
         * 
         */
        public Builder hostCaching(@Nullable Output<HostCaching> hostCaching) {
            $.hostCaching = hostCaching;
            return this;
        }

        /**
         * @param hostCaching The host caching of the disk. Valid values are &#39;None&#39;, &#39;ReadOnly&#39;, and &#39;ReadWrite&#39;
         * 
         * @return builder
         * 
         */
        public Builder hostCaching(HostCaching hostCaching) {
            return hostCaching(Output.of(hostCaching));
        }

        /**
         * @param lun This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
         * 
         * @return builder
         * 
         */
        public Builder lun(Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param lun This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        /**
         * @param source The gallery artifact version source.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<GalleryArtifactVersionSourceArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The gallery artifact version source.
         * 
         * @return builder
         * 
         */
        public Builder source(GalleryArtifactVersionSourceArgs source) {
            return source(Output.of(source));
        }

        public GalleryDataDiskImageArgs build() {
            $.lun = Objects.requireNonNull($.lun, "expected parameter 'lun' to be non-null");
            return $;
        }
    }

}
