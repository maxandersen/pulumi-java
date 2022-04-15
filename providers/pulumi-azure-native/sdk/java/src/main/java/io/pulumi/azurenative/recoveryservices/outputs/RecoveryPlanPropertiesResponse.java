// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.CurrentScenarioDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanA2ADetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanGroupResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecoveryPlanPropertiesResponse {
    /**
     * The list of allowed operations.
     * 
     */
    private final @Nullable List<String> allowedOperations;
    /**
     * The current scenario details.
     * 
     */
    private final @Nullable CurrentScenarioDetailsResponse currentScenario;
    /**
     * The recovery plan status.
     * 
     */
    private final @Nullable String currentScenarioStatus;
    /**
     * The recovery plan status description.
     * 
     */
    private final @Nullable String currentScenarioStatusDescription;
    /**
     * The failover deployment model.
     * 
     */
    private final @Nullable String failoverDeploymentModel;
    /**
     * The friendly name.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The recovery plan groups.
     * 
     */
    private final @Nullable List<RecoveryPlanGroupResponse> groups;
    /**
     * The start time of the last planned failover.
     * 
     */
    private final @Nullable String lastPlannedFailoverTime;
    /**
     * The start time of the last test failover.
     * 
     */
    private final @Nullable String lastTestFailoverTime;
    /**
     * The start time of the last unplanned failover.
     * 
     */
    private final @Nullable String lastUnplannedFailoverTime;
    /**
     * The primary fabric friendly name.
     * 
     */
    private final @Nullable String primaryFabricFriendlyName;
    /**
     * The primary fabric Id.
     * 
     */
    private final @Nullable String primaryFabricId;
    /**
     * The provider id and provider specific details.
     * 
     */
    private final List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails;
    /**
     * The recovery fabric friendly name.
     * 
     */
    private final @Nullable String recoveryFabricFriendlyName;
    /**
     * The recovery fabric Id.
     * 
     */
    private final @Nullable String recoveryFabricId;
    /**
     * The list of replication providers.
     * 
     */
    private final @Nullable List<String> replicationProviders;

    @CustomType.Constructor
    private RecoveryPlanPropertiesResponse(
        @CustomType.Parameter("allowedOperations") @Nullable List<String> allowedOperations,
        @CustomType.Parameter("currentScenario") @Nullable CurrentScenarioDetailsResponse currentScenario,
        @CustomType.Parameter("currentScenarioStatus") @Nullable String currentScenarioStatus,
        @CustomType.Parameter("currentScenarioStatusDescription") @Nullable String currentScenarioStatusDescription,
        @CustomType.Parameter("failoverDeploymentModel") @Nullable String failoverDeploymentModel,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("groups") @Nullable List<RecoveryPlanGroupResponse> groups,
        @CustomType.Parameter("lastPlannedFailoverTime") @Nullable String lastPlannedFailoverTime,
        @CustomType.Parameter("lastTestFailoverTime") @Nullable String lastTestFailoverTime,
        @CustomType.Parameter("lastUnplannedFailoverTime") @Nullable String lastUnplannedFailoverTime,
        @CustomType.Parameter("primaryFabricFriendlyName") @Nullable String primaryFabricFriendlyName,
        @CustomType.Parameter("primaryFabricId") @Nullable String primaryFabricId,
        @CustomType.Parameter("providerSpecificDetails") List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails,
        @CustomType.Parameter("recoveryFabricFriendlyName") @Nullable String recoveryFabricFriendlyName,
        @CustomType.Parameter("recoveryFabricId") @Nullable String recoveryFabricId,
        @CustomType.Parameter("replicationProviders") @Nullable List<String> replicationProviders) {
        this.allowedOperations = allowedOperations;
        this.currentScenario = currentScenario;
        this.currentScenarioStatus = currentScenarioStatus;
        this.currentScenarioStatusDescription = currentScenarioStatusDescription;
        this.failoverDeploymentModel = failoverDeploymentModel;
        this.friendlyName = friendlyName;
        this.groups = groups;
        this.lastPlannedFailoverTime = lastPlannedFailoverTime;
        this.lastTestFailoverTime = lastTestFailoverTime;
        this.lastUnplannedFailoverTime = lastUnplannedFailoverTime;
        this.primaryFabricFriendlyName = primaryFabricFriendlyName;
        this.primaryFabricId = primaryFabricId;
        this.providerSpecificDetails = providerSpecificDetails;
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        this.recoveryFabricId = recoveryFabricId;
        this.replicationProviders = replicationProviders;
    }

    /**
     * The list of allowed operations.
     * 
    */
    public List<String> allowedOperations() {
        return this.allowedOperations == null ? List.of() : this.allowedOperations;
    }
    /**
     * The current scenario details.
     * 
    */
    public Optional<CurrentScenarioDetailsResponse> currentScenario() {
        return Optional.ofNullable(this.currentScenario);
    }
    /**
     * The recovery plan status.
     * 
    */
    public Optional<String> currentScenarioStatus() {
        return Optional.ofNullable(this.currentScenarioStatus);
    }
    /**
     * The recovery plan status description.
     * 
    */
    public Optional<String> currentScenarioStatusDescription() {
        return Optional.ofNullable(this.currentScenarioStatusDescription);
    }
    /**
     * The failover deployment model.
     * 
    */
    public Optional<String> failoverDeploymentModel() {
        return Optional.ofNullable(this.failoverDeploymentModel);
    }
    /**
     * The friendly name.
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The recovery plan groups.
     * 
    */
    public List<RecoveryPlanGroupResponse> groups() {
        return this.groups == null ? List.of() : this.groups;
    }
    /**
     * The start time of the last planned failover.
     * 
    */
    public Optional<String> lastPlannedFailoverTime() {
        return Optional.ofNullable(this.lastPlannedFailoverTime);
    }
    /**
     * The start time of the last test failover.
     * 
    */
    public Optional<String> lastTestFailoverTime() {
        return Optional.ofNullable(this.lastTestFailoverTime);
    }
    /**
     * The start time of the last unplanned failover.
     * 
    */
    public Optional<String> lastUnplannedFailoverTime() {
        return Optional.ofNullable(this.lastUnplannedFailoverTime);
    }
    /**
     * The primary fabric friendly name.
     * 
    */
    public Optional<String> primaryFabricFriendlyName() {
        return Optional.ofNullable(this.primaryFabricFriendlyName);
    }
    /**
     * The primary fabric Id.
     * 
    */
    public Optional<String> primaryFabricId() {
        return Optional.ofNullable(this.primaryFabricId);
    }
    /**
     * The provider id and provider specific details.
     * 
    */
    public List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails() {
        return this.providerSpecificDetails;
    }
    /**
     * The recovery fabric friendly name.
     * 
    */
    public Optional<String> recoveryFabricFriendlyName() {
        return Optional.ofNullable(this.recoveryFabricFriendlyName);
    }
    /**
     * The recovery fabric Id.
     * 
    */
    public Optional<String> recoveryFabricId() {
        return Optional.ofNullable(this.recoveryFabricId);
    }
    /**
     * The list of replication providers.
     * 
    */
    public List<String> replicationProviders() {
        return this.replicationProviders == null ? List.of() : this.replicationProviders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedOperations;
        private @Nullable CurrentScenarioDetailsResponse currentScenario;
        private @Nullable String currentScenarioStatus;
        private @Nullable String currentScenarioStatusDescription;
        private @Nullable String failoverDeploymentModel;
        private @Nullable String friendlyName;
        private @Nullable List<RecoveryPlanGroupResponse> groups;
        private @Nullable String lastPlannedFailoverTime;
        private @Nullable String lastTestFailoverTime;
        private @Nullable String lastUnplannedFailoverTime;
        private @Nullable String primaryFabricFriendlyName;
        private @Nullable String primaryFabricId;
        private List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails;
        private @Nullable String recoveryFabricFriendlyName;
        private @Nullable String recoveryFabricId;
        private @Nullable List<String> replicationProviders;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOperations = defaults.allowedOperations;
    	      this.currentScenario = defaults.currentScenario;
    	      this.currentScenarioStatus = defaults.currentScenarioStatus;
    	      this.currentScenarioStatusDescription = defaults.currentScenarioStatusDescription;
    	      this.failoverDeploymentModel = defaults.failoverDeploymentModel;
    	      this.friendlyName = defaults.friendlyName;
    	      this.groups = defaults.groups;
    	      this.lastPlannedFailoverTime = defaults.lastPlannedFailoverTime;
    	      this.lastTestFailoverTime = defaults.lastTestFailoverTime;
    	      this.lastUnplannedFailoverTime = defaults.lastUnplannedFailoverTime;
    	      this.primaryFabricFriendlyName = defaults.primaryFabricFriendlyName;
    	      this.primaryFabricId = defaults.primaryFabricId;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
    	      this.recoveryFabricFriendlyName = defaults.recoveryFabricFriendlyName;
    	      this.recoveryFabricId = defaults.recoveryFabricId;
    	      this.replicationProviders = defaults.replicationProviders;
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
        public Builder currentScenarioStatus(@Nullable String currentScenarioStatus) {
            this.currentScenarioStatus = currentScenarioStatus;
            return this;
        }
        public Builder currentScenarioStatusDescription(@Nullable String currentScenarioStatusDescription) {
            this.currentScenarioStatusDescription = currentScenarioStatusDescription;
            return this;
        }
        public Builder failoverDeploymentModel(@Nullable String failoverDeploymentModel) {
            this.failoverDeploymentModel = failoverDeploymentModel;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder groups(@Nullable List<RecoveryPlanGroupResponse> groups) {
            this.groups = groups;
            return this;
        }
        public Builder groups(RecoveryPlanGroupResponse... groups) {
            return groups(List.of(groups));
        }
        public Builder lastPlannedFailoverTime(@Nullable String lastPlannedFailoverTime) {
            this.lastPlannedFailoverTime = lastPlannedFailoverTime;
            return this;
        }
        public Builder lastTestFailoverTime(@Nullable String lastTestFailoverTime) {
            this.lastTestFailoverTime = lastTestFailoverTime;
            return this;
        }
        public Builder lastUnplannedFailoverTime(@Nullable String lastUnplannedFailoverTime) {
            this.lastUnplannedFailoverTime = lastUnplannedFailoverTime;
            return this;
        }
        public Builder primaryFabricFriendlyName(@Nullable String primaryFabricFriendlyName) {
            this.primaryFabricFriendlyName = primaryFabricFriendlyName;
            return this;
        }
        public Builder primaryFabricId(@Nullable String primaryFabricId) {
            this.primaryFabricId = primaryFabricId;
            return this;
        }
        public Builder providerSpecificDetails(List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails) {
            this.providerSpecificDetails = Objects.requireNonNull(providerSpecificDetails);
            return this;
        }
        public Builder providerSpecificDetails(RecoveryPlanA2ADetailsResponse... providerSpecificDetails) {
            return providerSpecificDetails(List.of(providerSpecificDetails));
        }
        public Builder recoveryFabricFriendlyName(@Nullable String recoveryFabricFriendlyName) {
            this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
            return this;
        }
        public Builder recoveryFabricId(@Nullable String recoveryFabricId) {
            this.recoveryFabricId = recoveryFabricId;
            return this;
        }
        public Builder replicationProviders(@Nullable List<String> replicationProviders) {
            this.replicationProviders = replicationProviders;
            return this;
        }
        public Builder replicationProviders(String... replicationProviders) {
            return replicationProviders(List.of(replicationProviders));
        }        public RecoveryPlanPropertiesResponse build() {
            return new RecoveryPlanPropertiesResponse(allowedOperations, currentScenario, currentScenarioStatus, currentScenarioStatusDescription, failoverDeploymentModel, friendlyName, groups, lastPlannedFailoverTime, lastTestFailoverTime, lastUnplannedFailoverTime, primaryFabricFriendlyName, primaryFabricId, providerSpecificDetails, recoveryFabricFriendlyName, recoveryFabricId, replicationProviders);
        }
    }
}
