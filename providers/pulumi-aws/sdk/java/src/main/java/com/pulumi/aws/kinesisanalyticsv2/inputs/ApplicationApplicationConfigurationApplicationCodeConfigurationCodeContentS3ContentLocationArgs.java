// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs Empty = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs();

    /**
     * The ARN for the S3 bucket containing the application code.
     * 
     */
    @Import(name="bucketArn", required=true)
    private Output<String> bucketArn;

    public Output<String> bucketArn() {
        return this.bucketArn;
    }

    /**
     * The file key for the object containing the application code.
     * 
     */
    @Import(name="fileKey", required=true)
    private Output<String> fileKey;

    public Output<String> fileKey() {
        return this.fileKey;
    }

    /**
     * The version of the object containing the application code.
     * 
     */
    @Import(name="objectVersion")
    private @Nullable Output<String> objectVersion;

    public Optional<Output<String>> objectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs() {}

    private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs $) {
        this.bucketArn = $.bucketArn;
        this.fileKey = $.fileKey;
        this.objectVersion = $.objectVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs();
        }

        public Builder(ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs defaults) {
            $ = new ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketArn(Output<String> bucketArn) {
            $.bucketArn = bucketArn;
            return this;
        }

        public Builder bucketArn(String bucketArn) {
            return bucketArn(Output.of(bucketArn));
        }

        public Builder fileKey(Output<String> fileKey) {
            $.fileKey = fileKey;
            return this;
        }

        public Builder fileKey(String fileKey) {
            return fileKey(Output.of(fileKey));
        }

        public Builder objectVersion(@Nullable Output<String> objectVersion) {
            $.objectVersion = objectVersion;
            return this;
        }

        public Builder objectVersion(String objectVersion) {
            return objectVersion(Output.of(objectVersion));
        }

        public ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationArgs build() {
            $.bucketArn = Objects.requireNonNull($.bucketArn, "expected parameter 'bucketArn' to be non-null");
            $.fileKey = Objects.requireNonNull($.fileKey, "expected parameter 'fileKey' to be non-null");
            return $;
        }
    }

}
