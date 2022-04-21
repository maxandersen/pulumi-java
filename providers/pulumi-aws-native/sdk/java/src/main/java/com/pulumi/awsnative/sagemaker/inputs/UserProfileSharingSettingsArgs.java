// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.enums.UserProfileSharingSettingsNotebookOutputOption;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies options when sharing an Amazon SageMaker Studio notebook. These settings are specified as part of DefaultUserSettings when the CreateDomain API is called, and as part of UserSettings when the CreateUserProfile API is called.
 * 
 */
public final class UserProfileSharingSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserProfileSharingSettingsArgs Empty = new UserProfileSharingSettingsArgs();

    /**
     * Whether to include the notebook cell output when sharing the notebook. The default is Disabled.
     * 
     */
    @Import(name="notebookOutputOption")
    private @Nullable Output<UserProfileSharingSettingsNotebookOutputOption> notebookOutputOption;

    public Optional<Output<UserProfileSharingSettingsNotebookOutputOption>> notebookOutputOption() {
        return Optional.ofNullable(this.notebookOutputOption);
    }

    /**
     * When NotebookOutputOption is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
     */
    @Import(name="s3KmsKeyId")
    private @Nullable Output<String> s3KmsKeyId;

    public Optional<Output<String>> s3KmsKeyId() {
        return Optional.ofNullable(this.s3KmsKeyId);
    }

    /**
     * When NotebookOutputOption is Allowed, the Amazon S3 bucket used to store the shared notebook snapshots.
     * 
     */
    @Import(name="s3OutputPath")
    private @Nullable Output<String> s3OutputPath;

    public Optional<Output<String>> s3OutputPath() {
        return Optional.ofNullable(this.s3OutputPath);
    }

    private UserProfileSharingSettingsArgs() {}

    private UserProfileSharingSettingsArgs(UserProfileSharingSettingsArgs $) {
        this.notebookOutputOption = $.notebookOutputOption;
        this.s3KmsKeyId = $.s3KmsKeyId;
        this.s3OutputPath = $.s3OutputPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserProfileSharingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileSharingSettingsArgs $;

        public Builder() {
            $ = new UserProfileSharingSettingsArgs();
        }

        public Builder(UserProfileSharingSettingsArgs defaults) {
            $ = new UserProfileSharingSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder notebookOutputOption(@Nullable Output<UserProfileSharingSettingsNotebookOutputOption> notebookOutputOption) {
            $.notebookOutputOption = notebookOutputOption;
            return this;
        }

        public Builder notebookOutputOption(UserProfileSharingSettingsNotebookOutputOption notebookOutputOption) {
            return notebookOutputOption(Output.of(notebookOutputOption));
        }

        public Builder s3KmsKeyId(@Nullable Output<String> s3KmsKeyId) {
            $.s3KmsKeyId = s3KmsKeyId;
            return this;
        }

        public Builder s3KmsKeyId(String s3KmsKeyId) {
            return s3KmsKeyId(Output.of(s3KmsKeyId));
        }

        public Builder s3OutputPath(@Nullable Output<String> s3OutputPath) {
            $.s3OutputPath = s3OutputPath;
            return this;
        }

        public Builder s3OutputPath(String s3OutputPath) {
            return s3OutputPath(Output.of(s3OutputPath));
        }

        public UserProfileSharingSettingsArgs build() {
            return $;
        }
    }

}
