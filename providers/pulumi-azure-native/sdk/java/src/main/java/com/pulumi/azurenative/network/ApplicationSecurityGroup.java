// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.ApplicationSecurityGroupArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An application security group in a resource group.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:ApplicationSecurityGroup test-asg /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/applicationSecurityGroups/test-asg 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ApplicationSecurityGroup")
public class ApplicationSecurityGroup extends CustomResource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning state of the application security group resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the application security group resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the application security group resource. It uniquely identifies a resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the application security group resource. It uniquely identifies a resource, even if the user changes its name or migrate the resource across subscriptions or resource groups.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationSecurityGroup(String name) {
        this(name, ApplicationSecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationSecurityGroup(String name, ApplicationSecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationSecurityGroup(String name, ApplicationSecurityGroupArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:network:ApplicationSecurityGroup", name, args == null ? ApplicationSecurityGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationSecurityGroup(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:network:ApplicationSecurityGroup", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20170901:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:ApplicationSecurityGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:ApplicationSecurityGroup").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApplicationSecurityGroup get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ApplicationSecurityGroup(name, id, options);
    }
}
