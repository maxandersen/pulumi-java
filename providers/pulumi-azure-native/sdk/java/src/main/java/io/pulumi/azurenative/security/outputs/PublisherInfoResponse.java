// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PublisherInfoResponse {
    /**
     * The "OriginalName" field taken from the file's version resource
     * 
     */
    private final @Nullable String binaryName;
    /**
     * The product name taken from the file's version resource
     * 
     */
    private final @Nullable String productName;
    /**
     * The Subject field of the x.509 certificate used to sign the code, using the following fields -  O = Organization, L = Locality, S = State or Province, and C = Country
     * 
     */
    private final @Nullable String publisherName;
    /**
     * The binary file version taken from the file's version resource
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private PublisherInfoResponse(
        @CustomType.Parameter("binaryName") @Nullable String binaryName,
        @CustomType.Parameter("productName") @Nullable String productName,
        @CustomType.Parameter("publisherName") @Nullable String publisherName,
        @CustomType.Parameter("version") @Nullable String version) {
        this.binaryName = binaryName;
        this.productName = productName;
        this.publisherName = publisherName;
        this.version = version;
    }

    /**
     * The "OriginalName" field taken from the file's version resource
     * 
    */
    public Optional<String> binaryName() {
        return Optional.ofNullable(this.binaryName);
    }
    /**
     * The product name taken from the file's version resource
     * 
    */
    public Optional<String> productName() {
        return Optional.ofNullable(this.productName);
    }
    /**
     * The Subject field of the x.509 certificate used to sign the code, using the following fields -  O = Organization, L = Locality, S = State or Province, and C = Country
     * 
    */
    public Optional<String> publisherName() {
        return Optional.ofNullable(this.publisherName);
    }
    /**
     * The binary file version taken from the file's version resource
     * 
    */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
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
