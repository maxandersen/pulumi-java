// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.azurenative.migrate.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectPropertiesResponse {
    /**
     * Assessment solution ARM id tracked by Microsoft.Migrate/migrateProjects.
     * 
     */
    private final @Nullable String assessmentSolutionId;
    /**
     * Time when this project was created. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String createdTimestamp;
    /**
     * The ARM id of the storage account used for interactions when public access is disabled.
     * 
     */
    private final @Nullable String customerStorageAccountArmId;
    /**
     * The ARM id of service map workspace created by customer.
     * 
     */
    private final @Nullable String customerWorkspaceId;
    /**
     * Location of service map workspace created by customer.
     * 
     */
    private final @Nullable String customerWorkspaceLocation;
    /**
     * Time when last assessment was created. Date-Time represented in ISO-8601 format. This value will be null until assessment is created.
     * 
     */
    private final String lastAssessmentTimestamp;
    /**
     * Number of assessments created in the project.
     * 
     */
    private final Integer numberOfAssessments;
    /**
     * Number of groups created in the project.
     * 
     */
    private final Integer numberOfGroups;
    /**
     * Number of machines in the project.
     * 
     */
    private final Integer numberOfMachines;
    /**
     * The list of private endpoint connections to the project.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Assessment project status.
     * 
     */
    private final @Nullable String projectStatus;
    /**
     * Provisioning state of the project.
     * 
     */
    private final String provisioningState;
    /**
     * This value can be set to &#39;enabled&#39; to avoid breaking changes on existing customer resources and templates. If set to &#39;disabled&#39;, traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method.
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * Endpoint at which the collector agent can call agent REST API.
     * 
     */
    private final String serviceEndpoint;
    /**
     * Time when this project was last updated. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String updatedTimestamp;

    @CustomType.Constructor
    private ProjectPropertiesResponse(
        @CustomType.Parameter("assessmentSolutionId") @Nullable String assessmentSolutionId,
        @CustomType.Parameter("createdTimestamp") String createdTimestamp,
        @CustomType.Parameter("customerStorageAccountArmId") @Nullable String customerStorageAccountArmId,
        @CustomType.Parameter("customerWorkspaceId") @Nullable String customerWorkspaceId,
        @CustomType.Parameter("customerWorkspaceLocation") @Nullable String customerWorkspaceLocation,
        @CustomType.Parameter("lastAssessmentTimestamp") String lastAssessmentTimestamp,
        @CustomType.Parameter("numberOfAssessments") Integer numberOfAssessments,
        @CustomType.Parameter("numberOfGroups") Integer numberOfGroups,
        @CustomType.Parameter("numberOfMachines") Integer numberOfMachines,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("projectStatus") @Nullable String projectStatus,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @CustomType.Parameter("serviceEndpoint") String serviceEndpoint,
        @CustomType.Parameter("updatedTimestamp") String updatedTimestamp) {
        this.assessmentSolutionId = assessmentSolutionId;
        this.createdTimestamp = createdTimestamp;
        this.customerStorageAccountArmId = customerStorageAccountArmId;
        this.customerWorkspaceId = customerWorkspaceId;
        this.customerWorkspaceLocation = customerWorkspaceLocation;
        this.lastAssessmentTimestamp = lastAssessmentTimestamp;
        this.numberOfAssessments = numberOfAssessments;
        this.numberOfGroups = numberOfGroups;
        this.numberOfMachines = numberOfMachines;
        this.privateEndpointConnections = privateEndpointConnections;
        this.projectStatus = projectStatus;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
        this.serviceEndpoint = serviceEndpoint;
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * Assessment solution ARM id tracked by Microsoft.Migrate/migrateProjects.
     * 
    */
    public Optional<String> assessmentSolutionId() {
        return Optional.ofNullable(this.assessmentSolutionId);
    }
    /**
     * Time when this project was created. Date-Time represented in ISO-8601 format.
     * 
    */
    public String createdTimestamp() {
        return this.createdTimestamp;
    }
    /**
     * The ARM id of the storage account used for interactions when public access is disabled.
     * 
    */
    public Optional<String> customerStorageAccountArmId() {
        return Optional.ofNullable(this.customerStorageAccountArmId);
    }
    /**
     * The ARM id of service map workspace created by customer.
     * 
    */
    public Optional<String> customerWorkspaceId() {
        return Optional.ofNullable(this.customerWorkspaceId);
    }
    /**
     * Location of service map workspace created by customer.
     * 
    */
    public Optional<String> customerWorkspaceLocation() {
        return Optional.ofNullable(this.customerWorkspaceLocation);
    }
    /**
     * Time when last assessment was created. Date-Time represented in ISO-8601 format. This value will be null until assessment is created.
     * 
    */
    public String lastAssessmentTimestamp() {
        return this.lastAssessmentTimestamp;
    }
    /**
     * Number of assessments created in the project.
     * 
    */
    public Integer numberOfAssessments() {
        return this.numberOfAssessments;
    }
    /**
     * Number of groups created in the project.
     * 
    */
    public Integer numberOfGroups() {
        return this.numberOfGroups;
    }
    /**
     * Number of machines in the project.
     * 
    */
    public Integer numberOfMachines() {
        return this.numberOfMachines;
    }
    /**
     * The list of private endpoint connections to the project.
     * 
    */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Assessment project status.
     * 
    */
    public Optional<String> projectStatus() {
        return Optional.ofNullable(this.projectStatus);
    }
    /**
     * Provisioning state of the project.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * This value can be set to &#39;enabled&#39; to avoid breaking changes on existing customer resources and templates. If set to &#39;disabled&#39;, traffic over public interface is not allowed, and private endpoint connections would be the exclusive access method.
     * 
    */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * Endpoint at which the collector agent can call agent REST API.
     * 
    */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * Time when this project was last updated. Date-Time represented in ISO-8601 format.
     * 
    */
    public String updatedTimestamp() {
        return this.updatedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String assessmentSolutionId;
        private String createdTimestamp;
        private @Nullable String customerStorageAccountArmId;
        private @Nullable String customerWorkspaceId;
        private @Nullable String customerWorkspaceLocation;
        private String lastAssessmentTimestamp;
        private Integer numberOfAssessments;
        private Integer numberOfGroups;
        private Integer numberOfMachines;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable String projectStatus;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private String serviceEndpoint;
        private String updatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentSolutionId = defaults.assessmentSolutionId;
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.customerStorageAccountArmId = defaults.customerStorageAccountArmId;
    	      this.customerWorkspaceId = defaults.customerWorkspaceId;
    	      this.customerWorkspaceLocation = defaults.customerWorkspaceLocation;
    	      this.lastAssessmentTimestamp = defaults.lastAssessmentTimestamp;
    	      this.numberOfAssessments = defaults.numberOfAssessments;
    	      this.numberOfGroups = defaults.numberOfGroups;
    	      this.numberOfMachines = defaults.numberOfMachines;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.projectStatus = defaults.projectStatus;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
        }

        public Builder assessmentSolutionId(@Nullable String assessmentSolutionId) {
            this.assessmentSolutionId = assessmentSolutionId;
            return this;
        }
        public Builder createdTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }
        public Builder customerStorageAccountArmId(@Nullable String customerStorageAccountArmId) {
            this.customerStorageAccountArmId = customerStorageAccountArmId;
            return this;
        }
        public Builder customerWorkspaceId(@Nullable String customerWorkspaceId) {
            this.customerWorkspaceId = customerWorkspaceId;
            return this;
        }
        public Builder customerWorkspaceLocation(@Nullable String customerWorkspaceLocation) {
            this.customerWorkspaceLocation = customerWorkspaceLocation;
            return this;
        }
        public Builder lastAssessmentTimestamp(String lastAssessmentTimestamp) {
            this.lastAssessmentTimestamp = Objects.requireNonNull(lastAssessmentTimestamp);
            return this;
        }
        public Builder numberOfAssessments(Integer numberOfAssessments) {
            this.numberOfAssessments = Objects.requireNonNull(numberOfAssessments);
            return this;
        }
        public Builder numberOfGroups(Integer numberOfGroups) {
            this.numberOfGroups = Objects.requireNonNull(numberOfGroups);
            return this;
        }
        public Builder numberOfMachines(Integer numberOfMachines) {
            this.numberOfMachines = Objects.requireNonNull(numberOfMachines);
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder projectStatus(@Nullable String projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }
        public Builder updatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }        public ProjectPropertiesResponse build() {
            return new ProjectPropertiesResponse(assessmentSolutionId, createdTimestamp, customerStorageAccountArmId, customerWorkspaceId, customerWorkspaceLocation, lastAssessmentTimestamp, numberOfAssessments, numberOfGroups, numberOfMachines, privateEndpointConnections, projectStatus, provisioningState, publicNetworkAccess, serviceEndpoint, updatedTimestamp);
        }
    }
}
