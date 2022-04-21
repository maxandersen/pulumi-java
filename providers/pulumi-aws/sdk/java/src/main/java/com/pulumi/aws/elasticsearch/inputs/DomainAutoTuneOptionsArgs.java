// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainAutoTuneOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainAutoTuneOptionsArgs Empty = new DomainAutoTuneOptionsArgs();

    /**
     * The Auto-Tune desired state for the domain. Valid values: `ENABLED` or `DISABLED`.
     * 
     */
    @Import(name="desiredState", required=true)
    private Output<String> desiredState;

    public Output<String> desiredState() {
        return this.desiredState;
    }

    /**
     * Configuration block for Auto-Tune maintenance windows. Can be specified multiple times for each maintenance window. Detailed below.
     * 
     */
    @Import(name="maintenanceSchedules")
    private @Nullable Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>> maintenanceSchedules;

    public Optional<Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>>> maintenanceSchedules() {
        return Optional.ofNullable(this.maintenanceSchedules);
    }

    /**
     * Whether to roll back to default Auto-Tune settings when disabling Auto-Tune. Valid values: `DEFAULT_ROLLBACK` or `NO_ROLLBACK`.
     * 
     */
    @Import(name="rollbackOnDisable")
    private @Nullable Output<String> rollbackOnDisable;

    public Optional<Output<String>> rollbackOnDisable() {
        return Optional.ofNullable(this.rollbackOnDisable);
    }

    private DomainAutoTuneOptionsArgs() {}

    private DomainAutoTuneOptionsArgs(DomainAutoTuneOptionsArgs $) {
        this.desiredState = $.desiredState;
        this.maintenanceSchedules = $.maintenanceSchedules;
        this.rollbackOnDisable = $.rollbackOnDisable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainAutoTuneOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainAutoTuneOptionsArgs $;

        public Builder() {
            $ = new DomainAutoTuneOptionsArgs();
        }

        public Builder(DomainAutoTuneOptionsArgs defaults) {
            $ = new DomainAutoTuneOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder desiredState(Output<String> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        public Builder desiredState(String desiredState) {
            return desiredState(Output.of(desiredState));
        }

        public Builder maintenanceSchedules(@Nullable Output<List<DomainAutoTuneOptionsMaintenanceScheduleArgs>> maintenanceSchedules) {
            $.maintenanceSchedules = maintenanceSchedules;
            return this;
        }

        public Builder maintenanceSchedules(List<DomainAutoTuneOptionsMaintenanceScheduleArgs> maintenanceSchedules) {
            return maintenanceSchedules(Output.of(maintenanceSchedules));
        }

        public Builder maintenanceSchedules(DomainAutoTuneOptionsMaintenanceScheduleArgs... maintenanceSchedules) {
            return maintenanceSchedules(List.of(maintenanceSchedules));
        }

        public Builder rollbackOnDisable(@Nullable Output<String> rollbackOnDisable) {
            $.rollbackOnDisable = rollbackOnDisable;
            return this;
        }

        public Builder rollbackOnDisable(String rollbackOnDisable) {
            return rollbackOnDisable(Output.of(rollbackOnDisable));
        }

        public DomainAutoTuneOptionsArgs build() {
            $.desiredState = Objects.requireNonNull($.desiredState, "expected parameter 'desiredState' to be non-null");
            return $;
        }
    }

}
