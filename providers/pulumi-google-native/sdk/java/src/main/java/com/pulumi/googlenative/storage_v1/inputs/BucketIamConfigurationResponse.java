// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storage_v1.inputs.BucketIamConfigurationBucketPolicyOnlyResponse;
import com.pulumi.googlenative.storage_v1.inputs.BucketIamConfigurationUniformBucketLevelAccessResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The bucket&#39;s IAM configuration.
 * 
 */
public final class BucketIamConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final BucketIamConfigurationResponse Empty = new BucketIamConfigurationResponse();

    /**
     * The bucket&#39;s uniform bucket-level access configuration. The feature was formerly known as Bucket Policy Only. For backward compatibility, this field will be populated with identical information as the uniformBucketLevelAccess field. We recommend using the uniformBucketLevelAccess field to enable and disable the feature.
     * 
     */
    @Import(name="bucketPolicyOnly", required=true)
      private final BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly;

    public BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly() {
        return this.bucketPolicyOnly;
    }

    /**
     * The bucket&#39;s Public Access Prevention configuration. Currently, &#39;inherited&#39; and &#39;enforced&#39; are supported.
     * 
     */
    @Import(name="publicAccessPrevention", required=true)
      private final String publicAccessPrevention;

    public String publicAccessPrevention() {
        return this.publicAccessPrevention;
    }

    /**
     * The bucket&#39;s uniform bucket-level access configuration.
     * 
     */
    @Import(name="uniformBucketLevelAccess", required=true)
      private final BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess;

    public BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess;
    }

    public BucketIamConfigurationResponse(
        BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly,
        String publicAccessPrevention,
        BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess) {
        this.bucketPolicyOnly = Objects.requireNonNull(bucketPolicyOnly, "expected parameter 'bucketPolicyOnly' to be non-null");
        this.publicAccessPrevention = Objects.requireNonNull(publicAccessPrevention, "expected parameter 'publicAccessPrevention' to be non-null");
        this.uniformBucketLevelAccess = Objects.requireNonNull(uniformBucketLevelAccess, "expected parameter 'uniformBucketLevelAccess' to be non-null");
    }

    private BucketIamConfigurationResponse() {
        this.bucketPolicyOnly = null;
        this.publicAccessPrevention = null;
        this.uniformBucketLevelAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly;
        private String publicAccessPrevention;
        private BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketPolicyOnly = defaults.bucketPolicyOnly;
    	      this.publicAccessPrevention = defaults.publicAccessPrevention;
    	      this.uniformBucketLevelAccess = defaults.uniformBucketLevelAccess;
        }

        public Builder bucketPolicyOnly(BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly) {
            this.bucketPolicyOnly = Objects.requireNonNull(bucketPolicyOnly);
            return this;
        }
        public Builder publicAccessPrevention(String publicAccessPrevention) {
            this.publicAccessPrevention = Objects.requireNonNull(publicAccessPrevention);
            return this;
        }
        public Builder uniformBucketLevelAccess(BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = Objects.requireNonNull(uniformBucketLevelAccess);
            return this;
        }        public BucketIamConfigurationResponse build() {
            return new BucketIamConfigurationResponse(bucketPolicyOnly, publicAccessPrevention, uniformBucketLevelAccess);
        }
    }
}
