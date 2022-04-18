// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContentKeyPolicySymmetricTokenKeyResponse {
    /**
     * The key value of the key
     * 
     */
    private final String keyValue;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicySymmetricTokenKey'.
     * 
     */
    private final String odataType;

    @CustomType.Constructor
    private ContentKeyPolicySymmetricTokenKeyResponse(
        @CustomType.Parameter("keyValue") String keyValue,
        @CustomType.Parameter("odataType") String odataType) {
        this.keyValue = keyValue;
        this.odataType = odataType;
    }

    /**
     * The key value of the key
     * 
    */
    public String keyValue() {
        return this.keyValue;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicySymmetricTokenKey'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicySymmetricTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicySymmetricTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyValue = defaults.keyValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder keyValue(String keyValue) {
            this.keyValue = Objects.requireNonNull(keyValue);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public ContentKeyPolicySymmetricTokenKeyResponse build() {
            return new ContentKeyPolicySymmetricTokenKeyResponse(keyValue, odataType);
        }
    }
}
