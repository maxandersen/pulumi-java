// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow_v3beta1.SessionEntityTypeArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a session entity type.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:SessionEntityType")
public class SessionEntityType extends com.pulumi.resources.CustomResource {
    /**
     * The collection of entities to override or supplement the custom entity type.
     * 
     */
    @Export(name="entities", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse>> entities;

    /**
     * @return The collection of entities to override or supplement the custom entity type.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse>> entities() {
        return this.entities;
    }
    /**
     * Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    @Export(name="entityOverrideMode", type=String.class, parameters={})
    private Output<String> entityOverrideMode;

    /**
     * @return Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    public Output<String> entityOverrideMode() {
        return this.entityOverrideMode;
    }
    /**
     * The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default &#39;draft&#39; environment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default &#39;draft&#39; environment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SessionEntityType(String name) {
        this(name, SessionEntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SessionEntityType(String name, SessionEntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SessionEntityType(String name, SessionEntityTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:SessionEntityType", name, args == null ? SessionEntityTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SessionEntityType(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:SessionEntityType", name, null, makeResourceOptions(options, id));
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
    public static SessionEntityType get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SessionEntityType(name, id, options);
    }
}
