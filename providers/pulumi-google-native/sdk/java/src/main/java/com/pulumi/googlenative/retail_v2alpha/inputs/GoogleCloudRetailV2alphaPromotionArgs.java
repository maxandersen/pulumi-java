// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Promotion information.
 * 
 */
public final class GoogleCloudRetailV2alphaPromotionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaPromotionArgs Empty = new GoogleCloudRetailV2alphaPromotionArgs();

    /**
     * ID of the promotion. For example, &#34;free gift&#34;. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [promotion](https://support.google.com/merchants/answer/7050148).
     * 
     */
    @Import(name="promotionId")
      private final @Nullable Output<String> promotionId;

    public Output<String> promotionId() {
        return this.promotionId == null ? Codegen.empty() : this.promotionId;
    }

    public GoogleCloudRetailV2alphaPromotionArgs(@Nullable Output<String> promotionId) {
        this.promotionId = promotionId;
    }

    private GoogleCloudRetailV2alphaPromotionArgs() {
        this.promotionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaPromotionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> promotionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaPromotionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.promotionId = defaults.promotionId;
        }

        public Builder promotionId(@Nullable Output<String> promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public Builder promotionId(@Nullable String promotionId) {
            this.promotionId = Codegen.ofNullable(promotionId);
            return this;
        }        public GoogleCloudRetailV2alphaPromotionArgs build() {
            return new GoogleCloudRetailV2alphaPromotionArgs(promotionId);
        }
    }
}
