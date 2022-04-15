// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.VirtualMachineScaleSetVMRunCommandArgs;
import io.pulumi.azurenative.compute.outputs.RunCommandInputParameterResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineRunCommandInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineRunCommandScriptSourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Describes a Virtual Machine run command.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachineScaleSetVMRunCommand myRunCommand /subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachineScaleSets/myvmScaleSet/virtualMachines/0/runCommands/myRunCommand 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachineScaleSetVMRunCommand")
public class VirtualMachineScaleSetVMRunCommand extends io.pulumi.resources.CustomResource {
    /**
     * Optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     * 
     */
    @Export(name="asyncExecution", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> asyncExecution;

    /**
     * @return Optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     * 
     */
    public Output</* @Nullable */ Boolean> asyncExecution() {
        return this.asyncExecution;
    }
    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    @Export(name="errorBlobUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> errorBlobUri;

    /**
     * @return Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    public Output</* @Nullable */ String> errorBlobUri() {
        return this.errorBlobUri;
    }
    /**
     * The virtual machine run command instance view.
     * 
     */
    @Export(name="instanceView", type=VirtualMachineRunCommandInstanceViewResponse.class, parameters={})
    private Output<VirtualMachineRunCommandInstanceViewResponse> instanceView;

    /**
     * @return The virtual machine run command instance view.
     * 
     */
    public Output<VirtualMachineRunCommandInstanceViewResponse> instanceView() {
        return this.instanceView;
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
    /**
     * Specifies the Azure storage blob where script output stream will be uploaded.
     * 
     */
    @Export(name="outputBlobUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputBlobUri;

    /**
     * @return Specifies the Azure storage blob where script output stream will be uploaded.
     * 
     */
    public Output</* @Nullable */ String> outputBlobUri() {
        return this.outputBlobUri;
    }
    /**
     * The parameters used by the script.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={RunCommandInputParameterResponse.class})
    private Output</* @Nullable */ List<RunCommandInputParameterResponse>> parameters;

    /**
     * @return The parameters used by the script.
     * 
     */
    public Output</* @Nullable */ List<RunCommandInputParameterResponse>> parameters() {
        return this.parameters;
    }
    /**
     * The parameters used by the script.
     * 
     */
    @Export(name="protectedParameters", type=List.class, parameters={RunCommandInputParameterResponse.class})
    private Output</* @Nullable */ List<RunCommandInputParameterResponse>> protectedParameters;

    /**
     * @return The parameters used by the script.
     * 
     */
    public Output</* @Nullable */ List<RunCommandInputParameterResponse>> protectedParameters() {
        return this.protectedParameters;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Specifies the user account password on the VM when executing the run command.
     * 
     */
    @Export(name="runAsPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> runAsPassword;

    /**
     * @return Specifies the user account password on the VM when executing the run command.
     * 
     */
    public Output</* @Nullable */ String> runAsPassword() {
        return this.runAsPassword;
    }
    /**
     * Specifies the user account on the VM when executing the run command.
     * 
     */
    @Export(name="runAsUser", type=String.class, parameters={})
    private Output</* @Nullable */ String> runAsUser;

    /**
     * @return Specifies the user account on the VM when executing the run command.
     * 
     */
    public Output</* @Nullable */ String> runAsUser() {
        return this.runAsUser;
    }
    /**
     * The source of the run command script.
     * 
     */
    @Export(name="source", type=VirtualMachineRunCommandScriptSourceResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineRunCommandScriptSourceResponse> source;

    /**
     * @return The source of the run command script.
     * 
     */
    public Output</* @Nullable */ VirtualMachineRunCommandScriptSourceResponse> source() {
        return this.source;
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
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The timeout in seconds to execute the run command.
     * 
     */
    @Export(name="timeoutInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutInSeconds;

    /**
     * @return The timeout in seconds to execute the run command.
     * 
     */
    public Output</* @Nullable */ Integer> timeoutInSeconds() {
        return this.timeoutInSeconds;
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
    public VirtualMachineScaleSetVMRunCommand(String name) {
        this(name, VirtualMachineScaleSetVMRunCommandArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMachineScaleSetVMRunCommand(String name, VirtualMachineScaleSetVMRunCommandArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineScaleSetVMRunCommand(String name, VirtualMachineScaleSetVMRunCommandArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVMRunCommand", name, args == null ? VirtualMachineScaleSetVMRunCommandArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMachineScaleSetVMRunCommand(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVMRunCommand", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20200601:VirtualMachineScaleSetVMRunCommand").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:VirtualMachineScaleSetVMRunCommand").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210301:VirtualMachineScaleSetVMRunCommand").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:VirtualMachineScaleSetVMRunCommand").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210701:VirtualMachineScaleSetVMRunCommand").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211101:VirtualMachineScaleSetVMRunCommand").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualMachineScaleSetVMRunCommand get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineScaleSetVMRunCommand(name, id, options);
    }
}
