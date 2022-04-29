// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.intune;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.intune.AndroidMAMPolicyByNameArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Android Policy entity for Intune MAM.
 * API Version: 2015-01-14-preview.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:intune:AndroidMAMPolicyByName myresource1 /providers/Microsoft.Intune/locations/{hostName}/androidPolicies/{policyName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:intune:AndroidMAMPolicyByName")
public class AndroidMAMPolicyByName extends CustomResource {
    @Export(name="accessRecheckOfflineTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessRecheckOfflineTimeout;

    public Output<Optional<String>> accessRecheckOfflineTimeout() {
        return Codegen.optional(this.accessRecheckOfflineTimeout);
    }
    @Export(name="accessRecheckOnlineTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessRecheckOnlineTimeout;

    public Output<Optional<String>> accessRecheckOnlineTimeout() {
        return Codegen.optional(this.accessRecheckOnlineTimeout);
    }
    @Export(name="appSharingFromLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> appSharingFromLevel;

    public Output<Optional<String>> appSharingFromLevel() {
        return Codegen.optional(this.appSharingFromLevel);
    }
    @Export(name="appSharingToLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> appSharingToLevel;

    public Output<Optional<String>> appSharingToLevel() {
        return Codegen.optional(this.appSharingToLevel);
    }
    @Export(name="authentication", type=String.class, parameters={})
    private Output</* @Nullable */ String> authentication;

    public Output<Optional<String>> authentication() {
        return Codegen.optional(this.authentication);
    }
    @Export(name="clipboardSharingLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> clipboardSharingLevel;

    public Output<Optional<String>> clipboardSharingLevel() {
        return Codegen.optional(this.clipboardSharingLevel);
    }
    @Export(name="dataBackup", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataBackup;

    public Output<Optional<String>> dataBackup() {
        return Codegen.optional(this.dataBackup);
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="deviceCompliance", type=String.class, parameters={})
    private Output</* @Nullable */ String> deviceCompliance;

    public Output<Optional<String>> deviceCompliance() {
        return Codegen.optional(this.deviceCompliance);
    }
    @Export(name="fileEncryption", type=String.class, parameters={})
    private Output</* @Nullable */ String> fileEncryption;

    public Output<Optional<String>> fileEncryption() {
        return Codegen.optional(this.fileEncryption);
    }
    @Export(name="fileSharingSaveAs", type=String.class, parameters={})
    private Output</* @Nullable */ String> fileSharingSaveAs;

    public Output<Optional<String>> fileSharingSaveAs() {
        return Codegen.optional(this.fileSharingSaveAs);
    }
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName;
    }
    @Export(name="groupStatus", type=String.class, parameters={})
    private Output<String> groupStatus;

    public Output<String> groupStatus() {
        return this.groupStatus;
    }
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Resource Location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    @Export(name="managedBrowser", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedBrowser;

    public Output<Optional<String>> managedBrowser() {
        return Codegen.optional(this.managedBrowser);
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="numOfApps", type=Integer.class, parameters={})
    private Output<Integer> numOfApps;

    public Output<Integer> numOfApps() {
        return this.numOfApps;
    }
    @Export(name="offlineWipeTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> offlineWipeTimeout;

    public Output<Optional<String>> offlineWipeTimeout() {
        return Codegen.optional(this.offlineWipeTimeout);
    }
    @Export(name="pin", type=String.class, parameters={})
    private Output</* @Nullable */ String> pin;

    public Output<Optional<String>> pin() {
        return Codegen.optional(this.pin);
    }
    @Export(name="pinNumRetry", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> pinNumRetry;

    public Output<Optional<Integer>> pinNumRetry() {
        return Codegen.optional(this.pinNumRetry);
    }
    @Export(name="screenCapture", type=String.class, parameters={})
    private Output</* @Nullable */ String> screenCapture;

    public Output<Optional<String>> screenCapture() {
        return Codegen.optional(this.screenCapture);
    }
    /**
     * Resource Tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource Tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AndroidMAMPolicyByName(String name) {
        this(name, AndroidMAMPolicyByNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AndroidMAMPolicyByName(String name, AndroidMAMPolicyByNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AndroidMAMPolicyByName(String name, AndroidMAMPolicyByNameArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:intune:AndroidMAMPolicyByName", name, args == null ? AndroidMAMPolicyByNameArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AndroidMAMPolicyByName(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:intune:AndroidMAMPolicyByName", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:intune/v20150114preview:AndroidMAMPolicyByName").build()),
                Output.of(Alias.builder().type("azure-native:intune/v20150114privatepreview:AndroidMAMPolicyByName").build())
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
    public static AndroidMAMPolicyByName get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new AndroidMAMPolicyByName(name, id, options);
    }
}
