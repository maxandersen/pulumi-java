// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafregional.WebAclAssociationArgs;
import com.pulumi.aws.wafregional.inputs.WebAclAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an association with WAF Regional Web ACL.
 * 
 * &gt; **Note:** An Application Load Balancer can only be associated with one WAF Regional WebACL.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF Regional Web ACL Association can be imported using their `web_acl_id:resource_arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafregional/webAclAssociation:WebAclAssociation foo web_acl_id:resource_arn
 * ```
 * 
 */
@ResourceType(type="aws:wafregional/webAclAssociation:WebAclAssociation")
public class WebAclAssociation extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }
    /**
     * The ID of the WAF Regional WebACL to create an association.
     * 
     */
    @Export(name="webAclId", type=String.class, parameters={})
    private Output<String> webAclId;

    /**
     * @return The ID of the WAF Regional WebACL to create an association.
     * 
     */
    public Output<String> webAclId() {
        return this.webAclId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAclAssociation(String name) {
        this(name, WebAclAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAclAssociation(String name, WebAclAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAclAssociation(String name, WebAclAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/webAclAssociation:WebAclAssociation", name, args == null ? WebAclAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAclAssociation(String name, Output<String> id, @Nullable WebAclAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafregional/webAclAssociation:WebAclAssociation", name, state, makeResourceOptions(options, id));
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
    public static WebAclAssociation get(String name, Output<String> id, @Nullable WebAclAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAclAssociation(name, id, state, options);
    }
}
