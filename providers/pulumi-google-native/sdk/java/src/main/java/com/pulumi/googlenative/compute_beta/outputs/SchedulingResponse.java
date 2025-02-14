// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SchedulingResponse {
    /**
     * @return Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    private final Boolean automaticRestart;
    /**
     * @return Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
     */
    private final Integer hostErrorTimeoutSeconds;
    /**
     * @return Specifies the termination action for the instance.
     * 
     */
    private final String instanceTerminationAction;
    /**
     * @return An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private final String locationHint;
    /**
     * @return Specifies the number of hours after VM instance creation where the VM won&#39;t be scheduled for maintenance.
     * 
     */
    private final Integer maintenanceFreezeDurationHours;
    /**
     * @return For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    private final String maintenanceInterval;
    /**
     * @return The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    private final Integer minNodeCpus;
    /**
     * @return A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    private final List<SchedulingNodeAffinityResponse> nodeAffinities;
    /**
     * @return Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    private final String onHostMaintenance;
    /**
     * @return Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    private final Boolean preemptible;
    /**
     * @return Specifies the provisioning model of the instance.
     * 
     */
    private final String provisioningModel;

    @CustomType.Constructor
    private SchedulingResponse(
        @CustomType.Parameter("automaticRestart") Boolean automaticRestart,
        @CustomType.Parameter("hostErrorTimeoutSeconds") Integer hostErrorTimeoutSeconds,
        @CustomType.Parameter("instanceTerminationAction") String instanceTerminationAction,
        @CustomType.Parameter("locationHint") String locationHint,
        @CustomType.Parameter("maintenanceFreezeDurationHours") Integer maintenanceFreezeDurationHours,
        @CustomType.Parameter("maintenanceInterval") String maintenanceInterval,
        @CustomType.Parameter("minNodeCpus") Integer minNodeCpus,
        @CustomType.Parameter("nodeAffinities") List<SchedulingNodeAffinityResponse> nodeAffinities,
        @CustomType.Parameter("onHostMaintenance") String onHostMaintenance,
        @CustomType.Parameter("preemptible") Boolean preemptible,
        @CustomType.Parameter("provisioningModel") String provisioningModel) {
        this.automaticRestart = automaticRestart;
        this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
        this.instanceTerminationAction = instanceTerminationAction;
        this.locationHint = locationHint;
        this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
        this.maintenanceInterval = maintenanceInterval;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
        this.provisioningModel = provisioningModel;
    }

    /**
     * @return Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    public Boolean automaticRestart() {
        return this.automaticRestart;
    }
    /**
     * @return Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
     */
    public Integer hostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds;
    }
    /**
     * @return Specifies the termination action for the instance.
     * 
     */
    public String instanceTerminationAction() {
        return this.instanceTerminationAction;
    }
    /**
     * @return An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    public String locationHint() {
        return this.locationHint;
    }
    /**
     * @return Specifies the number of hours after VM instance creation where the VM won&#39;t be scheduled for maintenance.
     * 
     */
    public Integer maintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours;
    }
    /**
     * @return For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    public String maintenanceInterval() {
        return this.maintenanceInterval;
    }
    /**
     * @return The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }
    /**
     * @return A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    public List<SchedulingNodeAffinityResponse> nodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * @return Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * @return Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    public Boolean preemptible() {
        return this.preemptible;
    }
    /**
     * @return Specifies the provisioning model of the instance.
     * 
     */
    public String provisioningModel() {
        return this.provisioningModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private Integer hostErrorTimeoutSeconds;
        private String instanceTerminationAction;
        private String locationHint;
        private Integer maintenanceFreezeDurationHours;
        private String maintenanceInterval;
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;
        private String provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.hostErrorTimeoutSeconds = defaults.hostErrorTimeoutSeconds;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }
        public Builder hostErrorTimeoutSeconds(Integer hostErrorTimeoutSeconds) {
            this.hostErrorTimeoutSeconds = Objects.requireNonNull(hostErrorTimeoutSeconds);
            return this;
        }
        public Builder instanceTerminationAction(String instanceTerminationAction) {
            this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
            return this;
        }
        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }
        public Builder maintenanceFreezeDurationHours(Integer maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours);
            return this;
        }
        public Builder maintenanceInterval(String maintenanceInterval) {
            this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
            return this;
        }
        public Builder minNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(List<SchedulingNodeAffinityResponse> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(SchedulingNodeAffinityResponse... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }
        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        public Builder provisioningModel(String provisioningModel) {
            this.provisioningModel = Objects.requireNonNull(provisioningModel);
            return this;
        }        public SchedulingResponse build() {
            return new SchedulingResponse(automaticRestart, hostErrorTimeoutSeconds, instanceTerminationAction, locationHint, maintenanceFreezeDurationHours, maintenanceInterval, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}
