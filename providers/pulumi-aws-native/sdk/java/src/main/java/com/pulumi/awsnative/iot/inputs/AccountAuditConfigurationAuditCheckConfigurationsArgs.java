// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.inputs.AccountAuditConfigurationAuditCheckConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies which audit checks are enabled and disabled for this account.
 * 
 */
public final class AccountAuditConfigurationAuditCheckConfigurationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountAuditConfigurationAuditCheckConfigurationsArgs Empty = new AccountAuditConfigurationAuditCheckConfigurationsArgs();

    @Import(name="authenticatedCognitoRoleOverlyPermissiveCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> authenticatedCognitoRoleOverlyPermissiveCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> authenticatedCognitoRoleOverlyPermissiveCheck() {
        return Optional.ofNullable(this.authenticatedCognitoRoleOverlyPermissiveCheck);
    }

    @Import(name="caCertificateExpiringCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateExpiringCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> caCertificateExpiringCheck() {
        return Optional.ofNullable(this.caCertificateExpiringCheck);
    }

    @Import(name="caCertificateKeyQualityCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateKeyQualityCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> caCertificateKeyQualityCheck() {
        return Optional.ofNullable(this.caCertificateKeyQualityCheck);
    }

    @Import(name="conflictingClientIdsCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> conflictingClientIdsCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> conflictingClientIdsCheck() {
        return Optional.ofNullable(this.conflictingClientIdsCheck);
    }

    @Import(name="deviceCertificateExpiringCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateExpiringCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> deviceCertificateExpiringCheck() {
        return Optional.ofNullable(this.deviceCertificateExpiringCheck);
    }

    @Import(name="deviceCertificateKeyQualityCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateKeyQualityCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> deviceCertificateKeyQualityCheck() {
        return Optional.ofNullable(this.deviceCertificateKeyQualityCheck);
    }

    @Import(name="deviceCertificateSharedCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateSharedCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> deviceCertificateSharedCheck() {
        return Optional.ofNullable(this.deviceCertificateSharedCheck);
    }

    @Import(name="iotPolicyOverlyPermissiveCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotPolicyOverlyPermissiveCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> iotPolicyOverlyPermissiveCheck() {
        return Optional.ofNullable(this.iotPolicyOverlyPermissiveCheck);
    }

    @Import(name="iotRoleAliasAllowsAccessToUnusedServicesCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasAllowsAccessToUnusedServicesCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> iotRoleAliasAllowsAccessToUnusedServicesCheck() {
        return Optional.ofNullable(this.iotRoleAliasAllowsAccessToUnusedServicesCheck);
    }

    @Import(name="iotRoleAliasOverlyPermissiveCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasOverlyPermissiveCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> iotRoleAliasOverlyPermissiveCheck() {
        return Optional.ofNullable(this.iotRoleAliasOverlyPermissiveCheck);
    }

    @Import(name="loggingDisabledCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> loggingDisabledCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> loggingDisabledCheck() {
        return Optional.ofNullable(this.loggingDisabledCheck);
    }

    @Import(name="revokedCaCertificateStillActiveCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedCaCertificateStillActiveCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> revokedCaCertificateStillActiveCheck() {
        return Optional.ofNullable(this.revokedCaCertificateStillActiveCheck);
    }

    @Import(name="revokedDeviceCertificateStillActiveCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedDeviceCertificateStillActiveCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> revokedDeviceCertificateStillActiveCheck() {
        return Optional.ofNullable(this.revokedDeviceCertificateStillActiveCheck);
    }

    @Import(name="unauthenticatedCognitoRoleOverlyPermissiveCheck")
    private @Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> unauthenticatedCognitoRoleOverlyPermissiveCheck;

    public Optional<Output<AccountAuditConfigurationAuditCheckConfigurationArgs>> unauthenticatedCognitoRoleOverlyPermissiveCheck() {
        return Optional.ofNullable(this.unauthenticatedCognitoRoleOverlyPermissiveCheck);
    }

    private AccountAuditConfigurationAuditCheckConfigurationsArgs() {}

    private AccountAuditConfigurationAuditCheckConfigurationsArgs(AccountAuditConfigurationAuditCheckConfigurationsArgs $) {
        this.authenticatedCognitoRoleOverlyPermissiveCheck = $.authenticatedCognitoRoleOverlyPermissiveCheck;
        this.caCertificateExpiringCheck = $.caCertificateExpiringCheck;
        this.caCertificateKeyQualityCheck = $.caCertificateKeyQualityCheck;
        this.conflictingClientIdsCheck = $.conflictingClientIdsCheck;
        this.deviceCertificateExpiringCheck = $.deviceCertificateExpiringCheck;
        this.deviceCertificateKeyQualityCheck = $.deviceCertificateKeyQualityCheck;
        this.deviceCertificateSharedCheck = $.deviceCertificateSharedCheck;
        this.iotPolicyOverlyPermissiveCheck = $.iotPolicyOverlyPermissiveCheck;
        this.iotRoleAliasAllowsAccessToUnusedServicesCheck = $.iotRoleAliasAllowsAccessToUnusedServicesCheck;
        this.iotRoleAliasOverlyPermissiveCheck = $.iotRoleAliasOverlyPermissiveCheck;
        this.loggingDisabledCheck = $.loggingDisabledCheck;
        this.revokedCaCertificateStillActiveCheck = $.revokedCaCertificateStillActiveCheck;
        this.revokedDeviceCertificateStillActiveCheck = $.revokedDeviceCertificateStillActiveCheck;
        this.unauthenticatedCognitoRoleOverlyPermissiveCheck = $.unauthenticatedCognitoRoleOverlyPermissiveCheck;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountAuditConfigurationAuditCheckConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountAuditConfigurationAuditCheckConfigurationsArgs $;

        public Builder() {
            $ = new AccountAuditConfigurationAuditCheckConfigurationsArgs();
        }

        public Builder(AccountAuditConfigurationAuditCheckConfigurationsArgs defaults) {
            $ = new AccountAuditConfigurationAuditCheckConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticatedCognitoRoleOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> authenticatedCognitoRoleOverlyPermissiveCheck) {
            $.authenticatedCognitoRoleOverlyPermissiveCheck = authenticatedCognitoRoleOverlyPermissiveCheck;
            return this;
        }

        public Builder authenticatedCognitoRoleOverlyPermissiveCheck(AccountAuditConfigurationAuditCheckConfigurationArgs authenticatedCognitoRoleOverlyPermissiveCheck) {
            return authenticatedCognitoRoleOverlyPermissiveCheck(Output.of(authenticatedCognitoRoleOverlyPermissiveCheck));
        }

        public Builder caCertificateExpiringCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateExpiringCheck) {
            $.caCertificateExpiringCheck = caCertificateExpiringCheck;
            return this;
        }

        public Builder caCertificateExpiringCheck(AccountAuditConfigurationAuditCheckConfigurationArgs caCertificateExpiringCheck) {
            return caCertificateExpiringCheck(Output.of(caCertificateExpiringCheck));
        }

        public Builder caCertificateKeyQualityCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> caCertificateKeyQualityCheck) {
            $.caCertificateKeyQualityCheck = caCertificateKeyQualityCheck;
            return this;
        }

        public Builder caCertificateKeyQualityCheck(AccountAuditConfigurationAuditCheckConfigurationArgs caCertificateKeyQualityCheck) {
            return caCertificateKeyQualityCheck(Output.of(caCertificateKeyQualityCheck));
        }

        public Builder conflictingClientIdsCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> conflictingClientIdsCheck) {
            $.conflictingClientIdsCheck = conflictingClientIdsCheck;
            return this;
        }

        public Builder conflictingClientIdsCheck(AccountAuditConfigurationAuditCheckConfigurationArgs conflictingClientIdsCheck) {
            return conflictingClientIdsCheck(Output.of(conflictingClientIdsCheck));
        }

        public Builder deviceCertificateExpiringCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateExpiringCheck) {
            $.deviceCertificateExpiringCheck = deviceCertificateExpiringCheck;
            return this;
        }

        public Builder deviceCertificateExpiringCheck(AccountAuditConfigurationAuditCheckConfigurationArgs deviceCertificateExpiringCheck) {
            return deviceCertificateExpiringCheck(Output.of(deviceCertificateExpiringCheck));
        }

        public Builder deviceCertificateKeyQualityCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateKeyQualityCheck) {
            $.deviceCertificateKeyQualityCheck = deviceCertificateKeyQualityCheck;
            return this;
        }

        public Builder deviceCertificateKeyQualityCheck(AccountAuditConfigurationAuditCheckConfigurationArgs deviceCertificateKeyQualityCheck) {
            return deviceCertificateKeyQualityCheck(Output.of(deviceCertificateKeyQualityCheck));
        }

        public Builder deviceCertificateSharedCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> deviceCertificateSharedCheck) {
            $.deviceCertificateSharedCheck = deviceCertificateSharedCheck;
            return this;
        }

        public Builder deviceCertificateSharedCheck(AccountAuditConfigurationAuditCheckConfigurationArgs deviceCertificateSharedCheck) {
            return deviceCertificateSharedCheck(Output.of(deviceCertificateSharedCheck));
        }

        public Builder iotPolicyOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotPolicyOverlyPermissiveCheck) {
            $.iotPolicyOverlyPermissiveCheck = iotPolicyOverlyPermissiveCheck;
            return this;
        }

        public Builder iotPolicyOverlyPermissiveCheck(AccountAuditConfigurationAuditCheckConfigurationArgs iotPolicyOverlyPermissiveCheck) {
            return iotPolicyOverlyPermissiveCheck(Output.of(iotPolicyOverlyPermissiveCheck));
        }

        public Builder iotRoleAliasAllowsAccessToUnusedServicesCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasAllowsAccessToUnusedServicesCheck) {
            $.iotRoleAliasAllowsAccessToUnusedServicesCheck = iotRoleAliasAllowsAccessToUnusedServicesCheck;
            return this;
        }

        public Builder iotRoleAliasAllowsAccessToUnusedServicesCheck(AccountAuditConfigurationAuditCheckConfigurationArgs iotRoleAliasAllowsAccessToUnusedServicesCheck) {
            return iotRoleAliasAllowsAccessToUnusedServicesCheck(Output.of(iotRoleAliasAllowsAccessToUnusedServicesCheck));
        }

        public Builder iotRoleAliasOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> iotRoleAliasOverlyPermissiveCheck) {
            $.iotRoleAliasOverlyPermissiveCheck = iotRoleAliasOverlyPermissiveCheck;
            return this;
        }

        public Builder iotRoleAliasOverlyPermissiveCheck(AccountAuditConfigurationAuditCheckConfigurationArgs iotRoleAliasOverlyPermissiveCheck) {
            return iotRoleAliasOverlyPermissiveCheck(Output.of(iotRoleAliasOverlyPermissiveCheck));
        }

        public Builder loggingDisabledCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> loggingDisabledCheck) {
            $.loggingDisabledCheck = loggingDisabledCheck;
            return this;
        }

        public Builder loggingDisabledCheck(AccountAuditConfigurationAuditCheckConfigurationArgs loggingDisabledCheck) {
            return loggingDisabledCheck(Output.of(loggingDisabledCheck));
        }

        public Builder revokedCaCertificateStillActiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedCaCertificateStillActiveCheck) {
            $.revokedCaCertificateStillActiveCheck = revokedCaCertificateStillActiveCheck;
            return this;
        }

        public Builder revokedCaCertificateStillActiveCheck(AccountAuditConfigurationAuditCheckConfigurationArgs revokedCaCertificateStillActiveCheck) {
            return revokedCaCertificateStillActiveCheck(Output.of(revokedCaCertificateStillActiveCheck));
        }

        public Builder revokedDeviceCertificateStillActiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> revokedDeviceCertificateStillActiveCheck) {
            $.revokedDeviceCertificateStillActiveCheck = revokedDeviceCertificateStillActiveCheck;
            return this;
        }

        public Builder revokedDeviceCertificateStillActiveCheck(AccountAuditConfigurationAuditCheckConfigurationArgs revokedDeviceCertificateStillActiveCheck) {
            return revokedDeviceCertificateStillActiveCheck(Output.of(revokedDeviceCertificateStillActiveCheck));
        }

        public Builder unauthenticatedCognitoRoleOverlyPermissiveCheck(@Nullable Output<AccountAuditConfigurationAuditCheckConfigurationArgs> unauthenticatedCognitoRoleOverlyPermissiveCheck) {
            $.unauthenticatedCognitoRoleOverlyPermissiveCheck = unauthenticatedCognitoRoleOverlyPermissiveCheck;
            return this;
        }

        public Builder unauthenticatedCognitoRoleOverlyPermissiveCheck(AccountAuditConfigurationAuditCheckConfigurationArgs unauthenticatedCognitoRoleOverlyPermissiveCheck) {
            return unauthenticatedCognitoRoleOverlyPermissiveCheck(Output.of(unauthenticatedCognitoRoleOverlyPermissiveCheck));
        }

        public AccountAuditConfigurationAuditCheckConfigurationsArgs build() {
            return $;
        }
    }

}
