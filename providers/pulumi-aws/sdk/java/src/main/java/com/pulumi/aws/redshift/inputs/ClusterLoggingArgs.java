// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterLoggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterLoggingArgs Empty = new ClusterLoggingArgs();

    /**
     * The name of an existing S3 bucket where the log files are to be stored. Must be in the same region as the cluster and the cluster must have read bucket and put object permissions.
     * For more information on the permissions required for the bucket, please read the AWS [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/db-auditing.html#db-auditing-enable-logging)
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName == null ? Codegen.empty() : this.bucketName;
    }

    /**
     * Enables logging information such as queries and connection attempts, for the specified Amazon Redshift cluster.
     * 
     */
    @Import(name="enable", required=true)
      private final Output<Boolean> enable;

    public Output<Boolean> enable() {
        return this.enable;
    }

    /**
     * The prefix applied to the log file names.
     * 
     */
    @Import(name="s3KeyPrefix")
      private final @Nullable Output<String> s3KeyPrefix;

    public Output<String> s3KeyPrefix() {
        return this.s3KeyPrefix == null ? Codegen.empty() : this.s3KeyPrefix;
    }

    public ClusterLoggingArgs(
        @Nullable Output<String> bucketName,
        Output<Boolean> enable,
        @Nullable Output<String> s3KeyPrefix) {
        this.bucketName = bucketName;
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.s3KeyPrefix = s3KeyPrefix;
    }

    private ClusterLoggingArgs() {
        this.bucketName = Codegen.empty();
        this.enable = Codegen.empty();
        this.s3KeyPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private Output<Boolean> enable;
        private @Nullable Output<String> s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.enable = defaults.enable;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Codegen.ofNullable(bucketName);
            return this;
        }
        public Builder enable(Output<Boolean> enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder enable(Boolean enable) {
            this.enable = Output.of(Objects.requireNonNull(enable));
            return this;
        }
        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = Codegen.ofNullable(s3KeyPrefix);
            return this;
        }        public ClusterLoggingArgs build() {
            return new ClusterLoggingArgs(bucketName, enable, s3KeyPrefix);
        }
    }
}
