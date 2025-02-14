// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gameservices.GameServerClusterArgs;
import com.pulumi.gcp.gameservices.inputs.GameServerClusterState;
import com.pulumi.gcp.gameservices.outputs.GameServerClusterConnectionInfo;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A game server cluster resource.
 * 
 * To get more information about GameServerCluster, see:
 * 
 * * [API documentation](https://cloud.google.com/game-servers/docs/reference/rest/v1beta/projects.locations.realms.gameServerClusters)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/game-servers/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GameServerCluster can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerCluster:GameServerCluster default projects/{{project}}/locations/{{location}}/realms/{{realm_id}}/gameServerClusters/{{cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerCluster:GameServerCluster default {{project}}/{{location}}/{{realm_id}}/{{cluster_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gameservices/gameServerCluster:GameServerCluster default {{location}}/{{realm_id}}/{{cluster_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gameservices/gameServerCluster:GameServerCluster")
public class GameServerCluster extends com.pulumi.resources.CustomResource {
    /**
     * Required. The resource name of the game server cluster
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return Required. The resource name of the game server cluster
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * Game server cluster connection information. This information is used to
     * manage game server clusters.
     * Structure is documented below.
     * 
     */
    @Export(name="connectionInfo", type=GameServerClusterConnectionInfo.class, parameters={})
    private Output<GameServerClusterConnectionInfo> connectionInfo;

    /**
     * @return Game server cluster connection information. This information is used to
     * manage game server clusters.
     * Structure is documented below.
     * 
     */
    public Output<GameServerClusterConnectionInfo> connectionInfo() {
        return this.connectionInfo;
    }
    /**
     * Human readable description of the cluster.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Human readable description of the cluster.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The labels associated with this game server cluster. Each label is a
     * key-value pair.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return The labels associated with this game server cluster. Each label is a
     * key-value pair.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Location of the Cluster.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the Cluster.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The resource id of the game server cluster, eg:
     * &#39;projects/{project_id}/locations/{location}/realms/{realm_id}/gameServerClusters/{cluster_id}&#39;. For example,
     * &#39;projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster&#39;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource id of the game server cluster, eg:
     * &#39;projects/{project_id}/locations/{location}/realms/{realm_id}/gameServerClusters/{cluster_id}&#39;. For example,
     * &#39;projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster&#39;.
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
     * The realm id of the game server realm.
     * 
     */
    @Export(name="realmId", type=String.class, parameters={})
    private Output<String> realmId;

    /**
     * @return The realm id of the game server realm.
     * 
     */
    public Output<String> realmId() {
        return this.realmId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GameServerCluster(String name) {
        this(name, GameServerClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GameServerCluster(String name, GameServerClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GameServerCluster(String name, GameServerClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerCluster:GameServerCluster", name, args == null ? GameServerClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GameServerCluster(String name, Output<String> id, @Nullable GameServerClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gameservices/gameServerCluster:GameServerCluster", name, state, makeResourceOptions(options, id));
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
    public static GameServerCluster get(String name, Output<String> id, @Nullable GameServerClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GameServerCluster(name, id, state, options);
    }
}
