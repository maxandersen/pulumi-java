// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appautoscaling.inputs;

import com.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationGetArgs;
import com.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * The ARN assigned by AWS to the scaling policy.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<String> policyType;

    public Optional<Output<String>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    /**
     * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="scalableDimension")
    private @Nullable Output<String> scalableDimension;

    public Optional<Output<String>> scalableDimension() {
        return Optional.ofNullable(this.scalableDimension);
    }

    /**
     * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="serviceNamespace")
    private @Nullable Output<String> serviceNamespace;

    public Optional<Output<String>> serviceNamespace() {
        return Optional.ofNullable(this.serviceNamespace);
    }

    /**
     * Step scaling policy configuration, requires `policy_type = &#34;StepScaling&#34;` (default). See supported fields below.
     * 
     */
    @Import(name="stepScalingPolicyConfiguration")
    private @Nullable Output<PolicyStepScalingPolicyConfigurationGetArgs> stepScalingPolicyConfiguration;

    public Optional<Output<PolicyStepScalingPolicyConfigurationGetArgs>> stepScalingPolicyConfiguration() {
        return Optional.ofNullable(this.stepScalingPolicyConfiguration);
    }

    /**
     * A target tracking policy, requires `policy_type = &#34;TargetTrackingScaling&#34;`. See supported fields below.
     * 
     */
    @Import(name="targetTrackingScalingPolicyConfiguration")
    private @Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationGetArgs> targetTrackingScalingPolicyConfiguration;

    public Optional<Output<PolicyTargetTrackingScalingPolicyConfigurationGetArgs>> targetTrackingScalingPolicyConfiguration() {
        return Optional.ofNullable(this.targetTrackingScalingPolicyConfiguration);
    }

    private PolicyState() {}

    private PolicyState(PolicyState $) {
        this.arn = $.arn;
        this.name = $.name;
        this.policyType = $.policyType;
        this.resourceId = $.resourceId;
        this.scalableDimension = $.scalableDimension;
        this.serviceNamespace = $.serviceNamespace;
        this.stepScalingPolicyConfiguration = $.stepScalingPolicyConfiguration;
        this.targetTrackingScalingPolicyConfiguration = $.targetTrackingScalingPolicyConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyState $;

        public Builder() {
            $ = new PolicyState();
        }

        public Builder(PolicyState defaults) {
            $ = new PolicyState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policyType(@Nullable Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public Builder scalableDimension(@Nullable Output<String> scalableDimension) {
            $.scalableDimension = scalableDimension;
            return this;
        }

        public Builder scalableDimension(String scalableDimension) {
            return scalableDimension(Output.of(scalableDimension));
        }

        public Builder serviceNamespace(@Nullable Output<String> serviceNamespace) {
            $.serviceNamespace = serviceNamespace;
            return this;
        }

        public Builder serviceNamespace(String serviceNamespace) {
            return serviceNamespace(Output.of(serviceNamespace));
        }

        public Builder stepScalingPolicyConfiguration(@Nullable Output<PolicyStepScalingPolicyConfigurationGetArgs> stepScalingPolicyConfiguration) {
            $.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
            return this;
        }

        public Builder stepScalingPolicyConfiguration(PolicyStepScalingPolicyConfigurationGetArgs stepScalingPolicyConfiguration) {
            return stepScalingPolicyConfiguration(Output.of(stepScalingPolicyConfiguration));
        }

        public Builder targetTrackingScalingPolicyConfiguration(@Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationGetArgs> targetTrackingScalingPolicyConfiguration) {
            $.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
            return this;
        }

        public Builder targetTrackingScalingPolicyConfiguration(PolicyTargetTrackingScalingPolicyConfigurationGetArgs targetTrackingScalingPolicyConfiguration) {
            return targetTrackingScalingPolicyConfiguration(Output.of(targetTrackingScalingPolicyConfiguration));
        }

        public PolicyState build() {
            return $;
        }
    }

}
