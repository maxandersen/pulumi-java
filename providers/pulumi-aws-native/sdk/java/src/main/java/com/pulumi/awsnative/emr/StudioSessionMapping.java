// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emr;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.emr.StudioSessionMappingArgs;
import com.pulumi.awsnative.emr.enums.StudioSessionMappingIdentityType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:emr:StudioSessionMapping")
public class StudioSessionMapping extends com.pulumi.resources.CustomResource {
    /**
     * The name of the user or group. For more information, see UserName and DisplayName in the AWS SSO Identity Store API Reference. Either IdentityName or IdentityId must be specified.
     * 
     */
    @Export(name="identityName", type=String.class, parameters={})
    private Output<String> identityName;

    /**
     * @return The name of the user or group. For more information, see UserName and DisplayName in the AWS SSO Identity Store API Reference. Either IdentityName or IdentityId must be specified.
     * 
     */
    public Output<String> identityName() {
        return this.identityName;
    }
    /**
     * Specifies whether the identity to map to the Studio is a user or a group.
     * 
     */
    @Export(name="identityType", type=StudioSessionMappingIdentityType.class, parameters={})
    private Output<StudioSessionMappingIdentityType> identityType;

    /**
     * @return Specifies whether the identity to map to the Studio is a user or a group.
     * 
     */
    public Output<StudioSessionMappingIdentityType> identityType() {
        return this.identityType;
    }
    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. Session policies refine Studio user permissions without the need to use multiple IAM user roles.
     * 
     */
    @Export(name="sessionPolicyArn", type=String.class, parameters={})
    private Output<String> sessionPolicyArn;

    /**
     * @return The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. Session policies refine Studio user permissions without the need to use multiple IAM user roles.
     * 
     */
    public Output<String> sessionPolicyArn() {
        return this.sessionPolicyArn;
    }
    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @Export(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    /**
     * @return The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    public Output<String> studioId() {
        return this.studioId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StudioSessionMapping(String name) {
        this(name, StudioSessionMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StudioSessionMapping(String name, StudioSessionMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StudioSessionMapping(String name, StudioSessionMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:emr:StudioSessionMapping", name, args == null ? StudioSessionMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StudioSessionMapping(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:emr:StudioSessionMapping", name, null, makeResourceOptions(options, id));
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
    public static StudioSessionMapping get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StudioSessionMapping(name, id, options);
    }
}
