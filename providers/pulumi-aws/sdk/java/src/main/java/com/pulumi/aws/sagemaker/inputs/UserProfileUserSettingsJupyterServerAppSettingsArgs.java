// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsJupyterServerAppSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsJupyterServerAppSettingsArgs Empty = new UserProfileUserSettingsJupyterServerAppSettingsArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec", required=true)
    private Output<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

    public Output<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    @Import(name="lifecycleConfigArns")
    private @Nullable Output<List<String>> lifecycleConfigArns;

    public Optional<Output<List<String>>> lifecycleConfigArns() {
        return Optional.ofNullable(this.lifecycleConfigArns);
    }

    private UserProfileUserSettingsJupyterServerAppSettingsArgs() {}

    private UserProfileUserSettingsJupyterServerAppSettingsArgs(UserProfileUserSettingsJupyterServerAppSettingsArgs $) {
        this.defaultResourceSpec = $.defaultResourceSpec;
        this.lifecycleConfigArns = $.lifecycleConfigArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserProfileUserSettingsJupyterServerAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileUserSettingsJupyterServerAppSettingsArgs $;

        public Builder() {
            $ = new UserProfileUserSettingsJupyterServerAppSettingsArgs();
        }

        public Builder(UserProfileUserSettingsJupyterServerAppSettingsArgs defaults) {
            $ = new UserProfileUserSettingsJupyterServerAppSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultResourceSpec(Output<UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
            $.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        public Builder defaultResourceSpec(UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpecArgs defaultResourceSpec) {
            return defaultResourceSpec(Output.of(defaultResourceSpec));
        }

        public Builder lifecycleConfigArns(@Nullable Output<List<String>> lifecycleConfigArns) {
            $.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }

        public Builder lifecycleConfigArns(List<String> lifecycleConfigArns) {
            return lifecycleConfigArns(Output.of(lifecycleConfigArns));
        }

        public Builder lifecycleConfigArns(String... lifecycleConfigArns) {
            return lifecycleConfigArns(List.of(lifecycleConfigArns));
        }

        public UserProfileUserSettingsJupyterServerAppSettingsArgs build() {
            $.defaultResourceSpec = Objects.requireNonNull($.defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
            return $;
        }
    }

}
