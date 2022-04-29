// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.iotsecurity;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.iotsecurity.DefenderSettingArgs;
import com.pulumi.azurenative.iotsecurity.outputs.DefenderSettingsPropertiesResponseMdeIntegration;
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
import javax.annotation.Nullable;

/**
 * IoT Defender settings
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:iotsecurity:DefenderSetting default /subscriptions/{subscriptionId}/providers/Microsoft.IoTSecurity/defenderSettings/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:iotsecurity:DefenderSetting")
public class DefenderSetting extends CustomResource {
    /**
     * Size of the device quota. Value is required to be in multiples of 100.
     * 
     */
    @Export(name="deviceQuota", type=Integer.class, parameters={})
    private Output<Integer> deviceQuota;

    /**
     * @return Size of the device quota. Value is required to be in multiples of 100.
     * 
     */
    public Output<Integer> deviceQuota() {
        return this.deviceQuota;
    }
    /**
     * End time of the evaluation period, if such exist
     * 
     */
    @Export(name="evaluationEndTime", type=String.class, parameters={})
    private Output<String> evaluationEndTime;

    /**
     * @return End time of the evaluation period, if such exist
     * 
     */
    public Output<String> evaluationEndTime() {
        return this.evaluationEndTime;
    }
    /**
     * MDE integration configuration
     * 
     */
    @Export(name="mdeIntegration", type=DefenderSettingsPropertiesResponseMdeIntegration.class, parameters={})
    private Output<DefenderSettingsPropertiesResponseMdeIntegration> mdeIntegration;

    /**
     * @return MDE integration configuration
     * 
     */
    public Output<DefenderSettingsPropertiesResponseMdeIntegration> mdeIntegration() {
        return this.mdeIntegration;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The kind of onboarding for the subscription
     * 
     */
    @Export(name="onboardingKind", type=String.class, parameters={})
    private Output<String> onboardingKind;

    /**
     * @return The kind of onboarding for the subscription
     * 
     */
    public Output<String> onboardingKind() {
        return this.onboardingKind;
    }
    /**
     * Sentinel Workspace Resource Ids
     * 
     */
    @Export(name="sentinelWorkspaceResourceIds", type=List.class, parameters={String.class})
    private Output<List<String>> sentinelWorkspaceResourceIds;

    /**
     * @return Sentinel Workspace Resource Ids
     * 
     */
    public Output<List<String>> sentinelWorkspaceResourceIds() {
        return this.sentinelWorkspaceResourceIds;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefenderSetting(String name) {
        this(name, DefenderSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefenderSetting(String name, DefenderSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefenderSetting(String name, DefenderSettingArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:iotsecurity:DefenderSetting", name, args == null ? DefenderSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefenderSetting(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:iotsecurity:DefenderSetting", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:iotsecurity/v20210201preview:DefenderSetting").build())
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
    public static DefenderSetting get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DefenderSetting(name, id, options);
    }
}
