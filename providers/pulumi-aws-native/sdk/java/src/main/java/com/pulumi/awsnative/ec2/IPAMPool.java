// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ec2.IPAMPoolArgs;
import com.pulumi.awsnative.ec2.enums.IPAMPoolIpamScopeType;
import com.pulumi.awsnative.ec2.enums.IPAMPoolState;
import com.pulumi.awsnative.ec2.outputs.IPAMPoolProvisionedCidr;
import com.pulumi.awsnative.ec2.outputs.IPAMPoolTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Schema of AWS::EC2::IPAMPool Type
 * 
 */
@ResourceType(type="aws-native:ec2:IPAMPool")
public class IPAMPool extends com.pulumi.resources.CustomResource {
    /**
     * The address family of the address space in this pool. Either IPv4 or IPv6.
     * 
     */
    @Export(name="addressFamily", type=String.class, parameters={})
    private Output<String> addressFamily;

    /**
     * @return The address family of the address space in this pool. Either IPv4 or IPv6.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }
    /**
     * The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
     * 
     */
    @Export(name="allocationDefaultNetmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> allocationDefaultNetmaskLength;

    /**
     * @return The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
     * 
     */
    public Output<Optional<Integer>> allocationDefaultNetmaskLength() {
        return Codegen.optional(this.allocationDefaultNetmaskLength);
    }
    /**
     * The maximum allowed netmask length for allocations made from this pool.
     * 
     */
    @Export(name="allocationMaxNetmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> allocationMaxNetmaskLength;

    /**
     * @return The maximum allowed netmask length for allocations made from this pool.
     * 
     */
    public Output<Optional<Integer>> allocationMaxNetmaskLength() {
        return Codegen.optional(this.allocationMaxNetmaskLength);
    }
    /**
     * The minimum allowed netmask length for allocations made from this pool.
     * 
     */
    @Export(name="allocationMinNetmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> allocationMinNetmaskLength;

    /**
     * @return The minimum allowed netmask length for allocations made from this pool.
     * 
     */
    public Output<Optional<Integer>> allocationMinNetmaskLength() {
        return Codegen.optional(this.allocationMinNetmaskLength);
    }
    /**
     * When specified, an allocation will not be allowed unless a resource has a matching set of tags.
     * 
     */
    @Export(name="allocationResourceTags", type=List.class, parameters={IPAMPoolTag.class})
    private Output</* @Nullable */ List<IPAMPoolTag>> allocationResourceTags;

    /**
     * @return When specified, an allocation will not be allowed unless a resource has a matching set of tags.
     * 
     */
    public Output<Optional<List<IPAMPoolTag>>> allocationResourceTags() {
        return Codegen.optional(this.allocationResourceTags);
    }
    /**
     * The Amazon Resource Name (ARN) of the IPAM Pool.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IPAM Pool.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
     * 
     */
    @Export(name="autoImport", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoImport;

    /**
     * @return Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
     * 
     */
    public Output<Optional<Boolean>> autoImport() {
        return Codegen.optional(this.autoImport);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Amazon Resource Name (ARN) of the IPAM this pool is a part of.
     * 
     */
    @Export(name="ipamArn", type=String.class, parameters={})
    private Output<String> ipamArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IPAM this pool is a part of.
     * 
     */
    public Output<String> ipamArn() {
        return this.ipamArn;
    }
    /**
     * Id of the IPAM Pool.
     * 
     */
    @Export(name="ipamPoolId", type=String.class, parameters={})
    private Output<String> ipamPoolId;

    /**
     * @return Id of the IPAM Pool.
     * 
     */
    public Output<String> ipamPoolId() {
        return this.ipamPoolId;
    }
    /**
     * The Amazon Resource Name (ARN) of the scope this pool is a part of.
     * 
     */
    @Export(name="ipamScopeArn", type=String.class, parameters={})
    private Output<String> ipamScopeArn;

    /**
     * @return The Amazon Resource Name (ARN) of the scope this pool is a part of.
     * 
     */
    public Output<String> ipamScopeArn() {
        return this.ipamScopeArn;
    }
    /**
     * The Id of the scope this pool is a part of.
     * 
     */
    @Export(name="ipamScopeId", type=String.class, parameters={})
    private Output<String> ipamScopeId;

    /**
     * @return The Id of the scope this pool is a part of.
     * 
     */
    public Output<String> ipamScopeId() {
        return this.ipamScopeId;
    }
    /**
     * Determines whether this scope contains publicly routable space or space for a private network
     * 
     */
    @Export(name="ipamScopeType", type=IPAMPoolIpamScopeType.class, parameters={})
    private Output<IPAMPoolIpamScopeType> ipamScopeType;

    /**
     * @return Determines whether this scope contains publicly routable space or space for a private network
     * 
     */
    public Output<IPAMPoolIpamScopeType> ipamScopeType() {
        return this.ipamScopeType;
    }
    /**
     * The region of this pool. If not set, this will default to &#34;None&#34; which will disable non-custom allocations. If the locale has been specified for the source pool, this value must match.
     * 
     */
    @Export(name="locale", type=String.class, parameters={})
    private Output</* @Nullable */ String> locale;

    /**
     * @return The region of this pool. If not set, this will default to &#34;None&#34; which will disable non-custom allocations. If the locale has been specified for the source pool, this value must match.
     * 
     */
    public Output<Optional<String>> locale() {
        return Codegen.optional(this.locale);
    }
    /**
     * The depth of this pool in the source pool hierarchy.
     * 
     */
    @Export(name="poolDepth", type=Integer.class, parameters={})
    private Output<Integer> poolDepth;

    /**
     * @return The depth of this pool in the source pool hierarchy.
     * 
     */
    public Output<Integer> poolDepth() {
        return this.poolDepth;
    }
    /**
     * A list of cidrs representing the address space available for allocation in this pool.
     * 
     */
    @Export(name="provisionedCidrs", type=List.class, parameters={IPAMPoolProvisionedCidr.class})
    private Output</* @Nullable */ List<IPAMPoolProvisionedCidr>> provisionedCidrs;

    /**
     * @return A list of cidrs representing the address space available for allocation in this pool.
     * 
     */
    public Output<Optional<List<IPAMPoolProvisionedCidr>>> provisionedCidrs() {
        return Codegen.optional(this.provisionedCidrs);
    }
    /**
     * Determines whether or not address space from this pool is publicly advertised. Must be set if and only if the pool is IPv6.
     * 
     */
    @Export(name="publiclyAdvertisable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publiclyAdvertisable;

    /**
     * @return Determines whether or not address space from this pool is publicly advertised. Must be set if and only if the pool is IPv6.
     * 
     */
    public Output<Optional<Boolean>> publiclyAdvertisable() {
        return Codegen.optional(this.publiclyAdvertisable);
    }
    /**
     * The Id of this pool&#39;s source. If set, all space provisioned in this pool must be free space provisioned in the parent pool.
     * 
     */
    @Export(name="sourceIpamPoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceIpamPoolId;

    /**
     * @return The Id of this pool&#39;s source. If set, all space provisioned in this pool must be free space provisioned in the parent pool.
     * 
     */
    public Output<Optional<String>> sourceIpamPoolId() {
        return Codegen.optional(this.sourceIpamPoolId);
    }
    /**
     * The state of this pool. This can be one of the following values: &#34;create-in-progress&#34;, &#34;create-complete&#34;, &#34;modify-in-progress&#34;, &#34;modify-complete&#34;, &#34;delete-in-progress&#34;, or &#34;delete-complete&#34;
     * 
     */
    @Export(name="state", type=IPAMPoolState.class, parameters={})
    private Output<IPAMPoolState> state;

    /**
     * @return The state of this pool. This can be one of the following values: &#34;create-in-progress&#34;, &#34;create-complete&#34;, &#34;modify-in-progress&#34;, &#34;modify-complete&#34;, &#34;delete-in-progress&#34;, or &#34;delete-complete&#34;
     * 
     */
    public Output<IPAMPoolState> state() {
        return this.state;
    }
    /**
     * An explanation of how the pool arrived at it current state.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return An explanation of how the pool arrived at it current state.
     * 
     */
    public Output<String> stateMessage() {
        return this.stateMessage;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={IPAMPoolTag.class})
    private Output</* @Nullable */ List<IPAMPoolTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<IPAMPoolTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IPAMPool(String name) {
        this(name, IPAMPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IPAMPool(String name, IPAMPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPAMPool(String name, IPAMPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAMPool", name, args == null ? IPAMPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IPAMPool(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:IPAMPool", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IPAMPool get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IPAMPool(name, id, options);
    }
}
