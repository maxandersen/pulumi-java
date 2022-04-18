// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserProfileArgs Empty = new UserProfileArgs();

    /**
     * The ID of the associated Domain.
     * 
     */
    @Import(name="domainId", required=true)
      private final Output<String> domainId;

    public Output<String> domainId() {
        return this.domainId;
    }

    /**
     * A specifier for the type of value specified in `single_sign_on_user_value`. Currently, the only supported value is `UserName`. If the Domain's AuthMode is SSO, this field is required. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Import(name="singleSignOnUserIdentifier")
      private final @Nullable Output<String> singleSignOnUserIdentifier;

    public Output<String> singleSignOnUserIdentifier() {
        return this.singleSignOnUserIdentifier == null ? Codegen.empty() : this.singleSignOnUserIdentifier;
    }

    /**
     * The username of the associated AWS Single Sign-On User for this User Profile. If the Domain's AuthMode is SSO, this field is required, and must match a valid username of a user in your directory. If the Domain's AuthMode is not SSO, this field cannot be specified.
     * 
     */
    @Import(name="singleSignOnUserValue")
      private final @Nullable Output<String> singleSignOnUserValue;

    public Output<String> singleSignOnUserValue() {
        return this.singleSignOnUserValue == null ? Codegen.empty() : this.singleSignOnUserValue;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name for the User Profile.
     * 
     */
    @Import(name="userProfileName", required=true)
      private final Output<String> userProfileName;

    public Output<String> userProfileName() {
        return this.userProfileName;
    }

    /**
     * The user settings. See User Settings below.
     * 
     */
    @Import(name="userSettings")
      private final @Nullable Output<UserProfileUserSettingsArgs> userSettings;

    public Output<UserProfileUserSettingsArgs> userSettings() {
        return this.userSettings == null ? Codegen.empty() : this.userSettings;
    }

    public UserProfileArgs(
        Output<String> domainId,
        @Nullable Output<String> singleSignOnUserIdentifier,
        @Nullable Output<String> singleSignOnUserValue,
        @Nullable Output<Map<String,String>> tags,
        Output<String> userProfileName,
        @Nullable Output<UserProfileUserSettingsArgs> userSettings) {
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
        this.singleSignOnUserValue = singleSignOnUserValue;
        this.tags = tags;
        this.userProfileName = Objects.requireNonNull(userProfileName, "expected parameter 'userProfileName' to be non-null");
        this.userSettings = userSettings;
    }

    private UserProfileArgs() {
        this.domainId = Codegen.empty();
        this.singleSignOnUserIdentifier = Codegen.empty();
        this.singleSignOnUserValue = Codegen.empty();
        this.tags = Codegen.empty();
        this.userProfileName = Codegen.empty();
        this.userSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainId;
        private @Nullable Output<String> singleSignOnUserIdentifier;
        private @Nullable Output<String> singleSignOnUserValue;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> userProfileName;
        private @Nullable Output<UserProfileUserSettingsArgs> userSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainId = defaults.domainId;
    	      this.singleSignOnUserIdentifier = defaults.singleSignOnUserIdentifier;
    	      this.singleSignOnUserValue = defaults.singleSignOnUserValue;
    	      this.tags = defaults.tags;
    	      this.userProfileName = defaults.userProfileName;
    	      this.userSettings = defaults.userSettings;
        }

        public Builder domainId(Output<String> domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }
        public Builder domainId(String domainId) {
            this.domainId = Output.of(Objects.requireNonNull(domainId));
            return this;
        }
        public Builder singleSignOnUserIdentifier(@Nullable Output<String> singleSignOnUserIdentifier) {
            this.singleSignOnUserIdentifier = singleSignOnUserIdentifier;
            return this;
        }
        public Builder singleSignOnUserIdentifier(@Nullable String singleSignOnUserIdentifier) {
            this.singleSignOnUserIdentifier = Codegen.ofNullable(singleSignOnUserIdentifier);
            return this;
        }
        public Builder singleSignOnUserValue(@Nullable Output<String> singleSignOnUserValue) {
            this.singleSignOnUserValue = singleSignOnUserValue;
            return this;
        }
        public Builder singleSignOnUserValue(@Nullable String singleSignOnUserValue) {
            this.singleSignOnUserValue = Codegen.ofNullable(singleSignOnUserValue);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder userProfileName(Output<String> userProfileName) {
            this.userProfileName = Objects.requireNonNull(userProfileName);
            return this;
        }
        public Builder userProfileName(String userProfileName) {
            this.userProfileName = Output.of(Objects.requireNonNull(userProfileName));
            return this;
        }
        public Builder userSettings(@Nullable Output<UserProfileUserSettingsArgs> userSettings) {
            this.userSettings = userSettings;
            return this;
        }
        public Builder userSettings(@Nullable UserProfileUserSettingsArgs userSettings) {
            this.userSettings = Codegen.ofNullable(userSettings);
            return this;
        }        public UserProfileArgs build() {
            return new UserProfileArgs(domainId, singleSignOnUserIdentifier, singleSignOnUserValue, tags, userProfileName, userSettings);
        }
    }
}
