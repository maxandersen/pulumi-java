// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.panorama;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.panorama.PackageArgs;
import com.pulumi.awsnative.panorama.outputs.PackageStorageLocation;
import com.pulumi.awsnative.panorama.outputs.PackageTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schema for Package CloudFormation Resource
 * 
 */
@ResourceType(type="aws-native:panorama:Package")
public class Package extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="createdTime", type=Integer.class, parameters={})
    private Output<Integer> createdTime;

    public Output<Integer> createdTime() {
        return this.createdTime;
    }
    @Export(name="packageId", type=String.class, parameters={})
    private Output<String> packageId;

    public Output<String> packageId() {
        return this.packageId;
    }
    @Export(name="packageName", type=String.class, parameters={})
    private Output<String> packageName;

    public Output<String> packageName() {
        return this.packageName;
    }
    @Export(name="storageLocation", type=PackageStorageLocation.class, parameters={})
    private Output<PackageStorageLocation> storageLocation;

    public Output<PackageStorageLocation> storageLocation() {
        return this.storageLocation;
    }
    @Export(name="tags", type=List.class, parameters={PackageTag.class})
    private Output</* @Nullable */ List<PackageTag>> tags;

    public Output</* @Nullable */ List<PackageTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Package(String name) {
        this(name, PackageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Package(String name, @Nullable PackageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Package(String name, @Nullable PackageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:Package", name, args == null ? PackageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Package(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:Package", name, null, makeResourceOptions(options, id));
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
    public static Package get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Package(name, id, options);
    }
}
