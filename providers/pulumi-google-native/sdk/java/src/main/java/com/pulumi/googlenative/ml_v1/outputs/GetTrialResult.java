// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_Trial_ParameterResponse;
import com.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__MeasurementResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTrialResult {
    /**
     * The identifier of the client that originally requested this trial.
     * 
     */
    private final String clientId;
    /**
     * Time at which the trial&#39;s status changed to COMPLETED.
     * 
     */
    private final String endTime;
    /**
     * The final measurement containing the objective value.
     * 
     */
    private final GoogleCloudMlV1__MeasurementResponse finalMeasurement;
    /**
     * A human readable string describing why the trial is infeasible. This should only be set if trial_infeasible is true.
     * 
     */
    private final String infeasibleReason;
    /**
     * A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
     * 
     */
    private final List<GoogleCloudMlV1__MeasurementResponse> measurements;
    /**
     * Name of the trial assigned by the service.
     * 
     */
    private final String name;
    /**
     * The parameters of the trial.
     * 
     */
    private final List<GoogleCloudMlV1_Trial_ParameterResponse> parameters;
    /**
     * Time at which the trial was started.
     * 
     */
    private final String startTime;
    /**
     * The detailed state of a trial.
     * 
     */
    private final String state;
    /**
     * If true, the parameters in this trial are not attempted again.
     * 
     */
    private final Boolean trialInfeasible;

    @CustomType.Constructor
    private GetTrialResult(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("finalMeasurement") GoogleCloudMlV1__MeasurementResponse finalMeasurement,
        @CustomType.Parameter("infeasibleReason") String infeasibleReason,
        @CustomType.Parameter("measurements") List<GoogleCloudMlV1__MeasurementResponse> measurements,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") List<GoogleCloudMlV1_Trial_ParameterResponse> parameters,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("trialInfeasible") Boolean trialInfeasible) {
        this.clientId = clientId;
        this.endTime = endTime;
        this.finalMeasurement = finalMeasurement;
        this.infeasibleReason = infeasibleReason;
        this.measurements = measurements;
        this.name = name;
        this.parameters = parameters;
        this.startTime = startTime;
        this.state = state;
        this.trialInfeasible = trialInfeasible;
    }

    /**
     * The identifier of the client that originally requested this trial.
     * 
    */
    public String clientId() {
        return this.clientId;
    }
    /**
     * Time at which the trial&#39;s status changed to COMPLETED.
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * The final measurement containing the objective value.
     * 
    */
    public GoogleCloudMlV1__MeasurementResponse finalMeasurement() {
        return this.finalMeasurement;
    }
    /**
     * A human readable string describing why the trial is infeasible. This should only be set if trial_infeasible is true.
     * 
    */
    public String infeasibleReason() {
        return this.infeasibleReason;
    }
    /**
     * A list of measurements that are strictly lexicographically ordered by their induced tuples (steps, elapsed_time). These are used for early stopping computations.
     * 
    */
    public List<GoogleCloudMlV1__MeasurementResponse> measurements() {
        return this.measurements;
    }
    /**
     * Name of the trial assigned by the service.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The parameters of the trial.
     * 
    */
    public List<GoogleCloudMlV1_Trial_ParameterResponse> parameters() {
        return this.parameters;
    }
    /**
     * Time at which the trial was started.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * The detailed state of a trial.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * If true, the parameters in this trial are not attempted again.
     * 
    */
    public Boolean trialInfeasible() {
        return this.trialInfeasible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrialResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String endTime;
        private GoogleCloudMlV1__MeasurementResponse finalMeasurement;
        private String infeasibleReason;
        private List<GoogleCloudMlV1__MeasurementResponse> measurements;
        private String name;
        private List<GoogleCloudMlV1_Trial_ParameterResponse> parameters;
        private String startTime;
        private String state;
        private Boolean trialInfeasible;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.endTime = defaults.endTime;
    	      this.finalMeasurement = defaults.finalMeasurement;
    	      this.infeasibleReason = defaults.infeasibleReason;
    	      this.measurements = defaults.measurements;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trialInfeasible = defaults.trialInfeasible;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder finalMeasurement(GoogleCloudMlV1__MeasurementResponse finalMeasurement) {
            this.finalMeasurement = Objects.requireNonNull(finalMeasurement);
            return this;
        }
        public Builder infeasibleReason(String infeasibleReason) {
            this.infeasibleReason = Objects.requireNonNull(infeasibleReason);
            return this;
        }
        public Builder measurements(List<GoogleCloudMlV1__MeasurementResponse> measurements) {
            this.measurements = Objects.requireNonNull(measurements);
            return this;
        }
        public Builder measurements(GoogleCloudMlV1__MeasurementResponse... measurements) {
            return measurements(List.of(measurements));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(List<GoogleCloudMlV1_Trial_ParameterResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GoogleCloudMlV1_Trial_ParameterResponse... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder trialInfeasible(Boolean trialInfeasible) {
            this.trialInfeasible = Objects.requireNonNull(trialInfeasible);
            return this;
        }        public GetTrialResult build() {
            return new GetTrialResult(clientId, endTime, finalMeasurement, infeasibleReason, measurements, name, parameters, startTime, state, trialInfeasible);
        }
    }
}
