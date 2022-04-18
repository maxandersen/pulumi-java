// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.GitHubActionCodeConfigurationResponse;
import com.pulumi.azurenative.web.outputs.GitHubActionContainerConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitHubActionConfigurationResponse {
    /**
     * GitHub Action code configuration.
     * 
     */
    private final @Nullable GitHubActionCodeConfigurationResponse codeConfiguration;
    /**
     * GitHub Action container configuration.
     * 
     */
    private final @Nullable GitHubActionContainerConfigurationResponse containerConfiguration;
    /**
     * Workflow option to determine whether the workflow file should be generated and written to the repository.
     * 
     */
    private final @Nullable Boolean generateWorkflowFile;
    /**
     * This will help determine the workflow configuration to select.
     * 
     */
    private final @Nullable Boolean isLinux;

    @CustomType.Constructor
    private GitHubActionConfigurationResponse(
        @CustomType.Parameter("codeConfiguration") @Nullable GitHubActionCodeConfigurationResponse codeConfiguration,
        @CustomType.Parameter("containerConfiguration") @Nullable GitHubActionContainerConfigurationResponse containerConfiguration,
        @CustomType.Parameter("generateWorkflowFile") @Nullable Boolean generateWorkflowFile,
        @CustomType.Parameter("isLinux") @Nullable Boolean isLinux) {
        this.codeConfiguration = codeConfiguration;
        this.containerConfiguration = containerConfiguration;
        this.generateWorkflowFile = generateWorkflowFile;
        this.isLinux = isLinux;
    }

    /**
     * GitHub Action code configuration.
     * 
    */
    public Optional<GitHubActionCodeConfigurationResponse> codeConfiguration() {
        return Optional.ofNullable(this.codeConfiguration);
    }
    /**
     * GitHub Action container configuration.
     * 
    */
    public Optional<GitHubActionContainerConfigurationResponse> containerConfiguration() {
        return Optional.ofNullable(this.containerConfiguration);
    }
    /**
     * Workflow option to determine whether the workflow file should be generated and written to the repository.
     * 
    */
    public Optional<Boolean> generateWorkflowFile() {
        return Optional.ofNullable(this.generateWorkflowFile);
    }
    /**
     * This will help determine the workflow configuration to select.
     * 
    */
    public Optional<Boolean> isLinux() {
        return Optional.ofNullable(this.isLinux);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubActionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GitHubActionCodeConfigurationResponse codeConfiguration;
        private @Nullable GitHubActionContainerConfigurationResponse containerConfiguration;
        private @Nullable Boolean generateWorkflowFile;
        private @Nullable Boolean isLinux;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubActionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeConfiguration = defaults.codeConfiguration;
    	      this.containerConfiguration = defaults.containerConfiguration;
    	      this.generateWorkflowFile = defaults.generateWorkflowFile;
    	      this.isLinux = defaults.isLinux;
        }

        public Builder codeConfiguration(@Nullable GitHubActionCodeConfigurationResponse codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public Builder containerConfiguration(@Nullable GitHubActionContainerConfigurationResponse containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public Builder generateWorkflowFile(@Nullable Boolean generateWorkflowFile) {
            this.generateWorkflowFile = generateWorkflowFile;
            return this;
        }
        public Builder isLinux(@Nullable Boolean isLinux) {
            this.isLinux = isLinux;
            return this;
        }        public GitHubActionConfigurationResponse build() {
            return new GitHubActionConfigurationResponse(codeConfiguration, containerConfiguration, generateWorkflowFile, isLinux);
        }
    }
}
