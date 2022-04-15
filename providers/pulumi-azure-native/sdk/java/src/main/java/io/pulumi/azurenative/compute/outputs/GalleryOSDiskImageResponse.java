// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.GalleryArtifactVersionSourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GalleryOSDiskImageResponse {
    /**
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'
     * 
     */
    private final @Nullable String hostCaching;
    /**
     * This property indicates the size of the VHD to be created.
     * 
     */
    private final Integer sizeInGB;
    /**
     * The gallery artifact version source.
     * 
     */
    private final @Nullable GalleryArtifactVersionSourceResponse source;

    @CustomType.Constructor
    private GalleryOSDiskImageResponse(
        @CustomType.Parameter("hostCaching") @Nullable String hostCaching,
        @CustomType.Parameter("sizeInGB") Integer sizeInGB,
        @CustomType.Parameter("source") @Nullable GalleryArtifactVersionSourceResponse source) {
        this.hostCaching = hostCaching;
        this.sizeInGB = sizeInGB;
        this.source = source;
    }

    /**
     * The host caching of the disk. Valid values are 'None', 'ReadOnly', and 'ReadWrite'
     * 
    */
    public Optional<String> hostCaching() {
        return Optional.ofNullable(this.hostCaching);
    }
    /**
     * This property indicates the size of the VHD to be created.
     * 
    */
    public Integer sizeInGB() {
        return this.sizeInGB;
    }
    /**
     * The gallery artifact version source.
     * 
    */
    public Optional<GalleryArtifactVersionSourceResponse> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryOSDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostCaching;
        private Integer sizeInGB;
        private @Nullable GalleryArtifactVersionSourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryOSDiskImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostCaching = defaults.hostCaching;
    	      this.sizeInGB = defaults.sizeInGB;
    	      this.source = defaults.source;
        }

        public Builder hostCaching(@Nullable String hostCaching) {
            this.hostCaching = hostCaching;
            return this;
        }
        public Builder sizeInGB(Integer sizeInGB) {
            this.sizeInGB = Objects.requireNonNull(sizeInGB);
            return this;
        }
        public Builder source(@Nullable GalleryArtifactVersionSourceResponse source) {
            this.source = source;
            return this;
        }        public GalleryOSDiskImageResponse build() {
            return new GalleryOSDiskImageResponse(hostCaching, sizeInGB, source);
        }
    }
}
