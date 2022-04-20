// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the publisher information of a process/rule
 * 
 */
public final class PublisherInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PublisherInfoResponse Empty = new PublisherInfoResponse();

    /**
     * The &#34;OriginalName&#34; field taken from the file&#39;s version resource
     * 
     */
    @Import(name="binaryName")
      private final @Nullable String binaryName;

    public Optional<String> binaryName() {
        return this.binaryName == null ? Optional.empty() : Optional.ofNullable(this.binaryName);
    }

    /**
     * The product name taken from the file&#39;s version resource
     * 
     */
    @Import(name="productName")
      private final @Nullable String productName;

    public Optional<String> productName() {
        return this.productName == null ? Optional.empty() : Optional.ofNullable(this.productName);
    }

    /**
     * The Subject field of the x.509 certificate used to sign the code, using the following fields -  O = Organization, L = Locality, S = State or Province, and C = Country
     * 
     */
    @Import(name="publisherName")
      private final @Nullable String publisherName;

    public Optional<String> publisherName() {
        return this.publisherName == null ? Optional.empty() : Optional.ofNullable(this.publisherName);
    }

    /**
     * The binary file version taken from the file&#39;s version resource
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public PublisherInfoResponse(
        @Nullable String binaryName,
        @Nullable String productName,
        @Nullable String publisherName,
        @Nullable String version) {
        this.binaryName = binaryName;
        this.productName = productName;
        this.publisherName = publisherName;
        this.version = version;
    }

    private PublisherInfoResponse() {
        this.binaryName = null;
        this.productName = null;
        this.publisherName = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublisherInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String binaryName;
        private @Nullable String productName;
        private @Nullable String publisherName;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(PublisherInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binaryName = defaults.binaryName;
    	      this.productName = defaults.productName;
    	      this.publisherName = defaults.publisherName;
    	      this.version = defaults.version;
        }

        public Builder binaryName(@Nullable String binaryName) {
            this.binaryName = binaryName;
            return this;
        }
        public Builder productName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }
        public Builder publisherName(@Nullable String publisherName) {
            this.publisherName = publisherName;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public PublisherInfoResponse build() {
            return new PublisherInfoResponse(binaryName, productName, publisherName, version);
        }
    }
}
