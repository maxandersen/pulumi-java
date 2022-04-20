// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.FilterArgs;
import com.pulumi.aws.guardduty.inputs.FilterState;
import com.pulumi.aws.guardduty.outputs.FilterFindingCriteria;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty filter.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GuardDuty filters can be imported using the detector ID and filter&#39;s name separated by a colon, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/filter:Filter MyFilter 00b00fd5aecc0ab60a708659477e9617:MyFilter
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/filter:Filter")
public class Filter extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The ARN of the GuardDuty filter.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the GuardDuty filter.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the filter.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the filter.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * ID of a GuardDuty detector, attached to your account.
     * 
     */
    @Export(name="detectorId", type=String.class, parameters={})
    private Output<String> detectorId;

    /**
     * @return ID of a GuardDuty detector, attached to your account.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }
    /**
     * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * 
     */
    @Export(name="findingCriteria", type=FilterFindingCriteria.class, parameters={})
    private Output<FilterFindingCriteria> findingCriteria;

    /**
     * @return Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
     * 
     */
    public Output<FilterFindingCriteria> findingCriteria() {
        return this.findingCriteria;
    }
    /**
     * The name of your filter.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of your filter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
     * 
     */
    @Export(name="rank", type=Integer.class, parameters={})
    private Output<Integer> rank;

    /**
     * @return Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
     * 
     */
    public Output<Integer> rank() {
        return this.rank;
    }
    /**
     * The tags that you want to add to the Filter resource. A tag consists of a key and a value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags that you want to add to the Filter resource. A tag consists of a key and a value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public Filter(String name) {
        this(name, FilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Filter(String name, FilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Filter(String name, FilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/filter:Filter", name, args == null ? FilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Filter(String name, Output<String> id, @Nullable FilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/filter:Filter", name, state, makeResourceOptions(options, id));
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
    public static Filter get(String name, Output<String> id, @Nullable FilterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Filter(name, id, state, options);
    }
}
