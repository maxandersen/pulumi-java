// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.AccountPasswordPolicyArgs;
import com.pulumi.aws.iam.inputs.AccountPasswordPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import javax.annotation.Nullable;

/**
 * &gt; **Note:** There is only a single policy allowed per AWS account. An existing policy will be lost when using this resource as an effect of this limitation.
 * 
 * Manages Password Policy for the AWS Account.
 * See more about [Account Password Policy](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_account-policy.html)
 * in the official AWS docs.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM Account Password Policy can be imported using the word `iam-account-password-policy`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/accountPasswordPolicy:AccountPasswordPolicy strict iam-account-password-policy
 * ```
 * 
 */
@ResourceType(type="aws:iam/accountPasswordPolicy:AccountPasswordPolicy")
public class AccountPasswordPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Whether to allow users to change their own password
     * 
     */
    @Export(name="allowUsersToChangePassword", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowUsersToChangePassword;

    /**
     * @return Whether to allow users to change their own password
     * 
     */
    public Output</* @Nullable */ Boolean> allowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }
    /**
     * Indicates whether passwords in the account expire. Returns `true` if `max_password_age` contains a value greater than `0`. Returns `false` if it is `0` or _not present_.
     * 
     */
    @Export(name="expirePasswords", type=Boolean.class, parameters={})
    private Output<Boolean> expirePasswords;

    /**
     * @return Indicates whether passwords in the account expire. Returns `true` if `max_password_age` contains a value greater than `0`. Returns `false` if it is `0` or _not present_.
     * 
     */
    public Output<Boolean> expirePasswords() {
        return this.expirePasswords;
    }
    /**
     * Whether users are prevented from setting a new password after their password has expired (i.e., require administrator reset)
     * 
     */
    @Export(name="hardExpiry", type=Boolean.class, parameters={})
    private Output<Boolean> hardExpiry;

    /**
     * @return Whether users are prevented from setting a new password after their password has expired (i.e., require administrator reset)
     * 
     */
    public Output<Boolean> hardExpiry() {
        return this.hardExpiry;
    }
    /**
     * The number of days that an user password is valid.
     * 
     */
    @Export(name="maxPasswordAge", type=Integer.class, parameters={})
    private Output<Integer> maxPasswordAge;

    /**
     * @return The number of days that an user password is valid.
     * 
     */
    public Output<Integer> maxPasswordAge() {
        return this.maxPasswordAge;
    }
    /**
     * Minimum length to require for user passwords.
     * 
     */
    @Export(name="minimumPasswordLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minimumPasswordLength;

    /**
     * @return Minimum length to require for user passwords.
     * 
     */
    public Output</* @Nullable */ Integer> minimumPasswordLength() {
        return this.minimumPasswordLength;
    }
    /**
     * The number of previous passwords that users are prevented from reusing.
     * 
     */
    @Export(name="passwordReusePrevention", type=Integer.class, parameters={})
    private Output<Integer> passwordReusePrevention;

    /**
     * @return The number of previous passwords that users are prevented from reusing.
     * 
     */
    public Output<Integer> passwordReusePrevention() {
        return this.passwordReusePrevention;
    }
    /**
     * Whether to require lowercase characters for user passwords.
     * 
     */
    @Export(name="requireLowercaseCharacters", type=Boolean.class, parameters={})
    private Output<Boolean> requireLowercaseCharacters;

    /**
     * @return Whether to require lowercase characters for user passwords.
     * 
     */
    public Output<Boolean> requireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }
    /**
     * Whether to require numbers for user passwords.
     * 
     */
    @Export(name="requireNumbers", type=Boolean.class, parameters={})
    private Output<Boolean> requireNumbers;

    /**
     * @return Whether to require numbers for user passwords.
     * 
     */
    public Output<Boolean> requireNumbers() {
        return this.requireNumbers;
    }
    /**
     * Whether to require symbols for user passwords.
     * 
     */
    @Export(name="requireSymbols", type=Boolean.class, parameters={})
    private Output<Boolean> requireSymbols;

    /**
     * @return Whether to require symbols for user passwords.
     * 
     */
    public Output<Boolean> requireSymbols() {
        return this.requireSymbols;
    }
    /**
     * Whether to require uppercase characters for user passwords.
     * 
     */
    @Export(name="requireUppercaseCharacters", type=Boolean.class, parameters={})
    private Output<Boolean> requireUppercaseCharacters;

    /**
     * @return Whether to require uppercase characters for user passwords.
     * 
     */
    public Output<Boolean> requireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountPasswordPolicy(String name) {
        this(name, AccountPasswordPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountPasswordPolicy(String name, @Nullable AccountPasswordPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountPasswordPolicy(String name, @Nullable AccountPasswordPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/accountPasswordPolicy:AccountPasswordPolicy", name, args == null ? AccountPasswordPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountPasswordPolicy(String name, Output<String> id, @Nullable AccountPasswordPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/accountPasswordPolicy:AccountPasswordPolicy", name, state, makeResourceOptions(options, id));
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
    public static AccountPasswordPolicy get(String name, Output<String> id, @Nullable AccountPasswordPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountPasswordPolicy(name, id, state, options);
    }
}
