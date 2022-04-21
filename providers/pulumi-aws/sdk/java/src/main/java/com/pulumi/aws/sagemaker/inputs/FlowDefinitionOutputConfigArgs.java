// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowDefinitionOutputConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionOutputConfigArgs Empty = new FlowDefinitionOutputConfigArgs();

    /**
     * The Amazon Key Management Service (KMS) key ARN for server-side encryption.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The Amazon S3 path where the object containing human output will be made available.
     * 
     */
    @Import(name="s3OutputPath", required=true)
    private Output<String> s3OutputPath;

    public Output<String> s3OutputPath() {
        return this.s3OutputPath;
    }

    private FlowDefinitionOutputConfigArgs() {}

    private FlowDefinitionOutputConfigArgs(FlowDefinitionOutputConfigArgs $) {
        this.kmsKeyId = $.kmsKeyId;
        this.s3OutputPath = $.s3OutputPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowDefinitionOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowDefinitionOutputConfigArgs $;

        public Builder() {
            $ = new FlowDefinitionOutputConfigArgs();
        }

        public Builder(FlowDefinitionOutputConfigArgs defaults) {
            $ = new FlowDefinitionOutputConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder s3OutputPath(Output<String> s3OutputPath) {
            $.s3OutputPath = s3OutputPath;
            return this;
        }

        public Builder s3OutputPath(String s3OutputPath) {
            return s3OutputPath(Output.of(s3OutputPath));
        }

        public FlowDefinitionOutputConfigArgs build() {
            $.s3OutputPath = Objects.requireNonNull($.s3OutputPath, "expected parameter 's3OutputPath' to be non-null");
            return $;
        }
    }

}
