// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.storage_v1.outputs.BucketIamConfigurationBucketPolicyOnlyResponse;
import io.pulumi.googlenative.storage_v1.outputs.BucketIamConfigurationUniformBucketLevelAccessResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BucketIamConfigurationResponse {
    /**
     * The bucket's uniform bucket-level access configuration. The feature was formerly known as Bucket Policy Only. For backward compatibility, this field will be populated with identical information as the uniformBucketLevelAccess field. We recommend using the uniformBucketLevelAccess field to enable and disable the feature.
     * 
     */
    private final BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly;
    /**
     * The bucket's Public Access Prevention configuration. Currently, 'inherited' and 'enforced' are supported.
     * 
     */
    private final String publicAccessPrevention;
    /**
     * The bucket's uniform bucket-level access configuration.
     * 
     */
    private final BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess;

    @OutputCustomType.Constructor
    private BucketIamConfigurationResponse(
        @OutputCustomType.Parameter("bucketPolicyOnly") BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly,
        @OutputCustomType.Parameter("publicAccessPrevention") String publicAccessPrevention,
        @OutputCustomType.Parameter("uniformBucketLevelAccess") BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess) {
        this.bucketPolicyOnly = bucketPolicyOnly;
        this.publicAccessPrevention = publicAccessPrevention;
        this.uniformBucketLevelAccess = uniformBucketLevelAccess;
    }

    /**
     * The bucket's uniform bucket-level access configuration. The feature was formerly known as Bucket Policy Only. For backward compatibility, this field will be populated with identical information as the uniformBucketLevelAccess field. We recommend using the uniformBucketLevelAccess field to enable and disable the feature.
     * 
    */
    public BucketIamConfigurationBucketPolicyOnlyResponse getBucketPolicyOnly() {
        return this.bucketPolicyOnly;
    }
    /**
     * The bucket's Public Access Prevention configuration. Currently, 'inherited' and 'enforced' are supported.
     * 
    */
    public String getPublicAccessPrevention() {
        return this.publicAccessPrevention;
    }
    /**
     * The bucket's uniform bucket-level access configuration.
     * 
    */
    public BucketIamConfigurationUniformBucketLevelAccessResponse getUniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess;
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

        public Builder setBucketPolicyOnly(BucketIamConfigurationBucketPolicyOnlyResponse bucketPolicyOnly) {
            this.bucketPolicyOnly = Objects.requireNonNull(bucketPolicyOnly);
            return this;
        }

        public Builder setPublicAccessPrevention(String publicAccessPrevention) {
            this.publicAccessPrevention = Objects.requireNonNull(publicAccessPrevention);
            return this;
        }

        public Builder setUniformBucketLevelAccess(BucketIamConfigurationUniformBucketLevelAccessResponse uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = Objects.requireNonNull(uniformBucketLevelAccess);
            return this;
        }
        public BucketIamConfigurationResponse build() {
            return new BucketIamConfigurationResponse(bucketPolicyOnly, publicAccessPrevention, uniformBucketLevelAccess);
        }
    }
}
