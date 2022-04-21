// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1beta.inputs.LabelSelectorResponse;
import com.pulumi.googlenative.gameservices_v1beta.inputs.ScheduleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Autoscaling config for an Agones fleet.
 * 
 */
public final class ScalingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScalingConfigResponse Empty = new ScalingConfigResponse();

    /**
     * Agones fleet autoscaler spec. Example spec: https://agones.dev/site/docs/reference/fleetautoscaler/
     * 
     */
    @Import(name="fleetAutoscalerSpec", required=true)
    private String fleetAutoscalerSpec;

    public String fleetAutoscalerSpec() {
        return this.fleetAutoscalerSpec;
    }

    /**
     * The name of the Scaling Config
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The schedules to which this Scaling Config applies.
     * 
     */
    @Import(name="schedules", required=true)
    private List<ScheduleResponse> schedules;

    public List<ScheduleResponse> schedules() {
        return this.schedules;
    }

    /**
     * Labels used to identify the game server clusters to which this Agones scaling config applies. A game server cluster is subject to this Agones scaling config if its labels match any of the selector entries.
     * 
     */
    @Import(name="selectors", required=true)
    private List<LabelSelectorResponse> selectors;

    public List<LabelSelectorResponse> selectors() {
        return this.selectors;
    }

    private ScalingConfigResponse() {}

    private ScalingConfigResponse(ScalingConfigResponse $) {
        this.fleetAutoscalerSpec = $.fleetAutoscalerSpec;
        this.name = $.name;
        this.schedules = $.schedules;
        this.selectors = $.selectors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalingConfigResponse $;

        public Builder() {
            $ = new ScalingConfigResponse();
        }

        public Builder(ScalingConfigResponse defaults) {
            $ = new ScalingConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder fleetAutoscalerSpec(String fleetAutoscalerSpec) {
            $.fleetAutoscalerSpec = fleetAutoscalerSpec;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder schedules(List<ScheduleResponse> schedules) {
            $.schedules = schedules;
            return this;
        }

        public Builder schedules(ScheduleResponse... schedules) {
            return schedules(List.of(schedules));
        }

        public Builder selectors(List<LabelSelectorResponse> selectors) {
            $.selectors = selectors;
            return this;
        }

        public Builder selectors(LabelSelectorResponse... selectors) {
            return selectors(List.of(selectors));
        }

        public ScalingConfigResponse build() {
            $.fleetAutoscalerSpec = Objects.requireNonNull($.fleetAutoscalerSpec, "expected parameter 'fleetAutoscalerSpec' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.schedules = Objects.requireNonNull($.schedules, "expected parameter 'schedules' to be non-null");
            $.selectors = Objects.requireNonNull($.selectors, "expected parameter 'selectors' to be non-null");
            return $;
        }
    }

}
