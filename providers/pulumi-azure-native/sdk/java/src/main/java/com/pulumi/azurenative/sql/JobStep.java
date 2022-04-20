// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.JobStepArgs;
import com.pulumi.azurenative.sql.outputs.JobStepActionResponse;
import com.pulumi.azurenative.sql.outputs.JobStepExecutionOptionsResponse;
import com.pulumi.azurenative.sql.outputs.JobStepOutputResponse;
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
 * A job step.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:JobStep step1 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/group1/providers/Microsoft.Sql/servers/server1/jobAgents/agent1/jobs/job1/steps/step1 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:JobStep")
public class JobStep extends com.pulumi.resources.CustomResource {
    /**
     * The action payload of the job step.
     * 
     */
    @Export(name="action", type=JobStepActionResponse.class, parameters={})
    private Output<JobStepActionResponse> action;

    /**
     * @return The action payload of the job step.
     * 
     */
    public Output<JobStepActionResponse> action() {
        return this.action;
    }
    /**
     * The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    @Export(name="credential", type=String.class, parameters={})
    private Output<String> credential;

    /**
     * @return The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    public Output<String> credential() {
        return this.credential;
    }
    /**
     * Execution options for the job step.
     * 
     */
    @Export(name="executionOptions", type=JobStepExecutionOptionsResponse.class, parameters={})
    private Output</* @Nullable */ JobStepExecutionOptionsResponse> executionOptions;

    /**
     * @return Execution options for the job step.
     * 
     */
    public Output</* @Nullable */ JobStepExecutionOptionsResponse> executionOptions() {
        return this.executionOptions;
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
     * Output destination properties of the job step.
     * 
     */
    @Export(name="output", type=JobStepOutputResponse.class, parameters={})
    private Output</* @Nullable */ JobStepOutputResponse> output;

    /**
     * @return Output destination properties of the job step.
     * 
     */
    public Output</* @Nullable */ JobStepOutputResponse> output() {
        return this.output;
    }
    /**
     * The job step&#39;s index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    @Export(name="stepId", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> stepId;

    /**
     * @return The job step&#39;s index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    public Output</* @Nullable */ Integer> stepId() {
        return this.stepId;
    }
    /**
     * The resource ID of the target group that the job step will be executed on.
     * 
     */
    @Export(name="targetGroup", type=String.class, parameters={})
    private Output<String> targetGroup;

    /**
     * @return The resource ID of the target group that the job step will be executed on.
     * 
     */
    public Output<String> targetGroup() {
        return this.targetGroup;
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
    public JobStep(String name) {
        this(name, JobStepArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobStep(String name, JobStepArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobStep(String name, JobStepArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobStep", name, args == null ? JobStepArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobStep(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:JobStep", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20170301preview:JobStep").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:JobStep").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:JobStep").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:JobStep").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:JobStep").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:JobStep").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:JobStep").build())
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
    public static JobStep get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobStep(name, id, options);
    }
}
