// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceApplicationResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceConnectivityEndpointsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceCreatedByResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceLastOperationResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceSshSettingsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.MachineLearningServiceErrorResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.PersonalComputeInstanceSettingsResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.ResourceIdResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.SetupScriptsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Compute Instance properties
 * 
 */
public final class ComputeInstanceResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final ComputeInstanceResponseProperties Empty = new ComputeInstanceResponseProperties();

    /**
     * Policy for sharing applications on this compute instance among users of parent workspace. If Personal, only the creator can access applications on this compute instance. When Shared, any workspace user can access applications on this instance depending on his/her assigned role.
     * 
     */
    @Import(name="applicationSharingPolicy")
      private final @Nullable String applicationSharingPolicy;

    public Optional<String> applicationSharingPolicy() {
        return this.applicationSharingPolicy == null ? Optional.empty() : Optional.ofNullable(this.applicationSharingPolicy);
    }

    /**
     * Describes available applications and their endpoints on this ComputeInstance.
     * 
     */
    @Import(name="applications", required=true)
      private final List<ComputeInstanceApplicationResponse> applications;

    public List<ComputeInstanceApplicationResponse> applications() {
        return this.applications;
    }

    /**
     * The Compute Instance Authorization type. Available values are personal (default).
     * 
     */
    @Import(name="computeInstanceAuthorizationType")
      private final @Nullable String computeInstanceAuthorizationType;

    public Optional<String> computeInstanceAuthorizationType() {
        return this.computeInstanceAuthorizationType == null ? Optional.empty() : Optional.ofNullable(this.computeInstanceAuthorizationType);
    }

    /**
     * Describes all connectivity endpoints available for this ComputeInstance.
     * 
     */
    @Import(name="connectivityEndpoints", required=true)
      private final ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints;

    public ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints() {
        return this.connectivityEndpoints;
    }

    /**
     * Describes information on user who created this ComputeInstance.
     * 
     */
    @Import(name="createdBy", required=true)
      private final ComputeInstanceCreatedByResponse createdBy;

    public ComputeInstanceCreatedByResponse createdBy() {
        return this.createdBy;
    }

    /**
     * Collection of errors encountered on this ComputeInstance.
     * 
     */
    @Import(name="errors", required=true)
      private final List<MachineLearningServiceErrorResponse> errors;

    public List<MachineLearningServiceErrorResponse> errors() {
        return this.errors;
    }

    /**
     * The last operation on ComputeInstance.
     * 
     */
    @Import(name="lastOperation", required=true)
      private final ComputeInstanceLastOperationResponse lastOperation;

    public ComputeInstanceLastOperationResponse lastOperation() {
        return this.lastOperation;
    }

    /**
     * Settings for a personal compute instance.
     * 
     */
    @Import(name="personalComputeInstanceSettings")
      private final @Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings;

    public Optional<PersonalComputeInstanceSettingsResponse> personalComputeInstanceSettings() {
        return this.personalComputeInstanceSettings == null ? Optional.empty() : Optional.ofNullable(this.personalComputeInstanceSettings);
    }

    /**
     * Details of customized scripts to execute for setting up the cluster.
     * 
     */
    @Import(name="setupScripts")
      private final @Nullable SetupScriptsResponse setupScripts;

    public Optional<SetupScriptsResponse> setupScripts() {
        return this.setupScripts == null ? Optional.empty() : Optional.ofNullable(this.setupScripts);
    }

    /**
     * Specifies policy and settings for SSH access.
     * 
     */
    @Import(name="sshSettings")
      private final @Nullable ComputeInstanceSshSettingsResponse sshSettings;

    public Optional<ComputeInstanceSshSettingsResponse> sshSettings() {
        return this.sshSettings == null ? Optional.empty() : Optional.ofNullable(this.sshSettings);
    }

    /**
     * The current state of this ComputeInstance.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * Virtual network subnet resource ID the compute nodes belong to.
     * 
     */
    @Import(name="subnet")
      private final @Nullable ResourceIdResponse subnet;

    public Optional<ResourceIdResponse> subnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    /**
     * Virtual Machine Size
     * 
     */
    @Import(name="vmSize")
      private final @Nullable String vmSize;

    public Optional<String> vmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    public ComputeInstanceResponseProperties(
        @Nullable String applicationSharingPolicy,
        List<ComputeInstanceApplicationResponse> applications,
        @Nullable String computeInstanceAuthorizationType,
        ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints,
        ComputeInstanceCreatedByResponse createdBy,
        List<MachineLearningServiceErrorResponse> errors,
        ComputeInstanceLastOperationResponse lastOperation,
        @Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings,
        @Nullable SetupScriptsResponse setupScripts,
        @Nullable ComputeInstanceSshSettingsResponse sshSettings,
        String state,
        @Nullable ResourceIdResponse subnet,
        @Nullable String vmSize) {
        this.applicationSharingPolicy = applicationSharingPolicy == null ? "Shared" : applicationSharingPolicy;
        this.applications = Objects.requireNonNull(applications, "expected parameter 'applications' to be non-null");
        this.computeInstanceAuthorizationType = computeInstanceAuthorizationType == null ? "personal" : computeInstanceAuthorizationType;
        this.connectivityEndpoints = Objects.requireNonNull(connectivityEndpoints, "expected parameter 'connectivityEndpoints' to be non-null");
        this.createdBy = Objects.requireNonNull(createdBy, "expected parameter 'createdBy' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.lastOperation = Objects.requireNonNull(lastOperation, "expected parameter 'lastOperation' to be non-null");
        this.personalComputeInstanceSettings = personalComputeInstanceSettings;
        this.setupScripts = setupScripts;
        this.sshSettings = sshSettings;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.subnet = subnet;
        this.vmSize = vmSize;
    }

    private ComputeInstanceResponseProperties() {
        this.applicationSharingPolicy = null;
        this.applications = List.of();
        this.computeInstanceAuthorizationType = null;
        this.connectivityEndpoints = null;
        this.createdBy = null;
        this.errors = List.of();
        this.lastOperation = null;
        this.personalComputeInstanceSettings = null;
        this.setupScripts = null;
        this.sshSettings = null;
        this.state = null;
        this.subnet = null;
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationSharingPolicy;
        private List<ComputeInstanceApplicationResponse> applications;
        private @Nullable String computeInstanceAuthorizationType;
        private ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints;
        private ComputeInstanceCreatedByResponse createdBy;
        private List<MachineLearningServiceErrorResponse> errors;
        private ComputeInstanceLastOperationResponse lastOperation;
        private @Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings;
        private @Nullable SetupScriptsResponse setupScripts;
        private @Nullable ComputeInstanceSshSettingsResponse sshSettings;
        private String state;
        private @Nullable ResourceIdResponse subnet;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationSharingPolicy = defaults.applicationSharingPolicy;
    	      this.applications = defaults.applications;
    	      this.computeInstanceAuthorizationType = defaults.computeInstanceAuthorizationType;
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.createdBy = defaults.createdBy;
    	      this.errors = defaults.errors;
    	      this.lastOperation = defaults.lastOperation;
    	      this.personalComputeInstanceSettings = defaults.personalComputeInstanceSettings;
    	      this.setupScripts = defaults.setupScripts;
    	      this.sshSettings = defaults.sshSettings;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder applicationSharingPolicy(@Nullable String applicationSharingPolicy) {
            this.applicationSharingPolicy = applicationSharingPolicy;
            return this;
        }
        public Builder applications(List<ComputeInstanceApplicationResponse> applications) {
            this.applications = Objects.requireNonNull(applications);
            return this;
        }
        public Builder applications(ComputeInstanceApplicationResponse... applications) {
            return applications(List.of(applications));
        }
        public Builder computeInstanceAuthorizationType(@Nullable String computeInstanceAuthorizationType) {
            this.computeInstanceAuthorizationType = computeInstanceAuthorizationType;
            return this;
        }
        public Builder connectivityEndpoints(ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints) {
            this.connectivityEndpoints = Objects.requireNonNull(connectivityEndpoints);
            return this;
        }
        public Builder createdBy(ComputeInstanceCreatedByResponse createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder errors(List<MachineLearningServiceErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(MachineLearningServiceErrorResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder lastOperation(ComputeInstanceLastOperationResponse lastOperation) {
            this.lastOperation = Objects.requireNonNull(lastOperation);
            return this;
        }
        public Builder personalComputeInstanceSettings(@Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings) {
            this.personalComputeInstanceSettings = personalComputeInstanceSettings;
            return this;
        }
        public Builder setupScripts(@Nullable SetupScriptsResponse setupScripts) {
            this.setupScripts = setupScripts;
            return this;
        }
        public Builder sshSettings(@Nullable ComputeInstanceSshSettingsResponse sshSettings) {
            this.sshSettings = sshSettings;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnet(@Nullable ResourceIdResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }        public ComputeInstanceResponseProperties build() {
            return new ComputeInstanceResponseProperties(applicationSharingPolicy, applications, computeInstanceAuthorizationType, connectivityEndpoints, createdBy, errors, lastOperation, personalComputeInstanceSettings, setupScripts, sshSettings, state, subnet, vmSize);
        }
    }
}
