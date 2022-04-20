// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.macie.MemberAccountAssociationArgs;
import com.pulumi.aws.macie.inputs.MemberAccountAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * &gt; **NOTE:** This resource interacts with [Amazon Macie Classic](https://docs.aws.amazon.com/macie/latest/userguide/what-is-macie.html). Macie Classic cannot be activated in new accounts. See the [FAQ](https://aws.amazon.com/macie/classic-faqs/) for more details.
 * 
 * Associates an AWS account with Amazon Macie as a member account.
 * 
 * &gt; **NOTE:** Before using Amazon Macie for the first time it must be enabled manually. Instructions are [here](https://docs.aws.amazon.com/macie/latest/userguide/macie-setting-up.html#macie-setting-up-enable).
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:macie/memberAccountAssociation:MemberAccountAssociation")
public class MemberAccountAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * 
     */
    @Export(name="memberAccountId", type=String.class, parameters={})
    private Output<String> memberAccountId;

    /**
     * @return The ID of the AWS account that you want to associate with Amazon Macie as a member account.
     * 
     */
    public Output<String> memberAccountId() {
        return this.memberAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MemberAccountAssociation(String name) {
        this(name, MemberAccountAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MemberAccountAssociation(String name, MemberAccountAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MemberAccountAssociation(String name, MemberAccountAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie/memberAccountAssociation:MemberAccountAssociation", name, args == null ? MemberAccountAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MemberAccountAssociation(String name, Output<String> id, @Nullable MemberAccountAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie/memberAccountAssociation:MemberAccountAssociation", name, state, makeResourceOptions(options, id));
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
    public static MemberAccountAssociation get(String name, Output<String> id, @Nullable MemberAccountAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MemberAccountAssociation(name, id, state, options);
    }
}
