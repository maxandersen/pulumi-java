// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.datasync.LocationFSxWindowsArgs;
import com.pulumi.awsnative.datasync.outputs.LocationFSxWindowsTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::DataSync::LocationFSxWindows.
 * 
 */
@ResourceType(type="aws-native:datasync:LocationFSxWindows")
public class LocationFSxWindows extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output</* @Nullable */ String> domain;

    /**
     * @return The name of the Windows domain that the FSx for Windows server belongs to.
     * 
     */
    public Output</* @Nullable */ String> domain() {
        return this.domain;
    }
    /**
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    @Export(name="fsxFilesystemArn", type=String.class, parameters={})
    private Output<String> fsxFilesystemArn;

    /**
     * @return The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * 
     */
    public Output<String> fsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    @Export(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    public Output<String> locationArn() {
        return this.locationArn;
    }
    /**
     * The URL of the FSx for Windows location that was described.
     * 
     */
    @Export(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    /**
     * @return The URL of the FSx for Windows location that was described.
     * 
     */
    public Output<String> locationUri() {
        return this.locationUri;
    }
    /**
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @Export(name="password", type=String.class, parameters={})
    private Output<String> password;

    /**
     * @return The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The ARNs of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    @Export(name="securityGroupArns", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupArns;

    /**
     * @return The ARNs of the security groups that are to use to configure the FSx for Windows file system.
     * 
     */
    public Output<List<String>> securityGroupArns() {
        return this.securityGroupArns;
    }
    /**
     * A subdirectory in the location&#39;s path.
     * 
     */
    @Export(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    /**
     * @return A subdirectory in the location&#39;s path.
     * 
     */
    public Output</* @Nullable */ String> subdirectory() {
        return this.subdirectory;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={LocationFSxWindowsTag.class})
    private Output</* @Nullable */ List<LocationFSxWindowsTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<LocationFSxWindowsTag>> tags() {
        return this.tags;
    }
    /**
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The user who has the permissions to access files and folders in the FSx for Windows file system.
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationFSxWindows(String name) {
        this(name, LocationFSxWindowsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationFSxWindows(String name, LocationFSxWindowsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationFSxWindows(String name, LocationFSxWindowsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationFSxWindows", name, args == null ? LocationFSxWindowsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationFSxWindows(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationFSxWindows", name, null, makeResourceOptions(options, id));
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
    public static LocationFSxWindows get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocationFSxWindows(name, id, options);
    }
}
