// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * When present, these are the credentials for the secure LDAP connection.
 * 
 */
public final class CacheUsernameDownloadSettingsCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheUsernameDownloadSettingsCredentialsArgs Empty = new CacheUsernameDownloadSettingsCredentialsArgs();

    /**
     * The Bind Distinguished Name identity to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    @Import(name="bindDn")
    private @Nullable Output<String> bindDn;

    /**
     * @return The Bind Distinguished Name identity to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    public Optional<Output<String>> bindDn() {
        return Optional.ofNullable(this.bindDn);
    }

    /**
     * The Bind password to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    @Import(name="bindPassword")
    private @Nullable Output<String> bindPassword;

    /**
     * @return The Bind password to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
     * 
     */
    public Optional<Output<String>> bindPassword() {
        return Optional.ofNullable(this.bindPassword);
    }

    private CacheUsernameDownloadSettingsCredentialsArgs() {}

    private CacheUsernameDownloadSettingsCredentialsArgs(CacheUsernameDownloadSettingsCredentialsArgs $) {
        this.bindDn = $.bindDn;
        this.bindPassword = $.bindPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheUsernameDownloadSettingsCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheUsernameDownloadSettingsCredentialsArgs $;

        public Builder() {
            $ = new CacheUsernameDownloadSettingsCredentialsArgs();
        }

        public Builder(CacheUsernameDownloadSettingsCredentialsArgs defaults) {
            $ = new CacheUsernameDownloadSettingsCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bindDn The Bind Distinguished Name identity to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
         * 
         * @return builder
         * 
         */
        public Builder bindDn(@Nullable Output<String> bindDn) {
            $.bindDn = bindDn;
            return this;
        }

        /**
         * @param bindDn The Bind Distinguished Name identity to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
         * 
         * @return builder
         * 
         */
        public Builder bindDn(String bindDn) {
            return bindDn(Output.of(bindDn));
        }

        /**
         * @param bindPassword The Bind password to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
         * 
         * @return builder
         * 
         */
        public Builder bindPassword(@Nullable Output<String> bindPassword) {
            $.bindPassword = bindPassword;
            return this;
        }

        /**
         * @param bindPassword The Bind password to be used in the secure LDAP connection. This value is stored encrypted and not returned on response.
         * 
         * @return builder
         * 
         */
        public Builder bindPassword(String bindPassword) {
            return bindPassword(Output.of(bindPassword));
        }

        public CacheUsernameDownloadSettingsCredentialsArgs build() {
            return $;
        }
    }

}
