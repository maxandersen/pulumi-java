// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ecs.ClusterArgs;
import com.pulumi.awsnative.ecs.outputs.ClusterCapacityProviderStrategyItem;
import com.pulumi.awsnative.ecs.outputs.ClusterConfiguration;
import com.pulumi.awsnative.ecs.outputs.ClusterSettings;
import com.pulumi.awsnative.ecs.outputs.ClusterTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create an Elastic Container Service (ECS) cluster.
 * 
 */
@ResourceType(type="aws-native:ecs:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS cluster, such as arn:aws:ecs:us-east-2:123456789012:cluster/MyECSCluster.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon ECS cluster, such as arn:aws:ecs:us-east-2:123456789012:cluster/MyECSCluster.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="capacityProviders", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> capacityProviders;

    public Output</* @Nullable */ List<String>> capacityProviders() {
        return this.capacityProviders;
    }
    /**
     * A user-generated string that you use to identify your cluster. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID for the name.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterName;

    /**
     * @return A user-generated string that you use to identify your cluster. If you don&#39;t specify a name, AWS CloudFormation generates a unique physical ID for the name.
     * 
     */
    public Output</* @Nullable */ String> clusterName() {
        return this.clusterName;
    }
    @Export(name="clusterSettings", type=List.class, parameters={ClusterSettings.class})
    private Output</* @Nullable */ List<ClusterSettings>> clusterSettings;

    public Output</* @Nullable */ List<ClusterSettings>> clusterSettings() {
        return this.clusterSettings;
    }
    @Export(name="configuration", type=ClusterConfiguration.class, parameters={})
    private Output</* @Nullable */ ClusterConfiguration> configuration;

    public Output</* @Nullable */ ClusterConfiguration> configuration() {
        return this.configuration;
    }
    @Export(name="defaultCapacityProviderStrategy", type=List.class, parameters={ClusterCapacityProviderStrategyItem.class})
    private Output</* @Nullable */ List<ClusterCapacityProviderStrategyItem>> defaultCapacityProviderStrategy;

    public Output</* @Nullable */ List<ClusterCapacityProviderStrategyItem>> defaultCapacityProviderStrategy() {
        return this.defaultCapacityProviderStrategy;
    }
    @Export(name="tags", type=List.class, parameters={ClusterTag.class})
    private Output</* @Nullable */ List<ClusterTag>> tags;

    public Output</* @Nullable */ List<ClusterTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecs:Cluster", name, null, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
