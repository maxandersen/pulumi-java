// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceAzureDevopsRepoArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceAzureDevopsRepoArgs Empty = new WorkspaceAzureDevopsRepoArgs();

    /**
     * Specifies the Azure DevOps account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Specifies the Azure DevOps account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Specifies the collaboration branch of the repository to get code from.
     * 
     */
    @Import(name="branchName", required=true)
    private Output<String> branchName;

    /**
     * @return Specifies the collaboration branch of the repository to get code from.
     * 
     */
    public Output<String> branchName() {
        return this.branchName;
    }

    /**
     * The last commit ID.
     * 
     */
    @Import(name="lastCommitId")
    private @Nullable Output<String> lastCommitId;

    /**
     * @return The last commit ID.
     * 
     */
    public Optional<Output<String>> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }

    /**
     * Specifies the name of the Azure DevOps project.
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    /**
     * @return Specifies the name of the Azure DevOps project.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }

    /**
     * Specifies the name of the git repository.
     * 
     */
    @Import(name="repositoryName", required=true)
    private Output<String> repositoryName;

    /**
     * @return Specifies the name of the git repository.
     * 
     */
    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     * Specifies the root folder within the repository. Set to `/` for the top level.
     * 
     */
    @Import(name="rootFolder", required=true)
    private Output<String> rootFolder;

    /**
     * @return Specifies the root folder within the repository. Set to `/` for the top level.
     * 
     */
    public Output<String> rootFolder() {
        return this.rootFolder;
    }

    /**
     * the ID of the tenant for the Azure DevOps account.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return the ID of the tenant for the Azure DevOps account.
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private WorkspaceAzureDevopsRepoArgs() {}

    private WorkspaceAzureDevopsRepoArgs(WorkspaceAzureDevopsRepoArgs $) {
        this.accountName = $.accountName;
        this.branchName = $.branchName;
        this.lastCommitId = $.lastCommitId;
        this.projectName = $.projectName;
        this.repositoryName = $.repositoryName;
        this.rootFolder = $.rootFolder;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceAzureDevopsRepoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceAzureDevopsRepoArgs $;

        public Builder() {
            $ = new WorkspaceAzureDevopsRepoArgs();
        }

        public Builder(WorkspaceAzureDevopsRepoArgs defaults) {
            $ = new WorkspaceAzureDevopsRepoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Specifies the Azure DevOps account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Specifies the Azure DevOps account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param branchName Specifies the collaboration branch of the repository to get code from.
         * 
         * @return builder
         * 
         */
        public Builder branchName(Output<String> branchName) {
            $.branchName = branchName;
            return this;
        }

        /**
         * @param branchName Specifies the collaboration branch of the repository to get code from.
         * 
         * @return builder
         * 
         */
        public Builder branchName(String branchName) {
            return branchName(Output.of(branchName));
        }

        /**
         * @param lastCommitId The last commit ID.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(@Nullable Output<String> lastCommitId) {
            $.lastCommitId = lastCommitId;
            return this;
        }

        /**
         * @param lastCommitId The last commit ID.
         * 
         * @return builder
         * 
         */
        public Builder lastCommitId(String lastCommitId) {
            return lastCommitId(Output.of(lastCommitId));
        }

        /**
         * @param projectName Specifies the name of the Azure DevOps project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName Specifies the name of the Azure DevOps project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        /**
         * @param repositoryName Specifies the name of the git repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        /**
         * @param repositoryName Specifies the name of the git repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        /**
         * @param rootFolder Specifies the root folder within the repository. Set to `/` for the top level.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(Output<String> rootFolder) {
            $.rootFolder = rootFolder;
            return this;
        }

        /**
         * @param rootFolder Specifies the root folder within the repository. Set to `/` for the top level.
         * 
         * @return builder
         * 
         */
        public Builder rootFolder(String rootFolder) {
            return rootFolder(Output.of(rootFolder));
        }

        /**
         * @param tenantId the ID of the tenant for the Azure DevOps account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId the ID of the tenant for the Azure DevOps account.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public WorkspaceAzureDevopsRepoArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.branchName = Objects.requireNonNull($.branchName, "expected parameter 'branchName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            $.rootFolder = Objects.requireNonNull($.rootFolder, "expected parameter 'rootFolder' to be non-null");
            return $;
        }
    }

}
