// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.notebooks_v1.inputs.DataprocParametersResponse;
import io.pulumi.googlenative.notebooks_v1.inputs.SchedulerAcceleratorConfigResponse;
import io.pulumi.googlenative.notebooks_v1.inputs.VertexAIParametersResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The description a notebook execution workload.
 * 
 */
public final class ExecutionTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecutionTemplateResponse Empty = new ExecutionTemplateResponse();

    /**
     * Configuration (count and accelerator type) for hardware running notebook execution.
     * 
     */
    @Import(name="acceleratorConfig", required=true)
      private final SchedulerAcceleratorConfigResponse acceleratorConfig;

    public SchedulerAcceleratorConfigResponse acceleratorConfig() {
        return this.acceleratorConfig;
    }

    /**
     * Container Image URI to a DLVM Example: 'gcr.io/deeplearning-platform-release/base-cu100' More examples can be found at: https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
     * 
     */
    @Import(name="containerImageUri", required=true)
      private final String containerImageUri;

    public String containerImageUri() {
        return this.containerImageUri;
    }

    /**
     * Parameters used in Dataproc JobType executions.
     * 
     */
    @Import(name="dataprocParameters", required=true)
      private final DataprocParametersResponse dataprocParameters;

    public DataprocParametersResponse dataprocParameters() {
        return this.dataprocParameters;
    }

    /**
     * Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
     * 
     */
    @Import(name="inputNotebookFile", required=true)
      private final String inputNotebookFile;

    public String inputNotebookFile() {
        return this.inputNotebookFile;
    }

    /**
     * The type of Job to be used on this execution.
     * 
     */
    @Import(name="jobType", required=true)
      private final String jobType;

    public String jobType() {
        return this.jobType;
    }

    /**
     * Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file.
     * 
     */
    @Import(name="kernelSpec", required=true)
      private final String kernelSpec;

    public String kernelSpec() {
        return this.kernelSpec;
    }

    /**
     * Labels for execution. If execution is scheduled, a field included will be 'nbs-scheduled'. Otherwise, it is an immediate execution, and an included field will be 'nbs-immediate'. Use fields to efficiently index between various types of executions.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` - `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` - `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
     * 
     */
    @Import(name="masterType", required=true)
      private final String masterType;

    public String masterType() {
        return this.masterType;
    }

    /**
     * Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks`
     * 
     */
    @Import(name="outputNotebookFolder", required=true)
      private final String outputNotebookFolder;

    public String outputNotebookFolder() {
        return this.outputNotebookFolder;
    }

    /**
     * Parameters used within the 'input_notebook_file' notebook.
     * 
     */
    @Import(name="parameters", required=true)
      private final String parameters;

    public String parameters() {
        return this.parameters;
    }

    /**
     * Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
     * 
     */
    @Import(name="paramsYamlFile", required=true)
      private final String paramsYamlFile;

    public String paramsYamlFile() {
        return this.paramsYamlFile;
    }

    /**
     * The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Parameters used in Vertex AI JobType executions.
     * 
     */
    @Import(name="vertexAiParameters", required=true)
      private final VertexAIParametersResponse vertexAiParameters;

    public VertexAIParametersResponse vertexAiParameters() {
        return this.vertexAiParameters;
    }

    public ExecutionTemplateResponse(
        SchedulerAcceleratorConfigResponse acceleratorConfig,
        String containerImageUri,
        DataprocParametersResponse dataprocParameters,
        String inputNotebookFile,
        String jobType,
        String kernelSpec,
        Map<String,String> labels,
        String masterType,
        String outputNotebookFolder,
        String parameters,
        String paramsYamlFile,
        String serviceAccount,
        VertexAIParametersResponse vertexAiParameters) {
        this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig, "expected parameter 'acceleratorConfig' to be non-null");
        this.containerImageUri = Objects.requireNonNull(containerImageUri, "expected parameter 'containerImageUri' to be non-null");
        this.dataprocParameters = Objects.requireNonNull(dataprocParameters, "expected parameter 'dataprocParameters' to be non-null");
        this.inputNotebookFile = Objects.requireNonNull(inputNotebookFile, "expected parameter 'inputNotebookFile' to be non-null");
        this.jobType = Objects.requireNonNull(jobType, "expected parameter 'jobType' to be non-null");
        this.kernelSpec = Objects.requireNonNull(kernelSpec, "expected parameter 'kernelSpec' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.masterType = Objects.requireNonNull(masterType, "expected parameter 'masterType' to be non-null");
        this.outputNotebookFolder = Objects.requireNonNull(outputNotebookFolder, "expected parameter 'outputNotebookFolder' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.paramsYamlFile = Objects.requireNonNull(paramsYamlFile, "expected parameter 'paramsYamlFile' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.vertexAiParameters = Objects.requireNonNull(vertexAiParameters, "expected parameter 'vertexAiParameters' to be non-null");
    }

    private ExecutionTemplateResponse() {
        this.acceleratorConfig = null;
        this.containerImageUri = null;
        this.dataprocParameters = null;
        this.inputNotebookFile = null;
        this.jobType = null;
        this.kernelSpec = null;
        this.labels = Map.of();
        this.masterType = null;
        this.outputNotebookFolder = null;
        this.parameters = null;
        this.paramsYamlFile = null;
        this.serviceAccount = null;
        this.vertexAiParameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulerAcceleratorConfigResponse acceleratorConfig;
        private String containerImageUri;
        private DataprocParametersResponse dataprocParameters;
        private String inputNotebookFile;
        private String jobType;
        private String kernelSpec;
        private Map<String,String> labels;
        private String masterType;
        private String outputNotebookFolder;
        private String parameters;
        private String paramsYamlFile;
        private String serviceAccount;
        private VertexAIParametersResponse vertexAiParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImageUri = defaults.containerImageUri;
    	      this.dataprocParameters = defaults.dataprocParameters;
    	      this.inputNotebookFile = defaults.inputNotebookFile;
    	      this.jobType = defaults.jobType;
    	      this.kernelSpec = defaults.kernelSpec;
    	      this.labels = defaults.labels;
    	      this.masterType = defaults.masterType;
    	      this.outputNotebookFolder = defaults.outputNotebookFolder;
    	      this.parameters = defaults.parameters;
    	      this.paramsYamlFile = defaults.paramsYamlFile;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.vertexAiParameters = defaults.vertexAiParameters;
        }

        public Builder acceleratorConfig(SchedulerAcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }
        public Builder containerImageUri(String containerImageUri) {
            this.containerImageUri = Objects.requireNonNull(containerImageUri);
            return this;
        }
        public Builder dataprocParameters(DataprocParametersResponse dataprocParameters) {
            this.dataprocParameters = Objects.requireNonNull(dataprocParameters);
            return this;
        }
        public Builder inputNotebookFile(String inputNotebookFile) {
            this.inputNotebookFile = Objects.requireNonNull(inputNotebookFile);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder kernelSpec(String kernelSpec) {
            this.kernelSpec = Objects.requireNonNull(kernelSpec);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder masterType(String masterType) {
            this.masterType = Objects.requireNonNull(masterType);
            return this;
        }
        public Builder outputNotebookFolder(String outputNotebookFolder) {
            this.outputNotebookFolder = Objects.requireNonNull(outputNotebookFolder);
            return this;
        }
        public Builder parameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder paramsYamlFile(String paramsYamlFile) {
            this.paramsYamlFile = Objects.requireNonNull(paramsYamlFile);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder vertexAiParameters(VertexAIParametersResponse vertexAiParameters) {
            this.vertexAiParameters = Objects.requireNonNull(vertexAiParameters);
            return this;
        }        public ExecutionTemplateResponse build() {
            return new ExecutionTemplateResponse(acceleratorConfig, containerImageUri, dataprocParameters, inputNotebookFile, jobType, kernelSpec, labels, masterType, outputNotebookFolder, parameters, paramsYamlFile, serviceAccount, vertexAiParameters);
        }
    }
}
