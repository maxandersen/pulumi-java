// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securityhub.MemberArgs;
import com.pulumi.aws.securityhub.inputs.MemberState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Security Hub member resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Security Hub members can be imported using their account ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/member:Member example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/member:Member")
public class Member extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the member AWS account.
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return The ID of the member AWS account.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The email of the member AWS account.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email of the member AWS account.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
     * 
     */
    @Export(name="invite", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> invite;

    /**
     * @return Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> invite() {
        return this.invite;
    }
    /**
     * The ID of the master Security Hub AWS account.
     * 
     */
    @Export(name="masterId", type=String.class, parameters={})
    private Output<String> masterId;

    /**
     * @return The ID of the master Security Hub AWS account.
     * 
     */
    public Output<String> masterId() {
        return this.masterId;
    }
    /**
     * The status of the member account relationship.
     * 
     */
    @Export(name="memberStatus", type=String.class, parameters={})
    private Output<String> memberStatus;

    /**
     * @return The status of the member account relationship.
     * 
     */
    public Output<String> memberStatus() {
        return this.memberStatus;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Member(String name) {
        this(name, MemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Member(String name, MemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Member(String name, MemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/member:Member", name, args == null ? MemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Member(String name, Output<String> id, @Nullable MemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/member:Member", name, state, makeResourceOptions(options, id));
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
    public static Member get(String name, Output<String> id, @Nullable MemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Member(name, id, state, options);
    }
}
