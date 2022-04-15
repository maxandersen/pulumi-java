// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata.outputs;

import io.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import io.pulumi.azurenative.hybriddata.outputs.ScheduleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobDefinitionResult {
    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    private final @Nullable List<CustomerSecretResponse> customerSecrets;
    /**
     * A generic json used differently by each data service type.
     * 
     */
    private final @Nullable Object dataServiceInput;
    /**
     * Data Sink Id associated to the job definition.
     * 
     */
    private final String dataSinkId;
    /**
     * Data Source Id associated to the job definition.
     * 
     */
    private final String dataSourceId;
    /**
     * Id of the object.
     * 
     */
    private final String id;
    /**
     * Last modified time of the job definition.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * Name of the object.
     * 
     */
    private final String name;
    /**
     * This is the preferred geo location for the job to run.
     * 
     */
    private final @Nullable String runLocation;
    /**
     * Schedule for running the job definition
     * 
     */
    private final @Nullable List<ScheduleResponse> schedules;
    /**
     * State of the job definition.
     * 
     */
    private final String state;
    /**
     * Type of the object.
     * 
     */
    private final String type;
    /**
     * Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
     */
    private final @Nullable String userConfirmation;

    @CustomType.Constructor
    private GetJobDefinitionResult(
        @CustomType.Parameter("customerSecrets") @Nullable List<CustomerSecretResponse> customerSecrets,
        @CustomType.Parameter("dataServiceInput") @Nullable Object dataServiceInput,
        @CustomType.Parameter("dataSinkId") String dataSinkId,
        @CustomType.Parameter("dataSourceId") String dataSourceId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("runLocation") @Nullable String runLocation,
        @CustomType.Parameter("schedules") @Nullable List<ScheduleResponse> schedules,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userConfirmation") @Nullable String userConfirmation) {
        this.customerSecrets = customerSecrets;
        this.dataServiceInput = dataServiceInput;
        this.dataSinkId = dataSinkId;
        this.dataSourceId = dataSourceId;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.name = name;
        this.runLocation = runLocation;
        this.schedules = schedules;
        this.state = state;
        this.type = type;
        this.userConfirmation = userConfirmation;
    }

    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
    */
    public List<CustomerSecretResponse> customerSecrets() {
        return this.customerSecrets == null ? List.of() : this.customerSecrets;
    }
    /**
     * A generic json used differently by each data service type.
     * 
    */
    public Optional<Object> dataServiceInput() {
        return Optional.ofNullable(this.dataServiceInput);
    }
    /**
     * Data Sink Id associated to the job definition.
     * 
    */
    public String dataSinkId() {
        return this.dataSinkId;
    }
    /**
     * Data Source Id associated to the job definition.
     * 
    */
    public String dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * Id of the object.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Last modified time of the job definition.
     * 
    */
    public Optional<String> lastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * Name of the object.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * This is the preferred geo location for the job to run.
     * 
    */
    public Optional<String> runLocation() {
        return Optional.ofNullable(this.runLocation);
    }
    /**
     * Schedule for running the job definition
     * 
    */
    public List<ScheduleResponse> schedules() {
        return this.schedules == null ? List.of() : this.schedules;
    }
    /**
     * State of the job definition.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Type of the object.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Enum to detect if user confirmation is required. If not passed will default to NotRequired.
     * 
    */
    public Optional<String> userConfirmation() {
        return Optional.ofNullable(this.userConfirmation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomerSecretResponse> customerSecrets;
        private @Nullable Object dataServiceInput;
        private String dataSinkId;
        private String dataSourceId;
        private String id;
        private @Nullable String lastModifiedTime;
        private String name;
        private @Nullable String runLocation;
        private @Nullable List<ScheduleResponse> schedules;
        private String state;
        private String type;
        private @Nullable String userConfirmation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerSecrets = defaults.customerSecrets;
    	      this.dataServiceInput = defaults.dataServiceInput;
    	      this.dataSinkId = defaults.dataSinkId;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.runLocation = defaults.runLocation;
    	      this.schedules = defaults.schedules;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.userConfirmation = defaults.userConfirmation;
        }

        public Builder customerSecrets(@Nullable List<CustomerSecretResponse> customerSecrets) {
            this.customerSecrets = customerSecrets;
            return this;
        }
        public Builder customerSecrets(CustomerSecretResponse... customerSecrets) {
            return customerSecrets(List.of(customerSecrets));
        }
        public Builder dataServiceInput(@Nullable Object dataServiceInput) {
            this.dataServiceInput = dataServiceInput;
            return this;
        }
        public Builder dataSinkId(String dataSinkId) {
            this.dataSinkId = Objects.requireNonNull(dataSinkId);
            return this;
        }
        public Builder dataSourceId(String dataSourceId) {
            this.dataSourceId = Objects.requireNonNull(dataSourceId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder runLocation(@Nullable String runLocation) {
            this.runLocation = runLocation;
            return this;
        }
        public Builder schedules(@Nullable List<ScheduleResponse> schedules) {
            this.schedules = schedules;
            return this;
        }
        public Builder schedules(ScheduleResponse... schedules) {
            return schedules(List.of(schedules));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userConfirmation(@Nullable String userConfirmation) {
            this.userConfirmation = userConfirmation;
            return this;
        }        public GetJobDefinitionResult build() {
            return new GetJobDefinitionResult(customerSecrets, dataServiceInput, dataSinkId, dataSourceId, id, lastModifiedTime, name, runLocation, schedules, state, type, userConfirmation);
        }
    }
}
