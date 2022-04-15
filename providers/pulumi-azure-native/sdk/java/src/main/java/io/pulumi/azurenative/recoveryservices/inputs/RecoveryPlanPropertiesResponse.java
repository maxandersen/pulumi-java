// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.CurrentScenarioDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanA2ADetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanGroupResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Recovery plan custom details.
 * 
 */
public final class RecoveryPlanPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecoveryPlanPropertiesResponse Empty = new RecoveryPlanPropertiesResponse();

    /**
     * The list of allowed operations.
     * 
     */
    @Import(name="allowedOperations")
      private final @Nullable List<String> allowedOperations;

    public List<String> allowedOperations() {
        return this.allowedOperations == null ? List.of() : this.allowedOperations;
    }

    /**
     * The current scenario details.
     * 
     */
    @Import(name="currentScenario")
      private final @Nullable CurrentScenarioDetailsResponse currentScenario;

    public Optional<CurrentScenarioDetailsResponse> currentScenario() {
        return this.currentScenario == null ? Optional.empty() : Optional.ofNullable(this.currentScenario);
    }

    /**
     * The recovery plan status.
     * 
     */
    @Import(name="currentScenarioStatus")
      private final @Nullable String currentScenarioStatus;

    public Optional<String> currentScenarioStatus() {
        return this.currentScenarioStatus == null ? Optional.empty() : Optional.ofNullable(this.currentScenarioStatus);
    }

    /**
     * The recovery plan status description.
     * 
     */
    @Import(name="currentScenarioStatusDescription")
      private final @Nullable String currentScenarioStatusDescription;

    public Optional<String> currentScenarioStatusDescription() {
        return this.currentScenarioStatusDescription == null ? Optional.empty() : Optional.ofNullable(this.currentScenarioStatusDescription);
    }

    /**
     * The failover deployment model.
     * 
     */
    @Import(name="failoverDeploymentModel")
      private final @Nullable String failoverDeploymentModel;

    public Optional<String> failoverDeploymentModel() {
        return this.failoverDeploymentModel == null ? Optional.empty() : Optional.ofNullable(this.failoverDeploymentModel);
    }

    /**
     * The friendly name.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> friendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * The recovery plan groups.
     * 
     */
    @Import(name="groups")
      private final @Nullable List<RecoveryPlanGroupResponse> groups;

    public List<RecoveryPlanGroupResponse> groups() {
        return this.groups == null ? List.of() : this.groups;
    }

    /**
     * The start time of the last planned failover.
     * 
     */
    @Import(name="lastPlannedFailoverTime")
      private final @Nullable String lastPlannedFailoverTime;

    public Optional<String> lastPlannedFailoverTime() {
        return this.lastPlannedFailoverTime == null ? Optional.empty() : Optional.ofNullable(this.lastPlannedFailoverTime);
    }

    /**
     * The start time of the last test failover.
     * 
     */
    @Import(name="lastTestFailoverTime")
      private final @Nullable String lastTestFailoverTime;

    public Optional<String> lastTestFailoverTime() {
        return this.lastTestFailoverTime == null ? Optional.empty() : Optional.ofNullable(this.lastTestFailoverTime);
    }

    /**
     * The start time of the last unplanned failover.
     * 
     */
    @Import(name="lastUnplannedFailoverTime")
      private final @Nullable String lastUnplannedFailoverTime;

    public Optional<String> lastUnplannedFailoverTime() {
        return this.lastUnplannedFailoverTime == null ? Optional.empty() : Optional.ofNullable(this.lastUnplannedFailoverTime);
    }

    /**
     * The primary fabric friendly name.
     * 
     */
    @Import(name="primaryFabricFriendlyName")
      private final @Nullable String primaryFabricFriendlyName;

    public Optional<String> primaryFabricFriendlyName() {
        return this.primaryFabricFriendlyName == null ? Optional.empty() : Optional.ofNullable(this.primaryFabricFriendlyName);
    }

    /**
     * The primary fabric Id.
     * 
     */
    @Import(name="primaryFabricId")
      private final @Nullable String primaryFabricId;

    public Optional<String> primaryFabricId() {
        return this.primaryFabricId == null ? Optional.empty() : Optional.ofNullable(this.primaryFabricId);
    }

    /**
     * The provider id and provider specific details.
     * 
     */
    @Import(name="providerSpecificDetails", required=true)
      private final List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails;

    public List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * The recovery fabric friendly name.
     * 
     */
    @Import(name="recoveryFabricFriendlyName")
      private final @Nullable String recoveryFabricFriendlyName;

    public Optional<String> recoveryFabricFriendlyName() {
        return this.recoveryFabricFriendlyName == null ? Optional.empty() : Optional.ofNullable(this.recoveryFabricFriendlyName);
    }

    /**
     * The recovery fabric Id.
     * 
     */
    @Import(name="recoveryFabricId")
      private final @Nullable String recoveryFabricId;

    public Optional<String> recoveryFabricId() {
        return this.recoveryFabricId == null ? Optional.empty() : Optional.ofNullable(this.recoveryFabricId);
    }

    /**
     * The list of replication providers.
     * 
     */
    @Import(name="replicationProviders")
      private final @Nullable List<String> replicationProviders;

    public List<String> replicationProviders() {
        return this.replicationProviders == null ? List.of() : this.replicationProviders;
    }

    public RecoveryPlanPropertiesResponse(
        @Nullable List<String> allowedOperations,
        @Nullable CurrentScenarioDetailsResponse currentScenario,
        @Nullable String currentScenarioStatus,
        @Nullable String currentScenarioStatusDescription,
        @Nullable String failoverDeploymentModel,
        @Nullable String friendlyName,
        @Nullable List<RecoveryPlanGroupResponse> groups,
        @Nullable String lastPlannedFailoverTime,
        @Nullable String lastTestFailoverTime,
        @Nullable String lastUnplannedFailoverTime,
        @Nullable String primaryFabricFriendlyName,
        @Nullable String primaryFabricId,
        List<RecoveryPlanA2ADetailsResponse> providerSpecificDetails,
        @Nullable String recoveryFabricFriendlyName,
        @Nullable String recoveryFabricId,
        @Nullable List<String> replicationProviders) {
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
        this.providerSpecificDetails = Objects.requireNonNull(providerSpecificDetails, "expected parameter 'providerSpecificDetails' to be non-null");
        this.recoveryFabricFriendlyName = recoveryFabricFriendlyName;
        this.recoveryFabricId = recoveryFabricId;
        this.replicationProviders = replicationProviders;
    }

    private RecoveryPlanPropertiesResponse() {
        this.allowedOperations = List.of();
        this.currentScenario = null;
        this.currentScenarioStatus = null;
        this.currentScenarioStatusDescription = null;
        this.failoverDeploymentModel = null;
        this.friendlyName = null;
        this.groups = List.of();
        this.lastPlannedFailoverTime = null;
        this.lastTestFailoverTime = null;
        this.lastUnplannedFailoverTime = null;
        this.primaryFabricFriendlyName = null;
        this.primaryFabricId = null;
        this.providerSpecificDetails = List.of();
        this.recoveryFabricFriendlyName = null;
        this.recoveryFabricId = null;
        this.replicationProviders = List.of();
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
