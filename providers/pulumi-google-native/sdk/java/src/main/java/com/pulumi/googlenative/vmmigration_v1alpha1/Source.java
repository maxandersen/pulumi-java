// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.vmmigration_v1alpha1.SourceArgs;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import com.pulumi.googlenative.vmmigration_v1alpha1.outputs.VmwareSourceDetailsResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Source in a given project and location.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1alpha1:Source")
public class Source extends com.pulumi.resources.CustomResource {
    /**
     * The create time timestamp.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The create time timestamp.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the source.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return User-provided description of the source.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Provides details on the state of the Source in case of an error.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details on the state of the Source in case of an error.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * The labels of the source.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels of the source.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The Source name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Source name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The update time timestamp.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The update time timestamp.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Vmware type source details.
     * 
     */
    @Export(name="vmware", type=VmwareSourceDetailsResponse.class, parameters={})
    private Output<VmwareSourceDetailsResponse> vmware;

    /**
     * @return Vmware type source details.
     * 
     */
    public Output<VmwareSourceDetailsResponse> vmware() {
        return this.vmware;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Source(String name) {
        this(name, SourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Source(String name, SourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Source(String name, SourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:Source", name, args == null ? SourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Source(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:Source", name, null, makeResourceOptions(options, id));
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
    public static Source get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Source(name, id, options);
    }
}
