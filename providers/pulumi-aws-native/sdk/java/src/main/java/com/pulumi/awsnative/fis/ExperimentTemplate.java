// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.fis;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.fis.ExperimentTemplateArgs;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateActionMap;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateLogConfiguration;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateStopCondition;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateTargetMap;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::FIS::ExperimentTemplate
 * 
 */
@ResourceType(type="aws-native:fis:ExperimentTemplate")
public class ExperimentTemplate extends com.pulumi.resources.CustomResource {
    @Export(name="actions", type=ExperimentTemplateActionMap.class, parameters={})
    private Output</* @Nullable */ ExperimentTemplateActionMap> actions;

    public Output<Optional<ExperimentTemplateActionMap>> actions() {
        return Codegen.optional(this.actions);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> description() {
        return this.description;
    }
    @Export(name="logConfiguration", type=ExperimentTemplateLogConfiguration.class, parameters={})
    private Output</* @Nullable */ ExperimentTemplateLogConfiguration> logConfiguration;

    public Output<Optional<ExperimentTemplateLogConfiguration>> logConfiguration() {
        return Codegen.optional(this.logConfiguration);
    }
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }
    @Export(name="stopConditions", type=List.class, parameters={ExperimentTemplateStopCondition.class})
    private Output<List<ExperimentTemplateStopCondition>> stopConditions;

    public Output<List<ExperimentTemplateStopCondition>> stopConditions() {
        return this.stopConditions;
    }
    @Export(name="tags", type=Object.class, parameters={})
    private Output<Object> tags;

    public Output<Object> tags() {
        return this.tags;
    }
    @Export(name="targets", type=ExperimentTemplateTargetMap.class, parameters={})
    private Output<ExperimentTemplateTargetMap> targets;

    public Output<ExperimentTemplateTargetMap> targets() {
        return this.targets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExperimentTemplate(String name) {
        this(name, ExperimentTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExperimentTemplate(String name, ExperimentTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExperimentTemplate(String name, ExperimentTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:fis:ExperimentTemplate", name, args == null ? ExperimentTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExperimentTemplate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:fis:ExperimentTemplate", name, null, makeResourceOptions(options, id));
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
    public static ExperimentTemplate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExperimentTemplate(name, id, options);
    }
}
