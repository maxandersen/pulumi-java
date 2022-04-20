// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.HDInsightActivityDebugInfoOption;
import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HDInsight MapReduce activity type.
 * 
 */
public final class HDInsightMapReduceActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final HDInsightMapReduceActivityArgs Empty = new HDInsightMapReduceActivityArgs();

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<List<Object>> arguments;

    public Output<List<Object>> arguments() {
        return this.arguments == null ? Codegen.empty() : this.arguments;
    }

    /**
     * Class name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="className", required=true)
      private final Output<Object> className;

    public Output<Object> className() {
        return this.className;
    }

    /**
     * Allows user to specify defines for the MapReduce job request.
     * 
     */
    @Import(name="defines")
      private final @Nullable Output<Map<String,Object>> defines;

    public Output<Map<String,Object>> defines() {
        return this.defines == null ? Codegen.empty() : this.defines;
    }

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
     * Debug info option.
     * 
     */
    @Import(name="getDebugInfo")
      private final @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;

    public Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo() {
        return this.getDebugInfo == null ? Codegen.empty() : this.getDebugInfo;
    }

    /**
     * Jar path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="jarFilePath", required=true)
      private final Output<Object> jarFilePath;

    public Output<Object> jarFilePath() {
        return this.jarFilePath;
    }

    /**
     * Jar libs.
     * 
     */
    @Import(name="jarLibs")
      private final @Nullable Output<List<Object>> jarLibs;

    public Output<List<Object>> jarLibs() {
        return this.jarLibs == null ? Codegen.empty() : this.jarLibs;
    }

    /**
     * Jar linked service reference.
     * 
     */
    @Import(name="jarLinkedService")
      private final @Nullable Output<LinkedServiceReferenceArgs> jarLinkedService;

    public Output<LinkedServiceReferenceArgs> jarLinkedService() {
        return this.jarLinkedService == null ? Codegen.empty() : this.jarLinkedService;
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
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<ActivityPolicyArgs> policy;

    public Output<ActivityPolicyArgs> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * Storage linked service references.
     * 
     */
    @Import(name="storageLinkedServices")
      private final @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices;

    public Output<List<LinkedServiceReferenceArgs>> storageLinkedServices() {
        return this.storageLinkedServices == null ? Codegen.empty() : this.storageLinkedServices;
    }

    /**
     * Type of activity.
     * Expected value is &#39;HDInsightMapReduce&#39;.
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

    public HDInsightMapReduceActivityArgs(
        @Nullable Output<List<Object>> arguments,
        Output<Object> className,
        @Nullable Output<Map<String,Object>> defines,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo,
        Output<Object> jarFilePath,
        @Nullable Output<List<Object>> jarLibs,
        @Nullable Output<LinkedServiceReferenceArgs> jarLinkedService,
        @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName,
        Output<String> name,
        @Nullable Output<ActivityPolicyArgs> policy,
        @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
        this.arguments = arguments;
        this.className = Objects.requireNonNull(className, "expected parameter 'className' to be non-null");
        this.defines = defines;
        this.dependsOn = dependsOn;
        this.description = description;
        this.getDebugInfo = getDebugInfo;
        this.jarFilePath = Objects.requireNonNull(jarFilePath, "expected parameter 'jarFilePath' to be non-null");
        this.jarLibs = jarLibs;
        this.jarLinkedService = jarLinkedService;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.storageLinkedServices = storageLinkedServices;
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.userProperties = userProperties;
    }

    private HDInsightMapReduceActivityArgs() {
        this.arguments = Codegen.empty();
        this.className = Codegen.empty();
        this.defines = Codegen.empty();
        this.dependsOn = Codegen.empty();
        this.description = Codegen.empty();
        this.getDebugInfo = Codegen.empty();
        this.jarFilePath = Codegen.empty();
        this.jarLibs = Codegen.empty();
        this.jarLinkedService = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
        this.name = Codegen.empty();
        this.policy = Codegen.empty();
        this.storageLinkedServices = Codegen.empty();
        this.type = Codegen.empty();
        this.userProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightMapReduceActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> arguments;
        private Output<Object> className;
        private @Nullable Output<Map<String,Object>> defines;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;
        private Output<Object> jarFilePath;
        private @Nullable Output<List<Object>> jarLibs;
        private @Nullable Output<LinkedServiceReferenceArgs> jarLinkedService;
        private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;
        private Output<String> name;
        private @Nullable Output<ActivityPolicyArgs> policy;
        private @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightMapReduceActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.className = defaults.className;
    	      this.defines = defaults.defines;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.getDebugInfo = defaults.getDebugInfo;
    	      this.jarFilePath = defaults.jarFilePath;
    	      this.jarLibs = defaults.jarLibs;
    	      this.jarLinkedService = defaults.jarLinkedService;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storageLinkedServices = defaults.storageLinkedServices;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder arguments(@Nullable Output<List<Object>> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable List<Object> arguments) {
            this.arguments = Codegen.ofNullable(arguments);
            return this;
        }
        public Builder arguments(Object... arguments) {
            return arguments(List.of(arguments));
        }
        public Builder className(Output<Object> className) {
            this.className = Objects.requireNonNull(className);
            return this;
        }
        public Builder className(Object className) {
            this.className = Output.of(Objects.requireNonNull(className));
            return this;
        }
        public Builder defines(@Nullable Output<Map<String,Object>> defines) {
            this.defines = defines;
            return this;
        }
        public Builder defines(@Nullable Map<String,Object> defines) {
            this.defines = Codegen.ofNullable(defines);
            return this;
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
        public Builder getDebugInfo(@Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo) {
            this.getDebugInfo = getDebugInfo;
            return this;
        }
        public Builder getDebugInfo(@Nullable Either<String,HDInsightActivityDebugInfoOption> getDebugInfo) {
            this.getDebugInfo = Codegen.ofNullable(getDebugInfo);
            return this;
        }
        public Builder jarFilePath(Output<Object> jarFilePath) {
            this.jarFilePath = Objects.requireNonNull(jarFilePath);
            return this;
        }
        public Builder jarFilePath(Object jarFilePath) {
            this.jarFilePath = Output.of(Objects.requireNonNull(jarFilePath));
            return this;
        }
        public Builder jarLibs(@Nullable Output<List<Object>> jarLibs) {
            this.jarLibs = jarLibs;
            return this;
        }
        public Builder jarLibs(@Nullable List<Object> jarLibs) {
            this.jarLibs = Codegen.ofNullable(jarLibs);
            return this;
        }
        public Builder jarLibs(Object... jarLibs) {
            return jarLibs(List.of(jarLibs));
        }
        public Builder jarLinkedService(@Nullable Output<LinkedServiceReferenceArgs> jarLinkedService) {
            this.jarLinkedService = jarLinkedService;
            return this;
        }
        public Builder jarLinkedService(@Nullable LinkedServiceReferenceArgs jarLinkedService) {
            this.jarLinkedService = Codegen.ofNullable(jarLinkedService);
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
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder storageLinkedServices(@Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices) {
            this.storageLinkedServices = storageLinkedServices;
            return this;
        }
        public Builder storageLinkedServices(@Nullable List<LinkedServiceReferenceArgs> storageLinkedServices) {
            this.storageLinkedServices = Codegen.ofNullable(storageLinkedServices);
            return this;
        }
        public Builder storageLinkedServices(LinkedServiceReferenceArgs... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
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
        }        public HDInsightMapReduceActivityArgs build() {
            return new HDInsightMapReduceActivityArgs(arguments, className, defines, dependsOn, description, getDebugInfo, jarFilePath, jarLibs, jarLinkedService, linkedServiceName, name, policy, storageLinkedServices, type, userProperties);
        }
    }
}
