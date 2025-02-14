// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1alpha2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudbuild_v1alpha2.WorkerPoolArgs;
import com.pulumi.googlenative.cloudbuild_v1alpha2.outputs.NetworkConfigResponse;
import com.pulumi.googlenative.cloudbuild_v1alpha2.outputs.WorkerConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a `WorkerPool` to run the builds, and returns the new worker pool.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudbuild/v1alpha2:WorkerPool")
public class WorkerPool extends com.pulumi.resources.CustomResource {
    /**
     * Time at which the request to create the `WorkerPool` was received.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time at which the request to create the `WorkerPool` was received.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return Time at which the request to delete the `WorkerPool` was received.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * The resource name of the `WorkerPool`. Format of the name is `projects/{project_id}/workerPools/{worker_pool_id}`, where the value of {worker_pool_id} is provided in the CreateWorkerPool request.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the `WorkerPool`. Format of the name is `projects/{project_id}/workerPools/{worker_pool_id}`, where the value of {worker_pool_id} is provided in the CreateWorkerPool request.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Network configuration for the `WorkerPool`.
     * 
     */
    @Export(name="networkConfig", type=NetworkConfigResponse.class, parameters={})
    private Output<NetworkConfigResponse> networkConfig;

    /**
     * @return Network configuration for the `WorkerPool`.
     * 
     */
    public Output<NetworkConfigResponse> networkConfig() {
        return this.networkConfig;
    }
    /**
     * Immutable. The region where the `WorkerPool` runs. Only &#34;us-central1&#34; is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Immutable. The region where the `WorkerPool` runs. Only &#34;us-central1&#34; is currently supported. Note that `region` cannot be changed once the `WorkerPool` is created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * WorkerPool state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return WorkerPool state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Time at which the request to update the `WorkerPool` was received.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Time at which the request to update the `WorkerPool` was received.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Worker configuration for the `WorkerPool`.
     * 
     */
    @Export(name="workerConfig", type=WorkerConfigResponse.class, parameters={})
    private Output<WorkerConfigResponse> workerConfig;

    /**
     * @return Worker configuration for the `WorkerPool`.
     * 
     */
    public Output<WorkerConfigResponse> workerConfig() {
        return this.workerConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkerPool(String name) {
        this(name, WorkerPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkerPool(String name, WorkerPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkerPool(String name, WorkerPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1alpha2:WorkerPool", name, args == null ? WorkerPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkerPool(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1alpha2:WorkerPool", name, null, makeResourceOptions(options, id));
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
    public static WorkerPool get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkerPool(name, id, options);
    }
}
