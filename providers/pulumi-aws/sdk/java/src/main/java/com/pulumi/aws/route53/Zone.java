// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ZoneArgs;
import com.pulumi.aws.route53.inputs.ZoneState;
import com.pulumi.aws.route53.outputs.ZoneVpc;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Route53 Hosted Zone. For managing Domain Name System Security Extensions (DNSSEC), see the `aws.route53.KeySigningKey` and `aws.route53.HostedZoneDnsSec` resources.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Zones can be imported using the `zone id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/zone:Zone myzone Z1D633PJN98FT9
 * ```
 * 
 */
@ResourceType(type="aws:route53/zone:Zone")
public class Zone extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Hosted Zone.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Hosted Zone.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output<String> comment;

    /**
     * @return A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
     * 
     */
    public Output<String> comment() {
        return this.comment;
    }
    /**
     * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     * 
     */
    @Export(name="delegationSetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> delegationSetId;

    /**
     * @return The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     * 
     */
    public Output</* @Nullable */ String> delegationSetId() {
        return this.delegationSetId;
    }
    /**
     * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     * 
     */
    public Output</* @Nullable */ Boolean> forceDestroy() {
        return this.forceDestroy;
    }
    /**
     * This is the name of the hosted zone.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return This is the name of the hosted zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of name servers in associated (or default) delegation set.
     * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
     * 
     */
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    /**
     * @return A list of name servers in associated (or default) delegation set.
     * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
     * 
     */
    public Output<List<String>> nameServers() {
        return this.nameServers;
    }
    /**
     * A mapping of tags to assign to the zone.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the zone.
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
     * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegation_set_id` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * 
     */
    @Export(name="vpcs", type=List.class, parameters={ZoneVpc.class})
    private Output</* @Nullable */ List<ZoneVpc>> vpcs;

    /**
     * @return Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegation_set_id` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<ZoneVpc>> vpcs() {
        return this.vpcs;
    }
    /**
     * The Hosted Zone ID. This can be referenced by zone records.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return The Hosted Zone ID. This can be referenced by zone records.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Zone(String name) {
        this(name, ZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Zone(String name, @Nullable ZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Zone(String name, @Nullable ZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zone:Zone", name, args == null ? ZoneArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Zone(String name, Output<String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zone:Zone", name, state, makeResourceOptions(options, id));
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
    public static Zone get(String name, Output<String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Zone(name, id, state, options);
    }
}
