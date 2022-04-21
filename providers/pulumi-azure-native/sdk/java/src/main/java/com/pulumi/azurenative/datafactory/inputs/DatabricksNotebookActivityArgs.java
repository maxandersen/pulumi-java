// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DatabricksNotebook activity.
 * 
 */
public final class DatabricksNotebookActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabricksNotebookActivityArgs Empty = new DatabricksNotebookActivityArgs();

    /**
     * Base parameters to be used for each run of this job.If the notebook takes a parameter that is not specified, the default value from the notebook will be used.
     * 
     */
    @Import(name="baseParameters")
    private @Nullable Output<Map<String,Object>> baseParameters;

    public Optional<Output<Map<String,Object>>> baseParameters() {
        return Optional.ofNullable(this.baseParameters);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of libraries to be installed on the cluster that will execute the job.
     * 
     */
    @Import(name="libraries")
    private @Nullable Output<List<Map<String,Object>>> libraries;

    public Optional<Output<List<Map<String,Object>>>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The absolute path of the notebook to be run in the Databricks Workspace. This path must begin with a slash. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="notebookPath", required=true)
    private Output<Object> notebookPath;

    public Output<Object> notebookPath() {
        return this.notebookPath;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is &#39;DatabricksNotebook&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private DatabricksNotebookActivityArgs() {}

    private DatabricksNotebookActivityArgs(DatabricksNotebookActivityArgs $) {
        this.baseParameters = $.baseParameters;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.libraries = $.libraries;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.notebookPath = $.notebookPath;
        this.policy = $.policy;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabricksNotebookActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabricksNotebookActivityArgs $;

        public Builder() {
            $ = new DatabricksNotebookActivityArgs();
        }

        public Builder(DatabricksNotebookActivityArgs defaults) {
            $ = new DatabricksNotebookActivityArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseParameters(@Nullable Output<Map<String,Object>> baseParameters) {
            $.baseParameters = baseParameters;
            return this;
        }

        public Builder baseParameters(Map<String,Object> baseParameters) {
            return baseParameters(Output.of(baseParameters));
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder libraries(@Nullable Output<List<Map<String,Object>>> libraries) {
            $.libraries = libraries;
            return this;
        }

        public Builder libraries(List<Map<String,Object>> libraries) {
            return libraries(Output.of(libraries));
        }

        public Builder libraries(Map<String,Object>... libraries) {
            return libraries(List.of(libraries));
        }

        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder notebookPath(Output<Object> notebookPath) {
            $.notebookPath = notebookPath;
            return this;
        }

        public Builder notebookPath(Object notebookPath) {
            return notebookPath(Output.of(notebookPath));
        }

        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public DatabricksNotebookActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.notebookPath = Objects.requireNonNull($.notebookPath, "expected parameter 'notebookPath' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
