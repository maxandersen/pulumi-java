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
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HDInsight Pig activity type.
 * 
 */
public final class HDInsightPigActivityArgs extends ResourceArgs {

    public static final HDInsightPigActivityArgs Empty = new HDInsightPigActivityArgs();

    /**
     * User specified arguments to HDInsightActivity. Type: array (or Expression with resultType array).
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<Object> arguments;

    /**
     * @return User specified arguments to HDInsightActivity. Type: array (or Expression with resultType array).
     * 
     */
    public Optional<Output<Object>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * Allows user to specify defines for Pig job request.
     * 
     */
    @Import(name="defines")
    private @Nullable Output<Map<String,Object>> defines;

    /**
     * @return Allows user to specify defines for Pig job request.
     * 
     */
    public Optional<Output<Map<String,Object>>> defines() {
        return Optional.ofNullable(this.defines);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Debug info option.
     * 
     */
    @Import(name="getDebugInfo")
    private @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;

    /**
     * @return Debug info option.
     * 
     */
    public Optional<Output<Either<String,HDInsightActivityDebugInfoOption>>> getDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Activity name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    /**
     * @return Activity policy.
     * 
     */
    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Script linked service reference.
     * 
     */
    @Import(name="scriptLinkedService")
    private @Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService;

    /**
     * @return Script linked service reference.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> scriptLinkedService() {
        return Optional.ofNullable(this.scriptLinkedService);
    }

    /**
     * Script path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="scriptPath")
    private @Nullable Output<Object> scriptPath;

    /**
     * @return Script path. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> scriptPath() {
        return Optional.ofNullable(this.scriptPath);
    }

    /**
     * Storage linked service references.
     * 
     */
    @Import(name="storageLinkedServices")
    private @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices;

    /**
     * @return Storage linked service references.
     * 
     */
    public Optional<Output<List<LinkedServiceReferenceArgs>>> storageLinkedServices() {
        return Optional.ofNullable(this.storageLinkedServices);
    }

    /**
     * Type of activity.
     * Expected value is &#39;HDInsightPig&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;HDInsightPig&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private HDInsightPigActivityArgs() {}

    private HDInsightPigActivityArgs(HDInsightPigActivityArgs $) {
        this.arguments = $.arguments;
        this.defines = $.defines;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.getDebugInfo = $.getDebugInfo;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.scriptLinkedService = $.scriptLinkedService;
        this.scriptPath = $.scriptPath;
        this.storageLinkedServices = $.storageLinkedServices;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HDInsightPigActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightPigActivityArgs $;

        public Builder() {
            $ = new HDInsightPigActivityArgs();
        }

        public Builder(HDInsightPigActivityArgs defaults) {
            $ = new HDInsightPigActivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments User specified arguments to HDInsightActivity. Type: array (or Expression with resultType array).
         * 
         * @return builder
         * 
         */
        public Builder arguments(@Nullable Output<Object> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments User specified arguments to HDInsightActivity. Type: array (or Expression with resultType array).
         * 
         * @return builder
         * 
         */
        public Builder arguments(Object arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param defines Allows user to specify defines for Pig job request.
         * 
         * @return builder
         * 
         */
        public Builder defines(@Nullable Output<Map<String,Object>> defines) {
            $.defines = defines;
            return this;
        }

        /**
         * @param defines Allows user to specify defines for Pig job request.
         * 
         * @return builder
         * 
         */
        public Builder defines(Map<String,Object> defines) {
            return defines(Output.of(defines));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param getDebugInfo Debug info option.
         * 
         * @return builder
         * 
         */
        public Builder getDebugInfo(@Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo) {
            $.getDebugInfo = getDebugInfo;
            return this;
        }

        /**
         * @param getDebugInfo Debug info option.
         * 
         * @return builder
         * 
         */
        public Builder getDebugInfo(Either<String,HDInsightActivityDebugInfoOption> getDebugInfo) {
            return getDebugInfo(Output.of(getDebugInfo));
        }

        /**
         * @param getDebugInfo Debug info option.
         * 
         * @return builder
         * 
         */
        public Builder getDebugInfo(String getDebugInfo) {
            return getDebugInfo(Either.ofLeft(getDebugInfo));
        }

        /**
         * @param getDebugInfo Debug info option.
         * 
         * @return builder
         * 
         */
        public Builder getDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
            return getDebugInfo(Either.ofRight(getDebugInfo));
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param scriptLinkedService Script linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder scriptLinkedService(@Nullable Output<LinkedServiceReferenceArgs> scriptLinkedService) {
            $.scriptLinkedService = scriptLinkedService;
            return this;
        }

        /**
         * @param scriptLinkedService Script linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder scriptLinkedService(LinkedServiceReferenceArgs scriptLinkedService) {
            return scriptLinkedService(Output.of(scriptLinkedService));
        }

        /**
         * @param scriptPath Script path. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder scriptPath(@Nullable Output<Object> scriptPath) {
            $.scriptPath = scriptPath;
            return this;
        }

        /**
         * @param scriptPath Script path. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder scriptPath(Object scriptPath) {
            return scriptPath(Output.of(scriptPath));
        }

        /**
         * @param storageLinkedServices Storage linked service references.
         * 
         * @return builder
         * 
         */
        public Builder storageLinkedServices(@Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices) {
            $.storageLinkedServices = storageLinkedServices;
            return this;
        }

        /**
         * @param storageLinkedServices Storage linked service references.
         * 
         * @return builder
         * 
         */
        public Builder storageLinkedServices(List<LinkedServiceReferenceArgs> storageLinkedServices) {
            return storageLinkedServices(Output.of(storageLinkedServices));
        }

        /**
         * @param storageLinkedServices Storage linked service references.
         * 
         * @return builder
         * 
         */
        public Builder storageLinkedServices(LinkedServiceReferenceArgs... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;HDInsightPig&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;HDInsightPig&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public HDInsightPigActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
