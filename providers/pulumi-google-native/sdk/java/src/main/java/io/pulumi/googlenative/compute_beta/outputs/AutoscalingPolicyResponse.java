// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.AutoscalingPolicyCpuUtilizationResponse;
import io.pulumi.googlenative.compute_beta.outputs.AutoscalingPolicyCustomMetricUtilizationResponse;
import io.pulumi.googlenative.compute_beta.outputs.AutoscalingPolicyLoadBalancingUtilizationResponse;
import io.pulumi.googlenative.compute_beta.outputs.AutoscalingPolicyScaleDownControlResponse;
import io.pulumi.googlenative.compute_beta.outputs.AutoscalingPolicyScaleInControlResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class AutoscalingPolicyResponse {
    /**
     * The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
     * 
     */
    private final Integer coolDownPeriodSec;
    /**
     * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
     * 
     */
    private final AutoscalingPolicyCpuUtilizationResponse cpuUtilization;
    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * 
     */
    private final List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations;
    /**
     * Configuration parameters of autoscaling based on load balancer.
     * 
     */
    private final AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization;
    /**
     * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
     * 
     */
    private final Integer maxNumReplicas;
    /**
     * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
     * 
     */
    private final Integer minNumReplicas;
    /**
     * Defines operating mode for this policy.
     * 
     */
    private final String mode;
    private final AutoscalingPolicyScaleDownControlResponse scaleDownControl;
    private final AutoscalingPolicyScaleInControlResponse scaleInControl;
    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
     * 
     */
    private final Map<String,String> scalingSchedules;

    @OutputCustomType.Constructor
    private AutoscalingPolicyResponse(
        @OutputCustomType.Parameter("coolDownPeriodSec") Integer coolDownPeriodSec,
        @OutputCustomType.Parameter("cpuUtilization") AutoscalingPolicyCpuUtilizationResponse cpuUtilization,
        @OutputCustomType.Parameter("customMetricUtilizations") List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations,
        @OutputCustomType.Parameter("loadBalancingUtilization") AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization,
        @OutputCustomType.Parameter("maxNumReplicas") Integer maxNumReplicas,
        @OutputCustomType.Parameter("minNumReplicas") Integer minNumReplicas,
        @OutputCustomType.Parameter("mode") String mode,
        @OutputCustomType.Parameter("scaleDownControl") AutoscalingPolicyScaleDownControlResponse scaleDownControl,
        @OutputCustomType.Parameter("scaleInControl") AutoscalingPolicyScaleInControlResponse scaleInControl,
        @OutputCustomType.Parameter("scalingSchedules") Map<String,String> scalingSchedules) {
        this.coolDownPeriodSec = coolDownPeriodSec;
        this.cpuUtilization = cpuUtilization;
        this.customMetricUtilizations = customMetricUtilizations;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxNumReplicas = maxNumReplicas;
        this.minNumReplicas = minNumReplicas;
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    /**
     * The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
     * 
    */
    public Integer getCoolDownPeriodSec() {
        return this.coolDownPeriodSec;
    }
    /**
     * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
     * 
    */
    public AutoscalingPolicyCpuUtilizationResponse getCpuUtilization() {
        return this.cpuUtilization;
    }
    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * 
    */
    public List<AutoscalingPolicyCustomMetricUtilizationResponse> getCustomMetricUtilizations() {
        return this.customMetricUtilizations;
    }
    /**
     * Configuration parameters of autoscaling based on load balancer.
     * 
    */
    public AutoscalingPolicyLoadBalancingUtilizationResponse getLoadBalancingUtilization() {
        return this.loadBalancingUtilization;
    }
    /**
     * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
     * 
    */
    public Integer getMaxNumReplicas() {
        return this.maxNumReplicas;
    }
    /**
     * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
     * 
    */
    public Integer getMinNumReplicas() {
        return this.minNumReplicas;
    }
    /**
     * Defines operating mode for this policy.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    public AutoscalingPolicyScaleDownControlResponse getScaleDownControl() {
        return this.scaleDownControl;
    }
    public AutoscalingPolicyScaleInControlResponse getScaleInControl() {
        return this.scaleInControl;
    }
    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
     * 
    */
    public Map<String,String> getScalingSchedules() {
        return this.scalingSchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer coolDownPeriodSec;
        private AutoscalingPolicyCpuUtilizationResponse cpuUtilization;
        private List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations;
        private AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization;
        private Integer maxNumReplicas;
        private Integer minNumReplicas;
        private String mode;
        private AutoscalingPolicyScaleDownControlResponse scaleDownControl;
        private AutoscalingPolicyScaleInControlResponse scaleInControl;
        private Map<String,String> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriodSec = defaults.coolDownPeriodSec;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.customMetricUtilizations = defaults.customMetricUtilizations;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxNumReplicas = defaults.maxNumReplicas;
    	      this.minNumReplicas = defaults.minNumReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder setCoolDownPeriodSec(Integer coolDownPeriodSec) {
            this.coolDownPeriodSec = Objects.requireNonNull(coolDownPeriodSec);
            return this;
        }

        public Builder setCpuUtilization(AutoscalingPolicyCpuUtilizationResponse cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder setCustomMetricUtilizations(List<AutoscalingPolicyCustomMetricUtilizationResponse> customMetricUtilizations) {
            this.customMetricUtilizations = Objects.requireNonNull(customMetricUtilizations);
            return this;
        }

        public Builder setLoadBalancingUtilization(AutoscalingPolicyLoadBalancingUtilizationResponse loadBalancingUtilization) {
            this.loadBalancingUtilization = Objects.requireNonNull(loadBalancingUtilization);
            return this;
        }

        public Builder setMaxNumReplicas(Integer maxNumReplicas) {
            this.maxNumReplicas = Objects.requireNonNull(maxNumReplicas);
            return this;
        }

        public Builder setMinNumReplicas(Integer minNumReplicas) {
            this.minNumReplicas = Objects.requireNonNull(minNumReplicas);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setScaleDownControl(AutoscalingPolicyScaleDownControlResponse scaleDownControl) {
            this.scaleDownControl = Objects.requireNonNull(scaleDownControl);
            return this;
        }

        public Builder setScaleInControl(AutoscalingPolicyScaleInControlResponse scaleInControl) {
            this.scaleInControl = Objects.requireNonNull(scaleInControl);
            return this;
        }

        public Builder setScalingSchedules(Map<String,String> scalingSchedules) {
            this.scalingSchedules = Objects.requireNonNull(scalingSchedules);
            return this;
        }
        public AutoscalingPolicyResponse build() {
            return new AutoscalingPolicyResponse(coolDownPeriodSec, cpuUtilization, customMetricUtilizations, loadBalancingUtilization, maxNumReplicas, minNumReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
