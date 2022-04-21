// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.ImageRawDiskContainerType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters of the raw disk image.
 * 
 */
public final class ImageRawDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRawDiskArgs Empty = new ImageRawDiskArgs();

    /**
     * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
     * 
     */
    @Import(name="containerType")
    private @Nullable Output<ImageRawDiskContainerType> containerType;

    public Optional<Output<ImageRawDiskContainerType>> containerType() {
        return Optional.ofNullable(this.containerType);
    }

    /**
     * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private ImageRawDiskArgs() {}

    private ImageRawDiskArgs(ImageRawDiskArgs $) {
        this.containerType = $.containerType;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRawDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRawDiskArgs $;

        public Builder() {
            $ = new ImageRawDiskArgs();
        }

        public Builder(ImageRawDiskArgs defaults) {
            $ = new ImageRawDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerType(@Nullable Output<ImageRawDiskContainerType> containerType) {
            $.containerType = containerType;
            return this;
        }

        public Builder containerType(ImageRawDiskContainerType containerType) {
            return containerType(Output.of(containerType));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public ImageRawDiskArgs build() {
            return $;
        }
    }

}
