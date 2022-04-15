// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.CurrentJobDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VMwareCbtMigrationDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Migration item properties.
 * 
 */
public final class MigrationItemPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationItemPropertiesResponse Empty = new MigrationItemPropertiesResponse();

    /**
     * The allowed operations on the migration item, based on the current migration state of the item.
     * 
     */
    @Import(name="allowedOperations", required=true)
      private final List<String> allowedOperations;

    public List<String> allowedOperations() {
        return this.allowedOperations;
    }

    /**
     * The current job details.
     * 
     */
    @Import(name="currentJob", required=true)
      private final CurrentJobDetailsResponse currentJob;

    public CurrentJobDetailsResponse currentJob() {
        return this.currentJob;
    }

    /**
     * The consolidated health.
     * 
     */
    @Import(name="health", required=true)
      private final String health;

    public String health() {
        return this.health;
    }

    /**
     * The list of health errors.
     * 
     */
    @Import(name="healthErrors", required=true)
      private final List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> healthErrors() {
        return this.healthErrors;
    }

    /**
     * The on-premise virtual machine name.
     * 
     */
    @Import(name="machineName", required=true)
      private final String machineName;

    public String machineName() {
        return this.machineName;
    }

    /**
     * The migration status.
     * 
     */
    @Import(name="migrationState", required=true)
      private final String migrationState;

    public String migrationState() {
        return this.migrationState;
    }

    /**
     * The migration state description.
     * 
     */
    @Import(name="migrationStateDescription", required=true)
      private final String migrationStateDescription;

    public String migrationStateDescription() {
        return this.migrationStateDescription;
    }

    /**
     * The name of policy governing this item.
     * 
     */
    @Import(name="policyFriendlyName", required=true)
      private final String policyFriendlyName;

    public String policyFriendlyName() {
        return this.policyFriendlyName;
    }

    /**
     * The ARM Id of policy governing this item.
     * 
     */
    @Import(name="policyId", required=true)
      private final String policyId;

    public String policyId() {
        return this.policyId;
    }

    /**
     * The migration provider custom settings.
     * 
     */
    @Import(name="providerSpecificDetails")
      private final @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails;

    public Optional<VMwareCbtMigrationDetailsResponse> providerSpecificDetails() {
        return this.providerSpecificDetails == null ? Optional.empty() : Optional.ofNullable(this.providerSpecificDetails);
    }

    /**
     * The recovery services provider ARM Id.
     * 
     */
    @Import(name="recoveryServicesProviderId", required=true)
      private final String recoveryServicesProviderId;

    public String recoveryServicesProviderId() {
        return this.recoveryServicesProviderId;
    }

    /**
     * The test migrate state.
     * 
     */
    @Import(name="testMigrateState", required=true)
      private final String testMigrateState;

    public String testMigrateState() {
        return this.testMigrateState;
    }

    /**
     * The test migrate state description.
     * 
     */
    @Import(name="testMigrateStateDescription", required=true)
      private final String testMigrateStateDescription;

    public String testMigrateStateDescription() {
        return this.testMigrateStateDescription;
    }

    public MigrationItemPropertiesResponse(
        List<String> allowedOperations,
        CurrentJobDetailsResponse currentJob,
        String health,
        List<HealthErrorResponse> healthErrors,
        String machineName,
        String migrationState,
        String migrationStateDescription,
        String policyFriendlyName,
        String policyId,
        @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails,
        String recoveryServicesProviderId,
        String testMigrateState,
        String testMigrateStateDescription) {
        this.allowedOperations = Objects.requireNonNull(allowedOperations, "expected parameter 'allowedOperations' to be non-null");
        this.currentJob = Objects.requireNonNull(currentJob, "expected parameter 'currentJob' to be non-null");
        this.health = Objects.requireNonNull(health, "expected parameter 'health' to be non-null");
        this.healthErrors = Objects.requireNonNull(healthErrors, "expected parameter 'healthErrors' to be non-null");
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.migrationState = Objects.requireNonNull(migrationState, "expected parameter 'migrationState' to be non-null");
        this.migrationStateDescription = Objects.requireNonNull(migrationStateDescription, "expected parameter 'migrationStateDescription' to be non-null");
        this.policyFriendlyName = Objects.requireNonNull(policyFriendlyName, "expected parameter 'policyFriendlyName' to be non-null");
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.providerSpecificDetails = providerSpecificDetails;
        this.recoveryServicesProviderId = Objects.requireNonNull(recoveryServicesProviderId, "expected parameter 'recoveryServicesProviderId' to be non-null");
        this.testMigrateState = Objects.requireNonNull(testMigrateState, "expected parameter 'testMigrateState' to be non-null");
        this.testMigrateStateDescription = Objects.requireNonNull(testMigrateStateDescription, "expected parameter 'testMigrateStateDescription' to be non-null");
    }

    private MigrationItemPropertiesResponse() {
        this.allowedOperations = List.of();
        this.currentJob = null;
        this.health = null;
        this.healthErrors = List.of();
        this.machineName = null;
        this.migrationState = null;
        this.migrationStateDescription = null;
        this.policyFriendlyName = null;
        this.policyId = null;
        this.providerSpecificDetails = null;
        this.recoveryServicesProviderId = null;
        this.testMigrateState = null;
        this.testMigrateStateDescription = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationItemPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedOperations;
        private CurrentJobDetailsResponse currentJob;
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String machineName;
        private String migrationState;
        private String migrationStateDescription;
        private String policyFriendlyName;
        private String policyId;
        private @Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails;
        private String recoveryServicesProviderId;
        private String testMigrateState;
        private String testMigrateStateDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationItemPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOperations = defaults.allowedOperations;
    	      this.currentJob = defaults.currentJob;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.machineName = defaults.machineName;
    	      this.migrationState = defaults.migrationState;
    	      this.migrationStateDescription = defaults.migrationStateDescription;
    	      this.policyFriendlyName = defaults.policyFriendlyName;
    	      this.policyId = defaults.policyId;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
    	      this.recoveryServicesProviderId = defaults.recoveryServicesProviderId;
    	      this.testMigrateState = defaults.testMigrateState;
    	      this.testMigrateStateDescription = defaults.testMigrateStateDescription;
        }

        public Builder allowedOperations(List<String> allowedOperations) {
            this.allowedOperations = Objects.requireNonNull(allowedOperations);
            return this;
        }
        public Builder allowedOperations(String... allowedOperations) {
            return allowedOperations(List.of(allowedOperations));
        }
        public Builder currentJob(CurrentJobDetailsResponse currentJob) {
            this.currentJob = Objects.requireNonNull(currentJob);
            return this;
        }
        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder healthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }
        public Builder healthErrors(HealthErrorResponse... healthErrors) {
            return healthErrors(List.of(healthErrors));
        }
        public Builder machineName(String machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }
        public Builder migrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }
        public Builder migrationStateDescription(String migrationStateDescription) {
            this.migrationStateDescription = Objects.requireNonNull(migrationStateDescription);
            return this;
        }
        public Builder policyFriendlyName(String policyFriendlyName) {
            this.policyFriendlyName = Objects.requireNonNull(policyFriendlyName);
            return this;
        }
        public Builder policyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }
        public Builder providerSpecificDetails(@Nullable VMwareCbtMigrationDetailsResponse providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }
        public Builder recoveryServicesProviderId(String recoveryServicesProviderId) {
            this.recoveryServicesProviderId = Objects.requireNonNull(recoveryServicesProviderId);
            return this;
        }
        public Builder testMigrateState(String testMigrateState) {
            this.testMigrateState = Objects.requireNonNull(testMigrateState);
            return this;
        }
        public Builder testMigrateStateDescription(String testMigrateStateDescription) {
            this.testMigrateStateDescription = Objects.requireNonNull(testMigrateStateDescription);
            return this;
        }        public MigrationItemPropertiesResponse build() {
            return new MigrationItemPropertiesResponse(allowedOperations, currentJob, health, healthErrors, machineName, migrationState, migrationStateDescription, policyFriendlyName, policyId, providerSpecificDetails, recoveryServicesProviderId, testMigrateState, testMigrateStateDescription);
        }
    }
}
