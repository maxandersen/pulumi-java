// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.macie;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.macie.FindingsFilterArgs;
import com.pulumi.awsnative.macie.enums.FindingsFilterFindingFilterAction;
import com.pulumi.awsnative.macie.outputs.FindingsFilterFindingCriteria;
import com.pulumi.awsnative.macie.outputs.FindingsFilterListItem;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Macie FindingsFilter resource schema.
 * 
 */
@ResourceType(type="aws-native:macie:FindingsFilter")
public class FindingsFilter extends com.pulumi.resources.CustomResource {
    /**
     * Findings filter action.
     * 
     */
    @Export(name="action", type=FindingsFilterFindingFilterAction.class, parameters={})
    private Output</* @Nullable */ FindingsFilterFindingFilterAction> action;

    /**
     * @return Findings filter action.
     * 
     */
    public Output</* @Nullable */ FindingsFilterFindingFilterAction> action() {
        return this.action;
    }
    /**
     * Findings filter ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Findings filter ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Findings filter description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Findings filter description
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Findings filter criteria.
     * 
     */
    @Export(name="findingCriteria", type=FindingsFilterFindingCriteria.class, parameters={})
    private Output<FindingsFilterFindingCriteria> findingCriteria;

    /**
     * @return Findings filter criteria.
     * 
     */
    public Output<FindingsFilterFindingCriteria> findingCriteria() {
        return this.findingCriteria;
    }
    /**
     * Findings filters list.
     * 
     */
    @Export(name="findingsFilterListItems", type=List.class, parameters={FindingsFilterListItem.class})
    private Output<List<FindingsFilterListItem>> findingsFilterListItems;

    /**
     * @return Findings filters list.
     * 
     */
    public Output<List<FindingsFilterListItem>> findingsFilterListItems() {
        return this.findingsFilterListItems;
    }
    /**
     * Findings filter name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Findings filter name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Findings filter position.
     * 
     */
    @Export(name="position", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> position;

    /**
     * @return Findings filter position.
     * 
     */
    public Output</* @Nullable */ Integer> position() {
        return this.position;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FindingsFilter(String name) {
        this(name, FindingsFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FindingsFilter(String name, FindingsFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FindingsFilter(String name, FindingsFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:macie:FindingsFilter", name, args == null ? FindingsFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FindingsFilter(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:macie:FindingsFilter", name, null, makeResourceOptions(options, id));
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
    public static FindingsFilter get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FindingsFilter(name, id, options);
    }
}
