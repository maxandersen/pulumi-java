// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata;

import com.pulumi.azurenative.hybriddata.enums.RunLocation;
import com.pulumi.azurenative.hybriddata.enums.State;
import com.pulumi.azurenative.hybriddata.enums.UserConfirmation;
import com.pulumi.azurenative.hybriddata.inputs.CustomerSecretArgs;
import com.pulumi.azurenative.hybriddata.inputs.ScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobDefinitionArgs Empty = new JobDefinitionArgs();

    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    @Import(name="customerSecrets")
      private final @Nullable Output<List<CustomerSecretArgs>> customerSecrets;

    public Output<List<CustomerSecretArgs>> customerSecrets() {
        return this.customerSecrets == null ? Codegen.empty() : this.customerSecrets;
    }

    /**
     * The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="dataManagerName", required=true)
      private final Output<String> dataManagerName;

    public Output<String> dataManagerName() {
        return this.dataManagerName;
    }

    /**
     * A generic json used differently by each data service type.
     * 
     */
    @Import(name="dataServiceInput")
      private final @Nullable Output<Object> dataServiceInput;

    public Output<Object> dataServiceInput() {
        return this.dataServiceInput == null ? Codegen.empty() : this.dataServiceInput;
    }

    /**
     * The data service type of the job definition.
     * 
     */
    @Import(name="dataServiceName", required=true)
      private final Output<String> dataServiceName;

    public Output<String> dataServiceName() {
        return this.dataServiceName;
    }

    /**
     * Data Sink Id associated to the job definition.
     * 
     */
    @Import(name="dataSinkId", required=true)
      private final Output<String> dataSinkId;

    public Output<String> dataSinkId() {
        return this.dataSinkId;
    }

    /**
     * Data Source Id associated to the job definition.
     * 
     */
    @Import(name="dataSourceId", required=true)
      private final Output<String> dataSourceId;

    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * The job definition name to be created or updated.
     * 
     */
    @Import(name="jobDefinitionName")
      private final @Nullable Output<String> jobDefinitionName;

    public Output<String> jobDefinitionName() {
        return this.jobDefinitionName == null ? Codegen.empty() : this.jobDefinitionName;
    }

    /**
     * Last modified time of the job definition.
     * 
     */
    @Import(name="lastModifiedTime")
      private final @Nullable Output<String> lastModifiedTime;

    public Output<String> lastModifiedTime() {
        return this.lastModifiedTime == null ? Codegen.empty() : this.lastModifiedTime;
    }

    /**
     * The Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * This is the preferred geo location for the job to run.
     * 
     */
    @Import(name="runLocation")
      private final @Nullable Output<RunLocation> runLocation;

    public Output<RunLocation> runLocation() {
        return this.runLocation == null ? Codegen.empty() : this.runLocation;
    }

    /**
     * Schedule for running the job definition
     * 
     */
    @Import(name="schedules")
      private final @Nullable Output<List<ScheduleArgs>> schedules;

    public Output<List<ScheduleArgs>> schedules() {
        return this.schedules == null ? Codegen.empty() : this.schedules;
    }

    /**
     * State of the job definition.
     * 
     */
    @Import(name="state", required=true)
      private final Output<State> state;

    public Output<State> state() {
        return this.state;
    }

    /**
     * Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
     */
    @Import(name="userConfirmation")
      private final @Nullable Output<UserConfirmation> userConfirmation;

    public Output<UserConfirmation> userConfirmation() {
        return this.userConfirmation == null ? Codegen.empty() : this.userConfirmation;
    }

    public JobDefinitionArgs(
        @Nullable Output<List<CustomerSecretArgs>> customerSecrets,
        Output<String> dataManagerName,
        @Nullable Output<Object> dataServiceInput,
        Output<String> dataServiceName,
        Output<String> dataSinkId,
        Output<String> dataSourceId,
        @Nullable Output<String> jobDefinitionName,
        @Nullable Output<String> lastModifiedTime,
        Output<String> resourceGroupName,
        @Nullable Output<RunLocation> runLocation,
        @Nullable Output<List<ScheduleArgs>> schedules,
        Output<State> state,
        @Nullable Output<UserConfirmation> userConfirmation) {
        this.customerSecrets = customerSecrets;
        this.dataManagerName = Objects.requireNonNull(dataManagerName, "expected parameter 'dataManagerName' to be non-null");
        this.dataServiceInput = dataServiceInput;
        this.dataServiceName = Objects.requireNonNull(dataServiceName, "expected parameter 'dataServiceName' to be non-null");
        this.dataSinkId = Objects.requireNonNull(dataSinkId, "expected parameter 'dataSinkId' to be non-null");
        this.dataSourceId = Objects.requireNonNull(dataSourceId, "expected parameter 'dataSourceId' to be non-null");
        this.jobDefinitionName = jobDefinitionName;
        this.lastModifiedTime = lastModifiedTime;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runLocation = runLocation;
        this.schedules = schedules;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.userConfirmation = userConfirmation == null ? Codegen.ofNullable(com.pulumi.azurenative.hybriddata.enums.UserConfirmation.NotRequired) : userConfirmation;
    }

    private JobDefinitionArgs() {
        this.customerSecrets = Codegen.empty();
        this.dataManagerName = Codegen.empty();
        this.dataServiceInput = Codegen.empty();
        this.dataServiceName = Codegen.empty();
        this.dataSinkId = Codegen.empty();
        this.dataSourceId = Codegen.empty();
        this.jobDefinitionName = Codegen.empty();
        this.lastModifiedTime = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.runLocation = Codegen.empty();
        this.schedules = Codegen.empty();
        this.state = Codegen.empty();
        this.userConfirmation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CustomerSecretArgs>> customerSecrets;
        private Output<String> dataManagerName;
        private @Nullable Output<Object> dataServiceInput;
        private Output<String> dataServiceName;
        private Output<String> dataSinkId;
        private Output<String> dataSourceId;
        private @Nullable Output<String> jobDefinitionName;
        private @Nullable Output<String> lastModifiedTime;
        private Output<String> resourceGroupName;
        private @Nullable Output<RunLocation> runLocation;
        private @Nullable Output<List<ScheduleArgs>> schedules;
        private Output<State> state;
        private @Nullable Output<UserConfirmation> userConfirmation;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerSecrets = defaults.customerSecrets;
    	      this.dataManagerName = defaults.dataManagerName;
    	      this.dataServiceInput = defaults.dataServiceInput;
    	      this.dataServiceName = defaults.dataServiceName;
    	      this.dataSinkId = defaults.dataSinkId;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.jobDefinitionName = defaults.jobDefinitionName;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runLocation = defaults.runLocation;
    	      this.schedules = defaults.schedules;
    	      this.state = defaults.state;
    	      this.userConfirmation = defaults.userConfirmation;
        }

        public Builder customerSecrets(@Nullable Output<List<CustomerSecretArgs>> customerSecrets) {
            this.customerSecrets = customerSecrets;
            return this;
        }
        public Builder customerSecrets(@Nullable List<CustomerSecretArgs> customerSecrets) {
            this.customerSecrets = Codegen.ofNullable(customerSecrets);
            return this;
        }
        public Builder customerSecrets(CustomerSecretArgs... customerSecrets) {
            return customerSecrets(List.of(customerSecrets));
        }
        public Builder dataManagerName(Output<String> dataManagerName) {
            this.dataManagerName = Objects.requireNonNull(dataManagerName);
            return this;
        }
        public Builder dataManagerName(String dataManagerName) {
            this.dataManagerName = Output.of(Objects.requireNonNull(dataManagerName));
            return this;
        }
        public Builder dataServiceInput(@Nullable Output<Object> dataServiceInput) {
            this.dataServiceInput = dataServiceInput;
            return this;
        }
        public Builder dataServiceInput(@Nullable Object dataServiceInput) {
            this.dataServiceInput = Codegen.ofNullable(dataServiceInput);
            return this;
        }
        public Builder dataServiceName(Output<String> dataServiceName) {
            this.dataServiceName = Objects.requireNonNull(dataServiceName);
            return this;
        }
        public Builder dataServiceName(String dataServiceName) {
            this.dataServiceName = Output.of(Objects.requireNonNull(dataServiceName));
            return this;
        }
        public Builder dataSinkId(Output<String> dataSinkId) {
            this.dataSinkId = Objects.requireNonNull(dataSinkId);
            return this;
        }
        public Builder dataSinkId(String dataSinkId) {
            this.dataSinkId = Output.of(Objects.requireNonNull(dataSinkId));
            return this;
        }
        public Builder dataSourceId(Output<String> dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = Output.of(Objects.requireNonNull(dataSourceId));
            return this;
        }
        public Builder jobDefinitionName(@Nullable Output<String> jobDefinitionName) {
            this.jobDefinitionName = jobDefinitionName;
            return this;
        }
        public Builder jobDefinitionName(@Nullable String jobDefinitionName) {
            this.jobDefinitionName = Codegen.ofNullable(jobDefinitionName);
            return this;
        }
        public Builder lastModifiedTime(@Nullable Output<String> lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = Codegen.ofNullable(lastModifiedTime);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder runLocation(@Nullable Output<RunLocation> runLocation) {
            this.runLocation = runLocation;
            return this;
        }
        public Builder runLocation(@Nullable RunLocation runLocation) {
            this.runLocation = Codegen.ofNullable(runLocation);
            return this;
        }
        public Builder schedules(@Nullable Output<List<ScheduleArgs>> schedules) {
            this.schedules = schedules;
            return this;
        }
        public Builder schedules(@Nullable List<ScheduleArgs> schedules) {
            this.schedules = Codegen.ofNullable(schedules);
            return this;
        }
        public Builder schedules(ScheduleArgs... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder state(Output<State> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder state(State state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }
        public Builder userConfirmation(@Nullable Output<UserConfirmation> userConfirmation) {
            this.userConfirmation = userConfirmation;
            return this;
        }
        public Builder userConfirmation(@Nullable UserConfirmation userConfirmation) {
            this.userConfirmation = Codegen.ofNullable(userConfirmation);
            return this;
        }        public JobDefinitionArgs build() {
            return new JobDefinitionArgs(customerSecrets, dataManagerName, dataServiceInput, dataServiceName, dataSinkId, dataSourceId, jobDefinitionName, lastModifiedTime, resourceGroupName, runLocation, schedules, state, userConfirmation);
        }
    }
}
