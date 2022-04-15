// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DatabricksSparkPython activity.
 * 
 */
public final class DatabricksSparkPythonActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabricksSparkPythonActivityArgs Empty = new DatabricksSparkPythonActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> dependsOn() {
        return this.dependsOn == null ? Codegen.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    @Import(name="libraries")
      private final @Nullable Output<List<Map<String,Object>>> libraries;

    public Output<List<Map<String,Object>>> libraries() {
        return this.libraries == null ? Codegen.empty() : this.libraries;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
      private final @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName == null ? Codegen.empty() : this.linkedServiceName;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Command line parameters that will be passed to the Python file.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<Object>> parameters;

    public Output<List<Object>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<ActivityPolicyArgs> policy;

    public Output<ActivityPolicyArgs> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * The URI of the Python file to be executed. DBFS paths are supported. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="pythonFile", required=true)
      private final Output<Object> pythonFile;

    public Output<Object> pythonFile() {
        return this.pythonFile;
    }

    /**
     * Type of activity.
     * Expected value is 'DatabricksSparkPython'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> userProperties() {
        return this.userProperties == null ? Codegen.empty() : this.userProperties;
    }

    public DatabricksSparkPythonActivityArgs(
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<List<Map<String,Object>>> libraries,
        @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName,
        Output<String> name,
        @Nullable Output<List<Object>> parameters,
        @Nullable Output<ActivityPolicyArgs> policy,
        Output<Object> pythonFile,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.libraries = libraries;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.policy = policy;
        this.pythonFile = Objects.requireNonNull(pythonFile, "expected parameter 'pythonFile' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private DatabricksSparkPythonActivityArgs() {
        this.dependsOn = Codegen.empty();
        this.description = Codegen.empty();
        this.libraries = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
        this.policy = Codegen.empty();
        this.pythonFile = Codegen.empty();
        this.type = Codegen.empty();
        this.userProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabricksSparkPythonActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<Map<String,Object>>> libraries;
        private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;
        private Output<String> name;
        private @Nullable Output<List<Object>> parameters;
        private @Nullable Output<ActivityPolicyArgs> policy;
        private Output<Object> pythonFile;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksSparkPythonActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.libraries = defaults.libraries;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policy = defaults.policy;
    	      this.pythonFile = defaults.pythonFile;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Codegen.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder libraries(@Nullable Output<List<Map<String,Object>>> libraries) {
            this.libraries = libraries;
            return this;
        }
        public Builder libraries(@Nullable List<Map<String,Object>> libraries) {
            this.libraries = Codegen.ofNullable(libraries);
            return this;
        }
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Codegen.ofNullable(linkedServiceName);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(@Nullable Output<List<Object>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<Object> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder parameters(Object... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder pythonFile(Output<Object> pythonFile) {
            this.pythonFile = Objects.requireNonNull(pythonFile);
            return this;
        }
        public Builder pythonFile(Object pythonFile) {
            this.pythonFile = Output.of(Objects.requireNonNull(pythonFile));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Codegen.ofNullable(userProperties);
            return this;
        }
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }        public DatabricksSparkPythonActivityArgs build() {
            return new DatabricksSparkPythonActivityArgs(dependsOn, description, libraries, linkedServiceName, name, parameters, policy, pythonFile, type, userProperties);
        }
    }
}
