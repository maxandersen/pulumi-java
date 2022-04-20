// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectLogsConfigS3LogsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectLogsConfigS3LogsArgs Empty = new ProjectLogsConfigS3LogsArgs();

    /**
     * Specifies the bucket owner&#39;s access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    @Import(name="bucketOwnerAccess")
      private final @Nullable Output<String> bucketOwnerAccess;

    public Output<String> bucketOwnerAccess() {
        return this.bucketOwnerAccess == null ? Codegen.empty() : this.bucketOwnerAccess;
    }

    /**
     * Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    @Import(name="encryptionDisabled")
      private final @Nullable Output<Boolean> encryptionDisabled;

    public Output<Boolean> encryptionDisabled() {
        return this.encryptionDisabled == null ? Codegen.empty() : this.encryptionDisabled;
    }

    /**
     * Location of the source code from git or s3.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Current status of logs in S3 for a build project. Valid values: `ENABLED`, `DISABLED`. Defaults to `DISABLED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public ProjectLogsConfigS3LogsArgs(
        @Nullable Output<String> bucketOwnerAccess,
        @Nullable Output<Boolean> encryptionDisabled,
        @Nullable Output<String> location,
        @Nullable Output<String> status) {
        this.bucketOwnerAccess = bucketOwnerAccess;
        this.encryptionDisabled = encryptionDisabled;
        this.location = location;
        this.status = status;
    }

    private ProjectLogsConfigS3LogsArgs() {
        this.bucketOwnerAccess = Codegen.empty();
        this.encryptionDisabled = Codegen.empty();
        this.location = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLogsConfigS3LogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketOwnerAccess;
        private @Nullable Output<Boolean> encryptionDisabled;
        private @Nullable Output<String> location;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLogsConfigS3LogsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketOwnerAccess = defaults.bucketOwnerAccess;
    	      this.encryptionDisabled = defaults.encryptionDisabled;
    	      this.location = defaults.location;
    	      this.status = defaults.status;
        }

        public Builder bucketOwnerAccess(@Nullable Output<String> bucketOwnerAccess) {
            this.bucketOwnerAccess = bucketOwnerAccess;
            return this;
        }
        public Builder bucketOwnerAccess(@Nullable String bucketOwnerAccess) {
            this.bucketOwnerAccess = Codegen.ofNullable(bucketOwnerAccess);
            return this;
        }
        public Builder encryptionDisabled(@Nullable Output<Boolean> encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }
        public Builder encryptionDisabled(@Nullable Boolean encryptionDisabled) {
            this.encryptionDisabled = Codegen.ofNullable(encryptionDisabled);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public ProjectLogsConfigS3LogsArgs build() {
            return new ProjectLogsConfigS3LogsArgs(bucketOwnerAccess, encryptionDisabled, location, status);
        }
    }
}
