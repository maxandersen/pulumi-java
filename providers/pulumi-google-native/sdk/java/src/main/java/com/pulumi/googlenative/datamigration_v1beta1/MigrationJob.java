// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datamigration_v1beta1.MigrationJobArgs;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.DatabaseTypeResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.ReverseSshConnectivityResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.StaticIpConnectivityResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.StatusResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.VpcPeeringConnectivityResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new migration job in a given project and location.
 * 
 */
@ResourceType(type="google-native:datamigration/v1beta1:MigrationJob")
public class MigrationJob extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The resource name (URI) of the destination connection profile.
     * 
     */
    @Export(name="destination", type=String.class, parameters={})
    private Output<String> destination;

    /**
     * @return The resource name (URI) of the destination connection profile.
     * 
     */
    public Output<String> destination() {
        return this.destination;
    }
    /**
     * The database engine type and provider of the destination.
     * 
     */
    @Export(name="destinationDatabase", type=DatabaseTypeResponse.class, parameters={})
    private Output<DatabaseTypeResponse> destinationDatabase;

    /**
     * @return The database engine type and provider of the destination.
     * 
     */
    public Output<DatabaseTypeResponse> destinationDatabase() {
        return this.destinationDatabase;
    }
    /**
     * The migration job display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The migration job display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    @Export(name="dumpPath", type=String.class, parameters={})
    private Output<String> dumpPath;

    /**
     * @return The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    public Output<String> dumpPath() {
        return this.dumpPath;
    }
    /**
     * The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Export(name="duration", type=String.class, parameters={})
    private Output<String> duration;

    /**
     * @return The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Output<String> duration() {
        return this.duration;
    }
    /**
     * If the migration job is completed, the time when it was completed.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return If the migration job is completed, the time when it was completed.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The error details in case of state FAILED.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return The error details in case of state FAILED.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current migration job phase.
     * 
     */
    @Export(name="phase", type=String.class, parameters={})
    private Output<String> phase;

    /**
     * @return The current migration job phase.
     * 
     */
    public Output<String> phase() {
        return this.phase;
    }
    /**
     * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    @Export(name="reverseSshConnectivity", type=ReverseSshConnectivityResponse.class, parameters={})
    private Output<ReverseSshConnectivityResponse> reverseSshConnectivity;

    /**
     * @return The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    public Output<ReverseSshConnectivityResponse> reverseSshConnectivity() {
        return this.reverseSshConnectivity;
    }
    /**
     * The resource name (URI) of the source connection profile.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output<String> source;

    /**
     * @return The resource name (URI) of the source connection profile.
     * 
     */
    public Output<String> source() {
        return this.source;
    }
    /**
     * The database engine type and provider of the source.
     * 
     */
    @Export(name="sourceDatabase", type=DatabaseTypeResponse.class, parameters={})
    private Output<DatabaseTypeResponse> sourceDatabase;

    /**
     * @return The database engine type and provider of the source.
     * 
     */
    public Output<DatabaseTypeResponse> sourceDatabase() {
        return this.sourceDatabase;
    }
    /**
     * The current migration job state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current migration job state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * static ip connectivity data (default, no additional details needed).
     * 
     */
    @Export(name="staticIpConnectivity", type=StaticIpConnectivityResponse.class, parameters={})
    private Output<StaticIpConnectivityResponse> staticIpConnectivity;

    /**
     * @return static ip connectivity data (default, no additional details needed).
     * 
     */
    public Output<StaticIpConnectivityResponse> staticIpConnectivity() {
        return this.staticIpConnectivity;
    }
    /**
     * The migration job type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The migration job type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * The details of the VPC network that the source database is located in.
     * 
     */
    @Export(name="vpcPeeringConnectivity", type=VpcPeeringConnectivityResponse.class, parameters={})
    private Output<VpcPeeringConnectivityResponse> vpcPeeringConnectivity;

    /**
     * @return The details of the VPC network that the source database is located in.
     * 
     */
    public Output<VpcPeeringConnectivityResponse> vpcPeeringConnectivity() {
        return this.vpcPeeringConnectivity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MigrationJob(String name) {
        this(name, MigrationJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MigrationJob(String name, MigrationJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MigrationJob(String name, MigrationJobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1beta1:MigrationJob", name, args == null ? MigrationJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MigrationJob(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1beta1:MigrationJob", name, null, makeResourceOptions(options, id));
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
    public static MigrationJob get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MigrationJob(name, id, options);
    }
}
