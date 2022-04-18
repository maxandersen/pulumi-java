// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.StageArgs;
import com.pulumi.aws.apigateway.inputs.StageState;
import com.pulumi.aws.apigateway.outputs.StageAccessLogSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an API Gateway Stage. A stage is a named reference to a deployment, which can be done via the `aws.apigateway.Deployment` resource. Stages can be optionally managed further with the `aws.apigateway.BasePathMapping` resource, `aws.apigateway.DomainName` resource, and `aws_api_method_settings` resource. For more information, see the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-stages.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_api_gateway_stage` can be imported using `REST-API-ID/STAGE-NAME`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/stage:Stage example 12345abcde/example
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/stage:Stage")
public class Stage extends com.pulumi.resources.CustomResource {
    /**
     * Enables access logs for the API stage. Detailed below.
     * 
     */
    @Export(name="accessLogSettings", type=StageAccessLogSettings.class, parameters={})
    private Output</* @Nullable */ StageAccessLogSettings> accessLogSettings;

    /**
     * @return Enables access logs for the API stage. Detailed below.
     * 
     */
    public Output</* @Nullable */ StageAccessLogSettings> accessLogSettings() {
        return this.accessLogSettings;
    }
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies whether a cache cluster is enabled for the stage
     * 
     */
    @Export(name="cacheClusterEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cacheClusterEnabled;

    /**
     * @return Specifies whether a cache cluster is enabled for the stage
     * 
     */
    public Output</* @Nullable */ Boolean> cacheClusterEnabled() {
        return this.cacheClusterEnabled;
    }
    /**
     * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
     * 
     */
    @Export(name="cacheClusterSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> cacheClusterSize;

    /**
     * @return The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
     * 
     */
    public Output</* @Nullable */ String> cacheClusterSize() {
        return this.cacheClusterSize;
    }
    /**
     * The identifier of a client certificate for the stage.
     * 
     */
    @Export(name="clientCertificateId", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientCertificateId;

    /**
     * @return The identifier of a client certificate for the stage.
     * 
     */
    public Output</* @Nullable */ String> clientCertificateId() {
        return this.clientCertificateId;
    }
    /**
     * The ID of the deployment that the stage points to
     * 
     */
    @Export(name="deployment", type=String.class, parameters={})
    private Output<String> deployment;

    /**
     * @return The ID of the deployment that the stage points to
     * 
     */
    public Output<String> deployment() {
        return this.deployment;
    }
    /**
     * The description of the stage
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the stage
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The version of the associated API documentation
     * 
     */
    @Export(name="documentationVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentationVersion;

    /**
     * @return The version of the associated API documentation
     * 
     */
    public Output</* @Nullable */ String> documentationVersion() {
        return this.documentationVersion;
    }
    /**
     * The execution ARN to be used in `lambda_permission`'s `source_arn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     * 
     */
    @Export(name="executionArn", type=String.class, parameters={})
    private Output<String> executionArn;

    /**
     * @return The execution ARN to be used in `lambda_permission`'s `source_arn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     * 
     */
    public Output<String> executionArn() {
        return this.executionArn;
    }
    /**
     * The URL to invoke the API pointing to the stage,
     * e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     * 
     */
    @Export(name="invokeUrl", type=String.class, parameters={})
    private Output<String> invokeUrl;

    /**
     * @return The URL to invoke the API pointing to the stage,
     * e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     * 
     */
    public Output<String> invokeUrl() {
        return this.invokeUrl;
    }
    /**
     * The ID of the associated REST API
     * 
     */
    @Export(name="restApi", type=String.class, parameters={})
    private Output<String> restApi;

    /**
     * @return The ID of the associated REST API
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }
    /**
     * The name of the stage
     * 
     */
    @Export(name="stageName", type=String.class, parameters={})
    private Output<String> stageName;

    /**
     * @return The name of the stage
     * 
     */
    public Output<String> stageName() {
        return this.stageName;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * A map that defines the stage variables
     * 
     */
    @Export(name="variables", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> variables;

    /**
     * @return A map that defines the stage variables
     * 
     */
    public Output</* @Nullable */ Map<String,String>> variables() {
        return this.variables;
    }
    /**
     * The ARN of the WebAcl associated with the Stage.
     * 
     */
    @Export(name="webAclArn", type=String.class, parameters={})
    private Output<String> webAclArn;

    /**
     * @return The ARN of the WebAcl associated with the Stage.
     * 
     */
    public Output<String> webAclArn() {
        return this.webAclArn;
    }
    /**
     * Whether active tracing with X-ray is enabled. Defaults to `false`.
     * 
     */
    @Export(name="xrayTracingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> xrayTracingEnabled;

    /**
     * @return Whether active tracing with X-ray is enabled. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> xrayTracingEnabled() {
        return this.xrayTracingEnabled;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Stage(String name) {
        this(name, StageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Stage(String name, StageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Stage(String name, StageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/stage:Stage", name, args == null ? StageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Stage(String name, Output<String> id, @Nullable StageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/stage:Stage", name, state, makeResourceOptions(options, id));
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
    public static Stage get(String name, Output<String> id, @Nullable StageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Stage(name, id, state, options);
    }
}
