// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.azurenative.automation.enums.RunbookTypeEnum;
import com.pulumi.azurenative.automation.inputs.ContentLinkArgs;
import com.pulumi.azurenative.automation.inputs.RunbookDraftArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RunbookArgs extends ResourceArgs {

    public static final RunbookArgs Empty = new RunbookArgs();

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
     * Gets or sets the description of the runbook.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Gets or sets the description of the runbook.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Gets or sets the draft runbook properties.
     * 
     */
    @Import(name="draft")
    private @Nullable Output<RunbookDraftArgs> draft;

    /**
     * @return Gets or sets the draft runbook properties.
     * 
     */
    public Optional<Output<RunbookDraftArgs>> draft() {
        return Optional.ofNullable(this.draft);
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Gets or sets the location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Gets or sets the activity-level tracing options of the runbook.
     * 
     */
    @Import(name="logActivityTrace")
    private @Nullable Output<Integer> logActivityTrace;

    /**
     * @return Gets or sets the activity-level tracing options of the runbook.
     * 
     */
    public Optional<Output<Integer>> logActivityTrace() {
        return Optional.ofNullable(this.logActivityTrace);
    }

    /**
     * Gets or sets progress log option.
     * 
     */
    @Import(name="logProgress")
    private @Nullable Output<Boolean> logProgress;

    /**
     * @return Gets or sets progress log option.
     * 
     */
    public Optional<Output<Boolean>> logProgress() {
        return Optional.ofNullable(this.logProgress);
    }

    /**
     * Gets or sets verbose log option.
     * 
     */
    @Import(name="logVerbose")
    private @Nullable Output<Boolean> logVerbose;

    /**
     * @return Gets or sets verbose log option.
     * 
     */
    public Optional<Output<Boolean>> logVerbose() {
        return Optional.ofNullable(this.logVerbose);
    }

    /**
     * Gets or sets the name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Gets or sets the name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Gets or sets the published runbook content link.
     * 
     */
    @Import(name="publishContentLink")
    private @Nullable Output<ContentLinkArgs> publishContentLink;

    /**
     * @return Gets or sets the published runbook content link.
     * 
     */
    public Optional<Output<ContentLinkArgs>> publishContentLink() {
        return Optional.ofNullable(this.publishContentLink);
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
     * The runbook name.
     * 
     */
    @Import(name="runbookName")
    private @Nullable Output<String> runbookName;

    /**
     * @return The runbook name.
     * 
     */
    public Optional<Output<String>> runbookName() {
        return Optional.ofNullable(this.runbookName);
    }

    /**
     * Gets or sets the type of the runbook.
     * 
     */
    @Import(name="runbookType", required=true)
    private Output<Either<String,RunbookTypeEnum>> runbookType;

    /**
     * @return Gets or sets the type of the runbook.
     * 
     */
    public Output<Either<String,RunbookTypeEnum>> runbookType() {
        return this.runbookType;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Gets or sets the tags attached to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RunbookArgs() {}

    private RunbookArgs(RunbookArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.description = $.description;
        this.draft = $.draft;
        this.location = $.location;
        this.logActivityTrace = $.logActivityTrace;
        this.logProgress = $.logProgress;
        this.logVerbose = $.logVerbose;
        this.name = $.name;
        this.publishContentLink = $.publishContentLink;
        this.resourceGroupName = $.resourceGroupName;
        this.runbookName = $.runbookName;
        this.runbookType = $.runbookType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunbookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunbookArgs $;

        public Builder() {
            $ = new RunbookArgs();
        }

        public Builder(RunbookArgs defaults) {
            $ = new RunbookArgs(Objects.requireNonNull(defaults));
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
         * @param description Gets or sets the description of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Gets or sets the description of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param draft Gets or sets the draft runbook properties.
         * 
         * @return builder
         * 
         */
        public Builder draft(@Nullable Output<RunbookDraftArgs> draft) {
            $.draft = draft;
            return this;
        }

        /**
         * @param draft Gets or sets the draft runbook properties.
         * 
         * @return builder
         * 
         */
        public Builder draft(RunbookDraftArgs draft) {
            return draft(Output.of(draft));
        }

        /**
         * @param location Gets or sets the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Gets or sets the location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logActivityTrace Gets or sets the activity-level tracing options of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder logActivityTrace(@Nullable Output<Integer> logActivityTrace) {
            $.logActivityTrace = logActivityTrace;
            return this;
        }

        /**
         * @param logActivityTrace Gets or sets the activity-level tracing options of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder logActivityTrace(Integer logActivityTrace) {
            return logActivityTrace(Output.of(logActivityTrace));
        }

        /**
         * @param logProgress Gets or sets progress log option.
         * 
         * @return builder
         * 
         */
        public Builder logProgress(@Nullable Output<Boolean> logProgress) {
            $.logProgress = logProgress;
            return this;
        }

        /**
         * @param logProgress Gets or sets progress log option.
         * 
         * @return builder
         * 
         */
        public Builder logProgress(Boolean logProgress) {
            return logProgress(Output.of(logProgress));
        }

        /**
         * @param logVerbose Gets or sets verbose log option.
         * 
         * @return builder
         * 
         */
        public Builder logVerbose(@Nullable Output<Boolean> logVerbose) {
            $.logVerbose = logVerbose;
            return this;
        }

        /**
         * @param logVerbose Gets or sets verbose log option.
         * 
         * @return builder
         * 
         */
        public Builder logVerbose(Boolean logVerbose) {
            return logVerbose(Output.of(logVerbose));
        }

        /**
         * @param name Gets or sets the name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Gets or sets the name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publishContentLink Gets or sets the published runbook content link.
         * 
         * @return builder
         * 
         */
        public Builder publishContentLink(@Nullable Output<ContentLinkArgs> publishContentLink) {
            $.publishContentLink = publishContentLink;
            return this;
        }

        /**
         * @param publishContentLink Gets or sets the published runbook content link.
         * 
         * @return builder
         * 
         */
        public Builder publishContentLink(ContentLinkArgs publishContentLink) {
            return publishContentLink(Output.of(publishContentLink));
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
         * @param runbookName The runbook name.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(@Nullable Output<String> runbookName) {
            $.runbookName = runbookName;
            return this;
        }

        /**
         * @param runbookName The runbook name.
         * 
         * @return builder
         * 
         */
        public Builder runbookName(String runbookName) {
            return runbookName(Output.of(runbookName));
        }

        /**
         * @param runbookType Gets or sets the type of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder runbookType(Output<Either<String,RunbookTypeEnum>> runbookType) {
            $.runbookType = runbookType;
            return this;
        }

        /**
         * @param runbookType Gets or sets the type of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder runbookType(Either<String,RunbookTypeEnum> runbookType) {
            return runbookType(Output.of(runbookType));
        }

        /**
         * @param runbookType Gets or sets the type of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder runbookType(String runbookType) {
            return runbookType(Either.ofLeft(runbookType));
        }

        /**
         * @param runbookType Gets or sets the type of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder runbookType(RunbookTypeEnum runbookType) {
            return runbookType(Either.ofRight(runbookType));
        }

        /**
         * @param tags Gets or sets the tags attached to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Gets or sets the tags attached to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RunbookArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runbookType = Objects.requireNonNull($.runbookType, "expected parameter 'runbookType' to be non-null");
            return $;
        }
    }

}
