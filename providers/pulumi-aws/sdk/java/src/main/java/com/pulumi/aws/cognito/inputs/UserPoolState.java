// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolLambdaConfigGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolSchemaGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationGetArgs;
import com.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolState extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolState Empty = new UserPoolState();

    /**
     * Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * 
     */
    @Import(name="accountRecoverySetting")
    private @Nullable Output<UserPoolAccountRecoverySettingGetArgs> accountRecoverySetting;

    public Optional<Output<UserPoolAccountRecoverySettingGetArgs>> accountRecoverySetting() {
        return Optional.ofNullable(this.accountRecoverySetting);
    }

    /**
     * Configuration block for creating a new user profile. Detailed below.
     * 
     */
    @Import(name="adminCreateUserConfig")
    private @Nullable Output<UserPoolAdminCreateUserConfigGetArgs> adminCreateUserConfig;

    public Optional<Output<UserPoolAdminCreateUserConfigGetArgs>> adminCreateUserConfig() {
        return Optional.ofNullable(this.adminCreateUserConfig);
    }

    /**
     * Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
     * 
     */
    @Import(name="aliasAttributes")
    private @Nullable Output<List<String>> aliasAttributes;

    public Optional<Output<List<String>>> aliasAttributes() {
        return Optional.ofNullable(this.aliasAttributes);
    }

    /**
     * ARN of the user pool.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Attributes to be auto-verified. Valid values: `email`, `phone_number`.
     * 
     */
    @Import(name="autoVerifiedAttributes")
    private @Nullable Output<List<String>> autoVerifiedAttributes;

    public Optional<Output<List<String>>> autoVerifiedAttributes() {
        return Optional.ofNullable(this.autoVerifiedAttributes);
    }

    /**
     * Date the user pool was created.
     * 
     */
    @Import(name="creationDate")
    private @Nullable Output<String> creationDate;

    public Optional<Output<String>> creationDate() {
        return Optional.ofNullable(this.creationDate);
    }

    /**
     * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: `auth.example.com`.
     * 
     */
    @Import(name="customDomain")
    private @Nullable Output<String> customDomain;

    public Optional<Output<String>> customDomain() {
        return Optional.ofNullable(this.customDomain);
    }

    /**
     * Configuration block for the user pool&#39;s device tracking. Detailed below.
     * 
     */
    @Import(name="deviceConfiguration")
    private @Nullable Output<UserPoolDeviceConfigurationGetArgs> deviceConfiguration;

    public Optional<Output<UserPoolDeviceConfigurationGetArgs>> deviceConfiguration() {
        return Optional.ofNullable(this.deviceConfiguration);
    }

    /**
     * Holds the domain prefix if the user pool has a domain associated with it.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Configuration block for configuring email. Detailed below.
     * 
     */
    @Import(name="emailConfiguration")
    private @Nullable Output<UserPoolEmailConfigurationGetArgs> emailConfiguration;

    public Optional<Output<UserPoolEmailConfigurationGetArgs>> emailConfiguration() {
        return Optional.ofNullable(this.emailConfiguration);
    }

    /**
     * String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
     * 
     */
    @Import(name="emailVerificationMessage")
    private @Nullable Output<String> emailVerificationMessage;

    public Optional<Output<String>> emailVerificationMessage() {
        return Optional.ofNullable(this.emailVerificationMessage);
    }

    /**
     * String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
     * 
     */
    @Import(name="emailVerificationSubject")
    private @Nullable Output<String> emailVerificationSubject;

    public Optional<Output<String>> emailVerificationSubject() {
        return Optional.ofNullable(this.emailVerificationSubject);
    }

    /**
     * Endpoint name of the user pool. Example format: `cognito-idp.REGION.amazonaws.com/xxxx_yyyyy`
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * A number estimating the size of the user pool.
     * 
     */
    @Import(name="estimatedNumberOfUsers")
    private @Nullable Output<Integer> estimatedNumberOfUsers;

    public Optional<Output<Integer>> estimatedNumberOfUsers() {
        return Optional.ofNullable(this.estimatedNumberOfUsers);
    }

    /**
     * Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * 
     */
    @Import(name="lambdaConfig")
    private @Nullable Output<UserPoolLambdaConfigGetArgs> lambdaConfig;

    public Optional<Output<UserPoolLambdaConfigGetArgs>> lambdaConfig() {
        return Optional.ofNullable(this.lambdaConfig);
    }

    /**
     * Date the user pool was last modified.
     * 
     */
    @Import(name="lastModifiedDate")
    private @Nullable Output<String> lastModifiedDate;

    public Optional<Output<String>> lastModifiedDate() {
        return Optional.ofNullable(this.lastModifiedDate);
    }

    /**
     * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
     * 
     */
    @Import(name="mfaConfiguration")
    private @Nullable Output<String> mfaConfiguration;

    public Optional<Output<String>> mfaConfiguration() {
        return Optional.ofNullable(this.mfaConfiguration);
    }

    /**
     * Name of the attribute.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration blocked for information about the user pool password policy. Detailed below.
     * 
     */
    @Import(name="passwordPolicy")
    private @Nullable Output<UserPoolPasswordPolicyGetArgs> passwordPolicy;

    public Optional<Output<UserPoolPasswordPolicyGetArgs>> passwordPolicy() {
        return Optional.ofNullable(this.passwordPolicy);
    }

    /**
     * Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * 
     */
    @Import(name="schemas")
    private @Nullable Output<List<UserPoolSchemaGetArgs>> schemas;

    public Optional<Output<List<UserPoolSchemaGetArgs>>> schemas() {
        return Optional.ofNullable(this.schemas);
    }

    /**
     * String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
     * 
     */
    @Import(name="smsAuthenticationMessage")
    private @Nullable Output<String> smsAuthenticationMessage;

    public Optional<Output<String>> smsAuthenticationMessage() {
        return Optional.ofNullable(this.smsAuthenticationMessage);
    }

    /**
     * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
     * 
     */
    @Import(name="smsConfiguration")
    private @Nullable Output<UserPoolSmsConfigurationGetArgs> smsConfiguration;

    public Optional<Output<UserPoolSmsConfigurationGetArgs>> smsConfiguration() {
        return Optional.ofNullable(this.smsConfiguration);
    }

    /**
     * String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
     * 
     */
    @Import(name="smsVerificationMessage")
    private @Nullable Output<String> smsVerificationMessage;

    public Optional<Output<String>> smsVerificationMessage() {
        return Optional.ofNullable(this.smsVerificationMessage);
    }

    /**
     * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
     * 
     */
    @Import(name="softwareTokenMfaConfiguration")
    private @Nullable Output<UserPoolSoftwareTokenMfaConfigurationGetArgs> softwareTokenMfaConfiguration;

    public Optional<Output<UserPoolSoftwareTokenMfaConfigurationGetArgs>> softwareTokenMfaConfiguration() {
        return Optional.ofNullable(this.softwareTokenMfaConfiguration);
    }

    /**
     * Map of tags to assign to the User Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * 
     */
    @Import(name="userPoolAddOns")
    private @Nullable Output<UserPoolUserPoolAddOnsGetArgs> userPoolAddOns;

    public Optional<Output<UserPoolUserPoolAddOnsGetArgs>> userPoolAddOns() {
        return Optional.ofNullable(this.userPoolAddOns);
    }

    /**
     * Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
     * 
     */
    @Import(name="usernameAttributes")
    private @Nullable Output<List<String>> usernameAttributes;

    public Optional<Output<List<String>>> usernameAttributes() {
        return Optional.ofNullable(this.usernameAttributes);
    }

    /**
     * Configuration block for username configuration. Detailed below.
     * 
     */
    @Import(name="usernameConfiguration")
    private @Nullable Output<UserPoolUsernameConfigurationGetArgs> usernameConfiguration;

    public Optional<Output<UserPoolUsernameConfigurationGetArgs>> usernameConfiguration() {
        return Optional.ofNullable(this.usernameConfiguration);
    }

    /**
     * Configuration block for verification message templates. Detailed below.
     * 
     */
    @Import(name="verificationMessageTemplate")
    private @Nullable Output<UserPoolVerificationMessageTemplateGetArgs> verificationMessageTemplate;

    public Optional<Output<UserPoolVerificationMessageTemplateGetArgs>> verificationMessageTemplate() {
        return Optional.ofNullable(this.verificationMessageTemplate);
    }

    private UserPoolState() {}

    private UserPoolState(UserPoolState $) {
        this.accountRecoverySetting = $.accountRecoverySetting;
        this.adminCreateUserConfig = $.adminCreateUserConfig;
        this.aliasAttributes = $.aliasAttributes;
        this.arn = $.arn;
        this.autoVerifiedAttributes = $.autoVerifiedAttributes;
        this.creationDate = $.creationDate;
        this.customDomain = $.customDomain;
        this.deviceConfiguration = $.deviceConfiguration;
        this.domain = $.domain;
        this.emailConfiguration = $.emailConfiguration;
        this.emailVerificationMessage = $.emailVerificationMessage;
        this.emailVerificationSubject = $.emailVerificationSubject;
        this.endpoint = $.endpoint;
        this.estimatedNumberOfUsers = $.estimatedNumberOfUsers;
        this.lambdaConfig = $.lambdaConfig;
        this.lastModifiedDate = $.lastModifiedDate;
        this.mfaConfiguration = $.mfaConfiguration;
        this.name = $.name;
        this.passwordPolicy = $.passwordPolicy;
        this.schemas = $.schemas;
        this.smsAuthenticationMessage = $.smsAuthenticationMessage;
        this.smsConfiguration = $.smsConfiguration;
        this.smsVerificationMessage = $.smsVerificationMessage;
        this.softwareTokenMfaConfiguration = $.softwareTokenMfaConfiguration;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.userPoolAddOns = $.userPoolAddOns;
        this.usernameAttributes = $.usernameAttributes;
        this.usernameConfiguration = $.usernameConfiguration;
        this.verificationMessageTemplate = $.verificationMessageTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolState $;

        public Builder() {
            $ = new UserPoolState();
        }

        public Builder(UserPoolState defaults) {
            $ = new UserPoolState(Objects.requireNonNull(defaults));
        }

        public Builder accountRecoverySetting(@Nullable Output<UserPoolAccountRecoverySettingGetArgs> accountRecoverySetting) {
            $.accountRecoverySetting = accountRecoverySetting;
            return this;
        }

        public Builder accountRecoverySetting(UserPoolAccountRecoverySettingGetArgs accountRecoverySetting) {
            return accountRecoverySetting(Output.of(accountRecoverySetting));
        }

        public Builder adminCreateUserConfig(@Nullable Output<UserPoolAdminCreateUserConfigGetArgs> adminCreateUserConfig) {
            $.adminCreateUserConfig = adminCreateUserConfig;
            return this;
        }

        public Builder adminCreateUserConfig(UserPoolAdminCreateUserConfigGetArgs adminCreateUserConfig) {
            return adminCreateUserConfig(Output.of(adminCreateUserConfig));
        }

        public Builder aliasAttributes(@Nullable Output<List<String>> aliasAttributes) {
            $.aliasAttributes = aliasAttributes;
            return this;
        }

        public Builder aliasAttributes(List<String> aliasAttributes) {
            return aliasAttributes(Output.of(aliasAttributes));
        }

        public Builder aliasAttributes(String... aliasAttributes) {
            return aliasAttributes(List.of(aliasAttributes));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder autoVerifiedAttributes(@Nullable Output<List<String>> autoVerifiedAttributes) {
            $.autoVerifiedAttributes = autoVerifiedAttributes;
            return this;
        }

        public Builder autoVerifiedAttributes(List<String> autoVerifiedAttributes) {
            return autoVerifiedAttributes(Output.of(autoVerifiedAttributes));
        }

        public Builder autoVerifiedAttributes(String... autoVerifiedAttributes) {
            return autoVerifiedAttributes(List.of(autoVerifiedAttributes));
        }

        public Builder creationDate(@Nullable Output<String> creationDate) {
            $.creationDate = creationDate;
            return this;
        }

        public Builder creationDate(String creationDate) {
            return creationDate(Output.of(creationDate));
        }

        public Builder customDomain(@Nullable Output<String> customDomain) {
            $.customDomain = customDomain;
            return this;
        }

        public Builder customDomain(String customDomain) {
            return customDomain(Output.of(customDomain));
        }

        public Builder deviceConfiguration(@Nullable Output<UserPoolDeviceConfigurationGetArgs> deviceConfiguration) {
            $.deviceConfiguration = deviceConfiguration;
            return this;
        }

        public Builder deviceConfiguration(UserPoolDeviceConfigurationGetArgs deviceConfiguration) {
            return deviceConfiguration(Output.of(deviceConfiguration));
        }

        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder emailConfiguration(@Nullable Output<UserPoolEmailConfigurationGetArgs> emailConfiguration) {
            $.emailConfiguration = emailConfiguration;
            return this;
        }

        public Builder emailConfiguration(UserPoolEmailConfigurationGetArgs emailConfiguration) {
            return emailConfiguration(Output.of(emailConfiguration));
        }

        public Builder emailVerificationMessage(@Nullable Output<String> emailVerificationMessage) {
            $.emailVerificationMessage = emailVerificationMessage;
            return this;
        }

        public Builder emailVerificationMessage(String emailVerificationMessage) {
            return emailVerificationMessage(Output.of(emailVerificationMessage));
        }

        public Builder emailVerificationSubject(@Nullable Output<String> emailVerificationSubject) {
            $.emailVerificationSubject = emailVerificationSubject;
            return this;
        }

        public Builder emailVerificationSubject(String emailVerificationSubject) {
            return emailVerificationSubject(Output.of(emailVerificationSubject));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder estimatedNumberOfUsers(@Nullable Output<Integer> estimatedNumberOfUsers) {
            $.estimatedNumberOfUsers = estimatedNumberOfUsers;
            return this;
        }

        public Builder estimatedNumberOfUsers(Integer estimatedNumberOfUsers) {
            return estimatedNumberOfUsers(Output.of(estimatedNumberOfUsers));
        }

        public Builder lambdaConfig(@Nullable Output<UserPoolLambdaConfigGetArgs> lambdaConfig) {
            $.lambdaConfig = lambdaConfig;
            return this;
        }

        public Builder lambdaConfig(UserPoolLambdaConfigGetArgs lambdaConfig) {
            return lambdaConfig(Output.of(lambdaConfig));
        }

        public Builder lastModifiedDate(@Nullable Output<String> lastModifiedDate) {
            $.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public Builder lastModifiedDate(String lastModifiedDate) {
            return lastModifiedDate(Output.of(lastModifiedDate));
        }

        public Builder mfaConfiguration(@Nullable Output<String> mfaConfiguration) {
            $.mfaConfiguration = mfaConfiguration;
            return this;
        }

        public Builder mfaConfiguration(String mfaConfiguration) {
            return mfaConfiguration(Output.of(mfaConfiguration));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder passwordPolicy(@Nullable Output<UserPoolPasswordPolicyGetArgs> passwordPolicy) {
            $.passwordPolicy = passwordPolicy;
            return this;
        }

        public Builder passwordPolicy(UserPoolPasswordPolicyGetArgs passwordPolicy) {
            return passwordPolicy(Output.of(passwordPolicy));
        }

        public Builder schemas(@Nullable Output<List<UserPoolSchemaGetArgs>> schemas) {
            $.schemas = schemas;
            return this;
        }

        public Builder schemas(List<UserPoolSchemaGetArgs> schemas) {
            return schemas(Output.of(schemas));
        }

        public Builder schemas(UserPoolSchemaGetArgs... schemas) {
            return schemas(List.of(schemas));
        }

        public Builder smsAuthenticationMessage(@Nullable Output<String> smsAuthenticationMessage) {
            $.smsAuthenticationMessage = smsAuthenticationMessage;
            return this;
        }

        public Builder smsAuthenticationMessage(String smsAuthenticationMessage) {
            return smsAuthenticationMessage(Output.of(smsAuthenticationMessage));
        }

        public Builder smsConfiguration(@Nullable Output<UserPoolSmsConfigurationGetArgs> smsConfiguration) {
            $.smsConfiguration = smsConfiguration;
            return this;
        }

        public Builder smsConfiguration(UserPoolSmsConfigurationGetArgs smsConfiguration) {
            return smsConfiguration(Output.of(smsConfiguration));
        }

        public Builder smsVerificationMessage(@Nullable Output<String> smsVerificationMessage) {
            $.smsVerificationMessage = smsVerificationMessage;
            return this;
        }

        public Builder smsVerificationMessage(String smsVerificationMessage) {
            return smsVerificationMessage(Output.of(smsVerificationMessage));
        }

        public Builder softwareTokenMfaConfiguration(@Nullable Output<UserPoolSoftwareTokenMfaConfigurationGetArgs> softwareTokenMfaConfiguration) {
            $.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
            return this;
        }

        public Builder softwareTokenMfaConfiguration(UserPoolSoftwareTokenMfaConfigurationGetArgs softwareTokenMfaConfiguration) {
            return softwareTokenMfaConfiguration(Output.of(softwareTokenMfaConfiguration));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder userPoolAddOns(@Nullable Output<UserPoolUserPoolAddOnsGetArgs> userPoolAddOns) {
            $.userPoolAddOns = userPoolAddOns;
            return this;
        }

        public Builder userPoolAddOns(UserPoolUserPoolAddOnsGetArgs userPoolAddOns) {
            return userPoolAddOns(Output.of(userPoolAddOns));
        }

        public Builder usernameAttributes(@Nullable Output<List<String>> usernameAttributes) {
            $.usernameAttributes = usernameAttributes;
            return this;
        }

        public Builder usernameAttributes(List<String> usernameAttributes) {
            return usernameAttributes(Output.of(usernameAttributes));
        }

        public Builder usernameAttributes(String... usernameAttributes) {
            return usernameAttributes(List.of(usernameAttributes));
        }

        public Builder usernameConfiguration(@Nullable Output<UserPoolUsernameConfigurationGetArgs> usernameConfiguration) {
            $.usernameConfiguration = usernameConfiguration;
            return this;
        }

        public Builder usernameConfiguration(UserPoolUsernameConfigurationGetArgs usernameConfiguration) {
            return usernameConfiguration(Output.of(usernameConfiguration));
        }

        public Builder verificationMessageTemplate(@Nullable Output<UserPoolVerificationMessageTemplateGetArgs> verificationMessageTemplate) {
            $.verificationMessageTemplate = verificationMessageTemplate;
            return this;
        }

        public Builder verificationMessageTemplate(UserPoolVerificationMessageTemplateGetArgs verificationMessageTemplate) {
            return verificationMessageTemplate(Output.of(verificationMessageTemplate));
        }

        public UserPoolState build() {
            return $;
        }
    }

}
