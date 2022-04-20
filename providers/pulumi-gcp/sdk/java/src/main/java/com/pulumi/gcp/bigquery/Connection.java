// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.ConnectionArgs;
import com.pulumi.gcp.bigquery.inputs.ConnectionState;
import com.pulumi.gcp.bigquery.outputs.ConnectionCloudSql;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A connection allows BigQuery connections to external data sources..
 * 
 * To get more information about Connection, see:
 * 
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/bigqueryconnection/rest/v1beta1/projects.locations.connections/create)
 * * How-to Guides
 *     * [Cloud SQL federated queries](https://cloud.google.com/bigquery/docs/cloud-sql-federated-queries)
 * 
 * &gt; **Warning:** All arguments including `cloud_sql.credential.password` will be stored in the raw
 * state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Connection can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/connection:Connection default projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/connection:Connection default {{project}}/{{location}}/{{connection_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/connection:Connection default {{location}}/{{connection_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Cloud SQL properties.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudSql", type=ConnectionCloudSql.class, parameters={})
    private Output<ConnectionCloudSql> cloudSql;

    /**
     * @return Cloud SQL properties.
     * Structure is documented below.
     * 
     */
    public Output<ConnectionCloudSql> cloudSql() {
        return this.cloudSql;
    }
    /**
     * Optional connection id that should be assigned to the created connection.
     * 
     */
    @Export(name="connectionId", type=String.class, parameters={})
    private Output<String> connectionId;

    /**
     * @return Optional connection id that should be assigned to the created connection.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * A descriptive description for the connection
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A descriptive description for the connection
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * A descriptive name for the connection
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return A descriptive name for the connection
     * 
     */
    public Output</* @Nullable */ String> friendlyName() {
        return this.friendlyName;
    }
    /**
     * True if the connection has credential assigned.
     * 
     */
    @Export(name="hasCredential", type=Boolean.class, parameters={})
    private Output<Boolean> hasCredential;

    /**
     * @return True if the connection has credential assigned.
     * 
     */
    public Output<Boolean> hasCredential() {
        return this.hasCredential;
    }
    /**
     * The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1. The default value is US.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1. The default value is US.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The resource name of the connection in the form of:
     * &#34;projects/{project_id}/locations/{location_id}/connections/{connectionId}&#34;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the connection in the form of:
     * &#34;projects/{project_id}/locations/{location_id}/connections/{connectionId}&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
