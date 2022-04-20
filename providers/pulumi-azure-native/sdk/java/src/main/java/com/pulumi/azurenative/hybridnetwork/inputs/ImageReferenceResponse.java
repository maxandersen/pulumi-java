// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The image reference properties.
 * 
 */
public final class ImageReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageReferenceResponse Empty = new ImageReferenceResponse();

    /**
     * Specifies in decimal numbers, the exact version of image used to create the virtual machine.
     * 
     */
    @Import(name="exactVersion")
      private final @Nullable String exactVersion;

    public Optional<String> exactVersion() {
        return this.exactVersion == null ? Optional.empty() : Optional.ofNullable(this.exactVersion);
    }

    /**
     * Specifies the offer of the image used to create the virtual machine.
     * 
     */
    @Import(name="offer")
      private final @Nullable String offer;

    public Optional<String> offer() {
        return this.offer == null ? Optional.empty() : Optional.ofNullable(this.offer);
    }

    /**
     * The image publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> publisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    /**
     * The image SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable String sku;

    public Optional<String> sku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * Specifies the version of the image used to create the virtual machine. The allowed formats are Major.Minor.Build or &#39;latest&#39;. Major, Minor, and Build are decimal numbers. Specify &#39;latest&#39; to use the latest version of an image available at deploy time. Even if you use &#39;latest&#39;, the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ImageReferenceResponse(
        @Nullable String exactVersion,
        @Nullable String offer,
        @Nullable String publisher,
        @Nullable String sku,
        @Nullable String version) {
        this.exactVersion = exactVersion;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    private ImageReferenceResponse() {
        this.exactVersion = null;
        this.offer = null;
        this.publisher = null;
        this.sku = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exactVersion;
        private @Nullable String offer;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactVersion = defaults.exactVersion;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder exactVersion(@Nullable String exactVersion) {
            this.exactVersion = exactVersion;
            return this;
        }
        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ImageReferenceResponse build() {
            return new ImageReferenceResponse(exactVersion, offer, publisher, sku, version);
        }
    }
}
