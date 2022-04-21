// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.ssm.inputs.AssociationOutputLocationArgs;
import com.pulumi.aws.ssm.inputs.AssociationTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssociationArgs Empty = new AssociationArgs();

    /**
     * By default, when you create a new or update associations, the system runs it immediately and then according to the schedule you specified. Enable this option if you do not want an association to run immediately after you create or update it. This parameter is not supported for rate expressions. Default: `false`.
     * 
     */
    @Import(name="applyOnlyAtCronInterval")
    private @Nullable Output<Boolean> applyOnlyAtCronInterval;

    public Optional<Output<Boolean>> applyOnlyAtCronInterval() {
        return Optional.ofNullable(this.applyOnlyAtCronInterval);
    }

    /**
     * The descriptive name for the association.
     * 
     */
    @Import(name="associationName")
    private @Nullable Output<String> associationName;

    public Optional<Output<String>> associationName() {
        return Optional.ofNullable(this.associationName);
    }

    /**
     * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls. This should be set to the SSM document `parameter` that will define how your automation will branch out.
     * 
     */
    @Import(name="automationTargetParameterName")
    private @Nullable Output<String> automationTargetParameterName;

    public Optional<Output<String>> automationTargetParameterName() {
        return Optional.ofNullable(this.automationTargetParameterName);
    }

    /**
     * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
     * 
     */
    @Import(name="complianceSeverity")
    private @Nullable Output<String> complianceSeverity;

    public Optional<Output<String>> complianceSeverity() {
        return Optional.ofNullable(this.complianceSeverity);
    }

    /**
     * The document version you want to associate with the target(s). Can be a specific version or the default version.
     * 
     */
    @Import(name="documentVersion")
    private @Nullable Output<String> documentVersion;

    public Optional<Output<String>> documentVersion() {
        return Optional.ofNullable(this.documentVersion);
    }

    /**
     * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    @Import(name="maxConcurrency")
    private @Nullable Output<String> maxConcurrency;

    public Optional<Output<String>> maxConcurrency() {
        return Optional.ofNullable(this.maxConcurrency);
    }

    /**
     * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
     * 
     */
    @Import(name="maxErrors")
    private @Nullable Output<String> maxErrors;

    public Optional<Output<String>> maxErrors() {
        return Optional.ofNullable(this.maxErrors);
    }

    /**
     * The name of the SSM document to apply.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An output location block. Output Location is documented below.
     * 
     */
    @Import(name="outputLocation")
    private @Nullable Output<AssociationOutputLocationArgs> outputLocation;

    public Optional<Output<AssociationOutputLocationArgs>> outputLocation() {
        return Optional.ofNullable(this.outputLocation);
    }

    /**
     * A block of arbitrary string parameters to pass to the SSM document.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A cron expression when the association will be applied to the target(s).
     * 
     */
    @Import(name="scheduleExpression")
    private @Nullable Output<String> scheduleExpression;

    public Optional<Output<String>> scheduleExpression() {
        return Optional.ofNullable(this.scheduleExpression);
    }

    /**
     * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<List<AssociationTargetArgs>> targets;

    public Optional<Output<List<AssociationTargetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    private AssociationArgs() {}

    private AssociationArgs(AssociationArgs $) {
        this.applyOnlyAtCronInterval = $.applyOnlyAtCronInterval;
        this.associationName = $.associationName;
        this.automationTargetParameterName = $.automationTargetParameterName;
        this.complianceSeverity = $.complianceSeverity;
        this.documentVersion = $.documentVersion;
        this.instanceId = $.instanceId;
        this.maxConcurrency = $.maxConcurrency;
        this.maxErrors = $.maxErrors;
        this.name = $.name;
        this.outputLocation = $.outputLocation;
        this.parameters = $.parameters;
        this.scheduleExpression = $.scheduleExpression;
        this.targets = $.targets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssociationArgs $;

        public Builder() {
            $ = new AssociationArgs();
        }

        public Builder(AssociationArgs defaults) {
            $ = new AssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applyOnlyAtCronInterval(@Nullable Output<Boolean> applyOnlyAtCronInterval) {
            $.applyOnlyAtCronInterval = applyOnlyAtCronInterval;
            return this;
        }

        public Builder applyOnlyAtCronInterval(Boolean applyOnlyAtCronInterval) {
            return applyOnlyAtCronInterval(Output.of(applyOnlyAtCronInterval));
        }

        public Builder associationName(@Nullable Output<String> associationName) {
            $.associationName = associationName;
            return this;
        }

        public Builder associationName(String associationName) {
            return associationName(Output.of(associationName));
        }

        public Builder automationTargetParameterName(@Nullable Output<String> automationTargetParameterName) {
            $.automationTargetParameterName = automationTargetParameterName;
            return this;
        }

        public Builder automationTargetParameterName(String automationTargetParameterName) {
            return automationTargetParameterName(Output.of(automationTargetParameterName));
        }

        public Builder complianceSeverity(@Nullable Output<String> complianceSeverity) {
            $.complianceSeverity = complianceSeverity;
            return this;
        }

        public Builder complianceSeverity(String complianceSeverity) {
            return complianceSeverity(Output.of(complianceSeverity));
        }

        public Builder documentVersion(@Nullable Output<String> documentVersion) {
            $.documentVersion = documentVersion;
            return this;
        }

        public Builder documentVersion(String documentVersion) {
            return documentVersion(Output.of(documentVersion));
        }

        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder maxConcurrency(@Nullable Output<String> maxConcurrency) {
            $.maxConcurrency = maxConcurrency;
            return this;
        }

        public Builder maxConcurrency(String maxConcurrency) {
            return maxConcurrency(Output.of(maxConcurrency));
        }

        public Builder maxErrors(@Nullable Output<String> maxErrors) {
            $.maxErrors = maxErrors;
            return this;
        }

        public Builder maxErrors(String maxErrors) {
            return maxErrors(Output.of(maxErrors));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder outputLocation(@Nullable Output<AssociationOutputLocationArgs> outputLocation) {
            $.outputLocation = outputLocation;
            return this;
        }

        public Builder outputLocation(AssociationOutputLocationArgs outputLocation) {
            return outputLocation(Output.of(outputLocation));
        }

        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder scheduleExpression(@Nullable Output<String> scheduleExpression) {
            $.scheduleExpression = scheduleExpression;
            return this;
        }

        public Builder scheduleExpression(String scheduleExpression) {
            return scheduleExpression(Output.of(scheduleExpression));
        }

        public Builder targets(@Nullable Output<List<AssociationTargetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<AssociationTargetArgs> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(AssociationTargetArgs... targets) {
            return targets(List.of(targets));
        }

        public AssociationArgs build() {
            return $;
        }
    }

}
