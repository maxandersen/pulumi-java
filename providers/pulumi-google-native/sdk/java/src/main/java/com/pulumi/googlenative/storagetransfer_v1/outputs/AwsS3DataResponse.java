// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.storagetransfer_v1.outputs.AwsAccessKeyResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsS3DataResponse {
    /**
     * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
     * 
     */
    private final AwsAccessKeyResponse awsAccessKey;
    /**
     * S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
     * 
     */
    private final String bucketName;
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
     */
    private final String path;
    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a `AssumeRoleWithWebIdentity` call for the provided role using the GoogleServiceAccount for this project.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private AwsS3DataResponse(
        @CustomType.Parameter("awsAccessKey") AwsAccessKeyResponse awsAccessKey,
        @CustomType.Parameter("bucketName") String bucketName,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.awsAccessKey = awsAccessKey;
        this.bucketName = bucketName;
        this.path = path;
        this.roleArn = roleArn;
    }

    /**
     * Input only. AWS access key used to sign the API requests to the AWS S3 bucket. Permissions on the bucket must be granted to the access ID of the AWS access key. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
     * 
    */
    public AwsAccessKeyResponse awsAccessKey() {
        return this.awsAccessKey;
    }
    /**
     * S3 Bucket name (see [Creating a bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
     * 
    */
    public String bucketName() {
        return this.bucketName;
    }
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a &#39;/&#39;. This field is treated as an object prefix. As such, it should generally not begin with a &#39;/&#39;.
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * The Amazon Resource Name (ARN) of the role to support temporary credentials via `AssumeRoleWithWebIdentity`. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a `AssumeRoleWithWebIdentity` call for the provided role using the GoogleServiceAccount for this project.
     * 
    */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsS3DataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsAccessKeyResponse awsAccessKey;
        private String bucketName;
        private String path;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsS3DataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccessKey = defaults.awsAccessKey;
    	      this.bucketName = defaults.bucketName;
    	      this.path = defaults.path;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder awsAccessKey(AwsAccessKeyResponse awsAccessKey) {
            this.awsAccessKey = Objects.requireNonNull(awsAccessKey);
            return this;
        }
        public Builder bucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public AwsS3DataResponse build() {
            return new AwsS3DataResponse(awsAccessKey, bucketName, path, roleArn);
        }
    }
}
