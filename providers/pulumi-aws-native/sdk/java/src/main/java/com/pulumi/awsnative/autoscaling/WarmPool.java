// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.autoscaling;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.autoscaling.WarmPoolArgs;
import com.pulumi.awsnative.autoscaling.outputs.WarmPoolInstanceReusePolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::AutoScaling::WarmPool.
 * 
 */
@ResourceType(type="aws-native:autoscaling:WarmPool")
public class WarmPool extends com.pulumi.resources.CustomResource {
    @Export(name="autoScalingGroupName", type=String.class, parameters={})
    private Output<String> autoScalingGroupName;

    public Output<String> autoScalingGroupName() {
        return this.autoScalingGroupName;
    }
    @Export(name="instanceReusePolicy", type=WarmPoolInstanceReusePolicy.class, parameters={})
    private Output</* @Nullable */ WarmPoolInstanceReusePolicy> instanceReusePolicy;

    public Output</* @Nullable */ WarmPoolInstanceReusePolicy> instanceReusePolicy() {
        return this.instanceReusePolicy;
    }
    @Export(name="maxGroupPreparedCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxGroupPreparedCapacity;

    public Output</* @Nullable */ Integer> maxGroupPreparedCapacity() {
        return this.maxGroupPreparedCapacity;
    }
    @Export(name="minSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minSize;

    public Output</* @Nullable */ Integer> minSize() {
        return this.minSize;
    }
    @Export(name="poolState", type=String.class, parameters={})
    private Output</* @Nullable */ String> poolState;

    public Output</* @Nullable */ String> poolState() {
        return this.poolState;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WarmPool(String name) {
        this(name, WarmPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WarmPool(String name, WarmPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WarmPool(String name, WarmPoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:autoscaling:WarmPool", name, args == null ? WarmPoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WarmPool(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:autoscaling:WarmPool", name, null, makeResourceOptions(options, id));
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
    public static WarmPool get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WarmPool(name, id, options);
    }
}
