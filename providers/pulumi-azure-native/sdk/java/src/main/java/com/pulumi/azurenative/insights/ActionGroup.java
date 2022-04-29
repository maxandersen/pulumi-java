// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.ActionGroupArgs;
import com.pulumi.azurenative.insights.outputs.ArmRoleReceiverResponse;
import com.pulumi.azurenative.insights.outputs.AutomationRunbookReceiverResponse;
import com.pulumi.azurenative.insights.outputs.AzureAppPushReceiverResponse;
import com.pulumi.azurenative.insights.outputs.AzureFunctionReceiverResponse;
import com.pulumi.azurenative.insights.outputs.EmailReceiverResponse;
import com.pulumi.azurenative.insights.outputs.ItsmReceiverResponse;
import com.pulumi.azurenative.insights.outputs.LogicAppReceiverResponse;
import com.pulumi.azurenative.insights.outputs.SmsReceiverResponse;
import com.pulumi.azurenative.insights.outputs.VoiceReceiverResponse;
import com.pulumi.azurenative.insights.outputs.WebhookReceiverResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An action group resource.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:ActionGroup SampleActionGroup /subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/Default-NotificationRules/providers/microsoft.insights/actionGroups/SampleActionGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ActionGroup")
public class ActionGroup extends CustomResource {
    /**
     * The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
     * 
     */
    @Export(name="armRoleReceivers", type=List.class, parameters={ArmRoleReceiverResponse.class})
    private Output</* @Nullable */ List<ArmRoleReceiverResponse>> armRoleReceivers;

    /**
     * @return The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
     * 
     */
    public Output<Optional<List<ArmRoleReceiverResponse>>> armRoleReceivers() {
        return Codegen.optional(this.armRoleReceivers);
    }
    /**
     * The list of AutomationRunbook receivers that are part of this action group.
     * 
     */
    @Export(name="automationRunbookReceivers", type=List.class, parameters={AutomationRunbookReceiverResponse.class})
    private Output</* @Nullable */ List<AutomationRunbookReceiverResponse>> automationRunbookReceivers;

    /**
     * @return The list of AutomationRunbook receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<AutomationRunbookReceiverResponse>>> automationRunbookReceivers() {
        return Codegen.optional(this.automationRunbookReceivers);
    }
    /**
     * The list of AzureAppPush receivers that are part of this action group.
     * 
     */
    @Export(name="azureAppPushReceivers", type=List.class, parameters={AzureAppPushReceiverResponse.class})
    private Output</* @Nullable */ List<AzureAppPushReceiverResponse>> azureAppPushReceivers;

    /**
     * @return The list of AzureAppPush receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<AzureAppPushReceiverResponse>>> azureAppPushReceivers() {
        return Codegen.optional(this.azureAppPushReceivers);
    }
    /**
     * The list of azure function receivers that are part of this action group.
     * 
     */
    @Export(name="azureFunctionReceivers", type=List.class, parameters={AzureFunctionReceiverResponse.class})
    private Output</* @Nullable */ List<AzureFunctionReceiverResponse>> azureFunctionReceivers;

    /**
     * @return The list of azure function receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<AzureFunctionReceiverResponse>>> azureFunctionReceivers() {
        return Codegen.optional(this.azureFunctionReceivers);
    }
    /**
     * The list of email receivers that are part of this action group.
     * 
     */
    @Export(name="emailReceivers", type=List.class, parameters={EmailReceiverResponse.class})
    private Output</* @Nullable */ List<EmailReceiverResponse>> emailReceivers;

    /**
     * @return The list of email receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<EmailReceiverResponse>>> emailReceivers() {
        return Codegen.optional(this.emailReceivers);
    }
    /**
     * Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The short name of the action group. This will be used in SMS messages.
     * 
     */
    @Export(name="groupShortName", type=String.class, parameters={})
    private Output<String> groupShortName;

    /**
     * @return The short name of the action group. This will be used in SMS messages.
     * 
     */
    public Output<String> groupShortName() {
        return this.groupShortName;
    }
    /**
     * Azure resource identity
     * 
     */
    @Export(name="identity", type=String.class, parameters={})
    private Output<String> identity;

    /**
     * @return Azure resource identity
     * 
     */
    public Output<String> identity() {
        return this.identity;
    }
    /**
     * The list of ITSM receivers that are part of this action group.
     * 
     */
    @Export(name="itsmReceivers", type=List.class, parameters={ItsmReceiverResponse.class})
    private Output</* @Nullable */ List<ItsmReceiverResponse>> itsmReceivers;

    /**
     * @return The list of ITSM receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<ItsmReceiverResponse>>> itsmReceivers() {
        return Codegen.optional(this.itsmReceivers);
    }
    /**
     * Azure resource kind
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Azure resource kind
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
     * The list of logic app receivers that are part of this action group.
     * 
     */
    @Export(name="logicAppReceivers", type=List.class, parameters={LogicAppReceiverResponse.class})
    private Output</* @Nullable */ List<LogicAppReceiverResponse>> logicAppReceivers;

    /**
     * @return The list of logic app receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<LogicAppReceiverResponse>>> logicAppReceivers() {
        return Codegen.optional(this.logicAppReceivers);
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of SMS receivers that are part of this action group.
     * 
     */
    @Export(name="smsReceivers", type=List.class, parameters={SmsReceiverResponse.class})
    private Output</* @Nullable */ List<SmsReceiverResponse>> smsReceivers;

    /**
     * @return The list of SMS receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<SmsReceiverResponse>>> smsReceivers() {
        return Codegen.optional(this.smsReceivers);
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
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The list of voice receivers that are part of this action group.
     * 
     */
    @Export(name="voiceReceivers", type=List.class, parameters={VoiceReceiverResponse.class})
    private Output</* @Nullable */ List<VoiceReceiverResponse>> voiceReceivers;

    /**
     * @return The list of voice receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<VoiceReceiverResponse>>> voiceReceivers() {
        return Codegen.optional(this.voiceReceivers);
    }
    /**
     * The list of webhook receivers that are part of this action group.
     * 
     */
    @Export(name="webhookReceivers", type=List.class, parameters={WebhookReceiverResponse.class})
    private Output</* @Nullable */ List<WebhookReceiverResponse>> webhookReceivers;

    /**
     * @return The list of webhook receivers that are part of this action group.
     * 
     */
    public Output<Optional<List<WebhookReceiverResponse>>> webhookReceivers() {
        return Codegen.optional(this.webhookReceivers);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActionGroup(String name) {
        this(name, ActionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionGroup(String name, ActionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionGroup(String name, ActionGroupArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:insights:ActionGroup", name, args == null ? ActionGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionGroup(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:insights:ActionGroup", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20170401:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20180301:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20180901:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20190301:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20190601:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210901:ActionGroup").build())
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
    public static ActionGroup get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ActionGroup(name, id, options);
    }
}
