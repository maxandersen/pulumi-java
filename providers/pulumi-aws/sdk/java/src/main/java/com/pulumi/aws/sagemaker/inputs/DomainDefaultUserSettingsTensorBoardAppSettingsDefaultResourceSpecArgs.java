// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs Empty = new DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs();

    /**
     * The instance type that the image version runs on.. For valid values see [Sagemaker Instance Types](https://docs.aws.amazon.com/sagemaker/latest/dg/notebooks-available-instance-types.html).
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
     * 
     */
    @Import(name="lifecycleConfigArn")
    private @Nullable Output<String> lifecycleConfigArn;

    public Optional<Output<String>> lifecycleConfigArn() {
        return Optional.ofNullable(this.lifecycleConfigArn);
    }

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     * 
     */
    @Import(name="sagemakerImageArn")
    private @Nullable Output<String> sagemakerImageArn;

    public Optional<Output<String>> sagemakerImageArn() {
        return Optional.ofNullable(this.sagemakerImageArn);
    }

    /**
     * The ARN of the image version created on the instance.
     * 
     */
    @Import(name="sagemakerImageVersionArn")
    private @Nullable Output<String> sagemakerImageVersionArn;

    public Optional<Output<String>> sagemakerImageVersionArn() {
        return Optional.ofNullable(this.sagemakerImageVersionArn);
    }

    private DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs() {}

    private DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs(DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs $) {
        this.instanceType = $.instanceType;
        this.lifecycleConfigArn = $.lifecycleConfigArn;
        this.sagemakerImageArn = $.sagemakerImageArn;
        this.sagemakerImageVersionArn = $.sagemakerImageVersionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs $;

        public Builder() {
            $ = new DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs();
        }

        public Builder(DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs defaults) {
            $ = new DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder lifecycleConfigArn(@Nullable Output<String> lifecycleConfigArn) {
            $.lifecycleConfigArn = lifecycleConfigArn;
            return this;
        }

        public Builder lifecycleConfigArn(String lifecycleConfigArn) {
            return lifecycleConfigArn(Output.of(lifecycleConfigArn));
        }

        public Builder sagemakerImageArn(@Nullable Output<String> sagemakerImageArn) {
            $.sagemakerImageArn = sagemakerImageArn;
            return this;
        }

        public Builder sagemakerImageArn(String sagemakerImageArn) {
            return sagemakerImageArn(Output.of(sagemakerImageArn));
        }

        public Builder sagemakerImageVersionArn(@Nullable Output<String> sagemakerImageVersionArn) {
            $.sagemakerImageVersionArn = sagemakerImageVersionArn;
            return this;
        }

        public Builder sagemakerImageVersionArn(String sagemakerImageVersionArn) {
            return sagemakerImageVersionArn(Output.of(sagemakerImageVersionArn));
        }

        public DomainDefaultUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs build() {
            return $;
        }
    }

}
