// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.monitoring.AadDiagnosticSettingArgs;
import com.pulumi.azure.monitoring.inputs.AadDiagnosticSettingState;
import com.pulumi.azure.monitoring.outputs.AadDiagnosticSettingLog;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Active Directory Diagnostic Setting for Azure Monitor.
 * 
 * !&gt; **Authentication** The API for this resource does not support service principal authentication. This resource can only be used with Azure CLI authentication.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;west europe&#34;)
 *             .build());
 * 
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountKind(&#34;StorageV2&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleAadDiagnosticSetting = new AadDiagnosticSetting(&#34;exampleAadDiagnosticSetting&#34;, AadDiagnosticSettingArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .logs(            
 *                 AadDiagnosticSettingLog.builder()
 *                     .category(&#34;SignInLogs&#34;)
 *                     .enabled(true)
 *                     .retentionPolicy(AadDiagnosticSettingLogRetentionPolicy.builder()
 *                         .enabled(true)
 *                         .days(1)
 *                         .build())
 *                     .build(),
 *                 AadDiagnosticSettingLog.builder()
 *                     .category(&#34;AuditLogs&#34;)
 *                     .enabled(true)
 *                     .retentionPolicy(AadDiagnosticSettingLogRetentionPolicy.builder()
 *                         .enabled(true)
 *                         .days(1)
 *                         .build())
 *                     .build(),
 *                 AadDiagnosticSettingLog.builder()
 *                     .category(&#34;NonInteractiveUserSignInLogs&#34;)
 *                     .enabled(true)
 *                     .retentionPolicy(AadDiagnosticSettingLogRetentionPolicy.builder()
 *                         .enabled(true)
 *                         .days(1)
 *                         .build())
 *                     .build(),
 *                 AadDiagnosticSettingLog.builder()
 *                     .category(&#34;ServicePrincipalSignInLogs&#34;)
 *                     .enabled(true)
 *                     .retentionPolicy(AadDiagnosticSettingLogRetentionPolicy.builder()
 *                         .enabled(true)
 *                         .days(1)
 *                         .build())
 *                     .build(),
 *                 AadDiagnosticSettingLog.builder()
 *                     .category(&#34;ManagedIdentitySignInLogs&#34;)
 *                     .enabled(false)
 *                     .retentionPolicy()
 *                     .build(),
 *                 AadDiagnosticSettingLog.builder()
 *                     .category(&#34;ProvisioningLogs&#34;)
 *                     .enabled(false)
 *                     .retentionPolicy()
 *                     .build(),
 *                 AadDiagnosticSettingLog.builder()
 *                     .category(&#34;ADFSSignInLogs&#34;)
 *                     .enabled(false)
 *                     .retentionPolicy()
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Monitor Azure Active Directory Diagnostic Settings can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:monitoring/aadDiagnosticSetting:AadDiagnosticSetting example /providers/Microsoft.AADIAM/diagnosticSettings/setting1
 * ```
 * 
 */
@ResourceType(type="azure:monitoring/aadDiagnosticSetting:AadDiagnosticSetting")
public class AadDiagnosticSetting extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eventhubAuthorizationRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventhubAuthorizationRuleId;

    /**
     * @return Specifies the ID of an Event Hub Namespace Authorization Rule used to send Diagnostics Data. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> eventhubAuthorizationRuleId() {
        return Codegen.optional(this.eventhubAuthorizationRuleId);
    }
    /**
     * Specifies the name of the Event Hub where Diagnostics Data should be sent. If not specified, the default Event Hub will be used. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eventhubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventhubName;

    /**
     * @return Specifies the name of the Event Hub where Diagnostics Data should be sent. If not specified, the default Event Hub will be used. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> eventhubName() {
        return Codegen.optional(this.eventhubName);
    }
    /**
     * Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
     * 
     */
    @Export(name="logAnalyticsWorkspaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> logAnalyticsWorkspaceId;

    /**
     * @return Specifies the ID of a Log Analytics Workspace where Diagnostics Data should be sent.
     * 
     */
    public Output<Optional<String>> logAnalyticsWorkspaceId() {
        return Codegen.optional(this.logAnalyticsWorkspaceId);
    }
    /**
     * One or more `log` blocks as defined below.
     * 
     */
    @Export(name="logs", type=List.class, parameters={AadDiagnosticSettingLog.class})
    private Output<List<AadDiagnosticSettingLog>> logs;

    /**
     * @return One or more `log` blocks as defined below.
     * 
     */
    public Output<List<AadDiagnosticSettingLog>> logs() {
        return this.logs;
    }
    /**
     * The name which should be used for this Monitor Azure Active Directory Diagnostic Setting. Changing this forces a new Monitor Azure Active Directory Diagnostic Setting to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Monitor Azure Active Directory Diagnostic Setting. Changing this forces a new Monitor Azure Active Directory Diagnostic Setting to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Storage Account where logs should be sent. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return The ID of the Storage Account where logs should be sent. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> storageAccountId() {
        return Codegen.optional(this.storageAccountId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AadDiagnosticSetting(String name) {
        this(name, AadDiagnosticSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AadDiagnosticSetting(String name, AadDiagnosticSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AadDiagnosticSetting(String name, AadDiagnosticSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/aadDiagnosticSetting:AadDiagnosticSetting", name, args == null ? AadDiagnosticSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AadDiagnosticSetting(String name, Output<String> id, @Nullable AadDiagnosticSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/aadDiagnosticSetting:AadDiagnosticSetting", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AadDiagnosticSetting get(String name, Output<String> id, @Nullable AadDiagnosticSettingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AadDiagnosticSetting(name, id, state, options);
    }
}
