// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs();

    @Import(name="instanceGroupManagerName")
    private @Nullable Output<String> instanceGroupManagerName;

    public Optional<Output<String>> instanceGroupManagerName() {
        return Optional.ofNullable(this.instanceGroupManagerName);
    }

    @Import(name="instanceTemplateName")
    private @Nullable Output<String> instanceTemplateName;

    public Optional<Output<String>> instanceTemplateName() {
        return Optional.ofNullable(this.instanceTemplateName);
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs $) {
        this.instanceGroupManagerName = $.instanceGroupManagerName;
        this.instanceTemplateName = $.instanceTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceGroupManagerName(@Nullable Output<String> instanceGroupManagerName) {
            $.instanceGroupManagerName = instanceGroupManagerName;
            return this;
        }

        public Builder instanceGroupManagerName(String instanceGroupManagerName) {
            return instanceGroupManagerName(Output.of(instanceGroupManagerName));
        }

        public Builder instanceTemplateName(@Nullable Output<String> instanceTemplateName) {
            $.instanceTemplateName = instanceTemplateName;
            return this;
        }

        public Builder instanceTemplateName(String instanceTemplateName) {
            return instanceTemplateName(Output.of(instanceTemplateName));
        }

        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigGetArgs build() {
            return $;
        }
    }

}
