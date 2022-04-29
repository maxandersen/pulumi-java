// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.HostCaching;
import com.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is the OS disk image.
 * 
 */
public final class GalleryOSDiskImageArgs extends ResourceArgs {

    public static final GalleryOSDiskImageArgs Empty = new GalleryOSDiskImageArgs();

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

    private GalleryOSDiskImageArgs() {}

    private GalleryOSDiskImageArgs(GalleryOSDiskImageArgs $) {
        this.hostCaching = $.hostCaching;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryOSDiskImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryOSDiskImageArgs $;

        public Builder() {
            $ = new GalleryOSDiskImageArgs();
        }

        public Builder(GalleryOSDiskImageArgs defaults) {
            $ = new GalleryOSDiskImageArgs(Objects.requireNonNull(defaults));
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

        public GalleryOSDiskImageArgs build() {
            return $;
        }
    }

}
