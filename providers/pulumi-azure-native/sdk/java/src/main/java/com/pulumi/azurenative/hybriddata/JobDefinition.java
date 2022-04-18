// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hybriddata.JobDefinitionArgs;
import com.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import com.pulumi.azurenative.hybriddata.outputs.ScheduleResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Job Definition.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:hybriddata:JobDefinition jobdeffromtestcode1 /subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataServices/DataTransformation/jobDefinitions/jobdeffromtestcode1 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybriddata:JobDefinition")
public class JobDefinition extends com.pulumi.resources.CustomResource {
    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    @Export(name="customerSecrets", type=List.class, parameters={CustomerSecretResponse.class})
    private Output</* @Nullable */ List<CustomerSecretResponse>> customerSecrets;

    /**
     * @return List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    public Output</* @Nullable */ List<CustomerSecretResponse>> customerSecrets() {
        return this.customerSecrets;
    }
    /**
     * A generic json used differently by each data service type.
     * 
     */
    @Export(name="dataServiceInput", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> dataServiceInput;

    /**
     * @return A generic json used differently by each data service type.
     * 
     */
    public Output</* @Nullable */ Object> dataServiceInput() {
        return this.dataServiceInput;
    }
    /**
     * Data Sink Id associated to the job definition.
     * 
     */
    @Export(name="dataSinkId", type=String.class, parameters={})
    private Output<String> dataSinkId;

    /**
     * @return Data Sink Id associated to the job definition.
     * 
     */
    public Output<String> dataSinkId() {
        return this.dataSinkId;
    }
    /**
     * Data Source Id associated to the job definition.
     * 
     */
    @Export(name="dataSourceId", type=String.class, parameters={})
    private Output<String> dataSourceId;

    /**
     * @return Data Source Id associated to the job definition.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Last modified time of the job definition.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    /**
     * @return Last modified time of the job definition.
     * 
     */
    public Output</* @Nullable */ String> lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Name of the object.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the object.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * This is the preferred geo location for the job to run.
     * 
     */
    @Export(name="runLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> runLocation;

    /**
     * @return This is the preferred geo location for the job to run.
     * 
     */
    public Output</* @Nullable */ String> runLocation() {
        return this.runLocation;
    }
    /**
     * Schedule for running the job definition
     * 
     */
    @Export(name="schedules", type=List.class, parameters={ScheduleResponse.class})
    private Output</* @Nullable */ List<ScheduleResponse>> schedules;

    /**
     * @return Schedule for running the job definition
     * 
     */
    public Output</* @Nullable */ List<ScheduleResponse>> schedules() {
        return this.schedules;
    }
    /**
     * State of the job definition.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the job definition.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
     */
    @Export(name="userConfirmation", type=String.class, parameters={})
    private Output</* @Nullable */ String> userConfirmation;

    /**
     * @return Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
     */
    public Output</* @Nullable */ String> userConfirmation() {
        return this.userConfirmation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobDefinition(String name) {
        this(name, JobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobDefinition(String name, JobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobDefinition(String name, JobDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:JobDefinition", name, args == null ? JobDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobDefinition(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:JobDefinition", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybriddata/v20160601:JobDefinition").build()),
                Output.of(Alias.builder().type("azure-native:hybriddata/v20190601:JobDefinition").build())
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
    public static JobDefinition get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobDefinition(name, id, options);
    }
}
