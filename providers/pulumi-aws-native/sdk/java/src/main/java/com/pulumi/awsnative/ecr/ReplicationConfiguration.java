// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ecr.ReplicationConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::ECR::ReplicationConfiguration resource configures the replication destinations for an Amazon Elastic Container Registry (Amazon Private ECR). For more information, see https://docs.aws.amazon.com/AmazonECR/latest/userguide/replication.html
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ecr:ReplicationConfiguration")
public class ReplicationConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The RegistryId associated with the aws account.
     * 
     */
    @Export(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The RegistryId associated with the aws account.
     * 
     */
    public Output<String> registryId() {
        return this.registryId;
    }
    @Export(name="replicationConfiguration", type=com.pulumi.awsnative.ecr.outputs.ReplicationConfiguration.class, parameters={})
    private Output<com.pulumi.awsnative.ecr.outputs.ReplicationConfiguration> replicationConfiguration;

    public Output<com.pulumi.awsnative.ecr.outputs.ReplicationConfiguration> replicationConfiguration() {
        return this.replicationConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationConfiguration(String name) {
        this(name, ReplicationConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationConfiguration(String name, ReplicationConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationConfiguration(String name, ReplicationConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecr:ReplicationConfiguration", name, args == null ? ReplicationConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ecr:ReplicationConfiguration", name, null, makeResourceOptions(options, id));
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
    public static ReplicationConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationConfiguration(name, id, options);
    }
}
