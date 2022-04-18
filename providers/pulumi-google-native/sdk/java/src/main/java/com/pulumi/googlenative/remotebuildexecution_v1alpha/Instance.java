// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.remotebuildexecution_v1alpha.InstanceArgs;
import com.pulumi.googlenative.remotebuildexecution_v1alpha.outputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new instance in the specified region. Returns a long running operation which contains an instance on completion. While the long running operation is in progress, any call to `GetInstance` returns an instance in state `CREATING`.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:remotebuildexecution/v1alpha:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The policy to define whether or not RBE features can be used or how they can be used.
     * 
     */
    @Export(name="featurePolicy", type=GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse.class, parameters={})
    private Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse> featurePolicy;

    /**
     * @return The policy to define whether or not RBE features can be used or how they can be used.
     * 
     */
    public Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyResponse> featurePolicy() {
        return this.featurePolicy;
    }
    /**
     * The location is a GCP region. Currently only `us-central1` is supported.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location is a GCP region. Currently only `us-central1` is supported.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Whether stack driver logging is enabled for the instance.
     * 
     */
    @Export(name="loggingEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> loggingEnabled;

    /**
     * @return Whether stack driver logging is enabled for the instance.
     * 
     */
    public Output<Boolean> loggingEnabled() {
        return this.loggingEnabled;
    }
    /**
     * Instance resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an instance since it is provided in the `instance_id` field.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Instance resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an instance since it is provided in the `instance_id` field.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * State of the instance.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the instance.
     * 
     */
    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, @Nullable InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, @Nullable InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:remotebuildexecution/v1alpha:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:remotebuildexecution/v1alpha:Instance", name, null, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
