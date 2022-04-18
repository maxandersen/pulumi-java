// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.wafv2.WebACLAssociationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Associates WebACL to Application Load Balancer, CloudFront or API Gateway.
 * 
 */
@ResourceType(type="aws-native:wafv2:WebACLAssociation")
public class WebACLAssociation extends com.pulumi.resources.CustomResource {
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    @Export(name="webACLArn", type=String.class, parameters={})
    private Output<String> webACLArn;

    public Output<String> webACLArn() {
        return this.webACLArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebACLAssociation(String name) {
        this(name, WebACLAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebACLAssociation(String name, WebACLAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebACLAssociation(String name, WebACLAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:WebACLAssociation", name, args == null ? WebACLAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebACLAssociation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:WebACLAssociation", name, null, makeResourceOptions(options, id));
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
    public static WebACLAssociation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebACLAssociation(name, id, options);
    }
}
