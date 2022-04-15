// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.transcoder_v1.JobTemplateArgs;
import io.pulumi.googlenative.transcoder_v1.outputs.JobConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a job template in the specified region.
 * 
 */
@ResourceType(type="google-native:transcoder/v1:JobTemplate")
public class JobTemplate extends io.pulumi.resources.CustomResource {
    /**
     * The configuration for this template.
     * 
     */
    @Export(name="config", type=JobConfigResponse.class, parameters={})
    private Output<JobConfigResponse> config;

    /**
     * @return The configuration for this template.
     * 
     */
    public Output<JobConfigResponse> config() {
        return this.config;
    }
    /**
     * The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the job template. Format: `projects/{project_number}/locations/{location}/jobTemplates/{job_template}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobTemplate(String name) {
        this(name, JobTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobTemplate(String name, JobTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobTemplate(String name, JobTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:transcoder/v1:JobTemplate", name, args == null ? JobTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobTemplate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:transcoder/v1:JobTemplate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static JobTemplate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobTemplate(name, id, options);
    }
}
