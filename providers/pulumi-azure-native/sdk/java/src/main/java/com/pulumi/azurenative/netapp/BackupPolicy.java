// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.netapp.BackupPolicyArgs;
import com.pulumi.azurenative.netapp.outputs.VolumeBackupsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Backup policy information
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:netapp:BackupPolicy account1/backupPolicyName /subscriptions/D633CC2E-722B-4AE1-B636-BBD9E4C60ED9/resourceGroups/myRG/providers/Microsoft.NetApp/netAppAccounts/account1/backupPolocies/backupPolicyName 
 * ```
 * 
 */
@ResourceType(type="azure-native:netapp:BackupPolicy")
public class BackupPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Daily backups count to keep
     * 
     */
    @Export(name="dailyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dailyBackupsToKeep;

    /**
     * @return Daily backups count to keep
     * 
     */
    public Output<Optional<Integer>> dailyBackupsToKeep() {
        return Codegen.optional(this.dailyBackupsToKeep);
    }
    /**
     * The property to decide policy is enabled or not
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The property to decide policy is enabled or not
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Monthly backups count to keep
     * 
     */
    @Export(name="monthlyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> monthlyBackupsToKeep;

    /**
     * @return Monthly backups count to keep
     * 
     */
    public Output<Optional<Integer>> monthlyBackupsToKeep() {
        return Codegen.optional(this.monthlyBackupsToKeep);
    }
    /**
     * Name of backup policy
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of backup policy
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Azure lifecycle management
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Azure lifecycle management
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
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
     * A list of volumes assigned to this policy
     * 
     */
    @Export(name="volumeBackups", type=List.class, parameters={VolumeBackupsResponse.class})
    private Output</* @Nullable */ List<VolumeBackupsResponse>> volumeBackups;

    /**
     * @return A list of volumes assigned to this policy
     * 
     */
    public Output<Optional<List<VolumeBackupsResponse>>> volumeBackups() {
        return Codegen.optional(this.volumeBackups);
    }
    /**
     * Volumes using current backup policy
     * 
     */
    @Export(name="volumesAssigned", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> volumesAssigned;

    /**
     * @return Volumes using current backup policy
     * 
     */
    public Output<Optional<Integer>> volumesAssigned() {
        return Codegen.optional(this.volumesAssigned);
    }
    /**
     * Weekly backups count to keep
     * 
     */
    @Export(name="weeklyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> weeklyBackupsToKeep;

    /**
     * @return Weekly backups count to keep
     * 
     */
    public Output<Optional<Integer>> weeklyBackupsToKeep() {
        return Codegen.optional(this.weeklyBackupsToKeep);
    }
    /**
     * Yearly backups count to keep
     * 
     */
    @Export(name="yearlyBackupsToKeep", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> yearlyBackupsToKeep;

    /**
     * @return Yearly backups count to keep
     * 
     */
    public Output<Optional<Integer>> yearlyBackupsToKeep() {
        return Codegen.optional(this.yearlyBackupsToKeep);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupPolicy(String name) {
        this(name, BackupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupPolicy(String name, BackupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupPolicy(String name, BackupPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:BackupPolicy", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:netapp/v20200501:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200601:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200701:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200801:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20200901:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201101:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20201201:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210201:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210401preview:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210601:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20210801:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:netapp/v20211001:BackupPolicy").build())
            ))
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
    public static BackupPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicy(name, id, options);
    }
}
