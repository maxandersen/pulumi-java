// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.DatabaseSecurityAlertPolicyArgs;
import com.pulumi.azurenative.sql.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A database security alert policy.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:DatabaseSecurityAlertPolicy default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/securityalert-4799/providers/Microsoft.Sql/servers/securityalert-6440/databases/testdb 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:DatabaseSecurityAlertPolicy")
public class DatabaseSecurityAlertPolicy extends CustomResource {
    /**
     * Specifies the UTC creation time of the policy.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Specifies the UTC creation time of the policy.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force
     * 
     */
    @Export(name="disabledAlerts", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> disabledAlerts;

    /**
     * @return Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly, Data_Exfiltration, Unsafe_Action, Brute_Force
     * 
     */
    public Output<Optional<List<String>>> disabledAlerts() {
        return Codegen.optional(this.disabledAlerts);
    }
    /**
     * Specifies that the alert is sent to the account administrators.
     * 
     */
    @Export(name="emailAccountAdmins", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> emailAccountAdmins;

    /**
     * @return Specifies that the alert is sent to the account administrators.
     * 
     */
    public Output<Optional<Boolean>> emailAccountAdmins() {
        return Codegen.optional(this.emailAccountAdmins);
    }
    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    @Export(name="emailAddresses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> emailAddresses;

    /**
     * @return Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    public Output<Optional<List<String>>> emailAddresses() {
        return Codegen.optional(this.emailAddresses);
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
     * Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    @Export(name="retentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionDays;

    /**
     * @return Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    public Output<Optional<Integer>> retentionDays() {
        return Codegen.optional(this.retentionDays);
    }
    /**
     * Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific database.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Specifies the state of the policy, whether it is enabled or disabled or a policy has not been applied yet on the specific database.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    @Export(name="storageAccountAccessKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountAccessKey;

    /**
     * @return Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    public Output<Optional<String>> storageAccountAccessKey() {
        return Codegen.optional(this.storageAccountAccessKey);
    }
    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    @Export(name="storageEndpoint", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageEndpoint;

    /**
     * @return Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    public Output<Optional<String>> storageEndpoint() {
        return Codegen.optional(this.storageEndpoint);
    }
    /**
     * SystemData of SecurityAlertPolicyResource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return SystemData of SecurityAlertPolicyResource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public DatabaseSecurityAlertPolicy(String name) {
        this(name, DatabaseSecurityAlertPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseSecurityAlertPolicy(String name, DatabaseSecurityAlertPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseSecurityAlertPolicy(String name, DatabaseSecurityAlertPolicyArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:DatabaseSecurityAlertPolicy", name, args == null ? DatabaseSecurityAlertPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseSecurityAlertPolicy(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:sql:DatabaseSecurityAlertPolicy", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20140401:DatabaseSecurityAlertPolicy").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20180601preview:DatabaseSecurityAlertPolicy").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:DatabaseSecurityAlertPolicy").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:DatabaseSecurityAlertPolicy").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:DatabaseSecurityAlertPolicy").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:DatabaseSecurityAlertPolicy").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:DatabaseSecurityAlertPolicy").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:DatabaseSecurityAlertPolicy").build())
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
    public static DatabaseSecurityAlertPolicy get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DatabaseSecurityAlertPolicy(name, id, options);
    }
}
