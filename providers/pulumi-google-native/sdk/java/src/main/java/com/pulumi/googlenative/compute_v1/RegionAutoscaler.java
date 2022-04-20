// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_v1.RegionAutoscalerArgs;
import com.pulumi.googlenative.compute_v1.outputs.AutoscalerStatusDetailsResponse;
import com.pulumi.googlenative.compute_v1.outputs.AutoscalingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an autoscaler in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:RegionAutoscaler")
public class RegionAutoscaler extends com.pulumi.resources.CustomResource {
    /**
     * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    @Export(name="autoscalingPolicy", type=AutoscalingPolicyResponse.class, parameters={})
    private Output<AutoscalingPolicyResponse> autoscalingPolicy;

    /**
     * @return The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
     * 
     */
    public Output<AutoscalingPolicyResponse> autoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#autoscaler for autoscalers.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#autoscaler for autoscalers.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
     * 
     */
    @Export(name="recommendedSize", type=Integer.class, parameters={})
    private Output<Integer> recommendedSize;

    /**
     * @return Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
     * 
     */
    public Output<Integer> recommendedSize() {
        return this.recommendedSize;
    }
    /**
     * URL of the region where the instance group resides (for autoscalers living in regional scope).
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the instance group resides (for autoscalers living in regional scope).
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Status information of existing scaling schedules.
     * 
     */
    @Export(name="scalingScheduleStatus", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> scalingScheduleStatus;

    /**
     * @return Status information of existing scaling schedules.
     * 
     */
    public Output<Map<String,String>> scalingScheduleStatus() {
        return this.scalingScheduleStatus;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn&#39;t read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn&#39;t read new/updated configuration. - DELETING: Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
     * 
     */
    @Export(name="statusDetails", type=List.class, parameters={AutoscalerStatusDetailsResponse.class})
    private Output<List<AutoscalerStatusDetailsResponse>> statusDetails;

    /**
     * @return Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you might encounter.
     * 
     */
    public Output<List<AutoscalerStatusDetailsResponse>> statusDetails() {
        return this.statusDetails;
    }
    /**
     * URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output<String> target;

    /**
     * @return URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler.
     * 
     */
    public Output<String> target() {
        return this.target;
    }
    /**
     * URL of the zone where the instance group resides (for autoscalers living in zonal scope).
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return URL of the zone where the instance group resides (for autoscalers living in zonal scope).
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionAutoscaler(String name) {
        this(name, RegionAutoscalerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionAutoscaler(String name, RegionAutoscalerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionAutoscaler(String name, RegionAutoscalerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionAutoscaler", name, args == null ? RegionAutoscalerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionAutoscaler(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:RegionAutoscaler", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionAutoscaler get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionAutoscaler(name, id, options);
    }
}
