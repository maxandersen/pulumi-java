// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementClusterSelectorGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementClusterSelectorGetArgs Empty = new WorkflowTemplatePlacementClusterSelectorGetArgs();

    /**
     * Required. The cluster labels. Cluster must have all labels to match.
     * 
     */
    @Import(name="clusterLabels", required=true)
    private Output<Map<String,String>> clusterLabels;

    public Output<Map<String,String>> clusterLabels() {
        return this.clusterLabels;
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the &#34;global&#34; region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private WorkflowTemplatePlacementClusterSelectorGetArgs() {}

    private WorkflowTemplatePlacementClusterSelectorGetArgs(WorkflowTemplatePlacementClusterSelectorGetArgs $) {
        this.clusterLabels = $.clusterLabels;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementClusterSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementClusterSelectorGetArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementClusterSelectorGetArgs();
        }

        public Builder(WorkflowTemplatePlacementClusterSelectorGetArgs defaults) {
            $ = new WorkflowTemplatePlacementClusterSelectorGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterLabels(Output<Map<String,String>> clusterLabels) {
            $.clusterLabels = clusterLabels;
            return this;
        }

        public Builder clusterLabels(Map<String,String> clusterLabels) {
            return clusterLabels(Output.of(clusterLabels));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public WorkflowTemplatePlacementClusterSelectorGetArgs build() {
            $.clusterLabels = Objects.requireNonNull($.clusterLabels, "expected parameter 'clusterLabels' to be non-null");
            return $;
        }
    }

}
