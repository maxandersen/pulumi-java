// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataproc.MetastoreServiceArgs;
import com.pulumi.gcp.dataproc.inputs.MetastoreServiceState;
import com.pulumi.gcp.dataproc.outputs.MetastoreServiceHiveMetastoreConfig;
import com.pulumi.gcp.dataproc.outputs.MetastoreServiceMaintenanceWindow;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A managed metastore service that serves metadata queries.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Service can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/metastoreService:MetastoreService default projects/{{project}}/locations/{{location}}/services/{{service_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/metastoreService:MetastoreService default {{project}}/{{location}}/{{service_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/metastoreService:MetastoreService default {{location}}/{{service_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataproc/metastoreService:MetastoreService")
public class MetastoreService extends com.pulumi.resources.CustomResource {
    /**
     * A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    @Export(name="artifactGcsUri", type=String.class, parameters={})
    private Output<String> artifactGcsUri;

    /**
     * @return A Cloud Storage URI (starting with gs://) that specifies where artifacts related to the metastore service are stored.
     * 
     */
    public Output<String> artifactGcsUri() {
        return this.artifactGcsUri;
    }
    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    @Export(name="endpointUri", type=String.class, parameters={})
    private Output<String> endpointUri;

    /**
     * @return The URI of the endpoint used to access the metastore service.
     * 
     */
    public Output<String> endpointUri() {
        return this.endpointUri;
    }
    /**
     * Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     * 
     */
    @Export(name="hiveMetastoreConfig", type=MetastoreServiceHiveMetastoreConfig.class, parameters={})
    private Output</* @Nullable */ MetastoreServiceHiveMetastoreConfig> hiveMetastoreConfig;

    /**
     * @return Configuration information specific to running Hive metastore software as the metastore service.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ MetastoreServiceHiveMetastoreConfig> hiveMetastoreConfig() {
        return this.hiveMetastoreConfig;
    }
    /**
     * User-defined labels for the metastore service.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-defined labels for the metastore service.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Structure is documented below.
     * 
     */
    @Export(name="maintenanceWindow", type=MetastoreServiceMaintenanceWindow.class, parameters={})
    private Output</* @Nullable */ MetastoreServiceMaintenanceWindow> maintenanceWindow;

    /**
     * @return The one hour maintenance window of the metastore service.
     * This specifies when the service can be restarted for maintenance purposes in UTC time.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ MetastoreServiceMaintenanceWindow> maintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The relative resource name of the metastore service.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The relative resource name of the metastore service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * &#34;projects/{projectNumber}/global/networks/{network_id}&#34;.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The TCP port at which the metastore service is reached. Default: 9083.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     * 
     */
    @Export(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    /**
     * @return The ID of the metastore service. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 63 characters.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * The current state of the metastore service.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the metastore service.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Additional information about the current state of the metastore service, if available.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return Additional information about the current state of the metastore service, if available.
     * 
     */
    public Output<String> stateMessage() {
        return this.stateMessage;
    }
    /**
     * The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The tier of the service.
     * Possible values are `DEVELOPER` and `ENTERPRISE`.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MetastoreService(String name) {
        this(name, MetastoreServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MetastoreService(String name, MetastoreServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MetastoreService(String name, MetastoreServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/metastoreService:MetastoreService", name, args == null ? MetastoreServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MetastoreService(String name, Output<String> id, @Nullable MetastoreServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/metastoreService:MetastoreService", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MetastoreService get(String name, Output<String> id, @Nullable MetastoreServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MetastoreService(name, id, state, options);
    }
}
