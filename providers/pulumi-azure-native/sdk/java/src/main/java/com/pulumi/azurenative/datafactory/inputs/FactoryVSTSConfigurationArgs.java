// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Factory&#39;s VSTS repo information.
 * 
 */
public final class FactoryVSTSConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FactoryVSTSConfigurationArgs Empty = new FactoryVSTSConfigurationArgs();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Collaboration branch.
     * 
     */
    @Import(name="collaborationBranch", required=true)
      private final Output<String> collaborationBranch;

    public Output<String> collaborationBranch() {
        return this.collaborationBranch;
    }

    /**
     * Last commit id.
     * 
     */
    @Import(name="lastCommitId")
      private final @Nullable Output<String> lastCommitId;

    public Output<String> lastCommitId() {
        return this.lastCommitId == null ? Codegen.empty() : this.lastCommitId;
    }

    /**
     * VSTS project name.
     * 
     */
    @Import(name="projectName", required=true)
      private final Output<String> projectName;

    public Output<String> projectName() {
        return this.projectName;
    }

    /**
     * Repository name.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    /**
     * Root folder.
     * 
     */
    @Import(name="rootFolder", required=true)
      private final Output<String> rootFolder;

    public Output<String> rootFolder() {
        return this.rootFolder;
    }

    /**
     * VSTS tenant id.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    /**
     * Type of repo configuration.
     * Expected value is &#39;FactoryVSTSConfiguration&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public FactoryVSTSConfigurationArgs(
        Output<String> accountName,
        Output<String> collaborationBranch,
        @Nullable Output<String> lastCommitId,
        Output<String> projectName,
        Output<String> repositoryName,
        Output<String> rootFolder,
        @Nullable Output<String> tenantId,
        Output<String> type) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.collaborationBranch = Objects.requireNonNull(collaborationBranch, "expected parameter 'collaborationBranch' to be non-null");
        this.lastCommitId = lastCommitId;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.rootFolder = Objects.requireNonNull(rootFolder, "expected parameter 'rootFolder' to be non-null");
        this.tenantId = tenantId;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private FactoryVSTSConfigurationArgs() {
        this.accountName = Codegen.empty();
        this.collaborationBranch = Codegen.empty();
        this.lastCommitId = Codegen.empty();
        this.projectName = Codegen.empty();
        this.repositoryName = Codegen.empty();
        this.rootFolder = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryVSTSConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> collaborationBranch;
        private @Nullable Output<String> lastCommitId;
        private Output<String> projectName;
        private Output<String> repositoryName;
        private Output<String> rootFolder;
        private @Nullable Output<String> tenantId;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryVSTSConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.collaborationBranch = defaults.collaborationBranch;
    	      this.lastCommitId = defaults.lastCommitId;
    	      this.projectName = defaults.projectName;
    	      this.repositoryName = defaults.repositoryName;
    	      this.rootFolder = defaults.rootFolder;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder collaborationBranch(Output<String> collaborationBranch) {
            this.collaborationBranch = Objects.requireNonNull(collaborationBranch);
            return this;
        }
        public Builder collaborationBranch(String collaborationBranch) {
            this.collaborationBranch = Output.of(Objects.requireNonNull(collaborationBranch));
            return this;
        }
        public Builder lastCommitId(@Nullable Output<String> lastCommitId) {
            this.lastCommitId = lastCommitId;
            return this;
        }
        public Builder lastCommitId(@Nullable String lastCommitId) {
            this.lastCommitId = Codegen.ofNullable(lastCommitId);
            return this;
        }
        public Builder projectName(Output<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }
        public Builder projectName(String projectName) {
            this.projectName = Output.of(Objects.requireNonNull(projectName));
            return this;
        }
        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }
        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }
        public Builder rootFolder(Output<String> rootFolder) {
            this.rootFolder = Objects.requireNonNull(rootFolder);
            return this;
        }
        public Builder rootFolder(String rootFolder) {
            this.rootFolder = Output.of(Objects.requireNonNull(rootFolder));
            return this;
        }
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FactoryVSTSConfigurationArgs build() {
            return new FactoryVSTSConfigurationArgs(accountName, collaborationBranch, lastCommitId, projectName, repositoryName, rootFolder, tenantId, type);
        }
    }
}
