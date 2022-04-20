// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.rds;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.rds.GlobalClusterArgs;
import com.pulumi.awsnative.rds.enums.GlobalClusterEngine;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::RDS::GlobalCluster
 * 
 */
@ResourceType(type="aws-native:rds:GlobalCluster")
public class GlobalCluster extends com.pulumi.resources.CustomResource {
    /**
     * The deletion protection setting for the new global database. The global database can&#39;t be deleted when deletion protection is enabled.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return The deletion protection setting for the new global database. The global database can&#39;t be deleted when deletion protection is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * The name of the database engine to be used for this DB cluster. Valid Values: aurora (for MySQL 5.6-compatible Aurora), aurora-mysql (for MySQL 5.7-compatible Aurora).
     * If you specify the SourceDBClusterIdentifier property, don&#39;t specify this property. The value is inherited from the cluster.
     * 
     */
    @Export(name="engine", type=GlobalClusterEngine.class, parameters={})
    private Output</* @Nullable */ GlobalClusterEngine> engine;

    /**
     * @return The name of the database engine to be used for this DB cluster. Valid Values: aurora (for MySQL 5.6-compatible Aurora), aurora-mysql (for MySQL 5.7-compatible Aurora).
     * If you specify the SourceDBClusterIdentifier property, don&#39;t specify this property. The value is inherited from the cluster.
     * 
     */
    public Output</* @Nullable */ GlobalClusterEngine> engine() {
        return this.engine;
    }
    /**
     * The version number of the database engine to use. If you specify the SourceDBClusterIdentifier property, don&#39;t specify this property. The value is inherited from the cluster.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> engineVersion;

    /**
     * @return The version number of the database engine to use. If you specify the SourceDBClusterIdentifier property, don&#39;t specify this property. The value is inherited from the cluster.
     * 
     */
    public Output</* @Nullable */ String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * The cluster identifier of the new global database cluster. This parameter is stored as a lowercase string.
     * 
     */
    @Export(name="globalClusterIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> globalClusterIdentifier;

    /**
     * @return The cluster identifier of the new global database cluster. This parameter is stored as a lowercase string.
     * 
     */
    public Output</* @Nullable */ String> globalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }
    /**
     * The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional. This parameter is stored as a lowercase string.
     * 
     */
    @Export(name="sourceDBClusterIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceDBClusterIdentifier;

    /**
     * @return The Amazon Resource Name (ARN) to use as the primary cluster of the global database. This parameter is optional. This parameter is stored as a lowercase string.
     * 
     */
    public Output</* @Nullable */ String> sourceDBClusterIdentifier() {
        return this.sourceDBClusterIdentifier;
    }
    /**
     *  The storage encryption setting for the new global database cluster.
     * If you specify the SourceDBClusterIdentifier property, don&#39;t specify this property. The value is inherited from the cluster.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> storageEncrypted;

    /**
     * @return  The storage encryption setting for the new global database cluster.
     * If you specify the SourceDBClusterIdentifier property, don&#39;t specify this property. The value is inherited from the cluster.
     * 
     */
    public Output</* @Nullable */ Boolean> storageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalCluster(String name) {
        this(name, GlobalClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalCluster(String name, @Nullable GlobalClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalCluster(String name, @Nullable GlobalClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rds:GlobalCluster", name, args == null ? GlobalClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalCluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rds:GlobalCluster", name, null, makeResourceOptions(options, id));
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
    public static GlobalCluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalCluster(name, id, options);
    }
}
