// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.inputs.AssetItemArgs;
import com.pulumi.azurenative.machinelearning.inputs.BlobLocationArgs;
import com.pulumi.azurenative.machinelearning.inputs.CommitmentPlanArgs;
import com.pulumi.azurenative.machinelearning.inputs.DiagnosticsConfigurationArgs;
import com.pulumi.azurenative.machinelearning.inputs.ExampleRequestArgs;
import com.pulumi.azurenative.machinelearning.inputs.GraphPackageArgs;
import com.pulumi.azurenative.machinelearning.inputs.MachineLearningWorkspaceArgs;
import com.pulumi.azurenative.machinelearning.inputs.RealtimeConfigurationArgs;
import com.pulumi.azurenative.machinelearning.inputs.ServiceInputOutputSpecificationArgs;
import com.pulumi.azurenative.machinelearning.inputs.StorageAccountArgs;
import com.pulumi.azurenative.machinelearning.inputs.WebServiceKeysArgs;
import com.pulumi.azurenative.machinelearning.inputs.WebServiceParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to a Graph based web service.
 * 
 */
public final class WebServicePropertiesForGraphArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebServicePropertiesForGraphArgs Empty = new WebServicePropertiesForGraphArgs();

    /**
     * Contains user defined properties describing web service assets. Properties are expressed as Key/Value pairs.
     * 
     */
    @Import(name="assets")
    private @Nullable Output<Map<String,AssetItemArgs>> assets;

    public Optional<Output<Map<String,AssetItemArgs>>> assets() {
        return Optional.ofNullable(this.assets);
    }

    /**
     * Contains the commitment plan associated with this web service. Set at creation time. Once set, this value cannot be changed. Note: The commitment plan is not returned from calls to GET operations.
     * 
     */
    @Import(name="commitmentPlan")
    private @Nullable Output<CommitmentPlanArgs> commitmentPlan;

    public Optional<Output<CommitmentPlanArgs>> commitmentPlan() {
        return Optional.ofNullable(this.commitmentPlan);
    }

    /**
     * The description of the web service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Settings controlling the diagnostics traces collection for the web service.
     * 
     */
    @Import(name="diagnostics")
    private @Nullable Output<DiagnosticsConfigurationArgs> diagnostics;

    public Optional<Output<DiagnosticsConfigurationArgs>> diagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }

    /**
     * Defines sample input data for one or more of the service&#39;s inputs.
     * 
     */
    @Import(name="exampleRequest")
    private @Nullable Output<ExampleRequestArgs> exampleRequest;

    public Optional<Output<ExampleRequestArgs>> exampleRequest() {
        return Optional.ofNullable(this.exampleRequest);
    }

    /**
     * When set to true, sample data is included in the web service&#39;s swagger definition. The default value is true.
     * 
     */
    @Import(name="exposeSampleData")
    private @Nullable Output<Boolean> exposeSampleData;

    public Optional<Output<Boolean>> exposeSampleData() {
        return Optional.ofNullable(this.exposeSampleData);
    }

    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service&#39;s inputs. For more information, see the Swagger specification.
     * 
     */
    @Import(name="input")
    private @Nullable Output<ServiceInputOutputSpecificationArgs> input;

    public Optional<Output<ServiceInputOutputSpecificationArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Contains the web service provisioning keys. If you do not specify provisioning keys, the Azure Machine Learning system generates them for you. Note: The keys are not returned from calls to GET operations.
     * 
     */
    @Import(name="keys")
    private @Nullable Output<WebServiceKeysArgs> keys;

    public Optional<Output<WebServiceKeysArgs>> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * Specifies the Machine Learning workspace containing the experiment that is source for the web service.
     * 
     */
    @Import(name="machineLearningWorkspace")
    private @Nullable Output<MachineLearningWorkspaceArgs> machineLearningWorkspace;

    public Optional<Output<MachineLearningWorkspaceArgs>> machineLearningWorkspace() {
        return Optional.ofNullable(this.machineLearningWorkspace);
    }

    /**
     * Contains the Swagger 2.0 schema describing one or more of the web service&#39;s outputs. For more information, see the Swagger specification.
     * 
     */
    @Import(name="output")
    private @Nullable Output<ServiceInputOutputSpecificationArgs> output;

    public Optional<Output<ServiceInputOutputSpecificationArgs>> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * The definition of the graph package making up this web service.
     * 
     */
    @Import(name="package")
    private @Nullable Output<GraphPackageArgs> package_;

    public Optional<Output<GraphPackageArgs>> package_() {
        return Optional.ofNullable(this.package_);
    }

    /**
     * Specifies the package type. Valid values are Graph (Specifies a web service published through the Machine Learning Studio) and Code (Specifies a web service published using code such as Python). Note: Code is not supported at this time.
     * Expected value is &#39;Graph&#39;.
     * 
     */
    @Import(name="packageType", required=true)
    private Output<String> packageType;

    public Output<String> packageType() {
        return this.packageType;
    }

    /**
     * The set of global parameters values defined for the web service, given as a global parameter name to default value map. If no default value is specified, the parameter is considered to be required.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,WebServiceParameterArgs>> parameters;

    public Optional<Output<Map<String,WebServiceParameterArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * When set to true, indicates that the payload size is larger than 3 MB. Otherwise false. If the payload size exceed 3 MB, the payload is stored in a blob and the PayloadsLocation parameter contains the URI of the blob. Otherwise, this will be set to false and Assets, Input, Output, Package, Parameters, ExampleRequest are inline. The Payload sizes is determined by adding the size of the Assets, Input, Output, Package, Parameters, and the ExampleRequest.
     * 
     */
    @Import(name="payloadsInBlobStorage")
    private @Nullable Output<Boolean> payloadsInBlobStorage;

    public Optional<Output<Boolean>> payloadsInBlobStorage() {
        return Optional.ofNullable(this.payloadsInBlobStorage);
    }

    /**
     * The URI of the payload blob. This parameter contains a value only if the payloadsInBlobStorage parameter is set to true. Otherwise is set to null.
     * 
     */
    @Import(name="payloadsLocation")
    private @Nullable Output<BlobLocationArgs> payloadsLocation;

    public Optional<Output<BlobLocationArgs>> payloadsLocation() {
        return Optional.ofNullable(this.payloadsLocation);
    }

    /**
     * When set to true, indicates that the web service is read-only and can no longer be updated or patched, only removed. Default, is false. Note: Once set to true, you cannot change its value.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * Contains the configuration settings for the web service endpoint.
     * 
     */
    @Import(name="realtimeConfiguration")
    private @Nullable Output<RealtimeConfigurationArgs> realtimeConfiguration;

    public Optional<Output<RealtimeConfigurationArgs>> realtimeConfiguration() {
        return Optional.ofNullable(this.realtimeConfiguration);
    }

    /**
     * Specifies the storage account that Azure Machine Learning uses to store information about the web service. Only the name of the storage account is returned from calls to GET operations. When updating the storage account information, you must ensure that all necessary assets are available in the new storage account or calls to your web service will fail.
     * 
     */
    @Import(name="storageAccount")
    private @Nullable Output<StorageAccountArgs> storageAccount;

    public Optional<Output<StorageAccountArgs>> storageAccount() {
        return Optional.ofNullable(this.storageAccount);
    }

    /**
     * The title of the web service.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private WebServicePropertiesForGraphArgs() {}

    private WebServicePropertiesForGraphArgs(WebServicePropertiesForGraphArgs $) {
        this.assets = $.assets;
        this.commitmentPlan = $.commitmentPlan;
        this.description = $.description;
        this.diagnostics = $.diagnostics;
        this.exampleRequest = $.exampleRequest;
        this.exposeSampleData = $.exposeSampleData;
        this.input = $.input;
        this.keys = $.keys;
        this.machineLearningWorkspace = $.machineLearningWorkspace;
        this.output = $.output;
        this.package_ = $.package_;
        this.packageType = $.packageType;
        this.parameters = $.parameters;
        this.payloadsInBlobStorage = $.payloadsInBlobStorage;
        this.payloadsLocation = $.payloadsLocation;
        this.readOnly = $.readOnly;
        this.realtimeConfiguration = $.realtimeConfiguration;
        this.storageAccount = $.storageAccount;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebServicePropertiesForGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebServicePropertiesForGraphArgs $;

        public Builder() {
            $ = new WebServicePropertiesForGraphArgs();
        }

        public Builder(WebServicePropertiesForGraphArgs defaults) {
            $ = new WebServicePropertiesForGraphArgs(Objects.requireNonNull(defaults));
        }

        public Builder assets(@Nullable Output<Map<String,AssetItemArgs>> assets) {
            $.assets = assets;
            return this;
        }

        public Builder assets(Map<String,AssetItemArgs> assets) {
            return assets(Output.of(assets));
        }

        public Builder commitmentPlan(@Nullable Output<CommitmentPlanArgs> commitmentPlan) {
            $.commitmentPlan = commitmentPlan;
            return this;
        }

        public Builder commitmentPlan(CommitmentPlanArgs commitmentPlan) {
            return commitmentPlan(Output.of(commitmentPlan));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder diagnostics(@Nullable Output<DiagnosticsConfigurationArgs> diagnostics) {
            $.diagnostics = diagnostics;
            return this;
        }

        public Builder diagnostics(DiagnosticsConfigurationArgs diagnostics) {
            return diagnostics(Output.of(diagnostics));
        }

        public Builder exampleRequest(@Nullable Output<ExampleRequestArgs> exampleRequest) {
            $.exampleRequest = exampleRequest;
            return this;
        }

        public Builder exampleRequest(ExampleRequestArgs exampleRequest) {
            return exampleRequest(Output.of(exampleRequest));
        }

        public Builder exposeSampleData(@Nullable Output<Boolean> exposeSampleData) {
            $.exposeSampleData = exposeSampleData;
            return this;
        }

        public Builder exposeSampleData(Boolean exposeSampleData) {
            return exposeSampleData(Output.of(exposeSampleData));
        }

        public Builder input(@Nullable Output<ServiceInputOutputSpecificationArgs> input) {
            $.input = input;
            return this;
        }

        public Builder input(ServiceInputOutputSpecificationArgs input) {
            return input(Output.of(input));
        }

        public Builder keys(@Nullable Output<WebServiceKeysArgs> keys) {
            $.keys = keys;
            return this;
        }

        public Builder keys(WebServiceKeysArgs keys) {
            return keys(Output.of(keys));
        }

        public Builder machineLearningWorkspace(@Nullable Output<MachineLearningWorkspaceArgs> machineLearningWorkspace) {
            $.machineLearningWorkspace = machineLearningWorkspace;
            return this;
        }

        public Builder machineLearningWorkspace(MachineLearningWorkspaceArgs machineLearningWorkspace) {
            return machineLearningWorkspace(Output.of(machineLearningWorkspace));
        }

        public Builder output(@Nullable Output<ServiceInputOutputSpecificationArgs> output) {
            $.output = output;
            return this;
        }

        public Builder output(ServiceInputOutputSpecificationArgs output) {
            return output(Output.of(output));
        }

        public Builder package_(@Nullable Output<GraphPackageArgs> package_) {
            $.package_ = package_;
            return this;
        }

        public Builder package_(GraphPackageArgs package_) {
            return package_(Output.of(package_));
        }

        public Builder packageType(Output<String> packageType) {
            $.packageType = packageType;
            return this;
        }

        public Builder packageType(String packageType) {
            return packageType(Output.of(packageType));
        }

        public Builder parameters(@Nullable Output<Map<String,WebServiceParameterArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,WebServiceParameterArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder payloadsInBlobStorage(@Nullable Output<Boolean> payloadsInBlobStorage) {
            $.payloadsInBlobStorage = payloadsInBlobStorage;
            return this;
        }

        public Builder payloadsInBlobStorage(Boolean payloadsInBlobStorage) {
            return payloadsInBlobStorage(Output.of(payloadsInBlobStorage));
        }

        public Builder payloadsLocation(@Nullable Output<BlobLocationArgs> payloadsLocation) {
            $.payloadsLocation = payloadsLocation;
            return this;
        }

        public Builder payloadsLocation(BlobLocationArgs payloadsLocation) {
            return payloadsLocation(Output.of(payloadsLocation));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder realtimeConfiguration(@Nullable Output<RealtimeConfigurationArgs> realtimeConfiguration) {
            $.realtimeConfiguration = realtimeConfiguration;
            return this;
        }

        public Builder realtimeConfiguration(RealtimeConfigurationArgs realtimeConfiguration) {
            return realtimeConfiguration(Output.of(realtimeConfiguration));
        }

        public Builder storageAccount(@Nullable Output<StorageAccountArgs> storageAccount) {
            $.storageAccount = storageAccount;
            return this;
        }

        public Builder storageAccount(StorageAccountArgs storageAccount) {
            return storageAccount(Output.of(storageAccount));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public WebServicePropertiesForGraphArgs build() {
            $.packageType = Codegen.stringProp("packageType").output().arg($.packageType).require();
            return $;
        }
    }

}
