// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datapipelines_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Launch Flex Template parameter.
 * 
 */
public final class GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse Empty = new GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse();

    /**
     * Cloud Storage path to a file with a JSON-serialized ContainerSpec as content.
     * 
     */
    @Import(name="containerSpecGcsPath", required=true)
      private final String containerSpecGcsPath;

    public String containerSpecGcsPath() {
        return this.containerSpecGcsPath;
    }

    /**
     * The runtime environment for the Flex Template job.
     * 
     */
    @Import(name="environment", required=true)
      private final GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment;

    public GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment() {
        return this.environment;
    }

    /**
     * The job name to use for the created job. For an update job request, the job name should be the same as the existing running job.
     * 
     */
    @Import(name="jobName", required=true)
      private final String jobName;

    public String jobName() {
        return this.jobName;
    }

    /**
     * Launch options for this Flex Template job. This is a common set of options across languages and templates. This should not be used to pass job parameters.
     * 
     */
    @Import(name="launchOptions", required=true)
      private final Map<String,String> launchOptions;

    public Map<String,String> launchOptions() {
        return this.launchOptions;
    }

    /**
     * The parameters for the Flex Template. Example: `{"num_workers":"5"}`
     * 
     */
    @Import(name="parameters", required=true)
      private final Map<String,String> parameters;

    public Map<String,String> parameters() {
        return this.parameters;
    }

    /**
     * Use this to pass transform name mappings for streaming update jobs. Example: `{"oldTransformName":"newTransformName",...}`
     * 
     */
    @Import(name="transformNameMappings", required=true)
      private final Map<String,String> transformNameMappings;

    public Map<String,String> transformNameMappings() {
        return this.transformNameMappings;
    }

    /**
     * Set this to true if you are sending a request to update a running streaming job. When set, the job name should be the same as the running job.
     * 
     */
    @Import(name="update", required=true)
      private final Boolean update;

    public Boolean update() {
        return this.update;
    }

    public GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse(
        String containerSpecGcsPath,
        GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment,
        String jobName,
        Map<String,String> launchOptions,
        Map<String,String> parameters,
        Map<String,String> transformNameMappings,
        Boolean update) {
        this.containerSpecGcsPath = Objects.requireNonNull(containerSpecGcsPath, "expected parameter 'containerSpecGcsPath' to be non-null");
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.jobName = Objects.requireNonNull(jobName, "expected parameter 'jobName' to be non-null");
        this.launchOptions = Objects.requireNonNull(launchOptions, "expected parameter 'launchOptions' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.transformNameMappings = Objects.requireNonNull(transformNameMappings, "expected parameter 'transformNameMappings' to be non-null");
        this.update = Objects.requireNonNull(update, "expected parameter 'update' to be non-null");
    }

    private GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse() {
        this.containerSpecGcsPath = null;
        this.environment = null;
        this.jobName = null;
        this.launchOptions = Map.of();
        this.parameters = Map.of();
        this.transformNameMappings = Map.of();
        this.update = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerSpecGcsPath;
        private GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment;
        private String jobName;
        private Map<String,String> launchOptions;
        private Map<String,String> parameters;
        private Map<String,String> transformNameMappings;
        private Boolean update;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerSpecGcsPath = defaults.containerSpecGcsPath;
    	      this.environment = defaults.environment;
    	      this.jobName = defaults.jobName;
    	      this.launchOptions = defaults.launchOptions;
    	      this.parameters = defaults.parameters;
    	      this.transformNameMappings = defaults.transformNameMappings;
    	      this.update = defaults.update;
        }

        public Builder containerSpecGcsPath(String containerSpecGcsPath) {
            this.containerSpecGcsPath = Objects.requireNonNull(containerSpecGcsPath);
            return this;
        }
        public Builder environment(GoogleCloudDatapipelinesV1FlexTemplateRuntimeEnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder jobName(String jobName) {
            this.jobName = Objects.requireNonNull(jobName);
            return this;
        }
        public Builder launchOptions(Map<String,String> launchOptions) {
            this.launchOptions = Objects.requireNonNull(launchOptions);
            return this;
        }
        public Builder parameters(Map<String,String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder transformNameMappings(Map<String,String> transformNameMappings) {
            this.transformNameMappings = Objects.requireNonNull(transformNameMappings);
            return this;
        }
        public Builder update(Boolean update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }        public GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse build() {
            return new GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterResponse(containerSpecGcsPath, environment, jobName, launchOptions, parameters, transformNameMappings, update);
        }
    }
}
