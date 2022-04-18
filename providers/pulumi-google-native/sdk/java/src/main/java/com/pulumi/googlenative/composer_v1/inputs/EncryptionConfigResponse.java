// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The encryption options for the Cloud Composer environment and its dependencies.Supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
 * 
 */
public final class EncryptionConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigResponse Empty = new EncryptionConfigResponse();

    /**
     * Optional. Customer-managed Encryption Key available through Google's Key Management Service. Cannot be updated. If not specified, Google-managed key will be used.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final String kmsKeyName;

    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    public EncryptionConfigResponse(String kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private EncryptionConfigResponse() {
        this.kmsKeyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }        public EncryptionConfigResponse build() {
            return new EncryptionConfigResponse(kmsKeyName);
        }
    }
}
