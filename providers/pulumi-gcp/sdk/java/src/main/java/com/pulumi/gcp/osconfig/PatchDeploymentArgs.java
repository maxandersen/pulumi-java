// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentOneTimeScheduleArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleArgs;
import com.pulumi.gcp.osconfig.inputs.PatchDeploymentRolloutArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentArgs Empty = new PatchDeploymentArgs();

    /**
     * Description of the patch deployment. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Duration of the patch. After the duration ends, the patch times out.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * VM instances to patch.
     * Structure is documented below.
     * 
     */
    @Import(name="instanceFilter", required=true)
    private Output<PatchDeploymentInstanceFilterArgs> instanceFilter;

    public Output<PatchDeploymentInstanceFilterArgs> instanceFilter() {
        return this.instanceFilter;
    }

    /**
     * Schedule a one-time execution.
     * Structure is documented below.
     * 
     */
    @Import(name="oneTimeSchedule")
    private @Nullable Output<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule;

    public Optional<Output<PatchDeploymentOneTimeScheduleArgs>> oneTimeSchedule() {
        return Optional.ofNullable(this.oneTimeSchedule);
    }

    /**
     * Patch configuration that is applied.
     * Structure is documented below.
     * 
     */
    @Import(name="patchConfig")
    private @Nullable Output<PatchDeploymentPatchConfigArgs> patchConfig;

    public Optional<Output<PatchDeploymentPatchConfigArgs>> patchConfig() {
        return Optional.ofNullable(this.patchConfig);
    }

    /**
     * A name for the patch deployment in the project. When creating a name the following rules apply:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @Import(name="patchDeploymentId", required=true)
    private Output<String> patchDeploymentId;

    public Output<String> patchDeploymentId() {
        return this.patchDeploymentId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Schedule recurring executions.
     * Structure is documented below.
     * 
     */
    @Import(name="recurringSchedule")
    private @Nullable Output<PatchDeploymentRecurringScheduleArgs> recurringSchedule;

    public Optional<Output<PatchDeploymentRecurringScheduleArgs>> recurringSchedule() {
        return Optional.ofNullable(this.recurringSchedule);
    }

    /**
     * Rollout strategy of the patch job.
     * Structure is documented below.
     * 
     */
    @Import(name="rollout")
    private @Nullable Output<PatchDeploymentRolloutArgs> rollout;

    public Optional<Output<PatchDeploymentRolloutArgs>> rollout() {
        return Optional.ofNullable(this.rollout);
    }

    private PatchDeploymentArgs() {}

    private PatchDeploymentArgs(PatchDeploymentArgs $) {
        this.description = $.description;
        this.duration = $.duration;
        this.instanceFilter = $.instanceFilter;
        this.oneTimeSchedule = $.oneTimeSchedule;
        this.patchConfig = $.patchConfig;
        this.patchDeploymentId = $.patchDeploymentId;
        this.project = $.project;
        this.recurringSchedule = $.recurringSchedule;
        this.rollout = $.rollout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchDeploymentArgs $;

        public Builder() {
            $ = new PatchDeploymentArgs();
        }

        public Builder(PatchDeploymentArgs defaults) {
            $ = new PatchDeploymentArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        public Builder instanceFilter(Output<PatchDeploymentInstanceFilterArgs> instanceFilter) {
            $.instanceFilter = instanceFilter;
            return this;
        }

        public Builder instanceFilter(PatchDeploymentInstanceFilterArgs instanceFilter) {
            return instanceFilter(Output.of(instanceFilter));
        }

        public Builder oneTimeSchedule(@Nullable Output<PatchDeploymentOneTimeScheduleArgs> oneTimeSchedule) {
            $.oneTimeSchedule = oneTimeSchedule;
            return this;
        }

        public Builder oneTimeSchedule(PatchDeploymentOneTimeScheduleArgs oneTimeSchedule) {
            return oneTimeSchedule(Output.of(oneTimeSchedule));
        }

        public Builder patchConfig(@Nullable Output<PatchDeploymentPatchConfigArgs> patchConfig) {
            $.patchConfig = patchConfig;
            return this;
        }

        public Builder patchConfig(PatchDeploymentPatchConfigArgs patchConfig) {
            return patchConfig(Output.of(patchConfig));
        }

        public Builder patchDeploymentId(Output<String> patchDeploymentId) {
            $.patchDeploymentId = patchDeploymentId;
            return this;
        }

        public Builder patchDeploymentId(String patchDeploymentId) {
            return patchDeploymentId(Output.of(patchDeploymentId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder recurringSchedule(@Nullable Output<PatchDeploymentRecurringScheduleArgs> recurringSchedule) {
            $.recurringSchedule = recurringSchedule;
            return this;
        }

        public Builder recurringSchedule(PatchDeploymentRecurringScheduleArgs recurringSchedule) {
            return recurringSchedule(Output.of(recurringSchedule));
        }

        public Builder rollout(@Nullable Output<PatchDeploymentRolloutArgs> rollout) {
            $.rollout = rollout;
            return this;
        }

        public Builder rollout(PatchDeploymentRolloutArgs rollout) {
            return rollout(Output.of(rollout));
        }

        public PatchDeploymentArgs build() {
            $.instanceFilter = Objects.requireNonNull($.instanceFilter, "expected parameter 'instanceFilter' to be non-null");
            $.patchDeploymentId = Objects.requireNonNull($.patchDeploymentId, "expected parameter 'patchDeploymentId' to be non-null");
            return $;
        }
    }

}
