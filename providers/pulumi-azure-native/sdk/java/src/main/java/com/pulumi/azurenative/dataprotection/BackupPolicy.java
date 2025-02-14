// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dataprotection.BackupPolicyArgs;
import com.pulumi.azurenative.dataprotection.outputs.BackupPolicyResponse;
import com.pulumi.azurenative.dataprotection.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * BaseBackupPolicy resource
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dataprotection:BackupPolicy OSSDBPolicy /subscriptions/04cf684a-d41f-4550-9f70-7708a3a2283b/resourceGroups/000pikumar/providers/Microsoft.DataProtection/backupVaults/PrivatePreviewVault/backupPolicies/OSSDBPolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:dataprotection:BackupPolicy")
public class BackupPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Resource name associated with the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * BaseBackupPolicyResource properties
     * 
     */
    @Export(name="properties", type=BackupPolicyResponse.class, parameters={})
    private Output<BackupPolicyResponse> properties;

    /**
     * @return BaseBackupPolicyResource properties
     * 
     */
    public Output<BackupPolicyResponse> properties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public Output<String> type() {
        return this.type;
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
        super("azure-native:dataprotection:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dataprotection:BackupPolicy", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dataprotection/v20210101:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20210201preview:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20210601preview:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20210701:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20211001preview:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20211201preview:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20220101:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20220201preview:BackupPolicy").build()),
                Output.of(Alias.builder().type("azure-native:dataprotection/v20220301:BackupPolicy").build())
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
