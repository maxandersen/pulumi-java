// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import com.pulumi.googlenative.compute_alpha.outputs.SchedulingNodeAffinityResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SchedulingResponse {
    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    private final Boolean automaticRestart;
    /**
     * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
     * 
     */
    private final Integer availabilityDomain;
    /**
     * Current number of vCPUs available for VM. 0 or unset means default vCPUs of the current machine type.
     * 
     */
    private final Integer currentCpus;
    /**
     * Current amount of memory (in MB) available for VM. 0 or unset means default amount of memory of the current machine type.
     * 
     */
    private final String currentMemoryMb;
    /**
     * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
     */
    private final Integer hostErrorTimeoutSeconds;
    /**
     * Specifies the termination action for the instance.
     * 
     */
    private final String instanceTerminationAction;
    /**
     * Defines whether the instance is tolerant of higher cpu latency. This can only be set during instance creation, or when the instance is not currently running. It must not be set if the preemptible option is also set.
     * 
     */
    private final Boolean latencyTolerant;
    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private final String locationHint;
    /**
     * Specifies the number of hours after VM instance creation where the VM won&#39;t be scheduled for maintenance.
     * 
     */
    private final Integer maintenanceFreezeDurationHours;
    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    private final String maintenanceInterval;
    /**
     * Specifies the max run duration for the given instance. If specified, the instance termination action will be performed at the end of the run duration.
     * 
     */
    private final DurationResponse maxRunDuration;
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    private final Integer minNodeCpus;
    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    private final List<SchedulingNodeAffinityResponse> nodeAffinities;
    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    private final String onHostMaintenance;
    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    private final Boolean preemptible;
    /**
     * Specifies the provisioning model of the instance.
     * 
     */
    private final String provisioningModel;
    /**
     * Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
     * 
     */
    private final String terminationTime;

    @CustomType.Constructor
    private SchedulingResponse(
        @CustomType.Parameter("automaticRestart") Boolean automaticRestart,
        @CustomType.Parameter("availabilityDomain") Integer availabilityDomain,
        @CustomType.Parameter("currentCpus") Integer currentCpus,
        @CustomType.Parameter("currentMemoryMb") String currentMemoryMb,
        @CustomType.Parameter("hostErrorTimeoutSeconds") Integer hostErrorTimeoutSeconds,
        @CustomType.Parameter("instanceTerminationAction") String instanceTerminationAction,
        @CustomType.Parameter("latencyTolerant") Boolean latencyTolerant,
        @CustomType.Parameter("locationHint") String locationHint,
        @CustomType.Parameter("maintenanceFreezeDurationHours") Integer maintenanceFreezeDurationHours,
        @CustomType.Parameter("maintenanceInterval") String maintenanceInterval,
        @CustomType.Parameter("maxRunDuration") DurationResponse maxRunDuration,
        @CustomType.Parameter("minNodeCpus") Integer minNodeCpus,
        @CustomType.Parameter("nodeAffinities") List<SchedulingNodeAffinityResponse> nodeAffinities,
        @CustomType.Parameter("onHostMaintenance") String onHostMaintenance,
        @CustomType.Parameter("preemptible") Boolean preemptible,
        @CustomType.Parameter("provisioningModel") String provisioningModel,
        @CustomType.Parameter("terminationTime") String terminationTime) {
        this.automaticRestart = automaticRestart;
        this.availabilityDomain = availabilityDomain;
        this.currentCpus = currentCpus;
        this.currentMemoryMb = currentMemoryMb;
        this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
        this.instanceTerminationAction = instanceTerminationAction;
        this.latencyTolerant = latencyTolerant;
        this.locationHint = locationHint;
        this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
        this.maintenanceInterval = maintenanceInterval;
        this.maxRunDuration = maxRunDuration;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
        this.provisioningModel = provisioningModel;
        this.terminationTime = terminationTime;
    }

    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
    */
    public Boolean automaticRestart() {
        return this.automaticRestart;
    }
    /**
     * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
     * 
    */
    public Integer availabilityDomain() {
        return this.availabilityDomain;
    }
    /**
     * Current number of vCPUs available for VM. 0 or unset means default vCPUs of the current machine type.
     * 
    */
    public Integer currentCpus() {
        return this.currentCpus;
    }
    /**
     * Current amount of memory (in MB) available for VM. 0 or unset means default amount of memory of the current machine type.
     * 
    */
    public String currentMemoryMb() {
        return this.currentMemoryMb;
    }
    /**
     * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
    */
    public Integer hostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds;
    }
    /**
     * Specifies the termination action for the instance.
     * 
    */
    public String instanceTerminationAction() {
        return this.instanceTerminationAction;
    }
    /**
     * Defines whether the instance is tolerant of higher cpu latency. This can only be set during instance creation, or when the instance is not currently running. It must not be set if the preemptible option is also set.
     * 
    */
    public Boolean latencyTolerant() {
        return this.latencyTolerant;
    }
    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
    */
    public String locationHint() {
        return this.locationHint;
    }
    /**
     * Specifies the number of hours after VM instance creation where the VM won&#39;t be scheduled for maintenance.
     * 
    */
    public Integer maintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours;
    }
    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
    */
    public String maintenanceInterval() {
        return this.maintenanceInterval;
    }
    /**
     * Specifies the max run duration for the given instance. If specified, the instance termination action will be performed at the end of the run duration.
     * 
    */
    public DurationResponse maxRunDuration() {
        return this.maxRunDuration;
    }
    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
    */
    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }
    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
    */
    public List<SchedulingNodeAffinityResponse> nodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
    */
    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
    */
    public Boolean preemptible() {
        return this.preemptible;
    }
    /**
     * Specifies the provisioning model of the instance.
     * 
    */
    public String provisioningModel() {
        return this.provisioningModel;
    }
    /**
     * Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
     * 
    */
    public String terminationTime() {
        return this.terminationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automaticRestart;
        private Integer availabilityDomain;
        private Integer currentCpus;
        private String currentMemoryMb;
        private Integer hostErrorTimeoutSeconds;
        private String instanceTerminationAction;
        private Boolean latencyTolerant;
        private String locationHint;
        private Integer maintenanceFreezeDurationHours;
        private String maintenanceInterval;
        private DurationResponse maxRunDuration;
        private Integer minNodeCpus;
        private List<SchedulingNodeAffinityResponse> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;
        private String provisioningModel;
        private String terminationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.currentCpus = defaults.currentCpus;
    	      this.currentMemoryMb = defaults.currentMemoryMb;
    	      this.hostErrorTimeoutSeconds = defaults.hostErrorTimeoutSeconds;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.latencyTolerant = defaults.latencyTolerant;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.maxRunDuration = defaults.maxRunDuration;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
    	      this.terminationTime = defaults.terminationTime;
        }

        public Builder automaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }
        public Builder availabilityDomain(Integer availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }
        public Builder currentCpus(Integer currentCpus) {
            this.currentCpus = Objects.requireNonNull(currentCpus);
            return this;
        }
        public Builder currentMemoryMb(String currentMemoryMb) {
            this.currentMemoryMb = Objects.requireNonNull(currentMemoryMb);
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
        public Builder latencyTolerant(Boolean latencyTolerant) {
            this.latencyTolerant = Objects.requireNonNull(latencyTolerant);
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
        public Builder maxRunDuration(DurationResponse maxRunDuration) {
            this.maxRunDuration = Objects.requireNonNull(maxRunDuration);
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
        }
        public Builder terminationTime(String terminationTime) {
            this.terminationTime = Objects.requireNonNull(terminationTime);
            return this;
        }        public SchedulingResponse build() {
            return new SchedulingResponse(automaticRestart, availabilityDomain, currentCpus, currentMemoryMb, hostErrorTimeoutSeconds, instanceTerminationAction, latencyTolerant, locationHint, maintenanceFreezeDurationHours, maintenanceInterval, maxRunDuration, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel, terminationTime);
        }
    }
}
