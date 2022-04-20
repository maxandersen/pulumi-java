// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages.inputs;

import com.pulumi.azurenative.virtualmachineimages.inputs.PlatformImagePurchasePlanResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an image source from [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
 * 
 */
public final class ImageTemplatePlatformImageSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageTemplatePlatformImageSourceResponse Empty = new ImageTemplatePlatformImageSourceResponse();

    /**
     * Image offer from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="offer")
      private final @Nullable String offer;

    public Optional<String> offer() {
        return this.offer == null ? Optional.empty() : Optional.ofNullable(this.offer);
    }

    /**
     * Optional configuration of purchase plan for platform image.
     * 
     */
    @Import(name="planInfo")
      private final @Nullable PlatformImagePurchasePlanResponse planInfo;

    public Optional<PlatformImagePurchasePlanResponse> planInfo() {
        return this.planInfo == null ? Optional.empty() : Optional.ofNullable(this.planInfo);
    }

    /**
     * Image Publisher in [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> publisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    /**
     * Image sku from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages).
     * 
     */
    @Import(name="sku")
      private final @Nullable String sku;

    public Optional<String> sku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * Specifies the type of source image you want to start with.
     * Expected value is &#39;PlatformImage&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Image version from the [Azure Gallery Images](https://docs.microsoft.com/en-us/rest/api/compute/virtualmachineimages). If &#39;latest&#39; is specified here, the version is evaluated when the image build takes place, not when the template is submitted. Specifying &#39;latest&#39; could cause ROUNDTRIP_INCONSISTENT_PROPERTY issue which will be fixed.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> version() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ImageTemplatePlatformImageSourceResponse(
        @Nullable String offer,
        @Nullable PlatformImagePurchasePlanResponse planInfo,
        @Nullable String publisher,
        @Nullable String sku,
        String type,
        @Nullable String version) {
        this.offer = offer;
        this.planInfo = planInfo;
        this.publisher = publisher;
        this.sku = sku;
        this.type = Codegen.stringProp("type").arg(type).require();
        this.version = version;
    }

    private ImageTemplatePlatformImageSourceResponse() {
        this.offer = null;
        this.planInfo = null;
        this.publisher = null;
        this.sku = null;
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplatePlatformImageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String offer;
        private @Nullable PlatformImagePurchasePlanResponse planInfo;
        private @Nullable String publisher;
        private @Nullable String sku;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplatePlatformImageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.planInfo = defaults.planInfo;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }
        public Builder planInfo(@Nullable PlatformImagePurchasePlanResponse planInfo) {
            this.planInfo = planInfo;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ImageTemplatePlatformImageSourceResponse build() {
            return new ImageTemplatePlatformImageSourceResponse(offer, planInfo, publisher, sku, type, version);
        }
    }
}
