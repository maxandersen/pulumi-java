// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a symmetric key for token validation.
 * 
 */
public final class ContentKeyPolicySymmetricTokenKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicySymmetricTokenKeyResponse Empty = new ContentKeyPolicySymmetricTokenKeyResponse();

    /**
     * The key value of the key
     * 
     */
    @Import(name="keyValue", required=true)
      private final String keyValue;

    public String keyValue() {
        return this.keyValue;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicySymmetricTokenKey&#39;.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String odataType() {
        return this.odataType;
    }

    public ContentKeyPolicySymmetricTokenKeyResponse(
        String keyValue,
        String odataType) {
        this.keyValue = Objects.requireNonNull(keyValue, "expected parameter 'keyValue' to be non-null");
        this.odataType = Codegen.stringProp("odataType").arg(odataType).require();
    }

    private ContentKeyPolicySymmetricTokenKeyResponse() {
        this.keyValue = null;
        this.odataType = null;
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
