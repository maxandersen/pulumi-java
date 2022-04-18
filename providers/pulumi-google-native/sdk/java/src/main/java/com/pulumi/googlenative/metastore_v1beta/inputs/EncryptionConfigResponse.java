// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Encryption settings for the service.
 * 
 */
public final class EncryptionConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigResponse Empty = new EncryptionConfigResponse();

    /**
     * The fully qualified customer provided Cloud KMS key name to use for customer data encryption, in the following form:projects/{project_number}/locations/{location_id}/keyRings/{key_ring_id}/cryptoKeys/{crypto_key_id}.
     * 
     */
    @Import(name="kmsKey", required=true)
      private final String kmsKey;

    public String kmsKey() {
        return this.kmsKey;
    }

    public EncryptionConfigResponse(String kmsKey) {
        this.kmsKey = Objects.requireNonNull(kmsKey, "expected parameter 'kmsKey' to be non-null");
    }

    private EncryptionConfigResponse() {
        this.kmsKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder kmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(kmsKey);
        }
    }
}
