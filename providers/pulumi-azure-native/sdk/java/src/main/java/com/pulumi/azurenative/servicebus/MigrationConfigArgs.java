// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrationConfigArgs extends ResourceArgs {

    public static final MigrationConfigArgs Empty = new MigrationConfigArgs();

    /**
     * The configuration name. Should always be &#34;$default&#34;.
     * 
     */
    @Import(name="configName")
    private @Nullable Output<String> configName;

    /**
     * @return The configuration name. Should always be &#34;$default&#34;.
     * 
     */
    public Optional<Output<String>> configName() {
        return Optional.ofNullable(this.configName);
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private Output<String> namespaceName;

    /**
     * @return The namespace name
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name to access Standard Namespace after migration
     * 
     */
    @Import(name="postMigrationName", required=true)
    private Output<String> postMigrationName;

    /**
     * @return Name to access Standard Namespace after migration
     * 
     */
    public Output<String> postMigrationName() {
        return this.postMigrationName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    @Import(name="targetNamespace", required=true)
    private Output<String> targetNamespace;

    /**
     * @return Existing premium Namespace ARM Id name which has no entities, will be used for migration
     * 
     */
    public Output<String> targetNamespace() {
        return this.targetNamespace;
    }

    private MigrationConfigArgs() {}

    private MigrationConfigArgs(MigrationConfigArgs $) {
        this.configName = $.configName;
        this.namespaceName = $.namespaceName;
        this.postMigrationName = $.postMigrationName;
        this.resourceGroupName = $.resourceGroupName;
        this.targetNamespace = $.targetNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationConfigArgs $;

        public Builder() {
            $ = new MigrationConfigArgs();
        }

        public Builder(MigrationConfigArgs defaults) {
            $ = new MigrationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configName The configuration name. Should always be &#34;$default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder configName(@Nullable Output<String> configName) {
            $.configName = configName;
            return this;
        }

        /**
         * @param configName The configuration name. Should always be &#34;$default&#34;.
         * 
         * @return builder
         * 
         */
        public Builder configName(String configName) {
            return configName(Output.of(configName));
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(Output<String> namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param namespaceName The namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            return namespaceName(Output.of(namespaceName));
        }

        /**
         * @param postMigrationName Name to access Standard Namespace after migration
         * 
         * @return builder
         * 
         */
        public Builder postMigrationName(Output<String> postMigrationName) {
            $.postMigrationName = postMigrationName;
            return this;
        }

        /**
         * @param postMigrationName Name to access Standard Namespace after migration
         * 
         * @return builder
         * 
         */
        public Builder postMigrationName(String postMigrationName) {
            return postMigrationName(Output.of(postMigrationName));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param targetNamespace Existing premium Namespace ARM Id name which has no entities, will be used for migration
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(Output<String> targetNamespace) {
            $.targetNamespace = targetNamespace;
            return this;
        }

        /**
         * @param targetNamespace Existing premium Namespace ARM Id name which has no entities, will be used for migration
         * 
         * @return builder
         * 
         */
        public Builder targetNamespace(String targetNamespace) {
            return targetNamespace(Output.of(targetNamespace));
        }

        public MigrationConfigArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.postMigrationName = Objects.requireNonNull($.postMigrationName, "expected parameter 'postMigrationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.targetNamespace = Objects.requireNonNull($.targetNamespace, "expected parameter 'targetNamespace' to be non-null");
            return $;
        }
    }

}
