// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.operationalinsights.MachineGroupArgs;
import com.pulumi.azurenative.operationalinsights.outputs.MachineReferenceWithHintsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A user-defined logical grouping of machines.
 * API Version: 2015-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:MachineGroup ccfbf4bf-dc08-4371-9e9b-00a8d875d45a /subscriptions/63BE4E24-FDF0-4E9C-9342-6A5D5A359722/resourceGroups/rg-sm/providers/Microsoft.OperationalInsights/workspaces/D6F79F14-E563-469B-84B5-9286D2803B2F/machineGroups/ccfbf4bf-dc08-4371-9e9b-00a8d875d45a 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:MachineGroup")
public class MachineGroup extends com.pulumi.resources.CustomResource {
    /**
     * Count of machines in this group. The value of count may be bigger than the number of machines in case of the group has been truncated due to exceeding the max number of machines a group can handle.
     * 
     */
    @Export(name="count", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> count;

    /**
     * @return Count of machines in this group. The value of count may be bigger than the number of machines in case of the group has been truncated due to exceeding the max number of machines a group can handle.
     * 
     */
    public Output</* @Nullable */ Integer> count() {
        return this.count;
    }
    /**
     * User defined name for the group
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return User defined name for the group
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Resource ETAG.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Resource ETAG.
     * 
     */
    public Output</* @Nullable */ String> etag() {
        return this.etag;
    }
    /**
     * Type of the machine group
     * 
     */
    @Export(name="groupType", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupType;

    /**
     * @return Type of the machine group
     * 
     */
    public Output</* @Nullable */ String> groupType() {
        return this.groupType;
    }
    /**
     * Additional resource type qualifier.
     * Expected value is &#39;machineGroup&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Additional resource type qualifier.
     * Expected value is &#39;machineGroup&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * References of the machines in this group. The hints within each reference do not represent the current value of the corresponding fields. They are a snapshot created during the last time the machine group was updated.
     * 
     */
    @Export(name="machines", type=List.class, parameters={MachineReferenceWithHintsResponse.class})
    private Output</* @Nullable */ List<MachineReferenceWithHintsResponse>> machines;

    /**
     * @return References of the machines in this group. The hints within each reference do not represent the current value of the corresponding fields. They are a snapshot created during the last time the machine group was updated.
     * 
     */
    public Output</* @Nullable */ List<MachineReferenceWithHintsResponse>> machines() {
        return this.machines;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineGroup(String name) {
        this(name, MachineGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineGroup(String name, MachineGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineGroup(String name, MachineGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:MachineGroup", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private MachineGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:MachineGroup", name, null, makeResourceOptions(options, id));
    }

    private static MachineGroupArgs makeArgs(MachineGroupArgs args) {
        var builder = args == null ? MachineGroupArgs.builder() : MachineGroupArgs.builder(args);
        return builder
            .kind("machineGroup")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:operationalinsights/v20151101preview:MachineGroup").build())
            ))
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
    public static MachineGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MachineGroup(name, id, options);
    }
}
