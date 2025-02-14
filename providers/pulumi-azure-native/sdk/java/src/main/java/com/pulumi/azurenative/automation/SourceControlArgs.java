// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.automation.enums.SourceType;
import com.pulumi.azurenative.automation.inputs.SourceControlSecurityTokenPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SourceControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceControlArgs Empty = new SourceControlArgs();

    /**
     * The auto async of the source control. Default is false.
     * 
     */
    @Import(name="autoSync")
    private @Nullable Output<Boolean> autoSync;

    /**
     * @return The auto async of the source control. Default is false.
     * 
     */
    public Optional<Output<Boolean>> autoSync() {
        return Optional.ofNullable(this.autoSync);
    }

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return The repo branch of the source control. Include branch as empty string for VsoTfvc.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * The user description of the source control.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The user description of the source control.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The folder path of the source control. Path must be relative.
     * 
     */
    @Import(name="folderPath")
    private @Nullable Output<String> folderPath;

    /**
     * @return The folder path of the source control. Path must be relative.
     * 
     */
    public Optional<Output<String>> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * The auto publish of the source control. Default is true.
     * 
     */
    @Import(name="publishRunbook")
    private @Nullable Output<Boolean> publishRunbook;

    /**
     * @return The auto publish of the source control. Default is true.
     * 
     */
    public Optional<Output<Boolean>> publishRunbook() {
        return Optional.ofNullable(this.publishRunbook);
    }

    /**
     * The repo url of the source control.
     * 
     */
    @Import(name="repoUrl")
    private @Nullable Output<String> repoUrl;

    /**
     * @return The repo url of the source control.
     * 
     */
    public Optional<Output<String>> repoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The authorization token for the repo of the source control.
     * 
     */
    @Import(name="securityToken")
    private @Nullable Output<SourceControlSecurityTokenPropertiesArgs> securityToken;

    /**
     * @return The authorization token for the repo of the source control.
     * 
     */
    public Optional<Output<SourceControlSecurityTokenPropertiesArgs>> securityToken() {
        return Optional.ofNullable(this.securityToken);
    }

    /**
     * The source control name.
     * 
     */
    @Import(name="sourceControlName")
    private @Nullable Output<String> sourceControlName;

    /**
     * @return The source control name.
     * 
     */
    public Optional<Output<String>> sourceControlName() {
        return Optional.ofNullable(this.sourceControlName);
    }

    /**
     * The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<Either<String,SourceType>> sourceType;

    /**
     * @return The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
     * 
     */
    public Optional<Output<Either<String,SourceType>>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    private SourceControlArgs() {}

    private SourceControlArgs(SourceControlArgs $) {
        this.autoSync = $.autoSync;
        this.automationAccountName = $.automationAccountName;
        this.branch = $.branch;
        this.description = $.description;
        this.folderPath = $.folderPath;
        this.publishRunbook = $.publishRunbook;
        this.repoUrl = $.repoUrl;
        this.resourceGroupName = $.resourceGroupName;
        this.securityToken = $.securityToken;
        this.sourceControlName = $.sourceControlName;
        this.sourceType = $.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceControlArgs $;

        public Builder() {
            $ = new SourceControlArgs();
        }

        public Builder(SourceControlArgs defaults) {
            $ = new SourceControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoSync The auto async of the source control. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder autoSync(@Nullable Output<Boolean> autoSync) {
            $.autoSync = autoSync;
            return this;
        }

        /**
         * @param autoSync The auto async of the source control. Default is false.
         * 
         * @return builder
         * 
         */
        public Builder autoSync(Boolean autoSync) {
            return autoSync(Output.of(autoSync));
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param branch The repo branch of the source control. Include branch as empty string for VsoTfvc.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch The repo branch of the source control. Include branch as empty string for VsoTfvc.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param description The user description of the source control.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The user description of the source control.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param folderPath The folder path of the source control. Path must be relative.
         * 
         * @return builder
         * 
         */
        public Builder folderPath(@Nullable Output<String> folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        /**
         * @param folderPath The folder path of the source control. Path must be relative.
         * 
         * @return builder
         * 
         */
        public Builder folderPath(String folderPath) {
            return folderPath(Output.of(folderPath));
        }

        /**
         * @param publishRunbook The auto publish of the source control. Default is true.
         * 
         * @return builder
         * 
         */
        public Builder publishRunbook(@Nullable Output<Boolean> publishRunbook) {
            $.publishRunbook = publishRunbook;
            return this;
        }

        /**
         * @param publishRunbook The auto publish of the source control. Default is true.
         * 
         * @return builder
         * 
         */
        public Builder publishRunbook(Boolean publishRunbook) {
            return publishRunbook(Output.of(publishRunbook));
        }

        /**
         * @param repoUrl The repo url of the source control.
         * 
         * @return builder
         * 
         */
        public Builder repoUrl(@Nullable Output<String> repoUrl) {
            $.repoUrl = repoUrl;
            return this;
        }

        /**
         * @param repoUrl The repo url of the source control.
         * 
         * @return builder
         * 
         */
        public Builder repoUrl(String repoUrl) {
            return repoUrl(Output.of(repoUrl));
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param securityToken The authorization token for the repo of the source control.
         * 
         * @return builder
         * 
         */
        public Builder securityToken(@Nullable Output<SourceControlSecurityTokenPropertiesArgs> securityToken) {
            $.securityToken = securityToken;
            return this;
        }

        /**
         * @param securityToken The authorization token for the repo of the source control.
         * 
         * @return builder
         * 
         */
        public Builder securityToken(SourceControlSecurityTokenPropertiesArgs securityToken) {
            return securityToken(Output.of(securityToken));
        }

        /**
         * @param sourceControlName The source control name.
         * 
         * @return builder
         * 
         */
        public Builder sourceControlName(@Nullable Output<String> sourceControlName) {
            $.sourceControlName = sourceControlName;
            return this;
        }

        /**
         * @param sourceControlName The source control name.
         * 
         * @return builder
         * 
         */
        public Builder sourceControlName(String sourceControlName) {
            return sourceControlName(Output.of(sourceControlName));
        }

        /**
         * @param sourceType The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<Either<String,SourceType>> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(Either<String,SourceType> sourceType) {
            return sourceType(Output.of(sourceType));
        }

        /**
         * @param sourceType The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Either.ofLeft(sourceType));
        }

        /**
         * @param sourceType The source type. Must be one of VsoGit, VsoTfvc, GitHub, case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(SourceType sourceType) {
            return sourceType(Either.ofRight(sourceType));
        }

        public SourceControlArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
