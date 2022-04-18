// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.waf.RateBasedRuleArgs;
import com.pulumi.aws.waf.inputs.RateBasedRuleState;
import com.pulumi.aws.waf.outputs.RateBasedRulePredicate;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a WAF Rate Based Rule Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF Rated Based Rule can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/rateBasedRule:RateBasedRule wafrule a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/rateBasedRule:RateBasedRule")
public class RateBasedRule extends com.pulumi.resources.CustomResource {
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
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Export(name="metricName", type=String.class, parameters={})
    private Output<String> metricName;

    /**
     * @return The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }
    /**
     * The name or description of the rule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @Export(name="predicates", type=List.class, parameters={RateBasedRulePredicate.class})
    private Output</* @Nullable */ List<RateBasedRulePredicate>> predicates;

    /**
     * @return The objects to include in a rule (documented below).
     * 
     */
    public Output</* @Nullable */ List<RateBasedRulePredicate>> predicates() {
        return this.predicates;
    }
    /**
     * Valid value is IP.
     * 
     */
    @Export(name="rateKey", type=String.class, parameters={})
    private Output<String> rateKey;

    /**
     * @return Valid value is IP.
     * 
     */
    public Output<String> rateKey() {
        return this.rateKey;
    }
    /**
     * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
     * 
     */
    @Export(name="rateLimit", type=Integer.class, parameters={})
    private Output<Integer> rateLimit;

    /**
     * @return The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. Minimum value is 100.
     * 
     */
    public Output<Integer> rateLimit() {
        return this.rateLimit;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RateBasedRule(String name) {
        this(name, RateBasedRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RateBasedRule(String name, RateBasedRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RateBasedRule(String name, RateBasedRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/rateBasedRule:RateBasedRule", name, args == null ? RateBasedRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RateBasedRule(String name, Output<String> id, @Nullable RateBasedRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/rateBasedRule:RateBasedRule", name, state, makeResourceOptions(options, id));
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
    public static RateBasedRule get(String name, Output<String> id, @Nullable RateBasedRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RateBasedRule(name, id, state, options);
    }
}
