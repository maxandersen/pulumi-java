// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AcceleratorConfigResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AutoScalingResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ContainerSpecResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ExplanationConfigResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ManualScalingResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__RequestLoggingConfigResponse;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__RouteMapResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Represents a version of the model. Each version is a trained model deployed in the cloud, ready to handle prediction requests. A model can have multiple versions. You can get information about all of the versions of a given model by calling projects.models.versions.list.
 * 
 */
public final class GoogleCloudMlV1__VersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__VersionResponse Empty = new GoogleCloudMlV1__VersionResponse();

    /**
     * Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType` field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
     * 
     */
    @Import(name="acceleratorConfig", required=true)
    private GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig;

    public GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig() {
        return this.acceleratorConfig;
    }

    /**
     * Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model&#39;s ability to scale or you will start seeing increases in latency and 429 response codes.
     * 
     */
    @Import(name="autoScaling", required=true)
    private GoogleCloudMlV1__AutoScalingResponse autoScaling;

    public GoogleCloudMlV1__AutoScalingResponse autoScaling() {
        return this.autoScaling;
    }

    /**
     * Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
     * 
     */
    @Import(name="container", required=true)
    private GoogleCloudMlV1__ContainerSpecResponse container;

    public GoogleCloudMlV1__ContainerSpecResponse container() {
        return this.container;
    }

    /**
     * The time the version was created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container, then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
     * 
     */
    @Import(name="deploymentUri", required=true)
    private String deploymentUri;

    public String deploymentUri() {
        return this.deploymentUri;
    }

    /**
     * Optional. The description specified for the version when it was created.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    /**
     * The details of a failure or a cancellation.
     * 
     */
    @Import(name="errorMessage", required=true)
    private String errorMessage;

    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Optional. Configures explainability features on the model&#39;s version. Some explanation features require additional metadata to be loaded as part of the model payload.
     * 
     */
    @Import(name="explanationConfig", required=true)
    private GoogleCloudMlV1__ExplanationConfigResponse explanationConfig;

    public GoogleCloudMlV1__ExplanationConfigResponse explanationConfig() {
        return this.explanationConfig;
    }

    /**
     * Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the model to 1.4 or greater. Do **not** specify a framework if you&#39;re deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you&#39;re using a [custom container](/ai-platform/prediction/docs/use-custom-container).
     * 
     */
    @Import(name="framework", required=true)
    private String framework;

    public String framework() {
        return this.framework;
    }

    /**
     * If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling projects.methods.versions.setDefault.
     * 
     */
    @Import(name="isDefault", required=true)
    private Boolean isDefault;

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * The [AI Platform (Unified) `Model`](https://cloud.google.com/ai-platform-unified/docs/reference/rest/v1beta1/projects.locations.models) ID for the last [model migration](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    @Import(name="lastMigrationModelId", required=true)
    private String lastMigrationModelId;

    public String lastMigrationModelId() {
        return this.lastMigrationModelId;
    }

    /**
     * The last time this version was successfully [migrated to AI Platform (Unified)](https://cloud.google.com/ai-platform-unified/docs/start/migrating-to-ai-platform-unified).
     * 
     */
    @Import(name="lastMigrationTime", required=true)
    private String lastMigrationTime;

    public String lastMigrationTime() {
        return this.lastMigrationTime;
    }

    /**
     * The time the version was last used for prediction.
     * 
     */
    @Import(name="lastUseTime", required=true)
    private String lastUseTime;

    public String lastUseTime() {
        return this.lastUseTime;
    }

    /**
     * Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. To learn about valid values for this field, read [Choosing a machine type for online prediction](/ai-platform/prediction/docs/machine-types-online-prediction). If this field is not specified and you are using a [regional endpoint](/ai-platform/prediction/docs/regional-endpoints), then the machine type defaults to `n1-standard-2`. If this field is not specified and you are using the global endpoint (`ml.googleapis.com`), then the machine type defaults to `mls1-c1-m2`.
     * 
     */
    @Import(name="machineType", required=true)
    private String machineType;

    public String machineType() {
        return this.machineType;
    }

    /**
     * Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of nodes.
     * 
     */
    @Import(name="manualScaling", required=true)
    private GoogleCloudMlV1__ManualScalingResponse manualScaling;

    public GoogleCloudMlV1__ManualScalingResponse manualScaling() {
        return this.manualScaling;
    }

    /**
     * The name specified for the version when it was created. The version name must be unique within the model it is created in.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater.
     * 
     */
    @Import(name="packageUris", required=true)
    private List<String> packageUris;

    public List<String> packageUris() {
        return this.packageUris;
    }

    /**
     * Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class Predictor(object): &#34;&#34;&#34;Interface for constructing custom predictors.&#34;&#34;&#34; def predict(self, instances, **kwargs): &#34;&#34;&#34;Performs custom prediction. Instances are the decoded values from the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. &#34;&#34;&#34; raise NotImplementedError() @classmethod def from_path(cls, model_dir): &#34;&#34;&#34;Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. &#34;&#34;&#34; raise NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
     * 
     */
    @Import(name="predictionClass", required=true)
    private String predictionClass;

    public String predictionClass() {
        return this.predictionClass;
    }

    /**
     * The version of Python used in prediction. The following Python versions are available: * Python &#39;3.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or later. * Python &#39;3.5&#39; is available when `runtime_version` is set to a version from &#39;1.4&#39; to &#39;1.14&#39;. * Python &#39;2.7&#39; is available when `runtime_version` is set to &#39;1.15&#39; or earlier. Read more about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
     * 
     */
    @Import(name="pythonVersion", required=true)
    private String pythonVersion;

    public String pythonVersion() {
        return this.pythonVersion;
    }

    /**
     * Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the request-response pair logging on predictions from this Version.
     * 
     */
    @Import(name="requestLoggingConfig", required=true)
    private GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig;

    public GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig() {
        return this.requestLoggingConfig;
    }

    /**
     * Optional. Specifies paths on a custom container&#39;s HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ``` json { &#34;predict&#34;: &#34;/v1/models/MODEL/versions/VERSION:predict&#34;, &#34;health&#34;: &#34;/v1/models/MODEL/versions/VERSION&#34; }  ``` See RouteMap for more details about these default values.
     * 
     */
    @Import(name="routes", required=true)
    private GoogleCloudMlV1__RouteMapResponse routes;

    public GoogleCloudMlV1__RouteMapResponse routes() {
        return this.routes;
    }

    /**
     * The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage runtime versions](/ml-engine/docs/versioning).
     * 
     */
    @Import(name="runtimeVersion", required=true)
    private String runtimeVersion;

    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field. Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
     * 
     */
    @Import(name="serviceAccount", required=true)
    private String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * The state of a version.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private GoogleCloudMlV1__VersionResponse() {}

    private GoogleCloudMlV1__VersionResponse(GoogleCloudMlV1__VersionResponse $) {
        this.acceleratorConfig = $.acceleratorConfig;
        this.autoScaling = $.autoScaling;
        this.container = $.container;
        this.createTime = $.createTime;
        this.deploymentUri = $.deploymentUri;
        this.description = $.description;
        this.errorMessage = $.errorMessage;
        this.etag = $.etag;
        this.explanationConfig = $.explanationConfig;
        this.framework = $.framework;
        this.isDefault = $.isDefault;
        this.labels = $.labels;
        this.lastMigrationModelId = $.lastMigrationModelId;
        this.lastMigrationTime = $.lastMigrationTime;
        this.lastUseTime = $.lastUseTime;
        this.machineType = $.machineType;
        this.manualScaling = $.manualScaling;
        this.name = $.name;
        this.packageUris = $.packageUris;
        this.predictionClass = $.predictionClass;
        this.pythonVersion = $.pythonVersion;
        this.requestLoggingConfig = $.requestLoggingConfig;
        this.routes = $.routes;
        this.runtimeVersion = $.runtimeVersion;
        this.serviceAccount = $.serviceAccount;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__VersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__VersionResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1__VersionResponse();
        }

        public Builder(GoogleCloudMlV1__VersionResponse defaults) {
            $ = new GoogleCloudMlV1__VersionResponse(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorConfig(GoogleCloudMlV1__AcceleratorConfigResponse acceleratorConfig) {
            $.acceleratorConfig = acceleratorConfig;
            return this;
        }

        public Builder autoScaling(GoogleCloudMlV1__AutoScalingResponse autoScaling) {
            $.autoScaling = autoScaling;
            return this;
        }

        public Builder container(GoogleCloudMlV1__ContainerSpecResponse container) {
            $.container = container;
            return this;
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder deploymentUri(String deploymentUri) {
            $.deploymentUri = deploymentUri;
            return this;
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder explanationConfig(GoogleCloudMlV1__ExplanationConfigResponse explanationConfig) {
            $.explanationConfig = explanationConfig;
            return this;
        }

        public Builder framework(String framework) {
            $.framework = framework;
            return this;
        }

        public Builder isDefault(Boolean isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public Builder lastMigrationModelId(String lastMigrationModelId) {
            $.lastMigrationModelId = lastMigrationModelId;
            return this;
        }

        public Builder lastMigrationTime(String lastMigrationTime) {
            $.lastMigrationTime = lastMigrationTime;
            return this;
        }

        public Builder lastUseTime(String lastUseTime) {
            $.lastUseTime = lastUseTime;
            return this;
        }

        public Builder machineType(String machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder manualScaling(GoogleCloudMlV1__ManualScalingResponse manualScaling) {
            $.manualScaling = manualScaling;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder packageUris(List<String> packageUris) {
            $.packageUris = packageUris;
            return this;
        }

        public Builder packageUris(String... packageUris) {
            return packageUris(List.of(packageUris));
        }

        public Builder predictionClass(String predictionClass) {
            $.predictionClass = predictionClass;
            return this;
        }

        public Builder pythonVersion(String pythonVersion) {
            $.pythonVersion = pythonVersion;
            return this;
        }

        public Builder requestLoggingConfig(GoogleCloudMlV1__RequestLoggingConfigResponse requestLoggingConfig) {
            $.requestLoggingConfig = requestLoggingConfig;
            return this;
        }

        public Builder routes(GoogleCloudMlV1__RouteMapResponse routes) {
            $.routes = routes;
            return this;
        }

        public Builder runtimeVersion(String runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public GoogleCloudMlV1__VersionResponse build() {
            $.acceleratorConfig = Objects.requireNonNull($.acceleratorConfig, "expected parameter 'acceleratorConfig' to be non-null");
            $.autoScaling = Objects.requireNonNull($.autoScaling, "expected parameter 'autoScaling' to be non-null");
            $.container = Objects.requireNonNull($.container, "expected parameter 'container' to be non-null");
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.deploymentUri = Objects.requireNonNull($.deploymentUri, "expected parameter 'deploymentUri' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.errorMessage = Objects.requireNonNull($.errorMessage, "expected parameter 'errorMessage' to be non-null");
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.explanationConfig = Objects.requireNonNull($.explanationConfig, "expected parameter 'explanationConfig' to be non-null");
            $.framework = Objects.requireNonNull($.framework, "expected parameter 'framework' to be non-null");
            $.isDefault = Objects.requireNonNull($.isDefault, "expected parameter 'isDefault' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.lastMigrationModelId = Objects.requireNonNull($.lastMigrationModelId, "expected parameter 'lastMigrationModelId' to be non-null");
            $.lastMigrationTime = Objects.requireNonNull($.lastMigrationTime, "expected parameter 'lastMigrationTime' to be non-null");
            $.lastUseTime = Objects.requireNonNull($.lastUseTime, "expected parameter 'lastUseTime' to be non-null");
            $.machineType = Objects.requireNonNull($.machineType, "expected parameter 'machineType' to be non-null");
            $.manualScaling = Objects.requireNonNull($.manualScaling, "expected parameter 'manualScaling' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.packageUris = Objects.requireNonNull($.packageUris, "expected parameter 'packageUris' to be non-null");
            $.predictionClass = Objects.requireNonNull($.predictionClass, "expected parameter 'predictionClass' to be non-null");
            $.pythonVersion = Objects.requireNonNull($.pythonVersion, "expected parameter 'pythonVersion' to be non-null");
            $.requestLoggingConfig = Objects.requireNonNull($.requestLoggingConfig, "expected parameter 'requestLoggingConfig' to be non-null");
            $.routes = Objects.requireNonNull($.routes, "expected parameter 'routes' to be non-null");
            $.runtimeVersion = Objects.requireNonNull($.runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
            $.serviceAccount = Objects.requireNonNull($.serviceAccount, "expected parameter 'serviceAccount' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
