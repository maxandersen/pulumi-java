// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.asset.Archive;
import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.LayerVersionArgs;
import com.pulumi.aws.lambda.inputs.LayerVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Lambda Layers can be imported using `arn`.
 * 
 * ```sh
 *  $ pulumi import aws:lambda/layerVersion:LayerVersion \
 * ```
 * 
 *  aws_lambda_layer_version.test_layer \
 * 
 *  arn:aws:lambda:_REGION_:_ACCOUNT_ID_:layer:_LAYER_NAME_:_LAYER_VERSION_
 * 
 */
@ResourceType(type="aws:lambda/layerVersion:LayerVersion")
public class LayerVersion extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Lambda Layer with version.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the Lambda Layer with version.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Path to the function&#39;s deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
     * 
     */
    @Export(name="code", type=Archive.class, parameters={})
    private Output</* @Nullable */ Archive> code;

    /**
     * @return Path to the function&#39;s deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
     * 
     */
    public Output</* @Nullable */ Archive> code() {
        return this.code;
    }
    /**
     * List of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleArchitectures) this layer is compatible with. Currently `x86_64` and `arm64` can be specified.
     * 
     */
    @Export(name="compatibleArchitectures", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> compatibleArchitectures;

    /**
     * @return List of [Architectures](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleArchitectures) this layer is compatible with. Currently `x86_64` and `arm64` can be specified.
     * 
     */
    public Output</* @Nullable */ List<String>> compatibleArchitectures() {
        return this.compatibleArchitectures;
    }
    /**
     * List of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
     * 
     */
    @Export(name="compatibleRuntimes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> compatibleRuntimes;

    /**
     * @return List of [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-CompatibleRuntimes) this layer is compatible with. Up to 5 runtimes can be specified.
     * 
     */
    public Output</* @Nullable */ List<String>> compatibleRuntimes() {
        return this.compatibleRuntimes;
    }
    /**
     * Date this resource was created.
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return Date this resource was created.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Description of what your Lambda Layer does.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of what your Lambda Layer does.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * ARN of the Lambda Layer without version.
     * 
     */
    @Export(name="layerArn", type=String.class, parameters={})
    private Output<String> layerArn;

    /**
     * @return ARN of the Lambda Layer without version.
     * 
     */
    public Output<String> layerArn() {
        return this.layerArn;
    }
    /**
     * Unique name for your Lambda Layer
     * 
     */
    @Export(name="layerName", type=String.class, parameters={})
    private Output<String> layerName;

    /**
     * @return Unique name for your Lambda Layer
     * 
     */
    public Output<String> layerName() {
        return this.layerName;
    }
    /**
     * License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
     * 
     */
    @Export(name="licenseInfo", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseInfo;

    /**
     * @return License info for your Lambda Layer. See [License Info](https://docs.aws.amazon.com/lambda/latest/dg/API_PublishLayerVersion.html#SSS-PublishLayerVersion-request-LicenseInfo).
     * 
     */
    public Output</* @Nullable */ String> licenseInfo() {
        return this.licenseInfo;
    }
    /**
     * S3 bucket location containing the function&#39;s deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
     * 
     */
    @Export(name="s3Bucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> s3Bucket;

    /**
     * @return S3 bucket location containing the function&#39;s deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
     * 
     */
    public Output</* @Nullable */ String> s3Bucket() {
        return this.s3Bucket;
    }
    /**
     * S3 key of an object containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    @Export(name="s3Key", type=String.class, parameters={})
    private Output</* @Nullable */ String> s3Key;

    /**
     * @return S3 key of an object containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    public Output</* @Nullable */ String> s3Key() {
        return this.s3Key;
    }
    /**
     * Object version containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    @Export(name="s3ObjectVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> s3ObjectVersion;

    /**
     * @return Object version containing the function&#39;s deployment package. Conflicts with `filename`.
     * 
     */
    public Output</* @Nullable */ String> s3ObjectVersion() {
        return this.s3ObjectVersion;
    }
    /**
     * ARN of a signing job.
     * 
     */
    @Export(name="signingJobArn", type=String.class, parameters={})
    private Output<String> signingJobArn;

    /**
     * @return ARN of a signing job.
     * 
     */
    public Output<String> signingJobArn() {
        return this.signingJobArn;
    }
    /**
     * ARN for a signing profile version.
     * 
     */
    @Export(name="signingProfileVersionArn", type=String.class, parameters={})
    private Output<String> signingProfileVersionArn;

    /**
     * @return ARN for a signing profile version.
     * 
     */
    public Output<String> signingProfileVersionArn() {
        return this.signingProfileVersionArn;
    }
    /**
     * Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    @Export(name="skipDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipDestroy;

    /**
     * @return Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    public Output</* @Nullable */ Boolean> skipDestroy() {
        return this.skipDestroy;
    }
    @Export(name="sourceCodeHash", type=String.class, parameters={})
    private Output<String> sourceCodeHash;

    public Output<String> sourceCodeHash() {
        return this.sourceCodeHash;
    }
    /**
     * Size in bytes of the function .zip file.
     * 
     */
    @Export(name="sourceCodeSize", type=Integer.class, parameters={})
    private Output<Integer> sourceCodeSize;

    /**
     * @return Size in bytes of the function .zip file.
     * 
     */
    public Output<Integer> sourceCodeSize() {
        return this.sourceCodeSize;
    }
    /**
     * Lambda Layer version.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Lambda Layer version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LayerVersion(String name) {
        this(name, LayerVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LayerVersion(String name, LayerVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LayerVersion(String name, LayerVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/layerVersion:LayerVersion", name, args == null ? LayerVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LayerVersion(String name, Output<String> id, @Nullable LayerVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/layerVersion:LayerVersion", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LayerVersion get(String name, Output<String> id, @Nullable LayerVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LayerVersion(name, id, state, options);
    }
}
