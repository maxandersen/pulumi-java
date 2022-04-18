// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudiot_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PublicKeyCredentialResponse {
    /**
     * The format of the key.
     * 
     */
    private final String format;
    /**
     * The key data.
     * 
     */
    private final String key;

    @CustomType.Constructor
    private PublicKeyCredentialResponse(
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("key") String key) {
        this.format = format;
        this.key = key;
    }

    /**
     * The format of the key.
     * 
    */
    public String format() {
        return this.format;
    }
    /**
     * The key data.
     * 
    */
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String format;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.key = defaults.key;
        }

        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }        public PublicKeyCredentialResponse build() {
            return new PublicKeyCredentialResponse(format, key);
        }
    }
}
