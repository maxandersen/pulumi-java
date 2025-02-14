// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.datasync.LocationSMBArgs;
import com.pulumi.awsnative.datasync.outputs.LocationSMBMountOptions;
import com.pulumi.awsnative.datasync.outputs.LocationSMBTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::LocationSMB.
 * 
 */
@ResourceType(type="aws-native:datasync:LocationSMB")
public class LocationSMB extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * 
     */
    @Export(name="agentArns", type=List.class, parameters={String.class})
    private Output<List<String>> agentArns;

    /**
     * @return The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * 
     */
    public Output<List<String>> agentArns() {
        return this.agentArns;
    }
    /**
     * The name of the Windows domain that the SMB server belongs to.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output</* @Nullable */ String> domain;

    /**
     * @return The name of the Windows domain that the SMB server belongs to.
     * 
     */
    public Output<Optional<String>> domain() {
        return Codegen.optional(this.domain);
    }
    /**
     * The Amazon Resource Name (ARN) of the SMB location that is created.
     * 
     */
    @Export(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the SMB location that is created.
     * 
     */
    public Output<String> locationArn() {
        return this.locationArn;
    }
    /**
     * The URL of the SMB location that was described.
     * 
     */
    @Export(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return The URL of the SMB location that was described.
     * 
     */
    public Output<String> locationUri() {
        return this.locationUri;
    }
    @Export(name="mountOptions", type=LocationSMBMountOptions.class, parameters={})
    private Output</* @Nullable */ LocationSMBMountOptions> mountOptions;

    public Output<Optional<LocationSMBMountOptions>> mountOptions() {
        return Codegen.optional(this.mountOptions);
    }
    /**
     * The password of the user who can mount the share and has the permissions to access files and folders in the SMB share.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password of the user who can mount the share and has the permissions to access files and folders in the SMB share.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server.
     * 
     */
    @Export(name="serverHostname", type=String.class, parameters={})
    private Output<String> serverHostname;

    /**
     * @return The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server.
     * 
     */
    public Output<String> serverHostname() {
        return this.serverHostname;
    }
    /**
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to the SMB destination
     * 
     */
    @Export(name="subdirectory", type=String.class, parameters={})
    private Output<String> subdirectory;

    /**
     * @return The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to the SMB destination
     * 
     */
    public Output<String> subdirectory() {
        return this.subdirectory;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={LocationSMBTag.class})
    private Output</* @Nullable */ List<LocationSMBTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<LocationSMBTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationSMB(String name) {
        this(name, LocationSMBArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationSMB(String name, LocationSMBArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationSMB(String name, LocationSMBArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationSMB", name, args == null ? LocationSMBArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationSMB(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationSMB", name, null, makeResourceOptions(options, id));
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
    public static LocationSMB get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocationSMB(name, id, options);
    }
}
