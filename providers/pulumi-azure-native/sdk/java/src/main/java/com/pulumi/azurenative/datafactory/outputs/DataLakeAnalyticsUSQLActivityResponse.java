// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataLakeAnalyticsUSQLActivityResponse {
    /**
     * Compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object compilationMode;
    /**
     * The maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
     */
    private final @Nullable Object degreeOfParallelism;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Parameters for U-SQL job request.
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Determines which jobs out of all that are queued should be selected to run first. The lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
     */
    private final @Nullable Object priority;
    /**
     * Runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object runtimeVersion;
    /**
     * Script linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse scriptLinkedService;
    /**
     * Case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType string).
     * 
     */
    private final Object scriptPath;
    /**
     * Type of activity.
     * Expected value is &#39;DataLakeAnalyticsU-SQL&#39;.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private DataLakeAnalyticsUSQLActivityResponse(
        @CustomType.Parameter("compilationMode") @Nullable Object compilationMode,
        @CustomType.Parameter("degreeOfParallelism") @Nullable Object degreeOfParallelism,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable Map<String,Object> parameters,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("priority") @Nullable Object priority,
        @CustomType.Parameter("runtimeVersion") @Nullable Object runtimeVersion,
        @CustomType.Parameter("scriptLinkedService") LinkedServiceReferenceResponse scriptLinkedService,
        @CustomType.Parameter("scriptPath") Object scriptPath,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.compilationMode = compilationMode;
        this.degreeOfParallelism = degreeOfParallelism;
        this.dependsOn = dependsOn;
        this.description = description;
        this.linkedServiceName = linkedServiceName;
        this.name = name;
        this.parameters = parameters;
        this.policy = policy;
        this.priority = priority;
        this.runtimeVersion = runtimeVersion;
        this.scriptLinkedService = scriptLinkedService;
        this.scriptPath = scriptPath;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * Compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> compilationMode() {
        return Optional.ofNullable(this.compilationMode);
    }
    /**
     * The maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
    */
    public Optional<Object> degreeOfParallelism() {
        return Optional.ofNullable(this.degreeOfParallelism);
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Parameters for U-SQL job request.
     * 
    */
    public Map<String,Object> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Determines which jobs out of all that are queued should be selected to run first. The lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
    */
    public Optional<Object> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }
    /**
     * Script linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse scriptLinkedService() {
        return this.scriptLinkedService;
    }
    /**
     * Case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType string).
     * 
    */
    public Object scriptPath() {
        return this.scriptPath;
    }
    /**
     * Type of activity.
     * Expected value is &#39;DataLakeAnalyticsU-SQL&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeAnalyticsUSQLActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object compilationMode;
        private @Nullable Object degreeOfParallelism;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable Map<String,Object> parameters;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Object priority;
        private @Nullable Object runtimeVersion;
        private LinkedServiceReferenceResponse scriptLinkedService;
        private Object scriptPath;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeAnalyticsUSQLActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compilationMode = defaults.compilationMode;
    	      this.degreeOfParallelism = defaults.degreeOfParallelism;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policy = defaults.policy;
    	      this.priority = defaults.priority;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.scriptLinkedService = defaults.scriptLinkedService;
    	      this.scriptPath = defaults.scriptPath;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder compilationMode(@Nullable Object compilationMode) {
            this.compilationMode = compilationMode;
            return this;
        }
        public Builder degreeOfParallelism(@Nullable Object degreeOfParallelism) {
            this.degreeOfParallelism = degreeOfParallelism;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder priority(@Nullable Object priority) {
            this.priority = priority;
            return this;
        }
        public Builder runtimeVersion(@Nullable Object runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public Builder scriptLinkedService(LinkedServiceReferenceResponse scriptLinkedService) {
            this.scriptLinkedService = Objects.requireNonNull(scriptLinkedService);
            return this;
        }
        public Builder scriptPath(Object scriptPath) {
            this.scriptPath = Objects.requireNonNull(scriptPath);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public DataLakeAnalyticsUSQLActivityResponse build() {
            return new DataLakeAnalyticsUSQLActivityResponse(compilationMode, degreeOfParallelism, dependsOn, description, linkedServiceName, name, parameters, policy, priority, runtimeVersion, scriptLinkedService, scriptPath, type, userProperties);
        }
    }
}
