// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.AmlTokenResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.BanditPolicyResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ComputeConfigurationResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.JobEndpointResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.JobOutputResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ManagedIdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.MedianStoppingPolicyResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ObjectiveResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.TrialComponentResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.TruncationSelectionPolicyResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SweepJobResponse {
    /**
     * @return [Required] Type of the hyperparameter sampling algorithms
     * 
     */
    private final String algorithm;
    /**
     * @return [Required] Compute binding for the job.
     * 
     */
    private final ComputeConfigurationResponse compute;
    /**
     * @return The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Early termination policies enable canceling poor-performing runs before they complete.
     * 
     */
    private final @Nullable Object earlyTermination;
    /**
     * @return The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
     * 
     */
    private final @Nullable String experimentName;
    /**
     * @return Identity configuration. If set, this should be one of AmlToken, ManagedIdentity or null.
     * Defaults to AmlToken if null.
     * 
     */
    private final @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
    /**
     * @return List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     */
    private final Map<String,JobEndpointResponse> interactionEndpoints;
    /**
     * @return Enum to determine the type of job.
     * Expected value is &#39;Sweep&#39;.
     * 
     */
    private final String jobType;
    /**
     * @return An upper bound on the number of trials performed in parallel.
     * 
     */
    private final @Nullable Integer maxConcurrentTrials;
    /**
     * @return An upper bound on the number of trials to perform.
     * 
     */
    private final @Nullable Integer maxTotalTrials;
    /**
     * @return [Required] Optimization objective.
     * 
     */
    private final ObjectiveResponse objective;
    /**
     * @return Location of the job output logs and artifacts.
     * 
     */
    private final JobOutputResponse output;
    /**
     * @return Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * @return Specifies the job provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return [Required] A dictionary containing each parameter and its distribution. The dictionary key is the name of the parameter
     * 
     */
    private final Map<String,Object> searchSpace;
    /**
     * @return The status of a job.
     * 
     */
    private final String status;
    /**
     * @return Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The total timeout in ISO 8601 format. Only supports duration with precision as low as Minutes.
     * 
     */
    private final @Nullable String timeout;
    /**
     * @return Trial component definition.
     * 
     */
    private final @Nullable TrialComponentResponse trial;

    @CustomType.Constructor
    private SweepJobResponse(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("compute") ComputeConfigurationResponse compute,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("earlyTermination") @Nullable Object earlyTermination,
        @CustomType.Parameter("experimentName") @Nullable String experimentName,
        @CustomType.Parameter("identity") @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity,
        @CustomType.Parameter("interactionEndpoints") Map<String,JobEndpointResponse> interactionEndpoints,
        @CustomType.Parameter("jobType") String jobType,
        @CustomType.Parameter("maxConcurrentTrials") @Nullable Integer maxConcurrentTrials,
        @CustomType.Parameter("maxTotalTrials") @Nullable Integer maxTotalTrials,
        @CustomType.Parameter("objective") ObjectiveResponse objective,
        @CustomType.Parameter("output") JobOutputResponse output,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("searchSpace") Map<String,Object> searchSpace,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("timeout") @Nullable String timeout,
        @CustomType.Parameter("trial") @Nullable TrialComponentResponse trial) {
        this.algorithm = algorithm;
        this.compute = compute;
        this.description = description;
        this.earlyTermination = earlyTermination;
        this.experimentName = experimentName;
        this.identity = identity;
        this.interactionEndpoints = interactionEndpoints;
        this.jobType = jobType;
        this.maxConcurrentTrials = maxConcurrentTrials;
        this.maxTotalTrials = maxTotalTrials;
        this.objective = objective;
        this.output = output;
        this.priority = priority;
        this.properties = properties;
        this.provisioningState = provisioningState;
        this.searchSpace = searchSpace;
        this.status = status;
        this.tags = tags;
        this.timeout = timeout;
        this.trial = trial;
    }

    /**
     * @return [Required] Type of the hyperparameter sampling algorithms
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return [Required] Compute binding for the job.
     * 
     */
    public ComputeConfigurationResponse compute() {
        return this.compute;
    }
    /**
     * @return The asset description text.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Early termination policies enable canceling poor-performing runs before they complete.
     * 
     */
    public Optional<Object> earlyTermination() {
        return Optional.ofNullable(this.earlyTermination);
    }
    /**
     * @return The name of the experiment the job belongs to. If not set, the job is placed in the &#34;Default&#34; experiment.
     * 
     */
    public Optional<String> experimentName() {
        return Optional.ofNullable(this.experimentName);
    }
    /**
     * @return Identity configuration. If set, this should be one of AmlToken, ManagedIdentity or null.
     * Defaults to AmlToken if null.
     * 
     */
    public Optional<Either<AmlTokenResponse,ManagedIdentityResponse>> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return List of JobEndpoints.
     * For local jobs, a job endpoint will have an endpoint value of FileStreamObject.
     * 
     */
    public Map<String,JobEndpointResponse> interactionEndpoints() {
        return this.interactionEndpoints;
    }
    /**
     * @return Enum to determine the type of job.
     * Expected value is &#39;Sweep&#39;.
     * 
     */
    public String jobType() {
        return this.jobType;
    }
    /**
     * @return An upper bound on the number of trials performed in parallel.
     * 
     */
    public Optional<Integer> maxConcurrentTrials() {
        return Optional.ofNullable(this.maxConcurrentTrials);
    }
    /**
     * @return An upper bound on the number of trials to perform.
     * 
     */
    public Optional<Integer> maxTotalTrials() {
        return Optional.ofNullable(this.maxTotalTrials);
    }
    /**
     * @return [Required] Optimization objective.
     * 
     */
    public ObjectiveResponse objective() {
        return this.objective;
    }
    /**
     * @return Location of the job output logs and artifacts.
     * 
     */
    public JobOutputResponse output() {
        return this.output;
    }
    /**
     * @return Job priority for scheduling policy. Only applies to AMLCompute.
     * Private preview feature and only available to users on the allow list.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The asset property dictionary.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return Specifies the job provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return [Required] A dictionary containing each parameter and its distribution. The dictionary key is the name of the parameter
     * 
     */
    public Map<String,Object> searchSpace() {
        return this.searchSpace;
    }
    /**
     * @return The status of a job.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The total timeout in ISO 8601 format. Only supports duration with precision as low as Minutes.
     * 
     */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * @return Trial component definition.
     * 
     */
    public Optional<TrialComponentResponse> trial() {
        return Optional.ofNullable(this.trial);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SweepJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private ComputeConfigurationResponse compute;
        private @Nullable String description;
        private @Nullable Object earlyTermination;
        private @Nullable String experimentName;
        private @Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity;
        private Map<String,JobEndpointResponse> interactionEndpoints;
        private String jobType;
        private @Nullable Integer maxConcurrentTrials;
        private @Nullable Integer maxTotalTrials;
        private ObjectiveResponse objective;
        private JobOutputResponse output;
        private @Nullable Integer priority;
        private @Nullable Map<String,String> properties;
        private String provisioningState;
        private Map<String,Object> searchSpace;
        private String status;
        private @Nullable Map<String,String> tags;
        private @Nullable String timeout;
        private @Nullable TrialComponentResponse trial;

        public Builder() {
    	      // Empty
        }

        public Builder(SweepJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.compute = defaults.compute;
    	      this.description = defaults.description;
    	      this.earlyTermination = defaults.earlyTermination;
    	      this.experimentName = defaults.experimentName;
    	      this.identity = defaults.identity;
    	      this.interactionEndpoints = defaults.interactionEndpoints;
    	      this.jobType = defaults.jobType;
    	      this.maxConcurrentTrials = defaults.maxConcurrentTrials;
    	      this.maxTotalTrials = defaults.maxTotalTrials;
    	      this.objective = defaults.objective;
    	      this.output = defaults.output;
    	      this.priority = defaults.priority;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.searchSpace = defaults.searchSpace;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.trial = defaults.trial;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder compute(ComputeConfigurationResponse compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder earlyTermination(@Nullable Object earlyTermination) {
            this.earlyTermination = earlyTermination;
            return this;
        }
        public Builder experimentName(@Nullable String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public Builder identity(@Nullable Either<AmlTokenResponse,ManagedIdentityResponse> identity) {
            this.identity = identity;
            return this;
        }
        public Builder interactionEndpoints(Map<String,JobEndpointResponse> interactionEndpoints) {
            this.interactionEndpoints = Objects.requireNonNull(interactionEndpoints);
            return this;
        }
        public Builder jobType(String jobType) {
            this.jobType = Objects.requireNonNull(jobType);
            return this;
        }
        public Builder maxConcurrentTrials(@Nullable Integer maxConcurrentTrials) {
            this.maxConcurrentTrials = maxConcurrentTrials;
            return this;
        }
        public Builder maxTotalTrials(@Nullable Integer maxTotalTrials) {
            this.maxTotalTrials = maxTotalTrials;
            return this;
        }
        public Builder objective(ObjectiveResponse objective) {
            this.objective = Objects.requireNonNull(objective);
            return this;
        }
        public Builder output(JobOutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder searchSpace(Map<String,Object> searchSpace) {
            this.searchSpace = Objects.requireNonNull(searchSpace);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder trial(@Nullable TrialComponentResponse trial) {
            this.trial = trial;
            return this;
        }        public SweepJobResponse build() {
            return new SweepJobResponse(algorithm, compute, description, earlyTermination, experimentName, identity, interactionEndpoints, jobType, maxConcurrentTrials, maxTotalTrials, objective, output, priority, properties, provisioningState, searchSpace, status, tags, timeout, trial);
        }
    }
}
