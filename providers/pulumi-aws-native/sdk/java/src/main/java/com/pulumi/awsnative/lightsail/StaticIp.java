// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.lightsail.StaticIpArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Lightsail::StaticIp
 * 
 */
@ResourceType(type="aws-native:lightsail:StaticIp")
public class StaticIp extends com.pulumi.resources.CustomResource {
    /**
     * The instance where the static IP is attached.
     * 
     */
    @Export(name="attachedTo", type=String.class, parameters={})
    private Output</* @Nullable */ String> attachedTo;

    /**
     * @return The instance where the static IP is attached.
     * 
     */
    public Output</* @Nullable */ String> attachedTo() {
        return this.attachedTo;
    }
    /**
     * The static IP address.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The static IP address.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * A Boolean value indicating whether the static IP is attached.
     * 
     */
    @Export(name="isAttached", type=Boolean.class, parameters={})
    private Output<Boolean> isAttached;

    /**
     * @return A Boolean value indicating whether the static IP is attached.
     * 
     */
    public Output<Boolean> isAttached() {
        return this.isAttached;
    }
    @Export(name="staticIpArn", type=String.class, parameters={})
    private Output<String> staticIpArn;

    public Output<String> staticIpArn() {
        return this.staticIpArn;
    }
    /**
     * The name of the static IP address.
     * 
     */
    @Export(name="staticIpName", type=String.class, parameters={})
    private Output<String> staticIpName;

    /**
     * @return The name of the static IP address.
     * 
     */
    public Output<String> staticIpName() {
        return this.staticIpName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticIp(String name) {
        this(name, StaticIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticIp(String name, @Nullable StaticIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticIp(String name, @Nullable StaticIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:StaticIp", name, args == null ? StaticIpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticIp(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:StaticIp", name, null, makeResourceOptions(options, id));
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
    public static StaticIp get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticIp(name, id, options);
    }
}
