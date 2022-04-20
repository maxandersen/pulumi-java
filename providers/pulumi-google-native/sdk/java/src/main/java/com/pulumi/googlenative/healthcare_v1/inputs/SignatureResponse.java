// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.inputs.ImageResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * User signature.
 * 
 */
public final class SignatureResponse extends com.pulumi.resources.InvokeArgs {

    public static final SignatureResponse Empty = new SignatureResponse();

    /**
     * Optional. An image of the user&#39;s signature.
     * 
     */
    @Import(name="image", required=true)
      private final ImageResponse image;

    public ImageResponse image() {
        return this.image;
    }

    /**
     * Optional. Metadata associated with the user&#39;s signature. For example, the user&#39;s name or the user&#39;s title.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * Optional. Timestamp of the signature.
     * 
     */
    @Import(name="signatureTime", required=true)
      private final String signatureTime;

    public String signatureTime() {
        return this.signatureTime;
    }

    /**
     * User&#39;s UUID provided by the client.
     * 
     */
    @Import(name="userId", required=true)
      private final String userId;

    public String userId() {
        return this.userId;
    }

    public SignatureResponse(
        ImageResponse image,
        Map<String,String> metadata,
        String signatureTime,
        String userId) {
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.signatureTime = Objects.requireNonNull(signatureTime, "expected parameter 'signatureTime' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private SignatureResponse() {
        this.image = null;
        this.metadata = Map.of();
        this.signatureTime = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageResponse image;
        private Map<String,String> metadata;
        private String signatureTime;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(SignatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
    	      this.metadata = defaults.metadata;
    	      this.signatureTime = defaults.signatureTime;
    	      this.userId = defaults.userId;
        }

        public Builder image(ImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder signatureTime(String signatureTime) {
            this.signatureTime = Objects.requireNonNull(signatureTime);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public SignatureResponse build() {
            return new SignatureResponse(image, metadata, signatureTime, userId);
        }
    }
}
