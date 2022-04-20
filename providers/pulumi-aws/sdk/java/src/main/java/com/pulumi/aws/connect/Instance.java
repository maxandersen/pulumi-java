// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.InstanceArgs;
import com.pulumi.aws.connect.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect instance resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * !&gt; **WARN:** There are limits to the number of Connect Instances that can be created in a specific AWS account, and those limits span the life of the account, not just active Instances. Minimize the number of times you create/delete an instance.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Connect instances can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/instance:Instance example f1288a1f-6193-445a-b47e-af739b2
 * ```
 * 
 */
@ResourceType(type="aws:connect/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the instance.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the instance.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    @Export(name="autoResolveBestVoicesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoResolveBestVoicesEnabled;

    /**
     * @return Specifies whether auto resolve best voices is enabled. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> autoResolveBestVoicesEnabled() {
        return this.autoResolveBestVoicesEnabled;
    }
    /**
     * Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    @Export(name="contactFlowLogsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> contactFlowLogsEnabled;

    /**
     * @return Specifies whether contact flow logs are enabled. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> contactFlowLogsEnabled() {
        return this.contactFlowLogsEnabled;
    }
    /**
     * Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    @Export(name="contactLensEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> contactLensEnabled;

    /**
     * @return Specifies whether contact lens is enabled. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> contactLensEnabled() {
        return this.contactLensEnabled;
    }
    /**
     * Specifies when the instance was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Specifies when the instance was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    @Export(name="directoryId", type=String.class, parameters={})
    private Output</* @Nullable */ String> directoryId;

    /**
     * @return The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
     * 
     */
    public Output</* @Nullable */ String> directoryId() {
        return this.directoryId;
    }
    /**
     * Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    @Export(name="earlyMediaEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> earlyMediaEnabled;

    /**
     * @return Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> earlyMediaEnabled() {
        return this.earlyMediaEnabled;
    }
    /**
     * Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    @Export(name="identityManagementType", type=String.class, parameters={})
    private Output<String> identityManagementType;

    /**
     * @return Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
     * 
     */
    public Output<String> identityManagementType() {
        return this.identityManagementType;
    }
    /**
     * Specifies whether inbound calls are enabled.
     * 
     */
    @Export(name="inboundCallsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> inboundCallsEnabled;

    /**
     * @return Specifies whether inbound calls are enabled.
     * 
     */
    public Output<Boolean> inboundCallsEnabled() {
        return this.inboundCallsEnabled;
    }
    /**
     * Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    @Export(name="instanceAlias", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceAlias;

    /**
     * @return Specifies the name of the instance. Required if `directory_id` not specified.
     * 
     */
    public Output</* @Nullable */ String> instanceAlias() {
        return this.instanceAlias;
    }
    /**
     * Specifies whether outbound calls are enabled.
     * &lt;!-- * `use_custom_tts_voices` - (Optional) Specifies Whether use custom tts voices is enabled. Defaults to `false` --&gt;
     * 
     */
    @Export(name="outboundCallsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> outboundCallsEnabled;

    /**
     * @return Specifies whether outbound calls are enabled.
     * &lt;!-- * `use_custom_tts_voices` - (Optional) Specifies Whether use custom tts voices is enabled. Defaults to `false` --&gt;
     * 
     */
    public Output<Boolean> outboundCallsEnabled() {
        return this.outboundCallsEnabled;
    }
    /**
     * The service role of the instance.
     * 
     */
    @Export(name="serviceRole", type=String.class, parameters={})
    private Output<String> serviceRole;

    /**
     * @return The service role of the instance.
     * 
     */
    public Output<String> serviceRole() {
        return this.serviceRole;
    }
    /**
     * The state of the instance.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The state of the instance.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
