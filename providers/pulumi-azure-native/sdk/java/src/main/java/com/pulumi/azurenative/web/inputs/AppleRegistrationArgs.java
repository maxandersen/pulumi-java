// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the registration for the Apple provider
 * 
 */
public final class AppleRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppleRegistrationArgs Empty = new AppleRegistrationArgs();

    /**
     * The Client ID of the app used for login.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The app setting name that contains the client secret.
     * 
     */
    @Import(name="clientSecretSettingName")
    private @Nullable Output<String> clientSecretSettingName;

    public Optional<Output<String>> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }

    private AppleRegistrationArgs() {}

    private AppleRegistrationArgs(AppleRegistrationArgs $) {
        this.clientId = $.clientId;
        this.clientSecretSettingName = $.clientSecretSettingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppleRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppleRegistrationArgs $;

        public Builder() {
            $ = new AppleRegistrationArgs();
        }

        public Builder(AppleRegistrationArgs defaults) {
            $ = new AppleRegistrationArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecretSettingName(@Nullable Output<String> clientSecretSettingName) {
            $.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        public Builder clientSecretSettingName(String clientSecretSettingName) {
            return clientSecretSettingName(Output.of(clientSecretSettingName));
        }

        public AppleRegistrationArgs build() {
            return $;
        }
    }

}
