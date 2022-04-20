// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.synapse.SqlPoolWorkloadClassifierArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Workload classifier operations for a data warehouse
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:synapse:SqlPoolWorkloadClassifier wlm_workloadclassifier /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-6852/providers/Microsoft.Synapse/workspaces/sqlcrudtest-2080/sqlPools/sqlcrudtest-9187/workloadGroups/wlm_workloadgroup/workloadClassifiers/wlm_workloadclassifier 
 * ```
 * 
 */
@ResourceType(type="azure-native:synapse:SqlPoolWorkloadClassifier")
public class SqlPoolWorkloadClassifier extends com.pulumi.resources.CustomResource {
    /**
     * The workload classifier context.
     * 
     */
    @Export(name="context", type=String.class, parameters={})
    private Output</* @Nullable */ String> context;

    /**
     * @return The workload classifier context.
     * 
     */
    public Output</* @Nullable */ String> context() {
        return this.context;
    }
    /**
     * The workload classifier end time for classification.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> endTime;

    /**
     * @return The workload classifier end time for classification.
     * 
     */
    public Output</* @Nullable */ String> endTime() {
        return this.endTime;
    }
    /**
     * The workload classifier importance.
     * 
     */
    @Export(name="importance", type=String.class, parameters={})
    private Output</* @Nullable */ String> importance;

    /**
     * @return The workload classifier importance.
     * 
     */
    public Output</* @Nullable */ String> importance() {
        return this.importance;
    }
    /**
     * The workload classifier label.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output</* @Nullable */ String> label;

    /**
     * @return The workload classifier label.
     * 
     */
    public Output</* @Nullable */ String> label() {
        return this.label;
    }
    /**
     * The workload classifier member name.
     * 
     */
    @Export(name="memberName", type=String.class, parameters={})
    private Output<String> memberName;

    /**
     * @return The workload classifier member name.
     * 
     */
    public Output<String> memberName() {
        return this.memberName;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The workload classifier start time for classification.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> startTime;

    /**
     * @return The workload classifier start time for classification.
     * 
     */
    public Output</* @Nullable */ String> startTime() {
        return this.startTime;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlPoolWorkloadClassifier(String name) {
        this(name, SqlPoolWorkloadClassifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlPoolWorkloadClassifier(String name, SqlPoolWorkloadClassifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlPoolWorkloadClassifier(String name, SqlPoolWorkloadClassifierArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadClassifier", name, args == null ? SqlPoolWorkloadClassifierArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlPoolWorkloadClassifier(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:SqlPoolWorkloadClassifier", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:synapse/v20190601preview:SqlPoolWorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20201201:SqlPoolWorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210301:SqlPoolWorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210401preview:SqlPoolWorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210501:SqlPoolWorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601:SqlPoolWorkloadClassifier").build()),
                Output.of(Alias.builder().type("azure-native:synapse/v20210601preview:SqlPoolWorkloadClassifier").build())
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
    public static SqlPoolWorkloadClassifier get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlPoolWorkloadClassifier(name, id, options);
    }
}
