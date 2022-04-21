// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Git integration settings
 * 
 */
public final class WorkspaceRepositoryConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkspaceRepositoryConfigurationResponse Empty = new WorkspaceRepositoryConfigurationResponse();

    /**
     * Account name
     * 
     */
    @Import(name="accountName")
    private @Nullable String accountName;

    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * Collaboration branch
     * 
     */
    @Import(name="collaborationBranch")
    private @Nullable String collaborationBranch;

    public Optional<String> collaborationBranch() {
        return Optional.ofNullable(this.collaborationBranch);
    }

    /**
     * GitHub Enterprise host name. For example: https://github.mydomain.com
     * 
     */
    @Import(name="hostName")
    private @Nullable String hostName;

    public Optional<String> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * The last commit ID
     * 
     */
    @Import(name="lastCommitId")
    private @Nullable String lastCommitId;

    public Optional<String> lastCommitId() {
        return Optional.ofNullable(this.lastCommitId);
    }

    /**
     * VSTS project name
     * 
     */
    @Import(name="projectName")
    private @Nullable String projectName;

    public Optional<String> projectName() {
        return Optional.ofNullable(this.projectName);
    }

    /**
     * Repository name
     * 
     */
    @Import(name="repositoryName")
    private @Nullable String repositoryName;

    public Optional<String> repositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }

    /**
     * Root folder to use in the repository
     * 
     */
    @Import(name="rootFolder")
    private @Nullable String rootFolder;

    public Optional<String> rootFolder() {
        return Optional.ofNullable(this.rootFolder);
    }

    /**
     * The VSTS tenant ID
     * 
     */
    @Import(name="tenantId")
    private @Nullable String tenantId;

    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * Type of workspace repositoryID configuration. Example WorkspaceVSTSConfiguration, WorkspaceGitHubConfiguration
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private WorkspaceRepositoryConfigurationResponse() {}

    private WorkspaceRepositoryConfigurationResponse(WorkspaceRepositoryConfigurationResponse $) {
        this.accountName = $.accountName;
        this.collaborationBranch = $.collaborationBranch;
        this.hostName = $.hostName;
        this.lastCommitId = $.lastCommitId;
        this.projectName = $.projectName;
        this.repositoryName = $.repositoryName;
        this.rootFolder = $.rootFolder;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceRepositoryConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceRepositoryConfigurationResponse $;

        public Builder() {
            $ = new WorkspaceRepositoryConfigurationResponse();
        }

        public Builder(WorkspaceRepositoryConfigurationResponse defaults) {
            $ = new WorkspaceRepositoryConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder accountName(@Nullable String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder collaborationBranch(@Nullable String collaborationBranch) {
            $.collaborationBranch = collaborationBranch;
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder lastCommitId(@Nullable String lastCommitId) {
            $.lastCommitId = lastCommitId;
            return this;
        }

        public Builder projectName(@Nullable String projectName) {
            $.projectName = projectName;
            return this;
        }

        public Builder repositoryName(@Nullable String repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public Builder rootFolder(@Nullable String rootFolder) {
            $.rootFolder = rootFolder;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public WorkspaceRepositoryConfigurationResponse build() {
            return $;
        }
    }

}
