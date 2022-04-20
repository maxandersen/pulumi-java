// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.A2AReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.CurrentScenarioDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import com.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaAzureReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaBaseReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaBlueReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.InMageAzureV2ReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.InMageRcmReplicationDetailsResponse;
import com.pulumi.azurenative.recoveryservices.outputs.InMageReplicationDetailsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicationProtectedItemPropertiesResponse {
    /**
     * The Current active location of the PE.
     * 
     */
    private final @Nullable String activeLocation;
    /**
     * The allowed operations on the Replication protected item.
     * 
     */
    private final @Nullable List<String> allowedOperations;
    /**
     * The current scenario.
     * 
     */
    private final @Nullable CurrentScenarioDetailsResponse currentScenario;
    /**
     * The consolidated failover health for the VM.
     * 
     */
    private final @Nullable String failoverHealth;
    /**
     * The recovery point ARM Id to which the Vm was failed over.
     * 
     */
    private final @Nullable String failoverRecoveryPointId;
    /**
     * The name.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * List of health errors.
     * 
     */
    private final @Nullable List<HealthErrorResponse> healthErrors;
    /**
     * The Last successful failover time.
     * 
     */
    private final @Nullable String lastSuccessfulFailoverTime;
    /**
     * The Last successful test failover time.
     * 
     */
    private final @Nullable String lastSuccessfulTestFailoverTime;
    /**
     * The name of Policy governing this PE.
     * 
     */
    private final @Nullable String policyFriendlyName;
    /**
     * The ID of Policy governing this PE.
     * 
     */
    private final @Nullable String policyId;
    /**
     * The friendly name of the primary fabric.
     * 
     */
    private final @Nullable String primaryFabricFriendlyName;
    /**
     * The fabric provider of the primary fabric.
     * 
     */
    private final @Nullable String primaryFabricProvider;
    /**
     * The name of primary protection container friendly name.
     * 
     */
    private final @Nullable String primaryProtectionContainerFriendlyName;
    /**
     * The protected item ARM Id.
     * 
     */
    private final @Nullable String protectableItemId;
    /**
     * The type of protected item type.
     * 
     */
    private final @Nullable String protectedItemType;
    /**
     * The protection status.
     * 
     */
    private final @Nullable String protectionState;
    /**
     * The protection state description.
     * 
     */
    private final @Nullable String protectionStateDescription;
    /**
     * The Replication provider custom settings.
     * 
     */
    private final @Nullable Object providerSpecificDetails;
    /**
     * The recovery container Id.
     * 
     */
    private final @Nullable String recoveryContainerId;
    /**
     * The friendly name of recovery fabric.
     * 
     */
    private final @Nullable String recoveryFabricFriendlyName;
    /**
     * The Arm Id of recovery fabric.
     * 
     */
    private final @Nullable String recoveryFabricId;
    /**
     * The name of recovery container friendly name.
     * 
     */
    private final @Nullable String recoveryProtectionContainerFriendlyName;
    /**
     * The recovery provider ARM Id.
     * 
     */
    private final @Nullable String recoveryServicesProviderId;
    /**
     * The consolidated protection health for the VM taking any issues with SRS as well as all the replication units associated with the VM&#39;s replication group into account. This is a string representation of the ProtectionHealth enumeration.
     * 
     */
    private final @Nullable String replicationHealth;
    /**
     * The Test failover state.
     * 
     */
    private final @Nullable String testFailoverState;
    /**
     * The Test failover state description.
     * 
     */
    private final @Nullable String testFailoverStateDescription;

    @CustomType.Constructor
    private ReplicationProtectedItemPropertiesResponse(
        @CustomType.Parameter("activeLocation") @Nullable String activeLocation,
        @CustomType.Parameter("allowedOperations") @Nullable List<String> allowedOperations,
        @CustomType.Parameter("currentScenario") @Nullable CurrentScenarioDetailsResponse currentScenario,
        @CustomType.Parameter("failoverHealth") @Nullable String failoverHealth,
        @CustomType.Parameter("failoverRecoveryPointId") @Nullable String failoverRecoveryPointId,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("healthErrors") @Nullable List<HealthErrorResponse> healthErrors,
        @CustomType.Parameter("lastSuccessfulFailoverTime") @Nullable String lastSuccessfulFailoverTime,
        @CustomType.Parameter("lastSuccessfulTestFailoverTime") @Nullable String lastSuccessfulTestFailoverTime,
        @CustomType.Parameter("policyFriendlyName") @Nullable String policyFriendlyName,
        @CustomType.Parameter("policyId") @Nullable String policyId,
        @CustomType.Parameter("primaryFabricFriendlyName") @Nullable String primaryFabricFriendlyName,
        @CustomType.Parameter("primaryFabricProvider") @Nullable String primaryFabricProvider,
        @CustomType.Parameter("primaryProtectionContainerFriendlyName") @Nullable String primaryProtectionContainerFriendlyName,
        @CustomType.Parameter("protectableItemId") @Nullable String protectableItemId,
        @CustomType.Parameter("protectedItemType") @Nullable String protectedItemType,
        @CustomType.Parameter("protectionState") @Nullable String protectionState,
        @CustomType.Parameter("protectionStateDescription") @Nullable String protectionStateDescription,
        @CustomType.Parameter("providerSpecificDetails") @Nullable Object providerSpecificDetails,
        @CustomType.Parameter("recoveryContainerId") @Nullable String recoveryContainerId,
        @CustomType.Parameter("recoveryFabricFriendlyName") @Nullable String recoveryFabricFriendlyName,
        @CustomType.Parameter("recoveryFabricId") @Nullable String recoveryFabricId,
        @CustomType.Parameter("recoveryProtectionContainerFriendlyName") @Nullable String recoveryProtectionContainerFriendlyName,
        @CustomType.Parameter("recoveryServicesProviderId") @Nullable String recoveryServicesProviderId,
        @CustomType.Parameter("replicationHealth") @Nullable String replicationHealth,
        @CustomType.Parameter("testFailoverState") @Nullable String testFailoverState,
        @CustomType.Parameter("testFailoverStateDescription") @Nullable String testFailoverStateDescription) {
        this.activeLocation = activeLocation;
        this.allowedOperations = allowedOperations;
        this.currentScenario = currentScenario;
        this.failoverHealth = failoverHealth;
        this.failoverRecoveryPointId = failoverRecoveryPointId;
        this.friendlyName = friendlyName;
        this.healthErrors = healthErrors;
        this.lastSuccessfulFailoverTime = lastSuccessfulFailoverTime;
        this.lastSuccessfulTestFailoverTime = lastSuccessfulTestFailoverTime;
        this.policyFriendlyName = policyFriendlyName;
        this.policyId = policyId;
        this.primaryFabricFriendlyName = primaryFabricFriendlyName;
        this.primaryFabricProvider = primaryFabricProvider;
        this.primaryProtectionContainerFriendlyName = primaryProtectionContainerFriendlyName;
        this.protectableItemId = protectableItemId;
        this.protectedItemType = protectedItemType;
        this.protectionState = protectionState;
        this.protectionStateDescription = protectionStateDescription;
        this.providerSpecificDetails = providerSpecificDetails;
        this.recoveryContainerId = recoveryContainerId;
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        this.recoveryFabricId = recoveryFabricId;
        this.recoveryProtectionContainerFriendlyName = recoveryProtectionContainerFriendlyName;
        this.recoveryServicesProviderId = recoveryServicesProviderId;
        this.replicationHealth = replicationHealth;
        this.testFailoverState = testFailoverState;
        this.testFailoverStateDescription = testFailoverStateDescription;
    }

    /**
     * The Current active location of the PE.
     * 
    */
    public Optional<String> activeLocation() {
        return Optional.ofNullable(this.activeLocation);
    }
    /**
     * The allowed operations on the Replication protected item.
     * 
    */
    public List<String> allowedOperations() {
        return this.allowedOperations == null ? List.of() : this.allowedOperations;
    }
    /**
     * The current scenario.
     * 
    */
    public Optional<CurrentScenarioDetailsResponse> currentScenario() {
        return Optional.ofNullable(this.currentScenario);
    }
    /**
     * The consolidated failover health for the VM.
     * 
    */
    public Optional<String> failoverHealth() {
        return Optional.ofNullable(this.failoverHealth);
    }
    /**
     * The recovery point ARM Id to which the Vm was failed over.
     * 
    */
    public Optional<String> failoverRecoveryPointId() {
        return Optional.ofNullable(this.failoverRecoveryPointId);
    }
    /**
     * The name.
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * List of health errors.
     * 
    */
    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }
    /**
     * The Last successful failover time.
     * 
    */
    public Optional<String> lastSuccessfulFailoverTime() {
        return Optional.ofNullable(this.lastSuccessfulFailoverTime);
    }
    /**
     * The Last successful test failover time.
     * 
    */
    public Optional<String> lastSuccessfulTestFailoverTime() {
        return Optional.ofNullable(this.lastSuccessfulTestFailoverTime);
    }
    /**
     * The name of Policy governing this PE.
     * 
    */
    public Optional<String> policyFriendlyName() {
        return Optional.ofNullable(this.policyFriendlyName);
    }
    /**
     * The ID of Policy governing this PE.
     * 
    */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * The friendly name of the primary fabric.
     * 
    */
    public Optional<String> primaryFabricFriendlyName() {
        return Optional.ofNullable(this.primaryFabricFriendlyName);
    }
    /**
     * The fabric provider of the primary fabric.
     * 
    */
    public Optional<String> primaryFabricProvider() {
        return Optional.ofNullable(this.primaryFabricProvider);
    }
    /**
     * The name of primary protection container friendly name.
     * 
    */
    public Optional<String> primaryProtectionContainerFriendlyName() {
        return Optional.ofNullable(this.primaryProtectionContainerFriendlyName);
    }
    /**
     * The protected item ARM Id.
     * 
    */
    public Optional<String> protectableItemId() {
        return Optional.ofNullable(this.protectableItemId);
    }
    /**
     * The type of protected item type.
     * 
    */
    public Optional<String> protectedItemType() {
        return Optional.ofNullable(this.protectedItemType);
    }
    /**
     * The protection status.
     * 
    */
    public Optional<String> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    /**
     * The protection state description.
     * 
    */
    public Optional<String> protectionStateDescription() {
        return Optional.ofNullable(this.protectionStateDescription);
    }
    /**
     * The Replication provider custom settings.
     * 
    */
    public Optional<Object> providerSpecificDetails() {
        return Optional.ofNullable(this.providerSpecificDetails);
    }
    /**
     * The recovery container Id.
     * 
    */
    public Optional<String> recoveryContainerId() {
        return Optional.ofNullable(this.recoveryContainerId);
    }
    /**
     * The friendly name of recovery fabric.
     * 
    */
    public Optional<String> recoveryFabricFriendlyName() {
        return Optional.ofNullable(this.recoveryFabricFriendlyName);
    }
    /**
     * The Arm Id of recovery fabric.
     * 
    */
    public Optional<String> recoveryFabricId() {
        return Optional.ofNullable(this.recoveryFabricId);
    }
    /**
     * The name of recovery container friendly name.
     * 
    */
    public Optional<String> recoveryProtectionContainerFriendlyName() {
        return Optional.ofNullable(this.recoveryProtectionContainerFriendlyName);
    }
    /**
     * The recovery provider ARM Id.
     * 
    */
    public Optional<String> recoveryServicesProviderId() {
        return Optional.ofNullable(this.recoveryServicesProviderId);
    }
    /**
     * The consolidated protection health for the VM taking any issues with SRS as well as all the replication units associated with the VM&#39;s replication group into account. This is a string representation of the ProtectionHealth enumeration.
     * 
    */
    public Optional<String> replicationHealth() {
        return Optional.ofNullable(this.replicationHealth);
    }
    /**
     * The Test failover state.
     * 
    */
    public Optional<String> testFailoverState() {
        return Optional.ofNullable(this.testFailoverState);
    }
    /**
     * The Test failover state description.
     * 
    */
    public Optional<String> testFailoverStateDescription() {
        return Optional.ofNullable(this.testFailoverStateDescription);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationProtectedItemPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeLocation;
        private @Nullable List<String> allowedOperations;
        private @Nullable CurrentScenarioDetailsResponse currentScenario;
        private @Nullable String failoverHealth;
        private @Nullable String failoverRecoveryPointId;
        private @Nullable String friendlyName;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String lastSuccessfulFailoverTime;
        private @Nullable String lastSuccessfulTestFailoverTime;
        private @Nullable String policyFriendlyName;
        private @Nullable String policyId;
        private @Nullable String primaryFabricFriendlyName;
        private @Nullable String primaryFabricProvider;
        private @Nullable String primaryProtectionContainerFriendlyName;
        private @Nullable String protectableItemId;
        private @Nullable String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String protectionStateDescription;
        private @Nullable Object providerSpecificDetails;
        private @Nullable String recoveryContainerId;
        private @Nullable String recoveryFabricFriendlyName;
        private @Nullable String recoveryFabricId;
        private @Nullable String recoveryProtectionContainerFriendlyName;
        private @Nullable String recoveryServicesProviderId;
        private @Nullable String replicationHealth;
        private @Nullable String testFailoverState;
        private @Nullable String testFailoverStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationProtectedItemPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeLocation = defaults.activeLocation;
    	      this.allowedOperations = defaults.allowedOperations;
    	      this.currentScenario = defaults.currentScenario;
    	      this.failoverHealth = defaults.failoverHealth;
    	      this.failoverRecoveryPointId = defaults.failoverRecoveryPointId;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthErrors = defaults.healthErrors;
    	      this.lastSuccessfulFailoverTime = defaults.lastSuccessfulFailoverTime;
    	      this.lastSuccessfulTestFailoverTime = defaults.lastSuccessfulTestFailoverTime;
    	      this.policyFriendlyName = defaults.policyFriendlyName;
    	      this.policyId = defaults.policyId;
    	      this.primaryFabricFriendlyName = defaults.primaryFabricFriendlyName;
    	      this.primaryFabricProvider = defaults.primaryFabricProvider;
    	      this.primaryProtectionContainerFriendlyName = defaults.primaryProtectionContainerFriendlyName;
    	      this.protectableItemId = defaults.protectableItemId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.protectionStateDescription = defaults.protectionStateDescription;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
    	      this.recoveryContainerId = defaults.recoveryContainerId;
    	      this.recoveryFabricFriendlyName = defaults.recoveryFabricFriendlyName;
    	      this.recoveryFabricId = defaults.recoveryFabricId;
    	      this.recoveryProtectionContainerFriendlyName = defaults.recoveryProtectionContainerFriendlyName;
    	      this.recoveryServicesProviderId = defaults.recoveryServicesProviderId;
    	      this.replicationHealth = defaults.replicationHealth;
    	      this.testFailoverState = defaults.testFailoverState;
    	      this.testFailoverStateDescription = defaults.testFailoverStateDescription;
        }

        public Builder activeLocation(@Nullable String activeLocation) {
            this.activeLocation = activeLocation;
            return this;
        }
        public Builder allowedOperations(@Nullable List<String> allowedOperations) {
            this.allowedOperations = allowedOperations;
            return this;
        }
        public Builder allowedOperations(String... allowedOperations) {
            return allowedOperations(List.of(allowedOperations));
        }
        public Builder currentScenario(@Nullable CurrentScenarioDetailsResponse currentScenario) {
            this.currentScenario = currentScenario;
            return this;
        }
        public Builder failoverHealth(@Nullable String failoverHealth) {
            this.failoverHealth = failoverHealth;
            return this;
        }
        public Builder failoverRecoveryPointId(@Nullable String failoverRecoveryPointId) {
            this.failoverRecoveryPointId = failoverRecoveryPointId;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder healthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder lastSuccessfulFailoverTime(@Nullable String lastSuccessfulFailoverTime) {
            this.lastSuccessfulFailoverTime = lastSuccessfulFailoverTime;
            return this;
        }
        public Builder lastSuccessfulTestFailoverTime(@Nullable String lastSuccessfulTestFailoverTime) {
            this.lastSuccessfulTestFailoverTime = lastSuccessfulTestFailoverTime;
            return this;
        }
        public Builder policyFriendlyName(@Nullable String policyFriendlyName) {
            this.policyFriendlyName = policyFriendlyName;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder primaryFabricFriendlyName(@Nullable String primaryFabricFriendlyName) {
            this.primaryFabricFriendlyName = primaryFabricFriendlyName;
            return this;
        }
        public Builder primaryFabricProvider(@Nullable String primaryFabricProvider) {
            this.primaryFabricProvider = primaryFabricProvider;
            return this;
        }
        public Builder primaryProtectionContainerFriendlyName(@Nullable String primaryProtectionContainerFriendlyName) {
            this.primaryProtectionContainerFriendlyName = primaryProtectionContainerFriendlyName;
            return this;
        }
        public Builder protectableItemId(@Nullable String protectableItemId) {
            this.protectableItemId = protectableItemId;
            return this;
        }
        public Builder protectedItemType(@Nullable String protectedItemType) {
            this.protectedItemType = protectedItemType;
            return this;
        }
        public Builder protectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }
        public Builder protectionStateDescription(@Nullable String protectionStateDescription) {
            this.protectionStateDescription = protectionStateDescription;
            return this;
        }
        public Builder providerSpecificDetails(@Nullable Object providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }
        public Builder recoveryContainerId(@Nullable String recoveryContainerId) {
            this.recoveryContainerId = recoveryContainerId;
            return this;
        }
        public Builder recoveryFabricFriendlyName(@Nullable String recoveryFabricFriendlyName) {
            this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
            return this;
        }
        public Builder recoveryFabricId(@Nullable String recoveryFabricId) {
            this.recoveryFabricId = recoveryFabricId;
            return this;
        }
        public Builder recoveryProtectionContainerFriendlyName(@Nullable String recoveryProtectionContainerFriendlyName) {
            this.recoveryProtectionContainerFriendlyName = recoveryProtectionContainerFriendlyName;
            return this;
        }
        public Builder recoveryServicesProviderId(@Nullable String recoveryServicesProviderId) {
            this.recoveryServicesProviderId = recoveryServicesProviderId;
            return this;
        }
        public Builder replicationHealth(@Nullable String replicationHealth) {
            this.replicationHealth = replicationHealth;
            return this;
        }
        public Builder testFailoverState(@Nullable String testFailoverState) {
            this.testFailoverState = testFailoverState;
            return this;
        }
        public Builder testFailoverStateDescription(@Nullable String testFailoverStateDescription) {
            this.testFailoverStateDescription = testFailoverStateDescription;
            return this;
        }        public ReplicationProtectedItemPropertiesResponse build() {
            return new ReplicationProtectedItemPropertiesResponse(activeLocation, allowedOperations, currentScenario, failoverHealth, failoverRecoveryPointId, friendlyName, healthErrors, lastSuccessfulFailoverTime, lastSuccessfulTestFailoverTime, policyFriendlyName, policyId, primaryFabricFriendlyName, primaryFabricProvider, primaryProtectionContainerFriendlyName, protectableItemId, protectedItemType, protectionState, protectionStateDescription, providerSpecificDetails, recoveryContainerId, recoveryFabricFriendlyName, recoveryFabricId, recoveryProtectionContainerFriendlyName, recoveryServicesProviderId, replicationHealth, testFailoverState, testFailoverStateDescription);
        }
    }
}
