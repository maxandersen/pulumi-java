// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.AutoScalingPolicyResponse;
import io.pulumi.azurenative.servicefabricmesh.inputs.ContainerCodePackagePropertiesResponse;
import io.pulumi.azurenative.servicefabricmesh.inputs.DiagnosticsRefResponse;
import io.pulumi.azurenative.servicefabricmesh.inputs.NetworkRefResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This type describes a service resource.
 * 
 */
public final class ServiceResourceDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceResourceDescriptionResponse Empty = new ServiceResourceDescriptionResponse();

    /**
     * Auto scaling policies
     * 
     */
    @Import(name="autoScalingPolicies")
      private final @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies;

    public List<AutoScalingPolicyResponse> autoScalingPolicies() {
        return this.autoScalingPolicies == null ? List.of() : this.autoScalingPolicies;
    }

    /**
     * Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
     * 
     */
    @Import(name="codePackages", required=true)
      private final List<ContainerCodePackagePropertiesResponse> codePackages;

    public List<ContainerCodePackagePropertiesResponse> codePackages() {
        return this.codePackages;
    }

    /**
     * User readable description of the service.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    @Import(name="diagnostics")
      private final @Nullable DiagnosticsRefResponse diagnostics;

    public Optional<DiagnosticsRefResponse> diagnostics() {
        return this.diagnostics == null ? Optional.empty() : Optional.ofNullable(this.diagnostics);
    }

    /**
     * Describes the health state of an application resource.
     * 
     */
    @Import(name="healthState", required=true)
      private final String healthState;

    public String healthState() {
        return this.healthState;
    }

    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The names of the private networks that this service needs to be part of.
     * 
     */
    @Import(name="networkRefs")
      private final @Nullable List<NetworkRefResponse> networkRefs;

    public List<NetworkRefResponse> networkRefs() {
        return this.networkRefs == null ? List.of() : this.networkRefs;
    }

    /**
     * The operation system required by the code in service.
     * 
     */
    @Import(name="osType", required=true)
      private final String osType;

    public String osType() {
        return this.osType;
    }

    /**
     * State of the resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The number of replicas of the service to create. Defaults to 1 if not specified.
     * 
     */
    @Import(name="replicaCount")
      private final @Nullable Integer replicaCount;

    public Optional<Integer> replicaCount() {
        return this.replicaCount == null ? Optional.empty() : Optional.ofNullable(this.replicaCount);
    }

    /**
     * Status of the service.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    /**
     * Gives additional information about the current status of the service.
     * 
     */
    @Import(name="statusDetails", required=true)
      private final String statusDetails;

    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * When the service's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
     * 
     */
    @Import(name="unhealthyEvaluation", required=true)
      private final String unhealthyEvaluation;

    public String unhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    public ServiceResourceDescriptionResponse(
        @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies,
        List<ContainerCodePackagePropertiesResponse> codePackages,
        @Nullable String description,
        @Nullable DiagnosticsRefResponse diagnostics,
        String healthState,
        String id,
        @Nullable String name,
        @Nullable List<NetworkRefResponse> networkRefs,
        String osType,
        String provisioningState,
        @Nullable Integer replicaCount,
        String status,
        String statusDetails,
        String type,
        String unhealthyEvaluation) {
        this.autoScalingPolicies = autoScalingPolicies;
        this.codePackages = Objects.requireNonNull(codePackages, "expected parameter 'codePackages' to be non-null");
        this.description = description;
        this.diagnostics = diagnostics;
        this.healthState = Objects.requireNonNull(healthState, "expected parameter 'healthState' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = name;
        this.networkRefs = networkRefs;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.replicaCount = replicaCount;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusDetails = Objects.requireNonNull(statusDetails, "expected parameter 'statusDetails' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.unhealthyEvaluation = Objects.requireNonNull(unhealthyEvaluation, "expected parameter 'unhealthyEvaluation' to be non-null");
    }

    private ServiceResourceDescriptionResponse() {
        this.autoScalingPolicies = List.of();
        this.codePackages = List.of();
        this.description = null;
        this.diagnostics = null;
        this.healthState = null;
        this.id = null;
        this.name = null;
        this.networkRefs = List.of();
        this.osType = null;
        this.provisioningState = null;
        this.replicaCount = null;
        this.status = null;
        this.statusDetails = null;
        this.type = null;
        this.unhealthyEvaluation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResourceDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies;
        private List<ContainerCodePackagePropertiesResponse> codePackages;
        private @Nullable String description;
        private @Nullable DiagnosticsRefResponse diagnostics;
        private String healthState;
        private String id;
        private @Nullable String name;
        private @Nullable List<NetworkRefResponse> networkRefs;
        private String osType;
        private String provisioningState;
        private @Nullable Integer replicaCount;
        private String status;
        private String statusDetails;
        private String type;
        private String unhealthyEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResourceDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingPolicies = defaults.autoScalingPolicies;
    	      this.codePackages = defaults.codePackages;
    	      this.description = defaults.description;
    	      this.diagnostics = defaults.diagnostics;
    	      this.healthState = defaults.healthState;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.networkRefs = defaults.networkRefs;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.replicaCount = defaults.replicaCount;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.type = defaults.type;
    	      this.unhealthyEvaluation = defaults.unhealthyEvaluation;
        }

        public Builder autoScalingPolicies(@Nullable List<AutoScalingPolicyResponse> autoScalingPolicies) {
            this.autoScalingPolicies = autoScalingPolicies;
            return this;
        }
        public Builder autoScalingPolicies(AutoScalingPolicyResponse... autoScalingPolicies) {
            return autoScalingPolicies(List.of(autoScalingPolicies));
        }
        public Builder codePackages(List<ContainerCodePackagePropertiesResponse> codePackages) {
            this.codePackages = Objects.requireNonNull(codePackages);
            return this;
        }
        public Builder codePackages(ContainerCodePackagePropertiesResponse... codePackages) {
            return codePackages(List.of(codePackages));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder diagnostics(@Nullable DiagnosticsRefResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }
        public Builder healthState(String healthState) {
            this.healthState = Objects.requireNonNull(healthState);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder networkRefs(@Nullable List<NetworkRefResponse> networkRefs) {
            this.networkRefs = networkRefs;
            return this;
        }
        public Builder networkRefs(NetworkRefResponse... networkRefs) {
            return networkRefs(List.of(networkRefs));
        }
        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder replicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder unhealthyEvaluation(String unhealthyEvaluation) {
            this.unhealthyEvaluation = Objects.requireNonNull(unhealthyEvaluation);
            return this;
        }        public ServiceResourceDescriptionResponse build() {
            return new ServiceResourceDescriptionResponse(autoScalingPolicies, codePackages, description, diagnostics, healthState, id, name, networkRefs, osType, provisioningState, replicaCount, status, statusDetails, type, unhealthyEvaluation);
        }
    }
}
