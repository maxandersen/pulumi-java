// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.inputs;

import com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudFormationTypeState extends com.pulumi.resources.ResourceArgs {

    public static final CloudFormationTypeState Empty = new CloudFormationTypeState();

    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type version. See also `type_arn`.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Identifier of the CloudFormation Type default version.
     * 
     */
    @Import(name="defaultVersionId")
    private @Nullable Output<String> defaultVersionId;

    public Optional<Output<String>> defaultVersionId() {
        return Optional.ofNullable(this.defaultVersionId);
    }

    /**
     * Deprecation status of the version.
     * 
     */
    @Import(name="deprecatedStatus")
    private @Nullable Output<String> deprecatedStatus;

    public Optional<Output<String>> deprecatedStatus() {
        return Optional.ofNullable(this.deprecatedStatus);
    }

    /**
     * Description of the version.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * URL of the documentation for the CloudFormation Type.
     * 
     */
    @Import(name="documentationUrl")
    private @Nullable Output<String> documentationUrl;

    public Optional<Output<String>> documentationUrl() {
        return Optional.ofNullable(this.documentationUrl);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role for CloudFormation to assume when invoking the extension. If your extension calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. When CloudFormation needs to invoke the extension handler, CloudFormation assumes this execution role to create a temporary session token, which it then passes to the extension handler, thereby supplying your extension with the appropriate credentials.
     * 
     */
    @Import(name="executionRoleArn")
    private @Nullable Output<String> executionRoleArn;

    public Optional<Output<String>> executionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }

    /**
     * Whether the CloudFormation Type version is the default version.
     * 
     */
    @Import(name="isDefaultVersion")
    private @Nullable Output<Boolean> isDefaultVersion;

    public Optional<Output<Boolean>> isDefaultVersion() {
        return Optional.ofNullable(this.isDefaultVersion);
    }

    /**
     * Configuration block containing logging configuration.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<CloudFormationTypeLoggingConfigGetArgs> loggingConfig;

    public Optional<Output<CloudFormationTypeLoggingConfigGetArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * Provisioning behavior of the CloudFormation Type.
     * 
     */
    @Import(name="provisioningType")
    private @Nullable Output<String> provisioningType;

    public Optional<Output<String>> provisioningType() {
        return Optional.ofNullable(this.provisioningType);
    }

    /**
     * JSON document of the CloudFormation Type schema.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * URL to the S3 bucket containing the extension project package that contains the necessary files for the extension you want to register. Must begin with `s3://` or `https://`. For example, `s3://example-bucket/example-object`.
     * 
     */
    @Import(name="schemaHandlerPackage")
    private @Nullable Output<String> schemaHandlerPackage;

    public Optional<Output<String>> schemaHandlerPackage() {
        return Optional.ofNullable(this.schemaHandlerPackage);
    }

    /**
     * URL of the source code for the CloudFormation Type.
     * 
     */
    @Import(name="sourceUrl")
    private @Nullable Output<String> sourceUrl;

    public Optional<Output<String>> sourceUrl() {
        return Optional.ofNullable(this.sourceUrl);
    }

    /**
     * CloudFormation Registry Type. For example, `RESOURCE` or `MODULE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * (Optional) Amazon Resource Name (ARN) of the CloudFormation Type. See also `arn`.
     * 
     */
    @Import(name="typeArn")
    private @Nullable Output<String> typeArn;

    public Optional<Output<String>> typeArn() {
        return Optional.ofNullable(this.typeArn);
    }

    /**
     * CloudFormation Type name. For example, `ExampleCompany::ExampleService::ExampleResource`.
     * 
     */
    @Import(name="typeName")
    private @Nullable Output<String> typeName;

    public Optional<Output<String>> typeName() {
        return Optional.ofNullable(this.typeName);
    }

    /**
     * (Optional) Identifier of the CloudFormation Type version.
     * 
     */
    @Import(name="versionId")
    private @Nullable Output<String> versionId;

    public Optional<Output<String>> versionId() {
        return Optional.ofNullable(this.versionId);
    }

    /**
     * Scope of the CloudFormation Type.
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<String> visibility;

    public Optional<Output<String>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private CloudFormationTypeState() {}

    private CloudFormationTypeState(CloudFormationTypeState $) {
        this.arn = $.arn;
        this.defaultVersionId = $.defaultVersionId;
        this.deprecatedStatus = $.deprecatedStatus;
        this.description = $.description;
        this.documentationUrl = $.documentationUrl;
        this.executionRoleArn = $.executionRoleArn;
        this.isDefaultVersion = $.isDefaultVersion;
        this.loggingConfig = $.loggingConfig;
        this.provisioningType = $.provisioningType;
        this.schema = $.schema;
        this.schemaHandlerPackage = $.schemaHandlerPackage;
        this.sourceUrl = $.sourceUrl;
        this.type = $.type;
        this.typeArn = $.typeArn;
        this.typeName = $.typeName;
        this.versionId = $.versionId;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudFormationTypeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudFormationTypeState $;

        public Builder() {
            $ = new CloudFormationTypeState();
        }

        public Builder(CloudFormationTypeState defaults) {
            $ = new CloudFormationTypeState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder defaultVersionId(@Nullable Output<String> defaultVersionId) {
            $.defaultVersionId = defaultVersionId;
            return this;
        }

        public Builder defaultVersionId(String defaultVersionId) {
            return defaultVersionId(Output.of(defaultVersionId));
        }

        public Builder deprecatedStatus(@Nullable Output<String> deprecatedStatus) {
            $.deprecatedStatus = deprecatedStatus;
            return this;
        }

        public Builder deprecatedStatus(String deprecatedStatus) {
            return deprecatedStatus(Output.of(deprecatedStatus));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder documentationUrl(@Nullable Output<String> documentationUrl) {
            $.documentationUrl = documentationUrl;
            return this;
        }

        public Builder documentationUrl(String documentationUrl) {
            return documentationUrl(Output.of(documentationUrl));
        }

        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        public Builder isDefaultVersion(@Nullable Output<Boolean> isDefaultVersion) {
            $.isDefaultVersion = isDefaultVersion;
            return this;
        }

        public Builder isDefaultVersion(Boolean isDefaultVersion) {
            return isDefaultVersion(Output.of(isDefaultVersion));
        }

        public Builder loggingConfig(@Nullable Output<CloudFormationTypeLoggingConfigGetArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(CloudFormationTypeLoggingConfigGetArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        public Builder provisioningType(@Nullable Output<String> provisioningType) {
            $.provisioningType = provisioningType;
            return this;
        }

        public Builder provisioningType(String provisioningType) {
            return provisioningType(Output.of(provisioningType));
        }

        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public Builder schemaHandlerPackage(@Nullable Output<String> schemaHandlerPackage) {
            $.schemaHandlerPackage = schemaHandlerPackage;
            return this;
        }

        public Builder schemaHandlerPackage(String schemaHandlerPackage) {
            return schemaHandlerPackage(Output.of(schemaHandlerPackage));
        }

        public Builder sourceUrl(@Nullable Output<String> sourceUrl) {
            $.sourceUrl = sourceUrl;
            return this;
        }

        public Builder sourceUrl(String sourceUrl) {
            return sourceUrl(Output.of(sourceUrl));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder typeArn(@Nullable Output<String> typeArn) {
            $.typeArn = typeArn;
            return this;
        }

        public Builder typeArn(String typeArn) {
            return typeArn(Output.of(typeArn));
        }

        public Builder typeName(@Nullable Output<String> typeName) {
            $.typeName = typeName;
            return this;
        }

        public Builder typeName(String typeName) {
            return typeName(Output.of(typeName));
        }

        public Builder versionId(@Nullable Output<String> versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder versionId(String versionId) {
            return versionId(Output.of(versionId));
        }

        public Builder visibility(@Nullable Output<String> visibility) {
            $.visibility = visibility;
            return this;
        }

        public Builder visibility(String visibility) {
            return visibility(Output.of(visibility));
        }

        public CloudFormationTypeState build() {
            return $;
        }
    }

}
