// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation;

import com.pulumi.awsnative.cloudformation.inputs.HookVersionLoggingConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HookVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HookVersionArgs Empty = new HookVersionArgs();

    /**
     * The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * 
     */
    @Import(name="executionRoleArn")
    private @Nullable Output<String> executionRoleArn;

    public Optional<Output<String>> executionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }

    /**
     * Specifies logging configuration information for a type.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<HookVersionLoggingConfigArgs> loggingConfig;

    public Optional<Output<HookVersionLoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * A url to the S3 bucket containing the schema handler package that contains the schema, event handlers, and associated files for the type you want to register.
     * 
     * For information on generating a schema handler package for the type you want to register, see submit in the CloudFormation CLI User Guide.
     * 
     */
    @Import(name="schemaHandlerPackage", required=true)
    private Output<String> schemaHandlerPackage;

    public Output<String> schemaHandlerPackage() {
        return this.schemaHandlerPackage;
    }

    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @Import(name="typeName", required=true)
    private Output<String> typeName;

    public Output<String> typeName() {
        return this.typeName;
    }

    private HookVersionArgs() {}

    private HookVersionArgs(HookVersionArgs $) {
        this.executionRoleArn = $.executionRoleArn;
        this.loggingConfig = $.loggingConfig;
        this.schemaHandlerPackage = $.schemaHandlerPackage;
        this.typeName = $.typeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HookVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HookVersionArgs $;

        public Builder() {
            $ = new HookVersionArgs();
        }

        public Builder(HookVersionArgs defaults) {
            $ = new HookVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        public Builder loggingConfig(@Nullable Output<HookVersionLoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(HookVersionLoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        public Builder schemaHandlerPackage(Output<String> schemaHandlerPackage) {
            $.schemaHandlerPackage = schemaHandlerPackage;
            return this;
        }

        public Builder schemaHandlerPackage(String schemaHandlerPackage) {
            return schemaHandlerPackage(Output.of(schemaHandlerPackage));
        }

        public Builder typeName(Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        public HookVersionArgs build() {
            $.schemaHandlerPackage = Objects.requireNonNull($.schemaHandlerPackage, "expected parameter 'schemaHandlerPackage' to be non-null");
            $.typeName = Objects.requireNonNull($.typeName, "expected parameter 'typeName' to be non-null");
            return $;
        }
    }

}
