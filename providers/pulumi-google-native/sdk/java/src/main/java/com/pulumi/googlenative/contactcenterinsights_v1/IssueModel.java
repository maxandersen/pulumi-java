// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.contactcenterinsights_v1.IssueModelArgs;
import com.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse;
import com.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an issue model.
 * 
 */
@ResourceType(type="google-native:contactcenterinsights/v1:IssueModel")
public class IssueModel extends com.pulumi.resources.CustomResource {
    /**
     * The time at which this issue model was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which this issue model was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The representative name for the issue model.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The representative name for the issue model.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Configs for the input data that used to create the issue model.
     * 
     */
    @Export(name="inputDataConfig", type=GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse.class, parameters={})
    private Output<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse> inputDataConfig;

    /**
     * @return Configs for the input data that used to create the issue model.
     * 
     */
    public Output<GoogleCloudContactcenterinsightsV1IssueModelInputDataConfigResponse> inputDataConfig() {
        return this.inputDataConfig;
    }
    /**
     * Immutable. The resource name of the issue model. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the issue model. Format: projects/{project}/locations/{location}/issueModels/{issue_model}
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * State of the model.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the model.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Immutable. The issue model&#39;s label statistics on its training data.
     * 
     */
    @Export(name="trainingStats", type=GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse.class, parameters={})
    private Output<GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse> trainingStats;

    /**
     * @return Immutable. The issue model&#39;s label statistics on its training data.
     * 
     */
    public Output<GoogleCloudContactcenterinsightsV1IssueModelLabelStatsResponse> trainingStats() {
        return this.trainingStats;
    }
    /**
     * The most recent time at which the issue model was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The most recent time at which the issue model was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IssueModel(String name) {
        this(name, IssueModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IssueModel(String name, @Nullable IssueModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IssueModel(String name, @Nullable IssueModelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:contactcenterinsights/v1:IssueModel", name, args == null ? IssueModelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IssueModel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:contactcenterinsights/v1:IssueModel", name, null, makeResourceOptions(options, id));
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
    public static IssueModel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IssueModel(name, id, options);
    }
}
