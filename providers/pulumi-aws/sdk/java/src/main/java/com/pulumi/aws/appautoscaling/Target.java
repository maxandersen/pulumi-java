// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appautoscaling.TargetArgs;
import com.pulumi.aws.appautoscaling.inputs.TargetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Application AutoScaling ScalableTarget resource. To manage policies which get attached to the target, see the `aws.appautoscaling.Policy` resource.
 * 
 * &gt; **NOTE:** The [Application Auto Scaling service automatically attempts to manage IAM Service-Linked Roles](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) when registering certain service namespaces for the first time. To manually manage this role, see the `aws.iam.ServiceLinkedRole` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Application AutoScaling Target can be imported using the `service-namespace` , `resource-id` and `scalable-dimension` separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:appautoscaling/target:Target test-target service-namespace/resource-id/scalable-dimension
 * ```
 * 
 */
@ResourceType(type="aws:appautoscaling/target:Target")
public class Target extends com.pulumi.resources.CustomResource {
    /**
     * The max capacity of the scalable target.
     * 
     */
    @Export(name="maxCapacity", type=Integer.class, parameters={})
    private Output<Integer> maxCapacity;

    /**
     * @return The max capacity of the scalable target.
     * 
     */
    public Output<Integer> maxCapacity() {
        return this.maxCapacity;
    }
    /**
     * The min capacity of the scalable target.
     * 
     */
    @Export(name="minCapacity", type=Integer.class, parameters={})
    private Output<Integer> minCapacity;

    /**
     * @return The min capacity of the scalable target.
     * 
     */
    public Output<Integer> minCapacity() {
        return this.minCapacity;
    }
    /**
     * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM role that allows Application AutoScaling to modify your scalable target on your behalf. This defaults to an IAM Service-Linked Role for most services and custom IAM Roles are ignored by the API for those namespaces. See the [AWS Application Auto Scaling documentation](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html#security_iam_service-with-iam-roles) for more information about how this service interacts with IAM.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Export(name="scalableDimension", type=String.class, parameters={})
    private Output<String> scalableDimension;

    /**
     * @return The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Output<String> scalableDimension() {
        return this.scalableDimension;
    }
    /**
     * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Export(name="serviceNamespace", type=String.class, parameters={})
    private Output<String> serviceNamespace;

    /**
     * @return The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    public Output<String> serviceNamespace() {
        return this.serviceNamespace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Target(String name) {
        this(name, TargetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Target(String name, TargetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Target(String name, TargetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appautoscaling/target:Target", name, args == null ? TargetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Target(String name, Output<String> id, @Nullable TargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appautoscaling/target:Target", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Target get(String name, Output<String> id, @Nullable TargetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Target(name, id, state, options);
    }
}
