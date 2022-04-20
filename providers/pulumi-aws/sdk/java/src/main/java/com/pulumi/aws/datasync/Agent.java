// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datasync.AgentArgs;
import com.pulumi.aws.datasync.inputs.AgentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an AWS DataSync Agent deployed on premises.
 * 
 * &gt; **NOTE:** One of `activation_key` or `ip_address` must be provided for resource creation (agent activation). Neither is required for resource import. If using `ip_address`, this provider must be able to make an HTTP (port 80) GET request to the specified IP address from where it is running. The agent will turn off that HTTP server after activation.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_datasync_agent` can be imported by using the DataSync Agent Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:datasync/agent:Agent example arn:aws:datasync:us-east-1:123456789012:agent/agent-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/agent:Agent")
public class Agent extends com.pulumi.resources.CustomResource {
    /**
     * DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
     * 
     */
    @Export(name="activationKey", type=String.class, parameters={})
    private Output<String> activationKey;

    /**
     * @return DataSync Agent activation key during resource creation. Conflicts with `ip_address`. If an `ip_address` is provided instead, the provider will retrieve the `activation_key` as part of the resource creation.
     * 
     */
    public Output<String> activationKey() {
        return this.activationKey;
    }
    /**
     * Amazon Resource Name (ARN) of the DataSync Agent.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Agent.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return DataSync Agent IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. DataSync Agent must be accessible on port 80 from where the provider is running.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * Name of the DataSync Agent.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the DataSync Agent.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
     * 
     */
    @Export(name="privateLinkEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateLinkEndpoint;

    /**
     * @return The IP address of the VPC endpoint the agent should connect to when retrieving an activation key during resource creation. Conflicts with `activation_key`.
     * 
     */
    public Output</* @Nullable */ String> privateLinkEndpoint() {
        return this.privateLinkEndpoint;
    }
    /**
     * The ARNs of the security groups used to protect your data transfer task subnets.
     * 
     */
    @Export(name="securityGroupArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupArns;

    /**
     * @return The ARNs of the security groups used to protect your data transfer task subnets.
     * 
     */
    public Output</* @Nullable */ List<String>> securityGroupArns() {
        return this.securityGroupArns;
    }
    /**
     * The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    @Export(name="subnetArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> subnetArns;

    /**
     * @return The Amazon Resource Names (ARNs) of the subnets in which DataSync will create elastic network interfaces for each data transfer task.
     * 
     */
    public Output</* @Nullable */ List<String>> subnetArns() {
        return this.subnetArns;
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Agent. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
     * 
     */
    @Export(name="vpcEndpointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpcEndpointId;

    /**
     * @return The ID of the VPC (virtual private cloud) endpoint that the agent has access to.
     * 
     */
    public Output</* @Nullable */ String> vpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Agent(String name) {
        this(name, AgentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Agent(String name, @Nullable AgentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Agent(String name, @Nullable AgentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/agent:Agent", name, args == null ? AgentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Agent(String name, Output<String> id, @Nullable AgentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/agent:Agent", name, state, makeResourceOptions(options, id));
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
    public static Agent get(String name, Output<String> id, @Nullable AgentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Agent(name, id, state, options);
    }
}
